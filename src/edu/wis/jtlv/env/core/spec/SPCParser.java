// $ANTLR 3.0.1 /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g 2017-11-30 13:26:28

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NOP", "SPEC_LIST_T", "SUBRANGE_T", "VALUE_T", "SET_LIST_EXP_T", "BLOCK_T", "CASE_LIST_EXPR_T", "CASE_ELEMENT_EXPR_T", "BIT_SELECT_T", "ARRAY_INDEX_T", "TOK_UNARY_MINUS_T", "PURE_CTL_T", "PURE_LTL_T", "PURE_CTL_EPISTEMIC_T", "CTL_KNOW_T", "TOK_CTL_KNOW_T", "CTL_SKNOW_T", "TOK_CTL_SKNOW_T", "TOK_AGENT_NAME_T", "TOK_INVAR_SPEC", "TOK_CTL_SPEC", "TOK_LTL_SPEC", "TOK_CTL_STAR_SPEC", "TOK_IMPLIES", "TOK_IFF", "TOK_OR", "TOK_XOR", "TOK_XNOR", "TOK_AND", "TOK_EQUAL", "TOK_NOTEQUAL", "TOK_LT", "TOK_GT", "TOK_LE", "TOK_GE", "TOK_SETIN", "TOK_UNION", "TOK_LCB", "TOK_RCB", "TOK_COMMA", "TOK_LSHIFT", "TOK_RSHIFT", "TOK_MOD", "TOK_PLUS", "TOK_MINUS", "TOK_TIMES", "TOK_DIVIDE", "TOK_CONCATENATION", "TOK_NOT", "TOK_LP", "TOK_RP", "TOK_BOOL", "TOK_WORD1", "TOK_NEXT", "TOK_CASE", "TOK_ESAC", "TOK_WAREAD", "TOK_WAWRITE", "TOK_EX", "TOK_AX", "TOK_EF", "TOK_AF", "TOK_EG", "TOK_AG", "TOK_EBF", "TOK_ABF", "TOK_EBG", "TOK_ABG", "TOK_AA", "TOK_LB", "TOK_UNTIL", "TOK_RB", "TOK_EE", "TOK_BUNTIL", "TOK_KNOW", "TOK_SKNOW", "TOK_ATOM", "TOK_SINCE", "TOK_RELEASES", "TOK_TRIGGERED", "TOK_OP_NEXT", "TOK_OP_PREV", "TOK_OP_NOTPREVNOT", "TOK_OP_GLOBALLY", "TOK_OP_HISTORICALLY", "TOK_OP_FINALLY", "TOK_OP_ONCE", "TOK_DOT", "TOK_NUMBER", "TOK_COLON", "TOK_SEMI", "TOK_NUMBER_WORD", "TOK_TWODOTS", "TOK_FALSEEXP", "TOK_TRUEEXP", "TOK_WORD", "TOK_NUMBER_FRAC", "JTOK_WS", "JTOK_MULTI_COMMENT", "JTOK_LINE_COMMENT"
    };
    public static final int TOK_PLUS=47;
    public static final int TOK_RCB=42;
    public static final int CTL_KNOW_T=18;
    public static final int TOK_UNARY_MINUS_T=14;
    public static final int TOK_XOR=30;
    public static final int ARRAY_INDEX_T=13;
    public static final int TOK_ABG=71;
    public static final int TOK_ABF=69;
    public static final int TOK_TIMES=49;
    public static final int TOK_EBG=70;
    public static final int TOK_EBF=68;
    public static final int TOK_LP=53;
    public static final int TOK_LT=35;
    public static final int TOK_COLON=93;
    public static final int JTOK_MULTI_COMMENT=102;
    public static final int TOK_SETIN=39;
    public static final int SPEC_LIST_T=5;
    public static final int TOK_EQUAL=33;
    public static final int TOK_LB=73;
    public static final int TOK_TRUEEXP=98;
    public static final int TOK_BUNTIL=77;
    public static final int TOK_LE=37;
    public static final int TOK_UNTIL=74;
    public static final int TOK_DOT=91;
    public static final int SUBRANGE_T=6;
    public static final int CASE_ELEMENT_EXPR_T=11;
    public static final int TOK_CTL_SKNOW_T=21;
    public static final int TOK_ATOM=80;
    public static final int TOK_XNOR=31;
    public static final int TOK_AG=67;
    public static final int TOK_AF=65;
    public static final int TOK_WAWRITE=61;
    public static final int TOK_RB=75;
    public static final int TOK_OP_ONCE=90;
    public static final int TOK_CTL_KNOW_T=19;
    public static final int TOK_SEMI=94;
    public static final int TOK_AA=72;
    public static final int TOK_NUMBER_FRAC=100;
    public static final int TOK_MINUS=48;
    public static final int TOK_NUMBER_WORD=95;
    public static final int TOK_IMPLIES=27;
    public static final int TOK_KNOW=78;
    public static final int TOK_AX=63;
    public static final int JTOK_WS=101;
    public static final int TOK_OP_GLOBALLY=87;
    public static final int TOK_FALSEEXP=97;
    public static final int TOK_RP=54;
    public static final int VALUE_T=7;
    public static final int TOK_RSHIFT=45;
    public static final int TOK_SINCE=81;
    public static final int TOK_WAREAD=60;
    public static final int TOK_OR=29;
    public static final int TOK_OP_NOTPREVNOT=86;
    public static final int TOK_NOT=52;
    public static final int TOK_OP_PREV=85;
    public static final int BLOCK_T=9;
    public static final int TOK_LSHIFT=44;
    public static final int CTL_SKNOW_T=20;
    public static final int TOK_AND=32;
    public static final int TOK_GT=36;
    public static final int TOK_TRIGGERED=83;
    public static final int TOK_AGENT_NAME_T=22;
    public static final int TOK_CASE=58;
    public static final int TOK_CTL_STAR_SPEC=26;
    public static final int TOK_IFF=28;
    public static final int TOK_GE=38;
    public static final int SET_LIST_EXP_T=8;
    public static final int CASE_LIST_EXPR_T=10;
    public static final int TOK_TWODOTS=96;
    public static final int NOP=4;
    public static final int TOK_COMMA=43;
    public static final int TOK_UNION=40;
    public static final int TOK_NUMBER=92;
    public static final int TOK_LTL_SPEC=25;
    public static final int TOK_ESAC=59;
    public static final int TOK_SKNOW=79;
    public static final int TOK_LCB=41;
    public static final int TOK_DIVIDE=50;
    public static final int TOK_OP_NEXT=84;
    public static final int PURE_CTL_EPISTEMIC_T=17;
    public static final int TOK_EG=66;
    public static final int TOK_EF=64;
    public static final int PURE_CTL_T=15;
    public static final int TOK_NOTEQUAL=34;
    public static final int BIT_SELECT_T=12;
    public static final int TOK_INVAR_SPEC=23;
    public static final int TOK_EE=76;
    public static final int EOF=-1;
    public static final int TOK_BOOL=55;
    public static final int PURE_LTL_T=16;
    public static final int TOK_OP_FINALLY=89;
    public static final int JTOK_LINE_COMMENT=103;
    public static final int TOK_OP_HISTORICALLY=88;
    public static final int TOK_WORD1=56;
    public static final int TOK_CONCATENATION=51;
    public static final int TOK_NEXT=57;
    public static final int TOK_RELEASES=82;
    public static final int TOK_EX=62;
    public static final int TOK_MOD=46;
    public static final int TOK_WORD=99;
    public static final int TOK_CTL_SPEC=24;

        public SPCParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[127+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g"; }


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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:132:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:133:9: ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) )
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
                    new NoViableAltException("132:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:133:11: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF1=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec160); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EOF1_tree = (Object)adaptor.create(EOF1);
                    adaptor.addChild(root_0, EOF1_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:134:11: spec_list EOF
                    {
                    pushFollow(FOLLOW_spec_list_in_spec172);
                    spec_list2=spec_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_spec_list.add(spec_list2.getTree());
                    EOF3=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec174); if (failed) return retval;
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
                    // 136:9: -> ^( SPEC_LIST_T spec_list )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:136:12: ^( SPEC_LIST_T spec_list )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:138:1: spec_list returns [WAArrayOfSpec ret] : f= spec_element (s= spec_element )* ;
    public final spec_list_return spec_list() throws RecognitionException {
        spec_list_return retval = new spec_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        spec_element_return f = null;

        spec_element_return s = null;



        retval.ret = new WAArrayOfSpec(); 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:140:9: (f= spec_element (s= spec_element )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:140:11: f= spec_element (s= spec_element )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_spec_element_in_spec_list238);
            f=spec_element();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if(!er()) retval.ret.specs.add(f.ret); else retval.ret.specs.add(null); in_my_recovery_mode = false; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:141:9: (s= spec_element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=TOK_INVAR_SPEC && LA2_0<=TOK_CTL_STAR_SPEC)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:141:11: s= spec_element
            	    {
            	    pushFollow(FOLLOW_spec_element_in_spec_list254);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:144:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );
    public final spec_element_return spec_element() throws RecognitionException {
        spec_element_return retval = new spec_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        invar_spec_return invar_spec4 = null;

        ctl_spec_return ctl_spec5 = null;

        ltl_spec_return ltl_spec6 = null;

        ctls_spec_return ctls_spec7 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:145:9: ( invar_spec | ctl_spec | ltl_spec | ctls_spec )
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
                    new NoViableAltException("144:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:145:11: invar_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_invar_spec_in_spec_element297);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:146:11: ctl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_spec_in_spec_element311);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:147:11: ltl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_spec_in_spec_element325);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:148:11: ctls_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_spec_in_spec_element339);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:160:1: invar_spec returns [InternalSpec ret] : TOK_INVAR_SPEC simple_root_expr optsemi ;
    public final invar_spec_return invar_spec() throws RecognitionException {
        invar_spec_return retval = new invar_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_INVAR_SPEC8=null;
        simple_root_expr_return simple_root_expr9 = null;

        optsemi_return optsemi10 = null;


        Object TOK_INVAR_SPEC8_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:162:9: ( TOK_INVAR_SPEC simple_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:162:11: TOK_INVAR_SPEC simple_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_INVAR_SPEC8=(Token)input.LT(1);
            match(input,TOK_INVAR_SPEC,FOLLOW_TOK_INVAR_SPEC_in_invar_spec387); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_INVAR_SPEC8_tree = (Object)adaptor.create(TOK_INVAR_SPEC8);
            root_0 = (Object)adaptor.becomeRoot(TOK_INVAR_SPEC8_tree, root_0);
            }
            pushFollow(FOLLOW_simple_root_expr_in_invar_spec390);
            simple_root_expr9=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr9.getTree());
            pushFollow(FOLLOW_optsemi_in_invar_spec392);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:164:1: ctl_spec returns [InternalSpec ret] : TOK_CTL_SPEC ctl_root_expr optsemi ;
    public final ctl_spec_return ctl_spec() throws RecognitionException {
        ctl_spec_return retval = new ctl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_SPEC11=null;
        ctl_root_expr_return ctl_root_expr12 = null;

        optsemi_return optsemi13 = null;


        Object TOK_CTL_SPEC11_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:166:9: ( TOK_CTL_SPEC ctl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:166:11: TOK_CTL_SPEC ctl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_SPEC11=(Token)input.LT(1);
            match(input,TOK_CTL_SPEC,FOLLOW_TOK_CTL_SPEC_in_ctl_spec431); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_SPEC11_tree = (Object)adaptor.create(TOK_CTL_SPEC11);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_SPEC11_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_spec434);
            ctl_root_expr12=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctl_root_expr12.getTree());
            pushFollow(FOLLOW_optsemi_in_ctl_spec436);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:168:1: ltl_spec returns [InternalSpec ret] : TOK_LTL_SPEC ltl_root_expr optsemi ;
    public final ltl_spec_return ltl_spec() throws RecognitionException {
        ltl_spec_return retval = new ltl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LTL_SPEC14=null;
        ltl_root_expr_return ltl_root_expr15 = null;

        optsemi_return optsemi16 = null;


        Object TOK_LTL_SPEC14_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:170:9: ( TOK_LTL_SPEC ltl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:170:11: TOK_LTL_SPEC ltl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_LTL_SPEC14=(Token)input.LT(1);
            match(input,TOK_LTL_SPEC,FOLLOW_TOK_LTL_SPEC_in_ltl_spec475); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_LTL_SPEC14_tree = (Object)adaptor.create(TOK_LTL_SPEC14);
            root_0 = (Object)adaptor.becomeRoot(TOK_LTL_SPEC14_tree, root_0);
            }
            pushFollow(FOLLOW_ltl_root_expr_in_ltl_spec478);
            ltl_root_expr15=ltl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ltl_root_expr15.getTree());
            pushFollow(FOLLOW_optsemi_in_ltl_spec480);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:172:1: ctls_spec returns [InternalSpec ret] : TOK_CTL_STAR_SPEC ctls_root_expr optsemi ;
    public final ctls_spec_return ctls_spec() throws RecognitionException {
        ctls_spec_return retval = new ctls_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_STAR_SPEC17=null;
        ctls_root_expr_return ctls_root_expr18 = null;

        optsemi_return optsemi19 = null;


        Object TOK_CTL_STAR_SPEC17_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:174:9: ( TOK_CTL_STAR_SPEC ctls_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:174:11: TOK_CTL_STAR_SPEC ctls_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_STAR_SPEC17=(Token)input.LT(1);
            match(input,TOK_CTL_STAR_SPEC,FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec519); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_STAR_SPEC17_tree = (Object)adaptor.create(TOK_CTL_STAR_SPEC17);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_STAR_SPEC17_tree, root_0);
            }
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_spec522);
            ctls_root_expr18=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_root_expr18.getTree());
            pushFollow(FOLLOW_optsemi_in_ctls_spec524);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:183:1: simple_root_expr returns [InternalSpec ret] : implies_expr ;
    public final simple_root_expr_return simple_root_expr() throws RecognitionException {
        simple_root_expr_return retval = new simple_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        implies_expr_return implies_expr20 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:184:9: ( implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:184:11: implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_implies_expr_in_simple_root_expr566);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:186:1: implies_expr returns [InternalSpec ret] : f= iff_expr (op= TOK_IMPLIES s= implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:189:9: (f= iff_expr (op= TOK_IMPLIES s= implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:189:11: f= iff_expr (op= TOK_IMPLIES s= implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iff_expr_in_implies_expr610);
            f=iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:190:9: (op= TOK_IMPLIES s= implies_expr )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOK_IMPLIES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:190:11: op= TOK_IMPLIES s= implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_implies_expr626); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_implies_expr_in_implies_expr631);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:194:1: iff_expr returns [InternalSpec ret] : f= or_expr (op= TOK_IFF s= or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:197:9: (f= or_expr (op= TOK_IFF s= or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:197:11: f= or_expr (op= TOK_IFF s= or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_iff_expr697);
            f=or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:198:9: (op= TOK_IFF s= or_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TOK_IFF) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:198:11: op= TOK_IFF s= or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_iff_expr713); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expr_in_iff_expr718);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:202:1: or_expr returns [InternalSpec ret] : f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:205:9: (f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:205:11: f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr783);
            f=and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:206:9: (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:206:11: op= TOK_OR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_or_expr799); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr804);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:208:11: op= TOK_XOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_or_expr828); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr833);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:210:11: op= TOK_XNOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_or_expr857); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr862);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:214:1: and_expr returns [InternalSpec ret] : f= relational_expr (op= TOK_AND s= relational_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:217:9: (f= relational_expr (op= TOK_AND s= relational_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:217:11: f= relational_expr (op= TOK_AND s= relational_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expr_in_and_expr926);
            f=relational_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:218:9: (op= TOK_AND s= relational_expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TOK_AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:218:11: op= TOK_AND s= relational_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_and_expr942); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_relational_expr_in_and_expr947);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:222:1: relational_expr returns [InternalSpec ret] : f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:225:9: (f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:225:11: f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_relational_expr1010);
            f=in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:226:9: (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:226:11: op= TOK_EQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_relational_expr1026); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1031);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:228:11: op= TOK_NOTEQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_relational_expr1056); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1061);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:230:11: op= TOK_LT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_relational_expr1086); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1091);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:232:11: op= TOK_GT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_relational_expr1116); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1121);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:234:11: op= TOK_LE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_relational_expr1146); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1151);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:236:11: op= TOK_GE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_relational_expr1176); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1181);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:240:1: in_expr returns [InternalSpec ret] : f= union_expr (op= TOK_SETIN s= union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:243:9: (f= union_expr (op= TOK_SETIN s= union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:243:11: f= union_expr (op= TOK_SETIN s= union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_in_expr1246);
            f=union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:244:9: (op= TOK_SETIN s= union_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TOK_SETIN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:244:11: op= TOK_SETIN s= union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_in_expr1262); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_union_expr_in_in_expr1267);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:248:1: union_expr returns [InternalSpec ret] : f= set_expr (op= TOK_UNION s= set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:251:9: (f= set_expr (op= TOK_UNION s= set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:251:11: f= set_expr (op= TOK_UNION s= set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_expr_in_union_expr1331);
            f=set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:252:9: (op= TOK_UNION s= set_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TOK_UNION) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:252:11: op= TOK_UNION s= set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_union_expr1347); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_set_expr_in_union_expr1352);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:259:9: ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) )
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
                        new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==TOK_NUMBER) ) {
                    int LA11_7 = input.LA(3);

                    if ( (LA11_7==TOK_TWODOTS) ) {
                        alt11=2;
                    }
                    else if ( (LA11_7==EOF||(LA11_7>=TOK_INVAR_SPEC && LA11_7<=TOK_UNION)||(LA11_7>=TOK_RCB && LA11_7<=TOK_CONCATENATION)||LA11_7==TOK_RP||LA11_7==TOK_LB||LA11_7==TOK_RB||LA11_7==TOK_DOT||(LA11_7>=TOK_COLON && LA11_7<=TOK_SEMI)) ) {
                        alt11=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==TOK_NUMBER) ) {
                    int LA11_8 = input.LA(3);

                    if ( (LA11_8==TOK_TWODOTS) ) {
                        alt11=2;
                    }
                    else if ( (LA11_8==EOF||(LA11_8>=TOK_INVAR_SPEC && LA11_8<=TOK_UNION)||(LA11_8>=TOK_RCB && LA11_8<=TOK_CONCATENATION)||LA11_8==TOK_RP||LA11_8==TOK_LB||LA11_8==TOK_RB||LA11_8==TOK_DOT||(LA11_8>=TOK_COLON && LA11_8<=TOK_SEMI)) ) {
                        alt11=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA11_4>=TOK_PLUS && LA11_4<=TOK_MINUS)||(LA11_4>=TOK_NOT && LA11_4<=TOK_LP)||(LA11_4>=TOK_BOOL && LA11_4<=TOK_CASE)||(LA11_4>=TOK_WAREAD && LA11_4<=TOK_WAWRITE)||LA11_4==TOK_ATOM||LA11_4==TOK_NUMBER_WORD||(LA11_4>=TOK_FALSEEXP && LA11_4<=TOK_TRUEEXP)) ) {
                    alt11=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 4, input);

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
                    new NoViableAltException("256:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:259:11: shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_shift_expr_in_set_expr1414);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:261:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_set_expr1436);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:263:11: TOK_LCB set_list_expr TOK_RCB
                    {
                    TOK_LCB23=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_set_expr1459); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB23);

                    pushFollow(FOLLOW_set_list_expr_in_set_expr1461);
                    set_list_expr24=set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_set_list_expr.add(set_list_expr24.getTree());
                    TOK_RCB25=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_set_expr1463); if (failed) return retval;
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
                    // 265:9: -> ^( SET_LIST_EXP_T set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:265:12: ^( SET_LIST_EXP_T set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:267:1: set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final set_list_expr_return set_list_expr() throws RecognitionException {
        set_list_expr_return retval = new set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA27=null;
        simple_root_expr_return simple_root_expr26 = null;

        simple_root_expr_return simple_root_expr28 = null;


        Object TOK_COMMA27_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:268:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:268:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1517);
            simple_root_expr26=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr26.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:268:28: ( TOK_COMMA simple_root_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TOK_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:268:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA27=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_set_list_expr1520); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1523);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:270:1: shift_expr returns [InternalSpec ret] : f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:273:9: (f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:273:11: f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_remainder_expr_in_shift_expr1568);
            f=remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:274:9: (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:274:11: op= TOK_LSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_shift_expr1584); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1589);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:276:11: op= TOK_RSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_shift_expr1613); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1618);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:280:1: remainder_expr returns [InternalSpec ret] : f= additive_expr (op= TOK_MOD s= additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:283:9: (f= additive_expr (op= TOK_MOD s= additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:283:11: f= additive_expr (op= TOK_MOD s= additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expr_in_remainder_expr1681);
            f=additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:284:9: (op= TOK_MOD s= additive_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TOK_MOD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:284:11: op= TOK_MOD s= additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_remainder_expr1697); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additive_expr_in_remainder_expr1702);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:288:1: additive_expr returns [InternalSpec ret] : f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:291:9: (f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:291:11: f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1765);
            f=multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:292:9: (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:292:11: op= TOK_PLUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_additive_expr1781); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1786);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:294:11: op= TOK_MINUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_additive_expr1810); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1815);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:298:1: multiplicative_expr returns [InternalSpec ret] : f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:301:9: (f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:301:11: f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1877);
            f=concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:302:9: (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:302:11: op= TOK_TIMES s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_multiplicative_expr1893); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1898);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:304:11: op= TOK_DIVIDE s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_multiplicative_expr1922); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1927);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:308:1: concatination_expr returns [InternalSpec ret] : f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:311:9: (f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:311:11: f= primary_expr (op= TOK_CONCATENATION s= primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_expr_in_concatination_expr1989);
            f=primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:312:9: (op= TOK_CONCATENATION s= primary_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TOK_CONCATENATION) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:312:11: op= TOK_CONCATENATION s= primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_concatination_expr2005); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_primary_expr_in_concatination_expr2010);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:317:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:320:9: ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) )
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
                    new NoViableAltException("317:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:320:11: primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_in_primary_expr2080);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:324:11: op= TOK_MINUS v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_primary_expr2122); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2126);
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
                    // 326:9: -> ^( TOK_UNARY_MINUS_T primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:326:12: ^( TOK_UNARY_MINUS_T primary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:327:11: op= TOK_NOT v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_primary_expr2166); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2170);
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
                    // 329:9: -> ^( TOK_NOT primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:329:12: ^( TOK_NOT primary_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:332:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:335:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) )
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
                    new NoViableAltException("332:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:335:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr_helper12235);
                    constant30=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant30.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12237);
                    primary_expr_select31=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select31.getTree());
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
                    // 337:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:337:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:338:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12279);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:343:11: TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP33=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12312); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP33);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12314);
                    simple_root_expr34=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr34.getTree());
                    TOK_RP35=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12316); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP35);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12318);
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
                    // 345:9: -> ^( BLOCK_T simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:345:12: ^( BLOCK_T simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:346:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL37=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_primary_expr_helper12360); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL37);

                    TOK_LP38=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12363); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP38);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12365);
                    simple_root_expr39=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr39.getTree());
                    TOK_RP40=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12367); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP40);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12369);
                    primary_expr_select41=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select41.getTree());
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
                    // 348:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:348:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:349:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD142=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_primary_expr_helper12412); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD142);

                    TOK_LP43=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12414); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP43);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12416);
                    simple_root_expr44=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr44.getTree());
                    TOK_RP45=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12418); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP45);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12420);
                    primary_expr_select46=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select46.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_WORD1, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:351:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:352:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT47=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_primary_expr_helper12462); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT47);

                    TOK_LP48=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12464); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP48);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12466);
                    simple_root_expr49=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr49.getTree());
                    TOK_RP50=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12468); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP50);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12470);
                    primary_expr_select51=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select51.getTree());
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
                    // 354:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:354:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:355:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE52=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_primary_expr_helper12512); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE52);

                    pushFollow(FOLLOW_case_element_list_expr_in_primary_expr_helper12514);
                    case_element_list_expr53=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr53.getTree());
                    TOK_ESAC54=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_primary_expr_helper12516); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC54);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12518);
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
                    // 357:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:357:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:358:11: TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD56=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_primary_expr_helper12560); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD56);

                    TOK_LP57=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12562); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP57);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12564);
                    simple_root_expr58=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr58.getTree());
                    TOK_COMMA59=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12566); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA59);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12568);
                    simple_root_expr60=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr60.getTree());
                    TOK_RP61=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12570); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP61);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12572);
                    primary_expr_select62=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select62.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, simple_root_expr, primary_expr_select, TOK_WAREAD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:9: -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:360:12: ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:361:11: TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE63=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_primary_expr_helper12616); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE63);

                    TOK_LP64=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12618); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP64);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12620);
                    simple_root_expr65=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr65.getTree());
                    TOK_COMMA66=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12622); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA66);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12624);
                    simple_root_expr67=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr67.getTree());
                    TOK_COMMA68=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12626); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA68);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12628);
                    simple_root_expr69=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr69.getTree());
                    TOK_RP70=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12630); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP70);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12632);
                    primary_expr_select71=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select71.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_WAWRITE, primary_expr_select, simple_root_expr, simple_root_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 363:9: -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:363:12: ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:369:1: ctl_root_expr returns [InternalSpec ret] : ctl_implies_expr ;
    public final ctl_root_expr_return ctl_root_expr() throws RecognitionException {
        ctl_root_expr_return retval = new ctl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctl_implies_expr_return ctl_implies_expr72 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:370:9: ( ctl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:370:11: ctl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_implies_expr_in_ctl_root_expr2700);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:372:1: ctl_implies_expr returns [InternalSpec ret] : f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:375:9: (f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:375:11: f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_iff_expr_in_ctl_implies_expr2743);
            f=ctl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:376:9: (op= TOK_IMPLIES s= ctl_implies_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TOK_IMPLIES) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:376:11: op= TOK_IMPLIES s= ctl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2759); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_implies_expr_in_ctl_implies_expr2764);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:380:1: ctl_iff_expr returns [InternalSpec ret] : f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:383:9: (f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:383:11: f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2829);
            f=ctl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:384:9: (op= TOK_IFF s= ctl_or_expr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TOK_IFF) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:384:11: op= TOK_IFF s= ctl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctl_iff_expr2845); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2850);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:388:1: ctl_or_expr returns [InternalSpec ret] : f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:391:9: (f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:391:11: f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2914);
            f=ctl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:392:9: (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:392:11: op= TOK_OR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctl_or_expr2930); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2935);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:394:11: op= TOK_XOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctl_or_expr2959); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2964);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:396:11: op= TOK_XNOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctl_or_expr2988); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2993);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:400:1: ctl_and_expr returns [InternalSpec ret] : f= ctl_expr (op= TOK_AND s= ctl_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:403:9: (f= ctl_expr (op= TOK_AND s= ctl_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:403:11: f= ctl_expr (op= TOK_AND s= ctl_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3056);
            f=ctl_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:404:9: (op= TOK_AND s= ctl_expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TOK_AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:404:11: op= TOK_AND s= ctl_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctl_and_expr3072); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3077);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:408:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );
    public final ctl_expr_return ctl_expr() throws RecognitionException {
        ctl_expr_return retval = new ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        pure_ctl_expr_return pure_ctl_expr73 = null;

        ctl_relational_expr_return ctl_relational_expr74 = null;


        RewriteRuleSubtreeStream stream_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr )
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

                if ( (LA24_13==TOK_EX) && (synpred1())) {
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
                else if ( (LA24_13==TOK_NOT) ) {
                    int LA24_27 = input.LA(3);

                    if ( (synpred1()) ) {
                        alt24=1;
                    }
                    else if ( (true) ) {
                        alt24=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("408:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 27, input);

                        throw nvae;
                    }
                }
                else if ( ((LA24_13>=TOK_PLUS && LA24_13<=TOK_MINUS)||LA24_13==TOK_LP||(LA24_13>=TOK_BOOL && LA24_13<=TOK_CASE)||(LA24_13>=TOK_WAREAD && LA24_13<=TOK_WAWRITE)||LA24_13==TOK_ATOM||LA24_13==TOK_NUMBER||LA24_13==TOK_NUMBER_WORD||(LA24_13>=TOK_FALSEEXP && LA24_13<=TOK_TRUEEXP)) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("408:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==TOK_LCB||(LA24_0>=TOK_PLUS && LA24_0<=TOK_MINUS)||LA24_0==TOK_LP||(LA24_0>=TOK_BOOL && LA24_0<=TOK_CASE)||(LA24_0>=TOK_WAREAD && LA24_0<=TOK_WAWRITE)||LA24_0==TOK_ATOM||LA24_0==TOK_NUMBER||LA24_0==TOK_NUMBER_WORD||(LA24_0>=TOK_FALSEEXP && LA24_0<=TOK_TRUEEXP)) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("408:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr
                    {
                    pushFollow(FOLLOW_pure_ctl_expr_in_ctl_expr3305);
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
                    // 423:11: -> ^( PURE_CTL_T pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:423:14: ^( PURE_CTL_T pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:424:11: ctl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_relational_expr_in_ctl_expr3345);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:460:9: (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr )
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
                            new NoViableAltException("457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 7, input);

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
                            new NoViableAltException("457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 15, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 8, input);

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
                    new NoViableAltException("457:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:460:11: op= TOK_EX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_pure_ctl_expr3411); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3416);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:462:11: op= TOK_AX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_pure_ctl_expr3440); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3445);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:464:11: op= TOK_EF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_pure_ctl_expr3469); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3474);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:466:11: op= TOK_AF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_pure_ctl_expr3498); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3503);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:468:11: op= TOK_EG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_pure_ctl_expr3527); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3532);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:470:11: op= TOK_AG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_pure_ctl_expr3556); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3561);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_au_in_pure_ctl_expr3667);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_abu_in_pure_ctl_expr3693);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:482:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_eu_in_pure_ctl_expr3719);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:483:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_ebu_in_pure_ctl_expr3745);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:484:11: op= TOK_EBF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_pure_ctl_expr3761); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3766);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3770);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:486:11: op= TOK_ABF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_pure_ctl_expr3794); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3799);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3803);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:488:11: op= TOK_EBG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_pure_ctl_expr3827); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3832);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3836);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:490:11: op= TOK_ABG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_pure_ctl_expr3860); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3865);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3869);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:493:11: op= TOK_NOT fp= pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_pure_ctl_expr3903); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_pure_ctl_expr_in_pure_ctl_expr3908);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:496:1: ctl_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:499:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:499:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_au3962); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_au3967); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3972);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_au3976); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3980);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_au3984); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:502:1: ctl_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:505:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:505:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_eu4039); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_eu4044); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4049);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_eu4053); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4057);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_eu4061); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:508:1: ctl_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:511:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:511:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_abu4116); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_abu4121); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4126);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_abu4130); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_abu4134);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4138);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_abu4142); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:514:1: ctl_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:517:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:517:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_ebu4197); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_ebu4202); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4207);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_ebu4211); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_ebu4215);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4219);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_ebu4223); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:521:1: ctl_relational_expr returns [InternalSpec ret] : f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:524:9: (f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:524:11: f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4284);
            f=ctl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:525:9: (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:525:11: op= TOK_EQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctl_relational_expr4300); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4305);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:527:11: op= TOK_NOTEQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4330); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4335);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:529:11: op= TOK_LT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctl_relational_expr4360); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4365);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:531:11: op= TOK_GT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctl_relational_expr4390); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4395);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:533:11: op= TOK_LE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctl_relational_expr4420); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4425);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:535:11: op= TOK_GE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctl_relational_expr4450); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4455);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:539:1: ctl_in_expr returns [InternalSpec ret] : f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:542:9: (f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:542:11: f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4519);
            f=ctl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:543:9: (op= TOK_SETIN s= ctl_union_expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==TOK_SETIN) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:543:11: op= TOK_SETIN s= ctl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctl_in_expr4535); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4540);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:547:1: ctl_union_expr returns [InternalSpec ret] : f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:550:9: (f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:550:11: f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4603);
            f=ctl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:551:9: (op= TOK_UNION s= ctl_set_expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==TOK_UNION) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:551:11: op= TOK_UNION s= ctl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctl_union_expr4619); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4624);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:558:9: ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) )
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

                if ( (LA29_2==EOF||(LA29_2>=TOK_INVAR_SPEC && LA29_2<=TOK_UNION)||(LA29_2>=TOK_LSHIFT && LA29_2<=TOK_CONCATENATION)||LA29_2==TOK_RP||(LA29_2>=TOK_LB && LA29_2<=TOK_RB)||LA29_2==TOK_BUNTIL||LA29_2==TOK_DOT||LA29_2==TOK_SEMI) ) {
                    alt29=1;
                }
                else if ( (LA29_2==TOK_TWODOTS) ) {
                    alt29=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 2, input);

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
                            new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 3, input);

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
                            new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA29_4>=TOK_PLUS && LA29_4<=TOK_MINUS)||(LA29_4>=TOK_NOT && LA29_4<=TOK_LP)||(LA29_4>=TOK_BOOL && LA29_4<=TOK_CASE)||(LA29_4>=TOK_WAREAD && LA29_4<=TOK_WAWRITE)||LA29_4==TOK_ATOM||LA29_4==TOK_NUMBER_WORD||(LA29_4>=TOK_FALSEEXP && LA29_4<=TOK_TRUEEXP)) ) {
                    alt29=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 4, input);

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
                    new NoViableAltException("555:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:558:11: ctl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_shift_expr_in_ctl_set_expr4685);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:560:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctl_set_expr4707);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:562:11: TOK_LCB ctl_set_list_expr TOK_RCB
                    {
                    TOK_LCB81=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctl_set_expr4730); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB81);

                    pushFollow(FOLLOW_ctl_set_list_expr_in_ctl_set_expr4732);
                    ctl_set_list_expr82=ctl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_set_list_expr.add(ctl_set_list_expr82.getTree());
                    TOK_RCB83=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctl_set_expr4734); if (failed) return retval;
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
                    // 564:9: -> ^( SET_LIST_EXP_T ctl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:564:12: ^( SET_LIST_EXP_T ctl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:566:1: ctl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctl_set_list_expr_return ctl_set_list_expr() throws RecognitionException {
        ctl_set_list_expr_return retval = new ctl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA85=null;
        simple_root_expr_return simple_root_expr84 = null;

        simple_root_expr_return simple_root_expr86 = null;


        Object TOK_COMMA85_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4787);
            simple_root_expr84=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr84.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:28: ( TOK_COMMA simple_root_expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==TOK_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA85=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_set_list_expr4790); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4793);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:569:1: ctl_shift_expr returns [InternalSpec ret] : f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:572:9: (f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:572:11: f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4839);
            f=ctl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:573:9: (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:573:11: op= TOK_LSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4855); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4860);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:575:11: op= TOK_RSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4884); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4889);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:579:1: ctl_remainder_expr returns [InternalSpec ret] : f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:582:9: (f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:582:11: f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4951);
            f=ctl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:583:9: (op= TOK_MOD s= ctl_additive_expr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TOK_MOD) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:583:11: op= TOK_MOD s= ctl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctl_remainder_expr4967); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4972);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:589:1: ctl_additive_expr returns [InternalSpec ret] : f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:592:9: (f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:592:11: f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5036);
            f=ctl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:593:9: (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:593:11: op= TOK_PLUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctl_additive_expr5052); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5057);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:595:11: op= TOK_MINUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_additive_expr5081); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5086);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:599:1: ctl_multiplicative_expr returns [InternalSpec ret] : f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:602:9: (f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:602:11: f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5147);
            f=ctl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:603:9: (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:603:11: op= TOK_TIMES s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5163); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5168);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:605:11: op= TOK_DIVIDE s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5192); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5197);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:609:1: ctl_concatination_expr returns [InternalSpec ret] : f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:612:9: (f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:612:11: f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5258);
            f=ctl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:613:9: (op= TOK_CONCATENATION s= ctl_primary_expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==TOK_CONCATENATION) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:613:11: op= TOK_CONCATENATION s= ctl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5274); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5279);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:618:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:621:9: ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("618:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:621:11: ctl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5348);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:623:11: op= TOK_MINUS v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_primary_expr5372); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5376);
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
                    // 625:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:625:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:626:11: op= TOK_NOT v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctl_primary_expr5417); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5421);
                    v=ctl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_primary_expr.add(v.getTree());
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
                    // 628:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:628:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:631:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:634:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
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

                if ( (LA37_3==TOK_ATOM) ) {
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
                            new NoViableAltException("631:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 10, input);

                        throw nvae;
                    }

                }
                else if ( (LA37_3==TOK_LCB||(LA37_3>=TOK_PLUS && LA37_3<=TOK_MINUS)||(LA37_3>=TOK_NOT && LA37_3<=TOK_LP)||(LA37_3>=TOK_BOOL && LA37_3<=TOK_CASE)||(LA37_3>=TOK_WAREAD && LA37_3<=TOK_AA)||LA37_3==TOK_EE||LA37_3==TOK_NUMBER||LA37_3==TOK_NUMBER_WORD||(LA37_3>=TOK_FALSEEXP && LA37_3<=TOK_TRUEEXP)) ) {
                    alt37=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("631:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 3, input);

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
                    new NoViableAltException("631:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | ctl_sknow primary_expr_select -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:634:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctl_primary_expr_helper15486);
                    constant88=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant88.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15488);
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
                    // 637:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:637:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:638:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15539);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:645:11: ctl_know primary_expr_select
                    {
                    pushFollow(FOLLOW_ctl_know_in_ctl_primary_expr_helper15582);
                    ctl_know91=ctl_know();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_know.add(ctl_know91.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15584);
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
                    // 647:9: -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:647:12: ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:649:11: ctl_sknow primary_expr_select
                    {
                    pushFollow(FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15628);
                    ctl_sknow93=ctl_sknow();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_sknow.add(ctl_sknow93.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15630);
                    primary_expr_select94=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select94.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_sknow93.ret; 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, ctl_sknow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 651:9: -> ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:651:12: ^( CTL_SKNOW_T ctl_sknow NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:655:11: TOK_LP ctl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP95=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15684); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP95);

                    pushFollow(FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15686);
                    ctl_root_expr96=ctl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_root_expr.add(ctl_root_expr96.getTree());
                    TOK_RP97=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15688); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP97);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15690);
                    primary_expr_select98=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select98.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_root_expr96.ret; 
                    }

                    // AST REWRITE
                    // elements: ctl_root_expr, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 657:9: -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:657:12: ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:661:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL99=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15761); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL99);

                    TOK_LP100=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15763); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP100);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15765);
                    simple_root_expr101=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr101.getTree());
                    TOK_RP102=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15767); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP102);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15769);
                    primary_expr_select103=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select103.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_BOOL, simple_root_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 664:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:664:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:665:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1104=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15820); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1104);

                    TOK_LP105=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15822); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP105);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15824);
                    simple_root_expr106=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr106.getTree());
                    TOK_RP107=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15826); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP107);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15828);
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
                    // 668:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:668:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:670:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT109=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15888); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT109);

                    TOK_LP110=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15890); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP110);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15892);
                    simple_root_expr111=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr111.getTree());
                    TOK_RP112=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15894); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP112);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15896);
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
                    // 673:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:673:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:675:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE114=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15956); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE114);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15958);
                    case_element_list_expr115=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr115.getTree());
                    TOK_ESAC116=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15960); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC116);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15962);
                    primary_expr_select117=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select117.getTree());
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
                    // 678:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:678:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:680:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD118=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16022); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD118);

                    TOK_LP119=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16024); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP119);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16028);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA120=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16030); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA120);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16034);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP121=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16036); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP121);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16038);
                    primary_expr_select122=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select122.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: f, TOK_WAREAD, primary_expr_select, s
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
                    // 683:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:683:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:685:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE123=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16102); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE123);

                    TOK_LP124=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16104); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP124);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16108);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16112); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16116);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16120); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16124);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP125=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16126); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP125);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16128);
                    primary_expr_select126=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select126.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: s, TOK_WAWRITE, primary_expr_select, f, m
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
                    // 688:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:688:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:691:1: ctl_know returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:694:9: ( TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:694:11: TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP
            {
            root_0 = (Object)adaptor.nil();

            TOK_LP127=(Token)input.LT(1);
            match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_know6217); if (failed) return retval;
            pushFollow(FOLLOW_agent_name_in_ctl_know6222);
            agent=agent_name();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
            opk=(Token)input.LT(1);
            match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ctl_know6226); if (failed) return retval;
            if ( backtracking==0 ) {
            opk_tree = (Object)adaptor.create(opk);
            root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_know6231);
            f=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            TOK_RP128=(Token)input.LT(1);
            match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_know6233); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:701:1: ctl_sknow returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:704:9: ( TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:704:11: TOK_LP agent= agent_name opk= TOK_SKNOW f= ctl_root_expr TOK_RP
            {
            root_0 = (Object)adaptor.nil();

            TOK_LP129=(Token)input.LT(1);
            match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_sknow6299); if (failed) return retval;
            pushFollow(FOLLOW_agent_name_in_ctl_sknow6304);
            agent=agent_name();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
            opk=(Token)input.LT(1);
            match(input,TOK_SKNOW,FOLLOW_TOK_SKNOW_in_ctl_sknow6308); if (failed) return retval;
            if ( backtracking==0 ) {
            opk_tree = (Object)adaptor.create(opk);
            root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_sknow6313);
            f=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            TOK_RP130=(Token)input.LT(1);
            match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_sknow6315); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:720:1: agent_name returns [InternalSpecAgentIdentifier ret] : agentName= TOK_ATOM ;
    public final agent_name_return agent_name() throws RecognitionException {
        agent_name_return retval = new agent_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token agentName=null;

        Object agentName_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:722:9: (agentName= TOK_ATOM )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:722:11: agentName= TOK_ATOM
            {
            root_0 = (Object)adaptor.nil();

            agentName=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_agent_name6386); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:729:1: ltl_root_expr returns [InternalSpec ret] : ltl_implies_expr ;
    public final ltl_root_expr_return ltl_root_expr() throws RecognitionException {
        ltl_root_expr_return retval = new ltl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_implies_expr_return ltl_implies_expr131 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:730:9: ( ltl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:730:11: ltl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_implies_expr_in_ltl_root_expr6435);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:732:1: ltl_implies_expr returns [InternalSpec ret] : f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:735:9: (f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:735:11: f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_iff_expr_in_ltl_implies_expr6478);
            f=ltl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:736:9: (op= TOK_IMPLIES s= ltl_implies_expr )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TOK_IMPLIES) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:736:11: op= TOK_IMPLIES s= ltl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6494); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_implies_expr_in_ltl_implies_expr6499);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:740:1: ltl_iff_expr returns [InternalSpec ret] : f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:9: (f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:11: f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6564);
            f=ltl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:744:9: (op= TOK_IFF s= ltl_or_expr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==TOK_IFF) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:744:11: op= TOK_IFF s= ltl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ltl_iff_expr6580); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6585);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:748:1: ltl_or_expr returns [InternalSpec ret] : f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:751:9: (f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:751:11: f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6649);
            f=ltl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:752:9: (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:752:11: op= TOK_OR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ltl_or_expr6665); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6670);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:754:11: op= TOK_XOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ltl_or_expr6694); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6699);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:756:11: op= TOK_XNOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ltl_or_expr6723); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6728);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:760:1: ltl_and_expr returns [InternalSpec ret] : f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:763:9: (f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:763:11: f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6791);
            f=ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:764:9: (op= TOK_AND s= ltl_binary_expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==TOK_AND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:764:11: op= TOK_AND s= ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ltl_and_expr6807); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6812);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:770:1: ltl_binary_expr returns [InternalSpec ret] : f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* ;
    public final ltl_binary_expr_return ltl_binary_expr() throws RecognitionException {
        ltl_binary_expr_return retval = new ltl_binary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ltl_unary_expr_return f = null;

        ltl_unary_expr_return s = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:773:9: (f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:773:11: f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6877);
            f=ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:774:9: (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            loop42:
            do {
                int alt42=6;
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
                case TOK_KNOW:
                    {
                    alt42=5;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:774:11: op= TOK_UNTIL s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ltl_binary_expr6893); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6898);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:776:11: op= TOK_SINCE s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ltl_binary_expr6923); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6928);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:778:11: op= TOK_RELEASES s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ltl_binary_expr6953); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6958);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:780:11: op= TOK_TRIGGERED s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6983); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6988);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:783:11: op= TOK_KNOW s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ltl_binary_expr7021); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr7026);
            	    s=ltl_unary_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, s.getTree());
            	    if ( backtracking==0 ) {
            	       if (!er()) exp_str += " " + op.getText() + " " + input.toString(s.start,s.stop); if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ltl_know(input, ((Token)retval.start), exp_str, retval.ret, s.ret); 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:787:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );
    public final ltl_unary_expr_return ltl_unary_expr() throws RecognitionException {
        ltl_unary_expr_return retval = new ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_pure_unary_expr_return ltl_pure_unary_expr132 = null;

        ltl_relational_expr_return ltl_relational_expr133 = null;


        RewriteRuleSubtreeStream stream_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr )
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
            else if ( (LA43_0==TOK_NOT) ) {
                int LA43_8 = input.LA(2);

                if ( ((LA43_8>=TOK_PLUS && LA43_8<=TOK_MINUS)||LA43_8==TOK_LP||(LA43_8>=TOK_BOOL && LA43_8<=TOK_CASE)||(LA43_8>=TOK_WAREAD && LA43_8<=TOK_WAWRITE)||LA43_8==TOK_ATOM||LA43_8==TOK_NUMBER||LA43_8==TOK_NUMBER_WORD||(LA43_8>=TOK_FALSEEXP && LA43_8<=TOK_TRUEEXP)) ) {
                    alt43=2;
                }
                else if ( (LA43_8==TOK_NOT) ) {
                    int LA43_10 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt43=1;
                    }
                    else if ( (true) ) {
                        alt43=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("787:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA43_8==TOK_OP_NEXT) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_PREV) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_NOTPREVNOT) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_GLOBALLY) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_HISTORICALLY) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_FINALLY) && (synpred6())) {
                    alt43=1;
                }
                else if ( (LA43_8==TOK_OP_ONCE) && (synpred6())) {
                    alt43=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("787:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==TOK_LCB||(LA43_0>=TOK_PLUS && LA43_0<=TOK_MINUS)||LA43_0==TOK_LP||(LA43_0>=TOK_BOOL && LA43_0<=TOK_CASE)||(LA43_0>=TOK_WAREAD && LA43_0<=TOK_WAWRITE)||LA43_0==TOK_ATOM||LA43_0==TOK_NUMBER||LA43_0==TOK_NUMBER_WORD||(LA43_0>=TOK_FALSEEXP && LA43_0<=TOK_TRUEEXP)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("787:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7178);
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
                    // 797:9: -> ^( PURE_LTL_T ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:797:12: ^( PURE_LTL_T ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:798:11: ltl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_relational_expr_in_ltl_unary_expr7219);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:801:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );
    public final ltl_pure_unary_expr_return ltl_pure_unary_expr() throws RecognitionException {
        ltl_pure_unary_expr_return retval = new ltl_pure_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ltl_unary_expr_return f = null;

        ltl_pure_unary_expr_return fp = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:804:9: (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr )
            int alt44=8;
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
            case TOK_NOT:
                {
                alt44=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("801:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:804:11: op= TOK_OP_NEXT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7271); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7276);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:806:11: op= TOK_OP_PREV f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7300); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7305);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:808:11: op= TOK_OP_NOTPREVNOT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7329); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7334);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:810:11: op= TOK_OP_GLOBALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7358); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7363);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:812:11: op= TOK_OP_HISTORICALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7387); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7392);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:814:11: op= TOK_OP_FINALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7416); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7421);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:816:11: op= TOK_OP_ONCE f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7445); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7450);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:819:11: op= TOK_NOT fp= ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7484); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7489);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:823:1: ltl_relational_expr returns [InternalSpec ret] : f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:826:9: (f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:826:11: f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7541);
            f=ltl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:827:9: (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:827:11: op= TOK_EQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ltl_relational_expr7557); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7562);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:829:11: op= TOK_NOTEQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7587); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7592);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:831:11: op= TOK_LT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ltl_relational_expr7617); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7622);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:833:11: op= TOK_GT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ltl_relational_expr7647); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7652);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:835:11: op= TOK_LE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ltl_relational_expr7677); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7682);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:837:11: op= TOK_GE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ltl_relational_expr7707); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:841:1: ltl_in_expr returns [InternalSpec ret] : f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:844:9: (f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:844:11: f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7776);
            f=ltl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:845:9: (op= TOK_SETIN s= ltl_union_expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==TOK_SETIN) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:845:11: op= TOK_SETIN s= ltl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ltl_in_expr7792); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7797);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:849:1: ltl_union_expr returns [InternalSpec ret] : f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:852:9: (f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:852:11: f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7860);
            f=ltl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:9: (op= TOK_UNION s= ltl_set_expr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==TOK_UNION) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:11: op= TOK_UNION s= ltl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ltl_union_expr7876); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7881);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:860:9: ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) )
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
                else if ( (LA48_2==EOF||(LA48_2>=TOK_INVAR_SPEC && LA48_2<=TOK_UNION)||(LA48_2>=TOK_LSHIFT && LA48_2<=TOK_CONCATENATION)||LA48_2==TOK_RP||(LA48_2>=TOK_LB && LA48_2<=TOK_UNTIL)||LA48_2==TOK_KNOW||(LA48_2>=TOK_SINCE && LA48_2<=TOK_TRIGGERED)||LA48_2==TOK_DOT||LA48_2==TOK_SEMI) ) {
                    alt48=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==TOK_NUMBER) ) {
                    int LA48_7 = input.LA(3);

                    if ( (LA48_7==TOK_TWODOTS) ) {
                        alt48=2;
                    }
                    else if ( (LA48_7==EOF||(LA48_7>=TOK_INVAR_SPEC && LA48_7<=TOK_UNION)||(LA48_7>=TOK_LSHIFT && LA48_7<=TOK_CONCATENATION)||LA48_7==TOK_RP||(LA48_7>=TOK_LB && LA48_7<=TOK_UNTIL)||LA48_7==TOK_KNOW||(LA48_7>=TOK_SINCE && LA48_7<=TOK_TRIGGERED)||LA48_7==TOK_DOT||LA48_7==TOK_SEMI) ) {
                        alt48=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA48_4 = input.LA(2);

                if ( (LA48_4==TOK_NUMBER) ) {
                    int LA48_8 = input.LA(3);

                    if ( (LA48_8==EOF||(LA48_8>=TOK_INVAR_SPEC && LA48_8<=TOK_UNION)||(LA48_8>=TOK_LSHIFT && LA48_8<=TOK_CONCATENATION)||LA48_8==TOK_RP||(LA48_8>=TOK_LB && LA48_8<=TOK_UNTIL)||LA48_8==TOK_KNOW||(LA48_8>=TOK_SINCE && LA48_8<=TOK_TRIGGERED)||LA48_8==TOK_DOT||LA48_8==TOK_SEMI) ) {
                        alt48=1;
                    }
                    else if ( (LA48_8==TOK_TWODOTS) ) {
                        alt48=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_4>=TOK_PLUS && LA48_4<=TOK_MINUS)||(LA48_4>=TOK_NOT && LA48_4<=TOK_LP)||(LA48_4>=TOK_BOOL && LA48_4<=TOK_CASE)||(LA48_4>=TOK_WAREAD && LA48_4<=TOK_WAWRITE)||LA48_4==TOK_ATOM||LA48_4==TOK_NUMBER_WORD||(LA48_4>=TOK_FALSEEXP && LA48_4<=TOK_TRUEEXP)) ) {
                    alt48=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 4, input);

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
                    new NoViableAltException("857:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:860:11: ltl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_shift_expr_in_ltl_set_expr7942);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:862:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ltl_set_expr7964);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:864:11: TOK_LCB ltl_set_list_expr TOK_RCB
                    {
                    TOK_LCB136=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ltl_set_expr7987); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB136);

                    pushFollow(FOLLOW_ltl_set_list_expr_in_ltl_set_expr7989);
                    ltl_set_list_expr137=ltl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_set_list_expr.add(ltl_set_list_expr137.getTree());
                    TOK_RCB138=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ltl_set_expr7991); if (failed) return retval;
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
                    // 866:9: -> ^( SET_LIST_EXP_T ltl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:866:12: ^( SET_LIST_EXP_T ltl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:868:1: ltl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ltl_set_list_expr_return ltl_set_list_expr() throws RecognitionException {
        ltl_set_list_expr_return retval = new ltl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA140=null;
        simple_root_expr_return simple_root_expr139 = null;

        simple_root_expr_return simple_root_expr141 = null;


        Object TOK_COMMA140_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8044);
            simple_root_expr139=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr139.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:28: ( TOK_COMMA simple_root_expr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==TOK_COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA140=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_set_list_expr8047); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr8050);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:871:1: ltl_shift_expr returns [InternalSpec ret] : f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:874:9: (f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:874:11: f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8096);
            f=ltl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:875:9: (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:875:11: op= TOK_LSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8112); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8117);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:877:11: op= TOK_RSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8141); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8146);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:881:1: ltl_remainder_expr returns [InternalSpec ret] : f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:884:9: (f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:884:11: f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8208);
            f=ltl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:885:9: (op= TOK_MOD s= ltl_additive_expr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==TOK_MOD) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:885:11: op= TOK_MOD s= ltl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ltl_remainder_expr8224); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8229);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:891:1: ltl_additive_expr returns [InternalSpec ret] : f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:894:9: (f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:894:11: f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8293);
            f=ltl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:895:9: (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:895:11: op= TOK_PLUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ltl_additive_expr8309); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8314);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:897:11: op= TOK_MINUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_additive_expr8338); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8343);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:901:1: ltl_multiplicative_expr returns [InternalSpec ret] : f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:904:9: (f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:904:11: f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8404);
            f=ltl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:905:9: (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:905:11: op= TOK_TIMES s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8420); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8425);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:907:11: op= TOK_DIVIDE s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8449); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8454);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:911:1: ltl_concatination_expr returns [InternalSpec ret] : f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:914:9: (f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:914:11: f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8515);
            f=ltl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:915:9: (op= TOK_CONCATENATION s= ltl_primary_expr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==TOK_CONCATENATION) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:915:11: op= TOK_CONCATENATION s= ltl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8531); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8536);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:920:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:923:9: ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("920:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:923:11: ltl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8597);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:925:11: op= TOK_MINUS v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_primary_expr8621); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8625);
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
                    // 927:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:927:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:928:11: op= TOK_NOT v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_primary_expr8666); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8670);
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
                    // 930:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:930:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:933:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ltl_primary_expr_helper1_return ltl_primary_expr_helper1() throws RecognitionException {
        ltl_primary_expr_helper1_return retval = new ltl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP146=null;
        Token TOK_RP148=null;
        Token TOK_BOOL150=null;
        Token TOK_LP151=null;
        Token TOK_RP153=null;
        Token TOK_WORD1155=null;
        Token TOK_LP156=null;
        Token TOK_RP158=null;
        Token TOK_NEXT160=null;
        Token TOK_LP161=null;
        Token TOK_RP163=null;
        Token TOK_CASE165=null;
        Token TOK_ESAC167=null;
        Token TOK_WAREAD169=null;
        Token TOK_LP170=null;
        Token TOK_COMMA171=null;
        Token TOK_RP172=null;
        Token TOK_WAWRITE174=null;
        Token TOK_LP175=null;
        Token TOK_RP176=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant143 = null;

        primary_expr_select_return primary_expr_select144 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1145 = null;

        ltl_root_expr_return ltl_root_expr147 = null;

        primary_expr_select_return primary_expr_select149 = null;

        simple_root_expr_return simple_root_expr152 = null;

        primary_expr_select_return primary_expr_select154 = null;

        simple_root_expr_return simple_root_expr157 = null;

        primary_expr_select_return primary_expr_select159 = null;

        simple_root_expr_return simple_root_expr162 = null;

        primary_expr_select_return primary_expr_select164 = null;

        case_element_list_expr_return case_element_list_expr166 = null;

        primary_expr_select_return primary_expr_select168 = null;

        primary_expr_select_return primary_expr_select173 = null;

        primary_expr_select_return primary_expr_select177 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP146_tree=null;
        Object TOK_RP148_tree=null;
        Object TOK_BOOL150_tree=null;
        Object TOK_LP151_tree=null;
        Object TOK_RP153_tree=null;
        Object TOK_WORD1155_tree=null;
        Object TOK_LP156_tree=null;
        Object TOK_RP158_tree=null;
        Object TOK_NEXT160_tree=null;
        Object TOK_LP161_tree=null;
        Object TOK_RP163_tree=null;
        Object TOK_CASE165_tree=null;
        Object TOK_ESAC167_tree=null;
        Object TOK_WAREAD169_tree=null;
        Object TOK_LP170_tree=null;
        Object TOK_COMMA171_tree=null;
        Object TOK_RP172_tree=null;
        Object TOK_WAWRITE174_tree=null;
        Object TOK_LP175_tree=null;
        Object TOK_RP176_tree=null;
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
        RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:936:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt56=9;
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
                alt56=3;
                }
                break;
            case TOK_BOOL:
                {
                alt56=4;
                }
                break;
            case TOK_WORD1:
                {
                alt56=5;
                }
                break;
            case TOK_NEXT:
                {
                alt56=6;
                }
                break;
            case TOK_CASE:
                {
                alt56=7;
                }
                break;
            case TOK_WAREAD:
                {
                alt56=8;
                }
                break;
            case TOK_WAWRITE:
                {
                alt56=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("933:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:936:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ltl_primary_expr_helper18735);
                    constant143=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant143.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18737);
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
                    // 939:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:939:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:940:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18788);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:949:11: TOK_LP ltl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP146=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18841); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP146);

                    pushFollow(FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18843);
                    ltl_root_expr147=ltl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_root_expr.add(ltl_root_expr147.getTree());
                    TOK_RP148=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18845); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP148);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18847);
                    primary_expr_select149=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select149.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_root_expr147.ret; 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, ltl_root_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 951:9: -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:951:12: ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
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
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:955:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL150=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18918); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL150);

                    TOK_LP151=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18920); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP151);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18922);
                    simple_root_expr152=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr152.getTree());
                    TOK_RP153=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18924); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP153);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18926);
                    primary_expr_select154=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select154.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_BOOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 958:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:958:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:959:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1155=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18977); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1155);

                    TOK_LP156=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18979); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP156);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18981);
                    simple_root_expr157=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr157.getTree());
                    TOK_RP158=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18983); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP158);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18985);
                    primary_expr_select159=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select159.getTree());
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
                    // 962:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:962:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:964:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT160=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19045); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT160);

                    TOK_LP161=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19047); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP161);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19049);
                    simple_root_expr162=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr162.getTree());
                    TOK_RP163=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19051); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP163);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19053);
                    primary_expr_select164=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select164.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_NEXT, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 967:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:967:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:969:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE165=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19113); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE165);

                    pushFollow(FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19115);
                    case_element_list_expr166=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr166.getTree());
                    TOK_ESAC167=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19117); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC167);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19119);
                    primary_expr_select168=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select168.getTree());
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
                    // 972:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:972:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:974:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD169=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19179); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD169);

                    TOK_LP170=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19181); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP170);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19185);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA171=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19187); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA171);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19191);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP172=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19193); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP172);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19195);
                    primary_expr_select173=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select173.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: s, f, primary_expr_select, TOK_WAREAD
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
                    // 977:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:977:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:979:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE174=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19259); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE174);

                    TOK_LP175=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19261); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP175);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19265);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19269); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19273);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19277); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19281);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP176=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19283); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP176);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19285);
                    primary_expr_select177=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select177.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: m, primary_expr_select, f, TOK_WAWRITE, s
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
                    // 982:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:982:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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

    public static class ctls_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_root_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:989:1: ctls_root_expr returns [InternalSpec ret] : ctls_implies_expr ;
    public final ctls_root_expr_return ctls_root_expr() throws RecognitionException {
        ctls_root_expr_return retval = new ctls_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_implies_expr_return ctls_implies_expr178 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:990:9: ( ctls_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:990:11: ctls_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_implies_expr_in_ctls_root_expr9366);
            ctls_implies_expr178=ctls_implies_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_implies_expr178.getTree());
            if ( backtracking==0 ) {
              if(!er()) retval.ret = ctls_implies_expr178.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:992:1: ctls_implies_expr returns [InternalSpec ret] : f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:995:9: (f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:995:11: f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_iff_expr_in_ctls_implies_expr9409);
            f=ctls_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:996:9: (op= TOK_IMPLIES s= ctls_implies_expr )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==TOK_IMPLIES) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:996:11: op= TOK_IMPLIES s= ctls_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9425); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_implies_expr_in_ctls_implies_expr9430);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:1: ctls_iff_expr returns [InternalSpec ret] : f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1003:9: (f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1003:11: f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9495);
            f=ctls_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1004:9: (op= TOK_IFF s= ctls_or_expr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==TOK_IFF) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1004:11: op= TOK_IFF s= ctls_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctls_iff_expr9511); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9516);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1008:1: ctls_or_expr returns [InternalSpec ret] : f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1011:9: (f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1011:11: f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9579);
            f=ctls_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1012:9: (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1012:11: op= TOK_OR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctls_or_expr9595); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9600);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1014:11: op= TOK_XOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctls_or_expr9624); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9629);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1016:11: op= TOK_XNOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctls_or_expr9653); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9658);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1020:1: ctls_and_expr returns [InternalSpec ret] : f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1023:9: (f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1023:11: f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9721);
            f=ctls_ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1024:9: (op= TOK_AND s= ctls_ltl_binary_expr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==TOK_AND) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1024:11: op= TOK_AND s= ctls_ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctls_and_expr9737); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9742);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1030:1: ctls_ltl_binary_expr returns [InternalSpec ret] : f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1033:9: (f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1033:11: f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9806);
            f=ctls_ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1034:9: (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1034:11: op= TOK_UNTIL s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9822); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9827);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1036:11: op= TOK_SINCE s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9852); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9857);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1038:11: op= TOK_RELEASES s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9882); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9887);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1040:11: op= TOK_TRIGGERED s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9912); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9917);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1044:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );
    public final ctls_ltl_unary_expr_return ctls_ltl_unary_expr() throws RecognitionException {
        ctls_ltl_unary_expr_return retval = new ctls_ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ltl_pure_unary_expr_return ctls_ltl_pure_unary_expr179 = null;

        ctls_ctl_expr_return ctls_ctl_expr180 = null;


        RewriteRuleSubtreeStream stream_ctls_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr )
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

                if ( ((LA62_8>=TOK_PLUS && LA62_8<=TOK_MINUS)||LA62_8==TOK_LP||(LA62_8>=TOK_BOOL && LA62_8<=TOK_CASE)||(LA62_8>=TOK_WAREAD && LA62_8<=TOK_AA)||LA62_8==TOK_EE||LA62_8==TOK_ATOM||LA62_8==TOK_NUMBER||LA62_8==TOK_NUMBER_WORD||(LA62_8>=TOK_FALSEEXP && LA62_8<=TOK_TRUEEXP)) ) {
                    alt62=2;
                }
                else if ( (LA62_8==TOK_NOT) ) {
                    int LA62_10 = input.LA(3);

                    if ( (synpred7()) ) {
                        alt62=1;
                    }
                    else if ( (true) ) {
                        alt62=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1044:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA62_8==TOK_OP_NEXT) && (synpred7())) {
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
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1044:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==TOK_LCB||(LA62_0>=TOK_PLUS && LA62_0<=TOK_MINUS)||LA62_0==TOK_LP||(LA62_0>=TOK_BOOL && LA62_0<=TOK_CASE)||(LA62_0>=TOK_WAREAD && LA62_0<=TOK_AA)||LA62_0==TOK_EE||LA62_0==TOK_ATOM||LA62_0==TOK_NUMBER||LA62_0==TOK_NUMBER_WORD||(LA62_0>=TOK_FALSEEXP && LA62_0<=TOK_TRUEEXP)) ) {
                alt62=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1044:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr10068);
                    ctls_ltl_pure_unary_expr179=ctls_ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_ltl_pure_unary_expr.add(ctls_ltl_pure_unary_expr179.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ltl_pure_unary_expr179.ret; 
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
                    // 1054:9: -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1054:12: ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1055:11: ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10109);
                    ctls_ctl_expr180=ctls_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ctl_expr180.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ctl_expr180.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1058:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1061:9: (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr )
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
                    new NoViableAltException("1058:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1061:11: op= TOK_OP_NEXT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10159); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10164);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1063:11: op= TOK_OP_PREV f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10188); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10193);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1065:11: op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10217); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10222);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1067:11: op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10246); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10251);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1069:11: op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10275); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10280);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1071:11: op= TOK_OP_FINALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10304); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10309);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1073:11: op= TOK_OP_ONCE f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10333); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10338);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1076:11: op= TOK_NOT fp= ctls_ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10372); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10377);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1081:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );
    public final ctls_ctl_expr_return ctls_ctl_expr() throws RecognitionException {
        ctls_ctl_expr_return retval = new ctls_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_pure_ctl_expr_return ctls_pure_ctl_expr181 = null;

        ctls_relational_expr_return ctls_relational_expr182 = null;


        RewriteRuleSubtreeStream stream_ctls_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr )
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

                if ( (LA64_13==TOK_EX) && (synpred8())) {
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
                else if ( (LA64_13==TOK_NOT) ) {
                    int LA64_27 = input.LA(3);

                    if ( (synpred8()) ) {
                        alt64=1;
                    }
                    else if ( (true) ) {
                        alt64=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1081:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 27, input);

                        throw nvae;
                    }
                }
                else if ( ((LA64_13>=TOK_PLUS && LA64_13<=TOK_MINUS)||LA64_13==TOK_LP||(LA64_13>=TOK_BOOL && LA64_13<=TOK_CASE)||(LA64_13>=TOK_WAREAD && LA64_13<=TOK_WAWRITE)||LA64_13==TOK_ATOM||LA64_13==TOK_NUMBER||LA64_13==TOK_NUMBER_WORD||(LA64_13>=TOK_FALSEEXP && LA64_13<=TOK_TRUEEXP)) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1081:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA64_0==TOK_LCB||(LA64_0>=TOK_PLUS && LA64_0<=TOK_MINUS)||LA64_0==TOK_LP||(LA64_0>=TOK_BOOL && LA64_0<=TOK_CASE)||(LA64_0>=TOK_WAREAD && LA64_0<=TOK_WAWRITE)||LA64_0==TOK_ATOM||LA64_0==TOK_NUMBER||LA64_0==TOK_NUMBER_WORD||(LA64_0>=TOK_FALSEEXP && LA64_0<=TOK_TRUEEXP)) ) {
                alt64=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1081:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr
                    {
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10596);
                    ctls_pure_ctl_expr181=ctls_pure_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_pure_ctl_expr.add(ctls_pure_ctl_expr181.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_pure_ctl_expr181.ret; 
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
                    // 1096:9: -> ^( PURE_CTL_T ctls_pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1096:12: ^( PURE_CTL_T ctls_pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1097:11: ctls_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10634);
                    ctls_relational_expr182=ctls_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_relational_expr182.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_relational_expr182.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1100:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );
    public final ctls_pure_ctl_expr_return ctls_pure_ctl_expr() throws RecognitionException {
        ctls_pure_ctl_expr_return retval = new ctls_pure_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_ctl_expr_return f = null;

        subrange_return fsr = null;

        ctls_ctl_expr_return s = null;

        ctls_pure_ctl_expr_return fp = null;

        ctls_aa_return ctls_aa183 = null;

        ctls_ee_return ctls_ee184 = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1103:9: (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr )
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
                    new NoViableAltException("1100:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1103:11: op= TOK_EX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10685); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10690);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1105:11: op= TOK_AX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10714); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10719);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1107:11: op= TOK_EF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10743); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10748);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1109:11: op= TOK_AF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10772); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10777);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1111:11: op= TOK_EG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10801); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10806);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1113:11: op= TOK_AG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10830); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10835);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1116:11: ( TOK_AA )=> ctls_aa
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10864);
                    ctls_aa183=ctls_aa();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_aa183.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_aa183.ret; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:11: ( TOK_EE )=> ctls_ee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10884);
                    ctls_ee184=ctls_ee();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ee184.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ee184.ret; 
                    }

                    }
                    break;
                case 9 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1119:11: op= TOK_EBF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10901); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10906);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10910);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1121:11: op= TOK_ABF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10934); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10939);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10943);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1123:11: op= TOK_EBG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10967); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10972);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10976);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1125:11: op= TOK_ABG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr11000); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr11005);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11009);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1128:11: op= TOK_NOT fp= ctls_pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr11043); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr11048);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1131:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );
    public final ctls_aa_return ctls_aa() throws RecognitionException {
        ctls_aa_return retval = new ctls_aa_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_abu_return ctls_abu185 = null;

        ctls_au_return ctls_au186 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1133:9: ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au )
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
                            new NoViableAltException("1131:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1131:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1131:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1133:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_abu_in_ctls_aa11107);
                    ctls_abu185=ctls_abu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_abu185.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_abu185.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1135:11: ( TOK_AA TOK_LB )=> ctls_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_au_in_ctls_aa11138);
                    ctls_au186=ctls_au();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_au186.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_au186.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1139:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );
    public final ctls_ee_return ctls_ee() throws RecognitionException {
        ctls_ee_return retval = new ctls_ee_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ebu_return ctls_ebu187 = null;

        ctls_eu_return ctls_eu188 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:9: ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu )
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
                            new NoViableAltException("1139:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1139:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1139:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ebu_in_ctls_ee11207);
                    ctls_ebu187=ctls_ebu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ebu187.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ebu187.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1143:11: ( TOK_EE TOK_LB )=> ctls_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_eu_in_ctls_ee11238);
                    ctls_eu188=ctls_eu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_eu188.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_eu188.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1148:1: ctls_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1151:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1151:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_au11303); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_au11308); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_au11313);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_au11317); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1154:1: ctls_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1157:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1157:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_eu11372); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_eu11377); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_eu11382);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_eu11386); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1160:1: ctls_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1163:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1163:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_abu11440); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_abu11445); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11450);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_abu11454); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_abu11458);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11462);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_abu11466); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1166:1: ctls_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1169:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1169:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_ebu11520); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_ebu11525); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11530);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_ebu11534); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_ebu11538);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11542);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_ebu11546); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1173:1: ctls_relational_expr returns [InternalSpec ret] : f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1176:9: (f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1176:11: f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11598);
            f=ctls_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1177:9: (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1177:11: op= TOK_EQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctls_relational_expr11614); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11619);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1179:11: op= TOK_NOTEQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11644); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11649);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1181:11: op= TOK_LT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctls_relational_expr11674); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11679);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1183:11: op= TOK_GT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctls_relational_expr11704); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11709);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1185:11: op= TOK_LE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctls_relational_expr11734); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11739);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1187:11: op= TOK_GE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctls_relational_expr11764); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11769);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1191:1: ctls_in_expr returns [InternalSpec ret] : f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1194:9: (f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1194:11: f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11832);
            f=ctls_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1195:9: (op= TOK_SETIN s= ctls_union_expr )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==TOK_SETIN) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1195:11: op= TOK_SETIN s= ctls_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctls_in_expr11848); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11853);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1199:1: ctls_union_expr returns [InternalSpec ret] : f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1202:9: (f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1202:11: f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11916);
            f=ctls_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1203:9: (op= TOK_UNION s= ctls_set_expr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==TOK_UNION) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1203:11: op= TOK_UNION s= ctls_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctls_union_expr11932); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11937);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );
    public final ctls_set_expr_return ctls_set_expr() throws RecognitionException {
        ctls_set_expr_return retval = new ctls_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB191=null;
        Token TOK_RCB193=null;
        ctls_shift_expr_return ctls_shift_expr189 = null;

        subrange_return subrange190 = null;

        ctls_set_list_expr_return ctls_set_list_expr192 = null;


        Object TOK_LCB191_tree=null;
        Object TOK_RCB193_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ctls_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1211:9: ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) )
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

                if ( (LA71_2==EOF||(LA71_2>=TOK_INVAR_SPEC && LA71_2<=TOK_UNION)||(LA71_2>=TOK_LSHIFT && LA71_2<=TOK_CONCATENATION)||LA71_2==TOK_RP||(LA71_2>=TOK_LB && LA71_2<=TOK_RB)||LA71_2==TOK_BUNTIL||(LA71_2>=TOK_SINCE && LA71_2<=TOK_TRIGGERED)||LA71_2==TOK_DOT||LA71_2==TOK_SEMI) ) {
                    alt71=1;
                }
                else if ( (LA71_2==TOK_TWODOTS) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA71_3 = input.LA(2);

                if ( (LA71_3==TOK_NUMBER) ) {
                    int LA71_7 = input.LA(3);

                    if ( (LA71_7==EOF||(LA71_7>=TOK_INVAR_SPEC && LA71_7<=TOK_UNION)||(LA71_7>=TOK_LSHIFT && LA71_7<=TOK_CONCATENATION)||LA71_7==TOK_RP||(LA71_7>=TOK_LB && LA71_7<=TOK_RB)||LA71_7==TOK_BUNTIL||(LA71_7>=TOK_SINCE && LA71_7<=TOK_TRIGGERED)||LA71_7==TOK_DOT||LA71_7==TOK_SEMI) ) {
                        alt71=1;
                    }
                    else if ( (LA71_7==TOK_TWODOTS) ) {
                        alt71=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 3, input);

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
                            new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA71_4>=TOK_PLUS && LA71_4<=TOK_MINUS)||(LA71_4>=TOK_NOT && LA71_4<=TOK_LP)||(LA71_4>=TOK_BOOL && LA71_4<=TOK_CASE)||(LA71_4>=TOK_WAREAD && LA71_4<=TOK_WAWRITE)||LA71_4==TOK_ATOM||LA71_4==TOK_NUMBER_WORD||(LA71_4>=TOK_FALSEEXP && LA71_4<=TOK_TRUEEXP)) ) {
                    alt71=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 4, input);

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
                    new NoViableAltException("1208:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1211:11: ctls_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_shift_expr_in_ctls_set_expr11999);
                    ctls_shift_expr189=ctls_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_shift_expr189.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_shift_expr189.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1213:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctls_set_expr12021);
                    subrange190=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange190.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange190.start,subrange190.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1215:11: TOK_LCB ctls_set_list_expr TOK_RCB
                    {
                    TOK_LCB191=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctls_set_expr12044); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB191);

                    pushFollow(FOLLOW_ctls_set_list_expr_in_ctls_set_expr12046);
                    ctls_set_list_expr192=ctls_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_set_list_expr.add(ctls_set_list_expr192.getTree());
                    TOK_RCB193=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctls_set_expr12048); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB193);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB191.getText() + " " + input.toString(ctls_set_list_expr192.start,ctls_set_list_expr192.stop) + " " + TOK_RCB193.getText()); 
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
                    // 1217:9: -> ^( SET_LIST_EXP_T ctls_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1217:12: ^( SET_LIST_EXP_T ctls_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1219:1: ctls_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctls_set_list_expr_return ctls_set_list_expr() throws RecognitionException {
        ctls_set_list_expr_return retval = new ctls_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA195=null;
        simple_root_expr_return simple_root_expr194 = null;

        simple_root_expr_return simple_root_expr196 = null;


        Object TOK_COMMA195_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr12101);
            simple_root_expr194=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr194.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:28: ( TOK_COMMA simple_root_expr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==TOK_COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA195=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_set_list_expr12104); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr12107);
            	    simple_root_expr196=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr196.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1222:1: ctls_shift_expr returns [InternalSpec ret] : f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1225:9: (f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1225:11: f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12153);
            f=ctls_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1226:9: (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1226:11: op= TOK_LSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12169); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12174);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1228:11: op= TOK_RSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12198); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12203);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1232:1: ctls_remainder_expr returns [InternalSpec ret] : f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1235:9: (f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1235:11: f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12265);
            f=ctls_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1236:9: (op= TOK_MOD s= ctls_additive_expr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==TOK_MOD) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1236:11: op= TOK_MOD s= ctls_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctls_remainder_expr12281); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12286);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1243:1: ctls_additive_expr returns [InternalSpec ret] : f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1246:9: (f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1246:11: f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12351);
            f=ctls_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1247:9: (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1247:11: op= TOK_PLUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctls_additive_expr12367); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12372);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1249:11: op= TOK_MINUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_additive_expr12396); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12401);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1253:1: ctls_multiplicative_expr returns [InternalSpec ret] : f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1256:9: (f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1256:11: f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12461);
            f=ctls_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1257:9: (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1257:11: op= TOK_TIMES s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12477); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12482);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1259:11: op= TOK_DIVIDE s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12506); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12511);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1263:1: ctls_concatination_expr returns [InternalSpec ret] : f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1266:9: (f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1266:11: f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12572);
            f=ctls_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1267:9: (op= TOK_CONCATENATION s= ctls_primary_expr )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==TOK_CONCATENATION) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1267:11: op= TOK_CONCATENATION s= ctls_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12588); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12593);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1272:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );
    public final ctls_primary_expr_return ctls_primary_expr() throws RecognitionException {
        ctls_primary_expr_return retval = new ctls_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_primary_expr_return v = null;

        ctls_primary_expr_helper1_return ctls_primary_expr_helper1197 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ctls_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1275:9: ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("1272:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1275:11: ctls_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12662);
                    ctls_primary_expr_helper1197=ctls_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_primary_expr_helper1197.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_primary_expr_helper1197.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1277:11: op= TOK_MINUS v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_primary_expr12686); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12690);
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
                    // 1279:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1279:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1280:11: op= TOK_NOT v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_primary_expr12731); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12735);
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
                    // 1282:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1282:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1285:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctls_primary_expr_helper1_return ctls_primary_expr_helper1() throws RecognitionException {
        ctls_primary_expr_helper1_return retval = new ctls_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP201=null;
        Token TOK_RP203=null;
        Token TOK_BOOL205=null;
        Token TOK_LP206=null;
        Token TOK_RP208=null;
        Token TOK_WORD1210=null;
        Token TOK_LP211=null;
        Token TOK_RP213=null;
        Token TOK_NEXT215=null;
        Token TOK_LP216=null;
        Token TOK_RP218=null;
        Token TOK_CASE220=null;
        Token TOK_ESAC222=null;
        Token TOK_WAREAD224=null;
        Token TOK_LP225=null;
        Token TOK_COMMA226=null;
        Token TOK_RP227=null;
        Token TOK_WAWRITE229=null;
        Token TOK_LP230=null;
        Token TOK_RP231=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant198 = null;

        primary_expr_select_return primary_expr_select199 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1200 = null;

        ctls_root_expr_return ctls_root_expr202 = null;

        primary_expr_select_return primary_expr_select204 = null;

        simple_root_expr_return simple_root_expr207 = null;

        primary_expr_select_return primary_expr_select209 = null;

        simple_root_expr_return simple_root_expr212 = null;

        primary_expr_select_return primary_expr_select214 = null;

        simple_root_expr_return simple_root_expr217 = null;

        primary_expr_select_return primary_expr_select219 = null;

        case_element_list_expr_return case_element_list_expr221 = null;

        primary_expr_select_return primary_expr_select223 = null;

        primary_expr_select_return primary_expr_select228 = null;

        primary_expr_select_return primary_expr_select232 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP201_tree=null;
        Object TOK_RP203_tree=null;
        Object TOK_BOOL205_tree=null;
        Object TOK_LP206_tree=null;
        Object TOK_RP208_tree=null;
        Object TOK_WORD1210_tree=null;
        Object TOK_LP211_tree=null;
        Object TOK_RP213_tree=null;
        Object TOK_NEXT215_tree=null;
        Object TOK_LP216_tree=null;
        Object TOK_RP218_tree=null;
        Object TOK_CASE220_tree=null;
        Object TOK_ESAC222_tree=null;
        Object TOK_WAREAD224_tree=null;
        Object TOK_LP225_tree=null;
        Object TOK_COMMA226_tree=null;
        Object TOK_RP227_tree=null;
        Object TOK_WAWRITE229_tree=null;
        Object TOK_LP230_tree=null;
        Object TOK_RP231_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1288:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
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
                    new NoViableAltException("1285:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1288:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctls_primary_expr_helper112800);
                    constant198=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant198.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112802);
                    primary_expr_select199=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select199.getTree());
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
                    // 1291:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1291:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1292:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112853);
                    primary_expr_helper1_pointer1200=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1200.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1301:11: TOK_LP ctls_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP201=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112906); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP201);

                    pushFollow(FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112908);
                    ctls_root_expr202=ctls_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_root_expr.add(ctls_root_expr202.getTree());
                    TOK_RP203=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112910); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP203);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112912);
                    primary_expr_select204=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select204.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_root_expr202.ret; 
                    }

                    // AST REWRITE
                    // elements: ctls_root_expr, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1303:9: -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1303:12: ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL205=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112983); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL205);

                    TOK_LP206=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112985); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP206);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112987);
                    simple_root_expr207=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr207.getTree());
                    TOK_RP208=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112989); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP208);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112991);
                    primary_expr_select209=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select209.getTree());
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
                    // 1310:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1310:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1311:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1210=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper113042); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1210);

                    TOK_LP211=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113044); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP211);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113046);
                    simple_root_expr212=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr212.getTree());
                    TOK_RP213=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113048); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP213);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113050);
                    primary_expr_select214=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select214.getTree());
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
                    // 1314:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1314:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1316:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT215=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113110); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT215);

                    TOK_LP216=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113112); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP216);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113114);
                    simple_root_expr217=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr217.getTree());
                    TOK_RP218=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113116); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP218);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113118);
                    primary_expr_select219=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select219.getTree());
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
                    // 1319:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1319:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1321:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE220=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113178); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE220);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113180);
                    case_element_list_expr221=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr221.getTree());
                    TOK_ESAC222=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113182); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC222);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113184);
                    primary_expr_select223=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select223.getTree());
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
                    // 1324:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1326:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD224=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113244); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD224);

                    TOK_LP225=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113246); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP225);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113250);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA226=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113252); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA226);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113256);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP227=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113258); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP227);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113260);
                    primary_expr_select228=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select228.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAREAD, f, primary_expr_select, s
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
                    // 1329:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1329:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1331:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE229=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113324); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE229);

                    TOK_LP230=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113326); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP230);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113330);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113334); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113338);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113342); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113346);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP231=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113348); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP231);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113350);
                    primary_expr_select232=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select232.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, m, s, primary_expr_select, f
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
                    // 1334:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1344:1: primary_expr_helper1_pointer1 : TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) ;
    public final primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1() throws RecognitionException {
        primary_expr_helper1_pointer1_return retval = new primary_expr_helper1_pointer1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_ATOM233=null;
        primary_expr_select_return primary_expr_select234 = null;


        Object TOK_ATOM233_tree=null;
        RewriteRuleTokenStream stream_TOK_ATOM=new RewriteRuleTokenStream(adaptor,"token TOK_ATOM");
        RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1344:31: ( TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1344:33: TOK_ATOM primary_expr_select
            {
            TOK_ATOM233=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113421); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_ATOM.add(TOK_ATOM233);

            pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113423);
            primary_expr_select234=primary_expr_select();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select234.getTree());

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
            // 1345:9: -> ^( VALUE_T TOK_ATOM NOP primary_expr_select )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1345:12: ^( VALUE_T TOK_ATOM NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:1: primary_expr_select : ( primary_expr_select_helper | primary_expr_ref )* ;
    public final primary_expr_select_return primary_expr_select() throws RecognitionException {
        primary_expr_select_return retval = new primary_expr_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_return primary_expr_select_helper235 = null;

        primary_expr_ref_return primary_expr_ref236 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:24: ( ( primary_expr_select_helper | primary_expr_ref )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:26: ( primary_expr_select_helper | primary_expr_ref )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:26: ( primary_expr_select_helper | primary_expr_ref )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:27: primary_expr_select_helper
            	    {
            	    pushFollow(FOLLOW_primary_expr_select_helper_in_primary_expr_select13466);
            	    primary_expr_select_helper235=primary_expr_select_helper();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper235.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:56: primary_expr_ref
            	    {
            	    pushFollow(FOLLOW_primary_expr_ref_in_primary_expr_select13470);
            	    primary_expr_ref236=primary_expr_ref();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_ref236.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:1: primary_expr_ref : ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) ;
    public final primary_expr_ref_return primary_expr_ref() throws RecognitionException {
        primary_expr_ref_return retval = new primary_expr_ref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_DOT237=null;
        Token set238=null;

        Object TOK_DOT237_tree=null;
        Object set238_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:21: ( ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:24: TOK_DOT ( TOK_ATOM | TOK_NUMBER )
            {
            TOK_DOT237=(Token)input.LT(1);
            match(input,TOK_DOT,FOLLOW_TOK_DOT_in_primary_expr_ref13493); if (failed) return retval;
            set238=(Token)input.LT(1);
            if ( input.LA(1)==TOK_ATOM||input.LA(1)==TOK_NUMBER ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set238));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_primary_expr_ref13496);    throw mse;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );
    public final primary_expr_select_helper_return primary_expr_select_helper() throws RecognitionException {
        primary_expr_select_helper_return retval = new primary_expr_select_helper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix239 = null;

        primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix240 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1354:29: ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix )
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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 2, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 3, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_PLUS:
                    {
                    int LA81_5 = input.LA(3);

                    if ( (LA81_5==TOK_NUMBER) ) {
                        int LA81_24 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 5, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 6, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 7, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_BOOL:
                    {
                    int LA81_9 = input.LA(3);

                    if ( (LA81_9==TOK_LP) ) {
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 30, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WORD1:
                    {
                    int LA81_10 = input.LA(3);

                    if ( (LA81_10==TOK_LP) ) {
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 31, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_NEXT:
                    {
                    int LA81_11 = input.LA(3);

                    if ( (LA81_11==TOK_LP) ) {
                        int LA81_32 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 32, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 11, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WAREAD:
                    {
                    int LA81_13 = input.LA(3);

                    if ( (LA81_13==TOK_LP) ) {
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 35, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WAWRITE:
                    {
                    int LA81_14 = input.LA(3);

                    if ( (LA81_14==TOK_LP) ) {
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 36, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_MINUS:
                    {
                    switch ( input.LA(3) ) {
                    case TOK_NUMBER:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_FALSEEXP:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_TRUEEXP:
                        {
                        int LA81_39 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA81_40 = input.LA(4);

                        if ( (LA81_40==TOK_NUMBER) ) {
                            int LA81_85 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 85, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER_WORD:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_ATOM:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_LP:
                        {
                        int LA81_43 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA81_44 = input.LA(4);

                        if ( (LA81_44==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 92, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
                        {
                        int LA81_45 = input.LA(4);

                        if ( (LA81_45==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 93, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 45, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
                        {
                        int LA81_46 = input.LA(4);

                        if ( (LA81_46==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 94, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_CASE:
                        {
                        int LA81_47 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 47, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA81_48 = input.LA(4);

                        if ( (LA81_48==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 97, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 48, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
                        {
                        int LA81_49 = input.LA(4);

                        if ( (LA81_49==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 98, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_MINUS:
                        {
                        int LA81_50 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 50, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 101, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 102, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 103, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 167, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 104, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 105, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 106, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 107, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 173, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 108, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 174, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 109, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 175, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 110, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 111, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 178, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 112, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 179, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 113, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 114, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 115, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 51, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 15, input);

                        throw nvae;
                    }

                    }
                    break;
                case TOK_NOT:
                    {
                    switch ( input.LA(3) ) {
                    case TOK_FALSEEXP:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_TRUEEXP:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER:
                        {
                        int LA81_54 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA81_55 = input.LA(4);

                        if ( (LA81_55==TOK_NUMBER) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 121, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER_WORD:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_ATOM:
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
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_LP:
                        {
                        int LA81_58 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA81_59 = input.LA(4);

                        if ( (LA81_59==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 127, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
                        {
                        int LA81_60 = input.LA(4);

                        if ( (LA81_60==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 128, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 60, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
                        {
                        int LA81_61 = input.LA(4);

                        if ( (LA81_61==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 129, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 61, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_CASE:
                        {
                        int LA81_62 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 62, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA81_63 = input.LA(4);

                        if ( (LA81_63==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 132, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
                        {
                        int LA81_64 = input.LA(4);

                        if ( (LA81_64==TOK_LP) ) {
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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 133, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 64, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 134, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 135, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 136, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 200, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 137, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 138, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 139, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 140, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 206, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 141, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 207, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 142, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 208, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 143, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 144, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 211, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 145, input);

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
                                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 212, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 146, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 147, input);

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
                                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 148, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 65, input);

                            throw nvae;
                        }

                        }
                        break;
                    case TOK_NOT:
                        {
                        int LA81_66 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt81=1;
                        }
                        else if ( (true) ) {
                            alt81=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 66, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 16, input);

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
                            new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1354:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1354:31: ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13530);
                    primary_expr_select_helper_arr_suffix239=primary_expr_select_helper_arr_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_arr_suffix239.getTree());

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1355:11: primary_expr_select_helper_bit_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13542);
                    primary_expr_select_helper_bit_suffix240=primary_expr_select_helper_bit_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_bit_suffix240.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1357:1: primary_expr_select_helper_arr_suffix : TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) ;
    public final primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix() throws RecognitionException {
        primary_expr_select_helper_arr_suffix_return retval = new primary_expr_select_helper_arr_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB241=null;
        Token TOK_RB243=null;
        simple_root_expr_return simple_root_expr242 = null;


        Object TOK_LB241_tree=null;
        Object TOK_RB243_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1358:9: ( TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1358:11: TOK_LB simple_root_expr TOK_RB
            {
            TOK_LB241=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13566); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB241);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13568);
            simple_root_expr242=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr242.getTree());
            TOK_RB243=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13570); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB243);


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
            // 1359:9: -> ^( ARRAY_INDEX_T simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1359:12: ^( ARRAY_INDEX_T simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1361:1: primary_expr_select_helper_bit_suffix : TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) ;
    public final primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix() throws RecognitionException {
        primary_expr_select_helper_bit_suffix_return retval = new primary_expr_select_helper_bit_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB244=null;
        Token TOK_COLON245=null;
        Token TOK_RB246=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;


        Object TOK_LB244_tree=null;
        Object TOK_COLON245_tree=null;
        Object TOK_RB246_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1362:9: ( TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1362:11: TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB
            {
            TOK_LB244=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13610); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB244);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13614);
            f=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
            TOK_COLON245=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13616); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON245);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13620);
            s=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
            TOK_RB246=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13622); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB246);


            // AST REWRITE
            // elements: s, f
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
            // 1363:9: -> ^( BIT_SELECT_T $f $s)
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1363:12: ^( BIT_SELECT_T $f $s)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1366:1: case_element_expr : simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) ;
    public final case_element_expr_return case_element_expr() throws RecognitionException {
        case_element_expr_return retval = new case_element_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COLON248=null;
        Token TOK_SEMI250=null;
        simple_root_expr_return simple_root_expr247 = null;

        simple_root_expr_return simple_root_expr249 = null;


        Object TOK_COLON248_tree=null;
        Object TOK_SEMI250_tree=null;
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_SEMI=new RewriteRuleTokenStream(adaptor,"token TOK_SEMI");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1366:22: ( simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1366:24: simple_root_expr TOK_COLON simple_root_expr TOK_SEMI
            {
            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13670);
            simple_root_expr247=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr247.getTree());
            TOK_COLON248=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_case_element_expr13672); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON248);

            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13674);
            simple_root_expr249=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr249.getTree());
            TOK_SEMI250=(Token)input.LT(1);
            match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_case_element_expr13676); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_SEMI.add(TOK_SEMI250);


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
            // 1367:9: -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1367:12: ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1369:1: case_element_list_expr : case_element_expr ( case_element_expr )* ;
    public final case_element_list_expr_return case_element_list_expr() throws RecognitionException {
        case_element_list_expr_return retval = new case_element_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        case_element_expr_return case_element_expr251 = null;

        case_element_expr_return case_element_expr252 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1369:26: ( case_element_expr ( case_element_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1369:28: case_element_expr ( case_element_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13712);
            case_element_expr251=case_element_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr251.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1369:46: ( case_element_expr )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==TOK_LCB||(LA82_0>=TOK_PLUS && LA82_0<=TOK_MINUS)||(LA82_0>=TOK_NOT && LA82_0<=TOK_LP)||(LA82_0>=TOK_BOOL && LA82_0<=TOK_CASE)||(LA82_0>=TOK_WAREAD && LA82_0<=TOK_WAWRITE)||LA82_0==TOK_ATOM||LA82_0==TOK_NUMBER||LA82_0==TOK_NUMBER_WORD||(LA82_0>=TOK_FALSEEXP && LA82_0<=TOK_TRUEEXP)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1369:47: case_element_expr
            	    {
            	    pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13715);
            	    case_element_expr252=case_element_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr252.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1372:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );
    public final number_return number() throws RecognitionException {
        number_return retval = new number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER253=null;
        Token TOK_PLUS254=null;
        Token TOK_NUMBER255=null;

        Object TOK_NUMBER253_tree=null;
        Object TOK_PLUS254_tree=null;
        Object TOK_NUMBER255_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1372:14: ( TOK_NUMBER | TOK_PLUS TOK_NUMBER )
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
                    new NoViableAltException("1372:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1372:16: TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_NUMBER253=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13740); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER253_tree = (Object)adaptor.create(TOK_NUMBER253);
                    adaptor.addChild(root_0, TOK_NUMBER253_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1373:11: TOK_PLUS TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_PLUS254=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_number13752); if (failed) return retval;
                    TOK_NUMBER255=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13755); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER255_tree = (Object)adaptor.create(TOK_NUMBER255);
                    adaptor.addChild(root_0, TOK_NUMBER255_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );
    public final integer_return integer() throws RecognitionException {
        integer_return retval = new integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER256=null;
        Token TOK_PLUS257=null;
        Token TOK_NUMBER258=null;
        Token TOK_MINUS259=null;
        Token TOK_NUMBER260=null;

        Object TOK_NUMBER256_tree=null;
        Object TOK_PLUS257_tree=null;
        Object TOK_NUMBER258_tree=null;
        Object TOK_MINUS259_tree=null;
        Object TOK_NUMBER260_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NUMBER=new RewriteRuleTokenStream(adaptor,"token TOK_NUMBER");
        RewriteRuleTokenStream stream_TOK_PLUS=new RewriteRuleTokenStream(adaptor,"token TOK_PLUS");

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:15: ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) )
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
                    new NoViableAltException("1374:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:17: TOK_NUMBER
                    {
                    TOK_NUMBER256=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13768); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER256);


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
                    // 1375:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1375:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1376:11: TOK_PLUS TOK_NUMBER
                    {
                    TOK_PLUS257=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_integer13796); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_PLUS.add(TOK_PLUS257);

                    TOK_NUMBER258=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13798); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER258);


                    // AST REWRITE
                    // elements: TOK_NUMBER, TOK_PLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1377:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1377:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1378:11: TOK_MINUS TOK_NUMBER
                    {
                    TOK_MINUS259=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_integer13826); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(TOK_MINUS259);

                    TOK_NUMBER260=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13828); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER260);


                    // AST REWRITE
                    // elements: TOK_MINUS, TOK_NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1379:9: -> ^( TOK_MINUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1379:12: ^( TOK_MINUS TOK_NUMBER )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:1: number_word : TOK_NUMBER_WORD ;
    public final number_word_return number_word() throws RecognitionException {
        number_word_return retval = new number_word_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER_WORD261=null;

        Object TOK_NUMBER_WORD261_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:18: ( TOK_NUMBER_WORD )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:20: TOK_NUMBER_WORD
            {
            root_0 = (Object)adaptor.nil();

            TOK_NUMBER_WORD261=(Token)input.LT(1);
            match(input,TOK_NUMBER_WORD,FOLLOW_TOK_NUMBER_WORD_in_number_word13865); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_NUMBER_WORD261_tree = (Object)adaptor.create(TOK_NUMBER_WORD261);
            adaptor.addChild(root_0, TOK_NUMBER_WORD261_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1384:1: subrange returns [InternalSpecRange ret] : f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) ;
    public final subrange_return subrange() throws RecognitionException {
        subrange_return retval = new subrange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_TWODOTS262=null;
        integer_return f = null;

        integer_return s = null;


        Object TOK_TWODOTS262_tree=null;
        RewriteRuleTokenStream stream_TOK_TWODOTS=new RewriteRuleTokenStream(adaptor,"token TOK_TWODOTS");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1386:9: (f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1386:11: f= integer TOK_TWODOTS s= integer
            {
            pushFollow(FOLLOW_integer_in_subrange13904);
            f=integer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_integer.add(f.getTree());
            TOK_TWODOTS262=(Token)input.LT(1);
            match(input,TOK_TWODOTS,FOLLOW_TOK_TWODOTS_in_subrange13906); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_TWODOTS.add(TOK_TWODOTS262);

            pushFollow(FOLLOW_integer_in_subrange13910);
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
            // 1388:9: -> ^( SUBRANGE_T integer integer )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1388:12: ^( SUBRANGE_T integer integer )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_FALSEEXP263=null;
        Token TOK_TRUEEXP264=null;
        number_return number265 = null;

        number_word_return number_word266 = null;


        Object TOK_FALSEEXP263_tree=null;
        Object TOK_TRUEEXP264_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:15: ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word )
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
                    new NoViableAltException("1390:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:17: TOK_FALSEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_FALSEEXP263=(Token)input.LT(1);
                    match(input,TOK_FALSEEXP,FOLLOW_TOK_FALSEEXP_in_constant13959); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_FALSEEXP263_tree = (Object)adaptor.create(TOK_FALSEEXP263);
                    adaptor.addChild(root_0, TOK_FALSEEXP263_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1391:11: TOK_TRUEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_TRUEEXP264=(Token)input.LT(1);
                    match(input,TOK_TRUEEXP,FOLLOW_TOK_TRUEEXP_in_constant13971); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_TRUEEXP264_tree = (Object)adaptor.create(TOK_TRUEEXP264);
                    adaptor.addChild(root_0, TOK_TRUEEXP264_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1392:11: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_constant13983);
                    number265=number();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number265.getTree());

                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1393:11: number_word
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_word_in_constant13995);
                    number_word266=number_word();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number_word266.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:1: optsemi : ( TOK_SEMI )* ;
    public final optsemi_return optsemi() throws RecognitionException {
        optsemi_return retval = new optsemi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_SEMI267=null;

        Object TOK_SEMI267_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:15: ( ( TOK_SEMI )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:17: ( TOK_SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:17: ( TOK_SEMI )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==TOK_SEMI) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:17: TOK_SEMI
            	    {
            	    TOK_SEMI267=(Token)input.LT(1);
            	    match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_optsemi14020); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    TOK_SEMI267_tree = (Object)adaptor.create(TOK_SEMI267);
            	    adaptor.addChild(root_0, TOK_SEMI267_tree);
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
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:12: ( TOK_NOT )*
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==TOK_NOT) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:409:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred13130); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred13143);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:12: TOK_AA TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred23656); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred23658); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred23660);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred23662); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:12: TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred33682); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred33684); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred33686);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred33688); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:482:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:482:12: TOK_EE TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred43708); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred43710); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred43712);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred43714); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:483:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:483:12: TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred53734); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred53736); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred53738);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred53740); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:12: ( TOK_NOT )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==TOK_NOT) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred67078); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop88;
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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred67091);    throw mse;
        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:12: ( TOK_NOT )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==TOK_NOT) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred79968); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred79981);    throw mse;
        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:12: ( TOK_NOT )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==TOK_NOT) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1082:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred810421); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred810434);    throw mse;
        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1116:11: ( TOK_AA )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1116:12: TOK_AA
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred910859); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:11: ( TOK_EE )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:12: TOK_EE
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1010879); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1133:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1133:12: TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1111096); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1111098); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1111100);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1111102); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1135:11: ( TOK_AA TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1135:12: TOK_AA TOK_LB
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1211131); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1211133); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:12: TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1311196); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1311198); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1311200);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1311202); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1143:11: ( TOK_EE TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1143:12: TOK_EE TOK_LB
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1411231); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1411233); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1354:31: ( TOK_LB simple_root_expr TOK_RB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1354:32: TOK_LB simple_root_expr TOK_RB
        {
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1513521); if (failed) return ;
        pushFollow(FOLLOW_simple_root_expr_in_synpred1513523);
        simple_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_RB,FOLLOW_TOK_RB_in_synpred1513525); if (failed) return ;

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


 

    public static final BitSet FOLLOW_EOF_in_spec160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_list_in_spec172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_spec174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list238 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list254 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_invar_spec_in_spec_element297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_spec_in_spec_element311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_spec_in_spec_element325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_spec_in_spec_element339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_INVAR_SPEC_in_invar_spec387 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_invar_spec390 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_optsemi_in_invar_spec392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_SPEC_in_ctl_spec431 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_spec434 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_optsemi_in_ctl_spec436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LTL_SPEC_in_ltl_spec475 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_spec478 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_optsemi_in_ltl_spec480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec519 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_spec522 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_optsemi_in_ctls_spec524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_expr_in_simple_root_expr566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iff_expr_in_implies_expr610 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_implies_expr626 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_implies_expr_in_implies_expr631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr697 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_iff_expr713 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr718 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr783 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_OR_in_or_expr799 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr804 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_or_expr828 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr833 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_or_expr857 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr862 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr926 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_AND_in_and_expr942 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr947 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1010 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_relational_expr1026 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1031 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_relational_expr1056 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1061 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LT_in_relational_expr1086 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1091 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GT_in_relational_expr1116 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1121 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LE_in_relational_expr1146 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1151 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GE_in_relational_expr1176 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1181 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1246 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_in_expr1262 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1267 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1331 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_union_expr1347 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1352 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_shift_expr_in_set_expr1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_set_expr1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_set_expr1459 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_set_list_expr_in_set_expr1461 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_set_expr1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1517 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_set_list_expr1520 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1523 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1568 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_shift_expr1584 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1589 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_shift_expr1613 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1618 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1681 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_remainder_expr1697 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1702 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1765 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_additive_expr1781 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1786 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_additive_expr1810 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1815 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1877 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_multiplicative_expr1893 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1898 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_multiplicative_expr1922 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1927 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr1989 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_concatination_expr2005 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr2010 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_in_primary_expr2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_primary_expr2122 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_primary_expr2166 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr_helper12235 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12312 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12314 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12316 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_primary_expr_helper12360 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12363 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12365 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12367 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_primary_expr_helper12412 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12414 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12416 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12418 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_primary_expr_helper12462 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12464 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12466 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12468 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_primary_expr_helper12512 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_primary_expr_helper12514 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_primary_expr_helper12516 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_primary_expr_helper12560 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12562 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12564 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12566 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12568 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12570 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_primary_expr_helper12616 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12618 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12620 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12622 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12624 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12626 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12628 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12630 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_root_expr2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_iff_expr_in_ctl_implies_expr2743 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2759 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_implies_expr2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2829 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctl_iff_expr2845 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2850 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2914 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctl_or_expr2930 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2935 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctl_or_expr2959 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2964 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctl_or_expr2988 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2993 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3056 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctl_and_expr3072 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3077 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_pure_ctl_expr_in_ctl_expr3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_relational_expr_in_ctl_expr3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_pure_ctl_expr3411 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_pure_ctl_expr3440 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_pure_ctl_expr3469 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_pure_ctl_expr3498 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_pure_ctl_expr3527 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_pure_ctl_expr3556 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_au_in_pure_ctl_expr3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_abu_in_pure_ctl_expr3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_eu_in_pure_ctl_expr3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_ebu_in_pure_ctl_expr3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_pure_ctl_expr3761 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3766 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_pure_ctl_expr3794 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3799 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_pure_ctl_expr3827 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3832 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_pure_ctl_expr3860 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3865 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_expr3903 = new BitSet(new long[]{0xC010000000000000L,0x00000000000011FFL});
    public static final BitSet FOLLOW_pure_ctl_expr_in_pure_ctl_expr3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_au3962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_au3967 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_au3976 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_au3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_eu4039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_eu4044 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_eu4053 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_eu4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_abu4116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_abu4121 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_abu4130 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_abu4134 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_abu4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_ebu4197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_ebu4202 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_ebu4211 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_ebu4215 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_ebu4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4284 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctl_relational_expr4300 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4305 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4330 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4335 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctl_relational_expr4360 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4365 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctl_relational_expr4390 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4395 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctl_relational_expr4420 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4425 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctl_relational_expr4450 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4455 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4519 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctl_in_expr4535 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4540 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4603 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctl_union_expr4619 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4624 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ctl_shift_expr_in_ctl_set_expr4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctl_set_expr4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctl_set_expr4730 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_set_list_expr_in_ctl_set_expr4732 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctl_set_expr4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4787 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_set_list_expr4790 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4793 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4839 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4855 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4860 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4884 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4889 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4951 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctl_remainder_expr4967 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4972 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5036 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctl_additive_expr5052 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5057 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_additive_expr5081 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5086 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5147 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5163 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5168 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5192 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5197 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5258 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5274 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5279 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_primary_expr5372 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctl_primary_expr5417 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctl_primary_expr_helper15486 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_know_in_ctl_primary_expr_helper15582 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_sknow_in_ctl_primary_expr_helper15628 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15684 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15686 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15688 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15761 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15763 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15765 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15767 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15820 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15822 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15824 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15826 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15888 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15890 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15892 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15894 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15956 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15958 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15960 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16022 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16024 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16028 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16030 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16034 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16036 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16102 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16104 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16108 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16112 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16120 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16124 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16126 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_know6217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_know6222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ctl_know6226 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_know6231 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_know6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_sknow6299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_sknow6304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_TOK_SKNOW_in_ctl_sknow6308 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_sknow6313 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_sknow6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_agent_name6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_root_expr6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_iff_expr_in_ltl_implies_expr6478 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6494 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_implies_expr6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6564 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ltl_iff_expr6580 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6585 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6649 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ltl_or_expr6665 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6670 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ltl_or_expr6694 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6699 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ltl_or_expr6723 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6728 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6791 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ltl_and_expr6807 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6812 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6877 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ltl_binary_expr6893 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6898 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ltl_binary_expr6923 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6928 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ltl_binary_expr6953 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6958 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6983 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6988 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ltl_binary_expr7021 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr7026 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4400L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_relational_expr_in_ltl_unary_expr7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7271 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7300 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7329 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7358 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7387 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7416 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7445 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7484 = new BitSet(new long[]{0x0010000000000000L,0x0000000007F00000L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7541 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ltl_relational_expr7557 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7562 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7587 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7592 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ltl_relational_expr7617 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7622 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ltl_relational_expr7647 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7652 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ltl_relational_expr7677 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7682 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ltl_relational_expr7707 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7712 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7776 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ltl_in_expr7792 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7797 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7860 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ltl_union_expr7876 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7881 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ltl_shift_expr_in_ltl_set_expr7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ltl_set_expr7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ltl_set_expr7987 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_set_list_expr_in_ltl_set_expr7989 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ltl_set_expr7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8044 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_set_list_expr8047 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr8050 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8096 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8112 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8117 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8141 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8146 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8208 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ltl_remainder_expr8224 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8229 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8293 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ltl_additive_expr8309 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8314 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_additive_expr8338 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8343 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8404 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8420 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8425 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8449 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8454 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8515 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8531 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8536 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_primary_expr8621 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_primary_expr8666 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ltl_primary_expr_helper18735 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18841 = new BitSet(new long[]{0x37B1820000000000L,0x0000000697F10000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18843 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18845 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18918 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18920 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18922 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18924 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18977 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18979 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18981 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18983 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper19045 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19047 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19049 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19051 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19113 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19115 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19117 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19179 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19181 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19185 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19187 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19191 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19193 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19259 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19261 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19265 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19269 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19273 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19277 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19281 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19283 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_root_expr9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_iff_expr_in_ctls_implies_expr9409 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9425 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_implies_expr9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9495 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctls_iff_expr9511 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9516 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9579 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctls_or_expr9595 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9600 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctls_or_expr9624 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9629 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctls_or_expr9653 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9658 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9721 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctls_and_expr9737 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9742 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9806 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9822 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9827 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0400L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9852 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9857 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0400L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9882 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9887 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0400L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9912 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9917 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0400L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10159 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10188 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10217 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10246 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10275 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10304 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10333 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10372 = new BitSet(new long[]{0x0010000000000000L,0x0000000007F00000L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10685 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10714 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10743 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10772 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10801 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10830 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10901 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10906 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10934 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10939 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10967 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10972 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr11000 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr11005 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr11043 = new BitSet(new long[]{0xC010000000000000L,0x00000000000011FFL});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_abu_in_ctls_aa11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_au_in_ctls_aa11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ebu_in_ctls_ee11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_eu_in_ctls_ee11238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_au11303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_au11308 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_au11313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_au11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_eu11372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_eu11377 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_eu11382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_eu11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_abu11440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_abu11445 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_abu11454 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_abu11458 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_abu11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_ebu11520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_ebu11525 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_ebu11534 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_ebu11538 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_ebu11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11598 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctls_relational_expr11614 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11619 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11644 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11649 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctls_relational_expr11674 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11679 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctls_relational_expr11704 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11709 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctls_relational_expr11734 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11739 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctls_relational_expr11764 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11769 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11832 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctls_in_expr11848 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11853 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11916 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctls_union_expr11932 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11937 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ctls_shift_expr_in_ctls_set_expr11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctls_set_expr12021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctls_set_expr12044 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_set_list_expr_in_ctls_set_expr12046 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctls_set_expr12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr12101 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_set_list_expr12104 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr12107 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12153 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12169 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12174 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12198 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12203 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12265 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctls_remainder_expr12281 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12286 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12351 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctls_additive_expr12367 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12372 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_additive_expr12396 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12401 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12461 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12477 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12482 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12506 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12511 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12572 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12588 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12593 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_primary_expr12686 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_primary_expr12731 = new BitSet(new long[]{0x37B1800000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctls_primary_expr_helper112800 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112906 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112908 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112910 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112983 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112985 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112987 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112989 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper113042 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113044 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113046 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113048 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113110 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113112 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113116 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113178 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113180 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113182 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113244 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113246 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113250 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113252 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113256 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113258 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113324 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113326 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113330 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113334 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113338 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113342 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113346 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113348 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113421 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_in_primary_expr_select13466 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_primary_expr_ref_in_primary_expr_select13470 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000200L});
    public static final BitSet FOLLOW_TOK_DOT_in_primary_expr_ref13493 = new BitSet(new long[]{0x0000000000000000L,0x0000000010010000L});
    public static final BitSet FOLLOW_set_in_primary_expr_ref13496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13566 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13610 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13614 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13616 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13670 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_case_element_expr13672 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13674 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TOK_SEMI_in_case_element_expr13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13712 = new BitSet(new long[]{0x37B1820000000002L,0x0000000690010000L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13715 = new BitSet(new long[]{0x37B1820000000002L,0x0000000690010000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_number13752 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_integer13796 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_integer13826 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_WORD_in_number_word13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_subrange13904 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_TOK_TWODOTS_in_subrange13906 = new BitSet(new long[]{0x0001800000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_integer_in_subrange13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_FALSEEXP_in_constant13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_TRUEEXP_in_constant13971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_word_in_constant13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_SEMI_in_optsemi14020 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred13130 = new BitSet(new long[]{0xC010000000000000L,0x00000000000011FFL});
    public static final BitSet FOLLOW_set_in_synpred13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred23656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred23658 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred23660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred23662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred33682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred33684 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred33686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred33688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred43708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred43710 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred43712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred43714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred53734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred53736 = new BitSet(new long[]{0xF7B1820000000000L,0x00000006900111FFL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred53738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred53740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred67078 = new BitSet(new long[]{0x0010000000000000L,0x0000000007F00000L});
    public static final BitSet FOLLOW_set_in_synpred67091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred79968 = new BitSet(new long[]{0x0010000000000000L,0x0000000007F00000L});
    public static final BitSet FOLLOW_set_in_synpred79981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred810421 = new BitSet(new long[]{0xC010000000000000L,0x00000000000011FFL});
    public static final BitSet FOLLOW_set_in_synpred810434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred910859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1010879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1111096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1111098 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1111100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1111102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1211131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1211133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1311196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1311198 = new BitSet(new long[]{0xF7B1820000000000L,0x0000000697F111FFL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1311200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1311202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1411231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1411233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1513521 = new BitSet(new long[]{0x37B1820000000000L,0x0000000690010000L});
    public static final BitSet FOLLOW_simple_root_expr_in_synpred1513523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_RB_in_synpred1513525 = new BitSet(new long[]{0x0000000000000002L});

}