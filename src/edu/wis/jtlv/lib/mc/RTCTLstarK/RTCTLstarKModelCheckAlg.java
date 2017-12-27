package edu.wis.jtlv.lib.mc.RTCTLstarK;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.Module;
import edu.wis.jtlv.env.module.ModuleException;
import edu.wis.jtlv.env.module.ModuleWithStrongFairness;
import edu.wis.jtlv.env.module.ModuleWithWeakFairness;
import edu.wis.jtlv.env.spec.Operator;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.env.spec.SpecExp;
import edu.wis.jtlv.env.spec.SpecRange;
import edu.wis.jtlv.lib.AlgExceptionI;
import edu.wis.jtlv.lib.AlgResultI;
import edu.wis.jtlv.lib.AlgResultPath;
import edu.wis.jtlv.lib.AlgResultString;
import edu.wis.jtlv.lib.mc.RTLTLK.RTLTLKModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTLTLK.RTLTLKTester;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;

import java.util.Vector;

public class RTCTLstarKModelCheckAlg extends RTLTLKModelCheckAlg{
    private Spec property;
    private Module tester;
    private BDD tester_initials;
    private boolean mk_tester;
    private BDDVarSet visibleVars;
    public RTCTLstarKModelCheckAlg(Module design, Spec property) {
        super(design, property);
        this.property = property;
        mk_tester = true;
    }

