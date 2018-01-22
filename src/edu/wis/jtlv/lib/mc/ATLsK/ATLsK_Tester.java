package edu.wis.jtlv.lib.mc.ATLsK;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.core.smv.eval.*;
import edu.wis.jtlv.env.spec.*;
import edu.wis.jtlv.old_lib.mc.ModelCheckException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDException;
import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.ModuleBDDField;
import edu.wis.jtlv.env.module.ModuleException;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import net.sf.javabdd.BDDVarSet;

class ATLsK_Tester_Variables {
    ModuleBDDField var;     // the output variable
    ModuleBDDField lbound;  // the lower bound of the interval
    ModuleBDDField width;   // the width of the interval

    public ATLsK_Tester_Variables(ModuleBDDField var, ModuleBDDField lbound, ModuleBDDField width) {
        this.var = var;
        this.lbound = lbound;
        this.width = width;
    }
}

/**
 * <p>
 * Construct a tester for a given pure RTLTL specification.
 * </p>
 *
 * @author Xiangyu Luo
 */
public class ATLsK_Tester {
    private static int tester_id = 0;
    private static int field_id = 0;

    boolean ExistentialConstruction;
    private Spec origSpec;
    private SMVModule tester;
    private HashMap<SpecExp, ATLsK_Tester_Variables> spec2field = new HashMap<SpecExp, ATLsK_Tester_Variables>();

    public HashSet<ModuleBDDField> AuxVars;
    public BDDVarSet shownVars;

    /**
     * <p>
     * Constructor for the tester.
     * </p>
     *
     * @param spec
     *            The ATL*K specification to construct tester for.
     * @param isWeak
     *            Whether to add initial or not.
     * @throws ModelCheckAlgException
     */
    public ATLsK_Tester(boolean ExistentialConstruction, Spec spec, boolean isWeak)
            throws ModelCheckAlgException, SMVParseException, ModelCheckException, SpecException {

/*
        if(parentOperator==null)
            ExistentialConstruction=false;
        else if(parentOperator==Operator.AA
                || parentOperator==Operator.CANNOT_AVOID
                || parentOperator==Operator.KNOW
                || parentOperator==Operator.SKNOW)
            ExistentialConstruction=false;
        else ExistentialConstruction=true;
*/
        this.ExistentialConstruction = ExistentialConstruction;
        AuxVars = new HashSet<ModuleBDDField>();

        this.origSpec = spec;
        if ((origSpec == null) || (!origSpec.isATLsKSpec()))
            throw new ModelCheckAlgException("Cannot construct a tester for specification: " + origSpec);

        this.tester = new SMVModule("Tester_" + (++tester_id));
        createAuxVariable(origSpec);
        constructModule(origSpec, isWeak);
    }

    /**
     * <p>
     * Getter for the tester which where constructed from this specification.
     * </p>
     *
     * @return The tester which where constructed from this specification.
     */
    public SMVModule getTester() { return this.tester; }

