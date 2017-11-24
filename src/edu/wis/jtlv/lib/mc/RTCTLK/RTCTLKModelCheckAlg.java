package edu.wis.jtlv.lib.mc.RTCTLK;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.schema.SMVAgentInfo;
import edu.wis.jtlv.env.module.Module;
import edu.wis.jtlv.env.module.ModuleWithStrongFairness;
import edu.wis.jtlv.env.module.ModuleWithWeakFairness;
import edu.wis.jtlv.env.spec.*;
import edu.wis.jtlv.lib.AlgExceptionI;
import edu.wis.jtlv.lib.AlgResultI;
import edu.wis.jtlv.lib.AlgResultString;
import edu.wis.jtlv.lib.mc.CTL.CTLModelCheckAlg;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.ui.spriteManager.SpriteManager;

import java.util.*;

public class RTCTLKModelCheckAlg extends CTLModelCheckAlg{
    // variables for counterexamples generation
    private static int createdPathNumber=0; // the number of the paths currently created
    int specExplainToLevel = 1; // 0: trunk and all branches at all levels
                                // 1: trunk only
                                // 2: trunk and the branch at level 2
                                // i: trunk and all branches at the levels not larger than i

    private static int createdEpistemicEdgeNumber=0;

    @Override
    public AlgResultI preAlgorithm() throws AlgExceptionI {
        if (!getProperty().isRealTimeCTLKSpec())
            throw new ModelCheckAlgException("Cannot model check non RTCTLK specification: " + getProperty());
        return null;
    }

    @Override
    public AlgResultI postAlgorithm() throws AlgExceptionI {
        return null;
    }

    public RTCTLKModelCheckAlg(ModuleWithStrongFairness design, Spec property) {
        super(design, property);
    }