    public AlgResultI preAlgorithm() throws AlgExceptionI {
        if (mk_tester) {
            System.out.println("model checking property: -------" + property);
            //Get the NNF formula of property
            property=GetNNF(property);
            System.out.println("NNF------"+property);

            Spec negp = new SpecExp(Operator.NOT, property);
            RTCTLstarKTester builder = new RTCTLstarKTester(this.getDesign(),negp, true);
            visibleVars = this.getRelevantVars(getDesign(), property);
            tester = builder.getTester();
            tester_initials = builder.getSpec2BDD(property).not();
            //tester_initials = builder.getSpec2BDD(property);
        } else {
//			System.out.println("model checking property user tester "
//					+ tester.getFullInstName());
            visibleVars = this.getRelevantVars(getDesign(), null);
            // user_tester = user_tester;
            tester_initials = tester.initial();
            try {
                tester.setInitial(Env.TRUE());
            } catch (ModuleException e) {
            }
        }
        return null;
    }
    public Spec GetNNF(Spec spec)  {
        //System.out.println("spec--------"+spec);
        if (! (spec instanceof SpecExp))
            return  spec;
        SpecExp propExp = (SpecExp) spec;
        Operator op = propExp.getOperator();
        Spec[] child = propExp.getChildren();
        int noo = op.numOfOperands();
        System.out.println("-------------"+op);

        // unaryOp of LTL except for Not
        if(op.equals(Operator.FINALLY)||op.equals(Operator.GLOBALLY)||op.equals(Operator.HISTORICALLY)
                ||op.equals(Operator.NEXT)||op.equals(Operator.NOT_PREV_NOT)||op.equals(Operator.ONCE)
                ||op.equals(Operator.PREV)){
            spec=new SpecExp(op, GetNNF(child[0]));
        }

        // binaryOp of LTL except for KNOW,SKNOW,NKNOW
        if(op.equals(Operator.OR)||op.equals(Operator.AND)||op.equals(Operator.IFF)||op.equals(Operator.XOR)
                ||op.equals(Operator.XOR)||op.equals(Operator.XNOR)||op.equals(Operator.UNTIL)||op.equals(Operator.RELEASES)
                ||op.equals(Operator.SINCE)||op.equals(Operator.TRIGGERED)){
            spec=new SpecExp(op, GetNNF(child[0]),GetNNF(child[1]));
        }
        if(op.equals(Operator.KNOW)||op.equals(Operator.SKNOW)||op.equals(Operator.NKNOW)){
            spec=new SpecExp(op, child[0],GetNNF(child[1]));
        }
        // F a..b f = T U a..b f
        if(op.equals(Operator.B_FINALLY)){
            SpecRange range=(SpecRange)child[0];
            if(range.getTo()>=0){
                Spec p1=GetNNF(child[1]);
                range.setOriginLeftSpec(getTRUE());
                range.setOriginSpec(p1);
                spec = new SpecExp(Operator.B_UNTIL, range,getTRUE(),p1);
            }
            else//F a..-1 f  -> T U a..a ( F f)
            {
                Spec p1=GetNNF(new SpecExp(Operator.FINALLY, child[1]));
                range=new SpecRange(range.getFrom(),range.getFrom());
                range.setOriginLeftSpec(getTRUE());
                range.setOriginSpec(p1);
                spec = new SpecExp(Operator.B_UNTIL, range,getTRUE(),p1);
            }

//                SpecRange range=(SpecRange)child[0];
//                Spec p1 = GetNNF(child[1]);
//                range.setOriginSpec(p1);
//                spec=new SpecExp(op, range,p1);
        }
        // G a..b f -> ! F a..b !f -> ! ( T U a..b !f ) -> ! T R a..b f
        if(op.equals(Operator.B_GLOBALLY)){
            //----------方法一 使用多次迭代 求出 R
//            SpecRange range=(SpecRange)child[0];
//            Spec p1=GetNNF(new SpecExp(Operator.NOT,child[1]));
//            range.setOriginSpec(p1);
//            SpecExp exp= new SpecExp(Operator.NOT, GetNNF(new SpecExp(Operator.B_FINALLY,range,p1)));
//            spec=GetNNF(exp);

            //----------方法二 直接构造R形式
            SpecRange range=(SpecRange)child[0];
            if(range.getTo()>=0){
                Spec p1=GetNNF(child[1]);
                range.setOriginLeftSpec(getFALSE());
                range.setOriginSpec(p1);
                spec= new SpecExp(Operator.B_RELEASE, range,getFALSE(),p1);
            }
            else
            {
                Spec p1=GetNNF(new SpecExp(Operator.GLOBALLY, child[1]));
                range=new SpecRange(range.getFrom(),range.getFrom());
                range.setOriginLeftSpec(getTRUE());
                range.setOriginSpec(p1);
                spec = new SpecExp(Operator.B_UNTIL, range,getTRUE(),p1);
            }
        }

        // tripletOp of LTL
        if(op.equals(Operator.B_UNTIL)||op.equals(Operator.B_RELEASE)){
            SpecRange range=(SpecRange)child[0];
            //System.out.println(""+child[0]+child[1]+child[2]);
            if(range.getTo()>=0){
                Spec p1 = GetNNF(child[1]);
                Spec p2 = GetNNF(child[2]);
                range.setOriginLeftSpec(p1);
                range.setOriginSpec(p2);
                spec = new SpecExp(op, range,p1,p2);
            }
            else
            {
                Spec p1 = GetNNF(child[1]);
                Spec p2 = GetNNF(new SpecExp(Operator.UNTIL, child[1],child[2]));;
                range=new SpecRange(range.getFrom(),range.getFrom());
                range.setOriginLeftSpec(p1);
                range.setOriginSpec(p2);
                spec = new SpecExp(op, range,p1,p2);
            }
        }
        if (op.equals(Operator.NOT)) {
            if (! (child[0] instanceof SpecExp))//---!f
                return  spec;
            SpecExp prop = (SpecExp) child[0];
            Operator ops = prop.getOperator();
            Spec[] childs = prop.getChildren();
            // System.out.println("ops-"+ops+" 0-"+childs[0]+" 1-"+childs[1]+" 2-"+childs[2]);
            if (ops.equals(Operator.NOT)) {
                spec = GetNNF(childs[0]);
            }
            if (ops.equals(Operator.NEXT)) {
                spec = new SpecExp(ops, GetNNF(new SpecExp(op, childs[0])));
            }
            if (ops.equals(Operator.RELEASES)) {
                spec = new SpecExp(Operator.UNTIL, GetNNF(new SpecExp(op, childs[0])),GetNNF(new SpecExp(op, childs[1]))   );
            }
            // !(f R a..b g)
            if (ops.equals(Operator.B_RELEASE)) {
                SpecRange range=(SpecRange)childs[0];
                if (range.getTo()>=0){
                    Spec p1 = GetNNF(new SpecExp(op, childs[1]));
                    Spec p2 = GetNNF(new SpecExp(op, childs[2]));
                    range.setOriginLeftSpec(p1);
                    range.setOriginSpec(p2);
                    spec = new SpecExp(Operator.B_UNTIL, range,p1,p2);
                }
                else
                {
                    Spec p1 =  GetNNF(new SpecExp(op, childs[1]));
                    Spec p2 =  GetNNF(new SpecExp(op, childs[2]));
                    p2=new SpecExp(Operator.UNTIL, p1,p2);
                    range=new SpecRange(range.getFrom(),range.getFrom());
                    range.setOriginLeftSpec(p1);
                    range.setOriginSpec(p2);
                    spec = new SpecExp(Operator.B_UNTIL, range,p1,p2);
                }
            }
            if (ops.equals(Operator.UNTIL)) {
                spec = new SpecExp(Operator.RELEASES, GetNNF(new SpecExp(op, childs[0])),GetNNF(new SpecExp(op, childs[1]))   );
            }
            // !(f U a..b g)
            if (ops.equals(Operator.B_UNTIL)) {
                SpecRange range=(SpecRange)childs[0];
                if (range.getTo()>=0){
                    Spec p1 =  GetNNF(new SpecExp(op, childs[1]));
                    Spec p2 =  GetNNF(new SpecExp(op, childs[2]));
                    range.setOriginLeftSpec(p1);
                    range.setOriginSpec(p2);
                    spec = new SpecExp(Operator.B_RELEASE, range,p1,p2);
                }
                else
                {
                    Spec p1 =  GetNNF(new SpecExp(op, childs[1]));
                    Spec p2 =  GetNNF(new SpecExp(op, childs[2]));
                    p2=new SpecExp(Operator.RELEASES, p1,p2);
                    range=new SpecRange(range.getFrom(),range.getFrom());
                    range.setOriginLeftSpec(p1);
                    range.setOriginSpec(p2);
                    spec = new SpecExp(Operator.B_RELEASE, range,p1,p2);
                }
            }
            if (ops.equals(Operator.KNOW)) {
                spec = new SpecExp(Operator.NKNOW, childs[0],GetNNF(new SpecExp(op, childs[1])));
            }

            if(ops.equals(Operator.B_FINALLY)){
                /*
                多次迭代
                 */
//                SpecRange range=(SpecRange)childs[0];
//                Spec p1=GetNNF(childs[1]);
//                range.setOriginLeftSpec(getTRUE());
//                range.setOriginSpec(p1);
//                SpecExp exp = new SpecExp(Operator.B_UNTIL, range,getTRUE(),p1);
//                spec=GetNNF(new SpecExp(op,exp));

                //直接构造出 R 表达
                SpecRange range=(SpecRange)childs[0];
                if (range.getTo()>=0){
                    Spec p1=GetNNF(new SpecExp(op,childs[1]));
                    range.setOriginLeftSpec(getFALSE());
                    range.setOriginSpec(p1);
                    spec= new SpecExp(Operator.B_RELEASE, range,getFALSE(),p1);
                }
                else
                {
                    Spec p1=GetNNF(new SpecExp(op,new SpecExp(Operator.FINALLY,childs[1])));
                    range=new SpecRange(range.getFrom(),range.getFrom());
                    range.setOriginLeftSpec(getFALSE());
                    range.setOriginSpec(p1);
                    spec= new SpecExp(Operator.B_RELEASE, range,getFALSE(),p1);
                }
            }
            if(ops.equals(Operator.B_GLOBALLY)){
//                SpecRange range=(SpecRange)childs[0];
//                Spec p1=GetNNF(new SpecExp(Operator.NOT,childs[1]));
//                range.setOriginSpec(p1);
//                SpecExp exp =new SpecExp(Operator.NOT, GetNNF(new SpecExp(Operator.B_FINALLY,range,p1)));
//                spec=GetNNF(new SpecExp(op,exp));

                //直接构造出 U 表达
                SpecRange range=(SpecRange)childs[0];
                if (range.getTo()>=0){
                    Spec p1=GetNNF(new SpecExp(op,childs[1]));
                    range.setOriginLeftSpec(getTRUE());
                    range.setOriginSpec(p1);
                    spec= new SpecExp(Operator.B_RELEASE, range,getTRUE(),p1);
                }
                else
                {
                    Spec p1=GetNNF(new SpecExp(op,new SpecExp(Operator.GLOBALLY,childs[1])));
                    range=new SpecRange(range.getFrom(),range.getFrom());
                    range.setOriginLeftSpec(getFALSE());
                    range.setOriginSpec(p1);
                    spec= new SpecExp(Operator.B_RELEASE, range,getFALSE(),p1);
                }
            }
        }
        return spec;
    }
    /**
     * @return The TRUE specification.
     */
    public Spec getTRUE() {
        Spec []str=Env.loadSpecString("LTLSPEC X TRUE ;");
        Spec[] Truespc=((SpecExp)str[0]).getChildren();
        return Truespc[0];
    }
    /**
     * @return The FALSE  specification.
     */
    public Spec getFALSE() {
        Spec []str=Env.loadSpecString("LTLSPEC X FALSE;");
        Spec[] Truespc=((SpecExp)str[0]).getChildren();
        return Truespc[0];
    }
    public AlgResultI doAlgorithm() throws AlgExceptionI {
        Module design = getDesign(); // with the composed tester...
        design.syncComposition(tester);
        // saving to the previous restriction state
        Vector<BDD> ini_restrictions = design.getAllIniRestrictions();
        design.restrictIni(tester_initials);
        //System.out.println("design-----"+tester_initials);
        BDD feas = design.feasible();
        // the initial_condition seems redundant
        if (!feas.and(design.initial()).and(tester_initials).isZero()) {
            BDD[] example = this.extractWithness(feas, design, visibleVars);
            // returning to the previous restriction state
            design.setAllIniRestrictions(ini_restrictions);
            getDesign().decompose(tester);
            return new AlgResultPath(false, example);
        }
        // else - everything is OK.
        // returning to the previous restriction state
        getDesign().decompose(tester);
        design.setAllIniRestrictions(ini_restrictions);
        return new AlgResultString(true, "*** Property is VALID ***");
    }

    public BDDVarSet getRelevantVars(Module m, Spec p) {
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
}