    /**
     * <p>
     * Returns a BDD variable representing the given specification in this
     * tester.
     * </p>
     *
     * @param spec
     *            The specification.
     * @return A BDD variable representing the given specification in this
     *         tester.
     *
     * @throws ModelCheckAlgException
     *             When failed to find the cooresponding BDD variable.
     */
    public BDD getSpec2BDD(Spec spec) throws ModelCheckAlgException, SMVParseException, ModelCheckException, SpecException {
        if (spec instanceof SpecBDD)
            return ((SpecBDD) spec).getVal();
        // else it is SpecExp (cannot be a SpecCTLRange)
        SpecExp se = (SpecExp) spec;
        Spec[] child = se.getChildren();
        Operator op = se.getOperator();

        BDD x=null, l=null, w=null;

        // spec is a state formula rooted by path quantifiers EE, AA, CAN_ENFORCE, CANNOT_AVOID and epistemic modalities
        if(op == Operator.EE) satEE(spec);
        if(op == Operator.AA) satAA(spec);

        if (op == Operator.NOT)
            return getSpec2BDD(child[0]).not();
        if (op == Operator.AND)
            return getSpec2BDD(child[0]).and(getSpec2BDD(child[1]));
        if (op == Operator.OR)
            return getSpec2BDD(child[0]).or(getSpec2BDD(child[1]));
        if (op == Operator.XOR)
            return getSpec2BDD(child[0]).xor(getSpec2BDD(child[1]));
        if (op == Operator.XNOR)
            return getSpec2BDD(child[0]).xor(getSpec2BDD(child[1])).not();
        if (op == Operator.IFF)
            return getSpec2BDD(child[0]).biimp(getSpec2BDD(child[1]));
        if (op == Operator.IMPLIES)
            return getSpec2BDD(child[0]).imp(getSpec2BDD(child[1]));
        if (op.isLTLOp() || op.isRTLTLOp()) {
            ATLsK_Tester_Variables vars = spec2field.get(spec);
            x = vars.var.getDomain().ithVar(1);
            if(op==Operator.B_UNTIL || op==Operator.B_RELEASES) {
                SpecRange range=(SpecRange)child[1];
                int a=range.getFrom(), b=range.getTo();
                // 0<=a<=b and !(a=0 and b=0)
                if((a==b) || (a==0 && b>0)) {
                    BDD l_Eq_b = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, vars.lbound),
                                                new ValueConsStrStmt(tester, new String[]{""+b}))).eval_stmt().toBDD();//l=b
                    return x.and(l_Eq_b); // x & (l=b)
                }else{ // 0<a<b
                    BDD l_Eq_a = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, vars.lbound),
                            new ValueConsStrStmt(tester, new String[]{""+a}))).eval_stmt().toBDD();//l=a
                    BDD w_Eq_b_minus_a = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, vars.width),
                            new ValueConsStrStmt(tester, new String[]{""+(b-a)}))).eval_stmt().toBDD();//w=b-a
                    return x.and(l_Eq_a).and(w_Eq_b_minus_a); // x & (l=a) & (w=b-a)
                }
            }else {
                return x;
            }
        }
        // something is wrong
        throw new ModelCheckAlgException("Failed to find corresponding bdd to specification: " + spec.toString());
    }

    // spec = EE f
    BDD satEE(Spec spec) throws SMVParseException, ModelCheckAlgException, ModelCheckException, SpecException {
        SpecExp se = (SpecExp) spec;
        Spec[] child = se.getChildren();
        Operator op = se.getOperator();
        if(op!=Operator.EE) return null;

        ATLsK_Tester subTester = new ATLsK_Tester(true, child[0], true); // child[0] is already NNF
//        subTester.shownVars = ATLsK_ModelCheckAlg.getRelevantVars(ATLsK_ModelCheckAlg.getDesign(), child[0]);
        tester = subTester.getTester();
        BDD subTester_initials = subTester.getSpec2BDD(child[0]);


 /*       if(AuxVars!=null && satBDD!=null) {
            return satBDD.exist(getModuleBDDField_BDDVarSet(subTester.AuxVars));
        }else
            return satBDD;
 */
        return null;
    }

    // spec = AA f
    BDD satAA(Spec spec) throws SMVParseException, ModelCheckAlgException, ModelCheckException, SpecException {
        SpecExp se = (SpecExp) spec;
        Spec[] child = se.getChildren();
        Operator op = se.getOperator();
        if(op!=Operator.AA) return null;

        Spec neg_f_nnf = ATLsK_ModelCheckAlg.NNF(new SpecExp(Operator.NOT, child[0]));

        ATLsK_Tester subTester = new ATLsK_Tester(true, neg_f_nnf, true);
        BDD satBDD = subTester.getSpec2BDD(neg_f_nnf);

        if(AuxVars!=null && satBDD!=null) {
            return satBDD.exist(getModuleBDDField_BDDVarSet(subTester.AuxVars)).not();
        }else
            return satBDD.not();
    }

    // return the set of BDD variables for the set of ModuleBDDFields
    private BDDVarSet getModuleBDDField_BDDVarSet(HashSet<ModuleBDDField> set) {
        BDDVarSet vs = Env.getEmptySet() ;
        for (ModuleBDDField var : set) {
            vs = vs.id().union(var.support());
        }
        return vs;
    }

    private void createAuxVariable(Spec s) throws ModelCheckAlgException {
        if (!(s instanceof SpecExp))
            return;
        // else
        SpecExp se = (SpecExp) s;
        Operator op = se.getOperator();
        Spec []child = se.getChildren();
        if (op.isLTLOp() || op.isRTLTLOp()) {
            try {
                ModuleBDDField ovar=null, lbound=null, width=null;
                String testerName = se.getOperator().toString() + "_" + (++field_id);
                //String name = "TSR_VAR[" + (++field_id) + "]";
                ovar = tester.addVar(testerName+".VAR"); // boolean variable
                if(op==Operator.B_UNTIL || op==Operator.B_RELEASES) {
                    SpecRange range=(SpecRange)child[1];
                    int a=range.getFrom(), b=range.getTo();
                    // 0<=a<=b and !(a=0 and b=0)
                    if((a==b) || (a==0 && b>0)) {
                        lbound = tester.addVar(testerName+".LBOUND", 0, b);
                        width = null;
                    }else{ // 0<a<b
                        lbound = tester.addVar(testerName+".LBOUND", 0, a);
                        width = tester.addVar(testerName+".WIDTH", 0, b-a);
                    }
                }
                spec2field.put(se, new ATLsK_Tester_Variables(ovar, lbound, width));
                if(ovar!=null) AuxVars.add(ovar);
                if(lbound!=null) AuxVars.add(lbound);
                if(width!=null) AuxVars.add(width);
            } catch (ModuleException e) {
                throw new ModelCheckAlgException("Failed naming the extra auxiliary fields");
            }
        }

        Spec[] children = se.getChildren();
        for (int i = 0; i < children.length; i++) {
            createAuxVariable(children[i]);
        }
    }

    private void constructModule(Spec root, boolean isWeak)
            throws ModelCheckAlgException, SMVParseException, ModelCheckException, SpecException {
        BDD p_c1, p_c2, xp;
        BDD x, l, w;

        Set<SpecExp> specifications = spec2field.keySet();
        for (SpecExp spec : specifications) {
            try {
                Operator op = spec.getOperator();
                Spec[] child = spec.getChildren();
                x = getSpec2BDD(spec);
                int noo = op.numOfOperands();

                SpecRange range = null;
                BDD c1=null, c2=null;
                if(op.isEpistemicOp()
                        || op.isCTLsPathOp()
                        || op.isATLsPathOp()) {
                    //ATLsK_Tester subTester =
                    continue;
                }else if(op == Operator.B_UNTIL || op == Operator.B_RELEASES) {
                    range = (SpecRange) child[1];
                    c1 = getSpec2BDD(child[0]);
                    c2 = getSpec2BDD(child[2]);
                }else {
                    c1 = (noo > 0) ? getSpec2BDD(child[0]) : null;
                    c2 = (noo > 1) ? getSpec2BDD(child[1]) : null;
                }

                switch (op) {
                    case NEXT:
                        p_c1 = Env.prime(c1);
                        tester.conjunctTrans(x.biimp(p_c1));
                        break;
                    case FINALLY:
                        xp = Env.prime(x);
                        tester.conjunctTrans(x.biimp(c1.or(xp)));
                        tester.addJustice(c1.or(x.not()));
                        break;
                    case GLOBALLY:
                        xp = Env.prime(x);
                        tester.conjunctTrans(x.biimp(c1.and(xp)));
                        tester.addJustice(c1.not().or(x));
                        break;
                    case UNTIL:
                        xp = Env.prime(x);
                        tester.conjunctTrans(x.biimp(c2.or(c1.and(xp))));
                        tester.addJustice(x.imp(c2));
                        break;
                    case RELEASES:
                        xp = Env.prime(x);
                        tester.conjunctTrans(x.biimp(c2.and(c1.or(xp))));
                        break;
                    case B_UNTIL:
                        int a=range.getFrom(), b=range.getTo();


/*

                        SMVModule main = (SMVModule) Env.getModule("main");
                        ModuleBDDField x = main.addVar("x["+ fieldId + "]");
                        ModuleBDDField l = main.addVar("l["+ fieldId + "]", 0, range.getFrom());

                        //-- positive tester for f U [a,a+width] g where a>0 and width>0
                        if (range.getFrom()>0&&width>0)
                        {       ModuleBDDField w = main.addVar("w["+ fieldId + "]", 0, width);
                            try {
                                BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
                                BDD wGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, w),
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w>0
                                BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
                                        new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
                                BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)),//next(l)=l-1
                                        new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
                                BDD NwEw = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)), //next(w)=w)
                                        new ValueConsStrStmt(tester, new String[]{w+""}))).eval_stmt().toBDD();
                                BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//l=0
                                BDD N1E0= new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=0)
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();
                                BDD NwEwM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)),//next(w)=w-1
                                        new OpMinus(new ValueDomStmt(tester, w), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
                                BDD wE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, w),
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w=0
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).and(wGT0).imp(c2.and(NxE1).and(NlElM1).and(NwEw)));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).and(wGT0).imp(c3.or(c2.and(NxE1).and(N1E0).and(NwEwM1))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).and(wE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(x.biimp(x.getDomain().ithVar(1)));
                            // System.out.println("Uaw-"+" op-"+op+" c1-"+c1+" c2-"+c2+" c3-"+c3);
                        }

                        //-- positive tester for f U [a,a] g where a>0
                        if (range.getTo()==range.getFrom()){
                            try {
                                BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
                                BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
                                        new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
                                BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)),//next(l)=l-1
                                        new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
                                BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//l=0
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).imp(c2.and(NxE1).and(NlElM1)));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(x.biimp(x.getDomain().ithVar(1)));
                        }

                        //-- positive tester for f U [0,a] g where a>0
                        if (range.getFrom()==0 &&range.getTo()>0)
                        {
                            try {
                                BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
                                BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
                                        new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
                                BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)),//next(l)=l-1
                                        new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
                                BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
                                        new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//l=0
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).imp(c3.or(c2.and(NxE1).and(NlElM1))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(x.biimp(x.getDomain().ithVar(1)));
                        }*/
                        break;
                    case B_RELEASES:
                        //TODO
                        break;
                    default:
                        break;
                }
            } catch (ModuleException e) {
                throw new ModelCheckAlgException("Failed to construct BDD assertion for specification: " + spec.toString());
            } catch (BDDException e) {
                throw new ModelCheckAlgException("Failed to prime BDD assertion for specification: " + spec.toString());
            }
        }
        if (!isWeak) {
            try {
                tester.addInitial(getSpec2BDD(root).not());
            } catch (ModuleException e) {
                throw new ModelCheckAlgException(
                        "Failed to add roots BDD assertion.");
            }
        }
    }
}
