import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

import edu.wis.jtlv.lib.mc.RTCTLK.RTCTLKModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTCTLstarK.RTCTLstarKModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTLTLK.RTLTLKModelCheckAlg;
import net.sf.javabdd.BDD;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.ModuleException;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.lib.AlgRunnerThread;
import edu.wis.jtlv.lib.mc.SimpleDeadlockAlg;
import edu.wis.jtlv.lib.mc.SimpleInvarianceAlg;
import edu.wis.jtlv.lib.mc.SimpleTempEntailAlg;
import edu.wis.jtlv.lib.mc.CTL.CTLModelCheckAlg;
import edu.wis.jtlv.lib.mc.LTL.LTLModelCheckAlg;
import edu.wis.jtlv.lib.mc.LTL.LTLValidAlg;

/**
 * @version {@value edu.wis.jtlv.env.Env#version}
 * @author yaniv sa'ar.
 * 
 */
public class AlgorithmRunnerMain {
	
	public static void main(String[] args) throws IOException {
/*		simpleCheckDeadlock();
		Env.resetEnv();
		simpleCheckInvariance();
		Env.resetEnv();
		simpleCheckTempEntail();
		Env.resetEnv();
		simpleCheckReact();
		Env.resetEnv();
		Env.resetEnv();
		ctlCheck();
*/
		Env.resetEnv();
		//ltlCheck();
	    //rtltlCheck();
		//rtltlkCheck();
		//infiniteCheck();
		rtctlstarCheck();
//		rtctlCheck();
//		System.out.println("DONE");
	}
	public static void simpleCheckDeadlock() throws IOException {
		// System.setProperty("bdd", "buddy");
		SMVModule.initModulesWithoutRunningVar();
		Env.loadModule("testcases/mux-sem.smv");
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		for (SMVModule m : main.getAllInstances()) {
			m.setFullPrintingMode(true);
		}
		System.out.println("========= DONE Loading Modules ==========");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		// deadlock test 1 ///////////////////////
		System.out.println("-- Module muxsem with initials.");
		runner = new AlgRunnerThread(new SimpleDeadlockAlg(main));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////

		// // ///////////////////////////////////////
		// // deadlock test 2 - removing initials ///
		BDD old_initials = null;
		BDD[] old_sub_initials = new BDD[main.getAllInstances().length];
		try {
			old_initials = main.initial().id();
			main.setInitial(Env.TRUE());
			SMVModule[] sub = main.getAllInstances();
			for (int i = 0; i < sub.length; i++) {
				old_sub_initials[i] = sub[i].initial().id();
				sub[i].setInitial(Env.TRUE());
			}
		} catch (ModuleException e) {
		}

		System.out.println("-- Module muxsem without initials.");
		runner = new AlgRunnerThread(new SimpleDeadlockAlg(main));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());

