package edu.wis.jtlv.lib.mc.ATLsK;

import java.util.Vector;

import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.core.smv.eval.*;
import edu.wis.jtlv.env.core.smv.schema.SMVAgentInfo;
import edu.wis.jtlv.env.module.*;
import edu.wis.jtlv.env.spec.*;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import edu.wis.jtlv.old_lib.mc.ModelCheckException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;
import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.lib.AlgExceptionI;
import edu.wis.jtlv.lib.AlgResultI;
import edu.wis.jtlv.lib.AlgResultPath;
import edu.wis.jtlv.lib.AlgResultString;
import edu.wis.jtlv.lib.mc.ModelCheckAlgI;

class ATLsK_TesterVariables {
	ModuleBDDField var;     // the output variable
	ModuleBDDField lbound;  // the lower bound of the interval
	ModuleBDDField width;   // the width of the interval

	public ATLsK_TesterVariables(ModuleBDDField var, ModuleBDDField lbound, ModuleBDDField width) {
		this.var = var;
		this.lbound = lbound;
		this.width = width;
	}
}

/**
 * There are two methods to use this algorithms:
 * <p>
 * 1. Given a specification \phi (as a formula in temporal logic) we want to
 * decide whether \phi is valid over finite state program P, i.e. whether all
 * the computations of the design satisfy \phi.
 * </p>
 * 
 * <p>
 * 2. To compose a tester with the design, and perform model checking. If the
 * composition is feasible then a counter example is thrown.
 * </p>
 * 
 * @version {@value Env#version}
 * @author yaniv sa'ar.
 */
public class ATLsK_ModelCheckAlg extends ModelCheckAlgI {
	private Spec property;
//	private Module tester;

    private Spec chkProp; // the property actually checked
    private BDD chkBdd; // the BDD obtained by checking chkBdd
	private BDDVarSet visibleVars;

	private static int tester_id = 0;
	private static int field_id = 0;

    public Spec getProperty() {
        return property;
    }

    public void setProperty(Spec property) {
        this.property = property;
    }

    /**
	 * <p>
	 * Constructor for a given specification \phi (as a formula in temporal
	 * logic) which we want to decide whether \phi is valid over finite state
	 * program P, i.e. whether all the computations of the design satisfy \phi.
	 * </p>
	 * 
	 * @param design
	 *            The design to check.
	 * @param property
	 *            The property to check.
	 */
	public ATLsK_ModelCheckAlg(Module design, Spec property) {
		super(design);
		this.property = property;
	}

	/**
	 * <p>
	 * Constructor for composing a tester with the design, and perform model
	 * checking. If the composition is feasible then a counter example is
	 * thrown.
	 * </p>
	 * 
	 * @param design
	 *            The design to check.
	 */
	public ATLsK_ModelCheckAlg(Module design) {
		super(design);
//		this.tester = user_tester;
	}

	public boolean tester_isEmpty(SMVModule tester) {
		return tester.getAll_couples().size()==0;
	}

	// return the BDDs of the aux variables for the tester
	private BDDVarSet tester_getAuxVars_BDDVarSet(SMVModule tester) {
		BDDVarSet vs = Env.getEmptySet() ;
		for (ModuleBDDField var : tester.getAll_couples()) {
			vs = vs.id().union(var.support());
		}
		return vs;
	}

	public BDD sat(Spec spec,				// an ATL*K specification
					SMVModule tester	// the tester that holds the subtester of spec
	) throws ModuleException, SMVParseException, ModelCheckException, ModelCheckAlgException, SpecException {
		if (spec instanceof SpecBDD) {
			return ((SpecBDD) spec).getVal();
		}
		if (spec instanceof SpecRange || spec instanceof SpecAgentIdentifier) return null;

		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD c1 = null, c2 = null;
		ModuleBDDField x=null;
		BDD xBdd; // output variable of the tester

		//-----------------------------------------------------------------------------------------------------------
		// logical connectives
		//-----------------------------------------------------------------------------------------------------------
		if(op == Operator.NOT) {
			return sat(child[0], tester).not();
		}
		if(op == Operator.AND) {
			return sat(child[0], tester).and(sat(child[1], tester));
		}
		if(op == Operator.OR) {
			return sat(child[0], tester).or(sat(child[1], tester));
		}

		//-----------------------------------------------------------------------------------------------------------
		// path quantifiers
		// a new tester will be constructed for the subformula restricted by each path quantifier
		//-----------------------------------------------------------------------------------------------------------
		if(op == Operator.EE) return satEE(spec);
		if(op == Operator.AA) return satAA(spec);
		if(op == Operator.CAN_ENFORCE) return satCAN_ENFORCE(spec);
		if(op == Operator.CANNOT_AVOID) return satCANNOT_AVOID(spec);

		//-----------------------------------------------------------------------------------------------------------
		// epistemic modalities
		// a new tester will be constructed for the subformula restricted by each epistemic quantifier
		//-----------------------------------------------------------------------------------------------------------
		if(op == Operator.KNOW) return satKNOW(spec);
		if(op == Operator.NKNOW) return satNKNOW(spec);
		if(op == Operator.SKNOW) return satSKNOW(spec);
		if(op == Operator.NSKNOW) return satNSKNOW(spec);

		//-----------------------------------------------------------------------------------------------------------
		// temporal operators
		// the tester of the temporal formula spec will be composited into specTester
		//-----------------------------------------------------------------------------------------------------------
		if(op == Operator.NEXT) {
//			String testerName = specTester.getName();
			x = tester.addVar("X"+(++field_id)); // boolean variable
			xBdd = x.getDomain().ithVar(1);

			c1 = sat(child[0], tester);
			BDD p_c1 = Env.prime(c1);
			tester.conjunctTrans(xBdd.imp(p_c1));
			return xBdd;
		}
/*
		if(op == Operator.FINALLY) {
			x = tester.addVar("X"+(++field_id)); // boolean variable
			xBdd = x.getDomain().ithVar(1);

			c1 = sat(child[0], tester);
			BDD p_x = Env.prime(xBdd);
			tester.conjunctTrans(xBdd.biimp(c1.or(p_x)));
			tester.addJustice(c1.or(xBdd.not()));
			return xBdd;
		}
		if(op == Operator.GLOBALLY) {
			x = tester.addVar("X"+(++field_id)); // boolean variable
			xBdd = x.getDomain().ithVar(1);

			c1 = sat(child[0], tester);
			BDD p_x = Env.prime(xBdd);
			tester.conjunctTrans(xBdd.biimp(c1.and(p_x)));
			tester.addJustice(c1.not().or(xBdd));
			return xBdd;
		}
*/
		if(op == Operator.UNTIL) {
			x = tester.addVar("X"+(++field_id)); // boolean variable
			xBdd = x.getDomain().ithVar(1);

			c1 = sat(child[0], tester);
			c2 = sat(child[1], tester);
			BDD p_x = Env.prime(xBdd);
			tester.conjunctTrans(xBdd.imp(c2.or(c1.and(p_x))));
			tester.addJustice(xBdd.imp(c2));
			return xBdd;
		}
		if(op == Operator.RELEASES) {
			x = tester.addVar("X"+(++field_id)); // boolean variable
			xBdd = x.getDomain().ithVar(1);

			c1 = sat(child[0], tester);
			c2 = sat(child[1], tester);
			BDD p_x = Env.prime(xBdd);
			tester.conjunctTrans(xBdd.imp(c2.and(c1.or(p_x))));
			return xBdd;
		}
		if(op == Operator.B_UNTIL) { return satBUNTIL(spec, tester); }
		if(op == Operator.B_RELEASES) { return satBRELEASE(spec, tester); }

		//otherwise
		throw new ModelCheckException("Cannot handle the specification "+spec+".");
	}

