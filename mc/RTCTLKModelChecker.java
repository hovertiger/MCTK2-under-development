package edu.wis.jtlv.old_lib.mc;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.schema.SMVAgentInfo;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.*;
import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;

public class RTCTLKModelChecker extends CTLModelChecker {

    public RTCTLKModelChecker(SMVModule design) throws ModelCheckException {
        super(design);
    }

    // agentName KNOW p
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

        if(getCtlFair()==null) setCtlFair(ce_fair_g(Env.TRUE())); // take the set of fair global states as the set of fair reachable states

        BDD res = getCtlFair().imp(p).forAll(allInvisVars);
        return res;
    }
//
//    // E[p BU from..to q] under fairness
//    public BDD EfBU(int from, int to, BDD p, BDD q) {
//        //TODO
//        return null;
//    }
//
//    // A[p BU from..to q] under fairness
//    public BDD AfBU(int from, int to, BDD p, BDD q) {
//        //TODO
//        return null;
//    }
//
//    // EBF from..to p under fairness
//    public BDD EfBF(int from, int to, BDD p) {
//        //TODO
//        return null;
//    }
//
//    // ABF from..to p under fairness
//    public BDD AfBF(int from, int to, BDD p) {
//        //TODO
//        return null;
//    }
//
//    // EBG from..to p under fairness
//    public BDD EfBG(int from, int to, BDD p) {
//        //TODO
//        return null;
//    }
//
//    // ABG from..to p under fairness
//    public BDD AfBG(int from, int to, BDD p) {
//        //TODO
//        return null;
//    }

    public BDD RTCTLKAux(Spec property) throws ModelCheckAlgException {
        if (property instanceof SpecBDD)
            return ((SpecBDD) property).getVal();
        // else it is SpecExp since this cannot be a Real Time CTL.
        // and it also cannot be a triplet operator.
        SpecExp propExp = (SpecExp) property;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();

        //Uppdate by LS on : 2017/10/21
        int noo = op.numOfOperands();
        SpecRange range = null;
        BDD left=null; BDD right=null;

       // if(noo==2)
        //    System.out.println("操作符："+op+"  操作数： "+noo+"  child0:  "+child[0]+" child1:  "+child[1]);
        //if(noo==3)
        //    System.out.println("操作符："+op+"  操作数： "+noo+"  child0:  "+child[0]+" child1:  "+child[1]+" child2:  "+child[2]);

//      if(op == Operator.KNOW) {
//          left = null;
//           right = RTCTLKAux(child[1]);
//        }else
            {
//            left = RTCTLKAux(child[0]);
//            right = (op.isBinary()) ? RTCTLKAux(child[1]) : null;

//                c1 = (noo > 0) ? getSpec2BDD(child[0]) : null;
//                BDD c2 = (noo > 1) ? getSpec2BDD(child[1]) : null;
//                BDD c3 = (noo > 2) ? getSpec2BDD(child[2]) : null;//---
            if (noo==1) //EX, EF, EG, AX, AF,AG left
                left=RTCTLKAux(child[0]);
            if (noo==2) {//ABF, ABG, EBF, EBG  left or right//区间不作节点，区间不做节点
                if (child[0] instanceof SpecRange)
                {   range = (SpecRange) child[0];
                    left= RTCTLKAux(child[1]);}//xxxxxxxx
                else if(op == Operator.KNOW) {
                    left = null;//为什么不是child[0]???
                    right = RTCTLKAux(child[1]);
                }
                else
                {   left=RTCTLKAux(child[0]);//AU GU
                    right=RTCTLKAux(child[1]);
                }
            }
            if (noo==3)// ABU, EBU
            {
                if (child[1] instanceof SpecRange)
                {   range = (SpecRange) child[1];
                    left=RTCTLKAux(child[0]);//xxxxxxxx
                    right=RTCTLKAux(child[2]);//xxxxxxxxx
                }
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

        //Uppdate by LS on : 2017/10/20
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
            String agentName;
            agentName = child[0].toString();
            return know(agentName, right);
        }

        // something is wrong.
        throw new ModelCheckAlgException(
                "Cannot identify root operator for sub specification: " + property);
    }

    //up 2017/10/21

    @Override
    public void modelCheck(Spec property) throws ModelCheckException, CounterExampleException, ModelCheckAlgException {
        if (property == null)
            throw new ModelCheckException("Cannot model check a null specification.");
        if (property.isRealTimeCTLKSpec())//**************************
            throw new ModelCheckException("Cannot model check non RTCTLK specification: " + property);
        setCtlFair(null);

        BDD calculateStates = RTCTLKAux(property);
        if (!getDesign().initial().imp(calculateStates).not().isZero()) {
            throw new CounterExampleException(
                    "\n*** Property is NOT VALID ***", null);
        }
    }
}