    // agentName KNOW p
    // forall(system_global_variables - agentName's visible_variables).((global_reachable_states & fair_states) -> p)
    public BDD know(String agentName, BDD p) throws ModelCheckAlgException {
        if(agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");

        int idx_dot = agentName.indexOf('.');
        if(idx_dot==-1)
            agentName = "main." + agentName;
        else if (!agentName.substring(0, idx_dot).equals("main"))
            throw new ModelCheckAlgException("The agent's name " + agentName + " is illegal.");

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // V - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        BDD res = getFairReachableStates().imp(p).forAll(allInvisVars);

        return res;
    }

    // s |= agentName NKNOW p : agentName consider that it is possible that p holds on s
    // forall(system_global_variables - agentName's visible_variables).((global_reachable_states & fair_states) -> p)
    public BDD nknow(String agentName, BDD p) throws ModelCheckAlgException {
        if(agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");

        int idx_dot = agentName.indexOf('.');
        if(idx_dot==-1)
            agentName = "main." + agentName;
        else if (!agentName.substring(0, idx_dot).equals("main"))
            throw new ModelCheckAlgException("The agent's name " + agentName + " is illegal.");

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // V - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        BDD res = getFairReachableStates().and(p).exist(allInvisVars);

        return res;
    }

    // E[f BU from..to g] under fairness
    public BDD EfBU(int from, int to, BDD f, BDD g) {//****************
        BDD Z, oldZ=null;
        if(isUsingReachableStates()) Z = getFairReachableStates().and(g);
        else Z = getFairStates().and(g);

        for (int i=to-1; i>=from; i--){
            oldZ=Z;
            Z=Z.id().or(f.and(EX(Z.id())));
            if (Z.equals(oldZ)) break;
        }

        for (int i=from-1;i>=0;i--){
            oldZ=Z;
            Z=f.and(EX(Z.id()));
            if (Z.equals(oldZ)) break;
        }
        return Z;
    }

    // A[f BU from..to g] under fairness
    public BDD AfBU(int from, int to, BDD f, BDD g) {//****************
        BDD Z, oldZ=null;
        if(isUsingReachableStates()) Z = getFairReachableStates().and(g);
        else Z = getFairStates().and(g);

        for (int i=to-1; i>=from; i--){
            oldZ=Z;
            Z=Z.id().or(f.and(AX(Z.id())));
            if (Z.equals(oldZ)) break;
        }

        for (int i=from-1;i>=0;i--){
            oldZ=Z;
            Z=f.and(AX(Z.id()));
            if (Z.equals(oldZ)) break;
        }
        return Z;
    }
    /**A[p BU f..t q] is equivalent to
     ! ((EBF 0..(f - 1) !p)
     | EBG f..f ((EBG 0..(t - f) !q)
     | E[!q BU 0..(t - f) (!q & !p)]))
     **/

    // E[BG from..to f] under fairness
    public BDD EfBG(int from, int to, BDD f) {//****************
        BDD Z, oldZ=null;
        if(isUsingReachableStates()) Z = getFairReachableStates().and(f);
        else Z = getFairStates().and(f);

        for (int i=to-1;i>=from;i--){
            oldZ=Z;
            Z=f.and(EX(Z.id()));
            if (Z.equals(oldZ)) break;
        }

        for (int i=from-1;i>=0;i--){
            oldZ=Z;
            Z=EX(Z.id());
            if (Z.equals(oldZ)) break;
        }
        return Z;
    }

    // EBF from..to p under fairness
    public BDD EfBF(int from, int to, BDD f) {//rrrrrrrrr
        return EfBU(from, to, Env.TRUE(), f);
    }

    // ABF from..to p under fairness
    public BDD AfBF(int from, int to, BDD f) {//rrrrrrrrr
        return EfBG(from, to, f.not()).not();
    }

    // ABG from..to p under fairness
    public BDD AfBG(int from, int to, BDD f) {//rrrrrrrrr
        return EfBF(from,to,f.not()).not();
    }

    public BDD satRTCTLK(Spec property) throws ModelCheckAlgException {
        if (property instanceof SpecBDD)
            return ((SpecBDD) property).getVal();
        // else it is SpecExp since this cannot be a Real Time CTL.
        // and it also cannot be a triplet operator.
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();

/*        BDD left, right;
        if(op == Operator.KNOW) {
            left = null;
            right = satRTCTLK(child[1]);
        }else {
            left = satRTCTLK(child[0]);
            right = (op.isBinary()) ? satRTCTLK(child[1]) : null;
        }
*/
        int noo = op.numOfOperands();
        SpecRange range = null;
        SpecAgentIdentifier agentId = null;
        BDD left=null;
        BDD right=null;

        if (noo==1) //EX, EF, EG, AX, AF, AG left
            left=satRTCTLK(child[0]);
        if (noo==2) {//ABF, ABG, EBF, EBG, KNOW
            if (child[0] instanceof SpecRange)
            {   range = (SpecRange) child[0];
                left= satRTCTLK(child[1]);
            }else if(child[0] instanceof SpecAgentIdentifier) { //KNOW
                agentId = (SpecAgentIdentifier) child[0];
                left = satRTCTLK(child[1]);
            }else{
                left=satRTCTLK(child[0]);//AU, EU
                right=satRTCTLK(child[1]);
            }
        }
        if (noo==3)// ABU, EBU, ABG, EBG
        {
            if (child[1] instanceof SpecRange)
            { range = (SpecRange) child[1];
                left=satRTCTLK(child[0]);//xxxxxxxx
                right=satRTCTLK(child[2]);//xxxxxxxxx
            }
        }

        // propositional
        if (op == Operator.NOT)
            return left.not();
        if (op == Operator.AND)
            return left.and(right);
        if (op == Operator.OR)
            return left.or(right);
        if (op == Operator.XOR)
            return left.xor(right);
        if (op == Operator.XNOR)
            return left.xor(right).not();
        if (op == Operator.IFF)
            return left.biimp(right);
        if (op == Operator.IMPLIES)
            return left.imp(right);

        // unbounded CTL temporal
        if (op == Operator.EX)
            return EfX(left);
        if (op == Operator.AX)
            return AfX(left);
        if (op == Operator.EF)
            return EfF(left);
        if (op == Operator.AF)
            return AfF(left);
        if (op == Operator.EG)
            return EfG(left);
        if (op == Operator.AG)
            return AfG(left);
        if (op == Operator.AU)
            return AfU(left, right);
        if (op == Operator.EU)
            return EfU(left, right);

        // bounded CTL temporal
        if (op == Operator.EBU)
            return EfBU(range.getFrom(), range.getTo(), left, right);//EfBU(int from, int to, BDD p, BDD q)
        if (op == Operator.ABU)//AfBU(int from, int to, BDD p, BDD q)
            return AfBU(range.getFrom(), range.getTo(), left, right);
        if (op == Operator.EBF)//EfBF(int from, int to, BDD p)
            return EfBF(range.getFrom(), range.getTo(), left);
        if (op == Operator.ABF)//(int from, int to, BDD p)
            return AfBF(range.getFrom(), range.getTo(), left);
        if (op == Operator.EBG)//(int from, int to, BDD p)
            return EfBG(range.getFrom(), range.getTo(), left);
        if (op == Operator.ABG)//AfBG(int from, int to, BDD p)
            return AfBG(range.getFrom(), range.getTo(), left);

        // epistemic
        if (op == Operator.KNOW) {
            String agentName = agentId.toString();
            return know(agentName, left);
        }

        // something is wrong.
        throw new ModelCheckAlgException(
                "Cannot identify root operator for sub specification: " + property);
    }

    /*
    // delete the redundant negations in "property"
    // return true if there exists some negations were deleted, return false otherwise.
    public boolean del_redundant_negation(Spec property) {
        if (property instanceof SpecBDD)
            return false;
        // else it is SpecExp since this cannot be a Real Time CTL.
        // and it also cannot be a triplet operator.
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();

        BDD left, right;
        if(op == Operator.KNOW) {
            left = null;
            right = satRTCTLK(child[1]);
        }else {
            left = satRTCTLK(child[0]);
            right = (op.isBinary()) ? satRTCTLK(child[1]) : null;
        }

        // propositional
        if (op == Operator.NOT) {
            SpecExp leftExp = (SpecExp) child[0];
            if(leftExp.getOperator() == Operator.NOT) {
                Spec leftLeft = leftExp.getChildren()[0];
                property = leftLeft;
                return true;
            }
            return false;
        }
        if (op == Operator.AND)
            return left.and(right);
        if (op == Operator.OR)
            return left.or(right);
        if (op == Operator.XOR)
            return left.xor(right);
        if (op == Operator.XNOR)
            return left.xor(right).not();
        if (op == Operator.IFF)
            return left.biimp(right);
        if (op == Operator.IMPLIES)
            return left.imp(right);

        // unbounded CTL temporal
        if (op == Operator.EX)
            return EfX(left);
        if (op == Operator.AX)
            return AfX(left);
        if (op == Operator.EF)
            return EfF(left);
        if (op == Operator.AF)
            return AfF(left);
        if (op == Operator.EG)
            return EfG(left);
        if (op == Operator.AG)
            return AfG(left);
        if (op == Operator.AU)
            return AfU(left, right);
        if (op == Operator.EU)
            return EfU(left, right);

        // bounded CTL temporal

        // epistemic
        if (op == Operator.KNOW) {
            String agentName;
            agentName = child[0].toString();
            return know(agentName, right);
        }

        // something is wrong.
        throw new ModelCheckAlgException(
                "Cannot identify root operator for sub specification: " + property);


    }
*/

/*    // return the negation normal form of "property"
    public Spec nnf(Spec property) {
        if (property instanceof SpecBDD)
            return property;
        // else it is SpecExp since this cannot be a Real Time CTL.
        // and it also cannot be a triplet operator.
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();



        BDD left, right;
        if(op == Operator.KNOW) {
            left = null;
            right = satRTCTLK(child[1]);
        }else {
            left = satRTCTLK(child[0]);
            right = (op.isBinary()) ? satRTCTLK(child[1]) : null;
        }

        // propositional
        if (op == Operator.NOT)
            return left.not();
        if (op == Operator.AND)
            return left.and(right);
        if (op == Operator.OR)
            return left.or(right);
        if (op == Operator.XOR)
            return left.xor(right);
        if (op == Operator.XNOR)
            return left.xor(right).not();
        if (op == Operator.IFF)
            return left.biimp(right);
        if (op == Operator.IMPLIES)
            return left.imp(right);

        // unbounded CTL temporal
        if (op == Operator.EX)
            return EfX(left);
        if (op == Operator.AX)
            return AfX(left);
        if (op == Operator.EF)
            return EfF(left);
        if (op == Operator.AF)
            return AfF(left);
        if (op == Operator.EG)
            return EfG(left);
        if (op == Operator.AG)
            return AfG(left);
        if (op == Operator.AU)
            return AfU(left, right);
        if (op == Operator.EU)
            return EfU(left, right);

        // bounded CTL temporal

        // epistemic
        if (op == Operator.KNOW) {
            String agentName;
            agentName = child[0].toString();
            return know(agentName, right);
        }

        // something is wrong.
        throw new ModelCheckAlgException(
                "Cannot identify root operator for sub specification: " + property);
    }
*/


    @Override
    public AlgResultI doAlgorithm() throws AlgExceptionI {
        Spec origSpec = getProperty();
        System.out.println("model checking RTCTLK: " + origSpec);
        if (origSpec == null)
            return new AlgResultString(false, "Cannot model check a null specification.");
        if (!origSpec.isRealTimeCTLKSpec())
            return new AlgResultString("Cannot model check non RTCTLK specification: " + origSpec);

        //setFairStates(Env.TRUE());

        // could throw an exception...
        BDD satStates = satRTCTLK(origSpec);
        BDD fairInitStates = getDesign().initial().and(getFairStates());
        BDD fairInit_unSat = fairInitStates.and(satStates.not());
        if(fairInit_unSat.isZero()){
            return new AlgResultString(true, "*** Property is VALID ***");
        }else{
            GraphExplainRTCTLK G = new GraphExplainRTCTLK("A counterexample of " + simplifySpecString(origSpec.toString(),false), this);
            G.addAttribute("ui.label",G.getId());

            boolean ok = mainExplainRTCTLK(origSpec, fairInit_unSat, G);

            String returned_msg = "";
            if(ok) {
                returned_msg = "*** Property is NOT VALID and its counterexample is as follows ***\n ";
                new ViewerExplainRTCTLK(G);
            }else{
                returned_msg = "*** Property is NOT VALID ***\n ";
            }
            return new AlgResultString(false, returned_msg);
        }

    }

    private BDDVarSet getRelevantVars(Module m, Spec p) {
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

    public String simplifySpecString(String spec, boolean delTrue) {
        String res = spec.replaceAll("main.", "");
        if(delTrue){
            res = res.replace("#[TRUE], \n", "");
            res = res.replace("#[TRUE]", "");
        }
        return res;
    }

    public boolean mainExplainRTCTLK(
        Spec spec,                          // the spec. under checked
        BDD FairInitStates_unsat_spec,       // the set of fair initial states that does not satisfy spec
        GraphExplainRTCTLK G                 // the graph that explains spec
    ) throws ModelCheckAlgException {
        createdPathNumber = 0;

        //create a new node as the first state of the counterexample
        BDD fromState = FairInitStates_unsat_spec.satOne(getDesign().moduleUnprimeVars(), false);
        Node n = G.addStateNode( 1, 0, fromState, null); // create the first state 1.0 of G
        n.setAttribute("ui.class", "initialState");
        boolean ok = explainRTCTLK(false, spec, G, 1, 0);

        return true;
    }

    //-------------------------------------------------------------------------------------------------------
    // generating a witness/counterexample of spec from the created state pathNo.stateNo
    //-------------------------------------------------------------------------------------------------------
    public boolean explainRTCTLK(
            boolean getWitness,     // getWitness=true and pathNo.stateNo|=spec: get witness of spec,
                                    // getWitness=false and pathNo.stateNo=/=spec: get counterexample of spec
            Spec spec,              // the spec. under checked
            GraphExplainRTCTLK G,   // the graph that explains spec
            int pathNo,             // pathNo is the No. of the current path
            int stateNo             // stateNo is the No. of the current state
    ) throws ModelCheckAlgException {
        String stateID = pathNo+"."+stateNo;
        BDD fromState = G.getNodeBDD(stateID);
        if(fromState==null || fromState.isZero()) return false;

        if (spec instanceof SpecBDD) { // prop is an assertion
            //BDD specVal = ((SpecBDD) spec).getVal();
            if(getWitness) // generating a witness for an assertion
                G.addNodeSatSpec(stateID, spec, false);
            else // generating a counterexample for an assertion
                G.addNodeSatSpec(stateID, new SpecExp(Operator.NOT, spec), false);
            return true;
        }

        SpecExp origPropExp = (SpecExp) spec;
        Operator op = origPropExp.getOperator();
        Spec[] child = origPropExp.getChildren();

        //----------- erase operators IMPLIES, IFF, XOR, XNOR ----------
        if (op == Operator.IMPLIES) { // L->R == !L | R
            SpecExp newSpec = new SpecExp(  Operator.OR,
                    new SpecExp(Operator.NOT, child[0]),
                    child[1]  );
            return explainRTCTLK(getWitness, newSpec, G, pathNo, stateNo);
        }
        if (op == Operator.IFF) { // L<->R == (L & R) | (!L & !R)
            SpecExp newSpec = new SpecExp(  Operator.OR,
                    new SpecExp(Operator.AND, child[0], child[1]),
                    new SpecExp(Operator.AND,
                            new SpecExp(Operator.NOT, child[0]),
                            new SpecExp(Operator.NOT, child[1]))  );
            return explainRTCTLK(getWitness, newSpec, G, pathNo, stateNo);
        }
        if(op == Operator.XOR) {
            SpecExp newSpec = new SpecExp(Operator.NOT, new SpecExp(Operator.IFF, child[0], child[1]));
            return explainRTCTLK(getWitness, newSpec, G, pathNo, stateNo);
        }
        if(op == Operator.XNOR) {
            SpecExp newSpec = new SpecExp(Operator.NOT, new SpecExp(Operator.XOR, child[0], child[1]));
            return explainRTCTLK(getWitness, newSpec, G, pathNo, stateNo);
        }

        if(getWitness) { // getWitness=true: generating a witness of spec
            if (op == Operator.NOT) {
                if(!(child[0] instanceof SpecBDD)) {
                    SpecExp leftExp = (SpecExp) child[0];
                    if(leftExp.getOperator() == Operator.KNOW) {
                        Spec knowChild[] = leftExp.getChildren();
                        SpecAgentIdentifier agentId = (SpecAgentIdentifier) knowChild[0];
                        return witnessNKnow(agentId.toString(), new SpecExp(Operator.NOT, knowChild[1]), G, pathNo, stateNo);
                    }
                }
                return explainRTCTLK(!getWitness, child[0], G, pathNo, stateNo);
            }
            if (op == Operator.AND) {
                boolean ret1=true, ret2=true;
                ret1 = explainRTCTLK(getWitness, child[0], G, pathNo, stateNo);
                ret2 = explainRTCTLK(getWitness, child[1], G, pathNo, stateNo);
                return ret1 && ret2;
            }
            if (op == Operator.OR) {
                boolean ret1=true, ret2=true;
                if(child[0] instanceof SpecBDD) {
                    //BDD leftVal = ((SpecBDD) child[0]).getVal();
                    G.addNodeSatSpec(stateID, child[0], true); //leftVal.toString());
                    return true;
                }
                if(child[1] instanceof SpecBDD) {
                    //BDD rightVal = ((SpecBDD) child[1]).getVal();
                    G.addNodeSatSpec(stateID, child[1], true); //rightVal.toString());
                    return true;
                }
                BDD satLeft = satRTCTLK(child[0]);
                if(fromState.imp(satLeft).isOne())
                    return explainRTCTLK(getWitness, child[0], G, pathNo, stateNo);
                else
                    return explainRTCTLK(getWitness, child[1], G, pathNo, stateNo);
            }
            if(op==Operator.AX || op==Operator.AF || op==Operator.AU || op==Operator.AG ||
                    op==Operator.ABF || op==Operator.ABU || op==Operator.ABG) {
                G.addNodeSatSpec(stateID, spec, false);
                return true;
            }
            if(op==Operator.EX) {
                return witnessEX(spec, G, pathNo, stateNo);
            }
            if(op==Operator.EU) {
                witnessEU(spec, G, pathNo, stateNo);
            }
            if(op==Operator.EF) {
                SpecBDD trueSpec = new SpecBDD(Env.TRUE());
                witnessEU(new SpecExp(Operator.EU, trueSpec, child[0]), G, pathNo, stateNo);
            }
            if(op==Operator.EG) {
                witnessEG(spec, G, pathNo, stateNo);
            }

        }else{ // getWitness=false: generating a counterexample of spec
            if (op == Operator.NOT) {
                return explainRTCTLK(!getWitness, child[0], G, pathNo, stateNo);
            }
            if (op == Operator.OR) {
                boolean ret1=true, ret2=true;
                ret1 = explainRTCTLK(!getWitness, new SpecExp(Operator.NOT, child[0]), G, pathNo, stateNo);
                ret2 = explainRTCTLK(!getWitness, new SpecExp(Operator.NOT, child[1]), G, pathNo, stateNo);
                return ret1 && ret2;
            }
            if (op == Operator.AND) {
                boolean ret1=true, ret2=true;
                if(child[0] instanceof SpecBDD) {
                    //BDD not_leftVal = ((SpecBDD) child[0]).getVal().not();
                    G.addNodeSatSpec(stateID, new SpecExp(Operator.NOT, child[0]), false); //not_leftVal.toString());
                    return true;
                }
                if(child[1] instanceof SpecBDD) {
                    //BDD not_rightVal = ((SpecBDD) child[1]).getVal().not();
                    G.addNodeSatSpec(stateID, new SpecExp(Operator.NOT, child[1]), false); //not_rightVal.toString());
                    return true;
                }
                BDD not_satLeft = getFairReachableStates().and(satRTCTLK(child[0]).not()); // fairReach - satLeft
                if(fromState.imp(not_satLeft).isOne())
                    return explainRTCTLK(!getWitness, new SpecExp(Operator.NOT, child[0]), G, pathNo, stateNo);
                else
                    return explainRTCTLK(!getWitness, new SpecExp(Operator.NOT, child[1]), G, pathNo, stateNo);
            }
            if(op==Operator.EX || op==Operator.EF || op==Operator.EU || op==Operator.EG ||
                    op==Operator.EBF || op==Operator.EBU || op==Operator.EBG) {
                G.addNodeSatSpec(stateID, new SpecExp(Operator.NOT, spec), false);
                return true;
            }
            if(op==Operator.AX) {
                SpecExp neg_spec = new SpecExp(Operator.EX,
                        new SpecExp(Operator.NOT, child[0]));
                return witnessEX(neg_spec, G, pathNo, stateNo);
            }
            if(op==Operator.AU) { // CE(s, A[f U g]) = WIT(s, E[!g U (!f & !g)] \/ EG(!g))
                SpecExp EGng = new SpecExp(Operator.EG,
                        new SpecExp(Operator.NOT, child[1]));
                SpecExp EUspec = new SpecExp(Operator.EU,
                        new SpecExp(Operator.NOT,child[1]),
                        new SpecExp(Operator.NOT,
                                new SpecExp(Operator.OR, child[0], child[1])));
                return explainRTCTLK(!getWitness, new SpecExp(Operator.OR, EGng, EUspec), G, pathNo, stateNo);
            }
            if(op==Operator.AF) {
                return explainRTCTLK(!getWitness, new SpecExp(Operator.EG, new SpecExp(Operator.NOT, child[0])), G, pathNo, stateNo);
            }
            if(op==Operator.AG) {
                return explainRTCTLK(!getWitness, new SpecExp(Operator.EF, new SpecExp(Operator.NOT, child[0])), G, pathNo, stateNo);
            }
            if(op==Operator.KNOW) {
                return explainRTCTLK(!getWitness, new SpecExp(Operator.NOT, spec), G, pathNo, stateNo);
            }
        }
        return true;
    }

    // generating a witness of pathNo.stateNo |= spec, where spec = EX child[0]
    public boolean witnessEX(
            Spec spec,              // the spec. under checked
            GraphExplainRTCTLK G,   // the graph that explains spec
            int pathNo,             // pathNo is the No. of the current path
            int stateNo             // stateNo is the No. of the current state
    ) throws ModelCheckAlgException {
        String stateID = pathNo+"."+stateNo;
        BDD fromState = G.getNodeBDD(stateID);
        if(fromState==null || fromState.isZero()) return false;

        SpecExp origPropExp = (SpecExp) spec;
        Operator op = origPropExp.getOperator();
        Spec[] child = origPropExp.getChildren();

        if (spec instanceof SpecBDD) return false;
        if (op != Operator.EX) return false;

        BDD satLeft = satRTCTLK(child[0]);
        BDD nextState = getDesign().succ(fromState).and(satLeft).and(getFairReachableStates())
                .satOne(getDesign().moduleUnprimeVars(), false);
        if(nextState.isZero()) return false;

        createdPathNumber++;
        String nextStateId = createdPathNumber + "." + (stateNo + 1);
        G.addStateNode(createdPathNumber, stateNo+1, nextState, child[0]);
        Edge e = G.addEdge("Path #" + createdPathNumber + " |= X " + child[0], stateID, nextStateId, true);
        e.addAttribute("ui.label", e.getId());

        return true;
    }

    // generating a witness of pathNo.stateNo |= spec, where spec = E[ child[0] U child[1]]
    public boolean witnessEU(
            Spec spec,              // the spec. under checked
            GraphExplainRTCTLK G,   // the graph that explains spec
            int pathNo,             // pathNo is the No. of the current path
            int stateNo             // stateNo is the No. of the current state
    ) throws ModelCheckAlgException {
        String stateID = pathNo + "." + stateNo;
        BDD fromState = G.getNodeBDD(stateID);
        if (fromState == null || fromState.isZero()) return false;

        SpecExp origPropExp = (SpecExp) spec;
        Operator op = origPropExp.getOperator();
        Spec[] child = origPropExp.getChildren();
        ModuleWithStrongFairness design = getDesign();

        if (spec instanceof SpecBDD) return false;
        if (op != Operator.EU) return false;

        BDD f = satRTCTLK(child[0]);
        BDD g = satRTCTLK(child[1]);

        Vector<BDD> Z = new Vector<BDD>();
        Z.add(g.id().and(getFairStates()));
        if (Z.get(0).isZero()) return false;
        if (fromState.imp(Z.get(0)).isOne()) { // fromState |= g & fair, in this case don't need construct path
            G.addNodeSatSpec(stateID, child[1], true);
            return true;
        }

        // the path has at least 2 states, including fromState
        int i = 0, n = -1;
        while (true)
        {
            BDD predZ = f.and(design.pred(Z.get(i))); // predZ is the frontier of Z[i]
            if(fromState.imp(predZ).isOne()) { // fromState in predZ
                n = i;  // n is the nextZ of fromState
                break;
            }
            // fromState not in predZ
            Z.add(predZ);
            i++;
        }

        BDD[] path = new BDD[n+2];
        path[0] = fromState;
        G.addNodeSatSpec(stateID, child[0], true);

        createdPathNumber++;

        String nid1, nid2;
        Edge e;
        for(i=1; i<=n+1; i++) {
            path[i] = design.succ(path[i - 1]).and(Z.get(n + 1 - i)).satOne(getDesign().moduleUnprimeVars(), false);

            if(i<=n) G.addStateNode(createdPathNumber, i, path[i], child[0]);
            else G.addStateNode(createdPathNumber, i, path[i], child[1]);

            if(i==1) {
                nid1=stateID; nid2=createdPathNumber+".1";
                e = G.addEdge("Path #" + createdPathNumber + " |= " + simplifySpecString(child[0].toString(),true) + " U " +
                        simplifySpecString(child[1].toString(),true), nid1, nid2, true);
                e.addAttribute("ui.label", e.getId());
            }else{
                nid1=createdPathNumber+"."+(i-1); nid2=createdPathNumber+"."+i;
                e = G.addEdge(nid1+"->"+nid2, nid1, nid2, true);
                //e.addAttribute("ui.label", e.getId());
            }

        }


        return true;
    }

    /**
     * <p>
     * This is essentially a variant of the algorithm "Witness", from the article: Yonit Ketsen,
     * Amir Pnueli, Li-on Raviv, Elad Shahar, "Model checking with strong
     * fairness".<br>
     * The line numbers are the line numbers of that algorithm. Read the article
     * for further details.
     * </p>
     *
     */
    public boolean witnessEG(
            Spec spec,              // the spec. under checked
            GraphExplainRTCTLK G,   // the graph that explains spec
            int pathNo,             // pathNo is the No. of the current path
            int stateNo             // stateNo is the No. of the current state
    ) throws ModelCheckAlgException {
        String stateID = pathNo + "." + stateNo;
        BDD fromState = G.getNodeBDD(stateID);
        if (fromState == null || fromState.isZero()) return false;

        SpecExp origPropExp = (SpecExp) spec;
        Operator op = origPropExp.getOperator();
        Spec[] child = origPropExp.getChildren();
        ModuleWithStrongFairness design = getDesign();

        if (spec instanceof SpecBDD) return false;
        if (op != Operator.EG) return false;

        BDD f = satRTCTLK(child[0]); // spec = EG f
        if(f==null) return false;
        BDD EGf = EfG(f);
        if(EGf.isZero()) return false;
        BDD feasible = EGf.and(getReachableStates()); //ce_fair_g(f).and(getReachableStates()); // feasible is the set of states satisfying f & fair
        if(fromState.and(feasible).isZero()) // fromState not in feasible
            return false;


        BDD temp, fulfill;
        // saving to the previous restriction state
        Vector<BDD> trans_restrictions = design.getAllTransRestrictions();

        // Lines 1-2 are handled by the caller. ("verify")

        // Line 3
        design.restrictTrans(feasible.and(Env.prime(feasible)));

        // Line 4
        // BDD s = feasible.satOne(design.moduleUnprimeVars(), false); // commented by LXY
        BDD s = fromState; // LXY: compute feas as the set of states in MSCS's from fromState
        // BDD s = feasible.satOne();

        // Lines 5-6
        while (true) {
            temp = design.allSucc(s).and(
                    design.allPred(s).not());
            if (!temp.isZero())
                s = temp.satOne(design.moduleUnprimeVars(), false);
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
        BDD feas = design.allSucc(s); // LXY: feas is the set of states in MSCS's

        // Line 9
        // Find prefix - shortest path from initial state to subgraph feas.
        // design.removeAllTransRestrictions();  // LXY: keep each transition is restricted by feasible*feasible'
        Vector<BDD> prefix = new Vector<BDD>();
        BDD[] path = design.shortestPath(fromState, feas);
        String prefix_last_nodeId;
        String pred_nid, cur_nid;

        Edge e;
        boolean NotYetCreateEdge = true;
        createdPathNumber++;
        if (path.length >= 1) prefix.add(path[0]);
        if(path.length<=1) { // only include one state: fromState
            G.addNodeSatSpec(stateID, child[0], true);
            prefix_last_nodeId=stateID;
        }else { //path.length > 1
            pred_nid = stateID;
            G.addNodeSatSpec(stateID, child[0], true);
            for (int i = 1; i < path.length; i++) {
                cur_nid = createdPathNumber + "." + i;
                G.addStateNode(createdPathNumber, i, path[i], child[0]);

                if (NotYetCreateEdge) {
                    e = G.addEdge("Path #" + createdPathNumber + " |= G " + simplifySpecString(child[0].toString(),true), pred_nid, cur_nid, true);
                    e.addAttribute("ui.label", e.getId());
                    NotYetCreateEdge = false;
                } else {
                    e = G.addEdge(pred_nid + "->" + cur_nid, pred_nid, cur_nid, true);
                }

                pred_nid = cur_nid;

                prefix.add(path[i]);
            }
            prefix_last_nodeId = pred_nid; // prefix_last_nodeId is the first state in period
        }

        // //// Calculate "_period".

        // Line 8: This has to come after line 9, because the way TS.tlv
        // implements restriction.
        design.restrictTrans(feas.and(Env.prime(feas)));

        // Line 10
        Vector<BDD> period = new Vector<BDD>();
        period.add(prefix.lastElement());

        // Since the last item of the prefix is the first item of
        // the period we don't need to print the last item of the prefix.
        temp = prefix.remove(prefix.size() - 1);

        // Lines 11-13
        if (design instanceof ModuleWithWeakFairness) {
            ModuleWithWeakFairness weakDes = (ModuleWithWeakFairness) design;
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
        if (design instanceof ModuleWithStrongFairness) {
            ModuleWithStrongFairness strongDes = (ModuleWithStrongFairness) design;
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
                        design.succ(period.firstElement())).isZero()) {
                    // period[1] is not a successor of itself: Add state to
                    // period.
                    period
                            .add(design
                                    .succ(period.firstElement())
                                    .satOne(
                                            design
                                                    .moduleUnprimeVars(), false));
                    // period.add(design.succ(period.firstElement()).satOne());

                    // Close cycle.
                    BDD from = period.lastElement();
                    BDD to = period.firstElement();
                    path = design.shortestPath(from, to);
                    // eliminate the edges since from and to are already in
                    // period
                    for (int i = 1; i < path.length - 1; i++)
                        period.add(path[i]);
                }
            }
        } else {
            BDD from = period.lastElement();
            BDD to = period.firstElement();
            path = design.shortestPath(from, to);
            // eliminate the edges since from and to are already in period
            for (int i = 1; i < path.length - 1; i++)
                period.add(path[i]);
        }

        // LXY: Now period = { period[0]=prefix_last_node, ..., period[length-1]}, and
        // there is a transition from period[length-1] to period[0]
        pred_nid=prefix_last_nodeId;
        int state_idx = prefix.size()+1;
        for (int i=1; i<=period.size()-1; i++) {
            cur_nid=createdPathNumber+"."+state_idx;
            G.addStateNode(createdPathNumber,  state_idx, period.get(i), child[0]);

            if (NotYetCreateEdge) {
                e = G.addEdge("Path #" + createdPathNumber + " |= G " + simplifySpecString(child[0].toString(),true), pred_nid, cur_nid, true);
                e.addAttribute("ui.label", e.getId());
                NotYetCreateEdge=false;
            } else {
                G.addEdge(pred_nid+"->"+cur_nid, pred_nid, cur_nid, true);
            }

            state_idx++;
            pred_nid=cur_nid;
        }
        if(NotYetCreateEdge) { // period only has period[0], i.e., prefix_last_node
            e = G.addEdge("Path #" + createdPathNumber + " |= G " + simplifySpecString(child[0].toString(),true), pred_nid, prefix_last_nodeId, true);
            e.addAttribute("ui.label", e.getId());
            NotYetCreateEdge=false;
        }else
            G.addEdge(pred_nid+"->"+prefix_last_nodeId, pred_nid, prefix_last_nodeId, true); // close period


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

/*
        // Strip auxiliary variables introduced by tester.
        if (relevantVars != null) {
            BDDVarSet extraVars = Env.globalVarsMinus(relevantVars);
            // BDDVarSet extraVars = Env.globalVarsMinus(relevantVars);
            for (int i = 0; i < returned_path.length; i++) {
                returned_path[i] = returned_path[i].satOne(relevantVars, false)
                        .exist(extraVars);
            }
        }
*/

        // returning to the previous restriction state
        design.setAllTransRestrictions(trans_restrictions);

        // the construction of path done
        //return returned_path;


        return true;
    }

    // generating a witness for pathNo.stateNo |= agentId NKnow spec
    public boolean witnessNKnow(
            String agentId,         // the name of the agent
            Spec spec,              // the spec. under checked
            GraphExplainRTCTLK G,   // the graph that explains spec
            int pathNo,             // pathNo is the No. of the current path
            int stateNo             // stateNo is the No. of the current state
    ) throws ModelCheckAlgException {
        String stateId = pathNo+"."+stateNo;
        BDD fromState = G.getNodeBDD(stateId);
        if(fromState==null || fromState.isZero()) return false;

        BDD specStates = satRTCTLK(spec).and(getFairReachableStates());
        if(specStates==null || specStates.isZero()) return false;

        if(fromState.imp(specStates).isOne()) { // fromState in specStates, don't need to extend the witness
            G.addNodeSatSpec(stateId, spec, true);
            return true;
        }

        // there exists another state s', agentId consider possible from fromState, satisfies spec
        // (1) generating a path to s', the starting state is one of the states in INIT or the current states within G
        // (2) create an epistemic edge between stateId and s'

        // get agentId's invisible variables
        int idx_dot = agentId.indexOf('.');
        if(idx_dot==-1)
            agentId = "main." + agentId;
        else if (!agentId.substring(0, idx_dot).equals("main"))
            throw new ModelCheckAlgException("The agent's name " + agentId + " is illegal.");
        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentId);
        if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentId + ".");
        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        // nknowStates_neg_s0 is the set of states agentId consider possible from s0,
        // on these states agentId consider spec can be true
        BDD nknowStates_neg_s0 = nknow(agentId, specStates);
        nknowStates_neg_s0 = nknowStates_neg_s0.id().and(fromState.exist(allInvisVars)).and(specStates).and(getFairReachableStates()).and(fromState.not());
        if(nknowStates_neg_s0.isZero()) return false;

        //(1)
        //(1.1) collect all states within G into startStates
        BDD startStates = Env.FALSE();
        for (Node n : G) {
            BDD state = n.getAttribute("BDD");
            startStates = startStates.id().or(state);
        }
        startStates = startStates.id().or(getDesign().initial()).and(getFairReachableStates());
        if(startStates==null || startStates.isZero()) return false;

        //(1.2) generating the path
        BDD[] path = getDesign().shortestPath(startStates, nknowStates_neg_s0);
        if(path.length<=0) return false;
        String fromNodeId = null;
        for (Node n : G) {
            BDD bdd = n.getAttribute("BDD");
            if(path[0].equals(bdd)) {
                fromNodeId=n.getId();
                break;
            }
        }

        createdPathNumber++;
        if(fromNodeId==null) { // the starting state path[0] is not in G and must be another initial state
            Node n = G.addStateNode(createdPathNumber, 0, path[0], null);
            n.setAttribute("ui.class", "initialState");
            fromNodeId = createdPathNumber + ".0";
        }
        // generating the path: fromNodeId(in G) -> path[1] -> ... -> path[length-1]
        String pred_nodeId = fromNodeId, cur_nodeId;
        for(int i=1; i<path.length; i++) {
            if(i==path.length-1) { // path[length-1] is the epistemic reachability state from stateId
                Node n = G.addStateNode(createdPathNumber, i, path[i], spec);
                n.setAttribute("ui.class", "epistemicState");
            }else
                G.addStateNode(createdPathNumber, i, path[i], null);

            cur_nodeId = createdPathNumber+"."+i;
            G.addEdge(pred_nodeId+"->"+cur_nodeId, pred_nodeId, cur_nodeId, true);

            pred_nodeId = cur_nodeId;
        }

        //(2)
        Edge e = G.addEdge("Agent " + simplifySpecString(agentId,true) + " [" + (++createdEpistemicEdgeNumber) + "]", stateId, pred_nodeId, false);
        e.addAttribute("ui.label", "Agent " + simplifySpecString(agentId,true));
        e.setAttribute("ui.class", "epistemicEdge");

        /*


        BDD nextState = getDesign().succ(fromState).and(satLeft).and(getFairReachableStates())
                .satOne(getDesign().moduleUnprimeVars(), false);
        if(nextState.isZero()) return false;

        createdPathNumber++;
        String nextStateId = createdPathNumber + "." + (stateNo + 1);
        G.addStateNode(createdPathNumber, stateNo+1, nextState, child[0]);
        Edge e = G.addEdge("Path #" + createdPathNumber + " |= X " + child[0], stateId, nextStateId, true);
        e.addAttribute("ui.label", e.getId());
*/
        return true;
    }


