package edu.wis.jtlv.lib.mc.RTLTLK;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.core.smv.eval.*;
import edu.wis.jtlv.env.core.smv.schema.SMVAgentInfo;
import edu.wis.jtlv.env.module.Module;
import edu.wis.jtlv.env.module.ModuleBDDField;
import edu.wis.jtlv.env.module.ModuleException;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.*;
import edu.wis.jtlv.lib.mc.LTL.LTLTester;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDException;
import net.sf.javabdd.BDDVarSet;

import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

public class RTLTLKTester  {
    private static int tester_id = 0;
    private static int field_id = 0;

    private  Module design;
    private Spec root;
    private SMVModule tester;
    private HashMap<SpecExp, ModuleBDDField> spec2field = new HashMap<SpecExp, ModuleBDDField>();
    /**
     * <p>
     * Constructor for the tester.
     * </p>
     *
     * @param root_spec The specification to construct tester for.
     * @param isWeak    Whether to add initial or not.
     * @throws ModelCheckAlgException
     */
//    public RTLTLKTester(Spec root_spec, boolean isWeak) throws ModelCheckAlgException {
//        super(root_spec, isWeak);
//    }

    public RTLTLKTester(Module design,Spec root_spec, boolean isWeak)
            throws ModelCheckAlgException {
        //super(root_spec, isWeak);
        this.design=design;
        this.root = root_spec;
        if ((root == null) || (!root.isRealTimeLTLKSpec()))
            throw new ModelCheckAlgException("Cannot construct a tester for"
                    + "specification: " + root);
        this.tester = new SMVModule("RTLTLKTester_" + (++tester_id));
        createAuxVariable(root);
        constructModule(root, isWeak);
    }
    // agentName KNOW p
    // forall(system_global_variables - agentName's visible_variables).((global_reachable_states & fair_states) -> p)
    public BDD know(String agentName, BDD p) throws ModelCheckAlgException {
        if (agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");
        int idx_dot = agentName.indexOf('.');
        if (idx_dot == -1)
            agentName = "main." + agentName;
        else if (!agentName.substring(0, idx_dot).equals("main"))
            throw new ModelCheckAlgException("The agent's name " + agentName + " is illegal.");

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if (agentInfo == null)
            throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // V - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        BDD feas = design.feasible();
        BDD res = feas.imp(p).forAll(allInvisVars);

        return res;
    }
    // s |= agentName NKNOW p : agentName consider that it is possible that p holds on s
    // forall(system_global_variables - agentName's visible_variables).((global_reachable_states & fair_states) -> p)
    public BDD nknow(String agentName, BDD p) throws ModelCheckAlgException {
        if (agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");

        int idx_dot = agentName.indexOf('.');
        if (idx_dot == -1)
            agentName = "main." + agentName;
        else if (!agentName.substring(0, idx_dot).equals("main"))
            throw new ModelCheckAlgException("The agent's name " + agentName + " is illegal.");

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if (agentInfo == null)
            throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // V - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);
        BDD feas = design.feasible();
        BDD res = feas.and(p).exist(allInvisVars);

        return res;
    }

    /**
     * <p>
     * Getter for the tester which where constructed from this specification.
     * </p>
     *
     * @return The tester which where constructed from this specification.
     */
    public SMVModule getTester() {
        return this.tester;
    }

    /**
     * <p>
     * Returns a BDD variable representing the given specification in this
     * tester.
     * </p>
     *
     * @param root The specification.
     * @return A BDD variable representing the given specification in this
     * tester.
     * @throws ModelCheckAlgException When failed to find the cooresponding BDD variable.
     */
    public BDD getSpec2BDD(Spec root) throws ModelCheckAlgException {
        //System.out.println("root---"+root);
        if (root instanceof SpecBDD)
            return ((SpecBDD) root).getVal();
        // else it is SpecExp (cannot be a SpecCTLRange)
        SpecExp se = (SpecExp) root;
        Spec[] child = se.getChildren();
        Operator op = se.getOperator();
        //System.out.println("op-"+op+" 0-"+child[0]+" 1-"+child[1]);

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
        if (op == Operator.KNOW) {
            //System.out.println("Know-----------");
            SpecAgentIdentifier agentId= (SpecAgentIdentifier)child[0];
            String agentName = agentId.toString();
            BDD left=getSpec2BDD(child[1]);
            return know(agentName, left);
        }
        if (op == Operator.NKNOW) {
            //System.out.println("NKnow-----------");
            SpecAgentIdentifier agentId= (SpecAgentIdentifier)child[0];
            String agentName = agentId.toString();
            BDD left=getSpec2BDD(child[1]);
            return nknow(agentName, left);
        }
        if (op.isRealTimeLTLOp()||op.isLTLOp()) {
            ModuleBDDField f = spec2field.get(root);
            if ((f != null) && (f.getDomain().size().intValue() == 2))
                return f.getDomain().ithVar(1);
        }
        // something is wrong
        throw new ModelCheckAlgException("Failed to find corresponding bdd"
                + " to specification: " + root.toString());
    }

    public void createAuxVariable(Spec s) throws ModelCheckAlgException {
        if (!(s instanceof SpecExp))
            return;
        // else
        SpecExp se = (SpecExp) s;
        if (se.getOperator().isLTLOp()||se.getOperator().isRealTimeLTLOp()||se.getOperator().isEpistemicOp()) {
            try {
                // String name = se.getOperator().toString() + "_"
                // + (++field_id);
                String name = "AUX[" + (++field_id) + "]";
                ModuleBDDField f = tester.addVar(name);
                spec2field.put(se, f);
            } catch (ModuleException e) {
                throw new ModelCheckAlgException("Failed naming the extra "
                        + "auxiliary fields");
            }
        }

        Spec[] children = se.getChildren();
        for (int i = 0; i < children.length; i++) {
            createAuxVariable(children[i]);
        }
    }

    private void constructModule(Spec root, boolean isWeak)
            throws ModelCheckAlgException {
        BDD p_c1, p_c2, p_aux;
        Set<SpecExp> specifications = spec2field.keySet();

        //to solve case:LTLSpec x;(x means some logic without ltl　operator)
        if (specifications.size() == 0 && root instanceof SpecExp) {
            String name = "AUX[" + (++field_id) + "]";
            ModuleBDDField f = null;
            try {
                f = tester.addVar(name);
            } catch (ModuleException e) {
                e.printStackTrace();
            }
            tester.conjunctTrans(getSpec2BDD(root).biimp(f.getDomain().ithVar(1)));
        }

        for (SpecExp spec : specifications) {
            try {
                Operator op = spec.getOperator();
                Spec[] child = spec.getChildren();
                BDD aux = getSpec2BDD(spec);
                int noo = op.numOfOperands();
                //System.out.println(" op-"+op+" 0-"+child[0]+" 1-"+child[1]);//+" 2-"+child[2]);
                SpecRange range = null;
                BDD c1 = null;
                if (child[0] instanceof SpecRange)
                    range = (SpecRange) child[0];
                else if (!(child[0] instanceof SpecAgentIdentifier))
                    c1 = (noo > 0) ? getSpec2BDD(child[0]) : null;

                   BDD c2 = (noo > 1) ? getSpec2BDD(child[1]) : null;
                   BDD c3 = (noo > 2) ? getSpec2BDD(child[2]) : null;
                    //System.out.println("c1-"+c1+" c2-"+c2+" c3-"+c3);

                switch (op) {
                    case NEXT:
                        p_c1 = Env.prime(c1);
                        tester.conjunctTrans(aux.biimp(p_c1)); // aux <-> c1'
                        break;
                    case FINALLY:
                        p_aux = Env.prime(aux);
                        tester.conjunctTrans(aux.biimp(c1.or(p_aux))); // aux <-> (c1 \/ aux')
                        tester.addJustice(c1.or(aux.not()));  // aux -> c1
                        break;
                    case GLOBALLY:
                        p_aux = Env.prime(aux);
                        tester.conjunctTrans(aux.biimp(c1.and(p_aux))); // aux <-> (c1 /\ aux')
                        tester.addJustice(c1.not().or(aux)); // c1 -> aux
                        break;
                    case PREV:
                        p_aux = Env.prime(aux);
                        tester.addInitial(aux.not());
                        tester.conjunctTrans(p_aux.biimp(c1));
                        break;
                    // no BEFORE
                    case ONCE:
                        p_c1 = Env.prime(c1);
                        p_aux = Env.prime(aux);
                        tester.addInitial(aux.biimp(c1));
                        tester.conjunctTrans(p_aux.biimp(aux.or(p_c1)));
                        break;
                    case HISTORICALLY:
                        p_c1 = Env.prime(c1);
                        p_aux = Env.prime(aux);
                        tester.addInitial(aux.biimp(c1));
                        tester.conjunctTrans(p_aux.biimp(aux.and(p_c1)));
                        break;
                    case UNTIL:
                        p_aux = Env.prime(aux);
                        tester.conjunctTrans(aux.biimp(c2.or(c1.and(p_aux)))); // aux <-> (c2 \/ (c1 /\ aux'))
                        tester.addJustice(aux.not()); // !aux
                        break;
//                    case UNTIL: {//new algorithm
//                        int fieldId=(++field_id);
//                        SMVModule main = (SMVModule) Env.getModule("main");
//                        ModuleBDDField x = main.addVar("x[" + fieldId + "]");
//                        tester.conjunctTrans(x.getDomain().ithVar(1).biimp(c2.or(c1.and(Env.prime(x.getDomain().ithVar(1))))));
//                        tester.addJustice(x.getDomain().ithVar(1).imp(c2));
//                        tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
//                        break;
//                    }
//                    case RELEASES:
//                        p_aux = Env.prime(aux);
//                        tester.conjunctTrans(aux.biimp(c2.or(c1.and(p_aux))));
//                        tester.addJustice(c1.not().and(c2.not()).or(aux));
//                        break;
                    case RELEASES: {//new algorithm
                        int fieldId=(++field_id);
                        SMVModule main = (SMVModule) Env.getModule("main");
                        ModuleBDDField x = main.addVar("x[" + fieldId + "]");
                        tester.conjunctTrans(x.getDomain().ithVar(1).biimp(c2.and(c1.or(Env.prime(x.getDomain().ithVar(1))))));
                        tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
                        break;
                    }
                    case SINCE:
                        p_c1 = Env.prime(c1);
                        p_c2 = Env.prime(c2);
                        p_aux = Env.prime(aux);
                        tester.addInitial(aux.biimp(c2));
                        tester.conjunctTrans(p_aux.biimp(p_c2.or(p_c1.and(aux))));
                        break;
                    case TRIGGERED:
                        p_c1 = Env.prime(c1);
                        p_c2 = Env.prime(c2);
                        p_aux = Env.prime(aux);
                        tester.addInitial(aux.biimp(c1.or(c2)));
                        tester.conjunctTrans(p_aux.biimp(p_c2.or(p_c1.and(aux))));
                        break;
                    // NOT_PREV_NOT,
                    case B_FINALLY: {
                        tester.conjunctTrans(aux.biimp(c2));//translation algorithm
                        break;
                    }
                    case B_GLOBALLY:
                        tester.conjunctTrans(aux.biimp(c2));//translation algorithm
                        break;
                    //Uppdate on : 2017/12/13
                    case B_UNTIL:{
                        int width = range.getTo() - range.getFrom(),fieldId=(++field_id);
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
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
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
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
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
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
                        }
                        break;
                    }
                    //Uppdate by LS on : 2017/12/16
                    case B_RELEASE:{
                        int width = range.getTo() - range.getFrom(),fieldId=(++field_id);
                        SMVModule main = (SMVModule) Env.getModule("main");
                        ModuleBDDField x = main.addVar("x["+ fieldId + "]");
                        ModuleBDDField l = main.addVar("l["+ fieldId + "]", 0, range.getFrom());
                        //-- positive tester for f R [a,a+width] g where a>0 and width>0
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
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).and(wGT0).imp(c2.or(NxE1.and(NlElM1).and(NwEw))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).and(wGT0).imp(c3.and(c2.or(NxE1.and(N1E0).and(NwEwM1)))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).and(wE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
                            // System.out.println("Raw-"+" op-"+op+" c1-"+c1+" c2-"+c2+" c3-"+c3);
                        }
                        //-- positive tester for f R [a,a] g where a>0
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
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).imp(c2.or(NxE1.and(NlElM1))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
                        }

                        //-- positive tester for f R [0,a] g where a>0
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
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lGT0).imp(c3.and(c2.or(NxE1.and(NlElM1)))));
                                main.conjunctTrans(x.getDomain().ithVar(1).and(lE0).imp(c3));
                            } catch (SMVParseException e) {
                                e.printStackTrace();
                            }
                            tester.conjunctTrans(aux.biimp(x.getDomain().ithVar(1)));
                        }
                        break;
                    }
                    case KNOW:{
                        //System.out.println("KNOW------------------");
                        String name = "AUX[" + (++field_id) + "]";
                        ModuleBDDField f = null;
                        try {
                            f = tester.addVar(name);
                        } catch (ModuleException e) {
                            e.printStackTrace();
                        }
                        tester.conjunctTrans(aux.biimp(f.getDomain().ithVar(1)));
                        break;}
                    case NKNOW:
                        //System.out.println("NKNOW------------------");
                        String name = "AUX[" + (++field_id) + "]";
                        ModuleBDDField f = null;
                        try {
                            f = tester.addVar(name);
                        } catch (ModuleException e) {
                            e.printStackTrace();
                        }
                        tester.conjunctTrans(aux.biimp(f.getDomain().ithVar(1)));
                        break;
                    default:
                        break;
                }
            } catch (ModuleException e) {
                throw new ModelCheckAlgException("Failed to construct BDD "
                        + "assertion for specification: " + spec.toString());
            } catch (BDDException e) {
                throw new ModelCheckAlgException("Failed to prime BDD "
                        + "assertion for specification: " + spec.toString());
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
