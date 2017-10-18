package edu.wis.jtlv.old_lib.mc;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.schema.SMVAgentInfo;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.Operator;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.env.spec.SpecBDD;
import edu.wis.jtlv.env.spec.SpecExp;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;

public class RTCTLKModelChecker extends CTLModelChecker {

    public RTCTLKModelChecker(SMVModule design) throws ModelCheckException {
        super(design);
    }

    // agentName KNOW p
    // forall(system_global_variables - agentName's visible_variables).((global_reachable_states & fair_states) -> p)
    public BDD know(String agentName, BDD p) throws ModelCheckAlgException {
        if(agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");

        int idx_dot = agentName.indexOf('.');
        if(idx_dot==-1)
            agentName = "main." + agentName;
        else if (!agentName.substring(0, idx_dot).equals("main."))
            throw new ModelCheckAlgException("The agent's name " + agentName + " is illegal.");

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // X - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        if(getFeasibleStates() == null) setFeasibleStates(getDesign().feasible());
        BDD feasibleStates = getFeasibleStates();
//        if(getCtlFair() == null) setCtlFair(ce_fair_g(Env.TRUE())); // take the set of fair global states as the set of fair reachable states
//        BDD fs = getCtlFair();

//        BDD reachable_fair_states = rs.and(fs);

        BDD res = feasibleStates.imp(p).forAll(allInvisVars);

        return res;
    }

    // E[p BU from..to q] under fairness
    public BDD EfBU(int from, int to, BDD p, BDD q) {
        //TODO
        return null;
    }

    // A[p BU from..to q] under fairness
    public BDD AfBU(int from, int to, BDD p, BDD q) {
        //TODO
        return null;
    }

    // EBF from..to p under fairness
    public BDD EfBF(int from, int to, BDD p) {
        //TODO
        return null;
    }

    // ABF from..to p under fairness
    public BDD AfBF(int from, int to, BDD p) {
        //TODO
        return null;
    }

    // EBG from..to p under fairness
    public BDD EfBG(int from, int to, BDD p) {
        //TODO
        return null;
    }

    // ABG from..to p under fairness
    public BDD AfBG(int from, int to, BDD p) {
        //TODO
        return null;
    }

    public BDD RTCTLKAux(Spec property) throws ModelCheckAlgException {
        if (property instanceof SpecBDD)
            return ((SpecBDD) property).getVal();
        // else it is SpecExp since this cannot be a Real Time CTL.
        // and it also cannot be a triplet operator.
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();
        BDD left, right;
        if(op == Operator.KNOW) {
            left = null;
            right = RTCTLKAux(child[1]);
        }else {
            left = RTCTLKAux(child[0]);
            right = (op.isBinary()) ? RTCTLKAux(child[1]) : null;
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

    @Override
    public void modelCheck(Spec property) throws ModelCheckException, CounterExampleException, ModelCheckAlgException {
        if (property == null)
            throw new ModelCheckException("Cannot model check a null specification.");
        if (!property.isRealTimeCTLKSpec())
            throw new ModelCheckException("Cannot model check non RTCTLK specification: " + property);
        setCtlFair(null);

        BDD calculateStates = RTCTLKAux(property);
        if (!getDesign().initial().imp(calculateStates).not().isZero()) {
            throw new CounterExampleException(
                    "\n*** Property is NOT VALID ***", null);
        }
    }
}
