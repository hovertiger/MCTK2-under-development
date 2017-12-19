// $ANTLR 3.0.1 F:\\StudyAntlr\\SPC.g 2017-12-17 16:22:33

package edu.wis.jtlv.env.core.spec;
import edu.wis.jtlv.env.Env;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SPCParser extends Parser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "NOP", "SPEC_LIST_T", "SUBRANGE_T", "VALUE_T", "SET_LIST_EXP_T", "BLOCK_T", "CASE_LIST_EXPR_T", "CASE_ELEMENT_EXPR_T", "BIT_SELECT_T", "ARRAY_INDEX_T", "TOK_UNARY_MINUS_T", "PURE_CTL_T", "PURE_LTL_T", "LTL_KNOW_T", "PURE_CTL_EPISTEMIC_T", "CTL_KNOW_T", "TOK_CTL_KNOW_T", "CTL_SKNOW_T", "TOK_CTL_SKNOW_T", "TOK_AGENT_NAME_T", "TOK_INVAR_SPEC", "TOK_CTL_SPEC", "TOK_LTL_SPEC", "TOK_CTL_STAR_SPEC", "TOK_IMPLIES", "TOK_IFF", "TOK_OR", "TOK_XOR", "TOK_XNOR", "TOK_AND", "TOK_EQUAL", "TOK_NOTEQUAL", "TOK_LT", "TOK_GT", "TOK_LE", "TOK_GE", "TOK_SETIN", "TOK_UNION", "TOK_LCB", "TOK_RCB", "TOK_COMMA", "TOK_LSHIFT", "TOK_RSHIFT", "TOK_MOD", "TOK_PLUS", "TOK_MINUS", "TOK_TIMES", "TOK_DIVIDE", "TOK_CONCATENATION", "TOK_NOT", "TOK_LP", "TOK_RP", "TOK_BOOL", "TOK_WORD1", "TOK_NEXT", "TOK_CASE", "TOK_ESAC", "TOK_WAREAD", "TOK_WAWRITE", "TOK_EX", "TOK_AX", "TOK_EF", "TOK_AF", "TOK_EG", "TOK_AG", "TOK_EBF", "TOK_ABF", "TOK_EBG", "TOK_ABG", "TOK_AA", "TOK_LB", "TOK_UNTIL", "TOK_RB", "TOK_EE", "TOK_BUNTIL", "TOK_KNOW", "TOK_SKNOW", "TOK_ATOM", "TOK_SINCE", "TOK_RELEASES", "TOK_TRIGGERED", "TOK_BRELEASES", "TOK_OP_NEXT", "TOK_OP_PREV", "TOK_OP_NOTPREVNOT", "TOK_OP_GLOBALLY", "TOK_OP_HISTORICALLY", "TOK_OP_FINALLY", "TOK_OP_ONCE", "TOK_OP_BOUND_FINALLY", "TOK_OP_BOUND_GLOBALLY", "TOK_DOT", "TOK_NUMBER", "TOK_COLON", "TOK_SEMI", "TOK_NUMBER_WORD", "TOK_TWODOTS", "TOK_FALSEEXP", "TOK_TRUEEXP", "TOK_WORD", "TOK_NUMBER_FRAC", "JTOK_WS", "JTOK_MULTI_COMMENT", "JTOK_LINE_COMMENT"
	};
	public static final int TOK_PLUS=48;
	public static final int TOK_RCB=43;
	public static final int CTL_KNOW_T=19;
	public static final int TOK_UNARY_MINUS_T=14;
	public static final int TOK_XOR=31;
	public static final int ARRAY_INDEX_T=13;
	public static final int TOK_ABG=72;
	public static final int TOK_ABF=70;
	public static final int TOK_TIMES=50;
	public static final int TOK_EBG=71;
	public static final int TOK_EBF=69;
	public static final int TOK_LP=54;
	public static final int TOK_LT=36;
	public static final int TOK_COLON=97;
	public static final int TOK_OP_BOUND_GLOBALLY=94;
	public static final int JTOK_MULTI_COMMENT=106;
	public static final int TOK_SETIN=40;
	public static final int SPEC_LIST_T=5;
	public static final int TOK_EQUAL=34;
	public static final int TOK_LB=74;
	public static final int TOK_TRUEEXP=102;
	public static final int TOK_BUNTIL=78;
	public static final int TOK_LE=38;
	public static final int TOK_UNTIL=75;
	public static final int TOK_OP_BOUND_FINALLY=93;
	public static final int TOK_DOT=95;
	public static final int SUBRANGE_T=6;
	public static final int TOK_BRELEASES=85;
	public static final int CASE_ELEMENT_EXPR_T=11;
	public static final int TOK_CTL_SKNOW_T=22;
	public static final int TOK_ATOM=81;
	public static final int TOK_XNOR=32;
	public static final int TOK_AG=68;
	public static final int TOK_AF=66;
	public static final int TOK_WAWRITE=62;
	public static final int TOK_RB=76;
	public static final int TOK_OP_ONCE=92;
	public static final int TOK_CTL_KNOW_T=20;
	public static final int TOK_SEMI=98;
	public static final int TOK_AA=73;
	public static final int TOK_NUMBER_FRAC=104;
	public static final int TOK_MINUS=49;
	public static final int TOK_NUMBER_WORD=99;
	public static final int TOK_IMPLIES=28;
	public static final int TOK_KNOW=79;
	public static final int TOK_AX=64;
	public static final int JTOK_WS=105;
	public static final int TOK_OP_GLOBALLY=89;
	public static final int TOK_FALSEEXP=101;
	public static final int TOK_RP=55;
	public static final int VALUE_T=7;
	public static final int TOK_RSHIFT=46;
	public static final int TOK_SINCE=82;
	public static final int TOK_WAREAD=61;
	public static final int TOK_OR=30;
	public static final int TOK_OP_NOTPREVNOT=88;
	public static final int TOK_NOT=53;
	public static final int TOK_OP_PREV=87;
	public static final int BLOCK_T=9;
	public static final int TOK_LSHIFT=45;
	public static final int CTL_SKNOW_T=21;
	public static final int LTL_KNOW_T=17;
	public static final int TOK_AND=33;
	public static final int TOK_GT=37;
	public static final int TOK_TRIGGERED=84;
	public static final int TOK_AGENT_NAME_T=23;
	public static final int TOK_CASE=59;
	public static final int TOK_CTL_STAR_SPEC=27;
	public static final int TOK_IFF=29;
	public static final int TOK_GE=39;
	public static final int SET_LIST_EXP_T=8;
	public static final int CASE_LIST_EXPR_T=10;
	public static final int TOK_TWODOTS=100;
	public static final int NOP=4;
	public static final int TOK_COMMA=44;
	public static final int TOK_UNION=41;
	public static final int TOK_NUMBER=96;
	public static final int TOK_LTL_SPEC=26;
	public static final int TOK_ESAC=60;
	public static final int TOK_SKNOW=80;
	public static final int TOK_LCB=42;
	public static final int TOK_DIVIDE=51;
	public static final int TOK_OP_NEXT=86;
	public static final int PURE_CTL_EPISTEMIC_T=18;
	public static final int TOK_EG=67;
	public static final int TOK_EF=65;
	public static final int PURE_CTL_T=15;
	public static final int TOK_NOTEQUAL=35;
	public static final int BIT_SELECT_T=12;
	public static final int TOK_INVAR_SPEC=24;
	public static final int TOK_EE=77;
	public static final int EOF=-1;
	public static final int TOK_BOOL=56;
	public static final int PURE_LTL_T=16;
	public static final int TOK_OP_FINALLY=91;
	public static final int JTOK_LINE_COMMENT=107;
	public static final int TOK_OP_HISTORICALLY=90;
	public static final int TOK_WORD1=57;
	public static final int TOK_CONCATENATION=52;
	public static final int TOK_NEXT=58;
	public static final int TOK_RELEASES=83;
	public static final int TOK_EX=63;
	public static final int TOK_MOD=47;
	public static final int TOK_WORD=103;
	public static final int TOK_CTL_SPEC=25;

	public SPCParser(TokenStream input) {
		super(input);
		ruleMemo = new HashMap[128+1];
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	public String[] getTokenNames() { return tokenNames; }
	public String getGrammarFileName() { return "F:\\StudyAntlr\\SPC.g"; }


	// for exception handling
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = null;
		if (e instanceof SpecParseException) {
			msg = e.toString();
			Env.doError(e, msg);
		} else {
			msg = super.getErrorMessage(e, tokenNames);
			Env.doError(e, msg);
		}
		return msg;
	}

	public void emitErrorMessage(String msg) {
		// System.err.println(msg);
		// do nothing.
	}

	// I don't like the printing...
	public void recoverFromMismatchedToken(IntStream input,
										   RecognitionException e, int ttype, BitSet follow)
			throws RecognitionException {
		//System.err.println("BR.recoverFromMismatchedToken");
		// if next token is what we are looking for then "delete" this token
		if (input.LA(2) == ttype) {
			reportError(e);
    		/*
    		 * System.err.println("recoverFromMismatchedToken deleting
    		 * "+input.LT(1)+ " since "+input.LT(2)+" is what we want");
    		 */
			beginResync();
			input.consume(); // simply delete extra token
			endResync();
			input.consume(); // move past ttype token as if all were ok
			return;
		}
		if (!recoverFromMismatchedElement(input, e, follow)) {
			throw e;
		}
	}

	public static boolean in_my_recovery_mode = false;
	public boolean er() {
		//if (input.LA(1) == TOK_SEMI)
		//	in_my_recovery_mode = true;
		return errorRecovery | in_my_recovery_mode;
	}
	public void recover(IntStream input, RecognitionException re) {
		in_my_recovery_mode = true;
		super.recover(input, re);
	}
	public void consumeUntilSpecStart(TokenStream input) throws SpecParseException {
		int ttype = input.LA(1);

		Token tstart = input.LT(1);
		Token tstop = null;
		while (ttype != Token.EOF && ttype != SPCLexer.TOK_INVAR_SPEC && ttype != SPCLexer.TOK_CTL_SPEC && ttype != SPCLexer.TOK_LTL_SPEC && ttype != SPCLexer.TOK_CTL_STAR_SPEC) {
			tstop = input.LT(1);
			input.consume();
			ttype = input.LA(1);
		}
		// if there is something to  throw, i.e. there was a problem.
		if (tstop != null) {
			throw new SpecParseException("Failed to parse expression '" + input.toString(tstart, tstop) + "'" , input, tstart, tstop);
		}
	}


	public static class spec_return extends ParserRuleReturnScope {
		public WAArrayOfSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start spec
	// F:\\StudyAntlr\\SPC.g:135:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );
	public final spec_return spec() throws RecognitionException {
		spec_return retval = new spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF1=null;
		Token EOF3=null;
		spec_list_return spec_list2 = null;


		Object EOF1_tree=null;
		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_spec_list=new RewriteRuleSubtreeStream(adaptor,"rule spec_list");
		try {
			// F:\\StudyAntlr\\SPC.g:136:9: ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) )
			int alt1=2;
			int LA1_0 = input.LA(1);

			if ( (LA1_0==EOF) ) {
				alt1=1;
			}
			else if ( ((LA1_0>=TOK_INVAR_SPEC && LA1_0<=TOK_CTL_STAR_SPEC)) ) {
				alt1=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("135:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );", 1, 0, input);

				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:136:11: EOF
				{
					root_0 = (Object)adaptor.nil();

					EOF1=(Token)input.LT(1);
					match(input,EOF,FOLLOW_EOF_in_spec208); if (failed) return retval;
					if ( backtracking==0 ) {
						EOF1_tree = (Object)adaptor.create(EOF1);
						adaptor.addChild(root_0, EOF1_tree);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:137:11: spec_list EOF
				{
					pushFollow(FOLLOW_spec_list_in_spec220);
					spec_list2=spec_list();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_spec_list.add(spec_list2.getTree());
					EOF3=(Token)input.LT(1);
					match(input,EOF,FOLLOW_EOF_in_spec222); if (failed) return retval;
					if ( backtracking==0 ) stream_EOF.add(EOF3);

					if ( backtracking==0 ) {
						retval.ret = spec_list2.ret;
					}

					// AST REWRITE
					// elements: spec_list
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 139:9: -> ^( SPEC_LIST_T spec_list )
						{
							// F:\\StudyAntlr\\SPC.g:139:12: ^( SPEC_LIST_T spec_list )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(SPEC_LIST_T, "SPEC_LIST_T"), root_1);

								adaptor.addChild(root_1, stream_spec_list.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end spec

	public static class spec_list_return extends ParserRuleReturnScope {
		public WAArrayOfSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start spec_list
	// F:\\StudyAntlr\\SPC.g:141:1: spec_list returns [WAArrayOfSpec ret] : f= spec_element (s= spec_element )* ;
	public final spec_list_return spec_list() throws RecognitionException {
		spec_list_return retval = new spec_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		spec_element_return f = null;

		spec_element_return s = null;



		retval.ret = new WAArrayOfSpec();
		try {
			// F:\\StudyAntlr\\SPC.g:143:9: (f= spec_element (s= spec_element )* )
			// F:\\StudyAntlr\\SPC.g:143:11: f= spec_element (s= spec_element )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_spec_element_in_spec_list286);
				f=spec_element();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret.specs.add(f.ret); else retval.ret.specs.add(null); in_my_recovery_mode = false;
				}
				// F:\\StudyAntlr\\SPC.g:144:9: (s= spec_element )*
				loop2:
				do {
					int alt2=2;
					int LA2_0 = input.LA(1);

					if ( ((LA2_0>=TOK_INVAR_SPEC && LA2_0<=TOK_CTL_STAR_SPEC)) ) {
						alt2=1;
					}


					switch (alt2) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:144:11: s= spec_element
						{
							pushFollow(FOLLOW_spec_element_in_spec_list302);
							s=spec_element();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if(!er()) retval.ret.specs.add(s.ret); else retval.ret.specs.add(null); in_my_recovery_mode = false;
							}

						}
						break;

						default :
							break loop2;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end spec_list

	public static class spec_element_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start spec_element
	// F:\\StudyAntlr\\SPC.g:147:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );
	public final spec_element_return spec_element() throws RecognitionException {
		spec_element_return retval = new spec_element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		invar_spec_return invar_spec4 = null;

		ctl_spec_return ctl_spec5 = null;

		ltl_spec_return ltl_spec6 = null;

		ctls_spec_return ctls_spec7 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:148:9: ( invar_spec | ctl_spec | ltl_spec | ctls_spec )
			int alt3=4;
			switch ( input.LA(1) ) {
				case TOK_INVAR_SPEC:
				{
					alt3=1;
				}
				break;
				case TOK_CTL_SPEC:
				{
					alt3=2;
				}
				break;
				case TOK_LTL_SPEC:
				{
					alt3=3;
				}
				break;
				case TOK_CTL_STAR_SPEC:
				{
					alt3=4;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("147:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );", 3, 0, input);

					throw nvae;
			}

			switch (alt3) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:148:11: invar_spec
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_invar_spec_in_spec_element345);
					invar_spec4=invar_spec();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, invar_spec4.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = invar_spec4.ret; consumeUntilSpecStart(input);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:149:11: ctl_spec
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_spec_in_spec_element359);
					ctl_spec5=ctl_spec();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_spec5.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_spec5.ret; consumeUntilSpecStart(input);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:150:11: ltl_spec
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ltl_spec_in_spec_element373);
					ltl_spec6=ltl_spec();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ltl_spec6.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_spec6.ret; consumeUntilSpecStart(input);
					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:151:11: ctls_spec
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_spec_in_spec_element387);
					ctls_spec7=ctls_spec();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_spec7.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_spec7.ret; consumeUntilSpecStart(input);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end spec_element

	public static class invar_spec_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start invar_spec
	// F:\\StudyAntlr\\SPC.g:163:1: invar_spec returns [InternalSpec ret] : TOK_INVAR_SPEC simple_root_expr optsemi ;
	public final invar_spec_return invar_spec() throws RecognitionException {
		invar_spec_return retval = new invar_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_INVAR_SPEC8=null;
		simple_root_expr_return simple_root_expr9 = null;

		optsemi_return optsemi10 = null;


		Object TOK_INVAR_SPEC8_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:165:9: ( TOK_INVAR_SPEC simple_root_expr optsemi )
			// F:\\StudyAntlr\\SPC.g:165:11: TOK_INVAR_SPEC simple_root_expr optsemi
			{
				root_0 = (Object)adaptor.nil();

				TOK_INVAR_SPEC8=(Token)input.LT(1);
				match(input,TOK_INVAR_SPEC,FOLLOW_TOK_INVAR_SPEC_in_invar_spec435); if (failed) return retval;
				if ( backtracking==0 ) {
					TOK_INVAR_SPEC8_tree = (Object)adaptor.create(TOK_INVAR_SPEC8);
					root_0 = (Object)adaptor.becomeRoot(TOK_INVAR_SPEC8_tree, root_0);
				}
				pushFollow(FOLLOW_simple_root_expr_in_invar_spec438);
				simple_root_expr9=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr9.getTree());
				pushFollow(FOLLOW_optsemi_in_invar_spec440);
				optsemi10=optsemi();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) {
					if(!er()) retval.ret = simple_root_expr9.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if (!er() && (retval.ret instanceof InternalSpecBDD)) ((InternalSpecBDD) retval.ret).evalBDDExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end invar_spec

	public static class ctl_spec_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_spec
	// F:\\StudyAntlr\\SPC.g:167:1: ctl_spec returns [InternalSpec ret] : TOK_CTL_SPEC ctl_root_expr optsemi ;
	public final ctl_spec_return ctl_spec() throws RecognitionException {
		ctl_spec_return retval = new ctl_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_CTL_SPEC11=null;
		ctl_root_expr_return ctl_root_expr12 = null;

		optsemi_return optsemi13 = null;


		Object TOK_CTL_SPEC11_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:169:9: ( TOK_CTL_SPEC ctl_root_expr optsemi )
			// F:\\StudyAntlr\\SPC.g:169:11: TOK_CTL_SPEC ctl_root_expr optsemi
			{
				root_0 = (Object)adaptor.nil();

				TOK_CTL_SPEC11=(Token)input.LT(1);
				match(input,TOK_CTL_SPEC,FOLLOW_TOK_CTL_SPEC_in_ctl_spec479); if (failed) return retval;
				if ( backtracking==0 ) {
					TOK_CTL_SPEC11_tree = (Object)adaptor.create(TOK_CTL_SPEC11);
					root_0 = (Object)adaptor.becomeRoot(TOK_CTL_SPEC11_tree, root_0);
				}
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_spec482);
				ctl_root_expr12=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ctl_root_expr12.getTree());
				pushFollow(FOLLOW_optsemi_in_ctl_spec484);
				optsemi13=optsemi();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ctl_root_expr12.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if (!er() && (retval.ret instanceof InternalSpecBDD)) ((InternalSpecBDD) retval.ret).evalBDDExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_spec

	public static class ltl_spec_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_spec
	// F:\\StudyAntlr\\SPC.g:171:1: ltl_spec returns [InternalSpec ret] : TOK_LTL_SPEC ltl_root_expr optsemi ;
	public final ltl_spec_return ltl_spec() throws RecognitionException {
		ltl_spec_return retval = new ltl_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LTL_SPEC14=null;
		ltl_root_expr_return ltl_root_expr15 = null;

		optsemi_return optsemi16 = null;


		Object TOK_LTL_SPEC14_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:173:9: ( TOK_LTL_SPEC ltl_root_expr optsemi )
			// F:\\StudyAntlr\\SPC.g:173:11: TOK_LTL_SPEC ltl_root_expr optsemi
			{
				root_0 = (Object)adaptor.nil();

				TOK_LTL_SPEC14=(Token)input.LT(1);
				match(input,TOK_LTL_SPEC,FOLLOW_TOK_LTL_SPEC_in_ltl_spec523); if (failed) return retval;
				if ( backtracking==0 ) {
					TOK_LTL_SPEC14_tree = (Object)adaptor.create(TOK_LTL_SPEC14);
					root_0 = (Object)adaptor.becomeRoot(TOK_LTL_SPEC14_tree, root_0);
				}
				pushFollow(FOLLOW_ltl_root_expr_in_ltl_spec526);
				ltl_root_expr15=ltl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ltl_root_expr15.getTree());
				pushFollow(FOLLOW_optsemi_in_ltl_spec528);
				optsemi16=optsemi();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ltl_root_expr15.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if (!er() && (retval.ret instanceof InternalSpecBDD)) ((InternalSpecBDD) retval.ret).evalBDDExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_spec

	public static class ctls_spec_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_spec
	// F:\\StudyAntlr\\SPC.g:175:1: ctls_spec returns [InternalSpec ret] : TOK_CTL_STAR_SPEC ctls_root_expr optsemi ;
	public final ctls_spec_return ctls_spec() throws RecognitionException {
		ctls_spec_return retval = new ctls_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_CTL_STAR_SPEC17=null;
		ctls_root_expr_return ctls_root_expr18 = null;

		optsemi_return optsemi19 = null;


		Object TOK_CTL_STAR_SPEC17_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:177:9: ( TOK_CTL_STAR_SPEC ctls_root_expr optsemi )
			// F:\\StudyAntlr\\SPC.g:177:11: TOK_CTL_STAR_SPEC ctls_root_expr optsemi
			{
				root_0 = (Object)adaptor.nil();

				TOK_CTL_STAR_SPEC17=(Token)input.LT(1);
				match(input,TOK_CTL_STAR_SPEC,FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec567); if (failed) return retval;
				if ( backtracking==0 ) {
					TOK_CTL_STAR_SPEC17_tree = (Object)adaptor.create(TOK_CTL_STAR_SPEC17);
					root_0 = (Object)adaptor.becomeRoot(TOK_CTL_STAR_SPEC17_tree, root_0);
				}
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_spec570);
				ctls_root_expr18=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ctls_root_expr18.getTree());
				pushFollow(FOLLOW_optsemi_in_ctls_spec572);
				optsemi19=optsemi();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ctls_root_expr18.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if (!er() && (retval.ret instanceof InternalSpecBDD)) ((InternalSpecBDD) retval.ret).evalBDDExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_spec

	public static class simple_root_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start simple_root_expr
	// F:\\StudyAntlr\\SPC.g:186:1: simple_root_expr returns [InternalSpec ret] : implies_expr ;
	public final simple_root_expr_return simple_root_expr() throws RecognitionException {
		simple_root_expr_return retval = new simple_root_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		implies_expr_return implies_expr20 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:187:9: ( implies_expr )
			// F:\\StudyAntlr\\SPC.g:187:11: implies_expr
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_implies_expr_in_simple_root_expr614);
				implies_expr20=implies_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, implies_expr20.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret = implies_expr20.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end simple_root_expr

	public static class implies_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start implies_expr
	// F:\\StudyAntlr\\SPC.g:189:1: implies_expr returns [InternalSpec ret] : f= iff_expr (op= TOK_IMPLIES s= implies_expr )? ;
	public final implies_expr_return implies_expr() throws RecognitionException {
		implies_expr_return retval = new implies_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		iff_expr_return f = null;

		implies_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:192:9: (f= iff_expr (op= TOK_IMPLIES s= implies_expr )? )
			// F:\\StudyAntlr\\SPC.g:192:11: f= iff_expr (op= TOK_IMPLIES s= implies_expr )?
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_iff_expr_in_implies_expr658);
				f=iff_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:193:9: (op= TOK_IMPLIES s= implies_expr )?
				int alt4=2;
				int LA4_0 = input.LA(1);

				if ( (LA4_0==TOK_IMPLIES) ) {
					alt4=1;
				}
				switch (alt4) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:193:11: op= TOK_IMPLIES s= implies_expr
					{
						op=(Token)input.LT(1);
						match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_implies_expr674); if (failed) return retval;
						if ( backtracking==0 ) {
							op_tree = (Object)adaptor.create(op);
							root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
						}
						pushFollow(FOLLOW_implies_expr_in_implies_expr679);
						s=implies_expr();
						_fsp--;
						if (failed) return retval;
						if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
						if ( backtracking==0 ) {
							if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_imply(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
						}

					}
					break;

				}


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end implies_expr

	public static class iff_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start iff_expr
	// F:\\StudyAntlr\\SPC.g:197:1: iff_expr returns [InternalSpec ret] : f= or_expr (op= TOK_IFF s= or_expr )* ;
	public final iff_expr_return iff_expr() throws RecognitionException {
		iff_expr_return retval = new iff_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		or_expr_return f = null;

		or_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:200:9: (f= or_expr (op= TOK_IFF s= or_expr )* )
			// F:\\StudyAntlr\\SPC.g:200:11: f= or_expr (op= TOK_IFF s= or_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_or_expr_in_iff_expr745);
				f=or_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:201:9: (op= TOK_IFF s= or_expr )*
				loop5:
				do {
					int alt5=2;
					int LA5_0 = input.LA(1);

					if ( (LA5_0==TOK_IFF) ) {
						alt5=1;
					}


					switch (alt5) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:201:11: op= TOK_IFF s= or_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_IFF,FOLLOW_TOK_IFF_in_iff_expr761); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_or_expr_in_iff_expr766);
							s=or_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_iff(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop5;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end iff_expr

	public static class or_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start or_expr
	// F:\\StudyAntlr\\SPC.g:205:1: or_expr returns [InternalSpec ret] : f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* ;
	public final or_expr_return or_expr() throws RecognitionException {
		or_expr_return retval = new or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		and_expr_return f = null;

		and_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:208:9: (f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* )
			// F:\\StudyAntlr\\SPC.g:208:11: f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_and_expr_in_or_expr831);
				f=and_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:209:9: (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
				loop6:
				do {
					int alt6=4;
					switch ( input.LA(1) ) {
						case TOK_OR:
						{
							alt6=1;
						}
						break;
						case TOK_XOR:
						{
							alt6=2;
						}
						break;
						case TOK_XNOR:
						{
							alt6=3;
						}
						break;

					}

					switch (alt6) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:209:11: op= TOK_OR s= and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_OR,FOLLOW_TOK_OR_in_or_expr847); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_and_expr_in_or_expr852);
							s=and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_or(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:211:11: op= TOK_XOR s= and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XOR,FOLLOW_TOK_XOR_in_or_expr876); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_and_expr_in_or_expr881);
							s=and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:213:11: op= TOK_XNOR s= and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_or_expr905); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_and_expr_in_or_expr910);
							s=and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xnor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop6;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end or_expr

	public static class and_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start and_expr
	// F:\\StudyAntlr\\SPC.g:217:1: and_expr returns [InternalSpec ret] : f= relational_expr (op= TOK_AND s= relational_expr )* ;
	public final and_expr_return and_expr() throws RecognitionException {
		and_expr_return retval = new and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		relational_expr_return f = null;

		relational_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:220:9: (f= relational_expr (op= TOK_AND s= relational_expr )* )
			// F:\\StudyAntlr\\SPC.g:220:11: f= relational_expr (op= TOK_AND s= relational_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_relational_expr_in_and_expr974);
				f=relational_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:221:9: (op= TOK_AND s= relational_expr )*
				loop7:
				do {
					int alt7=2;
					int LA7_0 = input.LA(1);

					if ( (LA7_0==TOK_AND) ) {
						alt7=1;
					}


					switch (alt7) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:221:11: op= TOK_AND s= relational_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_AND,FOLLOW_TOK_AND_in_and_expr990); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_relational_expr_in_and_expr995);
							s=relational_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_and(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop7;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end and_expr

	public static class relational_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start relational_expr
	// F:\\StudyAntlr\\SPC.g:225:1: relational_expr returns [InternalSpec ret] : f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* ;
	public final relational_expr_return relational_expr() throws RecognitionException {
		relational_expr_return retval = new relational_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		in_expr_return f = null;

		in_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:228:9: (f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* )
			// F:\\StudyAntlr\\SPC.g:228:11: f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_in_expr_in_relational_expr1058);
				f=in_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:229:9: (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
				loop8:
				do {
					int alt8=7;
					switch ( input.LA(1) ) {
						case TOK_EQUAL:
						{
							alt8=1;
						}
						break;
						case TOK_NOTEQUAL:
						{
							alt8=2;
						}
						break;
						case TOK_LT:
						{
							alt8=3;
						}
						break;
						case TOK_GT:
						{
							alt8=4;
						}
						break;
						case TOK_LE:
						{
							alt8=5;
						}
						break;
						case TOK_GE:
						{
							alt8=6;
						}
						break;

					}

					switch (alt8) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:229:11: op= TOK_EQUAL s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_relational_expr1074); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1079);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_eq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:231:11: op= TOK_NOTEQUAL s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_relational_expr1103); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1108);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_neq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:233:11: op= TOK_LT s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LT,FOLLOW_TOK_LT_in_relational_expr1132); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1137);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:235:11: op= TOK_GT s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GT,FOLLOW_TOK_GT_in_relational_expr1161); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1166);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_gt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 5 :
							// F:\\StudyAntlr\\SPC.g:237:11: op= TOK_LE s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LE,FOLLOW_TOK_LE_in_relational_expr1190); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1195);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_le(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 6 :
							// F:\\StudyAntlr\\SPC.g:239:11: op= TOK_GE s= in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GE,FOLLOW_TOK_GE_in_relational_expr1219); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_in_expr_in_relational_expr1224);
							s=in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ge(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop8;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end relational_expr

	public static class in_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start in_expr
	// F:\\StudyAntlr\\SPC.g:243:1: in_expr returns [InternalSpec ret] : f= union_expr (op= TOK_SETIN s= union_expr )* ;
	public final in_expr_return in_expr() throws RecognitionException {
		in_expr_return retval = new in_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		union_expr_return f = null;

		union_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:246:9: (f= union_expr (op= TOK_SETIN s= union_expr )* )
			// F:\\StudyAntlr\\SPC.g:246:11: f= union_expr (op= TOK_SETIN s= union_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_union_expr_in_in_expr1289);
				f=union_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:247:9: (op= TOK_SETIN s= union_expr )*
				loop9:
				do {
					int alt9=2;
					int LA9_0 = input.LA(1);

					if ( (LA9_0==TOK_SETIN) ) {
						alt9=1;
					}


					switch (alt9) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:247:11: op= TOK_SETIN s= union_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_in_expr1305); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_union_expr_in_in_expr1310);
							s=union_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_setin(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop9;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end in_expr

	public static class union_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start union_expr
	// F:\\StudyAntlr\\SPC.g:251:1: union_expr returns [InternalSpec ret] : f= set_expr (op= TOK_UNION s= set_expr )* ;
	public final union_expr_return union_expr() throws RecognitionException {
		union_expr_return retval = new union_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		set_expr_return f = null;

		set_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:254:9: (f= set_expr (op= TOK_UNION s= set_expr )* )
			// F:\\StudyAntlr\\SPC.g:254:11: f= set_expr (op= TOK_UNION s= set_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_set_expr_in_union_expr1374);
				f=set_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:255:9: (op= TOK_UNION s= set_expr )*
				loop10:
				do {
					int alt10=2;
					int LA10_0 = input.LA(1);

					if ( (LA10_0==TOK_UNION) ) {
						alt10=1;
					}


					switch (alt10) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:255:11: op= TOK_UNION s= set_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNION,FOLLOW_TOK_UNION_in_union_expr1390); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_set_expr_in_union_expr1395);
							s=set_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_union(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop10;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end union_expr

	public static class set_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start set_expr
	// F:\\StudyAntlr\\SPC.g:259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );
	public final set_expr_return set_expr() throws RecognitionException {
		set_expr_return retval = new set_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LCB23=null;
		Token TOK_RCB25=null;
		shift_expr_return shift_expr21 = null;

		subrange_return subrange22 = null;

		set_list_expr_return set_list_expr24 = null;


		Object TOK_LCB23_tree=null;
		Object TOK_RCB25_tree=null;
		RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
		RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
		RewriteRuleSubtreeStream stream_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule set_list_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:262:9: ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) )
			int alt11=3;
			switch ( input.LA(1) ) {
				case TOK_NOT:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt11=1;
				}
				break;
				case TOK_NUMBER:
				{
					int LA11_2 = input.LA(2);

					if ( (LA11_2==EOF||(LA11_2>=TOK_INVAR_SPEC && LA11_2<=TOK_UNION)||(LA11_2>=TOK_RCB && LA11_2<=TOK_CONCATENATION)||LA11_2==TOK_RP||LA11_2==TOK_LB||LA11_2==TOK_RB||LA11_2==TOK_DOT||(LA11_2>=TOK_COLON && LA11_2<=TOK_SEMI)) ) {
						alt11=1;
					}
					else if ( (LA11_2==TOK_TWODOTS) ) {
						alt11=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 2, input);

						throw nvae;
					}
				}
				break;
				case TOK_PLUS:
				{
					int LA11_3 = input.LA(2);

					if ( (LA11_3==TOK_NUMBER) ) {
						int LA11_7 = input.LA(3);

						if ( (LA11_7==EOF||(LA11_7>=TOK_INVAR_SPEC && LA11_7<=TOK_UNION)||(LA11_7>=TOK_RCB && LA11_7<=TOK_CONCATENATION)||LA11_7==TOK_RP||LA11_7==TOK_LB||LA11_7==TOK_RB||LA11_7==TOK_DOT||(LA11_7>=TOK_COLON && LA11_7<=TOK_SEMI)) ) {
							alt11=1;
						}
						else if ( (LA11_7==TOK_TWODOTS) ) {
							alt11=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 7, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_MINUS:
				{
					int LA11_4 = input.LA(2);

					if ( (LA11_4==TOK_NUMBER) ) {
						int LA11_8 = input.LA(3);

						if ( (LA11_8==EOF||(LA11_8>=TOK_INVAR_SPEC && LA11_8<=TOK_UNION)||(LA11_8>=TOK_RCB && LA11_8<=TOK_CONCATENATION)||LA11_8==TOK_RP||LA11_8==TOK_LB||LA11_8==TOK_RB||LA11_8==TOK_DOT||(LA11_8>=TOK_COLON && LA11_8<=TOK_SEMI)) ) {
							alt11=1;
						}
						else if ( (LA11_8==TOK_TWODOTS) ) {
							alt11=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 8, input);

							throw nvae;
						}
					}
					else if ( ((LA11_4>=TOK_PLUS && LA11_4<=TOK_MINUS)||(LA11_4>=TOK_NOT && LA11_4<=TOK_LP)||(LA11_4>=TOK_BOOL && LA11_4<=TOK_CASE)||(LA11_4>=TOK_WAREAD && LA11_4<=TOK_WAWRITE)||LA11_4==TOK_ATOM||LA11_4==TOK_NUMBER_WORD||(LA11_4>=TOK_FALSEEXP && LA11_4<=TOK_TRUEEXP)) ) {
						alt11=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 4, input);

						throw nvae;
					}
				}
				break;
				case TOK_LCB:
				{
					alt11=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("259:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 0, input);

					throw nvae;
			}

			switch (alt11) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:262:11: shift_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_shift_expr_in_set_expr1457);
					shift_expr21=shift_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, shift_expr21.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = shift_expr21.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:264:11: subrange
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_subrange_in_set_expr1479);
					subrange22=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, subrange22.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange22.start,subrange22.stop));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:266:11: TOK_LCB set_list_expr TOK_RCB
				{
					TOK_LCB23=(Token)input.LT(1);
					match(input,TOK_LCB,FOLLOW_TOK_LCB_in_set_expr1501); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB23);

					pushFollow(FOLLOW_set_list_expr_in_set_expr1503);
					set_list_expr24=set_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_set_list_expr.add(set_list_expr24.getTree());
					TOK_RCB25=(Token)input.LT(1);
					match(input,TOK_RCB,FOLLOW_TOK_RCB_in_set_expr1505); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB25);

					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB23.getText() + " " + input.toString(set_list_expr24.start,set_list_expr24.stop) + " " + TOK_RCB25.getText());
					}

					// AST REWRITE
					// elements: set_list_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 268:9: -> ^( SET_LIST_EXP_T set_list_expr )
						{
							// F:\\StudyAntlr\\SPC.g:268:12: ^( SET_LIST_EXP_T set_list_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

								adaptor.addChild(root_1, stream_set_list_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end set_expr

	public static class set_list_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start set_list_expr
	// F:\\StudyAntlr\\SPC.g:270:1: set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
	public final set_list_expr_return set_list_expr() throws RecognitionException {
		set_list_expr_return retval = new set_list_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_COMMA27=null;
		simple_root_expr_return simple_root_expr26 = null;

		simple_root_expr_return simple_root_expr28 = null;


		Object TOK_COMMA27_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:271:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
			// F:\\StudyAntlr\\SPC.g:271:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1559);
				simple_root_expr26=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr26.getTree());
				// F:\\StudyAntlr\\SPC.g:271:28: ( TOK_COMMA simple_root_expr )*
				loop12:
				do {
					int alt12=2;
					int LA12_0 = input.LA(1);

					if ( (LA12_0==TOK_COMMA) ) {
						alt12=1;
					}


					switch (alt12) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:271:29: TOK_COMMA simple_root_expr
						{
							TOK_COMMA27=(Token)input.LT(1);
							match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_set_list_expr1562); if (failed) return retval;
							pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1565);
							simple_root_expr28=simple_root_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr28.getTree());

						}
						break;

						default :
							break loop12;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end set_list_expr

	public static class shift_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start shift_expr
	// F:\\StudyAntlr\\SPC.g:273:1: shift_expr returns [InternalSpec ret] : f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* ;
	public final shift_expr_return shift_expr() throws RecognitionException {
		shift_expr_return retval = new shift_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		remainder_expr_return f = null;

		remainder_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:276:9: (f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* )
			// F:\\StudyAntlr\\SPC.g:276:11: f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_remainder_expr_in_shift_expr1610);
				f=remainder_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:277:9: (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
				loop13:
				do {
					int alt13=3;
					int LA13_0 = input.LA(1);

					if ( (LA13_0==TOK_LSHIFT) ) {
						alt13=1;
					}
					else if ( (LA13_0==TOK_RSHIFT) ) {
						alt13=2;
					}


					switch (alt13) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:277:11: op= TOK_LSHIFT s= remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_shift_expr1626); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_remainder_expr_in_shift_expr1631);
							s=remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:279:11: op= TOK_RSHIFT s= remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_shift_expr1655); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_remainder_expr_in_shift_expr1660);
							s=remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_rshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop13;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end shift_expr

	public static class remainder_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start remainder_expr
	// F:\\StudyAntlr\\SPC.g:283:1: remainder_expr returns [InternalSpec ret] : f= additive_expr (op= TOK_MOD s= additive_expr )* ;
	public final remainder_expr_return remainder_expr() throws RecognitionException {
		remainder_expr_return retval = new remainder_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		additive_expr_return f = null;

		additive_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:286:9: (f= additive_expr (op= TOK_MOD s= additive_expr )* )
			// F:\\StudyAntlr\\SPC.g:286:11: f= additive_expr (op= TOK_MOD s= additive_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_additive_expr_in_remainder_expr1723);
				f=additive_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:287:9: (op= TOK_MOD s= additive_expr )*
				loop14:
				do {
					int alt14=2;
					int LA14_0 = input.LA(1);

					if ( (LA14_0==TOK_MOD) ) {
						alt14=1;
					}


					switch (alt14) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:287:11: op= TOK_MOD s= additive_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MOD,FOLLOW_TOK_MOD_in_remainder_expr1739); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_additive_expr_in_remainder_expr1744);
							s=additive_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_mod(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop14;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end remainder_expr

	public static class additive_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start additive_expr
	// F:\\StudyAntlr\\SPC.g:291:1: additive_expr returns [InternalSpec ret] : f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* ;
	public final additive_expr_return additive_expr() throws RecognitionException {
		additive_expr_return retval = new additive_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		multiplicative_expr_return f = null;

		multiplicative_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:294:9: (f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* )
			// F:\\StudyAntlr\\SPC.g:294:11: f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1807);
				f=multiplicative_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:295:9: (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
				loop15:
				do {
					int alt15=3;
					int LA15_0 = input.LA(1);

					if ( (LA15_0==TOK_PLUS) ) {
						alt15=1;
					}
					else if ( (LA15_0==TOK_MINUS) ) {
						alt15=2;
					}


					switch (alt15) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:295:11: op= TOK_PLUS s= multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_additive_expr1823); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1828);
							s=multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_plus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:297:11: op= TOK_MINUS s= multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_additive_expr1852); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1857);
							s=multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_minus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop15;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end additive_expr

	public static class multiplicative_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start multiplicative_expr
	// F:\\StudyAntlr\\SPC.g:301:1: multiplicative_expr returns [InternalSpec ret] : f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* ;
	public final multiplicative_expr_return multiplicative_expr() throws RecognitionException {
		multiplicative_expr_return retval = new multiplicative_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		concatination_expr_return f = null;

		concatination_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:304:9: (f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* )
			// F:\\StudyAntlr\\SPC.g:304:11: f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1919);
				f=concatination_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:305:9: (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
				loop16:
				do {
					int alt16=3;
					int LA16_0 = input.LA(1);

					if ( (LA16_0==TOK_TIMES) ) {
						alt16=1;
					}
					else if ( (LA16_0==TOK_DIVIDE) ) {
						alt16=2;
					}


					switch (alt16) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:305:11: op= TOK_TIMES s= concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_multiplicative_expr1935); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1940);
							s=concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_times(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:307:11: op= TOK_DIVIDE s= concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_multiplicative_expr1964); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1969);
							s=concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_divide(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop16;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end multiplicative_expr

	public static class concatination_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start concatination_expr
	// F:\\StudyAntlr\\SPC.g:311:1: concatination_expr returns [InternalSpec ret] : f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* ;
	public final concatination_expr_return concatination_expr() throws RecognitionException {
		concatination_expr_return retval = new concatination_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		primary_expr_return f = null;

		primary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:314:9: (f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* )
			// F:\\StudyAntlr\\SPC.g:314:11: f= primary_expr (op= TOK_CONCATENATION s= primary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_primary_expr_in_concatination_expr2031);
				f=primary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:315:9: (op= TOK_CONCATENATION s= primary_expr )*
				loop17:
				do {
					int alt17=2;
					int LA17_0 = input.LA(1);

					if ( (LA17_0==TOK_CONCATENATION) ) {
						alt17=1;
					}


					switch (alt17) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:315:11: op= TOK_CONCATENATION s= primary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_concatination_expr2047); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_primary_expr_in_concatination_expr2052);
							s=primary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += op.getText() + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_concatenation(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop17;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end concatination_expr

	public static class primary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr
	// F:\\StudyAntlr\\SPC.g:320:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );
	public final primary_expr_return primary_expr() throws RecognitionException {
		primary_expr_return retval = new primary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		primary_expr_return v = null;

		primary_expr_helper1_return primary_expr_helper129 = null;


		Object op_tree=null;
		RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
		RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
		RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:323:9: ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) )
			int alt18=3;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt18=1;
				}
				break;
				case TOK_MINUS:
				{
					alt18=2;
				}
				break;
				case TOK_NOT:
				{
					alt18=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("320:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );", 18, 0, input);

					throw nvae;
			}

			switch (alt18) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:323:11: primary_expr_helper1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_helper1_in_primary_expr2114);
					primary_expr_helper129=primary_expr_helper1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper129.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = primary_expr_helper129.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:327:11: op= TOK_MINUS v= primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_primary_expr2156); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_MINUS.add(op);

					pushFollow(FOLLOW_primary_expr_in_primary_expr2160);
					v=primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_unary_minus(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: primary_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 329:9: -> ^( TOK_UNARY_MINUS_T primary_expr )
						{
							// F:\\StudyAntlr\\SPC.g:329:12: ^( TOK_UNARY_MINUS_T primary_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

								adaptor.addChild(root_1, stream_primary_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:330:11: op= TOK_NOT v= primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_primary_expr2200); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NOT.add(op);

					pushFollow(FOLLOW_primary_expr_in_primary_expr2204);
					v=primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: TOK_NOT, primary_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 332:9: -> ^( TOK_NOT primary_expr )
						{
							// F:\\StudyAntlr\\SPC.g:332:12: ^( TOK_NOT primary_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

								adaptor.addChild(root_1, stream_primary_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr

	public static class primary_expr_helper1_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_helper1
	// F:\\StudyAntlr\\SPC.g:335:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );
	public final primary_expr_helper1_return primary_expr_helper1() throws RecognitionException {
		primary_expr_helper1_return retval = new primary_expr_helper1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LP33=null;
		Token TOK_RP35=null;
		Token TOK_BOOL37=null;
		Token TOK_LP38=null;
		Token TOK_RP40=null;
		Token TOK_WORD142=null;
		Token TOK_LP43=null;
		Token TOK_RP45=null;
		Token TOK_NEXT47=null;
		Token TOK_LP48=null;
		Token TOK_RP50=null;
		Token TOK_CASE52=null;
		Token TOK_ESAC54=null;
		Token TOK_WAREAD56=null;
		Token TOK_LP57=null;
		Token TOK_COMMA59=null;
		Token TOK_RP61=null;
		Token TOK_WAWRITE63=null;
		Token TOK_LP64=null;
		Token TOK_COMMA66=null;
		Token TOK_COMMA68=null;
		Token TOK_RP70=null;
		constant_return constant30 = null;

		primary_expr_select_return primary_expr_select31 = null;

		primary_expr_helper1_pointer1_return primary_expr_helper1_pointer132 = null;

		simple_root_expr_return simple_root_expr34 = null;

		primary_expr_select_return primary_expr_select36 = null;

		simple_root_expr_return simple_root_expr39 = null;

		primary_expr_select_return primary_expr_select41 = null;

		simple_root_expr_return simple_root_expr44 = null;

		primary_expr_select_return primary_expr_select46 = null;

		simple_root_expr_return simple_root_expr49 = null;

		primary_expr_select_return primary_expr_select51 = null;

		case_element_list_expr_return case_element_list_expr53 = null;

		primary_expr_select_return primary_expr_select55 = null;

		simple_root_expr_return simple_root_expr58 = null;

		simple_root_expr_return simple_root_expr60 = null;

		primary_expr_select_return primary_expr_select62 = null;

		simple_root_expr_return simple_root_expr65 = null;

		simple_root_expr_return simple_root_expr67 = null;

		simple_root_expr_return simple_root_expr69 = null;

		primary_expr_select_return primary_expr_select71 = null;


		Object TOK_LP33_tree=null;
		Object TOK_RP35_tree=null;
		Object TOK_BOOL37_tree=null;
		Object TOK_LP38_tree=null;
		Object TOK_RP40_tree=null;
		Object TOK_WORD142_tree=null;
		Object TOK_LP43_tree=null;
		Object TOK_RP45_tree=null;
		Object TOK_NEXT47_tree=null;
		Object TOK_LP48_tree=null;
		Object TOK_RP50_tree=null;
		Object TOK_CASE52_tree=null;
		Object TOK_ESAC54_tree=null;
		Object TOK_WAREAD56_tree=null;
		Object TOK_LP57_tree=null;
		Object TOK_COMMA59_tree=null;
		Object TOK_RP61_tree=null;
		Object TOK_WAWRITE63_tree=null;
		Object TOK_LP64_tree=null;
		Object TOK_COMMA66_tree=null;
		Object TOK_COMMA68_tree=null;
		Object TOK_RP70_tree=null;
		RewriteRuleTokenStream stream_TOK_LP=new RewriteRuleTokenStream(adaptor,"token TOK_LP");
		RewriteRuleTokenStream stream_TOK_WAREAD=new RewriteRuleTokenStream(adaptor,"token TOK_WAREAD");
		RewriteRuleTokenStream stream_TOK_COMMA=new RewriteRuleTokenStream(adaptor,"token TOK_COMMA");
		RewriteRuleTokenStream stream_TOK_WORD1=new RewriteRuleTokenStream(adaptor,"token TOK_WORD1");
		RewriteRuleTokenStream stream_TOK_ESAC=new RewriteRuleTokenStream(adaptor,"token TOK_ESAC");
		RewriteRuleTokenStream stream_TOK_NEXT=new RewriteRuleTokenStream(adaptor,"token TOK_NEXT");
		RewriteRuleTokenStream stream_TOK_CASE=new RewriteRuleTokenStream(adaptor,"token TOK_CASE");
		RewriteRuleTokenStream stream_TOK_WAWRITE=new RewriteRuleTokenStream(adaptor,"token TOK_WAWRITE");
		RewriteRuleTokenStream stream_TOK_BOOL=new RewriteRuleTokenStream(adaptor,"token TOK_BOOL");
		RewriteRuleTokenStream stream_TOK_RP=new RewriteRuleTokenStream(adaptor,"token TOK_RP");
		RewriteRuleSubtreeStream stream_case_element_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_element_list_expr");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:338:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) )
			int alt19=9;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt19=1;
				}
				break;
				case TOK_ATOM:
				{
					alt19=2;
				}
				break;
				case TOK_LP:
				{
					alt19=3;
				}
				break;
				case TOK_BOOL:
				{
					alt19=4;
				}
				break;
				case TOK_WORD1:
				{
					alt19=5;
				}
				break;
				case TOK_NEXT:
				{
					alt19=6;
				}
				break;
				case TOK_CASE:
				{
					alt19=7;
				}
				break;
				case TOK_WAREAD:
				{
					alt19=8;
				}
				break;
				case TOK_WAWRITE:
				{
					alt19=9;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("335:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );", 19, 0, input);

					throw nvae;
			}

			switch (alt19) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:338:11: constant primary_expr_select
				{
					pushFollow(FOLLOW_constant_in_primary_expr_helper12269);
					constant30=constant();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_constant.add(constant30.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12271);
					primary_expr_select31=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select31.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, constant
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 340:9: -> ^( VALUE_T constant NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:340:12: ^( VALUE_T constant NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

								adaptor.addChild(root_1, stream_constant.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:341:11: primary_expr_helper1_pointer1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12313);
					primary_expr_helper1_pointer132=primary_expr_helper1_pointer1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer132.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:346:11: TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_LP33=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12346); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP33);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12348);
					simple_root_expr34=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr34.getTree());
					TOK_RP35=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12350); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP35);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12352);
					primary_expr_select36=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select36.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 348:9: -> ^( BLOCK_T simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:348:12: ^( BLOCK_T simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:349:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_BOOL37=(Token)input.LT(1);
					match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_primary_expr_helper12394); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL37);

					TOK_LP38=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12397); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP38);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12399);
					simple_root_expr39=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr39.getTree());
					TOK_RP40=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12401); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP40);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12403);
					primary_expr_select41=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select41.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: simple_root_expr, primary_expr_select, TOK_BOOL
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 351:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:351:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:352:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WORD142=(Token)input.LT(1);
					match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_primary_expr_helper12446); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD142);

					TOK_LP43=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12448); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP43);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12450);
					simple_root_expr44=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr44.getTree());
					TOK_RP45=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12452); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP45);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12454);
					primary_expr_select46=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select46.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, TOK_WORD1, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 354:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:354:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:355:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_NEXT47=(Token)input.LT(1);
					match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_primary_expr_helper12496); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT47);

					TOK_LP48=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12498); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP48);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12500);
					simple_root_expr49=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr49.getTree());
					TOK_RP50=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12502); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP50);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12504);
					primary_expr_select51=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select51.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, simple_root_expr, TOK_NEXT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 357:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:357:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:358:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
				{
					TOK_CASE52=(Token)input.LT(1);
					match(input,TOK_CASE,FOLLOW_TOK_CASE_in_primary_expr_helper12546); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE52);

					pushFollow(FOLLOW_case_element_list_expr_in_primary_expr_helper12548);
					case_element_list_expr53=case_element_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr53.getTree());
					TOK_ESAC54=(Token)input.LT(1);
					match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_primary_expr_helper12550); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC54);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12552);
					primary_expr_select55=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select55.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: case_element_list_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 360:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:360:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

								adaptor.addChild(root_1, stream_case_element_list_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:361:11: TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAREAD56=(Token)input.LT(1);
					match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_primary_expr_helper12594); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD56);

					TOK_LP57=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12596); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP57);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12598);
					simple_root_expr58=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr58.getTree());
					TOK_COMMA59=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12600); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA59);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12602);
					simple_root_expr60=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr60.getTree());
					TOK_RP61=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12604); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP61);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12606);
					primary_expr_select62=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select62.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: simple_root_expr, TOK_WAREAD, primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 363:9: -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:363:12: ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:364:11: TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAWRITE63=(Token)input.LT(1);
					match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_primary_expr_helper12650); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE63);

					TOK_LP64=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12652); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP64);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12654);
					simple_root_expr65=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr65.getTree());
					TOK_COMMA66=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12656); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA66);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12658);
					simple_root_expr67=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr67.getTree());
					TOK_COMMA68=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12660); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA68);

					pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12662);
					simple_root_expr69=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr69.getTree());
					TOK_RP70=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12664); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP70);

					pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12666);
					primary_expr_select71=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select71.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: simple_root_expr, TOK_WAWRITE, simple_root_expr, primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 366:9: -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:366:12: ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_helper1

	public static class ctl_root_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_root_expr
	// F:\\StudyAntlr\\SPC.g:372:1: ctl_root_expr returns [InternalSpec ret] : ctl_implies_expr ;
	public final ctl_root_expr_return ctl_root_expr() throws RecognitionException {
		ctl_root_expr_return retval = new ctl_root_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctl_implies_expr_return ctl_implies_expr72 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:373:9: ( ctl_implies_expr )
			// F:\\StudyAntlr\\SPC.g:373:11: ctl_implies_expr
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_implies_expr_in_ctl_root_expr2734);
				ctl_implies_expr72=ctl_implies_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ctl_implies_expr72.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ctl_implies_expr72.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_root_expr

	public static class ctl_implies_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_implies_expr
	// F:\\StudyAntlr\\SPC.g:375:1: ctl_implies_expr returns [InternalSpec ret] : f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? ;
	public final ctl_implies_expr_return ctl_implies_expr() throws RecognitionException {
		ctl_implies_expr_return retval = new ctl_implies_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_iff_expr_return f = null;

		ctl_implies_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:378:9: (f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? )
			// F:\\StudyAntlr\\SPC.g:378:11: f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )?
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_iff_expr_in_ctl_implies_expr2777);
				f=ctl_iff_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:379:9: (op= TOK_IMPLIES s= ctl_implies_expr )?
				int alt20=2;
				int LA20_0 = input.LA(1);

				if ( (LA20_0==TOK_IMPLIES) ) {
					alt20=1;
				}
				switch (alt20) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:379:11: op= TOK_IMPLIES s= ctl_implies_expr
					{
						op=(Token)input.LT(1);
						match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2793); if (failed) return retval;
						if ( backtracking==0 ) {
							op_tree = (Object)adaptor.create(op);
							root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
						}
						pushFollow(FOLLOW_ctl_implies_expr_in_ctl_implies_expr2798);
						s=ctl_implies_expr();
						_fsp--;
						if (failed) return retval;
						if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
						if ( backtracking==0 ) {
							if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_imply(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
						}

					}
					break;

				}


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_implies_expr

	public static class ctl_iff_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_iff_expr
	// F:\\StudyAntlr\\SPC.g:383:1: ctl_iff_expr returns [InternalSpec ret] : f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* ;
	public final ctl_iff_expr_return ctl_iff_expr() throws RecognitionException {
		ctl_iff_expr_return retval = new ctl_iff_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_or_expr_return f = null;

		ctl_or_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:386:9: (f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* )
			// F:\\StudyAntlr\\SPC.g:386:11: f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2863);
				f=ctl_or_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:387:9: (op= TOK_IFF s= ctl_or_expr )*
				loop21:
				do {
					int alt21=2;
					int LA21_0 = input.LA(1);

					if ( (LA21_0==TOK_IFF) ) {
						alt21=1;
					}


					switch (alt21) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:387:11: op= TOK_IFF s= ctl_or_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctl_iff_expr2879); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2884);
							s=ctl_or_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_iff(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop21;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_iff_expr

	public static class ctl_or_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_or_expr
	// F:\\StudyAntlr\\SPC.g:391:1: ctl_or_expr returns [InternalSpec ret] : f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* ;
	public final ctl_or_expr_return ctl_or_expr() throws RecognitionException {
		ctl_or_expr_return retval = new ctl_or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_and_expr_return f = null;

		ctl_and_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:394:9: (f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* )
			// F:\\StudyAntlr\\SPC.g:394:11: f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2948);
				f=ctl_and_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:395:9: (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
				loop22:
				do {
					int alt22=4;
					switch ( input.LA(1) ) {
						case TOK_OR:
						{
							alt22=1;
						}
						break;
						case TOK_XOR:
						{
							alt22=2;
						}
						break;
						case TOK_XNOR:
						{
							alt22=3;
						}
						break;

					}

					switch (alt22) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:395:11: op= TOK_OR s= ctl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_OR,FOLLOW_TOK_OR_in_ctl_or_expr2964); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2969);
							s=ctl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_or(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:397:11: op= TOK_XOR s= ctl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctl_or_expr2993); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2998);
							s=ctl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:399:11: op= TOK_XNOR s= ctl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctl_or_expr3022); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr3027);
							s=ctl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xnor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop22;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_or_expr

	public static class ctl_and_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_and_expr
	// F:\\StudyAntlr\\SPC.g:403:1: ctl_and_expr returns [InternalSpec ret] : f= ctl_expr (op= TOK_AND s= ctl_expr )* ;
	public final ctl_and_expr_return ctl_and_expr() throws RecognitionException {
		ctl_and_expr_return retval = new ctl_and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_expr_return f = null;

		ctl_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:406:9: (f= ctl_expr (op= TOK_AND s= ctl_expr )* )
			// F:\\StudyAntlr\\SPC.g:406:11: f= ctl_expr (op= TOK_AND s= ctl_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3090);
				f=ctl_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:407:9: (op= TOK_AND s= ctl_expr )*
				loop23:
				do {
					int alt23=2;
					int LA23_0 = input.LA(1);

					if ( (LA23_0==TOK_AND) ) {
						alt23=1;
					}


					switch (alt23) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:407:11: op= TOK_AND s= ctl_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_AND,FOLLOW_TOK_AND_in_ctl_and_expr3106); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3111);
							s=ctl_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_and(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop23;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_and_expr

	public static class ctl_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_expr
	// F:\\StudyAntlr\\SPC.g:411:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );
	public final ctl_expr_return ctl_expr() throws RecognitionException {
		ctl_expr_return retval = new ctl_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		pure_ctl_expr_return pure_ctl_expr73 = null;

		ctl_relational_expr_return ctl_relational_expr74 = null;


		RewriteRuleSubtreeStream stream_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule pure_ctl_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:412:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr )
			int alt24=2;
			int LA24_0 = input.LA(1);

			if ( (LA24_0==TOK_EX) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_AX) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_EF) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_AF) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_EG) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_AG) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_AA) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_EE) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_EBF) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_ABF) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_EBG) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_ABG) && (synpred1())) {
				alt24=1;
			}
			else if ( (LA24_0==TOK_NOT) ) {
				int LA24_13 = input.LA(2);

				if ( ((LA24_13>=TOK_PLUS && LA24_13<=TOK_MINUS)||LA24_13==TOK_LP||(LA24_13>=TOK_BOOL && LA24_13<=TOK_CASE)||(LA24_13>=TOK_WAREAD && LA24_13<=TOK_WAWRITE)||LA24_13==TOK_ATOM||LA24_13==TOK_NUMBER||LA24_13==TOK_NUMBER_WORD||(LA24_13>=TOK_FALSEEXP && LA24_13<=TOK_TRUEEXP)) ) {
					alt24=2;
				}
				else if ( (LA24_13==TOK_NOT) ) {
					int LA24_15 = input.LA(3);

					if ( (synpred1()) ) {
						alt24=1;
					}
					else if ( (true) ) {
						alt24=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("411:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 15, input);

						throw nvae;
					}
				}
				else if ( (LA24_13==TOK_EX) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_AX) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_EF) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_AF) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_EG) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_AG) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_AA) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_EE) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_EBF) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_ABF) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_EBG) && (synpred1())) {
					alt24=1;
				}
				else if ( (LA24_13==TOK_ABG) && (synpred1())) {
					alt24=1;
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("411:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 13, input);

					throw nvae;
				}
			}
			else if ( (LA24_0==TOK_LCB||(LA24_0>=TOK_PLUS && LA24_0<=TOK_MINUS)||LA24_0==TOK_LP||(LA24_0>=TOK_BOOL && LA24_0<=TOK_CASE)||(LA24_0>=TOK_WAREAD && LA24_0<=TOK_WAWRITE)||LA24_0==TOK_ATOM||LA24_0==TOK_NUMBER||LA24_0==TOK_NUMBER_WORD||(LA24_0>=TOK_FALSEEXP && LA24_0<=TOK_TRUEEXP)) ) {
				alt24=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("411:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 0, input);

				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:412:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr
				{
					pushFollow(FOLLOW_pure_ctl_expr_in_ctl_expr3328);
					pure_ctl_expr73=pure_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_pure_ctl_expr.add(pure_ctl_expr73.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = pure_ctl_expr73.ret;
					}

					// AST REWRITE
					// elements: pure_ctl_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 426:11: -> ^( PURE_CTL_T pure_ctl_expr )
						{
							// F:\\StudyAntlr\\SPC.g:426:14: ^( PURE_CTL_T pure_ctl_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(PURE_CTL_T, "PURE_CTL_T"), root_1);

								adaptor.addChild(root_1, stream_pure_ctl_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:427:11: ctl_relational_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_relational_expr_in_ctl_expr3368);
					ctl_relational_expr74=ctl_relational_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_relational_expr74.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_relational_expr74.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_expr

	public static class pure_ctl_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start pure_ctl_expr
	// F:\\StudyAntlr\\SPC.g:460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );
	public final pure_ctl_expr_return pure_ctl_expr() throws RecognitionException {
		pure_ctl_expr_return retval = new pure_ctl_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_expr_return f = null;

		subrange_return fsr = null;

		ctl_expr_return s = null;

		pure_ctl_expr_return fp = null;

		ctl_au_return ctl_au75 = null;

		ctl_abu_return ctl_abu76 = null;

		ctl_eu_return ctl_eu77 = null;

		ctl_ebu_return ctl_ebu78 = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:463:9: (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr )
			int alt25=15;
			switch ( input.LA(1) ) {
				case TOK_EX:
				{
					alt25=1;
				}
				break;
				case TOK_AX:
				{
					alt25=2;
				}
				break;
				case TOK_EF:
				{
					alt25=3;
				}
				break;
				case TOK_AF:
				{
					alt25=4;
				}
				break;
				case TOK_EG:
				{
					alt25=5;
				}
				break;
				case TOK_AG:
				{
					alt25=6;
				}
				break;
				case TOK_AA:
				{
					int LA25_7 = input.LA(2);

					if ( (LA25_7==TOK_LB) ) {
						int LA25_14 = input.LA(3);

						if ( (synpred2()) ) {
							alt25=7;
						}
						else if ( (synpred3()) ) {
							alt25=8;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 14, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 7, input);

						throw nvae;
					}
				}
				break;
				case TOK_EE:
				{
					int LA25_8 = input.LA(2);

					if ( (LA25_8==TOK_LB) ) {
						int LA25_15 = input.LA(3);

						if ( (synpred4()) ) {
							alt25=9;
						}
						else if ( (synpred5()) ) {
							alt25=10;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 15, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 8, input);

						throw nvae;
					}
				}
				break;
				case TOK_EBF:
				{
					alt25=11;
				}
				break;
				case TOK_ABF:
				{
					alt25=12;
				}
				break;
				case TOK_EBG:
				{
					alt25=13;
				}
				break;
				case TOK_ABG:
				{
					alt25=14;
				}
				break;
				case TOK_NOT:
				{
					alt25=15;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("460:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 0, input);

					throw nvae;
			}

			switch (alt25) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:463:11: op= TOK_EX f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EX,FOLLOW_TOK_EX_in_pure_ctl_expr3426); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3431);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EX(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:465:11: op= TOK_AX f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AX,FOLLOW_TOK_AX_in_pure_ctl_expr3455); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3460);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AX(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:467:11: op= TOK_EF f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EF,FOLLOW_TOK_EF_in_pure_ctl_expr3484); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3489);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EF(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:469:11: op= TOK_AF f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AF,FOLLOW_TOK_AF_in_pure_ctl_expr3513); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3518);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AF(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:471:11: op= TOK_EG f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EG,FOLLOW_TOK_EG_in_pure_ctl_expr3542); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3547);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EG(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:473:11: op= TOK_AG f= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AG,FOLLOW_TOK_AG_in_pure_ctl_expr3571); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3576);
					f=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AG(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:483:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_au_in_pure_ctl_expr3682);
					ctl_au75=ctl_au();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_au75.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_au75.ret;
					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:484:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_abu_in_pure_ctl_expr3708);
					ctl_abu76=ctl_abu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_abu76.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_abu76.ret;
					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:485:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_eu_in_pure_ctl_expr3734);
					ctl_eu77=ctl_eu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_eu77.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_eu77.ret;
					}

				}
				break;
				case 10 :
					// F:\\StudyAntlr\\SPC.g:486:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_ebu_in_pure_ctl_expr3760);
					ctl_ebu78=ctl_ebu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_ebu78.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_ebu78.ret;
					}

				}
				break;
				case 11 :
					// F:\\StudyAntlr\\SPC.g:487:11: op= TOK_EBF fsr= subrange s= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EBF,FOLLOW_TOK_EBF_in_pure_ctl_expr3776); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_pure_ctl_expr3781);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3785);
					s=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBF(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 12 :
					// F:\\StudyAntlr\\SPC.g:489:11: op= TOK_ABF fsr= subrange s= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_ABF,FOLLOW_TOK_ABF_in_pure_ctl_expr3809); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_pure_ctl_expr3814);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3818);
					s=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABF(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 13 :
					// F:\\StudyAntlr\\SPC.g:491:11: op= TOK_EBG fsr= subrange s= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EBG,FOLLOW_TOK_EBG_in_pure_ctl_expr3842); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_pure_ctl_expr3847);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3851);
					s=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBG(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 14 :
					// F:\\StudyAntlr\\SPC.g:493:11: op= TOK_ABG fsr= subrange s= ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_ABG,FOLLOW_TOK_ABG_in_pure_ctl_expr3875); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_pure_ctl_expr3880);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3884);
					s=ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABG(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 15 :
					// F:\\StudyAntlr\\SPC.g:496:11: op= TOK_NOT fp= pure_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_pure_ctl_expr3918); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_pure_ctl_expr_in_pure_ctl_expr3923);
					fp=pure_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fp.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fp.start,fp.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), exp_str, fp.ret);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end pure_ctl_expr

	public static class ctl_au_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_au
	// F:\\StudyAntlr\\SPC.g:499:1: ctl_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
	public final ctl_au_return ctl_au() throws RecognitionException {
		ctl_au_return retval = new ctl_au_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctl_root_expr_return fre = null;

		ctl_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:502:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:502:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_au3977); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_au3982); if (failed) return retval;
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3987);
				fre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_au3991); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3995);
				sre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_au3999); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AU(input, ((Token)retval.start), exp_str, fre.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_au

	public static class ctl_eu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_eu
	// F:\\StudyAntlr\\SPC.g:505:1: ctl_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
	public final ctl_eu_return ctl_eu() throws RecognitionException {
		ctl_eu_return retval = new ctl_eu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctl_root_expr_return fre = null;

		ctl_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:508:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:508:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_eu4054); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_eu4059); if (failed) return retval;
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4064);
				fre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_eu4068); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4072);
				sre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_eu4076); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EU(input, ((Token)retval.start), exp_str, fre.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_eu

	public static class ctl_abu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_abu
	// F:\\StudyAntlr\\SPC.g:511:1: ctl_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
	public final ctl_abu_return ctl_abu() throws RecognitionException {
		ctl_abu_return retval = new ctl_abu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctl_root_expr_return fre = null;

		subrange_return msr = null;

		ctl_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:514:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:514:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_abu4131); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_abu4136); if (failed) return retval;
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4141);
				fre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_abu4145); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_subrange_in_ctl_abu4149);
				msr=subrange();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4153);
				sre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_abu4157); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(msr.start,msr.stop) + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABU(input, ((Token)retval.start), exp_str, fre.ret, msr.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_abu

	public static class ctl_ebu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_ebu
	// F:\\StudyAntlr\\SPC.g:517:1: ctl_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
	public final ctl_ebu_return ctl_ebu() throws RecognitionException {
		ctl_ebu_return retval = new ctl_ebu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctl_root_expr_return fre = null;

		subrange_return msr = null;

		ctl_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:520:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:520:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_ebu4212); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_ebu4217); if (failed) return retval;
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4222);
				fre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_ebu4226); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_subrange_in_ctl_ebu4230);
				msr=subrange();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4234);
				sre=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_ebu4238); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(msr.start,msr.stop) + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBU(input, ((Token)retval.start), exp_str, fre.ret, msr.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_ebu

	public static class ctl_relational_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_relational_expr
	// F:\\StudyAntlr\\SPC.g:524:1: ctl_relational_expr returns [InternalSpec ret] : f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* ;
	public final ctl_relational_expr_return ctl_relational_expr() throws RecognitionException {
		ctl_relational_expr_return retval = new ctl_relational_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_in_expr_return f = null;

		ctl_in_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:527:9: (f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* )
			// F:\\StudyAntlr\\SPC.g:527:11: f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4291);
				f=ctl_in_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:528:9: (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
				loop26:
				do {
					int alt26=7;
					switch ( input.LA(1) ) {
						case TOK_EQUAL:
						{
							alt26=1;
						}
						break;
						case TOK_NOTEQUAL:
						{
							alt26=2;
						}
						break;
						case TOK_LT:
						{
							alt26=3;
						}
						break;
						case TOK_GT:
						{
							alt26=4;
						}
						break;
						case TOK_LE:
						{
							alt26=5;
						}
						break;
						case TOK_GE:
						{
							alt26=6;
						}
						break;

					}

					switch (alt26) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:528:11: op= TOK_EQUAL s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctl_relational_expr4307); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4312);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_eq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:530:11: op= TOK_NOTEQUAL s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4336); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4341);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_neq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:532:11: op= TOK_LT s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LT,FOLLOW_TOK_LT_in_ctl_relational_expr4365); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4370);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:534:11: op= TOK_GT s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GT,FOLLOW_TOK_GT_in_ctl_relational_expr4394); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4399);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_gt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 5 :
							// F:\\StudyAntlr\\SPC.g:536:11: op= TOK_LE s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LE,FOLLOW_TOK_LE_in_ctl_relational_expr4423); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4428);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_le(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 6 :
							// F:\\StudyAntlr\\SPC.g:538:11: op= TOK_GE s= ctl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GE,FOLLOW_TOK_GE_in_ctl_relational_expr4452); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4457);
							s=ctl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ge(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop26;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_relational_expr

	public static class ctl_in_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_in_expr
	// F:\\StudyAntlr\\SPC.g:542:1: ctl_in_expr returns [InternalSpec ret] : f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* ;
	public final ctl_in_expr_return ctl_in_expr() throws RecognitionException {
		ctl_in_expr_return retval = new ctl_in_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_union_expr_return f = null;

		ctl_union_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:545:9: (f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* )
			// F:\\StudyAntlr\\SPC.g:545:11: f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4521);
				f=ctl_union_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:546:9: (op= TOK_SETIN s= ctl_union_expr )*
				loop27:
				do {
					int alt27=2;
					int LA27_0 = input.LA(1);

					if ( (LA27_0==TOK_SETIN) ) {
						alt27=1;
					}


					switch (alt27) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:546:11: op= TOK_SETIN s= ctl_union_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctl_in_expr4537); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4542);
							s=ctl_union_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_setin(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop27;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_in_expr

	public static class ctl_union_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_union_expr
	// F:\\StudyAntlr\\SPC.g:550:1: ctl_union_expr returns [InternalSpec ret] : f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* ;
	public final ctl_union_expr_return ctl_union_expr() throws RecognitionException {
		ctl_union_expr_return retval = new ctl_union_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_set_expr_return f = null;

		ctl_set_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:553:9: (f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* )
			// F:\\StudyAntlr\\SPC.g:553:11: f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4605);
				f=ctl_set_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:554:9: (op= TOK_UNION s= ctl_set_expr )*
				loop28:
				do {
					int alt28=2;
					int LA28_0 = input.LA(1);

					if ( (LA28_0==TOK_UNION) ) {
						alt28=1;
					}


					switch (alt28) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:554:11: op= TOK_UNION s= ctl_set_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctl_union_expr4621); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4626);
							s=ctl_set_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_union(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop28;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_union_expr

	public static class ctl_set_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_set_expr
	// F:\\StudyAntlr\\SPC.g:558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );
	public final ctl_set_expr_return ctl_set_expr() throws RecognitionException {
		ctl_set_expr_return retval = new ctl_set_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LCB81=null;
		Token TOK_RCB83=null;
		ctl_shift_expr_return ctl_shift_expr79 = null;

		subrange_return subrange80 = null;

		ctl_set_list_expr_return ctl_set_list_expr82 = null;


		Object TOK_LCB81_tree=null;
		Object TOK_RCB83_tree=null;
		RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
		RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
		RewriteRuleSubtreeStream stream_ctl_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_set_list_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:561:9: ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) )
			int alt29=3;
			switch ( input.LA(1) ) {
				case TOK_NOT:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt29=1;
				}
				break;
				case TOK_NUMBER:
				{
					int LA29_2 = input.LA(2);

					if ( (LA29_2==TOK_TWODOTS) ) {
						alt29=2;
					}
					else if ( (LA29_2==EOF||(LA29_2>=TOK_INVAR_SPEC && LA29_2<=TOK_UNION)||(LA29_2>=TOK_LSHIFT && LA29_2<=TOK_CONCATENATION)||LA29_2==TOK_RP||(LA29_2>=TOK_LB && LA29_2<=TOK_RB)||LA29_2==TOK_BUNTIL||LA29_2==TOK_DOT||LA29_2==TOK_SEMI) ) {
						alt29=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 2, input);

						throw nvae;
					}
				}
				break;
				case TOK_PLUS:
				{
					int LA29_3 = input.LA(2);

					if ( (LA29_3==TOK_NUMBER) ) {
						int LA29_7 = input.LA(3);

						if ( (LA29_7==EOF||(LA29_7>=TOK_INVAR_SPEC && LA29_7<=TOK_UNION)||(LA29_7>=TOK_LSHIFT && LA29_7<=TOK_CONCATENATION)||LA29_7==TOK_RP||(LA29_7>=TOK_LB && LA29_7<=TOK_RB)||LA29_7==TOK_BUNTIL||LA29_7==TOK_DOT||LA29_7==TOK_SEMI) ) {
							alt29=1;
						}
						else if ( (LA29_7==TOK_TWODOTS) ) {
							alt29=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 7, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_MINUS:
				{
					int LA29_4 = input.LA(2);

					if ( (LA29_4==TOK_NUMBER) ) {
						int LA29_8 = input.LA(3);

						if ( (LA29_8==EOF||(LA29_8>=TOK_INVAR_SPEC && LA29_8<=TOK_UNION)||(LA29_8>=TOK_LSHIFT && LA29_8<=TOK_CONCATENATION)||LA29_8==TOK_RP||(LA29_8>=TOK_LB && LA29_8<=TOK_RB)||LA29_8==TOK_BUNTIL||LA29_8==TOK_DOT||LA29_8==TOK_SEMI) ) {
							alt29=1;
						}
						else if ( (LA29_8==TOK_TWODOTS) ) {
							alt29=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 8, input);

							throw nvae;
						}
					}
					else if ( ((LA29_4>=TOK_PLUS && LA29_4<=TOK_MINUS)||(LA29_4>=TOK_NOT && LA29_4<=TOK_LP)||(LA29_4>=TOK_BOOL && LA29_4<=TOK_CASE)||(LA29_4>=TOK_WAREAD && LA29_4<=TOK_WAWRITE)||LA29_4==TOK_ATOM||LA29_4==TOK_NUMBER_WORD||(LA29_4>=TOK_FALSEEXP && LA29_4<=TOK_TRUEEXP)) ) {
						alt29=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 4, input);

						throw nvae;
					}
				}
				break;
				case TOK_LCB:
				{
					alt29=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("558:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 0, input);

					throw nvae;
			}

			switch (alt29) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:561:11: ctl_shift_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_shift_expr_in_ctl_set_expr4687);
					ctl_shift_expr79=ctl_shift_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_shift_expr79.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_shift_expr79.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:563:11: subrange
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_subrange_in_ctl_set_expr4709);
					subrange80=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, subrange80.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange80.start,subrange80.stop));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:565:11: TOK_LCB ctl_set_list_expr TOK_RCB
				{
					TOK_LCB81=(Token)input.LT(1);
					match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctl_set_expr4731); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB81);

					pushFollow(FOLLOW_ctl_set_list_expr_in_ctl_set_expr4733);
					ctl_set_list_expr82=ctl_set_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_set_list_expr.add(ctl_set_list_expr82.getTree());
					TOK_RCB83=(Token)input.LT(1);
					match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctl_set_expr4735); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB83);

					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB81.getText() + " " + input.toString(ctl_set_list_expr82.start,ctl_set_list_expr82.stop) + " " + TOK_RCB83.getText());
					}

					// AST REWRITE
					// elements: ctl_set_list_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 567:9: -> ^( SET_LIST_EXP_T ctl_set_list_expr )
						{
							// F:\\StudyAntlr\\SPC.g:567:12: ^( SET_LIST_EXP_T ctl_set_list_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

								adaptor.addChild(root_1, stream_ctl_set_list_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_set_expr

	public static class ctl_set_list_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_set_list_expr
	// F:\\StudyAntlr\\SPC.g:569:1: ctl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
	public final ctl_set_list_expr_return ctl_set_list_expr() throws RecognitionException {
		ctl_set_list_expr_return retval = new ctl_set_list_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_COMMA85=null;
		simple_root_expr_return simple_root_expr84 = null;

		simple_root_expr_return simple_root_expr86 = null;


		Object TOK_COMMA85_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:570:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
			// F:\\StudyAntlr\\SPC.g:570:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4788);
				simple_root_expr84=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr84.getTree());
				// F:\\StudyAntlr\\SPC.g:570:28: ( TOK_COMMA simple_root_expr )*
				loop30:
				do {
					int alt30=2;
					int LA30_0 = input.LA(1);

					if ( (LA30_0==TOK_COMMA) ) {
						alt30=1;
					}


					switch (alt30) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:570:29: TOK_COMMA simple_root_expr
						{
							TOK_COMMA85=(Token)input.LT(1);
							match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_set_list_expr4791); if (failed) return retval;
							pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4794);
							simple_root_expr86=simple_root_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr86.getTree());

						}
						break;

						default :
							break loop30;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_set_list_expr

	public static class ctl_shift_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_shift_expr
	// F:\\StudyAntlr\\SPC.g:572:1: ctl_shift_expr returns [InternalSpec ret] : f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* ;
	public final ctl_shift_expr_return ctl_shift_expr() throws RecognitionException {
		ctl_shift_expr_return retval = new ctl_shift_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_remainder_expr_return f = null;

		ctl_remainder_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:575:9: (f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* )
			// F:\\StudyAntlr\\SPC.g:575:11: f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4840);
				f=ctl_remainder_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:576:9: (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
				loop31:
				do {
					int alt31=3;
					int LA31_0 = input.LA(1);

					if ( (LA31_0==TOK_LSHIFT) ) {
						alt31=1;
					}
					else if ( (LA31_0==TOK_RSHIFT) ) {
						alt31=2;
					}


					switch (alt31) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:576:11: op= TOK_LSHIFT s= ctl_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4856); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4861);
							s=ctl_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:578:11: op= TOK_RSHIFT s= ctl_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4885); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4890);
							s=ctl_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_rshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop31;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_shift_expr

	public static class ctl_remainder_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_remainder_expr
	// F:\\StudyAntlr\\SPC.g:582:1: ctl_remainder_expr returns [InternalSpec ret] : f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* ;
	public final ctl_remainder_expr_return ctl_remainder_expr() throws RecognitionException {
		ctl_remainder_expr_return retval = new ctl_remainder_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_additive_expr_return f = null;

		ctl_additive_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:585:9: (f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* )
			// F:\\StudyAntlr\\SPC.g:585:11: f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4952);
				f=ctl_additive_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:586:9: (op= TOK_MOD s= ctl_additive_expr )*
				loop32:
				do {
					int alt32=2;
					int LA32_0 = input.LA(1);

					if ( (LA32_0==TOK_MOD) ) {
						alt32=1;
					}


					switch (alt32) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:586:11: op= TOK_MOD s= ctl_additive_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctl_remainder_expr4968); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4973);
							s=ctl_additive_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_mod(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop32;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_remainder_expr

	public static class ctl_additive_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_additive_expr
	// F:\\StudyAntlr\\SPC.g:592:1: ctl_additive_expr returns [InternalSpec ret] : f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* ;
	public final ctl_additive_expr_return ctl_additive_expr() throws RecognitionException {
		ctl_additive_expr_return retval = new ctl_additive_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_multiplicative_expr_return f = null;

		ctl_multiplicative_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:595:9: (f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* )
			// F:\\StudyAntlr\\SPC.g:595:11: f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5037);
				f=ctl_multiplicative_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:596:9: (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
				loop33:
				do {
					int alt33=3;
					int LA33_0 = input.LA(1);

					if ( (LA33_0==TOK_PLUS) ) {
						alt33=1;
					}
					else if ( (LA33_0==TOK_MINUS) ) {
						alt33=2;
					}


					switch (alt33) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:596:11: op= TOK_PLUS s= ctl_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctl_additive_expr5053); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5058);
							s=ctl_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_plus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:598:11: op= TOK_MINUS s= ctl_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_additive_expr5082); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5087);
							s=ctl_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_minus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop33;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_additive_expr

	public static class ctl_multiplicative_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_multiplicative_expr
	// F:\\StudyAntlr\\SPC.g:602:1: ctl_multiplicative_expr returns [InternalSpec ret] : f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* ;
	public final ctl_multiplicative_expr_return ctl_multiplicative_expr() throws RecognitionException {
		ctl_multiplicative_expr_return retval = new ctl_multiplicative_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_concatination_expr_return f = null;

		ctl_concatination_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:605:9: (f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* )
			// F:\\StudyAntlr\\SPC.g:605:11: f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5148);
				f=ctl_concatination_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:606:9: (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
				loop34:
				do {
					int alt34=3;
					int LA34_0 = input.LA(1);

					if ( (LA34_0==TOK_TIMES) ) {
						alt34=1;
					}
					else if ( (LA34_0==TOK_DIVIDE) ) {
						alt34=2;
					}


					switch (alt34) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:606:11: op= TOK_TIMES s= ctl_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5164); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5169);
							s=ctl_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_times(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:608:11: op= TOK_DIVIDE s= ctl_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5193); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5198);
							s=ctl_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_divide(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop34;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_multiplicative_expr

	public static class ctl_concatination_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_concatination_expr
	// F:\\StudyAntlr\\SPC.g:612:1: ctl_concatination_expr returns [InternalSpec ret] : f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* ;
	public final ctl_concatination_expr_return ctl_concatination_expr() throws RecognitionException {
		ctl_concatination_expr_return retval = new ctl_concatination_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_primary_expr_return f = null;

		ctl_primary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:615:9: (f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* )
			// F:\\StudyAntlr\\SPC.g:615:11: f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5259);
				f=ctl_primary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:616:9: (op= TOK_CONCATENATION s= ctl_primary_expr )*
				loop35:
				do {
					int alt35=2;
					int LA35_0 = input.LA(1);

					if ( (LA35_0==TOK_CONCATENATION) ) {
						alt35=1;
					}


					switch (alt35) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:616:11: op= TOK_CONCATENATION s= ctl_primary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5275); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5280);
							s=ctl_primary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += op.getText() + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_concatenation(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop35;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_concatination_expr

	public static class ctl_primary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_primary_expr
	// F:\\StudyAntlr\\SPC.g:621:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );
	public final ctl_primary_expr_return ctl_primary_expr() throws RecognitionException {
		ctl_primary_expr_return retval = new ctl_primary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctl_primary_expr_return v = null;

		ctl_primary_expr_helper1_return ctl_primary_expr_helper187 = null;


		Object op_tree=null;
		RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
		RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
		RewriteRuleSubtreeStream stream_ctl_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_primary_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:624:9: ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) )
			int alt36=3;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt36=1;
				}
				break;
				case TOK_MINUS:
				{
					alt36=2;
				}
				break;
				case TOK_NOT:
				{
					alt36=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("621:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );", 36, 0, input);

					throw nvae;
			}

			switch (alt36) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:624:11: ctl_primary_expr_helper1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5341);
					ctl_primary_expr_helper187=ctl_primary_expr_helper1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctl_primary_expr_helper187.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_primary_expr_helper187.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:626:11: op= TOK_MINUS v= ctl_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_primary_expr5365); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_MINUS.add(op);

					pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5369);
					v=ctl_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_unary_minus(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: v
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 628:9: -> ^( TOK_UNARY_MINUS_T $v)
						{
							// F:\\StudyAntlr\\SPC.g:628:12: ^( TOK_UNARY_MINUS_T $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:629:11: op= TOK_NOT v= ctl_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctl_primary_expr5410); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NOT.add(op);

					pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5414);
					v=ctl_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: v, TOK_NOT
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 631:9: -> ^( TOK_NOT $v)
						{
							// F:\\StudyAntlr\\SPC.g:631:12: ^( TOK_NOT $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_primary_expr

	public static class ctl_primary_expr_helper1_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_primary_expr_helper1
	// F:\\StudyAntlr\\SPC.g:634:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
	public final ctl_primary_expr_helper1_return ctl_primary_expr_helper1() throws RecognitionException {
		ctl_primary_expr_helper1_return retval = new ctl_primary_expr_helper1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tc1=null;
		Token tc2=null;
		Token TOK_LP95=null;
		Token TOK_RP97=null;
		Token TOK_BOOL99=null;
		Token TOK_LP100=null;
		Token TOK_RP102=null;
		Token TOK_WORD1104=null;
		Token TOK_LP105=null;
		Token TOK_RP107=null;
		Token TOK_NEXT109=null;
		Token TOK_LP110=null;
		Token TOK_RP112=null;
		Token TOK_CASE114=null;
		Token TOK_ESAC116=null;
		Token TOK_WAREAD118=null;
		Token TOK_LP119=null;
		Token TOK_COMMA120=null;
		Token TOK_RP121=null;
		Token TOK_WAWRITE123=null;
		Token TOK_LP124=null;
		Token TOK_RP125=null;
		simple_root_expr_return f = null;

		simple_root_expr_return s = null;

		simple_root_expr_return m = null;

		constant_return constant88 = null;

		primary_expr_select_return primary_expr_select89 = null;

		primary_expr_helper1_pointer1_return primary_expr_helper1_pointer190 = null;

		ctl_know_return ctl_know91 = null;

		primary_expr_select_return primary_expr_select92 = null;

		ctl_sknow_return ctl_sknow93 = null;

		primary_expr_select_return primary_expr_select94 = null;

		ctl_root_expr_return ctl_root_expr96 = null;

		primary_expr_select_return primary_expr_select98 = null;

		simple_root_expr_return simple_root_expr101 = null;

		primary_expr_select_return primary_expr_select103 = null;

		simple_root_expr_return simple_root_expr106 = null;

		primary_expr_select_return primary_expr_select108 = null;

		simple_root_expr_return simple_root_expr111 = null;

		primary_expr_select_return primary_expr_select113 = null;

		case_element_list_expr_return case_element_list_expr115 = null;

		primary_expr_select_return primary_expr_select117 = null;

		primary_expr_select_return primary_expr_select122 = null;

		primary_expr_select_return primary_expr_select126 = null;


		Object tc1_tree=null;
		Object tc2_tree=null;
		Object TOK_LP95_tree=null;
		Object TOK_RP97_tree=null;
		Object TOK_BOOL99_tree=null;
		Object TOK_LP100_tree=null;
		Object TOK_RP102_tree=null;
		Object TOK_WORD1104_tree=null;
		Object TOK_LP105_tree=null;
		Object TOK_RP107_tree=null;
		Object TOK_NEXT109_tree=null;
		Object TOK_LP110_tree=null;
		Object TOK_RP112_tree=null;
		Object TOK_CASE114_tree=null;
		Object TOK_ESAC116_tree=null;
		Object TOK_WAREAD118_tree=null;
		Object TOK_LP119_tree=null;
		Object TOK_COMMA120_tree=null;
		Object TOK_RP121_tree=null;
		Object TOK_WAWRITE123_tree=null;
		Object TOK_LP124_tree=null;
		Object TOK_RP125_tree=null;
		RewriteRuleTokenStream stream_TOK_LP=new RewriteRuleTokenStream(adaptor,"token TOK_LP");
		RewriteRuleTokenStream stream_TOK_WAREAD=new RewriteRuleTokenStream(adaptor,"token TOK_WAREAD");
		RewriteRuleTokenStream stream_TOK_COMMA=new RewriteRuleTokenStream(adaptor,"token TOK_COMMA");
		RewriteRuleTokenStream stream_TOK_WORD1=new RewriteRuleTokenStream(adaptor,"token TOK_WORD1");
		RewriteRuleTokenStream stream_TOK_ESAC=new RewriteRuleTokenStream(adaptor,"token TOK_ESAC");
		RewriteRuleTokenStream stream_TOK_NEXT=new RewriteRuleTokenStream(adaptor,"token TOK_NEXT");
		RewriteRuleTokenStream stream_TOK_CASE=new RewriteRuleTokenStream(adaptor,"token TOK_CASE");
		RewriteRuleTokenStream stream_TOK_WAWRITE=new RewriteRuleTokenStream(adaptor,"token TOK_WAWRITE");
		RewriteRuleTokenStream stream_TOK_BOOL=new RewriteRuleTokenStream(adaptor,"token TOK_BOOL");
		RewriteRuleTokenStream stream_TOK_RP=new RewriteRuleTokenStream(adaptor,"token TOK_RP");
		RewriteRuleSubtreeStream stream_ctl_know=new RewriteRuleSubtreeStream(adaptor,"rule ctl_know");
		RewriteRuleSubtreeStream stream_case_element_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_element_list_expr");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		RewriteRuleSubtreeStream stream_ctl_sknow=new RewriteRuleSubtreeStream(adaptor,"rule ctl_sknow");
		RewriteRuleSubtreeStream stream_ctl_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_root_expr");
		RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:637:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
			int alt37=11;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt37=1;
				}
				break;
				case TOK_ATOM:
				{
					alt37=2;
				}
				break;
				case TOK_LP:
				{
					int LA37_3 = input.LA(2);

					if ( (LA37_3==TOK_LCB||(LA37_3>=TOK_PLUS && LA37_3<=TOK_MINUS)||(LA37_3>=TOK_NOT && LA37_3<=TOK_LP)||(LA37_3>=TOK_BOOL && LA37_3<=TOK_CASE)||(LA37_3>=TOK_WAREAD && LA37_3<=TOK_AA)||LA37_3==TOK_EE||LA37_3==TOK_NUMBER||LA37_3==TOK_NUMBER_WORD||(LA37_3>=TOK_FALSEEXP && LA37_3<=TOK_TRUEEXP)) ) {
						alt37=5;
					}
					else if ( (LA37_3==TOK_ATOM) ) {
						switch ( input.LA(3) ) {
							case TOK_IMPLIES:
							case TOK_IFF:
							case TOK_OR:
							case TOK_XOR:
							case TOK_XNOR:
							case TOK_AND:
							case TOK_EQUAL:
							case TOK_NOTEQUAL:
							case TOK_LT:
							case TOK_GT:
							case TOK_LE:
							case TOK_GE:
							case TOK_SETIN:
							case TOK_UNION:
							case TOK_LSHIFT:
							case TOK_RSHIFT:
							case TOK_MOD:
							case TOK_PLUS:
							case TOK_MINUS:
							case TOK_TIMES:
							case TOK_DIVIDE:
							case TOK_CONCATENATION:
							case TOK_RP:
							case TOK_LB:
							case TOK_DOT:
							{
								alt37=5;
							}
							break;
							case TOK_KNOW:
							{
								alt37=3;
							}
							break;
							case TOK_SKNOW:
							{
								alt37=4;
							}
							break;
							default:
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("634:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 11, input);

								throw nvae;
						}

					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("634:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_BOOL:
				{
					alt37=6;
				}
				break;
				case TOK_WORD1:
				{
					alt37=7;
				}
				break;
				case TOK_NEXT:
				{
					alt37=8;
				}
				break;
				case TOK_CASE:
				{
					alt37=9;
				}
				break;
				case TOK_WAREAD:
				{
					alt37=10;
				}
				break;
				case TOK_WAWRITE:
				{
					alt37=11;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("634:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 0, input);

					throw nvae;
			}

			switch (alt37) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:637:11: constant primary_expr_select
				{
					pushFollow(FOLLOW_constant_in_ctl_primary_expr_helper15479);
					constant88=constant();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_constant.add(constant88.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15481);
					primary_expr_select89=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select89.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, constant
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 640:9: -> ^( VALUE_T constant NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:640:12: ^( VALUE_T constant NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

								adaptor.addChild(root_1, stream_constant.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:641:11: primary_expr_helper1_pointer1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15532);
					primary_expr_helper1_pointer190=primary_expr_helper1_pointer1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer190.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:648:11: ctl_know primary_expr_select
				{
					pushFollow(FOLLOW_ctl_know_in_ctl_primary_expr_helper15567);
					ctl_know91=ctl_know();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_know.add(ctl_know91.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15569);
					primary_expr_select92=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select92.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_know91.ret;
					}

					// AST REWRITE
					// elements: primary_expr_select, ctl_know
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 650:9: -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:650:12: ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CTL_KNOW_T, "CTL_KNOW_T"), root_1);

								adaptor.addChild(root_1, stream_ctl_know.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:652:11: ctl_sknow primary_expr_select
				{
					pushFollow(FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15613);
					ctl_sknow93=ctl_sknow();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_sknow.add(ctl_sknow93.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15615);
					primary_expr_select94=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select94.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_sknow93.ret;
					}

					// AST REWRITE
					// elements: ctl_sknow, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 654:9: -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:654:12: ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CTL_SKNOW_T, "CTL_SKNOW_T"), root_1);

								adaptor.addChild(root_1, stream_ctl_sknow.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:658:11: TOK_LP ctl_root_expr TOK_RP primary_expr_select
				{
					TOK_LP95=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15669); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP95);

					pushFollow(FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15671);
					ctl_root_expr96=ctl_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctl_root_expr.add(ctl_root_expr96.getTree());
					TOK_RP97=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15673); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP97);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15675);
					primary_expr_select98=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select98.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctl_root_expr96.ret;
					}

					// AST REWRITE
					// elements: primary_expr_select, ctl_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 660:9: -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:660:12: ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

								adaptor.addChild(root_1, stream_ctl_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:664:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_BOOL99=(Token)input.LT(1);
					match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15738); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL99);

					TOK_LP100=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15740); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP100);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15742);
					simple_root_expr101=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr101.getTree());
					TOK_RP102=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15744); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP102);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15746);
					primary_expr_select103=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select103.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_BOOL, primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 667:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:667:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:668:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WORD1104=(Token)input.LT(1);
					match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15797); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1104);

					TOK_LP105=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15799); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP105);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15801);
					simple_root_expr106=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr106.getTree());
					TOK_RP107=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15803); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP107);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15805);
					primary_expr_select108=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select108.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_WORD1, primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 671:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:671:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:673:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_NEXT109=(Token)input.LT(1);
					match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15865); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT109);

					TOK_LP110=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15867); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP110);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15869);
					simple_root_expr111=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr111.getTree());
					TOK_RP112=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15871); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP112);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15873);
					primary_expr_select113=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select113.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_NEXT, simple_root_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 676:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:676:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:678:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
				{
					TOK_CASE114=(Token)input.LT(1);
					match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15933); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE114);

					pushFollow(FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15935);
					case_element_list_expr115=case_element_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr115.getTree());
					TOK_ESAC116=(Token)input.LT(1);
					match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15937); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC116);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15939);
					primary_expr_select117=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select117.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, case_element_list_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 681:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:681:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

								adaptor.addChild(root_1, stream_case_element_list_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 10 :
					// F:\\StudyAntlr\\SPC.g:683:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAREAD118=(Token)input.LT(1);
					match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper15999); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD118);

					TOK_LP119=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16001); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP119);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16005);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					TOK_COMMA120=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16007); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA120);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16011);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP121=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16013); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP121);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16015);
					primary_expr_select122=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select122.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: f, s, TOK_WAREAD, primary_expr_select
					// token labels:
					// rule labels: s, f, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 686:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:686:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 11 :
					// F:\\StudyAntlr\\SPC.g:688:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAWRITE123=(Token)input.LT(1);
					match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16079); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE123);

					TOK_LP124=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16081); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP124);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16085);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					tc1=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16089); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16093);
					m=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
					tc2=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16097); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

					pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16101);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP125=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16103); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP125);

					pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16105);
					primary_expr_select126=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select126.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, TOK_WAWRITE, m, f, s
					// token labels:
					// rule labels: s, f, m, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"token m",m!=null?m.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 691:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:691:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_m.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_primary_expr_helper1

	public static class ctl_know_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_know
	// F:\\StudyAntlr\\SPC.g:694:1: ctl_know returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP ;
	public final ctl_know_return ctl_know() throws RecognitionException {
		ctl_know_return retval = new ctl_know_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token opk=null;
		Token TOK_LP127=null;
		Token TOK_RP128=null;
		agent_name_return agent = null;

		ctl_root_expr_return f = null;


		Object opk_tree=null;
		Object TOK_LP127_tree=null;
		Object TOK_RP128_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:697:9: ( TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP )
			// F:\\StudyAntlr\\SPC.g:697:11: TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP
			{
				root_0 = (Object)adaptor.nil();

				TOK_LP127=(Token)input.LT(1);
				match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_know6194); if (failed) return retval;
				pushFollow(FOLLOW_agent_name_in_ctl_know6199);
				agent=agent_name();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
				opk=(Token)input.LT(1);
				match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ctl_know6203); if (failed) return retval;
				if ( backtracking==0 ) {
					opk_tree = (Object)adaptor.create(opk);
					root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
				}
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_know6208);
				f=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				TOK_RP128=(Token)input.LT(1);
				match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_know6210); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = input.toString(agent.start,agent.stop) + " " + opk.getText() + " " + input.toString(f.start,f.stop);
					if(!er()) append_end = true;
					if(!er()) retval.ret = InitSpec.mk_ctl_know(input, ((Token)retval.start), exp_str, agent.ret, f.ret);

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_know

	public static class ctl_sknow_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctl_sknow
	// F:\\StudyAntlr\\SPC.g:704:1: ctl_sknow returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP ;
	public final ctl_sknow_return ctl_sknow() throws RecognitionException {
		ctl_sknow_return retval = new ctl_sknow_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token opk=null;
		Token TOK_LP129=null;
		Token TOK_RP130=null;
		agent_name_return agent = null;

		ctl_root_expr_return f = null;


		Object opk_tree=null;
		Object TOK_LP129_tree=null;
		Object TOK_RP130_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:707:9: ( TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP )
			// F:\\StudyAntlr\\SPC.g:707:11: TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP
			{
				root_0 = (Object)adaptor.nil();

				TOK_LP129=(Token)input.LT(1);
				match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_sknow6272); if (failed) return retval;
				pushFollow(FOLLOW_agent_name_in_ctl_sknow6277);
				agent=agent_name();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
				opk=(Token)input.LT(1);
				match(input,TOK_SKNOW,FOLLOW_TOK_SKNOW_in_ctl_sknow6281); if (failed) return retval;
				if ( backtracking==0 ) {
					opk_tree = (Object)adaptor.create(opk);
					root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
				}
				pushFollow(FOLLOW_ctl_root_expr_in_ctl_sknow6286);
				f=ctl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				TOK_RP130=(Token)input.LT(1);
				match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_sknow6288); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = input.toString(agent.start,agent.stop) + " " + opk.getText() + " " + input.toString(f.start,f.stop);
					if(!er()) append_end = true;
					if(!er()) retval.ret = InitSpec.mk_ctl_sknow(input, ((Token)retval.start), exp_str, agent.ret, f.ret);

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctl_sknow

	public static class agent_name_return extends ParserRuleReturnScope {
		public InternalSpecAgentIdentifier ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start agent_name
	// F:\\StudyAntlr\\SPC.g:723:1: agent_name returns [InternalSpecAgentIdentifier ret] : agentName= TOK_ATOM ;
	public final agent_name_return agent_name() throws RecognitionException {
		agent_name_return retval = new agent_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token agentName=null;

		Object agentName_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:725:9: (agentName= TOK_ATOM )
			// F:\\StudyAntlr\\SPC.g:725:11: agentName= TOK_ATOM
			{
				root_0 = (Object)adaptor.nil();

				agentName=(Token)input.LT(1);
				match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_agent_name6347); if (failed) return retval;
				if ( backtracking==0 ) {
					agentName_tree = (Object)adaptor.create(agentName);
					adaptor.addChild(root_0, agentName_tree);
				}
				if ( backtracking==0 ) {
					if(!er()) retval.ret = new InternalSpecAgentIdentifier(agentName.getText(), ((Token)retval.start));
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end agent_name

	public static class ltl_root_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_root_expr
	// F:\\StudyAntlr\\SPC.g:732:1: ltl_root_expr returns [InternalSpec ret] : ltl_implies_expr ;
	public final ltl_root_expr_return ltl_root_expr() throws RecognitionException {
		ltl_root_expr_return retval = new ltl_root_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ltl_implies_expr_return ltl_implies_expr131 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:733:9: ( ltl_implies_expr )
			// F:\\StudyAntlr\\SPC.g:733:11: ltl_implies_expr
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_implies_expr_in_ltl_root_expr6392);
				ltl_implies_expr131=ltl_implies_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ltl_implies_expr131.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ltl_implies_expr131.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_root_expr

	public static class ltl_implies_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_implies_expr
	// F:\\StudyAntlr\\SPC.g:735:1: ltl_implies_expr returns [InternalSpec ret] : f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? ;
	public final ltl_implies_expr_return ltl_implies_expr() throws RecognitionException {
		ltl_implies_expr_return retval = new ltl_implies_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_iff_expr_return f = null;

		ltl_implies_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:738:9: (f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? )
			// F:\\StudyAntlr\\SPC.g:738:11: f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )?
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_iff_expr_in_ltl_implies_expr6435);
				f=ltl_iff_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:739:9: (op= TOK_IMPLIES s= ltl_implies_expr )?
				int alt38=2;
				int LA38_0 = input.LA(1);

				if ( (LA38_0==TOK_IMPLIES) ) {
					alt38=1;
				}
				switch (alt38) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:739:11: op= TOK_IMPLIES s= ltl_implies_expr
					{
						op=(Token)input.LT(1);
						match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6451); if (failed) return retval;
						if ( backtracking==0 ) {
							op_tree = (Object)adaptor.create(op);
							root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
						}
						pushFollow(FOLLOW_ltl_implies_expr_in_ltl_implies_expr6456);
						s=ltl_implies_expr();
						_fsp--;
						if (failed) return retval;
						if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
						if ( backtracking==0 ) {
							if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_imply(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
						}

					}
					break;

				}


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_implies_expr

	public static class ltl_iff_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_iff_expr
	// F:\\StudyAntlr\\SPC.g:743:1: ltl_iff_expr returns [InternalSpec ret] : f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* ;
	public final ltl_iff_expr_return ltl_iff_expr() throws RecognitionException {
		ltl_iff_expr_return retval = new ltl_iff_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_or_expr_return f = null;

		ltl_or_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:746:9: (f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* )
			// F:\\StudyAntlr\\SPC.g:746:11: f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6521);
				f=ltl_or_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:747:9: (op= TOK_IFF s= ltl_or_expr )*
				loop39:
				do {
					int alt39=2;
					int LA39_0 = input.LA(1);

					if ( (LA39_0==TOK_IFF) ) {
						alt39=1;
					}


					switch (alt39) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:747:11: op= TOK_IFF s= ltl_or_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ltl_iff_expr6537); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6542);
							s=ltl_or_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_iff(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop39;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_iff_expr

	public static class ltl_or_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_or_expr
	// F:\\StudyAntlr\\SPC.g:751:1: ltl_or_expr returns [InternalSpec ret] : f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* ;
	public final ltl_or_expr_return ltl_or_expr() throws RecognitionException {
		ltl_or_expr_return retval = new ltl_or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_and_expr_return f = null;

		ltl_and_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:754:9: (f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* )
			// F:\\StudyAntlr\\SPC.g:754:11: f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6606);
				f=ltl_and_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:755:9: (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
				loop40:
				do {
					int alt40=4;
					switch ( input.LA(1) ) {
						case TOK_OR:
						{
							alt40=1;
						}
						break;
						case TOK_XOR:
						{
							alt40=2;
						}
						break;
						case TOK_XNOR:
						{
							alt40=3;
						}
						break;

					}

					switch (alt40) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:755:11: op= TOK_OR s= ltl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_OR,FOLLOW_TOK_OR_in_ltl_or_expr6622); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6627);
							s=ltl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_or(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:757:11: op= TOK_XOR s= ltl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ltl_or_expr6651); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6656);
							s=ltl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:759:11: op= TOK_XNOR s= ltl_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ltl_or_expr6680); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6685);
							s=ltl_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xnor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop40;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_or_expr

	public static class ltl_and_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_and_expr
	// F:\\StudyAntlr\\SPC.g:763:1: ltl_and_expr returns [InternalSpec ret] : f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* ;
	public final ltl_and_expr_return ltl_and_expr() throws RecognitionException {
		ltl_and_expr_return retval = new ltl_and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_binary_expr_return f = null;

		ltl_binary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:766:9: (f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* )
			// F:\\StudyAntlr\\SPC.g:766:11: f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6748);
				f=ltl_binary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:767:9: (op= TOK_AND s= ltl_binary_expr )*
				loop41:
				do {
					int alt41=2;
					int LA41_0 = input.LA(1);

					if ( (LA41_0==TOK_AND) ) {
						alt41=1;
					}


					switch (alt41) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:767:11: op= TOK_AND s= ltl_binary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_AND,FOLLOW_TOK_AND_in_ltl_and_expr6764); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6769);
							s=ltl_binary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_and(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop41;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_and_expr

	public static class ltl_binary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_binary_expr
	// F:\\StudyAntlr\\SPC.g:773:1: ltl_binary_expr returns [InternalSpec ret] : f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_BUNTIL fsr= subrange s= ltl_unary_expr | op= TOK_BRELEASES fsr= subrange s= ltl_unary_expr )* ;
	public final ltl_binary_expr_return ltl_binary_expr() throws RecognitionException {
		ltl_binary_expr_return retval = new ltl_binary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_unary_expr_return f = null;

		ltl_unary_expr_return s = null;

		subrange_return fsr = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:776:9: (f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_BUNTIL fsr= subrange s= ltl_unary_expr | op= TOK_BRELEASES fsr= subrange s= ltl_unary_expr )* )
			// F:\\StudyAntlr\\SPC.g:776:11: f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_BUNTIL fsr= subrange s= ltl_unary_expr | op= TOK_BRELEASES fsr= subrange s= ltl_unary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6834);
				f=ltl_unary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:777:9: (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_BUNTIL fsr= subrange s= ltl_unary_expr | op= TOK_BRELEASES fsr= subrange s= ltl_unary_expr )*
				loop42:
				do {
					int alt42=7;
					switch ( input.LA(1) ) {
						case TOK_UNTIL:
						{
							alt42=1;
						}
						break;
						case TOK_SINCE:
						{
							alt42=2;
						}
						break;
						case TOK_RELEASES:
						{
							alt42=3;
						}
						break;
						case TOK_TRIGGERED:
						{
							alt42=4;
						}
						break;
						case TOK_BUNTIL:
						{
							alt42=5;
						}
						break;
						case TOK_BRELEASES:
						{
							alt42=6;
						}
						break;

					}

					switch (alt42) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:777:11: op= TOK_UNTIL s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ltl_binary_expr6850); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6855);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_until(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:779:11: op= TOK_SINCE s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ltl_binary_expr6879); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6884);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_since(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:781:11: op= TOK_RELEASES s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ltl_binary_expr6908); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6913);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_releases(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:783:11: op= TOK_TRIGGERED s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6937); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6942);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_triggered(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 5 :
							// F:\\StudyAntlr\\SPC.g:786:11: op= TOK_BUNTIL fsr= subrange s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ltl_binary_expr6975); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_subrange_in_ltl_binary_expr6980);
							fsr=subrange();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6984);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_bound_until(input, ((Token)retval.start), exp_str, fsr.ret, f.ret, s.ret);
							}

						}
						break;
						case 6 :
							// F:\\StudyAntlr\\SPC.g:789:11: op= TOK_BRELEASES fsr= subrange s= ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_BRELEASES,FOLLOW_TOK_BRELEASES_in_ltl_binary_expr7017); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_subrange_in_ltl_binary_expr7022);
							fsr=subrange();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
							pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr7026);
							s=ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_bound_release(input, ((Token)retval.start), exp_str, fsr.ret, f.ret, s.ret);
							}

						}
						break;

						default :
							break loop42;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_binary_expr

	public static class ltl_unary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_unary_expr
	// F:\\StudyAntlr\\SPC.g:798:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );
	public final ltl_unary_expr_return ltl_unary_expr() throws RecognitionException {
		ltl_unary_expr_return retval = new ltl_unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ltl_pure_unary_expr_return ltl_pure_unary_expr132 = null;

		ltl_relational_expr_return ltl_relational_expr133 = null;


		RewriteRuleSubtreeStream stream_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_pure_unary_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:799:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr )
			int alt43=2;
			int LA43_0 = input.LA(1);

			if ( (LA43_0==TOK_OP_NEXT) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_PREV) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_NOTPREVNOT) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_GLOBALLY) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_HISTORICALLY) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_FINALLY) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_ONCE) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_BOUND_FINALLY) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_OP_BOUND_GLOBALLY) && (synpred6())) {
				alt43=1;
			}
			else if ( (LA43_0==TOK_NOT) ) {
				int LA43_10 = input.LA(2);

				if ( (LA43_10==TOK_OP_NEXT) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_PREV) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_NOTPREVNOT) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_GLOBALLY) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_HISTORICALLY) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_FINALLY) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_ONCE) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_BOUND_FINALLY) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_OP_BOUND_GLOBALLY) && (synpred6())) {
					alt43=1;
				}
				else if ( (LA43_10==TOK_NOT) ) {
					int LA43_21 = input.LA(3);

					if ( (synpred6()) ) {
						alt43=1;
					}
					else if ( (true) ) {
						alt43=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("798:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 21, input);

						throw nvae;
					}
				}
				else if ( ((LA43_10>=TOK_PLUS && LA43_10<=TOK_MINUS)||LA43_10==TOK_LP||(LA43_10>=TOK_BOOL && LA43_10<=TOK_CASE)||(LA43_10>=TOK_WAREAD && LA43_10<=TOK_WAWRITE)||LA43_10==TOK_ATOM||LA43_10==TOK_NUMBER||LA43_10==TOK_NUMBER_WORD||(LA43_10>=TOK_FALSEEXP && LA43_10<=TOK_TRUEEXP)) ) {
					alt43=2;
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("798:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 10, input);

					throw nvae;
				}
			}
			else if ( (LA43_0==TOK_LCB||(LA43_0>=TOK_PLUS && LA43_0<=TOK_MINUS)||LA43_0==TOK_LP||(LA43_0>=TOK_BOOL && LA43_0<=TOK_CASE)||(LA43_0>=TOK_WAREAD && LA43_0<=TOK_WAWRITE)||LA43_0==TOK_ATOM||LA43_0==TOK_NUMBER||LA43_0==TOK_NUMBER_WORD||(LA43_0>=TOK_FALSEEXP && LA43_0<=TOK_TRUEEXP)) ) {
				alt43=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("798:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 0, input);

				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:799:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )=> ltl_pure_unary_expr
				{
					pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7223);
					ltl_pure_unary_expr132=ltl_pure_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_pure_unary_expr.add(ltl_pure_unary_expr132.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_pure_unary_expr132.ret;
					}

					// AST REWRITE
					// elements: ltl_pure_unary_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 810:9: -> ^( PURE_LTL_T ltl_pure_unary_expr )
						{
							// F:\\StudyAntlr\\SPC.g:810:12: ^( PURE_LTL_T ltl_pure_unary_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(PURE_LTL_T, "PURE_LTL_T"), root_1);

								adaptor.addChild(root_1, stream_ltl_pure_unary_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:811:11: ltl_relational_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ltl_relational_expr_in_ltl_unary_expr7263);
					ltl_relational_expr133=ltl_relational_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ltl_relational_expr133.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_relational_expr133.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_unary_expr

	public static class ltl_pure_unary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_pure_unary_expr
	// F:\\StudyAntlr\\SPC.g:814:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_OP_BOUND_FINALLY fsr= subrange s= ltl_unary_expr | op= TOK_OP_BOUND_GLOBALLY fsr= subrange s= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );
	public final ltl_pure_unary_expr_return ltl_pure_unary_expr() throws RecognitionException {
		ltl_pure_unary_expr_return retval = new ltl_pure_unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_unary_expr_return f = null;

		subrange_return fsr = null;

		ltl_unary_expr_return s = null;

		ltl_pure_unary_expr_return fp = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:817:9: (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_OP_BOUND_FINALLY fsr= subrange s= ltl_unary_expr | op= TOK_OP_BOUND_GLOBALLY fsr= subrange s= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr )
			int alt44=10;
			switch ( input.LA(1) ) {
				case TOK_OP_NEXT:
				{
					alt44=1;
				}
				break;
				case TOK_OP_PREV:
				{
					alt44=2;
				}
				break;
				case TOK_OP_NOTPREVNOT:
				{
					alt44=3;
				}
				break;
				case TOK_OP_GLOBALLY:
				{
					alt44=4;
				}
				break;
				case TOK_OP_HISTORICALLY:
				{
					alt44=5;
				}
				break;
				case TOK_OP_FINALLY:
				{
					alt44=6;
				}
				break;
				case TOK_OP_ONCE:
				{
					alt44=7;
				}
				break;
				case TOK_OP_BOUND_FINALLY:
				{
					alt44=8;
				}
				break;
				case TOK_OP_BOUND_GLOBALLY:
				{
					alt44=9;
				}
				break;
				case TOK_NOT:
				{
					alt44=10;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("814:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_OP_BOUND_FINALLY fsr= subrange s= ltl_unary_expr | op= TOK_OP_BOUND_GLOBALLY fsr= subrange s= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );", 44, 0, input);

					throw nvae;
			}

			switch (alt44) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:817:11: op= TOK_OP_NEXT f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7314); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7319);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_next(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:819:11: op= TOK_OP_PREV f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7343); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7348);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_prev(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:821:11: op= TOK_OP_NOTPREVNOT f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7372); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7377);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_notprevnot(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:823:11: op= TOK_OP_GLOBALLY f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7401); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7406);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_globally(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:825:11: op= TOK_OP_HISTORICALLY f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7430); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7435);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_historically(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:827:11: op= TOK_OP_FINALLY f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7459); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7464);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_finally(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:829:11: op= TOK_OP_ONCE f= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7488); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7493);
					f=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_once(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:832:11: op= TOK_OP_BOUND_FINALLY fsr= subrange s= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_BOUND_FINALLY,FOLLOW_TOK_OP_BOUND_FINALLY_in_ltl_pure_unary_expr7527); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ltl_pure_unary_expr7532);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7536);
					s=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_bound_finally(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:834:11: op= TOK_OP_BOUND_GLOBALLY fsr= subrange s= ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_BOUND_GLOBALLY,FOLLOW_TOK_OP_BOUND_GLOBALLY_in_ltl_pure_unary_expr7560); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ltl_pure_unary_expr7565);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7569);
					s=ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_bound_globally(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 10 :
					// F:\\StudyAntlr\\SPC.g:839:11: op= TOK_NOT fp= ltl_pure_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7605); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7610);
					fp=ltl_pure_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fp.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fp.start,fp.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), exp_str, fp.ret);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_pure_unary_expr

	public static class ltl_relational_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_relational_expr
	// F:\\StudyAntlr\\SPC.g:843:1: ltl_relational_expr returns [InternalSpec ret] : f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* ;
	public final ltl_relational_expr_return ltl_relational_expr() throws RecognitionException {
		ltl_relational_expr_return retval = new ltl_relational_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_in_expr_return f = null;

		ltl_in_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:846:9: (f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* )
			// F:\\StudyAntlr\\SPC.g:846:11: f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7662);
				f=ltl_in_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:847:9: (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
				loop45:
				do {
					int alt45=7;
					switch ( input.LA(1) ) {
						case TOK_EQUAL:
						{
							alt45=1;
						}
						break;
						case TOK_NOTEQUAL:
						{
							alt45=2;
						}
						break;
						case TOK_LT:
						{
							alt45=3;
						}
						break;
						case TOK_GT:
						{
							alt45=4;
						}
						break;
						case TOK_LE:
						{
							alt45=5;
						}
						break;
						case TOK_GE:
						{
							alt45=6;
						}
						break;

					}

					switch (alt45) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:847:11: op= TOK_EQUAL s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ltl_relational_expr7678); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7683);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_eq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:849:11: op= TOK_NOTEQUAL s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7707); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7712);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_neq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:851:11: op= TOK_LT s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LT,FOLLOW_TOK_LT_in_ltl_relational_expr7736); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7741);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:853:11: op= TOK_GT s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GT,FOLLOW_TOK_GT_in_ltl_relational_expr7765); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7770);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_gt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 5 :
							// F:\\StudyAntlr\\SPC.g:855:11: op= TOK_LE s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LE,FOLLOW_TOK_LE_in_ltl_relational_expr7794); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7799);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_le(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 6 :
							// F:\\StudyAntlr\\SPC.g:857:11: op= TOK_GE s= ltl_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GE,FOLLOW_TOK_GE_in_ltl_relational_expr7823); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7828);
							s=ltl_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ge(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop45;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_relational_expr

	public static class ltl_in_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_in_expr
	// F:\\StudyAntlr\\SPC.g:861:1: ltl_in_expr returns [InternalSpec ret] : f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* ;
	public final ltl_in_expr_return ltl_in_expr() throws RecognitionException {
		ltl_in_expr_return retval = new ltl_in_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_union_expr_return f = null;

		ltl_union_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:864:9: (f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* )
			// F:\\StudyAntlr\\SPC.g:864:11: f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7892);
				f=ltl_union_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:865:9: (op= TOK_SETIN s= ltl_union_expr )*
				loop46:
				do {
					int alt46=2;
					int LA46_0 = input.LA(1);

					if ( (LA46_0==TOK_SETIN) ) {
						alt46=1;
					}


					switch (alt46) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:865:11: op= TOK_SETIN s= ltl_union_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ltl_in_expr7908); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7913);
							s=ltl_union_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_setin(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop46;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_in_expr

	public static class ltl_union_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_union_expr
	// F:\\StudyAntlr\\SPC.g:869:1: ltl_union_expr returns [InternalSpec ret] : f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* ;
	public final ltl_union_expr_return ltl_union_expr() throws RecognitionException {
		ltl_union_expr_return retval = new ltl_union_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_set_expr_return f = null;

		ltl_set_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:872:9: (f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* )
			// F:\\StudyAntlr\\SPC.g:872:11: f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7976);
				f=ltl_set_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:873:9: (op= TOK_UNION s= ltl_set_expr )*
				loop47:
				do {
					int alt47=2;
					int LA47_0 = input.LA(1);

					if ( (LA47_0==TOK_UNION) ) {
						alt47=1;
					}


					switch (alt47) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:873:11: op= TOK_UNION s= ltl_set_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ltl_union_expr7992); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7997);
							s=ltl_set_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_union(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop47;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_union_expr

	public static class ltl_set_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_set_expr
	// F:\\StudyAntlr\\SPC.g:877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );
	public final ltl_set_expr_return ltl_set_expr() throws RecognitionException {
		ltl_set_expr_return retval = new ltl_set_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LCB136=null;
		Token TOK_RCB138=null;
		ltl_shift_expr_return ltl_shift_expr134 = null;

		subrange_return subrange135 = null;

		ltl_set_list_expr_return ltl_set_list_expr137 = null;


		Object TOK_LCB136_tree=null;
		Object TOK_RCB138_tree=null;
		RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
		RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
		RewriteRuleSubtreeStream stream_ltl_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_set_list_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:880:9: ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) )
			int alt48=3;
			switch ( input.LA(1) ) {
				case TOK_NOT:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt48=1;
				}
				break;
				case TOK_NUMBER:
				{
					int LA48_2 = input.LA(2);

					if ( (LA48_2==TOK_TWODOTS) ) {
						alt48=2;
					}
					else if ( (LA48_2==EOF||(LA48_2>=TOK_INVAR_SPEC && LA48_2<=TOK_UNION)||(LA48_2>=TOK_LSHIFT && LA48_2<=TOK_CONCATENATION)||LA48_2==TOK_RP||(LA48_2>=TOK_LB && LA48_2<=TOK_UNTIL)||LA48_2==TOK_BUNTIL||(LA48_2>=TOK_SINCE && LA48_2<=TOK_BRELEASES)||LA48_2==TOK_DOT||LA48_2==TOK_SEMI) ) {
						alt48=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 2, input);

						throw nvae;
					}
				}
				break;
				case TOK_PLUS:
				{
					int LA48_3 = input.LA(2);

					if ( (LA48_3==TOK_NUMBER) ) {
						int LA48_7 = input.LA(3);

						if ( (LA48_7==EOF||(LA48_7>=TOK_INVAR_SPEC && LA48_7<=TOK_UNION)||(LA48_7>=TOK_LSHIFT && LA48_7<=TOK_CONCATENATION)||LA48_7==TOK_RP||(LA48_7>=TOK_LB && LA48_7<=TOK_UNTIL)||LA48_7==TOK_BUNTIL||(LA48_7>=TOK_SINCE && LA48_7<=TOK_BRELEASES)||LA48_7==TOK_DOT||LA48_7==TOK_SEMI) ) {
							alt48=1;
						}
						else if ( (LA48_7==TOK_TWODOTS) ) {
							alt48=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 7, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_MINUS:
				{
					int LA48_4 = input.LA(2);

					if ( (LA48_4==TOK_NUMBER) ) {
						int LA48_8 = input.LA(3);

						if ( (LA48_8==EOF||(LA48_8>=TOK_INVAR_SPEC && LA48_8<=TOK_UNION)||(LA48_8>=TOK_LSHIFT && LA48_8<=TOK_CONCATENATION)||LA48_8==TOK_RP||(LA48_8>=TOK_LB && LA48_8<=TOK_UNTIL)||LA48_8==TOK_BUNTIL||(LA48_8>=TOK_SINCE && LA48_8<=TOK_BRELEASES)||LA48_8==TOK_DOT||LA48_8==TOK_SEMI) ) {
							alt48=1;
						}
						else if ( (LA48_8==TOK_TWODOTS) ) {
							alt48=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 8, input);

							throw nvae;
						}
					}
					else if ( ((LA48_4>=TOK_PLUS && LA48_4<=TOK_MINUS)||(LA48_4>=TOK_NOT && LA48_4<=TOK_LP)||(LA48_4>=TOK_BOOL && LA48_4<=TOK_CASE)||(LA48_4>=TOK_WAREAD && LA48_4<=TOK_WAWRITE)||LA48_4==TOK_ATOM||LA48_4==TOK_NUMBER_WORD||(LA48_4>=TOK_FALSEEXP && LA48_4<=TOK_TRUEEXP)) ) {
						alt48=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 4, input);

						throw nvae;
					}
				}
				break;
				case TOK_LCB:
				{
					alt48=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("877:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 0, input);

					throw nvae;
			}

			switch (alt48) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:880:11: ltl_shift_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ltl_shift_expr_in_ltl_set_expr8058);
					ltl_shift_expr134=ltl_shift_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ltl_shift_expr134.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_shift_expr134.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:882:11: subrange
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_subrange_in_ltl_set_expr8080);
					subrange135=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, subrange135.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange135.start,subrange135.stop));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:884:11: TOK_LCB ltl_set_list_expr TOK_RCB
				{
					TOK_LCB136=(Token)input.LT(1);
					match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ltl_set_expr8102); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB136);

					pushFollow(FOLLOW_ltl_set_list_expr_in_ltl_set_expr8104);
					ltl_set_list_expr137=ltl_set_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_set_list_expr.add(ltl_set_list_expr137.getTree());
					TOK_RCB138=(Token)input.LT(1);
					match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ltl_set_expr8106); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB138);

					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB136.getText() + " " + input.toString(ltl_set_list_expr137.start,ltl_set_list_expr137.stop) + " " + TOK_RCB138.getText());
					}

					// AST REWRITE
					// elements: ltl_set_list_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 886:9: -> ^( SET_LIST_EXP_T ltl_set_list_expr )
						{
							// F:\\StudyAntlr\\SPC.g:886:12: ^( SET_LIST_EXP_T ltl_set_list_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

								adaptor.addChild(root_1, stream_ltl_set_list_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_set_expr

	public static class ltl_set_list_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_set_list_expr
	// F:\\StudyAntlr\\SPC.g:888:1: ltl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
	public final ltl_set_list_expr_return ltl_set_list_expr() throws RecognitionException {
		ltl_set_list_expr_return retval = new ltl_set_list_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_COMMA140=null;
		simple_root_expr_return simple_root_expr139 = null;

		simple_root_expr_return simple_root_expr141 = null;


		Object TOK_COMMA140_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:889:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
			// F:\\StudyAntlr\\SPC.g:889:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8159);
				simple_root_expr139=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr139.getTree());
				// F:\\StudyAntlr\\SPC.g:889:28: ( TOK_COMMA simple_root_expr )*
				loop49:
				do {
					int alt49=2;
					int LA49_0 = input.LA(1);

					if ( (LA49_0==TOK_COMMA) ) {
						alt49=1;
					}


					switch (alt49) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:889:29: TOK_COMMA simple_root_expr
						{
							TOK_COMMA140=(Token)input.LT(1);
							match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_set_list_expr8162); if (failed) return retval;
							pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8165);
							simple_root_expr141=simple_root_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr141.getTree());

						}
						break;

						default :
							break loop49;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_set_list_expr

	public static class ltl_shift_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_shift_expr
	// F:\\StudyAntlr\\SPC.g:891:1: ltl_shift_expr returns [InternalSpec ret] : f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* ;
	public final ltl_shift_expr_return ltl_shift_expr() throws RecognitionException {
		ltl_shift_expr_return retval = new ltl_shift_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_remainder_expr_return f = null;

		ltl_remainder_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:894:9: (f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* )
			// F:\\StudyAntlr\\SPC.g:894:11: f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8211);
				f=ltl_remainder_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:895:9: (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
				loop50:
				do {
					int alt50=3;
					int LA50_0 = input.LA(1);

					if ( (LA50_0==TOK_LSHIFT) ) {
						alt50=1;
					}
					else if ( (LA50_0==TOK_RSHIFT) ) {
						alt50=2;
					}


					switch (alt50) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:895:11: op= TOK_LSHIFT s= ltl_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8227); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8232);
							s=ltl_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:897:11: op= TOK_RSHIFT s= ltl_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8256); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8261);
							s=ltl_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_rshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop50;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_shift_expr

	public static class ltl_remainder_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_remainder_expr
	// F:\\StudyAntlr\\SPC.g:901:1: ltl_remainder_expr returns [InternalSpec ret] : f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* ;
	public final ltl_remainder_expr_return ltl_remainder_expr() throws RecognitionException {
		ltl_remainder_expr_return retval = new ltl_remainder_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_additive_expr_return f = null;

		ltl_additive_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:904:9: (f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* )
			// F:\\StudyAntlr\\SPC.g:904:11: f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8323);
				f=ltl_additive_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:905:9: (op= TOK_MOD s= ltl_additive_expr )*
				loop51:
				do {
					int alt51=2;
					int LA51_0 = input.LA(1);

					if ( (LA51_0==TOK_MOD) ) {
						alt51=1;
					}


					switch (alt51) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:905:11: op= TOK_MOD s= ltl_additive_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ltl_remainder_expr8339); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8344);
							s=ltl_additive_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_mod(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop51;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_remainder_expr

	public static class ltl_additive_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_additive_expr
	// F:\\StudyAntlr\\SPC.g:911:1: ltl_additive_expr returns [InternalSpec ret] : f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* ;
	public final ltl_additive_expr_return ltl_additive_expr() throws RecognitionException {
		ltl_additive_expr_return retval = new ltl_additive_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_multiplicative_expr_return f = null;

		ltl_multiplicative_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:914:9: (f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* )
			// F:\\StudyAntlr\\SPC.g:914:11: f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8408);
				f=ltl_multiplicative_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:915:9: (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
				loop52:
				do {
					int alt52=3;
					int LA52_0 = input.LA(1);

					if ( (LA52_0==TOK_PLUS) ) {
						alt52=1;
					}
					else if ( (LA52_0==TOK_MINUS) ) {
						alt52=2;
					}


					switch (alt52) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:915:11: op= TOK_PLUS s= ltl_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ltl_additive_expr8424); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8429);
							s=ltl_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_plus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:917:11: op= TOK_MINUS s= ltl_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_additive_expr8453); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8458);
							s=ltl_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_minus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop52;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_additive_expr

	public static class ltl_multiplicative_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_multiplicative_expr
	// F:\\StudyAntlr\\SPC.g:921:1: ltl_multiplicative_expr returns [InternalSpec ret] : f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* ;
	public final ltl_multiplicative_expr_return ltl_multiplicative_expr() throws RecognitionException {
		ltl_multiplicative_expr_return retval = new ltl_multiplicative_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_concatination_expr_return f = null;

		ltl_concatination_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:924:9: (f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* )
			// F:\\StudyAntlr\\SPC.g:924:11: f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8519);
				f=ltl_concatination_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:925:9: (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
				loop53:
				do {
					int alt53=3;
					int LA53_0 = input.LA(1);

					if ( (LA53_0==TOK_TIMES) ) {
						alt53=1;
					}
					else if ( (LA53_0==TOK_DIVIDE) ) {
						alt53=2;
					}


					switch (alt53) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:925:11: op= TOK_TIMES s= ltl_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8535); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8540);
							s=ltl_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_times(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:927:11: op= TOK_DIVIDE s= ltl_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8564); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8569);
							s=ltl_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_divide(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop53;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_multiplicative_expr

	public static class ltl_concatination_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_concatination_expr
	// F:\\StudyAntlr\\SPC.g:931:1: ltl_concatination_expr returns [InternalSpec ret] : f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* ;
	public final ltl_concatination_expr_return ltl_concatination_expr() throws RecognitionException {
		ltl_concatination_expr_return retval = new ltl_concatination_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_primary_expr_return f = null;

		ltl_primary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:934:9: (f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* )
			// F:\\StudyAntlr\\SPC.g:934:11: f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8630);
				f=ltl_primary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:935:9: (op= TOK_CONCATENATION s= ltl_primary_expr )*
				loop54:
				do {
					int alt54=2;
					int LA54_0 = input.LA(1);

					if ( (LA54_0==TOK_CONCATENATION) ) {
						alt54=1;
					}


					switch (alt54) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:935:11: op= TOK_CONCATENATION s= ltl_primary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8646); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8651);
							s=ltl_primary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += op.getText() + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_concatenation(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop54;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_concatination_expr

	public static class ltl_primary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_primary_expr
	// F:\\StudyAntlr\\SPC.g:940:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );
	public final ltl_primary_expr_return ltl_primary_expr() throws RecognitionException {
		ltl_primary_expr_return retval = new ltl_primary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ltl_primary_expr_return v = null;

		ltl_primary_expr_helper1_return ltl_primary_expr_helper1142 = null;


		Object op_tree=null;
		RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
		RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
		RewriteRuleSubtreeStream stream_ltl_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_primary_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:943:9: ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) )
			int alt55=3;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt55=1;
				}
				break;
				case TOK_MINUS:
				{
					alt55=2;
				}
				break;
				case TOK_NOT:
				{
					alt55=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("940:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );", 55, 0, input);

					throw nvae;
			}

			switch (alt55) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:943:11: ltl_primary_expr_helper1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8712);
					ltl_primary_expr_helper1142=ltl_primary_expr_helper1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ltl_primary_expr_helper1142.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_primary_expr_helper1142.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:945:11: op= TOK_MINUS v= ltl_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_primary_expr8736); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_MINUS.add(op);

					pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8740);
					v=ltl_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_unary_minus(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: v
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 947:9: -> ^( TOK_UNARY_MINUS_T $v)
						{
							// F:\\StudyAntlr\\SPC.g:947:12: ^( TOK_UNARY_MINUS_T $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:948:11: op= TOK_NOT v= ltl_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_primary_expr8781); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NOT.add(op);

					pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8785);
					v=ltl_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: v, TOK_NOT
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 950:9: -> ^( TOK_NOT $v)
						{
							// F:\\StudyAntlr\\SPC.g:950:12: ^( TOK_NOT $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_primary_expr

	public static class ltl_primary_expr_helper1_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_primary_expr_helper1
	// F:\\StudyAntlr\\SPC.g:953:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ltl_know primary_expr_select -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select ) | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
	public final ltl_primary_expr_helper1_return ltl_primary_expr_helper1() throws RecognitionException {
		ltl_primary_expr_helper1_return retval = new ltl_primary_expr_helper1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tc1=null;
		Token tc2=null;
		Token TOK_LP148=null;
		Token TOK_RP150=null;
		Token TOK_BOOL152=null;
		Token TOK_LP153=null;
		Token TOK_RP155=null;
		Token TOK_WORD1157=null;
		Token TOK_LP158=null;
		Token TOK_RP160=null;
		Token TOK_NEXT162=null;
		Token TOK_LP163=null;
		Token TOK_RP165=null;
		Token TOK_CASE167=null;
		Token TOK_ESAC169=null;
		Token TOK_WAREAD171=null;
		Token TOK_LP172=null;
		Token TOK_COMMA173=null;
		Token TOK_RP174=null;
		Token TOK_WAWRITE176=null;
		Token TOK_LP177=null;
		Token TOK_RP178=null;
		simple_root_expr_return f = null;

		simple_root_expr_return s = null;

		simple_root_expr_return m = null;

		constant_return constant143 = null;

		primary_expr_select_return primary_expr_select144 = null;

		primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1145 = null;

		ltl_know_return ltl_know146 = null;

		primary_expr_select_return primary_expr_select147 = null;

		ltl_root_expr_return ltl_root_expr149 = null;

		primary_expr_select_return primary_expr_select151 = null;

		simple_root_expr_return simple_root_expr154 = null;

		primary_expr_select_return primary_expr_select156 = null;

		simple_root_expr_return simple_root_expr159 = null;

		primary_expr_select_return primary_expr_select161 = null;

		simple_root_expr_return simple_root_expr164 = null;

		primary_expr_select_return primary_expr_select166 = null;

		case_element_list_expr_return case_element_list_expr168 = null;

		primary_expr_select_return primary_expr_select170 = null;

		primary_expr_select_return primary_expr_select175 = null;

		primary_expr_select_return primary_expr_select179 = null;


		Object tc1_tree=null;
		Object tc2_tree=null;
		Object TOK_LP148_tree=null;
		Object TOK_RP150_tree=null;
		Object TOK_BOOL152_tree=null;
		Object TOK_LP153_tree=null;
		Object TOK_RP155_tree=null;
		Object TOK_WORD1157_tree=null;
		Object TOK_LP158_tree=null;
		Object TOK_RP160_tree=null;
		Object TOK_NEXT162_tree=null;
		Object TOK_LP163_tree=null;
		Object TOK_RP165_tree=null;
		Object TOK_CASE167_tree=null;
		Object TOK_ESAC169_tree=null;
		Object TOK_WAREAD171_tree=null;
		Object TOK_LP172_tree=null;
		Object TOK_COMMA173_tree=null;
		Object TOK_RP174_tree=null;
		Object TOK_WAWRITE176_tree=null;
		Object TOK_LP177_tree=null;
		Object TOK_RP178_tree=null;
		RewriteRuleTokenStream stream_TOK_LP=new RewriteRuleTokenStream(adaptor,"token TOK_LP");
		RewriteRuleTokenStream stream_TOK_WAREAD=new RewriteRuleTokenStream(adaptor,"token TOK_WAREAD");
		RewriteRuleTokenStream stream_TOK_COMMA=new RewriteRuleTokenStream(adaptor,"token TOK_COMMA");
		RewriteRuleTokenStream stream_TOK_WORD1=new RewriteRuleTokenStream(adaptor,"token TOK_WORD1");
		RewriteRuleTokenStream stream_TOK_ESAC=new RewriteRuleTokenStream(adaptor,"token TOK_ESAC");
		RewriteRuleTokenStream stream_TOK_NEXT=new RewriteRuleTokenStream(adaptor,"token TOK_NEXT");
		RewriteRuleTokenStream stream_TOK_CASE=new RewriteRuleTokenStream(adaptor,"token TOK_CASE");
		RewriteRuleTokenStream stream_TOK_WAWRITE=new RewriteRuleTokenStream(adaptor,"token TOK_WAWRITE");
		RewriteRuleTokenStream stream_TOK_BOOL=new RewriteRuleTokenStream(adaptor,"token TOK_BOOL");
		RewriteRuleTokenStream stream_TOK_RP=new RewriteRuleTokenStream(adaptor,"token TOK_RP");
		RewriteRuleSubtreeStream stream_case_element_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_element_list_expr");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		RewriteRuleSubtreeStream stream_ltl_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_root_expr");
		RewriteRuleSubtreeStream stream_ltl_know=new RewriteRuleSubtreeStream(adaptor,"rule ltl_know");
		RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:956:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ltl_know primary_expr_select -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select ) | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
			int alt56=10;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt56=1;
				}
				break;
				case TOK_ATOM:
				{
					alt56=2;
				}
				break;
				case TOK_LP:
				{
					int LA56_3 = input.LA(2);

					if ( (LA56_3==TOK_LCB||(LA56_3>=TOK_PLUS && LA56_3<=TOK_MINUS)||(LA56_3>=TOK_NOT && LA56_3<=TOK_LP)||(LA56_3>=TOK_BOOL && LA56_3<=TOK_CASE)||(LA56_3>=TOK_WAREAD && LA56_3<=TOK_WAWRITE)||(LA56_3>=TOK_OP_NEXT && LA56_3<=TOK_OP_BOUND_GLOBALLY)||LA56_3==TOK_NUMBER||LA56_3==TOK_NUMBER_WORD||(LA56_3>=TOK_FALSEEXP && LA56_3<=TOK_TRUEEXP)) ) {
						alt56=4;
					}
					else if ( (LA56_3==TOK_ATOM) ) {
						int LA56_11 = input.LA(3);

						if ( (LA56_11==TOK_KNOW) ) {
							alt56=3;
						}
						else if ( ((LA56_11>=TOK_IMPLIES && LA56_11<=TOK_UNION)||(LA56_11>=TOK_LSHIFT && LA56_11<=TOK_CONCATENATION)||LA56_11==TOK_RP||(LA56_11>=TOK_LB && LA56_11<=TOK_UNTIL)||LA56_11==TOK_BUNTIL||(LA56_11>=TOK_SINCE && LA56_11<=TOK_BRELEASES)||LA56_11==TOK_DOT) ) {
							alt56=4;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("953:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ltl_know primary_expr_select -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select ) | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 11, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("953:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ltl_know primary_expr_select -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select ) | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_BOOL:
				{
					alt56=5;
				}
				break;
				case TOK_WORD1:
				{
					alt56=6;
				}
				break;
				case TOK_NEXT:
				{
					alt56=7;
				}
				break;
				case TOK_CASE:
				{
					alt56=8;
				}
				break;
				case TOK_WAREAD:
				{
					alt56=9;
				}
				break;
				case TOK_WAWRITE:
				{
					alt56=10;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("953:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ltl_know primary_expr_select -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select ) | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 0, input);

					throw nvae;
			}

			switch (alt56) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:956:11: constant primary_expr_select
				{
					pushFollow(FOLLOW_constant_in_ltl_primary_expr_helper18850);
					constant143=constant();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_constant.add(constant143.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18852);
					primary_expr_select144=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select144.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: constant, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 959:9: -> ^( VALUE_T constant NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:959:12: ^( VALUE_T constant NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

								adaptor.addChild(root_1, stream_constant.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:960:11: primary_expr_helper1_pointer1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18903);
					primary_expr_helper1_pointer1145=primary_expr_helper1_pointer1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1145.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:968:11: ltl_know primary_expr_select
				{
					pushFollow(FOLLOW_ltl_know_in_ltl_primary_expr_helper18939);
					ltl_know146=ltl_know();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_know.add(ltl_know146.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18941);
					primary_expr_select147=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select147.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_know146.ret;
					}

					// AST REWRITE
					// elements: primary_expr_select, ltl_know
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 970:9: -> ^( LTL_KNOW_T ltl_know NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:970:12: ^( LTL_KNOW_T ltl_know NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(LTL_KNOW_T, "LTL_KNOW_T"), root_1);

								adaptor.addChild(root_1, stream_ltl_know.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:975:11: TOK_LP ltl_root_expr TOK_RP primary_expr_select
				{
					TOK_LP148=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19024); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP148);

					pushFollow(FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper19026);
					ltl_root_expr149=ltl_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ltl_root_expr.add(ltl_root_expr149.getTree());
					TOK_RP150=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19028); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP150);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19030);
					primary_expr_select151=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select151.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ltl_root_expr149.ret;
					}

					// AST REWRITE
					// elements: ltl_root_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 977:9: -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:977:12: ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

								adaptor.addChild(root_1, stream_ltl_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:981:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_BOOL152=(Token)input.LT(1);
					match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper19093); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL152);

					TOK_LP153=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19095); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP153);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19097);
					simple_root_expr154=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr154.getTree());
					TOK_RP155=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19099); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP155);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19101);
					primary_expr_select156=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select156.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_BOOL, simple_root_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 984:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:984:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:985:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WORD1157=(Token)input.LT(1);
					match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper19152); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1157);

					TOK_LP158=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19154); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP158);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19156);
					simple_root_expr159=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr159.getTree());
					TOK_RP160=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19158); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP160);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19160);
					primary_expr_select161=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select161.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: simple_root_expr, primary_expr_select, TOK_WORD1
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 988:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:988:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:990:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_NEXT162=(Token)input.LT(1);
					match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19220); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT162);

					TOK_LP163=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19222); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP163);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19224);
					simple_root_expr164=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr164.getTree());
					TOK_RP165=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19226); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP165);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19228);
					primary_expr_select166=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select166.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_NEXT, primary_expr_select, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 993:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:993:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:995:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
				{
					TOK_CASE167=(Token)input.LT(1);
					match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19288); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE167);

					pushFollow(FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19290);
					case_element_list_expr168=case_element_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr168.getTree());
					TOK_ESAC169=(Token)input.LT(1);
					match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19292); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC169);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19294);
					primary_expr_select170=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select170.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: case_element_list_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 998:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:998:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

								adaptor.addChild(root_1, stream_case_element_list_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:1000:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAREAD171=(Token)input.LT(1);
					match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19354); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD171);

					TOK_LP172=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19356); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP172);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19360);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					TOK_COMMA173=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19362); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA173);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19366);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP174=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19368); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP174);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19370);
					primary_expr_select175=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select175.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_WAREAD, s, primary_expr_select, f
					// token labels:
					// rule labels: s, f, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1003:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1003:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 10 :
					// F:\\StudyAntlr\\SPC.g:1005:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAWRITE176=(Token)input.LT(1);
					match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19434); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE176);

					TOK_LP177=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19436); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP177);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19440);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					tc1=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19444); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19448);
					m=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
					tc2=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19452); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

					pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19456);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP178=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19458); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP178);

					pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19460);
					primary_expr_select179=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select179.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: s, TOK_WAWRITE, m, f, primary_expr_select
					// token labels:
					// rule labels: s, f, m, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"token m",m!=null?m.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1008:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1008:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_m.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_primary_expr_helper1

	public static class ltl_know_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ltl_know
	// F:\\StudyAntlr\\SPC.g:1012:1: ltl_know returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_KNOW f= ltl_root_expr TOK_RP ;
	public final ltl_know_return ltl_know() throws RecognitionException {
		ltl_know_return retval = new ltl_know_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token opk=null;
		Token TOK_LP180=null;
		Token TOK_RP181=null;
		agent_name_return agent = null;

		ltl_root_expr_return f = null;


		Object opk_tree=null;
		Object TOK_LP180_tree=null;
		Object TOK_RP181_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1015:9: ( TOK_LP agent= agent_name opk= TOK_KNOW f= ltl_root_expr TOK_RP )
			// F:\\StudyAntlr\\SPC.g:1015:11: TOK_LP agent= agent_name opk= TOK_KNOW f= ltl_root_expr TOK_RP
			{
				root_0 = (Object)adaptor.nil();

				TOK_LP180=(Token)input.LT(1);
				match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_know9550); if (failed) return retval;
				pushFollow(FOLLOW_agent_name_in_ltl_know9555);
				agent=agent_name();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
				opk=(Token)input.LT(1);
				match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ltl_know9559); if (failed) return retval;
				if ( backtracking==0 ) {
					opk_tree = (Object)adaptor.create(opk);
					root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
				}
				pushFollow(FOLLOW_ltl_root_expr_in_ltl_know9564);
				f=ltl_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				TOK_RP181=(Token)input.LT(1);
				match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_know9566); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = input.toString(agent.start,agent.stop) + " " + opk.getText() + " " + input.toString(f.start,f.stop);
					if(!er()) append_end = true;
					if(!er()) retval.ret = InitSpec.mk_ltl_know(input, ((Token)retval.start), exp_str, agent.ret, f.ret);

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ltl_know

	public static class ctls_root_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_root_expr
	// F:\\StudyAntlr\\SPC.g:1028:1: ctls_root_expr returns [InternalSpec ret] : ctls_implies_expr ;
	public final ctls_root_expr_return ctls_root_expr() throws RecognitionException {
		ctls_root_expr_return retval = new ctls_root_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctls_implies_expr_return ctls_implies_expr182 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1029:9: ( ctls_implies_expr )
			// F:\\StudyAntlr\\SPC.g:1029:11: ctls_implies_expr
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_implies_expr_in_ctls_root_expr9622);
				ctls_implies_expr182=ctls_implies_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, ctls_implies_expr182.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret = ctls_implies_expr182.ret;
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_root_expr

	public static class ctls_implies_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_implies_expr
	// F:\\StudyAntlr\\SPC.g:1031:1: ctls_implies_expr returns [InternalSpec ret] : f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? ;
	public final ctls_implies_expr_return ctls_implies_expr() throws RecognitionException {
		ctls_implies_expr_return retval = new ctls_implies_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_iff_expr_return f = null;

		ctls_implies_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1034:9: (f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? )
			// F:\\StudyAntlr\\SPC.g:1034:11: f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )?
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_iff_expr_in_ctls_implies_expr9665);
				f=ctls_iff_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1035:9: (op= TOK_IMPLIES s= ctls_implies_expr )?
				int alt57=2;
				int LA57_0 = input.LA(1);

				if ( (LA57_0==TOK_IMPLIES) ) {
					alt57=1;
				}
				switch (alt57) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:1035:11: op= TOK_IMPLIES s= ctls_implies_expr
					{
						op=(Token)input.LT(1);
						match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9681); if (failed) return retval;
						if ( backtracking==0 ) {
							op_tree = (Object)adaptor.create(op);
							root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
						}
						pushFollow(FOLLOW_ctls_implies_expr_in_ctls_implies_expr9686);
						s=ctls_implies_expr();
						_fsp--;
						if (failed) return retval;
						if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
						if ( backtracking==0 ) {
							if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_imply(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
						}

					}
					break;

				}


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_implies_expr

	public static class ctls_iff_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_iff_expr
	// F:\\StudyAntlr\\SPC.g:1039:1: ctls_iff_expr returns [InternalSpec ret] : f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* ;
	public final ctls_iff_expr_return ctls_iff_expr() throws RecognitionException {
		ctls_iff_expr_return retval = new ctls_iff_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_or_expr_return f = null;

		ctls_or_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1042:9: (f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* )
			// F:\\StudyAntlr\\SPC.g:1042:11: f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9751);
				f=ctls_or_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1043:9: (op= TOK_IFF s= ctls_or_expr )*
				loop58:
				do {
					int alt58=2;
					int LA58_0 = input.LA(1);

					if ( (LA58_0==TOK_IFF) ) {
						alt58=1;
					}


					switch (alt58) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1043:11: op= TOK_IFF s= ctls_or_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctls_iff_expr9767); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9772);
							s=ctls_or_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_iff(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop58;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_iff_expr

	public static class ctls_or_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_or_expr
	// F:\\StudyAntlr\\SPC.g:1047:1: ctls_or_expr returns [InternalSpec ret] : f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* ;
	public final ctls_or_expr_return ctls_or_expr() throws RecognitionException {
		ctls_or_expr_return retval = new ctls_or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_and_expr_return f = null;

		ctls_and_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1050:9: (f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* )
			// F:\\StudyAntlr\\SPC.g:1050:11: f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9835);
				f=ctls_and_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1051:9: (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
				loop59:
				do {
					int alt59=4;
					switch ( input.LA(1) ) {
						case TOK_OR:
						{
							alt59=1;
						}
						break;
						case TOK_XOR:
						{
							alt59=2;
						}
						break;
						case TOK_XNOR:
						{
							alt59=3;
						}
						break;

					}

					switch (alt59) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1051:11: op= TOK_OR s= ctls_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_OR,FOLLOW_TOK_OR_in_ctls_or_expr9851); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9856);
							s=ctls_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_or(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1053:11: op= TOK_XOR s= ctls_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctls_or_expr9880); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9885);
							s=ctls_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:1055:11: op= TOK_XNOR s= ctls_and_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctls_or_expr9909); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9914);
							s=ctls_and_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_xnor(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop59;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_or_expr

	public static class ctls_and_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_and_expr
	// F:\\StudyAntlr\\SPC.g:1059:1: ctls_and_expr returns [InternalSpec ret] : f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* ;
	public final ctls_and_expr_return ctls_and_expr() throws RecognitionException {
		ctls_and_expr_return retval = new ctls_and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_ltl_binary_expr_return f = null;

		ctls_ltl_binary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1062:9: (f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* )
			// F:\\StudyAntlr\\SPC.g:1062:11: f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9977);
				f=ctls_ltl_binary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1063:9: (op= TOK_AND s= ctls_ltl_binary_expr )*
				loop60:
				do {
					int alt60=2;
					int LA60_0 = input.LA(1);

					if ( (LA60_0==TOK_AND) ) {
						alt60=1;
					}


					switch (alt60) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1063:11: op= TOK_AND s= ctls_ltl_binary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_AND,FOLLOW_TOK_AND_in_ctls_and_expr9993); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9998);
							s=ctls_ltl_binary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_and(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop60;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_and_expr

	public static class ctls_ltl_binary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ltl_binary_expr
	// F:\\StudyAntlr\\SPC.g:1069:1: ctls_ltl_binary_expr returns [InternalSpec ret] : f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* ;
	public final ctls_ltl_binary_expr_return ctls_ltl_binary_expr() throws RecognitionException {
		ctls_ltl_binary_expr_return retval = new ctls_ltl_binary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_ltl_unary_expr_return f = null;

		ctls_ltl_unary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1072:9: (f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* )
			// F:\\StudyAntlr\\SPC.g:1072:11: f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10062);
				f=ctls_ltl_unary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1073:9: (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
				loop61:
				do {
					int alt61=5;
					switch ( input.LA(1) ) {
						case TOK_UNTIL:
						{
							alt61=1;
						}
						break;
						case TOK_SINCE:
						{
							alt61=2;
						}
						break;
						case TOK_RELEASES:
						{
							alt61=3;
						}
						break;
						case TOK_TRIGGERED:
						{
							alt61=4;
						}
						break;

					}

					switch (alt61) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1073:11: op= TOK_UNTIL s= ctls_ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr10078); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10083);
							s=ctls_ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_until(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1075:11: op= TOK_SINCE s= ctls_ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr10107); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10112);
							s=ctls_ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_since(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:1077:11: op= TOK_RELEASES s= ctls_ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr10136); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10141);
							s=ctls_ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_releases(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:1079:11: op= TOK_TRIGGERED s= ctls_ltl_unary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr10165); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10170);
							s=ctls_ltl_unary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_triggered(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop61;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ltl_binary_expr

	public static class ctls_ltl_unary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ltl_unary_expr
	// F:\\StudyAntlr\\SPC.g:1083:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );
	public final ctls_ltl_unary_expr_return ctls_ltl_unary_expr() throws RecognitionException {
		ctls_ltl_unary_expr_return retval = new ctls_ltl_unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctls_ltl_pure_unary_expr_return ctls_ltl_pure_unary_expr183 = null;

		ctls_ctl_expr_return ctls_ctl_expr184 = null;


		RewriteRuleSubtreeStream stream_ctls_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_ltl_pure_unary_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:1084:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr )
			int alt62=2;
			int LA62_0 = input.LA(1);

			if ( (LA62_0==TOK_OP_NEXT) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_PREV) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_NOTPREVNOT) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_GLOBALLY) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_HISTORICALLY) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_FINALLY) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_OP_ONCE) && (synpred7())) {
				alt62=1;
			}
			else if ( (LA62_0==TOK_NOT) ) {
				int LA62_8 = input.LA(2);

				if ( (LA62_8==TOK_OP_NEXT) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_PREV) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_NOTPREVNOT) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_GLOBALLY) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_HISTORICALLY) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_FINALLY) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_OP_ONCE) && (synpred7())) {
					alt62=1;
				}
				else if ( (LA62_8==TOK_NOT) ) {
					int LA62_17 = input.LA(3);

					if ( (synpred7()) ) {
						alt62=1;
					}
					else if ( (true) ) {
						alt62=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1083:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 17, input);

						throw nvae;
					}
				}
				else if ( ((LA62_8>=TOK_PLUS && LA62_8<=TOK_MINUS)||LA62_8==TOK_LP||(LA62_8>=TOK_BOOL && LA62_8<=TOK_CASE)||(LA62_8>=TOK_WAREAD && LA62_8<=TOK_AA)||LA62_8==TOK_EE||LA62_8==TOK_ATOM||LA62_8==TOK_NUMBER||LA62_8==TOK_NUMBER_WORD||(LA62_8>=TOK_FALSEEXP && LA62_8<=TOK_TRUEEXP)) ) {
					alt62=2;
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1083:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 8, input);

					throw nvae;
				}
			}
			else if ( (LA62_0==TOK_LCB||(LA62_0>=TOK_PLUS && LA62_0<=TOK_MINUS)||LA62_0==TOK_LP||(LA62_0>=TOK_BOOL && LA62_0<=TOK_CASE)||(LA62_0>=TOK_WAREAD && LA62_0<=TOK_AA)||LA62_0==TOK_EE||LA62_0==TOK_ATOM||LA62_0==TOK_NUMBER||LA62_0==TOK_NUMBER_WORD||(LA62_0>=TOK_FALSEEXP && LA62_0<=TOK_TRUEEXP)) ) {
				alt62=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1083:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 0, input);

				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1084:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr
				{
					pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr10321);
					ctls_ltl_pure_unary_expr183=ctls_ltl_pure_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_ltl_pure_unary_expr.add(ctls_ltl_pure_unary_expr183.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_ltl_pure_unary_expr183.ret;
					}

					// AST REWRITE
					// elements: ctls_ltl_pure_unary_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1093:9: -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
						{
							// F:\\StudyAntlr\\SPC.g:1093:12: ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(PURE_LTL_T, "PURE_LTL_T"), root_1);

								adaptor.addChild(root_1, stream_ctls_ltl_pure_unary_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1094:11: ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10361);
					ctls_ctl_expr184=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ctl_expr184.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_ctl_expr184.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ltl_unary_expr

	public static class ctls_ltl_pure_unary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ltl_pure_unary_expr
	// F:\\StudyAntlr\\SPC.g:1097:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );
	public final ctls_ltl_pure_unary_expr_return ctls_ltl_pure_unary_expr() throws RecognitionException {
		ctls_ltl_pure_unary_expr_return retval = new ctls_ltl_pure_unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_ltl_unary_expr_return f = null;

		ctls_ltl_pure_unary_expr_return fp = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1100:9: (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr )
			int alt63=8;
			switch ( input.LA(1) ) {
				case TOK_OP_NEXT:
				{
					alt63=1;
				}
				break;
				case TOK_OP_PREV:
				{
					alt63=2;
				}
				break;
				case TOK_OP_NOTPREVNOT:
				{
					alt63=3;
				}
				break;
				case TOK_OP_GLOBALLY:
				{
					alt63=4;
				}
				break;
				case TOK_OP_HISTORICALLY:
				{
					alt63=5;
				}
				break;
				case TOK_OP_FINALLY:
				{
					alt63=6;
				}
				break;
				case TOK_OP_ONCE:
				{
					alt63=7;
				}
				break;
				case TOK_NOT:
				{
					alt63=8;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1097:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );", 63, 0, input);

					throw nvae;
			}

			switch (alt63) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1100:11: op= TOK_OP_NEXT f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10410); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10415);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_next(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1102:11: op= TOK_OP_PREV f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10439); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10444);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_prev(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1104:11: op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10468); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10473);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_notprevnot(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:1106:11: op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10497); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10502);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_globally(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:1108:11: op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10526); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10531);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_historically(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:1110:11: op= TOK_OP_FINALLY f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10555); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10560);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_finally(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:1112:11: op= TOK_OP_ONCE f= ctls_ltl_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10584); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10589);
					f=ctls_ltl_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_once(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:1115:11: op= TOK_NOT fp= ctls_ltl_pure_unary_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10623); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10628);
					fp=ctls_ltl_pure_unary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fp.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fp.start,fp.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), exp_str, fp.ret);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ltl_pure_unary_expr

	public static class ctls_ctl_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ctl_expr
	// F:\\StudyAntlr\\SPC.g:1120:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );
	public final ctls_ctl_expr_return ctls_ctl_expr() throws RecognitionException {
		ctls_ctl_expr_return retval = new ctls_ctl_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctls_pure_ctl_expr_return ctls_pure_ctl_expr185 = null;

		ctls_relational_expr_return ctls_relational_expr186 = null;


		RewriteRuleSubtreeStream stream_ctls_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_pure_ctl_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:1121:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr )
			int alt64=2;
			int LA64_0 = input.LA(1);

			if ( (LA64_0==TOK_EX) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_AX) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_EF) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_AF) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_EG) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_AG) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_AA) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_EE) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_EBF) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_ABF) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_EBG) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_ABG) && (synpred8())) {
				alt64=1;
			}
			else if ( (LA64_0==TOK_NOT) ) {
				int LA64_13 = input.LA(2);

				if ( ((LA64_13>=TOK_PLUS && LA64_13<=TOK_MINUS)||LA64_13==TOK_LP||(LA64_13>=TOK_BOOL && LA64_13<=TOK_CASE)||(LA64_13>=TOK_WAREAD && LA64_13<=TOK_WAWRITE)||LA64_13==TOK_ATOM||LA64_13==TOK_NUMBER||LA64_13==TOK_NUMBER_WORD||(LA64_13>=TOK_FALSEEXP && LA64_13<=TOK_TRUEEXP)) ) {
					alt64=2;
				}
				else if ( (LA64_13==TOK_NOT) ) {
					int LA64_15 = input.LA(3);

					if ( (synpred8()) ) {
						alt64=1;
					}
					else if ( (true) ) {
						alt64=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1120:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 15, input);

						throw nvae;
					}
				}
				else if ( (LA64_13==TOK_EX) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_AX) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_EF) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_AF) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_EG) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_AG) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_AA) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_EE) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_EBF) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_ABF) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_EBG) && (synpred8())) {
					alt64=1;
				}
				else if ( (LA64_13==TOK_ABG) && (synpred8())) {
					alt64=1;
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1120:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 13, input);

					throw nvae;
				}
			}
			else if ( (LA64_0==TOK_LCB||(LA64_0>=TOK_PLUS && LA64_0<=TOK_MINUS)||LA64_0==TOK_LP||(LA64_0>=TOK_BOOL && LA64_0<=TOK_CASE)||(LA64_0>=TOK_WAREAD && LA64_0<=TOK_WAWRITE)||LA64_0==TOK_ATOM||LA64_0==TOK_NUMBER||LA64_0==TOK_NUMBER_WORD||(LA64_0>=TOK_FALSEEXP && LA64_0<=TOK_TRUEEXP)) ) {
				alt64=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1120:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 0, input);

				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1121:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr
				{
					pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10836);
					ctls_pure_ctl_expr185=ctls_pure_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_pure_ctl_expr.add(ctls_pure_ctl_expr185.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_pure_ctl_expr185.ret;
					}

					// AST REWRITE
					// elements: ctls_pure_ctl_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1135:9: -> ^( PURE_CTL_T ctls_pure_ctl_expr )
						{
							// F:\\StudyAntlr\\SPC.g:1135:12: ^( PURE_CTL_T ctls_pure_ctl_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(PURE_CTL_T, "PURE_CTL_T"), root_1);

								adaptor.addChild(root_1, stream_ctls_pure_ctl_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1136:11: ctls_relational_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10874);
					ctls_relational_expr186=ctls_relational_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_relational_expr186.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_relational_expr186.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ctl_expr

	public static class ctls_pure_ctl_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_pure_ctl_expr
	// F:\\StudyAntlr\\SPC.g:1139:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );
	public final ctls_pure_ctl_expr_return ctls_pure_ctl_expr() throws RecognitionException {
		ctls_pure_ctl_expr_return retval = new ctls_pure_ctl_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_ctl_expr_return f = null;

		subrange_return fsr = null;

		ctls_ctl_expr_return s = null;

		ctls_pure_ctl_expr_return fp = null;

		ctls_aa_return ctls_aa187 = null;

		ctls_ee_return ctls_ee188 = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1142:9: (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr )
			int alt65=13;
			int LA65_0 = input.LA(1);

			if ( (LA65_0==TOK_EX) ) {
				alt65=1;
			}
			else if ( (LA65_0==TOK_AX) ) {
				alt65=2;
			}
			else if ( (LA65_0==TOK_EF) ) {
				alt65=3;
			}
			else if ( (LA65_0==TOK_AF) ) {
				alt65=4;
			}
			else if ( (LA65_0==TOK_EG) ) {
				alt65=5;
			}
			else if ( (LA65_0==TOK_AG) ) {
				alt65=6;
			}
			else if ( (LA65_0==TOK_AA) && (synpred9())) {
				alt65=7;
			}
			else if ( (LA65_0==TOK_EE) && (synpred10())) {
				alt65=8;
			}
			else if ( (LA65_0==TOK_EBF) ) {
				alt65=9;
			}
			else if ( (LA65_0==TOK_ABF) ) {
				alt65=10;
			}
			else if ( (LA65_0==TOK_EBG) ) {
				alt65=11;
			}
			else if ( (LA65_0==TOK_ABG) ) {
				alt65=12;
			}
			else if ( (LA65_0==TOK_NOT) ) {
				alt65=13;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1139:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );", 65, 0, input);

				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1142:11: op= TOK_EX f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EX,FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10925); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10930);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EX(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1144:11: op= TOK_AX f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AX,FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10954); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10959);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AX(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1146:11: op= TOK_EF f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EF,FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10983); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10988);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EF(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:1148:11: op= TOK_AF f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AF,FOLLOW_TOK_AF_in_ctls_pure_ctl_expr11012); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11017);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AF(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:1150:11: op= TOK_EG f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EG,FOLLOW_TOK_EG_in_ctls_pure_ctl_expr11041); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11046);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EG(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:1152:11: op= TOK_AG f= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_AG,FOLLOW_TOK_AG_in_ctls_pure_ctl_expr11070); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11075);
					f=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(f.start,f.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AG(input, ((Token)retval.start), exp_str, f.ret);
					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:1155:11: ( TOK_AA )=> ctls_aa
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_aa_in_ctls_pure_ctl_expr11104);
					ctls_aa187=ctls_aa();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_aa187.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_aa187.ret;
					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:1156:11: ( TOK_EE )=> ctls_ee
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_ee_in_ctls_pure_ctl_expr11124);
					ctls_ee188=ctls_ee();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ee188.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_ee188.ret;
					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:1158:11: op= TOK_EBF fsr= subrange s= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EBF,FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr11141); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr11146);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11150);
					s=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBF(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 10 :
					// F:\\StudyAntlr\\SPC.g:1160:11: op= TOK_ABF fsr= subrange s= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_ABF,FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr11174); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr11179);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11183);
					s=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABF(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 11 :
					// F:\\StudyAntlr\\SPC.g:1162:11: op= TOK_EBG fsr= subrange s= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_EBG,FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr11207); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr11212);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11216);
					s=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBG(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 12 :
					// F:\\StudyAntlr\\SPC.g:1164:11: op= TOK_ABG fsr= subrange s= ctls_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_ABG,FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr11240); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr11245);
					fsr=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
					pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11249);
					s=ctls_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fsr.start,fsr.stop) + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABG(input, ((Token)retval.start), exp_str, fsr.ret, s.ret);
					}

				}
				break;
				case 13 :
					// F:\\StudyAntlr\\SPC.g:1167:11: op= TOK_NOT fp= ctls_pure_ctl_expr
				{
					root_0 = (Object)adaptor.nil();

					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr11283); if (failed) return retval;
					if ( backtracking==0 ) {
						op_tree = (Object)adaptor.create(op);
						root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
					}
					pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr11288);
					fp=ctls_pure_ctl_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, fp.getTree());
					if ( backtracking==0 ) {
						if (!er()) exp_str = op.getText() + " " + input.toString(fp.start,fp.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), exp_str, fp.ret);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_pure_ctl_expr

	public static class ctls_aa_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_aa
	// F:\\StudyAntlr\\SPC.g:1170:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );
	public final ctls_aa_return ctls_aa() throws RecognitionException {
		ctls_aa_return retval = new ctls_aa_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctls_abu_return ctls_abu189 = null;

		ctls_au_return ctls_au190 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1172:9: ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au )
			int alt66=2;
			int LA66_0 = input.LA(1);

			if ( (LA66_0==TOK_AA) ) {
				int LA66_1 = input.LA(2);

				if ( (LA66_1==TOK_LB) ) {
					int LA66_2 = input.LA(3);

					if ( (synpred11()) ) {
						alt66=1;
					}
					else if ( (synpred12()) ) {
						alt66=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1170:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 2, input);

						throw nvae;
					}
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1170:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 1, input);

					throw nvae;
				}
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1170:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 0, input);

				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1172:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_abu_in_ctls_aa11347);
					ctls_abu189=ctls_abu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_abu189.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_abu189.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1174:11: ( TOK_AA TOK_LB )=> ctls_au
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_au_in_ctls_aa11378);
					ctls_au190=ctls_au();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_au190.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_au190.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_aa

	public static class ctls_ee_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ee
	// F:\\StudyAntlr\\SPC.g:1178:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );
	public final ctls_ee_return ctls_ee() throws RecognitionException {
		ctls_ee_return retval = new ctls_ee_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ctls_ebu_return ctls_ebu191 = null;

		ctls_eu_return ctls_eu192 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1180:9: ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu )
			int alt67=2;
			int LA67_0 = input.LA(1);

			if ( (LA67_0==TOK_EE) ) {
				int LA67_1 = input.LA(2);

				if ( (LA67_1==TOK_LB) ) {
					int LA67_2 = input.LA(3);

					if ( (synpred13()) ) {
						alt67=1;
					}
					else if ( (synpred14()) ) {
						alt67=2;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1178:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 2, input);

						throw nvae;
					}
				}
				else {
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1178:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 1, input);

					throw nvae;
				}
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1178:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 0, input);

				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1180:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_ebu_in_ctls_ee11447);
					ctls_ebu191=ctls_ebu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ebu191.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_ebu191.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1182:11: ( TOK_EE TOK_LB )=> ctls_eu
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_eu_in_ctls_ee11478);
					ctls_eu192=ctls_eu();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_eu192.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_eu192.ret;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ee

	public static class ctls_au_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_au
	// F:\\StudyAntlr\\SPC.g:1187:1: ctls_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
	public final ctls_au_return ctls_au() throws RecognitionException {
		ctls_au_return retval = new ctls_au_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token rb=null;
		ctls_root_expr_return fre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1190:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:1190:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_au11543); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_au11548); if (failed) return retval;
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_au11553);
				fre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_au11557); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_AU(input, ((Token)retval.start), exp_str, fre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_au

	public static class ctls_eu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_eu
	// F:\\StudyAntlr\\SPC.g:1193:1: ctls_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
	public final ctls_eu_return ctls_eu() throws RecognitionException {
		ctls_eu_return retval = new ctls_eu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token rb=null;
		ctls_root_expr_return fre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1196:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:1196:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_eu11612); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_eu11617); if (failed) return retval;
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_eu11622);
				fre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_eu11626); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EU(input, ((Token)retval.start), exp_str, fre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_eu

	public static class ctls_abu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_abu
	// F:\\StudyAntlr\\SPC.g:1199:1: ctls_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
	public final ctls_abu_return ctls_abu() throws RecognitionException {
		ctls_abu_return retval = new ctls_abu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctls_root_expr_return fre = null;

		subrange_return msr = null;

		ctls_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1202:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:1202:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_abu11680); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_abu11685); if (failed) return retval;
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11690);
				fre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_abu11694); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_subrange_in_ctls_abu11698);
				msr=subrange();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11702);
				sre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_abu11706); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(msr.start,msr.stop) + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ABU(input, ((Token)retval.start), exp_str, fre.ret, msr.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_abu

	public static class ctls_ebu_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_ebu
	// F:\\StudyAntlr\\SPC.g:1205:1: ctls_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
	public final ctls_ebu_return ctls_ebu() throws RecognitionException {
		ctls_ebu_return retval = new ctls_ebu_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token lb=null;
		Token opu=null;
		Token rb=null;
		ctls_root_expr_return fre = null;

		subrange_return msr = null;

		ctls_root_expr_return sre = null;


		Object op_tree=null;
		Object lb_tree=null;
		Object opu_tree=null;
		Object rb_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1208:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
			// F:\\StudyAntlr\\SPC.g:1208:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
			{
				root_0 = (Object)adaptor.nil();

				op=(Token)input.LT(1);
				match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_ebu11760); if (failed) return retval;
				if ( backtracking==0 ) {
					op_tree = (Object)adaptor.create(op);
					root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
				}
				lb=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_ebu11765); if (failed) return retval;
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11770);
				fre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
				opu=(Token)input.LT(1);
				match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_ebu11774); if (failed) return retval;
				if ( backtracking==0 ) {
					opu_tree = (Object)adaptor.create(opu);
					adaptor.addChild(root_0, opu_tree);
				}
				pushFollow(FOLLOW_subrange_in_ctls_ebu11778);
				msr=subrange();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
				pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11782);
				sre=ctls_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
				rb=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_ebu11786); if (failed) return retval;
				if ( backtracking==0 ) {
					if (!er()) exp_str = op.getText() + lb.getText() + input.toString(fre.start,fre.stop) + " " + opu.getText() + " " + input.toString(msr.start,msr.stop) + " " + input.toString(sre.start,sre.stop) + rb.getText(); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_EBU(input, ((Token)retval.start), exp_str, fre.ret, msr.ret, sre.ret);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_ebu

	public static class ctls_relational_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_relational_expr
	// F:\\StudyAntlr\\SPC.g:1212:1: ctls_relational_expr returns [InternalSpec ret] : f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* ;
	public final ctls_relational_expr_return ctls_relational_expr() throws RecognitionException {
		ctls_relational_expr_return retval = new ctls_relational_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_in_expr_return f = null;

		ctls_in_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1215:9: (f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* )
			// F:\\StudyAntlr\\SPC.g:1215:11: f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11838);
				f=ctls_in_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1216:9: (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
				loop68:
				do {
					int alt68=7;
					switch ( input.LA(1) ) {
						case TOK_EQUAL:
						{
							alt68=1;
						}
						break;
						case TOK_NOTEQUAL:
						{
							alt68=2;
						}
						break;
						case TOK_LT:
						{
							alt68=3;
						}
						break;
						case TOK_GT:
						{
							alt68=4;
						}
						break;
						case TOK_LE:
						{
							alt68=5;
						}
						break;
						case TOK_GE:
						{
							alt68=6;
						}
						break;

					}

					switch (alt68) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1216:11: op= TOK_EQUAL s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctls_relational_expr11854); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11859);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_eq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1218:11: op= TOK_NOTEQUAL s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11883); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11888);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_neq(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 3 :
							// F:\\StudyAntlr\\SPC.g:1220:11: op= TOK_LT s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LT,FOLLOW_TOK_LT_in_ctls_relational_expr11912); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11917);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 4 :
							// F:\\StudyAntlr\\SPC.g:1222:11: op= TOK_GT s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GT,FOLLOW_TOK_GT_in_ctls_relational_expr11941); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11946);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_gt(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 5 :
							// F:\\StudyAntlr\\SPC.g:1224:11: op= TOK_LE s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LE,FOLLOW_TOK_LE_in_ctls_relational_expr11970); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11975);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_le(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 6 :
							// F:\\StudyAntlr\\SPC.g:1226:11: op= TOK_GE s= ctls_in_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_GE,FOLLOW_TOK_GE_in_ctls_relational_expr11999); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr12004);
							s=ctls_in_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ge(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop68;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_relational_expr

	public static class ctls_in_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_in_expr
	// F:\\StudyAntlr\\SPC.g:1230:1: ctls_in_expr returns [InternalSpec ret] : f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* ;
	public final ctls_in_expr_return ctls_in_expr() throws RecognitionException {
		ctls_in_expr_return retval = new ctls_in_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_union_expr_return f = null;

		ctls_union_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1233:9: (f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* )
			// F:\\StudyAntlr\\SPC.g:1233:11: f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr12067);
				f=ctls_union_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1234:9: (op= TOK_SETIN s= ctls_union_expr )*
				loop69:
				do {
					int alt69=2;
					int LA69_0 = input.LA(1);

					if ( (LA69_0==TOK_SETIN) ) {
						alt69=1;
					}


					switch (alt69) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1234:11: op= TOK_SETIN s= ctls_union_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctls_in_expr12083); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr12088);
							s=ctls_union_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_setin(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop69;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_in_expr

	public static class ctls_union_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_union_expr
	// F:\\StudyAntlr\\SPC.g:1238:1: ctls_union_expr returns [InternalSpec ret] : f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* ;
	public final ctls_union_expr_return ctls_union_expr() throws RecognitionException {
		ctls_union_expr_return retval = new ctls_union_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_set_expr_return f = null;

		ctls_set_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1241:9: (f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* )
			// F:\\StudyAntlr\\SPC.g:1241:11: f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr12151);
				f=ctls_set_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1242:9: (op= TOK_UNION s= ctls_set_expr )*
				loop70:
				do {
					int alt70=2;
					int LA70_0 = input.LA(1);

					if ( (LA70_0==TOK_UNION) ) {
						alt70=1;
					}


					switch (alt70) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1242:11: op= TOK_UNION s= ctls_set_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctls_union_expr12167); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr12172);
							s=ctls_set_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_union(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop70;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_union_expr

	public static class ctls_set_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_set_expr
	// F:\\StudyAntlr\\SPC.g:1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );
	public final ctls_set_expr_return ctls_set_expr() throws RecognitionException {
		ctls_set_expr_return retval = new ctls_set_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LCB195=null;
		Token TOK_RCB197=null;
		ctls_shift_expr_return ctls_shift_expr193 = null;

		subrange_return subrange194 = null;

		ctls_set_list_expr_return ctls_set_list_expr196 = null;


		Object TOK_LCB195_tree=null;
		Object TOK_RCB197_tree=null;
		RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
		RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
		RewriteRuleSubtreeStream stream_ctls_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_set_list_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:1250:9: ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) )
			int alt71=3;
			switch ( input.LA(1) ) {
				case TOK_NOT:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt71=1;
				}
				break;
				case TOK_NUMBER:
				{
					int LA71_2 = input.LA(2);

					if ( (LA71_2==TOK_TWODOTS) ) {
						alt71=2;
					}
					else if ( (LA71_2==EOF||(LA71_2>=TOK_INVAR_SPEC && LA71_2<=TOK_UNION)||(LA71_2>=TOK_LSHIFT && LA71_2<=TOK_CONCATENATION)||LA71_2==TOK_RP||(LA71_2>=TOK_LB && LA71_2<=TOK_RB)||LA71_2==TOK_BUNTIL||(LA71_2>=TOK_SINCE && LA71_2<=TOK_TRIGGERED)||LA71_2==TOK_DOT||LA71_2==TOK_SEMI) ) {
						alt71=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 2, input);

						throw nvae;
					}
				}
				break;
				case TOK_PLUS:
				{
					int LA71_3 = input.LA(2);

					if ( (LA71_3==TOK_NUMBER) ) {
						int LA71_7 = input.LA(3);

						if ( (LA71_7==TOK_TWODOTS) ) {
							alt71=2;
						}
						else if ( (LA71_7==EOF||(LA71_7>=TOK_INVAR_SPEC && LA71_7<=TOK_UNION)||(LA71_7>=TOK_LSHIFT && LA71_7<=TOK_CONCATENATION)||LA71_7==TOK_RP||(LA71_7>=TOK_LB && LA71_7<=TOK_RB)||LA71_7==TOK_BUNTIL||(LA71_7>=TOK_SINCE && LA71_7<=TOK_TRIGGERED)||LA71_7==TOK_DOT||LA71_7==TOK_SEMI) ) {
							alt71=1;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 7, input);

							throw nvae;
						}
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 3, input);

						throw nvae;
					}
				}
				break;
				case TOK_MINUS:
				{
					int LA71_4 = input.LA(2);

					if ( (LA71_4==TOK_NUMBER) ) {
						int LA71_8 = input.LA(3);

						if ( (LA71_8==EOF||(LA71_8>=TOK_INVAR_SPEC && LA71_8<=TOK_UNION)||(LA71_8>=TOK_LSHIFT && LA71_8<=TOK_CONCATENATION)||LA71_8==TOK_RP||(LA71_8>=TOK_LB && LA71_8<=TOK_RB)||LA71_8==TOK_BUNTIL||(LA71_8>=TOK_SINCE && LA71_8<=TOK_TRIGGERED)||LA71_8==TOK_DOT||LA71_8==TOK_SEMI) ) {
							alt71=1;
						}
						else if ( (LA71_8==TOK_TWODOTS) ) {
							alt71=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 8, input);

							throw nvae;
						}
					}
					else if ( ((LA71_4>=TOK_PLUS && LA71_4<=TOK_MINUS)||(LA71_4>=TOK_NOT && LA71_4<=TOK_LP)||(LA71_4>=TOK_BOOL && LA71_4<=TOK_CASE)||(LA71_4>=TOK_WAREAD && LA71_4<=TOK_WAWRITE)||LA71_4==TOK_ATOM||LA71_4==TOK_NUMBER_WORD||(LA71_4>=TOK_FALSEEXP && LA71_4<=TOK_TRUEEXP)) ) {
						alt71=1;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 4, input);

						throw nvae;
					}
				}
				break;
				case TOK_LCB:
				{
					alt71=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1247:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 0, input);

					throw nvae;
			}

			switch (alt71) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1250:11: ctls_shift_expr
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_shift_expr_in_ctls_set_expr12234);
					ctls_shift_expr193=ctls_shift_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_shift_expr193.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_shift_expr193.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1252:11: subrange
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_subrange_in_ctls_set_expr12256);
					subrange194=subrange();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, subrange194.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange194.start,subrange194.stop));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1254:11: TOK_LCB ctls_set_list_expr TOK_RCB
				{
					TOK_LCB195=(Token)input.LT(1);
					match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctls_set_expr12278); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB195);

					pushFollow(FOLLOW_ctls_set_list_expr_in_ctls_set_expr12280);
					ctls_set_list_expr196=ctls_set_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_set_list_expr.add(ctls_set_list_expr196.getTree());
					TOK_RCB197=(Token)input.LT(1);
					match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctls_set_expr12282); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB197);

					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB195.getText() + " " + input.toString(ctls_set_list_expr196.start,ctls_set_list_expr196.stop) + " " + TOK_RCB197.getText());
					}

					// AST REWRITE
					// elements: ctls_set_list_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1256:9: -> ^( SET_LIST_EXP_T ctls_set_list_expr )
						{
							// F:\\StudyAntlr\\SPC.g:1256:12: ^( SET_LIST_EXP_T ctls_set_list_expr )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(SET_LIST_EXP_T, "SET_LIST_EXP_T"), root_1);

								adaptor.addChild(root_1, stream_ctls_set_list_expr.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_set_expr

	public static class ctls_set_list_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_set_list_expr
	// F:\\StudyAntlr\\SPC.g:1258:1: ctls_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
	public final ctls_set_list_expr_return ctls_set_list_expr() throws RecognitionException {
		ctls_set_list_expr_return retval = new ctls_set_list_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_COMMA199=null;
		simple_root_expr_return simple_root_expr198 = null;

		simple_root_expr_return simple_root_expr200 = null;


		Object TOK_COMMA199_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1259:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
			// F:\\StudyAntlr\\SPC.g:1259:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr12335);
				simple_root_expr198=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr198.getTree());
				// F:\\StudyAntlr\\SPC.g:1259:28: ( TOK_COMMA simple_root_expr )*
				loop72:
				do {
					int alt72=2;
					int LA72_0 = input.LA(1);

					if ( (LA72_0==TOK_COMMA) ) {
						alt72=1;
					}


					switch (alt72) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1259:29: TOK_COMMA simple_root_expr
						{
							TOK_COMMA199=(Token)input.LT(1);
							match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_set_list_expr12338); if (failed) return retval;
							pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr12341);
							simple_root_expr200=simple_root_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr200.getTree());

						}
						break;

						default :
							break loop72;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_set_list_expr

	public static class ctls_shift_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_shift_expr
	// F:\\StudyAntlr\\SPC.g:1261:1: ctls_shift_expr returns [InternalSpec ret] : f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* ;
	public final ctls_shift_expr_return ctls_shift_expr() throws RecognitionException {
		ctls_shift_expr_return retval = new ctls_shift_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_remainder_expr_return f = null;

		ctls_remainder_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1264:9: (f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* )
			// F:\\StudyAntlr\\SPC.g:1264:11: f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12387);
				f=ctls_remainder_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1265:9: (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
				loop73:
				do {
					int alt73=3;
					int LA73_0 = input.LA(1);

					if ( (LA73_0==TOK_LSHIFT) ) {
						alt73=1;
					}
					else if ( (LA73_0==TOK_RSHIFT) ) {
						alt73=2;
					}


					switch (alt73) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1265:11: op= TOK_LSHIFT s= ctls_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12403); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12408);
							s=ctls_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_lshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1267:11: op= TOK_RSHIFT s= ctls_remainder_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12432); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12437);
							s=ctls_remainder_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_rshift(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop73;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_shift_expr

	public static class ctls_remainder_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_remainder_expr
	// F:\\StudyAntlr\\SPC.g:1271:1: ctls_remainder_expr returns [InternalSpec ret] : f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* ;
	public final ctls_remainder_expr_return ctls_remainder_expr() throws RecognitionException {
		ctls_remainder_expr_return retval = new ctls_remainder_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_additive_expr_return f = null;

		ctls_additive_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1274:9: (f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* )
			// F:\\StudyAntlr\\SPC.g:1274:11: f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12499);
				f=ctls_additive_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1275:9: (op= TOK_MOD s= ctls_additive_expr )*
				loop74:
				do {
					int alt74=2;
					int LA74_0 = input.LA(1);

					if ( (LA74_0==TOK_MOD) ) {
						alt74=1;
					}


					switch (alt74) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1275:11: op= TOK_MOD s= ctls_additive_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctls_remainder_expr12515); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12520);
							s=ctls_additive_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_mod(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop74;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_remainder_expr

	public static class ctls_additive_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_additive_expr
	// F:\\StudyAntlr\\SPC.g:1282:1: ctls_additive_expr returns [InternalSpec ret] : f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* ;
	public final ctls_additive_expr_return ctls_additive_expr() throws RecognitionException {
		ctls_additive_expr_return retval = new ctls_additive_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_multiplicative_expr_return f = null;

		ctls_multiplicative_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1285:9: (f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* )
			// F:\\StudyAntlr\\SPC.g:1285:11: f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12585);
				f=ctls_multiplicative_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1286:9: (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
				loop75:
				do {
					int alt75=3;
					int LA75_0 = input.LA(1);

					if ( (LA75_0==TOK_PLUS) ) {
						alt75=1;
					}
					else if ( (LA75_0==TOK_MINUS) ) {
						alt75=2;
					}


					switch (alt75) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1286:11: op= TOK_PLUS s= ctls_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctls_additive_expr12601); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12606);
							s=ctls_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_plus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1288:11: op= TOK_MINUS s= ctls_multiplicative_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_additive_expr12630); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12635);
							s=ctls_multiplicative_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_minus(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop75;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_additive_expr

	public static class ctls_multiplicative_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_multiplicative_expr
	// F:\\StudyAntlr\\SPC.g:1292:1: ctls_multiplicative_expr returns [InternalSpec ret] : f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* ;
	public final ctls_multiplicative_expr_return ctls_multiplicative_expr() throws RecognitionException {
		ctls_multiplicative_expr_return retval = new ctls_multiplicative_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_concatination_expr_return f = null;

		ctls_concatination_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1295:9: (f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* )
			// F:\\StudyAntlr\\SPC.g:1295:11: f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12695);
				f=ctls_concatination_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1296:9: (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
				loop76:
				do {
					int alt76=3;
					int LA76_0 = input.LA(1);

					if ( (LA76_0==TOK_TIMES) ) {
						alt76=1;
					}
					else if ( (LA76_0==TOK_DIVIDE) ) {
						alt76=2;
					}


					switch (alt76) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1296:11: op= TOK_TIMES s= ctls_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12711); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12716);
							s=ctls_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_times(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1298:11: op= TOK_DIVIDE s= ctls_concatination_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12740); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12745);
							s=ctls_concatination_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_divide(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop76;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_multiplicative_expr

	public static class ctls_concatination_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_concatination_expr
	// F:\\StudyAntlr\\SPC.g:1302:1: ctls_concatination_expr returns [InternalSpec ret] : f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* ;
	public final ctls_concatination_expr_return ctls_concatination_expr() throws RecognitionException {
		ctls_concatination_expr_return retval = new ctls_concatination_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_primary_expr_return f = null;

		ctls_primary_expr_return s = null;


		Object op_tree=null;

		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1305:9: (f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* )
			// F:\\StudyAntlr\\SPC.g:1305:11: f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12806);
				f=ctls_primary_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
				if ( backtracking==0 ) {
					if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret;
				}
				// F:\\StudyAntlr\\SPC.g:1306:9: (op= TOK_CONCATENATION s= ctls_primary_expr )*
				loop77:
				do {
					int alt77=2;
					int LA77_0 = input.LA(1);

					if ( (LA77_0==TOK_CONCATENATION) ) {
						alt77=1;
					}


					switch (alt77) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1306:11: op= TOK_CONCATENATION s= ctls_primary_expr
						{
							op=(Token)input.LT(1);
							match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12822); if (failed) return retval;
							if ( backtracking==0 ) {
								op_tree = (Object)adaptor.create(op);
								root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
							}
							pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12827);
							s=ctls_primary_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
							if ( backtracking==0 ) {
								if (!er()) exp_str += op.getText() + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_concatenation(input, ((Token)retval.start), exp_str, retval.ret, s.ret);
							}

						}
						break;

						default :
							break loop77;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_concatination_expr

	public static class ctls_primary_expr_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_primary_expr
	// F:\\StudyAntlr\\SPC.g:1311:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );
	public final ctls_primary_expr_return ctls_primary_expr() throws RecognitionException {
		ctls_primary_expr_return retval = new ctls_primary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ctls_primary_expr_return v = null;

		ctls_primary_expr_helper1_return ctls_primary_expr_helper1201 = null;


		Object op_tree=null;
		RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
		RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
		RewriteRuleSubtreeStream stream_ctls_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_primary_expr");
		boolean append_end = false;
		try {
			// F:\\StudyAntlr\\SPC.g:1314:9: ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) )
			int alt78=3;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_LP:
				case TOK_BOOL:
				case TOK_WORD1:
				case TOK_NEXT:
				case TOK_CASE:
				case TOK_WAREAD:
				case TOK_WAWRITE:
				case TOK_ATOM:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt78=1;
				}
				break;
				case TOK_MINUS:
				{
					alt78=2;
				}
				break;
				case TOK_NOT:
				{
					alt78=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1311:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );", 78, 0, input);

					throw nvae;
			}

			switch (alt78) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1314:11: ctls_primary_expr_helper1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12888);
					ctls_primary_expr_helper1201=ctls_primary_expr_helper1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, ctls_primary_expr_helper1201.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_primary_expr_helper1201.ret;
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1316:11: op= TOK_MINUS v= ctls_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_primary_expr12912); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_MINUS.add(op);

					pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12916);
					v=ctls_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_unary_minus(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: v
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1318:9: -> ^( TOK_UNARY_MINUS_T $v)
						{
							// F:\\StudyAntlr\\SPC.g:1318:12: ^( TOK_UNARY_MINUS_T $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(TOK_UNARY_MINUS_T, "TOK_UNARY_MINUS_T"), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1319:11: op= TOK_NOT v= ctls_primary_expr
				{
					op=(Token)input.LT(1);
					match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_primary_expr12957); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NOT.add(op);

					pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12961);
					v=ctls_primary_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_primary_expr.add(v.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret);
					}

					// AST REWRITE
					// elements: TOK_NOT, v
					// token labels:
					// rule labels: v, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1321:9: -> ^( TOK_NOT $v)
						{
							// F:\\StudyAntlr\\SPC.g:1321:12: ^( TOK_NOT $v)
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NOT.next(), root_1);

								adaptor.addChild(root_1, stream_v.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_primary_expr

	public static class ctls_primary_expr_helper1_return extends ParserRuleReturnScope {
		public InternalSpec ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start ctls_primary_expr_helper1
	// F:\\StudyAntlr\\SPC.g:1324:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
	public final ctls_primary_expr_helper1_return ctls_primary_expr_helper1() throws RecognitionException {
		ctls_primary_expr_helper1_return retval = new ctls_primary_expr_helper1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tc1=null;
		Token tc2=null;
		Token TOK_LP205=null;
		Token TOK_RP207=null;
		Token TOK_BOOL209=null;
		Token TOK_LP210=null;
		Token TOK_RP212=null;
		Token TOK_WORD1214=null;
		Token TOK_LP215=null;
		Token TOK_RP217=null;
		Token TOK_NEXT219=null;
		Token TOK_LP220=null;
		Token TOK_RP222=null;
		Token TOK_CASE224=null;
		Token TOK_ESAC226=null;
		Token TOK_WAREAD228=null;
		Token TOK_LP229=null;
		Token TOK_COMMA230=null;
		Token TOK_RP231=null;
		Token TOK_WAWRITE233=null;
		Token TOK_LP234=null;
		Token TOK_RP235=null;
		simple_root_expr_return f = null;

		simple_root_expr_return s = null;

		simple_root_expr_return m = null;

		constant_return constant202 = null;

		primary_expr_select_return primary_expr_select203 = null;

		primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1204 = null;

		ctls_root_expr_return ctls_root_expr206 = null;

		primary_expr_select_return primary_expr_select208 = null;

		simple_root_expr_return simple_root_expr211 = null;

		primary_expr_select_return primary_expr_select213 = null;

		simple_root_expr_return simple_root_expr216 = null;

		primary_expr_select_return primary_expr_select218 = null;

		simple_root_expr_return simple_root_expr221 = null;

		primary_expr_select_return primary_expr_select223 = null;

		case_element_list_expr_return case_element_list_expr225 = null;

		primary_expr_select_return primary_expr_select227 = null;

		primary_expr_select_return primary_expr_select232 = null;

		primary_expr_select_return primary_expr_select236 = null;


		Object tc1_tree=null;
		Object tc2_tree=null;
		Object TOK_LP205_tree=null;
		Object TOK_RP207_tree=null;
		Object TOK_BOOL209_tree=null;
		Object TOK_LP210_tree=null;
		Object TOK_RP212_tree=null;
		Object TOK_WORD1214_tree=null;
		Object TOK_LP215_tree=null;
		Object TOK_RP217_tree=null;
		Object TOK_NEXT219_tree=null;
		Object TOK_LP220_tree=null;
		Object TOK_RP222_tree=null;
		Object TOK_CASE224_tree=null;
		Object TOK_ESAC226_tree=null;
		Object TOK_WAREAD228_tree=null;
		Object TOK_LP229_tree=null;
		Object TOK_COMMA230_tree=null;
		Object TOK_RP231_tree=null;
		Object TOK_WAWRITE233_tree=null;
		Object TOK_LP234_tree=null;
		Object TOK_RP235_tree=null;
		RewriteRuleTokenStream stream_TOK_LP=new RewriteRuleTokenStream(adaptor,"token TOK_LP");
		RewriteRuleTokenStream stream_TOK_WAREAD=new RewriteRuleTokenStream(adaptor,"token TOK_WAREAD");
		RewriteRuleTokenStream stream_TOK_COMMA=new RewriteRuleTokenStream(adaptor,"token TOK_COMMA");
		RewriteRuleTokenStream stream_TOK_WORD1=new RewriteRuleTokenStream(adaptor,"token TOK_WORD1");
		RewriteRuleTokenStream stream_TOK_ESAC=new RewriteRuleTokenStream(adaptor,"token TOK_ESAC");
		RewriteRuleTokenStream stream_TOK_NEXT=new RewriteRuleTokenStream(adaptor,"token TOK_NEXT");
		RewriteRuleTokenStream stream_TOK_CASE=new RewriteRuleTokenStream(adaptor,"token TOK_CASE");
		RewriteRuleTokenStream stream_TOK_WAWRITE=new RewriteRuleTokenStream(adaptor,"token TOK_WAWRITE");
		RewriteRuleTokenStream stream_TOK_BOOL=new RewriteRuleTokenStream(adaptor,"token TOK_BOOL");
		RewriteRuleTokenStream stream_TOK_RP=new RewriteRuleTokenStream(adaptor,"token TOK_RP");
		RewriteRuleSubtreeStream stream_case_element_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_element_list_expr");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_ctls_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_root_expr");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
		boolean append_end = false; String exp_str = "";
		try {
			// F:\\StudyAntlr\\SPC.g:1327:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
			int alt79=9;
			switch ( input.LA(1) ) {
				case TOK_PLUS:
				case TOK_NUMBER:
				case TOK_NUMBER_WORD:
				case TOK_FALSEEXP:
				case TOK_TRUEEXP:
				{
					alt79=1;
				}
				break;
				case TOK_ATOM:
				{
					alt79=2;
				}
				break;
				case TOK_LP:
				{
					alt79=3;
				}
				break;
				case TOK_BOOL:
				{
					alt79=4;
				}
				break;
				case TOK_WORD1:
				{
					alt79=5;
				}
				break;
				case TOK_NEXT:
				{
					alt79=6;
				}
				break;
				case TOK_CASE:
				{
					alt79=7;
				}
				break;
				case TOK_WAREAD:
				{
					alt79=8;
				}
				break;
				case TOK_WAWRITE:
				{
					alt79=9;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1324:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 79, 0, input);

					throw nvae;
			}

			switch (alt79) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1327:11: constant primary_expr_select
				{
					pushFollow(FOLLOW_constant_in_ctls_primary_expr_helper113026);
					constant202=constant();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_constant.add(constant202.getTree());
					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113028);
					primary_expr_select203=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select203.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: constant, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1330:9: -> ^( VALUE_T constant NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1330:12: ^( VALUE_T constant NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

								adaptor.addChild(root_1, stream_constant.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1331:11: primary_expr_helper1_pointer1
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper113079);
					primary_expr_helper1_pointer1204=primary_expr_helper1_pointer1();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1204.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1340:11: TOK_LP ctls_root_expr TOK_RP primary_expr_select
				{
					TOK_LP205=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113124); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP205);

					pushFollow(FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper113126);
					ctls_root_expr206=ctls_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_ctls_root_expr.add(ctls_root_expr206.getTree());
					TOK_RP207=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113128); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP207);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113130);
					primary_expr_select208=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select208.getTree());
					if ( backtracking==0 ) {
						if(!er()) retval.ret = ctls_root_expr206.ret;
					}

					// AST REWRITE
					// elements: primary_expr_select, ctls_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1342:9: -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1342:12: ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

								adaptor.addChild(root_1, stream_ctls_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:1346:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_BOOL209=(Token)input.LT(1);
					match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper113193); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL209);

					TOK_LP210=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113195); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP210);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113197);
					simple_root_expr211=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr211.getTree());
					TOK_RP212=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113199); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP212);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113201);
					primary_expr_select213=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select213.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: simple_root_expr, primary_expr_select, TOK_BOOL
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1349:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1349:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_BOOL.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 5 :
					// F:\\StudyAntlr\\SPC.g:1350:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WORD1214=(Token)input.LT(1);
					match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper113252); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1214);

					TOK_LP215=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113254); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP215);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113256);
					simple_root_expr216=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr216.getTree());
					TOK_RP217=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113258); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP217);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113260);
					primary_expr_select218=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select218.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: TOK_WORD1, simple_root_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1353:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1353:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WORD1.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 6 :
					// F:\\StudyAntlr\\SPC.g:1355:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
				{
					TOK_NEXT219=(Token)input.LT(1);
					match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113320); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT219);

					TOK_LP220=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113322); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP220);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113324);
					simple_root_expr221=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr221.getTree());
					TOK_RP222=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113326); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP222);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113328);
					primary_expr_select223=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select223.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, TOK_NEXT, simple_root_expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1358:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1358:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_NEXT.next(), root_1);

								adaptor.addChild(root_1, stream_simple_root_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 7 :
					// F:\\StudyAntlr\\SPC.g:1360:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
				{
					TOK_CASE224=(Token)input.LT(1);
					match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113388); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE224);

					pushFollow(FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113390);
					case_element_list_expr225=case_element_list_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr225.getTree());
					TOK_ESAC226=(Token)input.LT(1);
					match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113392); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC226);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113394);
					primary_expr_select227=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select227.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: case_element_list_expr, primary_expr_select
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1363:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1363:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(CASE_LIST_EXPR_T, "CASE_LIST_EXPR_T"), root_1);

								adaptor.addChild(root_1, stream_case_element_list_expr.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 8 :
					// F:\\StudyAntlr\\SPC.g:1365:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAREAD228=(Token)input.LT(1);
					match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113454); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD228);

					TOK_LP229=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113456); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP229);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113460);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					TOK_COMMA230=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113462); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA230);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113466);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP231=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113468); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP231);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113470);
					primary_expr_select232=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select232.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: primary_expr_select, s, TOK_WAREAD, f
					// token labels:
					// rule labels: s, f, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1368:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1368:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAREAD.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 9 :
					// F:\\StudyAntlr\\SPC.g:1370:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
				{
					TOK_WAWRITE233=(Token)input.LT(1);
					match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113534); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE233);

					TOK_LP234=(Token)input.LT(1);
					match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113536); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP234);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113540);
					f=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
					tc1=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113544); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113548);
					m=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
					tc2=(Token)input.LT(1);
					match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113552); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

					pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113556);
					s=simple_root_expr();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
					TOK_RP235=(Token)input.LT(1);
					match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113558); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP235);

					pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113560);
					primary_expr_select236=primary_expr_select();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select236.getTree());
					if ( backtracking==0 ) {
						if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
					}

					// AST REWRITE
					// elements: m, primary_expr_select, TOK_WAWRITE, f, s
					// token labels:
					// rule labels: s, f, m, retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
						RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
						RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"token m",m!=null?m.tree:null);
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1373:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
						{
							// F:\\StudyAntlr\\SPC.g:1373:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_WAWRITE.next(), root_1);

								adaptor.addChild(root_1, stream_f.next());
								adaptor.addChild(root_1, stream_m.next());
								adaptor.addChild(root_1, stream_s.next());
								adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
								adaptor.addChild(root_1, stream_primary_expr_select.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(append_end) retval.ret.setEndToken(((Token)retval.stop)); if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end ctls_primary_expr_helper1

	public static class primary_expr_helper1_pointer1_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_helper1_pointer1
	// F:\\StudyAntlr\\SPC.g:1383:1: primary_expr_helper1_pointer1 : TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) ;
	public final primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1() throws RecognitionException {
		primary_expr_helper1_pointer1_return retval = new primary_expr_helper1_pointer1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_ATOM237=null;
		primary_expr_select_return primary_expr_select238 = null;


		Object TOK_ATOM237_tree=null;
		RewriteRuleTokenStream stream_TOK_ATOM=new RewriteRuleTokenStream(adaptor,"token TOK_ATOM");
		RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
		try {
			// F:\\StudyAntlr\\SPC.g:1383:31: ( TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) )
			// F:\\StudyAntlr\\SPC.g:1383:33: TOK_ATOM primary_expr_select
			{
				TOK_ATOM237=(Token)input.LT(1);
				match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113631); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_ATOM.add(TOK_ATOM237);

				pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113633);
				primary_expr_select238=primary_expr_select();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select238.getTree());

				// AST REWRITE
				// elements: primary_expr_select, TOK_ATOM
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				if ( backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

					root_0 = (Object)adaptor.nil();
					// 1384:9: -> ^( VALUE_T TOK_ATOM NOP primary_expr_select )
					{
						// F:\\StudyAntlr\\SPC.g:1384:12: ^( VALUE_T TOK_ATOM NOP primary_expr_select )
						{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_T, "VALUE_T"), root_1);

							adaptor.addChild(root_1, stream_TOK_ATOM.next());
							adaptor.addChild(root_1, adaptor.create(NOP, "NOP"));
							adaptor.addChild(root_1, stream_primary_expr_select.next());

							adaptor.addChild(root_0, root_1);
						}

					}

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_helper1_pointer1

	public static class primary_expr_select_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_select
	// F:\\StudyAntlr\\SPC.g:1389:1: primary_expr_select : ( primary_expr_select_helper | primary_expr_ref )* ;
	public final primary_expr_select_return primary_expr_select() throws RecognitionException {
		primary_expr_select_return retval = new primary_expr_select_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		primary_expr_select_helper_return primary_expr_select_helper239 = null;

		primary_expr_ref_return primary_expr_ref240 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1389:24: ( ( primary_expr_select_helper | primary_expr_ref )* )
			// F:\\StudyAntlr\\SPC.g:1389:26: ( primary_expr_select_helper | primary_expr_ref )*
			{
				root_0 = (Object)adaptor.nil();

				// F:\\StudyAntlr\\SPC.g:1389:26: ( primary_expr_select_helper | primary_expr_ref )*
				loop80:
				do {
					int alt80=3;
					int LA80_0 = input.LA(1);

					if ( (LA80_0==TOK_LB) ) {
						alt80=1;
					}
					else if ( (LA80_0==TOK_DOT) ) {
						alt80=2;
					}


					switch (alt80) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1389:27: primary_expr_select_helper
						{
							pushFollow(FOLLOW_primary_expr_select_helper_in_primary_expr_select13676);
							primary_expr_select_helper239=primary_expr_select_helper();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper239.getTree());

						}
						break;
						case 2 :
							// F:\\StudyAntlr\\SPC.g:1389:56: primary_expr_ref
						{
							pushFollow(FOLLOW_primary_expr_ref_in_primary_expr_select13680);
							primary_expr_ref240=primary_expr_ref();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_ref240.getTree());

						}
						break;

						default :
							break loop80;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_select

	public static class primary_expr_ref_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_ref
	// F:\\StudyAntlr\\SPC.g:1391:1: primary_expr_ref : ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) ;
	public final primary_expr_ref_return primary_expr_ref() throws RecognitionException {
		primary_expr_ref_return retval = new primary_expr_ref_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_DOT241=null;
		Token set242=null;

		Object TOK_DOT241_tree=null;
		Object set242_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1391:21: ( ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) )
			// F:\\StudyAntlr\\SPC.g:1391:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
			{
				root_0 = (Object)adaptor.nil();

				// F:\\StudyAntlr\\SPC.g:1391:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
				// F:\\StudyAntlr\\SPC.g:1391:24: TOK_DOT ( TOK_ATOM | TOK_NUMBER )
				{
					TOK_DOT241=(Token)input.LT(1);
					match(input,TOK_DOT,FOLLOW_TOK_DOT_in_primary_expr_ref13702); if (failed) return retval;
					set242=(Token)input.LT(1);
					if ( input.LA(1)==TOK_ATOM||input.LA(1)==TOK_NUMBER ) {
						input.consume();
						if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set242));
						errorRecovery=false;failed=false;
					}
					else {
						if (backtracking>0) {failed=true; return retval;}
						MismatchedSetException mse =
								new MismatchedSetException(null,input);
						recoverFromMismatchedSet(input,mse,FOLLOW_set_in_primary_expr_ref13705);    throw mse;
					}


				}


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_ref

	public static class primary_expr_select_helper_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_select_helper
	// F:\\StudyAntlr\\SPC.g:1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );
	public final primary_expr_select_helper_return primary_expr_select_helper() throws RecognitionException {
		primary_expr_select_helper_return retval = new primary_expr_select_helper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix243 = null;

		primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix244 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1393:29: ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix )
			int alt81=2;
			int LA81_0 = input.LA(1);

			if ( (LA81_0==TOK_LB) ) {
				switch ( input.LA(2) ) {
					case TOK_FALSEEXP:
					{
						int LA81_2 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 2, input);

							throw nvae;
						}
					}
					break;
					case TOK_TRUEEXP:
					{
						int LA81_3 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 3, input);

							throw nvae;
						}
					}
					break;
					case TOK_NUMBER:
					{
						int LA81_4 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 4, input);

							throw nvae;
						}
					}
					break;
					case TOK_PLUS:
					{
						int LA81_5 = input.LA(3);

						if ( (LA81_5==TOK_NUMBER) ) {
							int LA81_23 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 23, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 5, input);

							throw nvae;
						}
					}
					break;
					case TOK_NUMBER_WORD:
					{
						int LA81_6 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 6, input);

							throw nvae;
						}
					}
					break;
					case TOK_ATOM:
					{
						int LA81_7 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 7, input);

							throw nvae;
						}
					}
					break;
					case TOK_LP:
					{
						int LA81_8 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 8, input);

							throw nvae;
						}
					}
					break;
					case TOK_BOOL:
					{
						int LA81_9 = input.LA(3);

						if ( (LA81_9==TOK_LP) ) {
							int LA81_29 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 29, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 9, input);

							throw nvae;
						}
					}
					break;
					case TOK_WORD1:
					{
						int LA81_10 = input.LA(3);

						if ( (LA81_10==TOK_LP) ) {
							int LA81_30 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 30, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 10, input);

							throw nvae;
						}
					}
					break;
					case TOK_NEXT:
					{
						int LA81_11 = input.LA(3);

						if ( (LA81_11==TOK_LP) ) {
							int LA81_31 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 31, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 11, input);

							throw nvae;
						}
					}
					break;
					case TOK_CASE:
					{
						int LA81_12 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 12, input);

							throw nvae;
						}
					}
					break;
					case TOK_WAREAD:
					{
						int LA81_13 = input.LA(3);

						if ( (LA81_13==TOK_LP) ) {
							int LA81_34 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 34, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 13, input);

							throw nvae;
						}
					}
					break;
					case TOK_WAWRITE:
					{
						int LA81_14 = input.LA(3);

						if ( (LA81_14==TOK_LP) ) {
							int LA81_35 = input.LA(4);

							if ( (synpred15()) ) {
								alt81=1;
							}
							else if ( (true) ) {
								alt81=2;
							}
							else {
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 35, input);

								throw nvae;
							}
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 14, input);

							throw nvae;
						}
					}
					break;
					case TOK_MINUS:
					{
						switch ( input.LA(3) ) {
							case TOK_NUMBER:
							{
								int LA81_36 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 36, input);

									throw nvae;
								}
							}
							break;
							case TOK_FALSEEXP:
							{
								int LA81_37 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 37, input);

									throw nvae;
								}
							}
							break;
							case TOK_TRUEEXP:
							{
								int LA81_38 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 38, input);

									throw nvae;
								}
							}
							break;
							case TOK_PLUS:
							{
								int LA81_39 = input.LA(4);

								if ( (LA81_39==TOK_NUMBER) ) {
									int LA81_86 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 86, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 39, input);

									throw nvae;
								}
							}
							break;
							case TOK_NUMBER_WORD:
							{
								int LA81_40 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 40, input);

									throw nvae;
								}
							}
							break;
							case TOK_ATOM:
							{
								int LA81_41 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 41, input);

									throw nvae;
								}
							}
							break;
							case TOK_LP:
							{
								int LA81_42 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 42, input);

									throw nvae;
								}
							}
							break;
							case TOK_BOOL:
							{
								int LA81_43 = input.LA(4);

								if ( (LA81_43==TOK_LP) ) {
									int LA81_92 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 92, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 43, input);

									throw nvae;
								}
							}
							break;
							case TOK_WORD1:
							{
								int LA81_44 = input.LA(4);

								if ( (LA81_44==TOK_LP) ) {
									int LA81_93 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 93, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 44, input);

									throw nvae;
								}
							}
							break;
							case TOK_NEXT:
							{
								int LA81_45 = input.LA(4);

								if ( (LA81_45==TOK_LP) ) {
									int LA81_94 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 94, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 45, input);

									throw nvae;
								}
							}
							break;
							case TOK_CASE:
							{
								int LA81_46 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 46, input);

									throw nvae;
								}
							}
							break;
							case TOK_WAREAD:
							{
								int LA81_47 = input.LA(4);

								if ( (LA81_47==TOK_LP) ) {
									int LA81_97 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 97, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 47, input);

									throw nvae;
								}
							}
							break;
							case TOK_WAWRITE:
							{
								int LA81_48 = input.LA(4);

								if ( (LA81_48==TOK_LP) ) {
									int LA81_98 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 98, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 48, input);

									throw nvae;
								}
							}
							break;
							case TOK_MINUS:
							{
								int LA81_49 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 49, input);

									throw nvae;
								}
							}
							break;
							case TOK_NOT:
							{
								switch ( input.LA(4) ) {
									case TOK_FALSEEXP:
									{
										int LA81_101 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 101, input);

											throw nvae;
										}
									}
									break;
									case TOK_TRUEEXP:
									{
										int LA81_102 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 102, input);

											throw nvae;
										}
									}
									break;
									case TOK_NUMBER:
									{
										int LA81_103 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 103, input);

											throw nvae;
										}
									}
									break;
									case TOK_PLUS:
									{
										int LA81_104 = input.LA(5);

										if ( (LA81_104==TOK_NUMBER) ) {
											int LA81_167 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 167, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 104, input);

											throw nvae;
										}
									}
									break;
									case TOK_NUMBER_WORD:
									{
										int LA81_105 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 105, input);

											throw nvae;
										}
									}
									break;
									case TOK_ATOM:
									{
										int LA81_106 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 106, input);

											throw nvae;
										}
									}
									break;
									case TOK_LP:
									{
										int LA81_107 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 107, input);

											throw nvae;
										}
									}
									break;
									case TOK_BOOL:
									{
										int LA81_108 = input.LA(5);

										if ( (LA81_108==TOK_LP) ) {
											int LA81_173 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 173, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 108, input);

											throw nvae;
										}
									}
									break;
									case TOK_WORD1:
									{
										int LA81_109 = input.LA(5);

										if ( (LA81_109==TOK_LP) ) {
											int LA81_174 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 174, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 109, input);

											throw nvae;
										}
									}
									break;
									case TOK_NEXT:
									{
										int LA81_110 = input.LA(5);

										if ( (LA81_110==TOK_LP) ) {
											int LA81_175 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 175, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 110, input);

											throw nvae;
										}
									}
									break;
									case TOK_CASE:
									{
										int LA81_111 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 111, input);

											throw nvae;
										}
									}
									break;
									case TOK_WAREAD:
									{
										int LA81_112 = input.LA(5);

										if ( (LA81_112==TOK_LP) ) {
											int LA81_178 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 178, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 112, input);

											throw nvae;
										}
									}
									break;
									case TOK_WAWRITE:
									{
										int LA81_113 = input.LA(5);

										if ( (LA81_113==TOK_LP) ) {
											int LA81_179 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 179, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 113, input);

											throw nvae;
										}
									}
									break;
									case TOK_MINUS:
									{
										int LA81_114 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 114, input);

											throw nvae;
										}
									}
									break;
									case TOK_NOT:
									{
										int LA81_115 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 115, input);

											throw nvae;
										}
									}
									break;
									default:
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 50, input);

										throw nvae;
								}

							}
							break;
							default:
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 15, input);

								throw nvae;
						}

					}
					break;
					case TOK_NOT:
					{
						switch ( input.LA(3) ) {
							case TOK_FALSEEXP:
							{
								int LA81_51 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 51, input);

									throw nvae;
								}
							}
							break;
							case TOK_TRUEEXP:
							{
								int LA81_52 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 52, input);

									throw nvae;
								}
							}
							break;
							case TOK_NUMBER:
							{
								int LA81_53 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 53, input);

									throw nvae;
								}
							}
							break;
							case TOK_PLUS:
							{
								int LA81_54 = input.LA(4);

								if ( (LA81_54==TOK_NUMBER) ) {
									int LA81_121 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 121, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 54, input);

									throw nvae;
								}
							}
							break;
							case TOK_NUMBER_WORD:
							{
								int LA81_55 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 55, input);

									throw nvae;
								}
							}
							break;
							case TOK_ATOM:
							{
								int LA81_56 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 56, input);

									throw nvae;
								}
							}
							break;
							case TOK_LP:
							{
								int LA81_57 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 57, input);

									throw nvae;
								}
							}
							break;
							case TOK_BOOL:
							{
								int LA81_58 = input.LA(4);

								if ( (LA81_58==TOK_LP) ) {
									int LA81_127 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 127, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 58, input);

									throw nvae;
								}
							}
							break;
							case TOK_WORD1:
							{
								int LA81_59 = input.LA(4);

								if ( (LA81_59==TOK_LP) ) {
									int LA81_128 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 128, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 59, input);

									throw nvae;
								}
							}
							break;
							case TOK_NEXT:
							{
								int LA81_60 = input.LA(4);

								if ( (LA81_60==TOK_LP) ) {
									int LA81_129 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 129, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 60, input);

									throw nvae;
								}
							}
							break;
							case TOK_CASE:
							{
								int LA81_61 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 61, input);

									throw nvae;
								}
							}
							break;
							case TOK_WAREAD:
							{
								int LA81_62 = input.LA(4);

								if ( (LA81_62==TOK_LP) ) {
									int LA81_132 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 132, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 62, input);

									throw nvae;
								}
							}
							break;
							case TOK_WAWRITE:
							{
								int LA81_63 = input.LA(4);

								if ( (LA81_63==TOK_LP) ) {
									int LA81_133 = input.LA(5);

									if ( (synpred15()) ) {
										alt81=1;
									}
									else if ( (true) ) {
										alt81=2;
									}
									else {
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 133, input);

										throw nvae;
									}
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 63, input);

									throw nvae;
								}
							}
							break;
							case TOK_MINUS:
							{
								switch ( input.LA(4) ) {
									case TOK_FALSEEXP:
									{
										int LA81_134 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 134, input);

											throw nvae;
										}
									}
									break;
									case TOK_TRUEEXP:
									{
										int LA81_135 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 135, input);

											throw nvae;
										}
									}
									break;
									case TOK_NUMBER:
									{
										int LA81_136 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 136, input);

											throw nvae;
										}
									}
									break;
									case TOK_PLUS:
									{
										int LA81_137 = input.LA(5);

										if ( (LA81_137==TOK_NUMBER) ) {
											int LA81_200 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 200, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 137, input);

											throw nvae;
										}
									}
									break;
									case TOK_NUMBER_WORD:
									{
										int LA81_138 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 138, input);

											throw nvae;
										}
									}
									break;
									case TOK_ATOM:
									{
										int LA81_139 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 139, input);

											throw nvae;
										}
									}
									break;
									case TOK_LP:
									{
										int LA81_140 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 140, input);

											throw nvae;
										}
									}
									break;
									case TOK_BOOL:
									{
										int LA81_141 = input.LA(5);

										if ( (LA81_141==TOK_LP) ) {
											int LA81_206 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 206, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 141, input);

											throw nvae;
										}
									}
									break;
									case TOK_WORD1:
									{
										int LA81_142 = input.LA(5);

										if ( (LA81_142==TOK_LP) ) {
											int LA81_207 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 207, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 142, input);

											throw nvae;
										}
									}
									break;
									case TOK_NEXT:
									{
										int LA81_143 = input.LA(5);

										if ( (LA81_143==TOK_LP) ) {
											int LA81_208 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 208, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 143, input);

											throw nvae;
										}
									}
									break;
									case TOK_CASE:
									{
										int LA81_144 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 144, input);

											throw nvae;
										}
									}
									break;
									case TOK_WAREAD:
									{
										int LA81_145 = input.LA(5);

										if ( (LA81_145==TOK_LP) ) {
											int LA81_211 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 211, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 145, input);

											throw nvae;
										}
									}
									break;
									case TOK_WAWRITE:
									{
										int LA81_146 = input.LA(5);

										if ( (LA81_146==TOK_LP) ) {
											int LA81_212 = input.LA(6);

											if ( (synpred15()) ) {
												alt81=1;
											}
											else if ( (true) ) {
												alt81=2;
											}
											else {
												if (backtracking>0) {failed=true; return retval;}
												NoViableAltException nvae =
														new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 212, input);

												throw nvae;
											}
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 146, input);

											throw nvae;
										}
									}
									break;
									case TOK_MINUS:
									{
										int LA81_147 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 147, input);

											throw nvae;
										}
									}
									break;
									case TOK_NOT:
									{
										int LA81_148 = input.LA(5);

										if ( (synpred15()) ) {
											alt81=1;
										}
										else if ( (true) ) {
											alt81=2;
										}
										else {
											if (backtracking>0) {failed=true; return retval;}
											NoViableAltException nvae =
													new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 148, input);

											throw nvae;
										}
									}
									break;
									default:
										if (backtracking>0) {failed=true; return retval;}
										NoViableAltException nvae =
												new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 64, input);

										throw nvae;
								}

							}
							break;
							case TOK_NOT:
							{
								int LA81_65 = input.LA(4);

								if ( (synpred15()) ) {
									alt81=1;
								}
								else if ( (true) ) {
									alt81=2;
								}
								else {
									if (backtracking>0) {failed=true; return retval;}
									NoViableAltException nvae =
											new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 65, input);

									throw nvae;
								}
							}
							break;
							default:
								if (backtracking>0) {failed=true; return retval;}
								NoViableAltException nvae =
										new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 16, input);

								throw nvae;
						}

					}
					break;
					case TOK_LCB:
					{
						int LA81_17 = input.LA(3);

						if ( (synpred15()) ) {
							alt81=1;
						}
						else if ( (true) ) {
							alt81=2;
						}
						else {
							if (backtracking>0) {failed=true; return retval;}
							NoViableAltException nvae =
									new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 17, input);

							throw nvae;
						}
					}
					break;
					default:
						if (backtracking>0) {failed=true; return retval;}
						NoViableAltException nvae =
								new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 1, input);

						throw nvae;
				}

			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1393:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 0, input);

				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1393:31: ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13739);
					primary_expr_select_helper_arr_suffix243=primary_expr_select_helper_arr_suffix();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_arr_suffix243.getTree());

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1394:11: primary_expr_select_helper_bit_suffix
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13751);
					primary_expr_select_helper_bit_suffix244=primary_expr_select_helper_bit_suffix();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_bit_suffix244.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_select_helper

	public static class primary_expr_select_helper_arr_suffix_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_select_helper_arr_suffix
	// F:\\StudyAntlr\\SPC.g:1396:1: primary_expr_select_helper_arr_suffix : TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) ;
	public final primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix() throws RecognitionException {
		primary_expr_select_helper_arr_suffix_return retval = new primary_expr_select_helper_arr_suffix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LB245=null;
		Token TOK_RB247=null;
		simple_root_expr_return simple_root_expr246 = null;


		Object TOK_LB245_tree=null;
		Object TOK_RB247_tree=null;
		RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
		RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:1397:9: ( TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) )
			// F:\\StudyAntlr\\SPC.g:1397:11: TOK_LB simple_root_expr TOK_RB
			{
				TOK_LB245=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13775); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB245);

				pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13777);
				simple_root_expr246=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr246.getTree());
				TOK_RB247=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13779); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB247);


				// AST REWRITE
				// elements: simple_root_expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				if ( backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

					root_0 = (Object)adaptor.nil();
					// 1398:9: -> ^( ARRAY_INDEX_T simple_root_expr )
					{
						// F:\\StudyAntlr\\SPC.g:1398:12: ^( ARRAY_INDEX_T simple_root_expr )
						{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY_INDEX_T, "ARRAY_INDEX_T"), root_1);

							adaptor.addChild(root_1, stream_simple_root_expr.next());

							adaptor.addChild(root_0, root_1);
						}

					}

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_select_helper_arr_suffix

	public static class primary_expr_select_helper_bit_suffix_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start primary_expr_select_helper_bit_suffix
	// F:\\StudyAntlr\\SPC.g:1400:1: primary_expr_select_helper_bit_suffix : TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) ;
	public final primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix() throws RecognitionException {
		primary_expr_select_helper_bit_suffix_return retval = new primary_expr_select_helper_bit_suffix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_LB248=null;
		Token TOK_COLON249=null;
		Token TOK_RB250=null;
		simple_root_expr_return f = null;

		simple_root_expr_return s = null;


		Object TOK_LB248_tree=null;
		Object TOK_COLON249_tree=null;
		Object TOK_RB250_tree=null;
		RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
		RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
		RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:1401:9: ( TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) )
			// F:\\StudyAntlr\\SPC.g:1401:11: TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB
			{
				TOK_LB248=(Token)input.LT(1);
				match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13819); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB248);

				pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13823);
				f=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
				TOK_COLON249=(Token)input.LT(1);
				match(input,TOK_COLON,FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13825); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON249);

				pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13829);
				s=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
				TOK_RB250=(Token)input.LT(1);
				match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13831); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB250);


				// AST REWRITE
				// elements: f, s
				// token labels:
				// rule labels: s, f, retval
				// token list labels:
				// rule list labels:
				if ( backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
					RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"token f",f!=null?f.tree:null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

					root_0 = (Object)adaptor.nil();
					// 1402:9: -> ^( BIT_SELECT_T $f $s)
					{
						// F:\\StudyAntlr\\SPC.g:1402:12: ^( BIT_SELECT_T $f $s)
						{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot(adaptor.create(BIT_SELECT_T, "BIT_SELECT_T"), root_1);

							adaptor.addChild(root_1, stream_f.next());
							adaptor.addChild(root_1, stream_s.next());

							adaptor.addChild(root_0, root_1);
						}

					}

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end primary_expr_select_helper_bit_suffix

	public static class case_element_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start case_element_expr
	// F:\\StudyAntlr\\SPC.g:1405:1: case_element_expr : simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) ;
	public final case_element_expr_return case_element_expr() throws RecognitionException {
		case_element_expr_return retval = new case_element_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_COLON252=null;
		Token TOK_SEMI254=null;
		simple_root_expr_return simple_root_expr251 = null;

		simple_root_expr_return simple_root_expr253 = null;


		Object TOK_COLON252_tree=null;
		Object TOK_SEMI254_tree=null;
		RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
		RewriteRuleTokenStream stream_TOK_SEMI=new RewriteRuleTokenStream(adaptor,"token TOK_SEMI");
		RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
		try {
			// F:\\StudyAntlr\\SPC.g:1405:22: ( simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) )
			// F:\\StudyAntlr\\SPC.g:1405:24: simple_root_expr TOK_COLON simple_root_expr TOK_SEMI
			{
				pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13871);
				simple_root_expr251=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr251.getTree());
				TOK_COLON252=(Token)input.LT(1);
				match(input,TOK_COLON,FOLLOW_TOK_COLON_in_case_element_expr13873); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON252);

				pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13875);
				simple_root_expr253=simple_root_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr253.getTree());
				TOK_SEMI254=(Token)input.LT(1);
				match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_case_element_expr13877); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_SEMI.add(TOK_SEMI254);


				// AST REWRITE
				// elements: simple_root_expr, simple_root_expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				if ( backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

					root_0 = (Object)adaptor.nil();
					// 1406:9: -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
					{
						// F:\\StudyAntlr\\SPC.g:1406:12: ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
						{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot(adaptor.create(CASE_ELEMENT_EXPR_T, "CASE_ELEMENT_EXPR_T"), root_1);

							adaptor.addChild(root_1, stream_simple_root_expr.next());
							adaptor.addChild(root_1, stream_simple_root_expr.next());

							adaptor.addChild(root_0, root_1);
						}

					}

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end case_element_expr

	public static class case_element_list_expr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start case_element_list_expr
	// F:\\StudyAntlr\\SPC.g:1408:1: case_element_list_expr : case_element_expr ( case_element_expr )* ;
	public final case_element_list_expr_return case_element_list_expr() throws RecognitionException {
		case_element_list_expr_return retval = new case_element_list_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		case_element_expr_return case_element_expr255 = null;

		case_element_expr_return case_element_expr256 = null;



		try {
			// F:\\StudyAntlr\\SPC.g:1408:26: ( case_element_expr ( case_element_expr )* )
			// F:\\StudyAntlr\\SPC.g:1408:28: case_element_expr ( case_element_expr )*
			{
				root_0 = (Object)adaptor.nil();

				pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13913);
				case_element_expr255=case_element_expr();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr255.getTree());
				// F:\\StudyAntlr\\SPC.g:1408:46: ( case_element_expr )*
				loop82:
				do {
					int alt82=2;
					int LA82_0 = input.LA(1);

					if ( (LA82_0==TOK_LCB||(LA82_0>=TOK_PLUS && LA82_0<=TOK_MINUS)||(LA82_0>=TOK_NOT && LA82_0<=TOK_LP)||(LA82_0>=TOK_BOOL && LA82_0<=TOK_CASE)||(LA82_0>=TOK_WAREAD && LA82_0<=TOK_WAWRITE)||LA82_0==TOK_ATOM||LA82_0==TOK_NUMBER||LA82_0==TOK_NUMBER_WORD||(LA82_0>=TOK_FALSEEXP && LA82_0<=TOK_TRUEEXP)) ) {
						alt82=1;
					}


					switch (alt82) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1408:47: case_element_expr
						{
							pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13916);
							case_element_expr256=case_element_expr();
							_fsp--;
							if (failed) return retval;
							if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr256.getTree());

						}
						break;

						default :
							break loop82;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end case_element_list_expr

	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start number
	// F:\\StudyAntlr\\SPC.g:1411:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );
	public final number_return number() throws RecognitionException {
		number_return retval = new number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_NUMBER257=null;
		Token TOK_PLUS258=null;
		Token TOK_NUMBER259=null;

		Object TOK_NUMBER257_tree=null;
		Object TOK_PLUS258_tree=null;
		Object TOK_NUMBER259_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1411:14: ( TOK_NUMBER | TOK_PLUS TOK_NUMBER )
			int alt83=2;
			int LA83_0 = input.LA(1);

			if ( (LA83_0==TOK_NUMBER) ) {
				alt83=1;
			}
			else if ( (LA83_0==TOK_PLUS) ) {
				alt83=2;
			}
			else {
				if (backtracking>0) {failed=true; return retval;}
				NoViableAltException nvae =
						new NoViableAltException("1411:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );", 83, 0, input);

				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1411:16: TOK_NUMBER
				{
					root_0 = (Object)adaptor.nil();

					TOK_NUMBER257=(Token)input.LT(1);
					match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13941); if (failed) return retval;
					if ( backtracking==0 ) {
						TOK_NUMBER257_tree = (Object)adaptor.create(TOK_NUMBER257);
						adaptor.addChild(root_0, TOK_NUMBER257_tree);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1412:11: TOK_PLUS TOK_NUMBER
				{
					root_0 = (Object)adaptor.nil();

					TOK_PLUS258=(Token)input.LT(1);
					match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_number13953); if (failed) return retval;
					TOK_NUMBER259=(Token)input.LT(1);
					match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13956); if (failed) return retval;
					if ( backtracking==0 ) {
						TOK_NUMBER259_tree = (Object)adaptor.create(TOK_NUMBER259);
						adaptor.addChild(root_0, TOK_NUMBER259_tree);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end number

	public static class integer_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start integer
	// F:\\StudyAntlr\\SPC.g:1413:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );
	public final integer_return integer() throws RecognitionException {
		integer_return retval = new integer_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_NUMBER260=null;
		Token TOK_PLUS261=null;
		Token TOK_NUMBER262=null;
		Token TOK_MINUS263=null;
		Token TOK_NUMBER264=null;

		Object TOK_NUMBER260_tree=null;
		Object TOK_PLUS261_tree=null;
		Object TOK_NUMBER262_tree=null;
		Object TOK_MINUS263_tree=null;
		Object TOK_NUMBER264_tree=null;
		RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
		RewriteRuleTokenStream stream_TOK_NUMBER=new RewriteRuleTokenStream(adaptor,"token TOK_NUMBER");
		RewriteRuleTokenStream stream_TOK_PLUS=new RewriteRuleTokenStream(adaptor,"token TOK_PLUS");

		try {
			// F:\\StudyAntlr\\SPC.g:1413:15: ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) )
			int alt84=3;
			switch ( input.LA(1) ) {
				case TOK_NUMBER:
				{
					alt84=1;
				}
				break;
				case TOK_PLUS:
				{
					alt84=2;
				}
				break;
				case TOK_MINUS:
				{
					alt84=3;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1413:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );", 84, 0, input);

					throw nvae;
			}

			switch (alt84) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1413:17: TOK_NUMBER
				{
					TOK_NUMBER260=(Token)input.LT(1);
					match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13969); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER260);


					// AST REWRITE
					// elements: TOK_NUMBER
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1414:9: -> ^( TOK_PLUS TOK_NUMBER )
						{
							// F:\\StudyAntlr\\SPC.g:1414:12: ^( TOK_PLUS TOK_NUMBER )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(adaptor.create(TOK_PLUS, "TOK_PLUS"), root_1);

								adaptor.addChild(root_1, stream_TOK_NUMBER.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1415:11: TOK_PLUS TOK_NUMBER
				{
					TOK_PLUS261=(Token)input.LT(1);
					match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_integer13997); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_PLUS.add(TOK_PLUS261);

					TOK_NUMBER262=(Token)input.LT(1);
					match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13999); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER262);


					// AST REWRITE
					// elements: TOK_PLUS, TOK_NUMBER
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1416:9: -> ^( TOK_PLUS TOK_NUMBER )
						{
							// F:\\StudyAntlr\\SPC.g:1416:12: ^( TOK_PLUS TOK_NUMBER )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_PLUS.next(), root_1);

								adaptor.addChild(root_1, stream_TOK_NUMBER.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1417:11: TOK_MINUS TOK_NUMBER
				{
					TOK_MINUS263=(Token)input.LT(1);
					match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_integer14027); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_MINUS.add(TOK_MINUS263);

					TOK_NUMBER264=(Token)input.LT(1);
					match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer14029); if (failed) return retval;
					if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER264);


					// AST REWRITE
					// elements: TOK_NUMBER, TOK_MINUS
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					if ( backtracking==0 ) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

						root_0 = (Object)adaptor.nil();
						// 1418:9: -> ^( TOK_MINUS TOK_NUMBER )
						{
							// F:\\StudyAntlr\\SPC.g:1418:12: ^( TOK_MINUS TOK_NUMBER )
							{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_TOK_MINUS.next(), root_1);

								adaptor.addChild(root_1, stream_TOK_NUMBER.next());

								adaptor.addChild(root_0, root_1);
							}

						}

					}

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end integer

	public static class number_word_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start number_word
	// F:\\StudyAntlr\\SPC.g:1420:1: number_word : TOK_NUMBER_WORD ;
	public final number_word_return number_word() throws RecognitionException {
		number_word_return retval = new number_word_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_NUMBER_WORD265=null;

		Object TOK_NUMBER_WORD265_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1420:18: ( TOK_NUMBER_WORD )
			// F:\\StudyAntlr\\SPC.g:1420:20: TOK_NUMBER_WORD
			{
				root_0 = (Object)adaptor.nil();

				TOK_NUMBER_WORD265=(Token)input.LT(1);
				match(input,TOK_NUMBER_WORD,FOLLOW_TOK_NUMBER_WORD_in_number_word14066); if (failed) return retval;
				if ( backtracking==0 ) {
					TOK_NUMBER_WORD265_tree = (Object)adaptor.create(TOK_NUMBER_WORD265);
					adaptor.addChild(root_0, TOK_NUMBER_WORD265_tree);
				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end number_word

	public static class subrange_return extends ParserRuleReturnScope {
		public InternalSpecRange ret;
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start subrange
	// F:\\StudyAntlr\\SPC.g:1423:1: subrange returns [InternalSpecRange ret] : f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) ;
	public final subrange_return subrange() throws RecognitionException {
		subrange_return retval = new subrange_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_TWODOTS266=null;
		integer_return f = null;

		integer_return s = null;


		Object TOK_TWODOTS266_tree=null;
		RewriteRuleTokenStream stream_TOK_TWODOTS=new RewriteRuleTokenStream(adaptor,"token TOK_TWODOTS");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
		try {
			// F:\\StudyAntlr\\SPC.g:1425:9: (f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) )
			// F:\\StudyAntlr\\SPC.g:1425:11: f= integer TOK_TWODOTS s= integer
			{
				pushFollow(FOLLOW_integer_in_subrange14105);
				f=integer();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_integer.add(f.getTree());
				TOK_TWODOTS266=(Token)input.LT(1);
				match(input,TOK_TWODOTS,FOLLOW_TOK_TWODOTS_in_subrange14107); if (failed) return retval;
				if ( backtracking==0 ) stream_TOK_TWODOTS.add(TOK_TWODOTS266);

				pushFollow(FOLLOW_integer_in_subrange14111);
				s=integer();
				_fsp--;
				if (failed) return retval;
				if ( backtracking==0 ) stream_integer.add(s.getTree());
				if ( backtracking==0 ) {
					if(!er()) retval.ret = new InternalSpecRange(input.toString(f.start,f.stop), input.toString(s.start,s.stop), ((Token)retval.start));
				}

				// AST REWRITE
				// elements: integer, integer
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				if ( backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

					root_0 = (Object)adaptor.nil();
					// 1427:9: -> ^( SUBRANGE_T integer integer )
					{
						// F:\\StudyAntlr\\SPC.g:1427:12: ^( SUBRANGE_T integer integer )
						{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot(adaptor.create(SUBRANGE_T, "SUBRANGE_T"), root_1);

							adaptor.addChild(root_1, stream_integer.next());
							adaptor.addChild(root_1, stream_integer.next());

							adaptor.addChild(root_0, root_1);
						}

					}

				}

			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( backtracking==0 ) {
				if(!er()) retval.ret.evalBDDChildrenExp(input);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end subrange

	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start constant
	// F:\\StudyAntlr\\SPC.g:1429:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );
	public final constant_return constant() throws RecognitionException {
		constant_return retval = new constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_FALSEEXP267=null;
		Token TOK_TRUEEXP268=null;
		number_return number269 = null;

		number_word_return number_word270 = null;


		Object TOK_FALSEEXP267_tree=null;
		Object TOK_TRUEEXP268_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1429:15: ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word )
			int alt85=4;
			switch ( input.LA(1) ) {
				case TOK_FALSEEXP:
				{
					alt85=1;
				}
				break;
				case TOK_TRUEEXP:
				{
					alt85=2;
				}
				break;
				case TOK_PLUS:
				case TOK_NUMBER:
				{
					alt85=3;
				}
				break;
				case TOK_NUMBER_WORD:
				{
					alt85=4;
				}
				break;
				default:
					if (backtracking>0) {failed=true; return retval;}
					NoViableAltException nvae =
							new NoViableAltException("1429:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );", 85, 0, input);

					throw nvae;
			}

			switch (alt85) {
				case 1 :
					// F:\\StudyAntlr\\SPC.g:1429:17: TOK_FALSEEXP
				{
					root_0 = (Object)adaptor.nil();

					TOK_FALSEEXP267=(Token)input.LT(1);
					match(input,TOK_FALSEEXP,FOLLOW_TOK_FALSEEXP_in_constant14160); if (failed) return retval;
					if ( backtracking==0 ) {
						TOK_FALSEEXP267_tree = (Object)adaptor.create(TOK_FALSEEXP267);
						adaptor.addChild(root_0, TOK_FALSEEXP267_tree);
					}

				}
				break;
				case 2 :
					// F:\\StudyAntlr\\SPC.g:1430:11: TOK_TRUEEXP
				{
					root_0 = (Object)adaptor.nil();

					TOK_TRUEEXP268=(Token)input.LT(1);
					match(input,TOK_TRUEEXP,FOLLOW_TOK_TRUEEXP_in_constant14172); if (failed) return retval;
					if ( backtracking==0 ) {
						TOK_TRUEEXP268_tree = (Object)adaptor.create(TOK_TRUEEXP268);
						adaptor.addChild(root_0, TOK_TRUEEXP268_tree);
					}

				}
				break;
				case 3 :
					// F:\\StudyAntlr\\SPC.g:1431:11: number
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_number_in_constant14184);
					number269=number();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, number269.getTree());

				}
				break;
				case 4 :
					// F:\\StudyAntlr\\SPC.g:1432:11: number_word
				{
					root_0 = (Object)adaptor.nil();

					pushFollow(FOLLOW_number_word_in_constant14196);
					number_word270=number_word();
					_fsp--;
					if (failed) return retval;
					if ( backtracking==0 ) adaptor.addChild(root_0, number_word270.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end constant

	public static class optsemi_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};

	// $ANTLR start optsemi
	// F:\\StudyAntlr\\SPC.g:1436:1: optsemi : ( TOK_SEMI )* ;
	public final optsemi_return optsemi() throws RecognitionException {
		optsemi_return retval = new optsemi_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TOK_SEMI271=null;

		Object TOK_SEMI271_tree=null;

		try {
			// F:\\StudyAntlr\\SPC.g:1436:15: ( ( TOK_SEMI )* )
			// F:\\StudyAntlr\\SPC.g:1436:17: ( TOK_SEMI )*
			{
				root_0 = (Object)adaptor.nil();

				// F:\\StudyAntlr\\SPC.g:1436:17: ( TOK_SEMI )*
				loop86:
				do {
					int alt86=2;
					int LA86_0 = input.LA(1);

					if ( (LA86_0==TOK_SEMI) ) {
						alt86=1;
					}


					switch (alt86) {
						case 1 :
							// F:\\StudyAntlr\\SPC.g:1436:17: TOK_SEMI
						{
							TOK_SEMI271=(Token)input.LT(1);
							match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_optsemi14221); if (failed) return retval;
							if ( backtracking==0 ) {
								TOK_SEMI271_tree = (Object)adaptor.create(TOK_SEMI271);
								adaptor.addChild(root_0, TOK_SEMI271_tree);
							}

						}
						break;

						default :
							break loop86;
					}
				} while (true);


			}

			retval.stop = input.LT(-1);

			if ( backtracking==0 ) {
				retval.tree = (Object)adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
		}
		return retval;
	}
	// $ANTLR end optsemi

	// $ANTLR start synpred1
	public final void synpred1_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:412:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
		// F:\\StudyAntlr\\SPC.g:412:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
		{
			// F:\\StudyAntlr\\SPC.g:412:12: ( TOK_NOT )*
			loop87:
			do {
				int alt87=2;
				int LA87_0 = input.LA(1);

				if ( (LA87_0==TOK_NOT) ) {
					alt87=1;
				}


				switch (alt87) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:412:12: TOK_NOT
					{
						match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred13164); if (failed) return ;

					}
					break;

					default :
						break loop87;
				}
			} while (true);

			if ( (input.LA(1)>=TOK_EX && input.LA(1)<=TOK_AA)||input.LA(1)==TOK_EE ) {
				input.consume();
				errorRecovery=false;failed=false;
			}
			else {
				if (backtracking>0) {failed=true; return ;}
				MismatchedSetException mse =
						new MismatchedSetException(null,input);
				recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred13177);    throw mse;
			}


		}
	}
	// $ANTLR end synpred1

	// $ANTLR start synpred2
	public final void synpred2_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:483:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )
		// F:\\StudyAntlr\\SPC.g:483:12: TOK_AA TOK_LB ctl_root_expr TOK_UNTIL
		{
			match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred23671); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred23673); if (failed) return ;
			pushFollow(FOLLOW_ctl_root_expr_in_synpred23675);
			ctl_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred23677); if (failed) return ;

		}
	}
	// $ANTLR end synpred2

	// $ANTLR start synpred3
	public final void synpred3_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:484:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )
		// F:\\StudyAntlr\\SPC.g:484:12: TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL
		{
			match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred33697); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred33699); if (failed) return ;
			pushFollow(FOLLOW_ctl_root_expr_in_synpred33701);
			ctl_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred33703); if (failed) return ;

		}
	}
	// $ANTLR end synpred3

	// $ANTLR start synpred4
	public final void synpred4_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:485:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )
		// F:\\StudyAntlr\\SPC.g:485:12: TOK_EE TOK_LB ctl_root_expr TOK_UNTIL
		{
			match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred43723); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred43725); if (failed) return ;
			pushFollow(FOLLOW_ctl_root_expr_in_synpred43727);
			ctl_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred43729); if (failed) return ;

		}
	}
	// $ANTLR end synpred4

	// $ANTLR start synpred5
	public final void synpred5_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:486:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )
		// F:\\StudyAntlr\\SPC.g:486:12: TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL
		{
			match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred53749); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred53751); if (failed) return ;
			pushFollow(FOLLOW_ctl_root_expr_in_synpred53753);
			ctl_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred53755); if (failed) return ;

		}
	}
	// $ANTLR end synpred5

	// $ANTLR start synpred6
	public final void synpred6_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:799:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY ) )
		// F:\\StudyAntlr\\SPC.g:799:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY )
		{
			// F:\\StudyAntlr\\SPC.g:799:12: ( TOK_NOT )*
			loop88:
			do {
				int alt88=2;
				int LA88_0 = input.LA(1);

				if ( (LA88_0==TOK_NOT) ) {
					alt88=1;
				}


				switch (alt88) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:799:12: TOK_NOT
					{
						match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred67097); if (failed) return ;

					}
					break;

					default :
						break loop88;
				}
			} while (true);

			if ( (input.LA(1)>=TOK_OP_NEXT && input.LA(1)<=TOK_OP_BOUND_GLOBALLY) ) {
				input.consume();
				errorRecovery=false;failed=false;
			}
			else {
				if (backtracking>0) {failed=true; return ;}
				MismatchedSetException mse =
						new MismatchedSetException(null,input);
				recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred67110);    throw mse;
			}


		}
	}
	// $ANTLR end synpred6

	// $ANTLR start synpred7
	public final void synpred7_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1084:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
		// F:\\StudyAntlr\\SPC.g:1084:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
		{
			// F:\\StudyAntlr\\SPC.g:1084:12: ( TOK_NOT )*
			loop89:
			do {
				int alt89=2;
				int LA89_0 = input.LA(1);

				if ( (LA89_0==TOK_NOT) ) {
					alt89=1;
				}


				switch (alt89) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:1084:12: TOK_NOT
					{
						match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred710221); if (failed) return ;

					}
					break;

					default :
						break loop89;
				}
			} while (true);

			if ( (input.LA(1)>=TOK_OP_NEXT && input.LA(1)<=TOK_OP_ONCE) ) {
				input.consume();
				errorRecovery=false;failed=false;
			}
			else {
				if (backtracking>0) {failed=true; return ;}
				MismatchedSetException mse =
						new MismatchedSetException(null,input);
				recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred710234);    throw mse;
			}


		}
	}
	// $ANTLR end synpred7

	// $ANTLR start synpred8
	public final void synpred8_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1121:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
		// F:\\StudyAntlr\\SPC.g:1121:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
		{
			// F:\\StudyAntlr\\SPC.g:1121:12: ( TOK_NOT )*
			loop90:
			do {
				int alt90=2;
				int LA90_0 = input.LA(1);

				if ( (LA90_0==TOK_NOT) ) {
					alt90=1;
				}


				switch (alt90) {
					case 1 :
						// F:\\StudyAntlr\\SPC.g:1121:12: TOK_NOT
					{
						match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred810672); if (failed) return ;

					}
					break;

					default :
						break loop90;
				}
			} while (true);

			if ( (input.LA(1)>=TOK_EX && input.LA(1)<=TOK_AA)||input.LA(1)==TOK_EE ) {
				input.consume();
				errorRecovery=false;failed=false;
			}
			else {
				if (backtracking>0) {failed=true; return ;}
				MismatchedSetException mse =
						new MismatchedSetException(null,input);
				recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred810685);    throw mse;
			}


		}
	}
	// $ANTLR end synpred8

	// $ANTLR start synpred9
	public final void synpred9_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1155:11: ( TOK_AA )
		// F:\\StudyAntlr\\SPC.g:1155:12: TOK_AA
		{
			match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred911099); if (failed) return ;

		}
	}
	// $ANTLR end synpred9

	// $ANTLR start synpred10
	public final void synpred10_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1156:11: ( TOK_EE )
		// F:\\StudyAntlr\\SPC.g:1156:12: TOK_EE
		{
			match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1011119); if (failed) return ;

		}
	}
	// $ANTLR end synpred10

	// $ANTLR start synpred11
	public final void synpred11_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1172:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )
		// F:\\StudyAntlr\\SPC.g:1172:12: TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL
		{
			match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1111336); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1111338); if (failed) return ;
			pushFollow(FOLLOW_ctls_root_expr_in_synpred1111340);
			ctls_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1111342); if (failed) return ;

		}
	}
	// $ANTLR end synpred11

	// $ANTLR start synpred12
	public final void synpred12_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1174:11: ( TOK_AA TOK_LB )
		// F:\\StudyAntlr\\SPC.g:1174:12: TOK_AA TOK_LB
		{
			match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1211371); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1211373); if (failed) return ;

		}
	}
	// $ANTLR end synpred12

	// $ANTLR start synpred13
	public final void synpred13_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1180:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )
		// F:\\StudyAntlr\\SPC.g:1180:12: TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL
		{
			match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1311436); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1311438); if (failed) return ;
			pushFollow(FOLLOW_ctls_root_expr_in_synpred1311440);
			ctls_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1311442); if (failed) return ;

		}
	}
	// $ANTLR end synpred13

	// $ANTLR start synpred14
	public final void synpred14_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1182:11: ( TOK_EE TOK_LB )
		// F:\\StudyAntlr\\SPC.g:1182:12: TOK_EE TOK_LB
		{
			match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1411471); if (failed) return ;
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1411473); if (failed) return ;

		}
	}
	// $ANTLR end synpred14

	// $ANTLR start synpred15
	public final void synpred15_fragment() throws RecognitionException {
		// F:\\StudyAntlr\\SPC.g:1393:31: ( TOK_LB simple_root_expr TOK_RB )
		// F:\\StudyAntlr\\SPC.g:1393:32: TOK_LB simple_root_expr TOK_RB
		{
			match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1513730); if (failed) return ;
			pushFollow(FOLLOW_simple_root_expr_in_synpred1513732);
			simple_root_expr();
			_fsp--;
			if (failed) return ;
			match(input,TOK_RB,FOLLOW_TOK_RB_in_synpred1513734); if (failed) return ;

		}
	}
	// $ANTLR end synpred15

	public final boolean synpred6() {
		backtracking++;
		int start = input.mark();
		try {
			synpred6_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred5() {
		backtracking++;
		int start = input.mark();
		try {
			synpred5_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred8() {
		backtracking++;
		int start = input.mark();
		try {
			synpred8_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred14() {
		backtracking++;
		int start = input.mark();
		try {
			synpred14_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred7() {
		backtracking++;
		int start = input.mark();
		try {
			synpred7_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred15() {
		backtracking++;
		int start = input.mark();
		try {
			synpred15_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred2() {
		backtracking++;
		int start = input.mark();
		try {
			synpred2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred12() {
		backtracking++;
		int start = input.mark();
		try {
			synpred12_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred1() {
		backtracking++;
		int start = input.mark();
		try {
			synpred1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred13() {
		backtracking++;
		int start = input.mark();
		try {
			synpred13_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred4() {
		backtracking++;
		int start = input.mark();
		try {
			synpred4_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred10() {
		backtracking++;
		int start = input.mark();
		try {
			synpred10_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred3() {
		backtracking++;
		int start = input.mark();
		try {
			synpred3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred11() {
		backtracking++;
		int start = input.mark();
		try {
			synpred11_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}
	public final boolean synpred9() {
		backtracking++;
		int start = input.mark();
		try {
			synpred9_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !failed;
		input.rewind(start);
		backtracking--;
		failed=false;
		return success;
	}




	public static final BitSet FOLLOW_EOF_in_spec208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spec_list_in_spec220 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_spec222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spec_element_in_spec_list286 = new BitSet(new long[]{0x000000000F000002L});
	public static final BitSet FOLLOW_spec_element_in_spec_list302 = new BitSet(new long[]{0x000000000F000002L});
	public static final BitSet FOLLOW_invar_spec_in_spec_element345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_spec_in_spec_element359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_spec_in_spec_element373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_spec_in_spec_element387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_INVAR_SPEC_in_invar_spec435 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_invar_spec438 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_optsemi_in_invar_spec440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CTL_SPEC_in_ctl_spec479 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_spec482 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_optsemi_in_ctl_spec484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LTL_SPEC_in_ltl_spec523 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_root_expr_in_ltl_spec526 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_optsemi_in_ltl_spec528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec567 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_spec570 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_optsemi_in_ctls_spec572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implies_expr_in_simple_root_expr614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iff_expr_in_implies_expr658 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_TOK_IMPLIES_in_implies_expr674 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_implies_expr_in_implies_expr679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_iff_expr745 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_TOK_IFF_in_iff_expr761 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_or_expr_in_iff_expr766 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr831 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_OR_in_or_expr847 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr852 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XOR_in_or_expr876 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr881 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XNOR_in_or_expr905 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr910 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_relational_expr_in_and_expr974 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_TOK_AND_in_and_expr990 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_relational_expr_in_and_expr995 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1058 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_EQUAL_in_relational_expr1074 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1079 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_NOTEQUAL_in_relational_expr1103 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1108 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LT_in_relational_expr1132 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1137 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GT_in_relational_expr1161 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1166 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LE_in_relational_expr1190 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1195 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GE_in_relational_expr1219 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_in_expr_in_relational_expr1224 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_union_expr_in_in_expr1289 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_TOK_SETIN_in_in_expr1305 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_union_expr_in_in_expr1310 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_set_expr_in_union_expr1374 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_TOK_UNION_in_union_expr1390 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_set_expr_in_union_expr1395 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_shift_expr_in_set_expr1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subrange_in_set_expr1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LCB_in_set_expr1501 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_set_list_expr_in_set_expr1503 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_TOK_RCB_in_set_expr1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1559 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_TOK_COMMA_in_set_list_expr1562 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1565 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_remainder_expr_in_shift_expr1610 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_LSHIFT_in_shift_expr1626 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_remainder_expr_in_shift_expr1631 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_RSHIFT_in_shift_expr1655 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_remainder_expr_in_shift_expr1660 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_additive_expr_in_remainder_expr1723 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_TOK_MOD_in_remainder_expr1739 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_additive_expr_in_remainder_expr1744 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1807 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_additive_expr1823 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1828 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_additive_expr1852 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1857 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1919 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_TIMES_in_multiplicative_expr1935 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1940 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_DIVIDE_in_multiplicative_expr1964 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1969 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_concatination_expr2031 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_TOK_CONCATENATION_in_concatination_expr2047 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_primary_expr_in_concatination_expr2052 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_primary_expr_helper1_in_primary_expr2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_primary_expr2156 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_primary_expr_in_primary_expr2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_primary_expr2200 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_primary_expr_in_primary_expr2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expr_helper12269 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12346 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12348 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12350 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_BOOL_in_primary_expr_helper12394 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12397 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12399 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12401 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WORD1_in_primary_expr_helper12446 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12448 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12450 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12452 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NEXT_in_primary_expr_helper12496 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12498 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12500 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12502 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CASE_in_primary_expr_helper12546 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_case_element_list_expr_in_primary_expr_helper12548 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TOK_ESAC_in_primary_expr_helper12550 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAREAD_in_primary_expr_helper12594 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12596 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12598 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12600 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12602 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12604 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAWRITE_in_primary_expr_helper12650 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12652 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12654 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12656 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12658 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12660 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12662 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12664 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_root_expr2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_iff_expr_in_ctl_implies_expr2777 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2793 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_implies_expr2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2863 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_TOK_IFF_in_ctl_iff_expr2879 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2884 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2948 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_OR_in_ctl_or_expr2964 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2969 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XOR_in_ctl_or_expr2993 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2998 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XNOR_in_ctl_or_expr3022 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr3027 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3090 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_TOK_AND_in_ctl_and_expr3106 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3111 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_pure_ctl_expr_in_ctl_expr3328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_relational_expr_in_ctl_expr3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EX_in_pure_ctl_expr3426 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AX_in_pure_ctl_expr3455 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EF_in_pure_ctl_expr3484 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AF_in_pure_ctl_expr3513 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EG_in_pure_ctl_expr3542 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AG_in_pure_ctl_expr3571 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_au_in_pure_ctl_expr3682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_abu_in_pure_ctl_expr3708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_eu_in_pure_ctl_expr3734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_ebu_in_pure_ctl_expr3760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EBF_in_pure_ctl_expr3776 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3781 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ABF_in_pure_ctl_expr3809 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3814 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EBG_in_pure_ctl_expr3842 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3847 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ABG_in_pure_ctl_expr3875 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3880 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_expr3918 = new BitSet(new long[]{0x8020000000000000L,0x00000000000023FFL});
	public static final BitSet FOLLOW_pure_ctl_expr_in_pure_ctl_expr3923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_ctl_au3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctl_au3982 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_au3991 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctl_au3999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_ctl_eu4054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctl_eu4059 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_eu4068 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctl_eu4076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_ctl_abu4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctl_abu4136 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_abu4145 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctl_abu4149 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctl_abu4157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_ctl_ebu4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctl_ebu4217 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_ebu4226 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctl_ebu4230 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctl_ebu4238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4291 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_EQUAL_in_ctl_relational_expr4307 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4312 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4336 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4341 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LT_in_ctl_relational_expr4365 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4370 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GT_in_ctl_relational_expr4394 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4399 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LE_in_ctl_relational_expr4423 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4428 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GE_in_ctl_relational_expr4452 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4457 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4521 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_TOK_SETIN_in_ctl_in_expr4537 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4542 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4605 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_TOK_UNION_in_ctl_union_expr4621 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4626 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ctl_shift_expr_in_ctl_set_expr4687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subrange_in_ctl_set_expr4709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LCB_in_ctl_set_expr4731 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_set_list_expr_in_ctl_set_expr4733 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_TOK_RCB_in_ctl_set_expr4735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4788 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctl_set_list_expr4791 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4794 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4840 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4856 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4861 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4885 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4890 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4952 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_TOK_MOD_in_ctl_remainder_expr4968 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4973 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5037 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_ctl_additive_expr5053 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5058 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ctl_additive_expr5082 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5087 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5148 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5164 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5169 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5193 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5198 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5259 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5275 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5280 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ctl_primary_expr5365 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ctl_primary_expr5410 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_ctl_primary_expr_helper15479 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_know_in_ctl_primary_expr_helper15567 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15613 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15669 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15671 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15673 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15738 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15740 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15742 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15744 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15797 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15799 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15801 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15803 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15865 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15867 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15869 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15871 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15933 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15935 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15937 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper15999 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16001 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16005 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16007 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16011 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16013 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16079 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16081 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16085 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16089 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16093 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16097 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16101 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16103 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_know6194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_agent_name_in_ctl_know6199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_TOK_KNOW_in_ctl_know6203 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_know6208 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_know6210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ctl_sknow6272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_agent_name_in_ctl_sknow6277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_TOK_SKNOW_in_ctl_sknow6281 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_ctl_sknow6286 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctl_sknow6288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ATOM_in_agent_name6347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_root_expr6392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_iff_expr_in_ltl_implies_expr6435 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6451 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_implies_expr6456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6521 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_TOK_IFF_in_ltl_iff_expr6537 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6542 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6606 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_OR_in_ltl_or_expr6622 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6627 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XOR_in_ltl_or_expr6651 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6656 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XNOR_in_ltl_or_expr6680 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6685 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6748 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_TOK_AND_in_ltl_and_expr6764 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6769 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6834 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_ltl_binary_expr6850 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6855 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_SINCE_in_ltl_binary_expr6879 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6884 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_RELEASES_in_ltl_binary_expr6908 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6913 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6937 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6942 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_ltl_binary_expr6975 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ltl_binary_expr6980 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6984 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_TOK_BRELEASES_in_ltl_binary_expr7017 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ltl_binary_expr7022 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr7026 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C4800L});
	public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_relational_expr_in_ltl_unary_expr7263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7314 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7343 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7372 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7401 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7430 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7459 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7488 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_BOUND_FINALLY_in_ltl_pure_unary_expr7527 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ltl_pure_unary_expr7532 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_BOUND_GLOBALLY_in_ltl_pure_unary_expr7560 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ltl_pure_unary_expr7565 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7605 = new BitSet(new long[]{0x0020000000000000L,0x000000007FC00000L});
	public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7662 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_EQUAL_in_ltl_relational_expr7678 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7683 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7707 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7712 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LT_in_ltl_relational_expr7736 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7741 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GT_in_ltl_relational_expr7765 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7770 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LE_in_ltl_relational_expr7794 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7799 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GE_in_ltl_relational_expr7823 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7828 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7892 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_TOK_SETIN_in_ltl_in_expr7908 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7913 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7976 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_TOK_UNION_in_ltl_union_expr7992 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7997 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ltl_shift_expr_in_ltl_set_expr8058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subrange_in_ltl_set_expr8080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LCB_in_ltl_set_expr8102 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_set_list_expr_in_ltl_set_expr8104 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_TOK_RCB_in_ltl_set_expr8106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8159 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ltl_set_list_expr8162 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8165 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8211 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8227 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8232 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8256 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8261 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8323 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_TOK_MOD_in_ltl_remainder_expr8339 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8344 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8408 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_ltl_additive_expr8424 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8429 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ltl_additive_expr8453 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8458 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8519 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8535 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8540 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8564 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8569 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8630 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8646 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8651 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ltl_primary_expr8736 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ltl_primary_expr8781 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_ltl_primary_expr_helper18850 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ltl_know_in_ltl_primary_expr_helper18939 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19024 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper19026 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19028 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper19093 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19095 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19097 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19099 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper19152 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19154 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19156 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19158 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19220 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19222 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19224 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19226 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19288 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19290 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19292 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19354 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19356 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19360 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19362 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19366 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19368 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19434 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19436 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19440 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19444 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19448 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19452 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19456 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19458 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ltl_know9550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_agent_name_in_ltl_know9555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_TOK_KNOW_in_ltl_know9559 = new BitSet(new long[]{0x6F63040000000000L,0x000000697FC20000L});
	public static final BitSet FOLLOW_ltl_root_expr_in_ltl_know9564 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ltl_know9566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_root_expr9622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_iff_expr_in_ctls_implies_expr9665 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9681 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_implies_expr9686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9751 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_TOK_IFF_in_ctls_iff_expr9767 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9772 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9835 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_OR_in_ctls_or_expr9851 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9856 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XOR_in_ctls_or_expr9880 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9885 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_TOK_XNOR_in_ctls_or_expr9909 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9914 = new BitSet(new long[]{0x00000001C0000002L});
	public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9977 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_TOK_AND_in_ctls_and_expr9993 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9998 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10062 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr10078 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10083 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0800L});
	public static final BitSet FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr10107 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10112 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0800L});
	public static final BitSet FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr10136 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10141 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0800L});
	public static final BitSet FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr10165 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr10170 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0800L});
	public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr10321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10410 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10439 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10468 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10497 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10526 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10555 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10584 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10623 = new BitSet(new long[]{0x0020000000000000L,0x000000001FC00000L});
	public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10925 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10954 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10983 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AF_in_ctls_pure_ctl_expr11012 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EG_in_ctls_pure_ctl_expr11041 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AG_in_ctls_pure_ctl_expr11070 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_aa_in_ctls_pure_ctl_expr11104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_ee_in_ctls_pure_ctl_expr11124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr11141 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr11146 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr11174 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr11179 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr11207 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr11212 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr11240 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr11245 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr11283 = new BitSet(new long[]{0x8020000000000000L,0x00000000000023FFL});
	public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr11288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_abu_in_ctls_aa11347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_au_in_ctls_aa11378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_ebu_in_ctls_ee11447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_eu_in_ctls_ee11478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_ctls_au11543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctls_au11548 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_au11553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctls_au11557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_ctls_eu11612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctls_eu11617 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_eu11622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctls_eu11626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_ctls_abu11680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctls_abu11685 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_abu11694 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_abu11698 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctls_abu11706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_ctls_ebu11760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_ctls_ebu11765 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_ebu11774 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_subrange_in_ctls_ebu11778 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_ctls_ebu11786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11838 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_EQUAL_in_ctls_relational_expr11854 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11859 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11883 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11888 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LT_in_ctls_relational_expr11912 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11917 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GT_in_ctls_relational_expr11941 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11946 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_LE_in_ctls_relational_expr11970 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11975 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_TOK_GE_in_ctls_relational_expr11999 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr12004 = new BitSet(new long[]{0x000000FC00000002L});
	public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr12067 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_TOK_SETIN_in_ctls_in_expr12083 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr12088 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr12151 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_TOK_UNION_in_ctls_union_expr12167 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr12172 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ctls_shift_expr_in_ctls_set_expr12234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subrange_in_ctls_set_expr12256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LCB_in_ctls_set_expr12278 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_set_list_expr_in_ctls_set_expr12280 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_TOK_RCB_in_ctls_set_expr12282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr12335 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctls_set_list_expr12338 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr12341 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12387 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12403 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12408 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12432 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12437 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12499 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_TOK_MOD_in_ctls_remainder_expr12515 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12520 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12585 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_ctls_additive_expr12601 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12606 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ctls_additive_expr12630 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12635 = new BitSet(new long[]{0x0003000000000002L});
	public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12695 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12711 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12716 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12740 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12745 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12806 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12822 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12827 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_ctls_primary_expr12912 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_ctls_primary_expr12957 = new BitSet(new long[]{0x6F63000000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_ctls_primary_expr_helper113026 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper113079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113124 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper113126 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113128 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper113193 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113195 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113197 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113199 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper113252 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113254 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113256 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113258 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113320 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113322 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113324 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113326 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113388 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113390 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113392 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113454 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113456 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113460 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113462 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113466 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113468 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113534 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113536 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113540 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113544 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113548 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113552 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113556 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113558 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113631 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_select_helper_in_primary_expr_select13676 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_primary_expr_ref_in_primary_expr_select13680 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000400L});
	public static final BitSet FOLLOW_TOK_DOT_in_primary_expr_ref13702 = new BitSet(new long[]{0x0000000000000000L,0x0000000100020000L});
	public static final BitSet FOLLOW_set_in_primary_expr_ref13705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13775 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13819 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13823 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13825 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13871 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TOK_COLON_in_case_element_expr13873 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13875 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_TOK_SEMI_in_case_element_expr13877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13913 = new BitSet(new long[]{0x6F63040000000002L,0x0000006900020000L});
	public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13916 = new BitSet(new long[]{0x6F63040000000002L,0x0000006900020000L});
	public static final BitSet FOLLOW_TOK_NUMBER_in_number13941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_number13953 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TOK_NUMBER_in_number13956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NUMBER_in_integer13969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_PLUS_in_integer13997 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TOK_NUMBER_in_integer13999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_MINUS_in_integer14027 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TOK_NUMBER_in_integer14029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NUMBER_WORD_in_number_word14066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_subrange14105 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_TOK_TWODOTS_in_subrange14107 = new BitSet(new long[]{0x0003000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_integer_in_subrange14111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_FALSEEXP_in_constant14160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_TRUEEXP_in_constant14172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_constant14184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_word_in_constant14196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_SEMI_in_optsemi14221 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_TOK_NOT_in_synpred13164 = new BitSet(new long[]{0x8020000000000000L,0x00000000000023FFL});
	public static final BitSet FOLLOW_set_in_synpred13177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_synpred23671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred23673 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_synpred23675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_synpred23677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_synpred33697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred33699 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_synpred33701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred33703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_synpred43723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred43725 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_synpred43727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TOK_UNTIL_in_synpred43729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_synpred53749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred53751 = new BitSet(new long[]{0xEF63040000000000L,0x00000069000223FFL});
	public static final BitSet FOLLOW_ctl_root_expr_in_synpred53753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred53755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_synpred67097 = new BitSet(new long[]{0x0020000000000000L,0x000000007FC00000L});
	public static final BitSet FOLLOW_set_in_synpred67110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_synpred710221 = new BitSet(new long[]{0x0020000000000000L,0x000000001FC00000L});
	public static final BitSet FOLLOW_set_in_synpred710234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_NOT_in_synpred810672 = new BitSet(new long[]{0x8020000000000000L,0x00000000000023FFL});
	public static final BitSet FOLLOW_set_in_synpred810685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_synpred911099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_synpred1011119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_synpred1111336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred1111338 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_synpred1111340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1111342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_AA_in_synpred1211371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred1211373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_synpred1311436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred1311438 = new BitSet(new long[]{0xEF63040000000000L,0x000000691FC223FFL});
	public static final BitSet FOLLOW_ctls_root_expr_in_synpred1311440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1311442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_EE_in_synpred1411471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred1411473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOK_LB_in_synpred1513730 = new BitSet(new long[]{0x6F63040000000000L,0x0000006900020000L});
	public static final BitSet FOLLOW_simple_root_expr_in_synpred1513732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TOK_RB_in_synpred1513734 = new BitSet(new long[]{0x0000000000000002L});

}