	public BDD satBUNTIL(Spec spec,				// an ATL*K specification
						  SMVModule tester			// the tester that holds the subtester of spec
	) throws ModuleException, ModelCheckException, SMVParseException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		if(op!=Operator.B_UNTIL) return null;

		Spec[] child = se.getChildren();
		BDD c1 = null, c2 = null;
		ModuleBDDField x=null, l=null, w=null;
		BDD xBdd; // output variable of the tester
		x = tester.addVar("X" + (++field_id)); // boolean variable
		xBdd = x.getDomain().ithVar(1);
		SpecRange range=(SpecRange)child[1];
		int a=range.getFrom(), b=range.getTo();

		c1 = sat(child[0], tester);
		c2 = sat(child[2], tester);

		// 0<=a<=b and !(a=0 and b=0)
		if((a==b) || (a==0 && b>0)) {
			l = tester.addVar("L"+field_id, 0, b);
			w = null;
			BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
			BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
					new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
			BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=l-1
					new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD(); //l=0
			BDD lEb = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{""+b}))).eval_stmt().toBDD(); //l=b
			if(a==b){
				tester.conjunctTrans(xBdd.and(lGT0).imp(c1.and(NxE1).and(NlElM1))); // (x & l>0) -> (c1 & x' & l'=l-1)
				tester.conjunctTrans(xBdd.and(lE0).imp(c2)); // (x & l=0) -> c2
			}else{ // a==0 && b>0
				tester.conjunctTrans(xBdd.and(lGT0).imp(c2.or(c1.and(NxE1).and(NlElM1)))); // (x & l>0) -> (c2 | (c1 & x' & l'=l-1))
				tester.conjunctTrans(xBdd.and(lE0).imp(c2)); // (x & l=0) -> c2
			}
			return xBdd.and(lEb); // x & l=b;
		}else{ // 0<a<b
			l = tester.addVar("L"+field_id, 0, a);
			w = tester.addVar("W"+field_id, 0, b-a);
			BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
			BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
					new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
			BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=l-1
					new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD(); //l=0
			BDD lEa = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{""+a}))).eval_stmt().toBDD(); //l=a
			BDD wGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w>0
			BDD NwEw = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)), //next(w)=w)
					new ValueConsStrStmt(tester, new String[]{w+""}))).eval_stmt().toBDD();
			BDD NlE0= new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=0)
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();
			BDD NwEwM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)),//next(w)=w-1
					new OpMinus(new ValueDomStmt(tester, w), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD wE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w=0
			BDD wEbMa = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{""+(b-a)}))).eval_stmt().toBDD();//w=b-a
			tester.conjunctTrans(xBdd.and(lGT0).and(wGT0).imp(c1.and(NxE1).and(NlElM1).and(NwEw))); // (x & l>0 & w>0) -> (c1 & x' & l'=l-1 & w'=w)
			tester.conjunctTrans(xBdd.and(lE0).and(wGT0).imp(c2.or(c1.and(NxE1).and(NlE0).and(NwEwM1)))); // (x & l=0 & w>0) -> (c2 | (c1 & x' & l'=0 & w'=w-1))
			tester.conjunctTrans(xBdd.and(lE0).and(wE0).imp(c2)); // (x & l=0 & w=0) -> c2
			return xBdd.and(lEa).and(wEbMa); // x & l=a & w=b-a;
		}
	}

	public BDD satBRELEASE(Spec spec,				// an ATL*K specification
						  SMVModule tester			// the tester that holds the subtester of spec
	) throws ModuleException, ModelCheckException, SMVParseException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		if(op!=Operator.B_RELEASES) return null;

		Spec[] child = se.getChildren();
		BDD c1 = null, c2 = null;
		ModuleBDDField x=null, l=null, w=null;
		BDD xBdd; // output variable of the tester
		x = tester.addVar("X" + (++field_id)); // boolean variable
		xBdd = x.getDomain().ithVar(1);
		SpecRange range=(SpecRange)child[1];
		int a=range.getFrom(), b=range.getTo();

		c1 = sat(child[0], tester);
		c2 = sat(child[2], tester);

		// 0<=a<=b and !(a=0 and b=0)
		if((a==b) || (a==0 && b>0)) {
			l = tester.addVar("L"+field_id, 0, b);
			w = null;
			BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
			BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
					new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
			BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=l-1
					new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD(); //l=0
			BDD lEb = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{""+b}))).eval_stmt().toBDD(); //l=b
			if(a==b){
				tester.conjunctTrans(xBdd.and(lGT0).imp(NxE1.and(NlElM1).or(c1))); // (x & l>0) -> ((x' & l'=l-1) | c1)
				tester.conjunctTrans(xBdd.and(lE0).imp(c2)); // (x & l=0) -> c2
			}else{ // a==0 && b>0
				tester.conjunctTrans(xBdd.and(lGT0).imp(c2.and(c1.or(NxE1.and(NlElM1))))); // (x & l>0) -> (c2 & (c1 | (x' & l'=l-1)))
				tester.conjunctTrans(xBdd.and(lE0).imp(c2)); // (x & l=0) -> c2
			}
			return xBdd.and(lEb); // x & l=b;
		}else{ // 0<a<b
			l = tester.addVar("L"+field_id, 0, a);
			w = tester.addVar("W"+field_id, 0, b-a);
			BDD lGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{ "0"}))).eval_stmt().toBDD(); //l>0
			BDD NxE1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, x)), //next(x)
					new ValueConsStrStmt(tester, new String[]{"1"}))).eval_stmt().toBDD();
			BDD NlElM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=l-1
					new OpMinus(new ValueDomStmt(tester, l), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD lE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD(); //l=0
			BDD lEa = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, l),
					new ValueConsStrStmt(tester, new String[]{""+a}))).eval_stmt().toBDD(); //l=a
			BDD wGT0=new StmtOperator(tester, new OpGT(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w>0
			BDD NwEw = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)), //next(w)=w)
					new ValueConsStrStmt(tester, new String[]{w+""}))).eval_stmt().toBDD();
			BDD NlE0= new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, l)), //next(l)=0)
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();
			BDD NwEwM1 = new StmtOperator(tester, new OpEqual(new OpNext(new ValueDomStmt(tester, w)),//next(w)=w-1
					new OpMinus(new ValueDomStmt(tester, w), new ValueConsStrStmt(tester, new String[]{"1"})))).eval_stmt().toBDD();
			BDD wE0 = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{"0"}))).eval_stmt().toBDD();//w=0
			BDD wEbMa = new StmtOperator(tester, new OpEqual(new ValueDomStmt(tester, w),
					new ValueConsStrStmt(tester, new String[]{""+(b-a)}))).eval_stmt().toBDD();//w=b-a
			tester.conjunctTrans(xBdd.and(lGT0).and(wGT0).imp(c1.or(NxE1.and(NlElM1).and(NwEw)))); // (x & l>0 & w>0) -> (c1 | (x' & l'=l-1 & w'=w))
			tester.conjunctTrans(xBdd.and(lE0).and(wGT0).imp(c2.and(c1.or(NxE1.and(NlE0).and(NwEwM1))))); // (x & l=0 & w>0) -> (c2 & (c1 | (x' & l'=0 & w'=w-1)))
			tester.conjunctTrans(xBdd.and(lE0).and(wE0).imp(c2)); // (x & l=0 & w=0) -> c2
			return xBdd.and(lEa).and(wEbMa); // x & l=a & w=b-a;
		}
	}

	// return the set of states satisfying spec
	// spec = EE c1
	public BDD satEE(Spec spec) throws ModelCheckException, ModuleException, SMVParseException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD c1 = null, specBdd = null;
		if(op != Operator.EE) return null;

		SMVModule c1Tester = new SMVModule("Tester"+(++tester_id));
		c1 = sat(child[0], c1Tester);
		if(!tester_isEmpty(c1Tester)) {
			design.syncComposition(c1Tester);
			BDD feas = design.feasible(); // feas = fair(D||T)
			BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(c1Tester);
			specBdd = feas.and(c1).exist(auxVars); // specBdd = forsome auxVars.(feas(D||T) & c1)
			design.decompose(c1Tester);
		}else{ // fTester is empty
			specBdd = c1.and(design.feasible()); // specBdd = feas & c1
		}
		return specBdd;
	}

	// return the set of states satisfying spec
	// spec = AA c1
	public BDD satAA(Spec spec) throws ModelCheckException, SMVParseException, ModuleException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD c1 = null, specBdd = null;
		if(op != Operator.AA) return null;

		SMVModule negC1Tester = new SMVModule("Tester"+(++tester_id));
		BDD negC1=null;
		negC1 = sat(NNF(new SpecExp(Operator.NOT, child[0])), negC1Tester);
		if(!tester_isEmpty(negC1Tester)) {
			design.syncComposition(negC1Tester);
			BDD feas = design.feasible();
			BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(negC1Tester);
			specBdd = feas.and(negC1).exist(auxVars).not(); // specBdd = ! forsome auxVars.(feasible(D||T(!c1)) & !c1)
			design.decompose(negC1Tester);
		}else{ // fTester is empty
			specBdd = negC1.and(design.feasible()).not(); // specBdd = !(feasible(D) & !c1)
		}
		return specBdd;
	}

	// spec = <agentList> c1
	public BDD satCAN_ENFORCE(Spec spec) throws ModelCheckException, SMVParseException, ModuleException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD negC1 = null, specBdd = null;
		if(op != Operator.CAN_ENFORCE) return null;

		// get the agent list
		Vector<String> agentList = new Vector<>();
		for(int i=0; i<child.length-1; i++) {
			SpecAgentIdentifier agentId = (SpecAgentIdentifier) child[i];
			agentList.add(agentId.getAgentName());
		}

		SMVModule negC1Tester = new SMVModule("Tester"+(++tester_id));
		negC1 = sat(NNF(new SpecExp(Operator.NOT, child[child.length-1])), negC1Tester);
		if(!tester_isEmpty(negC1Tester)) {
			design.syncComposition(negC1Tester);
            // feas_negC1 = these feasible states that agentList can enforce !c1 holds
			BDD feas_CE_negC1 = ((SMVModule) design).ATL_canEnforce_feasible(agentList);
			BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(negC1Tester);
			specBdd = feas_CE_negC1.and(negC1).exist(auxVars).not(); // specBdd = ! forsome auxVars.(feas_CE_negC1 & !c1)
			design.decompose(negC1Tester);
		}else{ // fTester is empty
			specBdd = negC1.and(((SMVModule) design).ATL_canEnforce_feasible(agentList)).not(); // specBdd = !(feas & !c1)
		}
		return specBdd;
	}

	public static BDDVarSet ATL_getAgentActionVars(Vector<String> agentList) throws ModelCheckAlgException {
		BDDVarSet avars = Env.getEmptySet() ;
		for (String agentName : agentList) {
			SMVAgentInfo agentInfo = getAgentInfo(agentName);
			if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");
			ModuleBDDField actField = agentInfo.getActionVar();
			if(actField==null) //throw new ModelCheckAlgException("Cannot find the BDD field of the agent "+agentName+"\'s action variable.");
				continue; // skip these agents that does not have action variable
			avars = avars.id().union(actField.support());
		}
		return avars;
	}

	public static BDDVarSet ATL_getAllAgentActionVarsMinus(Vector<String> minusAgentList) throws ModelCheckAlgException {
		BDDVarSet avars = Env.getEmptySet() ;

		for(String agentFullname : Env.getAll_agent_modules().keySet()){
			// searching for an agent
			boolean existing = false;
			for(String minusAgentName : minusAgentList) {
				if(getAgentFullname(minusAgentName).equals(agentFullname)) {
					existing = true;
					break;
				}
			}
			if(!existing) {
				SMVAgentInfo agentInfo = getAgentInfo(agentFullname);
				if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentFullname + ".");
				ModuleBDDField actField = agentInfo.getActionVar();
				if(actField!=null)
					avars = avars.id().union(actField.support());
			}
		}
		return avars;
	}

    public BDD satCANNOT_AVOID(Spec spec) throws ModelCheckException, SMVParseException, ModuleException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
        SpecExp se = (SpecExp) spec;
        Operator op = se.getOperator();
        Spec[] child = se.getChildren();
        BDD c1 = null, specBdd = null;
        if(op != Operator.CANNOT_AVOID) return null;

        // get the agent list
        Vector<String> agentList = new Vector<>();
        for(int i=0; i<child.length-1; i++) {
            SpecAgentIdentifier agentId = (SpecAgentIdentifier) child[i];
            agentList.add(agentId.getAgentName());
        }

        SMVModule c1Tester = new SMVModule("Tester"+(++tester_id));
		c1 = sat(child[child.length-1], c1Tester);
        if(!tester_isEmpty(c1Tester)) {
            design.syncComposition(c1Tester);
            BDD feas = ((SMVModule) design).ATL_cannotAvoid_feasible(agentList); // feas = fair(D||T)
            BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(c1Tester);
            specBdd = feas.and(c1).exist(auxVars); // specBdd = forsome auxVars.(feas(D||T) & c1)
            design.decompose(c1Tester);
        }else{ // fTester is empty
            specBdd = c1.and(((SMVModule) design).ATL_cannotAvoid_feasible(agentList)); // specBdd = feas & c1
        }
        return specBdd;
    }

	public static String getAgentFullname(String agentName) throws ModelCheckAlgException {
		if(agentName==null || agentName.equals(""))
			throw new ModelCheckAlgException("The agent name of \'" + agentName + "\' is null.");

		if(agentName.equals("main")) return agentName;

		int idx_dot = agentName.indexOf('.');
		if(idx_dot==-1) {
			return "main." + agentName;
		}else if (!agentName.substring(0, idx_dot).equals("main")) // agentName = $$$$.####, where $$$$ is not "main"
			throw new ModelCheckAlgException("The agent's name \'" + agentName + "\' is illegal.");
		else { // the prefix of agentName is "main."
			if(agentName.length()>"main.".length()) // agentName = main.$$$$
				return agentName;
			else // agentName = "main."
				throw new ModelCheckAlgException("The agent's name \'" + agentName + "\' is illegal.");
		}
	}

	public static SMVAgentInfo getAgentInfo(String agentName) throws ModelCheckAlgException {
		SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(getAgentFullname(agentName));
		return agentInfo;
	}

	// spec = i KNOW c1
	public BDD satKNOW(Spec spec) throws ModelCheckAlgException, ModelCheckException, SMVParseException, ModuleException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD c1 = null, specBdd = null, tmp;
		if(op != Operator.KNOW) return null;

		// (1) handle c1
		SMVModule negC1Tester = new SMVModule("Tester"+(++tester_id));
		BDD negC1=null;
		negC1 = sat(NNF(new SpecExp(Operator.NOT, child[1])), negC1Tester);
		if(!tester_isEmpty(negC1Tester)) {
			design.syncComposition(negC1Tester);
			BDD feas = design.feasible(); // feas = fair(D||T)
			BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(negC1Tester);
			tmp = feas.and(negC1).exist(auxVars); // tmp = forsome auxVars.(fair(D||T) & !c1)
			design.decompose(negC1Tester);
		}else{ // fTester is empty
			tmp = negC1.and(design.feasible()); // tmp = (fair(D) & !c1)
		}

		// (2) handle "i KNOW c1"
		//SpecAgentIdentifier agentId = (SpecAgentIdentifier) child[0];
		String agentName = child[0].toString();
		SMVAgentInfo agentInfo = getAgentInfo(agentName);
		if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

		BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
		// V - agentName's visible variables
		BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

		return tmp.exist(allInvisVars).not(); // return ! forsome (V-O_i).tmp
	}

	// spec = i NKNOW c1
	public BDD satNKNOW(Spec spec) throws ModelCheckException, SMVParseException, ModuleException, ModelCheckAlgException, SpecException {
		SMVModule design = (SMVModule) getDesign();
		SpecExp se = (SpecExp) spec;
		Operator op = se.getOperator();
		Spec[] child = se.getChildren();
		BDD c1 = null, specBdd = null, tmp;
		if(op != Operator.NKNOW) return null;

		// (1) handle c1
		SMVModule c1Tester = new SMVModule("Tester"+(++tester_id));
		c1 = sat(child[1], c1Tester);
		if(!tester_isEmpty(c1Tester)) {
			design.syncComposition(c1Tester);
			BDD feas = design.feasible(); // feas = fair(D||T)
			BDDVarSet auxVars = tester_getAuxVars_BDDVarSet(c1Tester);
			tmp = feas.and(c1).exist(auxVars); // tmp = forsome auxVars.(fair(D||T) & c1)
			design.decompose(c1Tester);
		}else{ // fTester is empty
			tmp = c1.and(design.feasible()); // tmp = (fair(D) & c1)
		}

		// (2) handle "i NKNOW c1"
		//SpecAgentIdentifier agentId = (SpecAgentIdentifier) child[0];
		String agentName = child[0].toString();
		SMVAgentInfo agentInfo = getAgentInfo(agentName);
		if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

		BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
		// V - agentName's visible variables
		BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

		return tmp.exist(allInvisVars); // return forsome (V-O_i).tmp
	}

	public BDD satSKNOW(Spec spec) {
		return null;
	}

	public BDD satNSKNOW(Spec spec) {
		return null;
	}

	//------------------------------------------------------------------------------------------------------------------
	// return the Negation Normal Form of spec, which includes the following operators:
	//   -- logic connectives NOT, AND, OR,
	//   -- temporal operators NEXT, FINALLY, GLOBALLY, UNTIL, RELEASES,
	//   -- bounded temporal operators B_UNTIL a..b, B_RELEASES a..b, where (0<a<b) or (a=0 and b>0)
	//   -- path quantifiers EE, AA, CAN_ENFORCE, CANNOT_AVOID
	//   -- epistemic modalities
	//------------------------------------------------------------------------------------------------------------------
	public static Spec NNF(Spec spec) throws ModelCheckException, SpecException {
		//System.out.println("spec--------"+spec);
		if (! (spec instanceof SpecExp))
			return  spec;

		SpecExp propExp = (SpecExp) spec;
		Operator op = propExp.getOperator();
		Spec[] child = propExp.getChildren();
		int noo = op.numOfOperands();
//		System.out.println("-------------"+op);

		// unaryOp of LTL except for Not
		if(op == Operator.NEXT
//				||op == Operator.FINALLY
//				||op == Operator.GLOBALLY
/*
				||op == Operator.HISTORICALLY)
				||op == Operator.NOT_PREV_NOT)
				||op == Operator.ONCE)
				||op == Operator.PREV)
*/
				// path quantifiers
				||op == Operator.EE
				||op == Operator.AA
				||op == Operator.CAN_ENFORCE
				||op == Operator.CANNOT_AVOID
				){
			return new SpecExp(op, NNF(child[0]));
		}

		// binaryOp of LTL except for KNOW,SKNOW,NKNOW

		// earse IMPLIE, IFF, XOR and XOR that include negation operator implicitly
		if(op == Operator.IMPLIES) { // c1 IMPLIES c2 ==> !c1 OR c2
			return new SpecExp(Operator.OR,
					NNF(new SpecExp(Operator.NOT, child[0])),
					NNF(child[1]));
		}
		if(op == Operator.IFF || op == Operator.XNOR) { // c1 IFF/XNOR c2 ==> (c1 AND c2) OR (!c1 AND !c2)
			Spec c1_c2 = new SpecExp(Operator.AND, NNF(child[0]), NNF(child[1]));
			Spec negC1_negC2 = new SpecExp(Operator.AND,
					NNF(new SpecExp(Operator.NOT, child[0])),
					NNF(new SpecExp(Operator.NOT, child[1])));
			return new SpecExp(Operator.OR, c1_c2, negC1_negC2);
		}
		if(op == Operator.XOR) { // c1 XOR c2 ==> !(c1 IFF c2)
			return NNF(new SpecExp(Operator.NOT,
					new SpecExp(Operator.IFF, child[0], child[1])));
		}

		if(op == Operator.AND
				||op == Operator.OR

				// temporal operators
				||op == Operator.UNTIL
				||op == Operator.RELEASES
/*
				||op == Operator.SINCE)
				||op == Operator.TRIGGERED)
*/
				){
			return new SpecExp(op, NNF(child[0]), NNF(child[1]));
		}

		// F c1 = true U c1
		if(op == Operator.FINALLY){
			return new SpecExp(Operator.UNTIL, getTrueSpec(), NNF(child[0]));
		}
		// G c1 ==> ! F !c1 ==> !(true U !c1) ==> false R c1
		if(op == Operator.GLOBALLY){
			return new SpecExp(Operator.RELEASES, getFalseSpec(), NNF(child[0]));
		}
		// F a..b f
		if(op == Operator.B_FINALLY){
			SpecRange range=(SpecRange)child[0];
			if(range.getFrom()<0) // a<0
				throw new ModelCheckException("The lower bound of " + spec + " cannot be less than 0.");
			// a>=0
			if(range.getTo()>=0) { // b>=0
				if(range.getFrom()>range.getTo()) // a>b
					throw new ModelCheckException("The lower bound of " + spec + " must be no lager than the upper bound.");
				// 0<=a<=b
				if(range.getFrom()==0 && range.getTo()==0) { // a=0 and b=0
					return NNF(child[1]);
				}else { // F a..b f (b>0) ==> T U a..b f
					Spec c1_nnf = NNF(child[1]);
					Spec trueSpec = getTrueSpec();
					return new SpecExp(Operator.B_UNTIL, trueSpec, range, c1_nnf);
				}
			}else //F a..b f (b<0) ==> T U a..a ( F f)
			{
				Spec c1_nnf= NNF(new SpecExp(Operator.FINALLY, child[1]));
				SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
				return new SpecExp(Operator.B_UNTIL, getTrueSpec(), newRange, c1_nnf);
			}
		}
		// G a..b f
		if(op == Operator.B_GLOBALLY){
			SpecRange range=(SpecRange)child[0];
			if(range.getFrom()<0) // a<0
				throw new ModelCheckException("The lower bound of " + spec + " cannot be less than 0.");
			// a>=0
			if(range.getTo()>=0) { // b>=0
				if (range.getFrom() > range.getTo()) // a>b
					throw new ModelCheckException("The lower bound of " + spec + " must be no lager than the upper bound.");
				// 0<=a<=b
				if (range.getFrom() == 0 && range.getTo() == 0) { // a=0 and b=0
					return NNF(child[1]);
				} else { // G a..b f (b>0) ==> ! F a..b !f ==> !(T U a..b !f) ==> false R a..b f
					Spec c1_nnf = NNF(child[1]);
					return new SpecExp(Operator.B_RELEASES, getFalseSpec(), range, c1_nnf);
				}
			}else // G a..b f (b<0) ==> G a..a G f ==> F a..a G f ==> T U a..a G f
			{
				Spec p1 = NNF(new SpecExp(Operator.GLOBALLY, child[1])); // p1 = G f
				SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
				return new SpecExp(Operator.B_UNTIL, getTrueSpec(), newRange, p1);
			}
		}

		// tripletOp of LTL
		if(op == Operator.B_UNTIL || op == Operator.B_RELEASES){
			SpecRange range=(SpecRange)child[1];
			//System.out.println(""+child[0]+child[1]+child[2]);
			if(range.getFrom()<0) // a<0
				throw new ModelCheckException("The lower bound of " + spec + " cannot be less than 0.");
			// a>=0
			if(range.getTo()>=0) { // b>=0
				if (range.getFrom() > range.getTo()) // a>b
					throw new ModelCheckException("The lower bound of " + spec + " must be no lager than the upper bound.");
				// 0<=a<=b
				if (range.getFrom() == 0 && range.getTo() == 0) { // a=0 and b=0
					return NNF(child[1]);
				} else { // c1 U/R a..b c2 (b>0)
					Spec c1_nnf = NNF(child[0]);
					Spec c2_nnf = NNF(child[2]);
					return new SpecExp(op, c1_nnf, range, c2_nnf);
				}
			}else // c1 U/R a..b c2 (b<0) ==> c1 U/R a..a (c1 U/R c2)
			{
				Spec c1_nnf = NNF(child[0]);
				Spec c1_nnf_copy = NNF(child[0]);
				Spec c2_nnf = NNF(child[2]);
				Operator newOp = op == Operator.B_UNTIL ? Operator.UNTIL : Operator.RELEASES;
				Spec c1Copy_newOp_c2 = new SpecExp(newOp, c1_nnf_copy, c2_nnf);
				SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
				return new SpecExp(op, c1_nnf, newRange, c1Copy_newOp_c2);
			}
		}

		// epistemic operators
		if(op == Operator.KNOW
				||op == Operator.NKNOW
				||op == Operator.SKNOW
				||op == Operator.NSKNOW
				){
			return new SpecExp(op, child[0], NNF(child[1]));
		}

		//---------------------------------------------------------------
		// when spec=!f, return the NNF of !f
        //---------------------------------------------------------------
        if (op == Operator.NOT) {
			Spec f = child[0];
			if (! (f instanceof SpecExp))
				return spec;

			SpecExp se = (SpecExp) f;
			Operator fOp = se.getOperator();
			Spec[] fChild = se.getChildren();
			// System.out.println("ops-"+ops+" 0-"+childs[0]+" 1-"+childs[1]+" 2-"+childs[2]);
			if (fOp == Operator.NOT) { // NNF(!!c1) ==> NNF(c1)
				return NNF(fChild[0]);
			}
			if(fOp == Operator.AND) { // !(c1 AND c2) ==> !c1 OR !c2
				return new SpecExp(Operator.OR, NNF(new SpecExp(Operator.NOT, fChild[0])), NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			if(fOp == Operator.OR) { // !(c1 OR c2) ==> !c1 AND !c2
				return new SpecExp(Operator.AND, NNF(new SpecExp(Operator.NOT, fChild[0])), NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			// for f, earse IMPLIE, IFF, XOR and XOR that include negation operator implicitly
			if(fOp == Operator.IMPLIES) { // !(c1 IMPLIES c2) ==> c1 AND !c2
				return new SpecExp(Operator.AND,
						NNF(fChild[0]),
						NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			if(fOp == Operator.IFF || fOp == Operator.XNOR) { // !(c1 IFF/XNOR c2) ==> (c1 AND !c2) OR (!c1 AND c2)
				Spec c1_negC2 = new SpecExp(Operator.AND, NNF(fChild[0]), NNF(new SpecExp(Operator.NOT, fChild[1])));
				Spec negC1_C2 = new SpecExp(Operator.AND, NNF(new SpecExp(Operator.NOT, fChild[0])), NNF(fChild[1]));
				return new SpecExp(Operator.OR, c1_negC2, negC1_C2);
			}
			if(fOp == Operator.XOR) { // !(c1 XOR c2) ==> (c1 IFF c2)
				return new SpecExp(Operator.IFF, NNF(fChild[0]), NNF(fChild[1]));
			}

			if(fOp == Operator.EE){ // ! EE c1 ==> AA !c1
				return new SpecExp(Operator.AA, NNF(new SpecExp(Operator.NOT, fChild[0])));
			}
			if(fOp == Operator.AA){ // ! AA c1 ==> EE !c1
				return new SpecExp(Operator.EE, NNF(new SpecExp(Operator.NOT, fChild[0])));
			}
			if(fOp == Operator.CAN_ENFORCE){ // ! CAN_ENFORCE c1 ==> CANNOT_AVOID !c1
				Spec[] elements = new Spec[fChild.length];
				for (int i=0; i<fChild.length-1; i++) elements[i]=fChild[i];
				elements[fChild.length-1]=NNF(new SpecExp(Operator.NOT, fChild[fChild.length-1]));
				return new SpecExp(Operator.CANNOT_AVOID, elements);
			}
			if(fOp == Operator.CANNOT_AVOID){ // ! CANNOT_AVOID c1 ==> CAN_ENFORCE !c1
				Spec[] elements = new Spec[fChild.length];
				for (int i=0; i<fChild.length-1; i++) elements[i]=fChild[i];
				elements[fChild.length-1]=NNF(new SpecExp(Operator.NOT, fChild[fChild.length-1]));
				return new SpecExp(Operator.CAN_ENFORCE, elements);
			}

			if (fOp == Operator.NEXT) { // ! X c1 ==> X !c1
				return new SpecExp(fOp, NNF(new SpecExp(Operator.NOT, fChild[0])));
			}
			// !(F c1) ==> !(true U c1) ==> false R !c1
			if(fOp == Operator.FINALLY){
				Spec negC1= NNF(new SpecExp(Operator.NOT, fChild[0]));
				return new SpecExp(Operator.RELEASES, getFalseSpec(), negC1);
			}
			// !G c1 ==> true U !c1
			if(fOp == Operator.GLOBALLY){
				Spec negC1= NNF(new SpecExp(Operator.NOT, fChild[0]));
				return new SpecExp(Operator.UNTIL, getTrueSpec(), negC1);
			}
			// !(F a..b c1)
			if(fOp == Operator.B_FINALLY){
				SpecRange range=(SpecRange)fChild[0];
				if(range.getFrom()<0) // a<0
					throw new ModelCheckException("The lower bound of " + f + " cannot be less than 0.");
				// a>=0
				if(range.getTo()>=0) { // b>=0
					if(range.getFrom()>range.getTo()) // a>b
						throw new ModelCheckException("The lower bound of " + f + " must be no lager than the upper bound.");
					// 0<=a<=b
					if(range.getFrom()==0 && range.getTo()==0) { // a=0 and b=0
						return NNF(new SpecExp(Operator.NOT, fChild[1]));
					}else{ // if b>0, then !(F a..b c1) ==> !(T U a..b c1) ==> false R a..b !c1
						Spec negC1= NNF(new SpecExp(Operator.NOT, fChild[1]));
						return new SpecExp(Operator.B_RELEASES, getFalseSpec(), range, negC1);
					}
				} else { // if b<0, then !(F a..b c1) ==> !(true U a..a (true U c1)) ==> false R a..a (false R !c1)
					Spec negC1 =  NNF(new SpecExp(Operator.NOT, fChild[1]));
					Spec false_R_negC1 = new SpecExp(Operator.RELEASES, getFalseSpec(), negC1);
					SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
					return new SpecExp(Operator.B_RELEASES, getFalseSpec(), newRange, false_R_negC1);
				}
			}
			if(fOp == Operator.B_GLOBALLY){
				SpecRange range=(SpecRange)fChild[0];
				if(range.getFrom()<0) // a<0
					throw new ModelCheckException("The lower bound of " + f + " cannot be less than 0.");
				// a>=0
				if(range.getTo()>=0) { // b>=0
					if(range.getFrom()>range.getTo()) // a>b
						throw new ModelCheckException("The lower bound of " + f + " must be no lager than the upper bound.");
					// 0<=a<=b
					if(range.getFrom()==0 && range.getTo()==0) { // a=0 and b=0
						return NNF(new SpecExp(Operator.NOT, fChild[1]));
					}else { // if b>0, then !G a..b c1 ==> true U a..b !c1
						Spec negC1 = NNF(new SpecExp(Operator.NOT, fChild[1]));
						return new SpecExp(Operator.B_UNTIL, getTrueSpec(), range, negC1);
					}
				}else {	// if b<0, then !G a..b c1 ==> F a..b !c1 ==> true U a..a (true U !c1)
					Spec negC1 =  NNF(new SpecExp(Operator.NOT, fChild[1]));
					Spec true_U_negC1 = new SpecExp(Operator.UNTIL, getTrueSpec(), negC1);
					SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
					return new SpecExp(Operator.B_UNTIL, getFalseSpec(), newRange, true_U_negC1);
				}
			}
			if (fOp == Operator.UNTIL) { // !(c1 U c2) ==> !c1 R !c2
				return new SpecExp(Operator.RELEASES, NNF(new SpecExp(Operator.NOT, fChild[0])), NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			// !(c1 U a..b c2)
			if (fOp == Operator.B_UNTIL) {
				SpecRange range=(SpecRange)fChild[1];
				if(range.getFrom()<0) // a<0
					throw new ModelCheckException("The lower bound of " + f + " cannot be less than 0.");
				// a>=0
				if(range.getTo()>=0) { // b>=0
					if(range.getFrom()>range.getTo()) // a>b
						throw new ModelCheckException("The lower bound of " + f + " must be no lager than the upper bound.");
					// 0<=a<=b
					if(range.getFrom()==0 && range.getTo()==0) { // a=0 and b=0
						return NNF(new SpecExp(Operator.NOT, fChild[1]));
					}else { // if b>=0, then !(c1 U a..b c2) ==> !c1 R a..b !c2
						Spec negC1 = NNF(new SpecExp(Operator.NOT, fChild[0]));
						Spec negC2 = NNF(new SpecExp(Operator.NOT, fChild[2]));
						return new SpecExp(Operator.B_RELEASES, negC1, range, negC2);
					}
				}else{ // if b<0, then !(c1 U a..b c2) ==> !c1 R a..b !c2 ==> !c1 R a..a (!c1 R !c2)
					Spec negC1 =  NNF(new SpecExp(Operator.NOT, fChild[0]));
					Spec negC2 =  NNF(new SpecExp(Operator.NOT, fChild[2]));
					Spec negC1_R_negC2 = new SpecExp(Operator.RELEASES, negC1, negC2);
					SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
					return new SpecExp(Operator.B_RELEASES, negC1, newRange, negC1_R_negC2);
				}
			}
			if (fOp == Operator.RELEASES) { // !(c1 R c2) ==> !c1 U !c2
				return new SpecExp(Operator.UNTIL, NNF(new SpecExp(Operator.NOT, fChild[0])), NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			// !(c1 R a..b c2)
			if (fOp == Operator.B_RELEASES) {
				SpecRange range=(SpecRange)fChild[1];
				if(range.getFrom()<0) // a<0
					throw new ModelCheckException("The lower bound of " + f + " cannot be less than 0.");
				// a>=0
				if(range.getTo()>=0) { // b>=0
					if(range.getFrom()>range.getTo()) // a>b
						throw new ModelCheckException("The lower bound of " + f + " must be no lager than the upper bound.");
					// 0<=a<=b
					if(range.getFrom()==0 && range.getTo()==0) { // a=0 and b=0
						return NNF(new SpecExp(Operator.NOT, fChild[1]));
					}else { // if b>=0, then !(c1 R a..b c2) ==> !c1 U a..b !c2
						Spec negC1 = NNF(new SpecExp(Operator.NOT, fChild[0]));
						Spec negC2 = NNF(new SpecExp(Operator.NOT, fChild[2]));
						return new SpecExp(Operator.B_UNTIL, negC1, range, negC2);
					}
				}else{ // if b<0, then !(c1 R a..b c2) ==> !c1 U a..b !c2 ==> !c1 U a..a (!c1 U !c2)
					Spec negC1 =  NNF(new SpecExp(Operator.NOT, fChild[0]));
					Spec negC2 =  NNF(new SpecExp(Operator.NOT, fChild[2]));
					Spec negC1_U_negC2 = new SpecExp(Operator.UNTIL, negC1, negC2);
					SpecRange newRange = new SpecRange(range.getFrom(), range.getFrom());
					return new SpecExp(Operator.B_UNTIL, negC1, newRange, negC1_U_negC2);
				}
			}

			if (fOp == Operator.KNOW) { // !(i KNOW c1) ==> i NKNOW !c1
				return new SpecExp(Operator.NKNOW, fChild[0], NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			if (fOp == Operator.NKNOW) { // !(i NKNOW c1) ==> i KNOW !c1
				return new SpecExp(Operator.KNOW, fChild[0], NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			if (fOp == Operator.SKNOW) { // !(i SKNOW c1) ==> i NSKNOW !c1
				return new SpecExp(Operator.NSKNOW, fChild[0], NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
			if (fOp == Operator.NSKNOW) { // !(i NSKNOW c1) ==> i SKNOW !c1
				return new SpecExp(Operator.SKNOW, fChild[0], NNF(new SpecExp(Operator.NOT, fChild[1])));
			}
		} // end of the case of spec=!f

		throw new ModelCheckException("Failed to construct the Negation Normal Form of " + spec);
	}

	/**
	 * @return The TRUE specification.
	 */
	public static Spec getTrueSpec() {
		Spec []str=Env.loadSpecString("LTLSPEC TRUE ;");
		return str[0];
	}

	/**
	 * @return The FALSE  specification.
	 */
	public static Spec getFalseSpec() {
		Spec []str=Env.loadSpecString("LTLSPEC FALSE ;");
		return str[0];
	}

	public static BDD ATL_canEnforce_allPred(Vector<String> agentList, BDD trans, BDD to) throws ModelCheckAlgException {
		return ATL_canEnforce_kPred(agentList, trans, to, Env.globalPrimeVars(), -1);
	}

	public static BDD ATL_canEnforce_kPred(Vector<String> agentList, BDD trans, BDD to, BDDVarSet primeVars, int k) throws ModelCheckAlgException {
		int counter = 1;
		BDD oldPred, newPred = to;
		do {
			oldPred = newPred;
			newPred = oldPred.or(ATL_canEnforce_pred(agentList, trans, oldPred, primeVars));
			counter++;
		} while (!oldPred.equals(newPred) & (counter != k));
		return newPred;
	}

	// return the states satisfying <agentList> X to
	public static BDD ATL_canEnforce_pred(Vector<String> agentList, BDD trans, BDD to, BDDVarSet primeVars) throws ModelCheckAlgException {
		BDDVarSet allyActs, adversaryActs;
		allyActs = ATL_getAgentActionVars(agentList);
		if(allyActs==null) throw new ModelCheckAlgException("Failed obtainning the action variables of the agents " + agentList);
		adversaryActs = ATL_getAllAgentActionVarsMinus(agentList); // adversaryActs = AllActs - allyActs
		if(adversaryActs==null) throw new ModelCheckAlgException("Failed obtainning the action variables of the adversary agents towards " + agentList);

		BDD p_to = Env.prime(to);
		// return forsome allyActs.forall (AllActs-allyActs).forall V'.(trans(V*AllActs,V')->to(V'))
		return trans.imp(p_to)
				.forAll(primeVars)
				.forAll(adversaryActs)
				.exist(allyActs);
	}

	public static BDD ATL_cannotAvoid_allPred(Vector<String> agentList, BDD trans, BDD to) throws ModelCheckAlgException {
		return ATL_cannotAvoid_kPred(agentList, trans, to, Env.globalPrimeVars(), -1);
	}

	public static BDD ATL_cannotAvoid_kPred(Vector<String> agentList, BDD trans, BDD to, BDDVarSet primeVars, int k) throws ModelCheckAlgException {
		int counter = 1;
		BDD oldPred, newPred = to;
		do {
			oldPred = newPred;
			newPred = oldPred.or(ATL_cannotAvoid_pred(agentList, trans, oldPred, primeVars));
			counter++;
		} while (!oldPred.equals(newPred) & (counter != k));
		return newPred;
	}

	// return the states satisfying [agentList] X to
	public static BDD ATL_cannotAvoid_pred(Vector<String> agentList, BDD trans, BDD to, BDDVarSet primeVars) throws ModelCheckAlgException {
		BDDVarSet allyActs, adversaryActs;
		// [agentList] X to ==> ! <agentList> X !to
		return ATL_canEnforce_pred(agentList, trans, to.not(), primeVars).not();
	}
	
	/**
	 * <p>
	 * Preparing the ATL*K tester.
	 * </p>
	 * 
	 * @throws AlgExceptionI
	 *             If The specification is not an LTL specification.
	 * 
	 * @return Nothing.
	 * 
	 * @see edu.wis.jtlv.lib.AlgI#preAlgorithm()
	 */
	@Override
	public AlgResultI preAlgorithm() throws AlgExceptionI, SMVParseException, ModelCheckException, ModuleException {
		return null;
	}

	/**
	 * <p>
	 * Compose the design with the tester (user's or the one built from the LTL
	 * specification), and check feasible states.
	 * </p>
	 * 
	 * @throws Noting.
	 * 
	 * @return A counter example if the algorithm fails (i.e.
	 *         {@link AlgResultPath}), or a string with
	 *         "VALID" (i.e. {@link AlgResultString}).
	 * 
	 * @see edu.wis.jtlv.lib.AlgI#doAlgorithm()
	 */
	@Override
	public AlgResultI doAlgorithm() throws AlgExceptionI, ModelCheckException, ModuleException, SMVParseException, SpecException {
        System.out.println("model checking ATL*K property: " + property);
        if(!property.isStateSpec()) {
            chkProp = NNF(new SpecExp(Operator.EE,
                    new SpecExp(Operator.NOT, property))); // newp = E !property
        }else{ // the property is a state formula
            chkProp = NNF(new SpecExp(Operator.NOT, property)); // newp = !property
        }
        visibleVars = this.getRelevantVars(getDesign(), chkProp);

        // now chkProp is a state property
        SMVModule chkPropTester=null;
		chkBdd = sat(chkProp, chkPropTester); // after executing sat function, newpTester must be null

		SMVModule design = (SMVModule) getDesign(); // with the composed tester...
        // saving to the previous restriction state
		Vector<BDD> old_ini_restrictions = design.getAllIniRestrictions();

		design.restrictIni(chkBdd);
		BDD feas = design.feasible();
		// the initial_condition seems redundant
		if (!feas.and(design.initial()).and(chkBdd).isZero()) {
/*
			BDD[] example = this.extractWithness(feas, design, visibleVars);
			// returning to the previous restriction state
			design.setAllIniRestrictions(old_ini_restrictions);
			getDesign().decompose(tester);
			return new AlgResultPath(false, example);
*/
            // returning to the previous restriction state
            design.setAllIniRestrictions(old_ini_restrictions);
            return new AlgResultString(false, "*** Property is FALSE ***");
		}else {
		    // else - everything is OK.
            // returning to the previous restriction state
            design.setAllIniRestrictions(old_ini_restrictions);
            return new AlgResultString(true, "*** Property is TRUE ***");
        }
	}

	public static BDDVarSet getRelevantVars(Module m, Spec p) {
		// p.releventVars();
		BDDVarSet vars = Env.getEmptySet();
		if (p != null) {
			vars = vars.id().union(p.releventVars());
		}
		if (m != null) {
			// these are usually too much...
			// vars = vars.id().union(m.moduleUnprimeVars());

			// // removing running
			// ModuleBDDField r = m.getVar("running", false);
			// if (r != null) {
			// BDDVarSet rmR = Env.globalPrimeVarsMinus(r.other().support());
			// BDDVarSet rmPR = Env.globalUnprimeVarsMinus(r.support());
			// vars = Env.intersect(vars, rmR.union(rmPR));
			// }

			// fairness variables are important to illustrate feasibility.
			if (m instanceof ModuleWithWeakFairness) {
				ModuleWithStrongFairness weakM = (ModuleWithStrongFairness) m;
				for (int i = 0; i < weakM.justiceNum(); i++) {
					vars = vars.id().union(weakM.justiceAt(i).support());
				}
			}
			if (m instanceof ModuleWithStrongFairness) {
				ModuleWithStrongFairness strongM = (ModuleWithStrongFairness) m;
				for (int i = 0; i < strongM.compassionNum(); i++) {
					vars = vars.id().union(strongM.pCompassionAt(i).support());
					vars = vars.id().union(strongM.qCompassionAt(i).support());
				}
			}
		}
		return vars;
	}

	/**
	 * <p>
	 * This is essentially algorithm "Witness", from the article: Yonit Ketsen,
	 * Amir Pnueli, Li-on Raviv, Elad Shahar, "Model checking with strong
	 * fairness".<br>
	 * The line numbers are the line numbers of that algorithm. Read the article
	 * for further details.
	 * </p>
	 * 
	 * @param feasible
	 * @param designWithTester
	 * @return
	 */
	private BDD[] extractWithness(BDD feasible, Module designWithTester,
			BDDVarSet relevantVars) {
		BDD temp, fulfill;
		// saving to the previous restriction state
		Vector<BDD> trans_restrictions = designWithTester
				.getAllTransRestrictions();

		// Lines 1-2 are handled by the caller. ("verify")

		// Line 3
		designWithTester.restrictTrans(feasible.and(Env.prime(feasible)));

		// Line 4
		BDD s = feasible.satOne(designWithTester.moduleUnprimeVars(), false);
		// BDD s = feasible.satOne();

		// Lines 5-6
		while (true) {
			temp = designWithTester.allSucc(s).and(
					designWithTester.allPred(s).not());
			if (!temp.isZero())
				s = temp.satOne(designWithTester.moduleUnprimeVars(), false);
			// s = temp.satOne();
			else
				break;
		}
		// Lines 5-6 : better version.
		// temp = tester.allSucc(s).and(tester.allPred(s).not());
		// while (!temp.isZero()){
		// s = temp.satOne(tester.moduleUnprimeVars(), false);
		// temp = tester.allSucc(s).and(tester.allPred(s).not());
		// }

		// Line 7: Compute MSCS containing s.
		BDD feas = designWithTester.allSucc(s);

		// Line 9
		// Find prefix - shortest path from initial state to subgraph feas.
		designWithTester.removeAllTransRestrictions();
		Vector<BDD> prefix = new Vector<BDD>();
		BDD[] path = designWithTester.shortestPath(designWithTester.initial(),
				feas);
		for (int i = 0; i < path.length; i++)
			prefix.add(path[i]);

		// //// Calculate "_period".

		// Line 8: This has to come after line 9, because the way TS.tlv
		// implements restriction.
		designWithTester.restrictTrans(feas.and(Env.prime(feas)));

		// Line 10
		Vector<BDD> period = new Vector<BDD>();
		period.add(prefix.lastElement());

		// Since the last item of the prefix is the first item of
		// the period we don't need to print the last item of the prefix.
		temp = prefix.remove(prefix.size() - 1);

		// Lines 11-13
		if (designWithTester instanceof ModuleWithWeakFairness) {
			ModuleWithWeakFairness weakDes = (ModuleWithWeakFairness) designWithTester;
			for (int i = 0; i < weakDes.justiceNum(); i++) {
				// Line 12, check if j[i] already satisfied
				fulfill = Env.FALSE();
				for (int j = 0; j < period.size(); j++) {
					fulfill = period.elementAt(j).and(weakDes.justiceAt(i))
							.satOne(weakDes.moduleUnprimeVars(), false);
					// fulfill =
					// period.elementAt(j).and(design.justiceAt(i)).satOne();
					if (!fulfill.isZero())
						break;
				}
				// Line 13
				if (fulfill.isZero()) {
					BDD from = period.lastElement();
					BDD to = feas.and(weakDes.justiceAt(i));
					path = weakDes.shortestPath(from, to);
					// eliminate the edge since from is already in period
					for (int j = 1; j < path.length; j++)
						period.add(path[j]);
				}
			}
		}
		// Lines 14-16
		if (designWithTester instanceof ModuleWithStrongFairness) {
			ModuleWithStrongFairness strongDes = (ModuleWithStrongFairness) designWithTester;
			for (int i = 0; i < strongDes.compassionNum(); i++) {
				if (!feas.and(strongDes.pCompassionAt(i)).isZero()) {
					// check if C requirement i is already satisfied
					fulfill = Env.FALSE();
					for (int j = 0; j < period.size(); j++) {
						fulfill = period.elementAt(j).and(
								strongDes.qCompassionAt(i)).satOne(
								strongDes.moduleUnprimeVars(), false);
						// fulfill =
						// period.elementAt(j).and(design.qCompassionAt(i)).satOne();
						if (!fulfill.isZero())
							break;
					}

					if (fulfill.isZero()) {
						BDD from = period.lastElement();
						BDD to = feas.and(strongDes.qCompassionAt(i));
						path = strongDes.shortestPath(from, to);
						// eliminate the edge since from is already in period
						for (int j = 1; j < path.length; j++)
							period.add(path[j]);
					}
				}
			}
		}

		//
		// Close cycle
		//

		// A period of length 1 may be fair, but it might be the case that
		// period[1] is not a successor of itself. The routine path
		// will add nothing. To solve this
		// case we add another state to _period, now it will be OK since
		// period[1] and period[n] will not be equal.

		// Line 17, but modified
		if (!period.firstElement().and(period.lastElement()).isZero()) {
			// The first and last states are already equal, so we do not
			// need to extend them to complete a cycle, unless period is
			// a degenerate case of length = 1, which is not a successor of
			// self.
			if (period.size() == 1) {
				// Check if _period[1] is a successor of itself.
				if (period.firstElement().and(
						designWithTester.succ(period.firstElement())).isZero()) {
					// period[1] is not a successor of itself: Add state to
					// period.
					period
							.add(designWithTester
									.succ(period.firstElement())
									.satOne(
											designWithTester
													.moduleUnprimeVars(), false));
					// period.add(design.succ(period.firstElement()).satOne());

					// Close cycle.
					BDD from = period.lastElement();
					BDD to = period.firstElement();
					path = designWithTester.shortestPath(from, to);
					// eliminate the edges since from and to are already in
					// period
					for (int i = 1; i < path.length - 1; i++)
						period.add(path[i]);
				}
			}
		} else {
			BDD from = period.lastElement();
			BDD to = period.firstElement();
			path = designWithTester.shortestPath(from, to);
			// eliminate the edges since from and to are already in period
			for (int i = 1; i < path.length - 1; i++)
				period.add(path[i]);
		}

		// Yaniv - the last one is for closing the cycle. He won't be printed.
		period.add(period.firstElement());

		// There is no need to have the last state of the period
		// in the counterexample since it already appears in _period[1]
		// if (period.size() > 1)
		// temp = period.remove(period.size() -1);

		// Copy prefix and period.
		prefix.addAll(period);
		BDD[] returned_path = new BDD[prefix.size()];
		prefix.toArray(returned_path);

		// Strip auxiliary variables introduced by tester.
		if (relevantVars != null) {
			BDDVarSet extraVars = Env.globalVarsMinus(relevantVars);
			// BDDVarSet extraVars = Env.globalVarsMinus(relevantVars);
			for (int i = 0; i < returned_path.length; i++) {
				returned_path[i] = returned_path[i].satOne(relevantVars, false)
						.exist(extraVars);
			}
		}

		// returning to the previous restriction state
		designWithTester.setAllTransRestrictions(trans_restrictions);

		return returned_path;
	}

	/**
	 * <p>
	 * If instantiated with a user tester, then returning it to its previous
	 * state.
	 * </p>
	 * 
	 * @throws AlgExceptionI
	 *             Never.
	 * 
	 * @return Nothing.
	 * 
	 * @see edu.wis.jtlv.lib.AlgI#postAlgorithm()
	 */
	@Override
	public AlgResultI postAlgorithm() throws AlgExceptionI {
		// returning the user tester to its previous state.
/*		if (!mk_tester) {
			try {
				tester.setInitial(fBdd);
			} catch (ModuleException e) {
			}
		}*/
		return null;
	}

}