		// returning the initials.
		try {
			main.setInitial(old_initials);
			SMVModule[] sub = main.getAllInstances();
			for (int i = 0; i < sub.length; i++)
				sub[i].setInitial(old_sub_initials[i]);
		} catch (ModuleException e) {
		}

	}

	public static void simpleCheckInvariance() throws IOException {
		// System.setProperty("bdd", "buddy");
		SMVModule.initModulesWithoutRunningVar();
		Env.loadModule("testcases/mux-sem.smv");
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		for (SMVModule m : main.getAllInstances()) {
			m.setFullPrintingMode(true);
		}
		System.out.println("========= DONE Loading Modules ==========");
		// ///////////////////////////////////////

		// ///////////////////////////////////////
		// invariance tests //////////////////////
		System.out.println("========= Loading Specs =================");
		String to_parse = "";
		to_parse += "SPEC\n" + " !((proc[1].loc = 3) & (proc[2].loc = 3)) \n"; // 0
		to_parse += "SPEC\n" + " !((proc[1].loc = 3) & (proc[2].loc = 2)) \n"; // 1
		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		runner = new AlgRunnerThread(
				new SimpleInvarianceAlg(main, all_specs[0]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());

		// ///////////////////////////////////////
		runner = new AlgRunnerThread(
				new SimpleInvarianceAlg(main, all_specs[1]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////
	}

	public static void simpleCheckTempEntail() throws IOException {
		// System.setProperty("bdd", "buddy");
		SMVModule.initModulesWithoutRunningVar();
		Env.loadModule("testcases/simple_mc.smv");
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		for (SMVModule m : main.getAllInstances()) {
			m.setFullPrintingMode(true);
		}
		System.out.println("========= DONE Loading Modules ==========");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		// ///////////////////////////////////////
		// tempEntail tests //////////////////////

		String to_parse = "";
		to_parse += "LTLSPEC\n" + "[](aa -> <> aa)\n";
		to_parse += "SPEC\n" + "aa\n";
		to_parse += "LTLSPEC\n" + "[](aa -> <> bb)\n";
		to_parse += "SPEC\n" + "bb\n";
		to_parse += "LTLSPEC\n" + "[](aa -> <> !bb)\n";
		to_parse += "SPEC\n" + "!bb\n";
		to_parse += "LTLSPEC\n" + "[](aa -> <> ((!bb) & cc))\n";
		to_parse += "SPEC\n" + "((!bb) & cc)\n";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");

		// ///////////////////////////////////////
		runner = new AlgRunnerThread(new LTLModelCheckAlg(main, all_specs[0]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ltl_checker.modelCheckStandardOutput(all_specs[0]);
		runner = new AlgRunnerThread(new SimpleTempEntailAlg(main,
				all_specs[1], all_specs[1]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////
		runner = new AlgRunnerThread(new LTLModelCheckAlg(main, all_specs[2]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ltl_checker.modelCheckStandardOutput(all_specs[2]);
		runner = new AlgRunnerThread(new SimpleTempEntailAlg(main,
				all_specs[1], all_specs[3]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////
		runner = new AlgRunnerThread(new LTLModelCheckAlg(main, all_specs[4]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ltl_checker.modelCheckStandardOutput(all_specs[4]);
		runner = new AlgRunnerThread(new SimpleTempEntailAlg(main,
				all_specs[1], all_specs[5]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////
		runner = new AlgRunnerThread(new LTLModelCheckAlg(main, all_specs[6]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ltl_checker.modelCheckStandardOutput(all_specs[6]);
		runner = new AlgRunnerThread(new SimpleTempEntailAlg(main,
				all_specs[1], all_specs[7]));
		runner.runSequential();
		if (runner.getDoResult() != null)
			System.out.println(runner.getDoResult().resultString());
		if (runner.getDoException() != null)
			System.err.println(runner.getDoException().getMessage());
		// ///////////////////////////////////////
	}

	public static void rtltlCheck() throws IOException {
		try {
			Env.loadModule("testcases/mwOven.smv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");

		String to_parse="";
		//-----test NNF test NNF test NNF test NNF test NNF test NNF test NNF
		to_parse += "LTLSPEC !!!!(TRUE BU 3..12 start);\n";
		//to_parse += "LTLSPEC !( start & close );\n";
		//to_parse += "LTLSPEC ! X (! X start);\n";
		//to_parse += "LTLSPEC !(start RELEASES heat);\n";
		to_parse += "LTLSPEC !((start RELEASES heat) RELEASES (start RELEASES heat));\n";
		//to_parse += "LTLSPEC !((TRUE BU 3..10 start) BU 6..8 (TRUE BU 3..12 start));\n";
		//to_parse += "LTLSPEC !(TRUE BU 3..10 start);\n";
		//to_parse += "LTLSPEC !(start BR 3..10 close);\n";
		//to_parse += "LTLSPEC (start BR 0..10 close);\n";
		//to_parse += "LTLSPEC (start BR 5..5 close);\n";
		//to_parse += "LTLSPEC start BU 0..12 close;\n";
		//to_parse += "LTLSPEC error U close;\n";
		 // to_parse += "LTLSPEC X (start);\n";

		//to_parse += "LTLSPEC BF 3..8 !( start RELEASES close );\n";
		//to_parse += "LTLSPEC TRUE BU 8..12 !error;\n";
		to_parse += "LTLSPEC BF 5..8  ! X close;\n";
		//to_parse += "LTLSPEC TRUE  BR 5..8  close;\n";


		//to_parse += "LTLSPEC !(start & close );\n";
	    //to_parse += "LTLSPEC  X !( start RELEASES close );\n";
		//to_parse += "LTLSPEC  (! X start) U (! X close);\n";
		//to_parse += "LTLSPEC start BU 8..12 !(X close);\n";
		//to_parse += "LTLSPEC  start & close;\n";

		//to_parse += "LTLSPEC  close;\n";
		//to_parse += "LTLSPEC TRUE U close;\n";

		//to_parse += "LTLSPEC  G close;\n";
		//to_parse += "LTLSPEC !(TRUE U !close);\n";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");
		AlgRunnerThread runner;
		// model checking a module
		for (int i = 0; i < all_specs.length; i++) {
			//System.out.println(i+"--------"+all_specs[i]);
			runner = new AlgRunnerThread(new RTLTLKModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());
		}
		// ///////////////////////////////////////
	}

	public static void infiniteCheck() throws IOException {
		try {
			Env.loadModule("testcases/mwOven.smv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");
		String to_parse="";
		//-----test NNF test NNF test NNF test NNF test NNF test NNF test NNF
		//to_parse += "LTLSPEC (start BR 5..5 close);\n";
		//to_parse += "LTLSPEC !(start BR 12..-1 ! X close);\n";
		//to_parse += "LTLSPEC !(start BU 12..-1 ! X close);\n";
		//to_parse += "LTLSPEC BF 3..8 !( start RELEASES close );\n";
		to_parse += "LTLSPEC !( BF 3..-1 ! X close);\n";
		to_parse += "LTLSPEC !( BG 3..-1 ! X close);\n";
		//to_parse += "LTLSPEC BG 5..-1  ! X close;\n";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");
		AlgRunnerThread runner;
		// model checking a module
		for (int i = 0; i < all_specs.length; i++) {
			//System.out.println(i+"--------"+all_specs[i]);
			runner = new AlgRunnerThread(new RTLTLKModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());
		}
		// ///////////////////////////////////////
	}

	private static void rtltlkCheck() throws IOException {
		try {
			Env.loadModule("testcases/dc3.smv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");
		String to_parse="";
//		to_parse += "LTLSPEC !dc2.paid -> G(dc1 KNOW dc2.paid) \n";
		to_parse += "LTLSPEC dc2.paid -> F (dc1 KNOW dc2.paid) \n";
		to_parse += "LTLSPEC BF 8..12 (dc1 KNOW dc2.paid);\n";
		to_parse += "LTLSPEC BG 8..12 (dc1 KNOW dc2.paid);\n";
		to_parse += "LTLSPEC dc2.paid BU 8..12 (dc1 KNOW dc2.paid);\n";
		to_parse += "LTLSPEC dc3.said -> (dc1 KNOW dc3.said);\n";
		to_parse += "LTLSPEC dc2.paid -> F (dc1 KNOW dc3.said);\n";
		to_parse += "LTLSPEC dc3.paid -> F (dc1 KNOW dc3.paid);\n";
		to_parse += "LTLSPEC coin1;\n";
		//to_parse += "LTLSPEC  X (dc1 KNOW !(dc1 KNOW dc2.paid));\n";
		//to_parse += "LTLSPEC dc2.paid BU 8..12 !(dc1 KNOW dc2.paid);\n";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");
		AlgRunnerThread runner;
		// model checking a module
		for (int i = 0; i < all_specs.length; i++) {
			//System.out.println(i+"--------"+all_specs[i]);
			runner = new AlgRunnerThread(new RTLTLKModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());
		}
		// ///////////////////////////////////////
	}

	public static void rtctlstarCheck() throws IOException {
		try {
			Env.loadModule("testcases/mwOven.smv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");
		String to_parse="";
		//-----test NNF test NNF test NNF test NNF test NNF test NNF test NNF
		//to_parse += "LTLSPEC (start BR 5..5 close);\n";
		//to_parse += "LTLSPEC !(start BR 12..-1 ! X close);\n";
		//to_parse += "LTLSPEC !(start BU 12..-1 ! X close);\n";
		//to_parse += "LTLSPEC BF 3..8 !( start RELEASES close );\n";
		//to_parse += "LTLSPEC !( BF 3..-1 ! X close);\n";
		//
		//to_parse += "CTL*SPEC AG (EF close);\n";
		//to_parse += "CTL*SPEC A (F G start);\\n";
		to_parse += "CTL*SPEC E (G close);\n";
		//to_parse += "CTL*SPEC A [ G close U F start ];\n";
		//to_parse += "CTL*SPEC  A [ TRUE BU 2..6 X close ];\n";
		//to_parse += "CTL*SPEC ! A [ TRUE U F start ] & F heat;\n";
		//to_parse += "CTL*SPEC E [ TRUE U F start ];\n";
		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");
		AlgRunnerThread runner;
		for (int i = 0; i < all_specs.length; i++) {
			//System.out.println(i+"------"+all_specs[i].isRealTimeCTLKSpec()+all_specs[i].isCTLStarSpec());
			runner = new AlgRunnerThread(new RTCTLstarKModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());
		}
	}

	public static void ctlCheck() throws IOException {
		// System.setProperty("bdd", "buddy");
//		Env.loadModule("testcases/simple_mc.smv");
		Env.loadModule("testcases/dc3.smv");
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");

		String to_parse = "";
/*		to_parse += "SPEC\n" + "AF aa -> EF aa\n"; // 0
		to_parse += "SPEC\n" + "(AF (EG aa)) -> EG aa\n"; // 1
		to_parse += "SPEC\n" + "EG aa -> (EX aa & EF aa)\n"; // 2
		to_parse += "SPEC\n" + "EF aa\n"; // 3
		to_parse += "SPEC\n" + "(EG aa & AX aa) -> (EF !aa)\n"; // 4
		to_parse += "SPEC\n" + "AF bb -> EF bb\n"; // 5
		to_parse += "SPEC\n" + "EG bb -> (EX bb & EF bb)\n"; // 6
		to_parse += "SPEC\n" + "EF bb -> AF bb\n"; // 7
		to_parse += "SPEC\n" + "EF bb\n"; // 8
		to_parse += "SPEC\n" + "(EG bb & AX bb) -> (EF !bb)\n"; // 9
		to_parse += "SPEC\n" + "AF cc -> EF cc\n"; // 10
		to_parse += "SPEC\n" + "(AF (EG cc)) -> EG cc\n"; // 11
		to_parse += "SPEC\n" + "EG cc -> (EX cc & EF cc)\n"; // 12
		to_parse += "SPEC\n" + "EF cc -> AF cc\n"; // 13
		to_parse += "SPEC\n" + "EF cc\n"; // 14
		to_parse += "SPEC\n" + "(EG cc & AX cc) -> (EF !cc)\n"; // 15
		to_parse += "SPEC\n" + "EF EG bb\n"; // 16
		to_parse += "SPEC\n" + "EF EG !bb\n"; // 17 fails
		to_parse += "SPEC\n" + "EF aa -> AF aa\n"; // 18 fails
		to_parse += "SPEC\n" + "(AF (EG bb)) -> EG bb\n"; // 19 fails
		to_parse += "SPEC\n" + "EF AG !bb\n"; // 20 fails
		to_parse += "SPEC\n" + "EF AG bb\n"; // 21 fails
*/
		to_parse += "SPEC EX(coin1)";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		// model checking a module
		for (int i = 0; i < all_specs.length; i++) {
			// 17, 18, 19, 20, and 21 fails.
			runner = new AlgRunnerThread(new CTLModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());

		}
		// ///////////////////////////////////////
	}
	public static void rtctlCheck()  {
		// System.setProperty("bdd", "buddy");
		try {
			Env.loadModule("testcases/mwOven.smv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");

		String to_parse;

		//mwOven.smv
		to_parse = "SPEC !E[TRUE BU 3..12 (start & close & heat & !error)]";
		//to_parse = "SPEC !EBG  0..6 ( (!start & !close & !heat & !error) |  (start & !close & !heat & error) | (start & close & !heat & error) )";
//		to_parse = "SPEC !EG !heat";
//		to_parse = "SPEC (!EG ( (!start & !close & !heat & !error) |  (start & !close & !heat & error) | (start & close & !heat & error) )) | !EG !heat";
//		to_parse = "SPEC ABG 3..8 (start -> AF heat)";

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		// model checking a module
		for (int i = 0; i < all_specs.length; i++) {
			// 17, 18, 19, 20, and 21 fails.
			runner = new AlgRunnerThread(new RTCTLKModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());
		}
		// ///////////////////////////////////////
	}
	public static void ltlCheck() throws IOException {
		// System.setProperty("bdd", "buddy");
		Env.loadModule("testcases/simple_mc.smv");
		SMVModule main = (SMVModule) Env.getModule("main");
		main.setFullPrintingMode(true);
		System.out.println("========= DONE Loading Modules ==========");

		String to_parse = "";
		to_parse += "LTLSPEC\n" + "GLOBALLY aa -> FINALLY aa\n";
		to_parse += "LTLSPEC\n" + "([](aa -> ()aa)) -> (<>aa -> <>[]aa)\n";
		to_parse += "LTLSPEC\n" + "[] aa -> () aa\n";
		to_parse += "LTLSPEC\n" + "[] aa -> <> aa\n";
		to_parse += "LTLSPEC\n" + "[] aa\n"; // failure 1
		to_parse += "LTLSPEC\n" + "<>[] aa\n"; // failure 2
		to_parse += "LTLSPEC\n" + "<> aa -> [] aa\n"; // failure 3
		to_parse += "LTLSPEC\n([](aa -> ()aa))->(<>aa -> []aa)\n"; // failure

		Spec[] all_specs = Env.loadSpecString(to_parse);
		System.out.println("========= DONE Loading Specs ============");

		AlgRunnerThread runner;
		// ///////////////////////////////////////
		for (int i = 0; i < all_specs.length; i++) {
			// 4, 5, 6, and 7 fails.
			runner = new AlgRunnerThread(new LTLValidAlg(all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());

		}
		// ///////////////////////////////////////

		// ///////////////////////////////////////
		// checking valid with a module
		for (int i = 0; i < all_specs.length; i++) {
			// 4, 5, 6, and 7 fails.
			runner = new AlgRunnerThread(new LTLValidAlg(main, all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());

		}
		// ///////////////////////////////////////

		// ///////////////////////////////////////
		// checking valid with a module
		for (int i = 0; i < all_specs.length; i++) {
			// 4, 5, 6, and 7 fails.
			runner = new AlgRunnerThread(new LTLModelCheckAlg(main,
					all_specs[i]));
			runner.runSequential();
			if (runner.getDoResult() != null)
				System.out.println(runner.getDoResult().resultString());
			if (runner.getDoException() != null)
				System.err.println(runner.getDoException().getMessage());

		}
		// ///////////////////////////////////////
	}

}
