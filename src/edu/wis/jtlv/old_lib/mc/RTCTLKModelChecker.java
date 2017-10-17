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

    public BDD know(String agentName, BDD p) throws ModelCheckAlgException {
        if(agentName.equals("")) throw new ModelCheckAlgException("The agent name of the knowledge formula is null.");
        if(!agentName.substring(0,4).equals("main.")) agentName = "main." + agentName;

        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(agentName);
        if(agentInfo==null) throw new ModelCheckAlgException("Cannot find the information of agent " + agentName + ".");

        BDDVarSet visVars = agentInfo.getVisVars_BDDVarSet();
        // X - agentName's visible variables
        BDDVarSet allInvisVars = Env.globalUnprimeVarsMinus(visVars);

        if(getCtlFair()==null) setCtlFair(ce_fair_g(Env.TRUE())); // take the set of fair global states as the set of fair reachable states

        BDD res = getCtlFair().imp(p).forAll(allInvisVars);

        return res;
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
