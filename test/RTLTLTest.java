import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.ModuleWithStrongFairness;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.lib.AlgResultI;
import edu.wis.jtlv.lib.AlgRunnerThread;
import edu.wis.jtlv.lib.mc.LTL.LTLModelCheckAlg;
import net.sf.javabdd.BDD;


/**
 * RTLTL 测试
 * Created by Mic on 2017/12/10.
 */
public class RTLTLTest {

    public static void main(String[] args) throws Exception {
        TimeCount timeCount = new TimeCount("Total Time");
        System.out.println("-----------------JTLV " + Env.version + "-----------------");

        timeCount.markBegin();
        test();
        timeCount.markEnd().print();
    }

    public static void test() throws Exception {
        //smv
        TimeCount timeCount_smv = new TimeCount("Loading SMV");
        timeCount_smv.markBegin();
        Env.loadModule("testcases/wsw/RTLTLTest.smv");
        timeCount_smv.markEnd().print();

        //spec
        TimeCount timeCount_spec = new TimeCount("Loading SPEC");
        timeCount_spec.markBegin();
        String to_parse="";// = "LTLSPEC gear=1 BU 5..10 gear=2;\n";//valid
//        to_parse += "LTLSPEC BG 6..10 gear=2;\n";//valid
//        to_parse += "LTLSPEC BF 5..10 gear=2;\n";//valid
       //to_parse += "LTLSPEC gear=2 BU 0..12 gear=3;\n";//invalid
//        to_parse += "LTLSPEC BG 5..10 gear=2;\n";//invalid
//        to_parse += "LTLSPEC BF 5..10 gear=3;\n";//invalid
//        to_parse += "LTLSPEC BF 5..10 gear=3;\n";//invalid
         to_parse += "LTLSPEC gear=200 RELEASES gear=30;\n";//invalid
         to_parse += "LTLSPEC gear=200;\n";//invalid
         to_parse += "LTLSPEC gear=200 & gear=30;\n";//invalid
         to_parse += "LTLSPEC X gear=200;\n";//invalid


        Spec[] all_specs = Env.loadSpecString(to_parse);
        timeCount_spec.markEnd().print();


        System.out.println();
        ModuleWithStrongFairness main = (ModuleWithStrongFairness) Env.getModule("main");

        AlgRunnerThread runner;
        /**
         * model checking a module
         */
        String[] toParsers = to_parse.split("\n");
        for (int i = 0; i < all_specs.length; i++) {
            TimeCount tempTimeCount=new TimeCount("Check Property");
            //System.out.println((i + 1) + " checking property:" + toParsers[i]);
            //System.out.println((i + 1) + " checking property:" + all_specs[i]);
            tempTimeCount.markBegin();
            runner = new AlgRunnerThread(new LTLModelCheckAlg(main, all_specs[i]));
            runner.runSequential();
            if (runner.getDoResult() != null) {
                AlgResultI result=runner.getDoResult();

                //成功
                if(result.getResultStat()==AlgResultI.ResultStatus.succeed){
                    System.out.println("========valid========");
                }else{
                    //反例
                    BDD[] example=(BDD[])result.resultObject();
                    System.out.println("========Counter Example========");
                    for (int j = 0; j < example.length; j++) {
                        if(example[j]==null) break;
                        System.out.println("[" + j + "] " + Env.toNiceString(example[j]));
                    }
                }
            }

            //其它异常
            if (runner.getDoException() != null)
                System.err.println(runner.getDoException().getMessage());

            tempTimeCount.markEnd().print();
            System.out.println();
        }
    }

}