    public boolean explainOneGraphNode(GraphExplainRTCTLK G, String nodeId) throws ModelCheckAlgException {
        Node n = G.getNode(nodeId); if(n==null) return false;
        Queue<Spec> Q = n.getAttribute("queue_satSpec"); if(Q==null) return false;
        int pathNo=n.getAttribute("pathNo");
        int stateNo=n.getAttribute("stateNo");

        boolean ret=true;
        while(!Q.isEmpty()) {
            Spec spec = Q.poll();
            if(spec!=null)
                ret = explainRTCTLK(true, spec, G, pathNo, stateNo);
            ret = ret && ret;
        }

        return ret;
    }


    private BDD[] witness(Spec property) throws ModelCheckAlgException {
        //System.out.println("Spec  "+property+"initial  "+property);
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        if(op==Operator.EX|op==Operator.EF|op==Operator.EG|op==Operator.EU|op==Operator.EBF|op==Operator.EBG|op==Operator.EBU) return null;
        Spec[] child = propExp.getChildren();
        int noo = op.numOfOperands();
        SpecRange range = null;
        BDD left=null;
        BDD right=null;
        if (noo==1) //EX, EF, EG, AX, AF,AG left
            left=satCTL(child[0]);
        if (noo==2) {//ABF, ABG, EBF, EBG  left or right
            if (child[0] instanceof SpecRange)
            { range = (SpecRange) child[0];
                left=satCTL(child[1]);}//xxxxxxxx
            else
            {   left=satCTL(child[0]);//AU GU
                right=satCTL(child[1]);
            }
        }
        if (noo==3)// ABU, EBU
        {
            if (child[1] instanceof SpecRange)
            { range = (SpecRange) child[1];
                left=satCTL(child[0]);
                right=satCTL(child[2]);
            }
        }
        //设置initial()为起点
        BDD s=getDesign().initial().and(getDesign().feasible().satOne(getDesign().moduleUnprimeVars(),false));
        switch (op) {
            /** Except for NOT、FINALLY、GLOBALLY、HISTORICALLY、NEXT、NOT_PREV_NOT、ONCE、PREV、B_FINALLY、B_GLOBALLY
             AND、OR、XOR、XNOR、IFF、IMPLIES、RELEASES、SINCE、TRIGGERED、UNTIL、B_UNTIL、B_UNTIL0 **/
            case AX:
                return LS_witnessEX(s, left.not());
            case AG:
                return LS_witnessEU(s,Env.TRUE(),left.not());
            case AF:
                return LS_witnessEG(s,left.not());
            case AU:
                BDD[] EU= LS_witnessEU(s,right.not(),left.not().and(right.not()));
                if (EU==null){
                    BDD[] EG= LS_witnessEG(s,right.not());
                    return EG;}
                return EU;
            case ABF:
                return witnessEBG(s,range.getFrom(), range.getTo(),left.not());
            case ABG:
                return witnessEBU(s,range.getFrom(), range.getTo(),Env.TRUE(),left.not());
            case ABU:
                BDD[] EBU= witnessEBU(s,range.getFrom(), range.getTo(),right.not(),left.not().and(right.not()));
                if (EBU==null){
                    BDD[] EBG= witnessEBG(s,range.getFrom(), range.getTo(),right.not());
                    return EBG;}
                return EBU;
//				System.out.println("EBG-----------------------------------------------------------");
//				for(int i=0;i<EBG.length  ;i++)
//				{  if(EBG[i]==null)break;
//					System.out.println(i+"---"+EBG[i]);
//				}
//				System.out.println("EBU-----------------------------------------------------------");
//				for(int i=0;i<EBU.length  ;i++)
//				{  if(EBU[i]==null)break;
//					System.out.println(i+"---"+EBU[i]);
//				}
        }
        return null;
    }

    public BDD[] LS_witnessEX(BDD s, BDD f) {
        BDD next=getDesign().succ(s).and(getDesign().feasible()).satOne(getDesign().moduleUnprimeVars(),false);
		/*
		方法2
		 */
//		if (this.ctlFair == null)
//		{
//			ctlFair = ce_fair_g(Env.TRUE());
//			acc=acc.and(ctlFair);
//		}
// next=acc.and(getDesign().reachable()).and(next);//满足f的后继状态
        BDD[] returned_path = new BDD[2];
        returned_path = new BDD[20];
        returned_path[0]=s;
        returned_path[1]=next;
        return   returned_path;
    }

    public BDD[] LS_witnessEU(BDD s, BDD f, BDD g) {
        BDD[] Z=new BDD[100];
        Z[0]=g.id().and(getDesign().feasible());
        if (Z[0].equals(Env.FALSE())) return null;
        int i=0,n=0;
        BDD[] returned_path = new BDD[100];
        while (true)
        {
            if(!s.and(Z[i]).equals(Env.FALSE()))
            {	returned_path[0]=s;
                if(!s.and(Z[0]).equals(Env.FALSE()))
                {   returned_path[0]=returned_path[0].and(Z[0]).satOne(getDesign().moduleUnprimeVars(),false);
                    return returned_path;
                }
                else
                {n=i;break;}
            }
            Z[i+1]=f.and(getDesign().pred(Z[i]));
            i=i+1;
        }
        for(i=1;i<=n;i++)
            returned_path[i]=getDesign().succ(returned_path[i-1]).and(Z[n-i]).satOne(getDesign().moduleUnprimeVars(),false);
        return returned_path;
    }
    public BDD[] LS_witnessEG(BDD s, BDD f) {
        BDD feasible=getDesign().feasible().and(f);
        BDD temp, fulfill;
        // saving to the previous restriction state
        Vector<BDD> trans_restrictions = getDesign()
                .getAllTransRestrictions();

        // Lines 1-2 are handled by the caller. ("verify")

        // Line 3
        getDesign().restrictTrans(feasible.and(Env.prime(feasible)));

        // Line 4
        //feasible.satOne(design.moduleUnprimeVars(), false); **************
        // BDD s = feasible.satOne();

        // Lines 5-6
        while (true) {
            temp = getDesign().allSucc(s).and(
                    getDesign().allPred(s).not());
            if (!temp.isZero())
                s = temp.satOne(getDesign().moduleUnprimeVars(), false);
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
        BDD feas = getDesign().allSucc(s);

        // Line 9
        // Find prefix - shortest path from initial state to subgraph feas.
        getDesign().removeAllTransRestrictions();
        Vector<BDD> prefix = new Vector<BDD>();
        BDD[] path = getDesign().shortestPath(getDesign().initial(),
                feas);
        for (int i = 0; i < path.length; i++)
            prefix.add(path[i]);

        // //// Calculate "_period".

        // Line 8: This has to come after line 9, because the way TS.tlv
        // implements restriction.
        getDesign().restrictTrans(feas.and(Env.prime(feas)));

        // Line 10
        Vector<BDD> period = new Vector<BDD>();
        period.add(prefix.lastElement());

        // Since the last item of the prefix is the first item of
        // the period we don't need to print the last item of the prefix.
        temp = prefix.remove(prefix.size() - 1);

        // Lines 11-13
        if (getDesign() instanceof ModuleWithWeakFairness) {
            ModuleWithWeakFairness weakDes = (ModuleWithWeakFairness) getDesign();
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
        if (getDesign() instanceof ModuleWithStrongFairness) {
            ModuleWithStrongFairness strongDes = (ModuleWithStrongFairness) getDesign();
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
                        getDesign().succ(period.firstElement())).isZero()) {
                    // period[1] is not a successor of itself: Add state to
                    // period.
                    period
                            .add(getDesign()
                                    .succ(period.firstElement())
                                    .satOne(
                                            getDesign()
                                                    .moduleUnprimeVars(), false));
                    // period.add(design.succ(period.firstElement()).satOne());

                    // Close cycle.
                    BDD from = period.lastElement();
                    BDD to = period.firstElement();
                    path = getDesign().shortestPath(from, to);
                    // eliminate the edges since from and to are already in
                    // period
                    for (int i = 1; i < path.length - 1; i++)
                        period.add(path[i]);
                }
            }
        } else {
            BDD from = period.lastElement();
            BDD to = period.firstElement();
            path = getDesign().shortestPath(from, to);
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
        for (int i = 0; i < returned_path.length; i++) {
            returned_path[i] = returned_path[i].satOne(getDesign().moduleUnprimeVars(), false);
        }
        // returning to the previous restriction state
        getDesign().setAllTransRestrictions(trans_restrictions);
        return returned_path;
    }

    public BDD[] witnessEBU(BDD s, int from, int to, BDD f, BDD g){
        BDD[] Z = new BDD[100];
        int m=0,n=from;
        BDD oldZ=null;
        Z[to]=g.id().and(getDesign().feasible());
        for(int i=to-1;i>=from;i--)
        {
            Z[i] = Z[i+1].or(f.and(getDesign().pred(Z[i+1])));
            if(Z[i].equals(Z[i+1])) {n=i;break;}
            n=i;
        }
        oldZ=Z[n];
        for(int i=from-1;i>=0;i--)
        {
            Z[i] = f.and(getDesign().pred(oldZ));
            if(Z[i].equals(oldZ)) {m=i;break;}
            oldZ=Z[i];
            m=i;
        }
        //System.out.println("--n--"+n+"--m--"+m);
        BDD [] return_path=new BDD[100];
        BDD c=s,next;
        if (Z[m]==null)
        {       m=n;
            return_path[0]=c.and(Z[m]).satOne(getDesign().moduleUnprimeVars(),false);
            return return_path;
        }
        else
        {
            for(int i=0;i<=m ;i++)//补齐0 ---- m
            {
                return_path[i]=c.and(f).and(Z[m]).satOne(getDesign().moduleUnprimeVars(),false);
                next=getDesign().succ(c);
                c=next;
                //System.out.println(i+"---"+return_path[i]);
            }
            for(int i=m+1;i<=from-1;i++)//补齐m+1 ---- from-1
            {
                return_path[i]=getDesign().succ(return_path[i-1]).and(Z[i]).satOne(getDesign().moduleUnprimeVars(),false);
                //System.out.println(i+"---"+return_path[i]);
            }
/*
方法1
 */
//		int stop=0;
//		for(int i=from;i<=n  ;i++)//补齐from ---- n
//		{
//			return_path[i]=getDesign().succ(return_path[i-1]).and(Z[n]).satOne(getDesign().moduleUnprimeVars(),false);
//			//System.out.println(i+"---"+return_path[i]);
//			if (!return_path[i].and(g.id()).equals(Env.FALSE())) {stop=1;break;}//*******
//		}
//		if(stop==0)//stop=1 提前结束无需补齐
//		{
//			int i=n;
//			while(return_path[i].and(g.id()).equals(Env.FALSE())){//补齐n ---- to
//				return_path[i+1]=getDesign().succ(return_path[i]).and(Z[i+1]).satOne(getDesign().moduleUnprimeVars(),false);
//				i=i+1;
//				//System.out.println(i+"---"+return_path[i]);
//			}
//		}
//
/*
方法2
 */
            BDD nextZ,nextg;
            for(int i=from;i<=to  ;i++)//补齐from ---- n --- to
            {
                if(i<=n) nextZ=Z[n];
                else nextZ=Z[i];
                nextg=getDesign().succ(return_path[i-1]).and(nextZ).and(g.id());
                if (!nextg.equals(Env.FALSE())) {
                    return_path[i]=nextg.satOne(getDesign().moduleUnprimeVars(),false);
                    break;
                }
                return_path[i]=getDesign().succ(return_path[i-1]).and(nextZ);
            }
            return return_path;
        }
    }
    public BDD[] witnessEBG(BDD s, int from, int to, BDD f){
        BDD[] Z = new BDD[100];
        int m=0,n=0;
        BDD oldZ=null;
        Z[to]=f.id().and(getDesign().feasible());
        for(int i=to-1;i>=from;i--)
        {
            Z[i] = Z[i+1].or(f.and(getDesign().pred(Z[i+1])));
            if(Z[i].equals(Z[i+1])) {n=i;break;}
            n=i;
        }
        oldZ=Z[n];
        for(int i=from-1;i>=0;i--)
        {
            Z[i] = getDesign().pred(oldZ);
            if(Z[i].equals(oldZ)) {m=i;break;}
            oldZ=Z[i];
            m=i;
        }//from 为0跳过此步

        BDD [] return_path=new BDD[100];
        BDD c=s,next;

        if(Z[m]==null)//0..n
        {
            m=n;
            for(int i=0;i<=to ;i++)
            {
                return_path[i]=c.and(Z[m]).satOne(getDesign().moduleUnprimeVars(),false);
                next=getDesign().succ(c);
                c=next;
                //System.out.println(i+"---"+return_path[i]);
            }
            return return_path;
        }
        else
        {
            if (s.and(Z[m]).equals(Env.FALSE()))return null;
            for(int i=0;i<=m ;i++)//补齐0 ---- m
            {
                return_path[i]=c.and(Z[m]).satOne(getDesign().moduleUnprimeVars(),false);
                next=getDesign().succ(c);
                c=next;
                //System.out.println(i+"---"+return_path[i]);
            }
            for(int i=m+1;i<=from-1;i++)//补齐m+1 ---- from-1
            {
                return_path[i]=getDesign().succ(return_path[i-1]).and(Z[i]).satOne(getDesign().moduleUnprimeVars(),false);
                //System.out.println(i+"---"+return_path[i]);
            }
            int stop=0;
            for(int i=from;i<=n  ;i++)//补齐from ---- n
            {
                return_path[i]=getDesign().succ(return_path[i-1]).and(Z[n]).satOne(getDesign().moduleUnprimeVars(),false);
                //System.out.println(i+"---"+return_path[i]);
            }
            for(int i=n;i<=to-1;i++)//补齐n ---- to
            {
                return_path[i+1]=getDesign().succ(return_path[i]).and(Z[i+1]).satOne(getDesign().moduleUnprimeVars(),false);
                //System.out.println(i+"---"+return_path[i]);
            }
            return return_path;
        }
    }

}
