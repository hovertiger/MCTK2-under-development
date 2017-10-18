// $ANTLR 3.0.1 /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g 2017-10-18 16:02:36

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NOP", "SPEC_LIST_T", "SUBRANGE_T", "VALUE_T", "SET_LIST_EXP_T", "BLOCK_T", "CASE_LIST_EXPR_T", "CASE_ELEMENT_EXPR_T", "BIT_SELECT_T", "ARRAY_INDEX_T", "TOK_UNARY_MINUS_T", "PURE_CTL_T", "PURE_LTL_T", "PURE_CTL_EPISTEMIC_T", "CTL_KNOW_T", "TOK_CTL_KNOW_T", "TOK_AGENT_NAME_T", "TOK_INVAR_SPEC", "TOK_CTL_SPEC", "TOK_LTL_SPEC", "TOK_CTL_STAR_SPEC", "TOK_IMPLIES", "TOK_IFF", "TOK_OR", "TOK_XOR", "TOK_XNOR", "TOK_AND", "TOK_EQUAL", "TOK_NOTEQUAL", "TOK_LT", "TOK_GT", "TOK_LE", "TOK_GE", "TOK_SETIN", "TOK_UNION", "TOK_LCB", "TOK_RCB", "TOK_COMMA", "TOK_LSHIFT", "TOK_RSHIFT", "TOK_MOD", "TOK_PLUS", "TOK_MINUS", "TOK_TIMES", "TOK_DIVIDE", "TOK_CONCATENATION", "TOK_NOT", "TOK_LP", "TOK_RP", "TOK_BOOL", "TOK_WORD1", "TOK_NEXT", "TOK_CASE", "TOK_ESAC", "TOK_WAREAD", "TOK_WAWRITE", "TOK_EX", "TOK_AX", "TOK_EF", "TOK_AF", "TOK_EG", "TOK_AG", "TOK_EBF", "TOK_ABF", "TOK_EBG", "TOK_ABG", "TOK_AA", "TOK_LB", "TOK_UNTIL", "TOK_RB", "TOK_EE", "TOK_BUNTIL", "TOK_KNOW", "TOK_ATOM", "TOK_SINCE", "TOK_RELEASES", "TOK_TRIGGERED", "TOK_OP_NEXT", "TOK_OP_PREV", "TOK_OP_NOTPREVNOT", "TOK_OP_GLOBALLY", "TOK_OP_HISTORICALLY", "TOK_OP_FINALLY", "TOK_OP_ONCE", "TOK_DOT", "TOK_NUMBER", "TOK_COLON", "TOK_SEMI", "TOK_NUMBER_WORD", "TOK_TWODOTS", "TOK_FALSEEXP", "TOK_TRUEEXP", "TOK_WORD", "TOK_NUMBER_FRAC", "JTOK_WS", "JTOK_MULTI_COMMENT", "JTOK_LINE_COMMENT"
    };
    public static final int TOK_PLUS=45;
    public static final int TOK_RCB=40;
    public static final int CTL_KNOW_T=18;
    public static final int TOK_UNARY_MINUS_T=14;
    public static final int TOK_XOR=28;
    public static final int ARRAY_INDEX_T=13;
    public static final int TOK_ABG=69;
    public static final int TOK_ABF=67;
    public static final int TOK_TIMES=47;
    public static final int TOK_EBG=68;
    public static final int TOK_EBF=66;
    public static final int TOK_LP=51;
    public static final int TOK_LT=33;
    public static final int TOK_COLON=90;
    public static final int JTOK_MULTI_COMMENT=99;
    public static final int TOK_SETIN=37;
    public static final int SPEC_LIST_T=5;
    public static final int TOK_EQUAL=31;
    public static final int TOK_LB=71;
    public static final int TOK_TRUEEXP=95;
    public static final int TOK_BUNTIL=75;
    public static final int TOK_LE=35;
    public static final int TOK_UNTIL=72;
    public static final int TOK_DOT=88;
    public static final int SUBRANGE_T=6;
    public static final int CASE_ELEMENT_EXPR_T=11;
    public static final int TOK_ATOM=77;
    public static final int TOK_XNOR=29;
    public static final int TOK_AG=65;
    public static final int TOK_AF=63;
    public static final int TOK_WAWRITE=59;
    public static final int TOK_RB=73;
    public static final int TOK_OP_ONCE=87;
    public static final int TOK_CTL_KNOW_T=19;
    public static final int TOK_SEMI=91;
    public static final int TOK_AA=70;
    public static final int TOK_NUMBER_FRAC=97;
    public static final int TOK_MINUS=46;
    public static final int TOK_NUMBER_WORD=92;
    public static final int TOK_IMPLIES=25;
    public static final int TOK_KNOW=76;
    public static final int TOK_AX=61;
    public static final int JTOK_WS=98;
    public static final int TOK_OP_GLOBALLY=84;
    public static final int TOK_FALSEEXP=94;
    public static final int TOK_RP=52;
    public static final int VALUE_T=7;
    public static final int TOK_RSHIFT=43;
    public static final int TOK_SINCE=78;
    public static final int TOK_WAREAD=58;
    public static final int TOK_OR=27;
    public static final int TOK_OP_NOTPREVNOT=83;
    public static final int TOK_NOT=50;
    public static final int TOK_OP_PREV=82;
    public static final int BLOCK_T=9;
    public static final int TOK_LSHIFT=42;
    public static final int TOK_AND=30;
    public static final int TOK_GT=34;
    public static final int TOK_TRIGGERED=80;
    public static final int TOK_AGENT_NAME_T=20;
    public static final int TOK_CASE=56;
    public static final int TOK_CTL_STAR_SPEC=24;
    public static final int TOK_IFF=26;
    public static final int TOK_GE=36;
    public static final int SET_LIST_EXP_T=8;
    public static final int CASE_LIST_EXPR_T=10;
    public static final int TOK_TWODOTS=93;
    public static final int NOP=4;
    public static final int TOK_COMMA=41;
    public static final int TOK_UNION=38;
    public static final int TOK_NUMBER=89;
    public static final int TOK_LTL_SPEC=23;
    public static final int TOK_ESAC=57;
    public static final int TOK_LCB=39;
    public static final int TOK_DIVIDE=48;
    public static final int TOK_OP_NEXT=81;
    public static final int PURE_CTL_EPISTEMIC_T=17;
    public static final int TOK_EG=64;
    public static final int TOK_EF=62;
    public static final int PURE_CTL_T=15;
    public static final int TOK_NOTEQUAL=32;
    public static final int BIT_SELECT_T=12;
    public static final int TOK_INVAR_SPEC=21;
    public static final int TOK_EE=74;
    public static final int EOF=-1;
    public static final int TOK_BOOL=53;
    public static final int PURE_LTL_T=16;
    public static final int TOK_OP_FINALLY=86;
    public static final int JTOK_LINE_COMMENT=100;
    public static final int TOK_OP_HISTORICALLY=85;
    public static final int TOK_WORD1=54;
    public static final int TOK_CONCATENATION=49;
    public static final int TOK_NEXT=55;
    public static final int TOK_RELEASES=79;
    public static final int TOK_EX=60;
    public static final int TOK_MOD=44;
    public static final int TOK_WORD=96;
    public static final int TOK_CTL_SPEC=22;

        public SPCParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[126+1];
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:130:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:131:9: ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) )
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
                    new NoViableAltException("130:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:131:11: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF1=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec152); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EOF1_tree = (Object)adaptor.create(EOF1);
                    adaptor.addChild(root_0, EOF1_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:132:11: spec_list EOF
                    {
                    pushFollow(FOLLOW_spec_list_in_spec164);
                    spec_list2=spec_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_spec_list.add(spec_list2.getTree());
                    EOF3=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec166); if (failed) return retval;
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
                    // 134:9: -> ^( SPEC_LIST_T spec_list )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:134:12: ^( SPEC_LIST_T spec_list )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:136:1: spec_list returns [WAArrayOfSpec ret] : f= spec_element (s= spec_element )* ;
    public final spec_list_return spec_list() throws RecognitionException {
        spec_list_return retval = new spec_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        spec_element_return f = null;

        spec_element_return s = null;



        retval.ret = new WAArrayOfSpec(); 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:138:9: (f= spec_element (s= spec_element )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:138:11: f= spec_element (s= spec_element )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_spec_element_in_spec_list230);
            f=spec_element();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if(!er()) retval.ret.specs.add(f.ret); else retval.ret.specs.add(null); in_my_recovery_mode = false; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:139:9: (s= spec_element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=TOK_INVAR_SPEC && LA2_0<=TOK_CTL_STAR_SPEC)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:139:11: s= spec_element
            	    {
            	    pushFollow(FOLLOW_spec_element_in_spec_list246);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:142:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );
    public final spec_element_return spec_element() throws RecognitionException {
        spec_element_return retval = new spec_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        invar_spec_return invar_spec4 = null;

        ctl_spec_return ctl_spec5 = null;

        ltl_spec_return ltl_spec6 = null;

        ctls_spec_return ctls_spec7 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:143:9: ( invar_spec | ctl_spec | ltl_spec | ctls_spec )
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
                    new NoViableAltException("142:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:143:11: invar_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_invar_spec_in_spec_element289);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:144:11: ctl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_spec_in_spec_element303);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:145:11: ltl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_spec_in_spec_element317);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:146:11: ctls_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_spec_in_spec_element331);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:158:1: invar_spec returns [InternalSpec ret] : TOK_INVAR_SPEC simple_root_expr optsemi ;
    public final invar_spec_return invar_spec() throws RecognitionException {
        invar_spec_return retval = new invar_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_INVAR_SPEC8=null;
        simple_root_expr_return simple_root_expr9 = null;

        optsemi_return optsemi10 = null;


        Object TOK_INVAR_SPEC8_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:160:9: ( TOK_INVAR_SPEC simple_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:160:11: TOK_INVAR_SPEC simple_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_INVAR_SPEC8=(Token)input.LT(1);
            match(input,TOK_INVAR_SPEC,FOLLOW_TOK_INVAR_SPEC_in_invar_spec379); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_INVAR_SPEC8_tree = (Object)adaptor.create(TOK_INVAR_SPEC8);
            root_0 = (Object)adaptor.becomeRoot(TOK_INVAR_SPEC8_tree, root_0);
            }
            pushFollow(FOLLOW_simple_root_expr_in_invar_spec382);
            simple_root_expr9=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr9.getTree());
            pushFollow(FOLLOW_optsemi_in_invar_spec384);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:162:1: ctl_spec returns [InternalSpec ret] : TOK_CTL_SPEC ctl_root_expr optsemi ;
    public final ctl_spec_return ctl_spec() throws RecognitionException {
        ctl_spec_return retval = new ctl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_SPEC11=null;
        ctl_root_expr_return ctl_root_expr12 = null;

        optsemi_return optsemi13 = null;


        Object TOK_CTL_SPEC11_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:164:9: ( TOK_CTL_SPEC ctl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:164:11: TOK_CTL_SPEC ctl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_SPEC11=(Token)input.LT(1);
            match(input,TOK_CTL_SPEC,FOLLOW_TOK_CTL_SPEC_in_ctl_spec423); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_SPEC11_tree = (Object)adaptor.create(TOK_CTL_SPEC11);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_SPEC11_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_spec426);
            ctl_root_expr12=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctl_root_expr12.getTree());
            pushFollow(FOLLOW_optsemi_in_ctl_spec428);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:166:1: ltl_spec returns [InternalSpec ret] : TOK_LTL_SPEC ltl_root_expr optsemi ;
    public final ltl_spec_return ltl_spec() throws RecognitionException {
        ltl_spec_return retval = new ltl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LTL_SPEC14=null;
        ltl_root_expr_return ltl_root_expr15 = null;

        optsemi_return optsemi16 = null;


        Object TOK_LTL_SPEC14_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:168:9: ( TOK_LTL_SPEC ltl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:168:11: TOK_LTL_SPEC ltl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_LTL_SPEC14=(Token)input.LT(1);
            match(input,TOK_LTL_SPEC,FOLLOW_TOK_LTL_SPEC_in_ltl_spec467); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_LTL_SPEC14_tree = (Object)adaptor.create(TOK_LTL_SPEC14);
            root_0 = (Object)adaptor.becomeRoot(TOK_LTL_SPEC14_tree, root_0);
            }
            pushFollow(FOLLOW_ltl_root_expr_in_ltl_spec470);
            ltl_root_expr15=ltl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ltl_root_expr15.getTree());
            pushFollow(FOLLOW_optsemi_in_ltl_spec472);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:170:1: ctls_spec returns [InternalSpec ret] : TOK_CTL_STAR_SPEC ctls_root_expr optsemi ;
    public final ctls_spec_return ctls_spec() throws RecognitionException {
        ctls_spec_return retval = new ctls_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_STAR_SPEC17=null;
        ctls_root_expr_return ctls_root_expr18 = null;

        optsemi_return optsemi19 = null;


        Object TOK_CTL_STAR_SPEC17_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:172:9: ( TOK_CTL_STAR_SPEC ctls_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:172:11: TOK_CTL_STAR_SPEC ctls_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_STAR_SPEC17=(Token)input.LT(1);
            match(input,TOK_CTL_STAR_SPEC,FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec511); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_STAR_SPEC17_tree = (Object)adaptor.create(TOK_CTL_STAR_SPEC17);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_STAR_SPEC17_tree, root_0);
            }
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_spec514);
            ctls_root_expr18=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_root_expr18.getTree());
            pushFollow(FOLLOW_optsemi_in_ctls_spec516);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:181:1: simple_root_expr returns [InternalSpec ret] : implies_expr ;
    public final simple_root_expr_return simple_root_expr() throws RecognitionException {
        simple_root_expr_return retval = new simple_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        implies_expr_return implies_expr20 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:182:9: ( implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:182:11: implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_implies_expr_in_simple_root_expr558);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:184:1: implies_expr returns [InternalSpec ret] : f= iff_expr (op= TOK_IMPLIES s= implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:187:9: (f= iff_expr (op= TOK_IMPLIES s= implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:187:11: f= iff_expr (op= TOK_IMPLIES s= implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iff_expr_in_implies_expr602);
            f=iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:188:9: (op= TOK_IMPLIES s= implies_expr )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOK_IMPLIES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:188:11: op= TOK_IMPLIES s= implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_implies_expr618); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_implies_expr_in_implies_expr623);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:192:1: iff_expr returns [InternalSpec ret] : f= or_expr (op= TOK_IFF s= or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:195:9: (f= or_expr (op= TOK_IFF s= or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:195:11: f= or_expr (op= TOK_IFF s= or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_iff_expr689);
            f=or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:196:9: (op= TOK_IFF s= or_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TOK_IFF) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:196:11: op= TOK_IFF s= or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_iff_expr705); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expr_in_iff_expr710);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:200:1: or_expr returns [InternalSpec ret] : f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:203:9: (f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:203:11: f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr775);
            f=and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:204:9: (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:204:11: op= TOK_OR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_or_expr791); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr796);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:206:11: op= TOK_XOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_or_expr820); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr825);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:208:11: op= TOK_XNOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_or_expr849); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr854);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:212:1: and_expr returns [InternalSpec ret] : f= relational_expr (op= TOK_AND s= relational_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:215:9: (f= relational_expr (op= TOK_AND s= relational_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:215:11: f= relational_expr (op= TOK_AND s= relational_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expr_in_and_expr918);
            f=relational_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:216:9: (op= TOK_AND s= relational_expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TOK_AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:216:11: op= TOK_AND s= relational_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_and_expr934); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_relational_expr_in_and_expr939);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:220:1: relational_expr returns [InternalSpec ret] : f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:223:9: (f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:223:11: f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_relational_expr1002);
            f=in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:224:9: (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:224:11: op= TOK_EQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_relational_expr1018); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1023);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:226:11: op= TOK_NOTEQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_relational_expr1048); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1053);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:228:11: op= TOK_LT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_relational_expr1078); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1083);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:230:11: op= TOK_GT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_relational_expr1108); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1113);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:232:11: op= TOK_LE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_relational_expr1138); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1143);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:234:11: op= TOK_GE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_relational_expr1168); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1173);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:238:1: in_expr returns [InternalSpec ret] : f= union_expr (op= TOK_SETIN s= union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:241:9: (f= union_expr (op= TOK_SETIN s= union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:241:11: f= union_expr (op= TOK_SETIN s= union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_in_expr1238);
            f=union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:242:9: (op= TOK_SETIN s= union_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TOK_SETIN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:242:11: op= TOK_SETIN s= union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_in_expr1254); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_union_expr_in_in_expr1259);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:246:1: union_expr returns [InternalSpec ret] : f= set_expr (op= TOK_UNION s= set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:249:9: (f= set_expr (op= TOK_UNION s= set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:249:11: f= set_expr (op= TOK_UNION s= set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_expr_in_union_expr1323);
            f=set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:250:9: (op= TOK_UNION s= set_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TOK_UNION) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:250:11: op= TOK_UNION s= set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_union_expr1339); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_set_expr_in_union_expr1344);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:257:9: ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) )
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

                if ( (LA11_2==TOK_TWODOTS) ) {
                    alt11=2;
                }
                else if ( (LA11_2==EOF||(LA11_2>=TOK_INVAR_SPEC && LA11_2<=TOK_UNION)||(LA11_2>=TOK_RCB && LA11_2<=TOK_CONCATENATION)||LA11_2==TOK_RP||LA11_2==TOK_LB||LA11_2==TOK_RB||LA11_2==TOK_DOT||(LA11_2>=TOK_COLON && LA11_2<=TOK_SEMI)) ) {
                    alt11=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 2, input);

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
                            new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 3, input);

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
                            new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA11_4>=TOK_PLUS && LA11_4<=TOK_MINUS)||(LA11_4>=TOK_NOT && LA11_4<=TOK_LP)||(LA11_4>=TOK_BOOL && LA11_4<=TOK_CASE)||(LA11_4>=TOK_WAREAD && LA11_4<=TOK_WAWRITE)||LA11_4==TOK_ATOM||LA11_4==TOK_NUMBER_WORD||(LA11_4>=TOK_FALSEEXP && LA11_4<=TOK_TRUEEXP)) ) {
                    alt11=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 4, input);

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
                    new NoViableAltException("254:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:257:11: shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_shift_expr_in_set_expr1406);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:259:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_set_expr1428);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:261:11: TOK_LCB set_list_expr TOK_RCB
                    {
                    TOK_LCB23=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_set_expr1451); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB23);

                    pushFollow(FOLLOW_set_list_expr_in_set_expr1453);
                    set_list_expr24=set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_set_list_expr.add(set_list_expr24.getTree());
                    TOK_RCB25=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_set_expr1455); if (failed) return retval;
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
                    // 263:9: -> ^( SET_LIST_EXP_T set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:263:12: ^( SET_LIST_EXP_T set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:265:1: set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final set_list_expr_return set_list_expr() throws RecognitionException {
        set_list_expr_return retval = new set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA27=null;
        simple_root_expr_return simple_root_expr26 = null;

        simple_root_expr_return simple_root_expr28 = null;


        Object TOK_COMMA27_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:266:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:266:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1509);
            simple_root_expr26=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr26.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:266:28: ( TOK_COMMA simple_root_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TOK_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:266:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA27=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_set_list_expr1512); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1515);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:268:1: shift_expr returns [InternalSpec ret] : f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:271:9: (f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:271:11: f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_remainder_expr_in_shift_expr1560);
            f=remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:272:9: (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:272:11: op= TOK_LSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_shift_expr1576); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1581);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:274:11: op= TOK_RSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_shift_expr1605); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1610);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:278:1: remainder_expr returns [InternalSpec ret] : f= additive_expr (op= TOK_MOD s= additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:281:9: (f= additive_expr (op= TOK_MOD s= additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:281:11: f= additive_expr (op= TOK_MOD s= additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expr_in_remainder_expr1673);
            f=additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:282:9: (op= TOK_MOD s= additive_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TOK_MOD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:282:11: op= TOK_MOD s= additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_remainder_expr1689); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additive_expr_in_remainder_expr1694);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:286:1: additive_expr returns [InternalSpec ret] : f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:289:9: (f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:289:11: f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1757);
            f=multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:290:9: (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:290:11: op= TOK_PLUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_additive_expr1773); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1778);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:292:11: op= TOK_MINUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_additive_expr1802); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1807);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:296:1: multiplicative_expr returns [InternalSpec ret] : f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:299:9: (f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:299:11: f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1869);
            f=concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:300:9: (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:300:11: op= TOK_TIMES s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_multiplicative_expr1885); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1890);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:302:11: op= TOK_DIVIDE s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_multiplicative_expr1914); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1919);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:306:1: concatination_expr returns [InternalSpec ret] : f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:309:9: (f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:309:11: f= primary_expr (op= TOK_CONCATENATION s= primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_expr_in_concatination_expr1981);
            f=primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:310:9: (op= TOK_CONCATENATION s= primary_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TOK_CONCATENATION) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:310:11: op= TOK_CONCATENATION s= primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_concatination_expr1997); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_primary_expr_in_concatination_expr2002);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:315:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:318:9: ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) )
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
                    new NoViableAltException("315:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:318:11: primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_in_primary_expr2072);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:322:11: op= TOK_MINUS v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_primary_expr2114); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2118);
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
                    // 324:9: -> ^( TOK_UNARY_MINUS_T primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:324:12: ^( TOK_UNARY_MINUS_T primary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:325:11: op= TOK_NOT v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_primary_expr2158); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2162);
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
                    // 327:9: -> ^( TOK_NOT primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:327:12: ^( TOK_NOT primary_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:330:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:333:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) )
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
                    new NoViableAltException("330:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:333:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr_helper12227);
                    constant30=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant30.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12229);
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
                    // 335:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:335:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:336:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12271);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:341:11: TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP33=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12304); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP33);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12306);
                    simple_root_expr34=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr34.getTree());
                    TOK_RP35=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12308); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP35);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12310);
                    primary_expr_select36=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select36.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:9: -> ^( BLOCK_T simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:343:12: ^( BLOCK_T simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:344:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL37=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_primary_expr_helper12352); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL37);

                    TOK_LP38=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12355); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP38);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12357);
                    simple_root_expr39=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr39.getTree());
                    TOK_RP40=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12359); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP40);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12361);
                    primary_expr_select41=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select41.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_BOOL, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:346:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:347:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD142=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_primary_expr_helper12404); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD142);

                    TOK_LP43=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12406); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP43);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12408);
                    simple_root_expr44=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr44.getTree());
                    TOK_RP45=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12410); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP45);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12412);
                    primary_expr_select46=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select46.getTree());
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
                    // 349:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:349:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:350:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT47=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_primary_expr_helper12454); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT47);

                    TOK_LP48=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12456); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP48);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12458);
                    simple_root_expr49=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr49.getTree());
                    TOK_RP50=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12460); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP50);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12462);
                    primary_expr_select51=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select51.getTree());
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
                    // 352:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:352:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:353:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE52=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_primary_expr_helper12504); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE52);

                    pushFollow(FOLLOW_case_element_list_expr_in_primary_expr_helper12506);
                    case_element_list_expr53=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr53.getTree());
                    TOK_ESAC54=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_primary_expr_helper12508); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC54);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12510);
                    primary_expr_select55=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select55.getTree());
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
                    // 355:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:355:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:356:11: TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD56=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_primary_expr_helper12552); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD56);

                    TOK_LP57=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12554); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP57);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12556);
                    simple_root_expr58=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr58.getTree());
                    TOK_COMMA59=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12558); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA59);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12560);
                    simple_root_expr60=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr60.getTree());
                    TOK_RP61=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12562); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP61);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12564);
                    primary_expr_select62=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select62.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, primary_expr_select, TOK_WAREAD, simple_root_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:9: -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:358:12: ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:359:11: TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE63=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_primary_expr_helper12608); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE63);

                    TOK_LP64=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12610); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP64);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12612);
                    simple_root_expr65=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr65.getTree());
                    TOK_COMMA66=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12614); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA66);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12616);
                    simple_root_expr67=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr67.getTree());
                    TOK_COMMA68=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12618); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA68);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12620);
                    simple_root_expr69=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr69.getTree());
                    TOK_RP70=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12622); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP70);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12624);
                    primary_expr_select71=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select71.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, TOK_WAWRITE, simple_root_expr, simple_root_expr, primary_expr_select
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:9: -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:361:12: ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:367:1: ctl_root_expr returns [InternalSpec ret] : ctl_implies_expr ;
    public final ctl_root_expr_return ctl_root_expr() throws RecognitionException {
        ctl_root_expr_return retval = new ctl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctl_implies_expr_return ctl_implies_expr72 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:368:9: ( ctl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:368:11: ctl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_implies_expr_in_ctl_root_expr2692);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:370:1: ctl_implies_expr returns [InternalSpec ret] : f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:373:9: (f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:373:11: f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_iff_expr_in_ctl_implies_expr2735);
            f=ctl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:374:9: (op= TOK_IMPLIES s= ctl_implies_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TOK_IMPLIES) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:374:11: op= TOK_IMPLIES s= ctl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2751); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_implies_expr_in_ctl_implies_expr2756);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:378:1: ctl_iff_expr returns [InternalSpec ret] : f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:381:9: (f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:381:11: f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2821);
            f=ctl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:382:9: (op= TOK_IFF s= ctl_or_expr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TOK_IFF) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:382:11: op= TOK_IFF s= ctl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctl_iff_expr2837); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2842);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:386:1: ctl_or_expr returns [InternalSpec ret] : f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:389:9: (f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:389:11: f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2906);
            f=ctl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:390:9: (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:390:11: op= TOK_OR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctl_or_expr2922); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2927);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:392:11: op= TOK_XOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctl_or_expr2951); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2956);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:394:11: op= TOK_XNOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctl_or_expr2980); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2985);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:398:1: ctl_and_expr returns [InternalSpec ret] : f= ctl_expr (op= TOK_AND s= ctl_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:401:9: (f= ctl_expr (op= TOK_AND s= ctl_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:401:11: f= ctl_expr (op= TOK_AND s= ctl_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3048);
            f=ctl_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:402:9: (op= TOK_AND s= ctl_expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TOK_AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:402:11: op= TOK_AND s= ctl_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctl_and_expr3064); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3069);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:406:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );
    public final ctl_expr_return ctl_expr() throws RecognitionException {
        ctl_expr_return retval = new ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        pure_ctl_expr_return pure_ctl_expr73 = null;

        ctl_relational_expr_return ctl_relational_expr74 = null;


        RewriteRuleSubtreeStream stream_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr )
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
                            new NoViableAltException("406:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 15, input);

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
                        new NoViableAltException("406:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==TOK_LCB||(LA24_0>=TOK_PLUS && LA24_0<=TOK_MINUS)||LA24_0==TOK_LP||(LA24_0>=TOK_BOOL && LA24_0<=TOK_CASE)||(LA24_0>=TOK_WAREAD && LA24_0<=TOK_WAWRITE)||LA24_0==TOK_ATOM||LA24_0==TOK_NUMBER||LA24_0==TOK_NUMBER_WORD||(LA24_0>=TOK_FALSEEXP && LA24_0<=TOK_TRUEEXP)) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("406:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr
                    {
                    pushFollow(FOLLOW_pure_ctl_expr_in_ctl_expr3297);
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
                    // 421:11: -> ^( PURE_CTL_T pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:421:14: ^( PURE_CTL_T pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:422:11: ctl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_relational_expr_in_ctl_expr3337);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:458:9: (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr )
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
                            new NoViableAltException("455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 7, input);

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
                            new NoViableAltException("455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 15, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 8, input);

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
                    new NoViableAltException("455:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:458:11: op= TOK_EX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_pure_ctl_expr3403); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3408);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:460:11: op= TOK_AX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_pure_ctl_expr3432); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3437);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:462:11: op= TOK_EF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_pure_ctl_expr3461); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3466);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:464:11: op= TOK_AF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_pure_ctl_expr3490); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3495);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:466:11: op= TOK_EG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_pure_ctl_expr3519); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3524);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:468:11: op= TOK_AG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_pure_ctl_expr3548); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3553);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:478:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_au_in_pure_ctl_expr3659);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:479:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_abu_in_pure_ctl_expr3685);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_eu_in_pure_ctl_expr3711);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_ebu_in_pure_ctl_expr3737);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:482:11: op= TOK_EBF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_pure_ctl_expr3753); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3758);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3762);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:484:11: op= TOK_ABF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_pure_ctl_expr3786); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3791);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3795);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:486:11: op= TOK_EBG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_pure_ctl_expr3819); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3824);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3828);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:488:11: op= TOK_ABG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_pure_ctl_expr3852); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3857);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3861);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:491:11: op= TOK_NOT fp= pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_pure_ctl_expr3895); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_pure_ctl_expr_in_pure_ctl_expr3900);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:494:1: ctl_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:497:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:497:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_au3954); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_au3959); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3964);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_au3968); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au3972);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_au3976); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:500:1: ctl_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:503:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:503:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_eu4031); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_eu4036); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4041);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_eu4045); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4049);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_eu4053); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:506:1: ctl_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:509:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:509:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_abu4108); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_abu4113); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4118);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_abu4122); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_abu4126);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4130);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_abu4134); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:512:1: ctl_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:515:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:515:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_ebu4189); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_ebu4194); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4199);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_ebu4203); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_ebu4207);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4211);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_ebu4215); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:519:1: ctl_relational_expr returns [InternalSpec ret] : f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:522:9: (f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:522:11: f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4276);
            f=ctl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:523:9: (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:523:11: op= TOK_EQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctl_relational_expr4292); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4297);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:525:11: op= TOK_NOTEQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4322); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4327);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:527:11: op= TOK_LT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctl_relational_expr4352); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4357);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:529:11: op= TOK_GT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctl_relational_expr4382); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4387);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:531:11: op= TOK_LE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctl_relational_expr4412); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4417);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:533:11: op= TOK_GE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctl_relational_expr4442); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4447);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:537:1: ctl_in_expr returns [InternalSpec ret] : f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:540:9: (f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:540:11: f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4511);
            f=ctl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:541:9: (op= TOK_SETIN s= ctl_union_expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==TOK_SETIN) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:541:11: op= TOK_SETIN s= ctl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctl_in_expr4527); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4532);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:545:1: ctl_union_expr returns [InternalSpec ret] : f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:548:9: (f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:548:11: f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4595);
            f=ctl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:549:9: (op= TOK_UNION s= ctl_set_expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==TOK_UNION) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:549:11: op= TOK_UNION s= ctl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctl_union_expr4611); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4616);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:556:9: ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) )
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
                        new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 2, input);

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
                            new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 3, input);

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
                            new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA29_4>=TOK_PLUS && LA29_4<=TOK_MINUS)||(LA29_4>=TOK_NOT && LA29_4<=TOK_LP)||(LA29_4>=TOK_BOOL && LA29_4<=TOK_CASE)||(LA29_4>=TOK_WAREAD && LA29_4<=TOK_WAWRITE)||LA29_4==TOK_ATOM||LA29_4==TOK_NUMBER_WORD||(LA29_4>=TOK_FALSEEXP && LA29_4<=TOK_TRUEEXP)) ) {
                    alt29=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 4, input);

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
                    new NoViableAltException("553:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:556:11: ctl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_shift_expr_in_ctl_set_expr4677);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:558:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctl_set_expr4699);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:560:11: TOK_LCB ctl_set_list_expr TOK_RCB
                    {
                    TOK_LCB81=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctl_set_expr4722); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB81);

                    pushFollow(FOLLOW_ctl_set_list_expr_in_ctl_set_expr4724);
                    ctl_set_list_expr82=ctl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_set_list_expr.add(ctl_set_list_expr82.getTree());
                    TOK_RCB83=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctl_set_expr4726); if (failed) return retval;
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
                    // 562:9: -> ^( SET_LIST_EXP_T ctl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:562:12: ^( SET_LIST_EXP_T ctl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:564:1: ctl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctl_set_list_expr_return ctl_set_list_expr() throws RecognitionException {
        ctl_set_list_expr_return retval = new ctl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA85=null;
        simple_root_expr_return simple_root_expr84 = null;

        simple_root_expr_return simple_root_expr86 = null;


        Object TOK_COMMA85_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:565:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:565:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4779);
            simple_root_expr84=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr84.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:565:28: ( TOK_COMMA simple_root_expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==TOK_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:565:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA85=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_set_list_expr4782); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4785);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:1: ctl_shift_expr returns [InternalSpec ret] : f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:570:9: (f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:570:11: f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4831);
            f=ctl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:571:9: (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:571:11: op= TOK_LSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4847); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4852);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:573:11: op= TOK_RSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4876); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4881);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:577:1: ctl_remainder_expr returns [InternalSpec ret] : f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:580:9: (f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:580:11: f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4943);
            f=ctl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:581:9: (op= TOK_MOD s= ctl_additive_expr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TOK_MOD) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:581:11: op= TOK_MOD s= ctl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctl_remainder_expr4959); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4964);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:587:1: ctl_additive_expr returns [InternalSpec ret] : f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:590:9: (f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:590:11: f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5028);
            f=ctl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:591:9: (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:591:11: op= TOK_PLUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctl_additive_expr5044); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5049);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:593:11: op= TOK_MINUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_additive_expr5073); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5078);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:597:1: ctl_multiplicative_expr returns [InternalSpec ret] : f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:600:9: (f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:600:11: f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5139);
            f=ctl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:601:9: (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:601:11: op= TOK_TIMES s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5155); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5160);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:603:11: op= TOK_DIVIDE s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5184); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5189);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:607:1: ctl_concatination_expr returns [InternalSpec ret] : f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:610:9: (f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:610:11: f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5250);
            f=ctl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:611:9: (op= TOK_CONCATENATION s= ctl_primary_expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==TOK_CONCATENATION) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:611:11: op= TOK_CONCATENATION s= ctl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5266); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5271);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:616:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:619:9: ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("616:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:619:11: ctl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5340);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:621:11: op= TOK_MINUS v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_primary_expr5364); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5368);
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
                    // 623:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:623:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:624:11: op= TOK_NOT v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctl_primary_expr5409); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5413);
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
                    // 626:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:626:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:629:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctl_primary_expr_helper1_return ctl_primary_expr_helper1() throws RecognitionException {
        ctl_primary_expr_helper1_return retval = new ctl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP93=null;
        Token TOK_RP95=null;
        Token TOK_BOOL97=null;
        Token TOK_LP98=null;
        Token TOK_RP100=null;
        Token TOK_WORD1102=null;
        Token TOK_LP103=null;
        Token TOK_RP105=null;
        Token TOK_NEXT107=null;
        Token TOK_LP108=null;
        Token TOK_RP110=null;
        Token TOK_CASE112=null;
        Token TOK_ESAC114=null;
        Token TOK_WAREAD116=null;
        Token TOK_LP117=null;
        Token TOK_COMMA118=null;
        Token TOK_RP119=null;
        Token TOK_WAWRITE121=null;
        Token TOK_LP122=null;
        Token TOK_RP123=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant88 = null;

        primary_expr_select_return primary_expr_select89 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer190 = null;

        ctl_know_return ctl_know91 = null;

        primary_expr_select_return primary_expr_select92 = null;

        ctl_root_expr_return ctl_root_expr94 = null;

        primary_expr_select_return primary_expr_select96 = null;

        simple_root_expr_return simple_root_expr99 = null;

        primary_expr_select_return primary_expr_select101 = null;

        simple_root_expr_return simple_root_expr104 = null;

        primary_expr_select_return primary_expr_select106 = null;

        simple_root_expr_return simple_root_expr109 = null;

        primary_expr_select_return primary_expr_select111 = null;

        case_element_list_expr_return case_element_list_expr113 = null;

        primary_expr_select_return primary_expr_select115 = null;

        primary_expr_select_return primary_expr_select120 = null;

        primary_expr_select_return primary_expr_select124 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP93_tree=null;
        Object TOK_RP95_tree=null;
        Object TOK_BOOL97_tree=null;
        Object TOK_LP98_tree=null;
        Object TOK_RP100_tree=null;
        Object TOK_WORD1102_tree=null;
        Object TOK_LP103_tree=null;
        Object TOK_RP105_tree=null;
        Object TOK_NEXT107_tree=null;
        Object TOK_LP108_tree=null;
        Object TOK_RP110_tree=null;
        Object TOK_CASE112_tree=null;
        Object TOK_ESAC114_tree=null;
        Object TOK_WAREAD116_tree=null;
        Object TOK_LP117_tree=null;
        Object TOK_COMMA118_tree=null;
        Object TOK_RP119_tree=null;
        Object TOK_WAWRITE121_tree=null;
        Object TOK_LP122_tree=null;
        Object TOK_RP123_tree=null;
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
        RewriteRuleSubtreeStream stream_ctl_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_root_expr");
        RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:632:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt37=10;
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
                    alt37=4;
                }
                else if ( (LA37_3==TOK_ATOM) ) {
                    int LA37_11 = input.LA(3);

                    if ( ((LA37_11>=TOK_IMPLIES && LA37_11<=TOK_UNION)||(LA37_11>=TOK_LSHIFT && LA37_11<=TOK_CONCATENATION)||LA37_11==TOK_RP||LA37_11==TOK_LB||LA37_11==TOK_DOT) ) {
                        alt37=4;
                    }
                    else if ( (LA37_11==TOK_KNOW) ) {
                        alt37=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("629:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("629:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_BOOL:
                {
                alt37=5;
                }
                break;
            case TOK_WORD1:
                {
                alt37=6;
                }
                break;
            case TOK_NEXT:
                {
                alt37=7;
                }
                break;
            case TOK_CASE:
                {
                alt37=8;
                }
                break;
            case TOK_WAREAD:
                {
                alt37=9;
                }
                break;
            case TOK_WAWRITE:
                {
                alt37=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("629:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:632:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctl_primary_expr_helper15478);
                    constant88=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant88.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15480);
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
                    // 635:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:635:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:636:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15531);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:643:11: ctl_know primary_expr_select
                    {
                    pushFollow(FOLLOW_ctl_know_in_ctl_primary_expr_helper15574);
                    ctl_know91=ctl_know();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_know.add(ctl_know91.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15576);
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
                    // 645:9: -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:645:12: ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:649:11: TOK_LP ctl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP93=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15630); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP93);

                    pushFollow(FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15632);
                    ctl_root_expr94=ctl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_root_expr.add(ctl_root_expr94.getTree());
                    TOK_RP95=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15634); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP95);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15636);
                    primary_expr_select96=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select96.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_root_expr94.ret; 
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
                    // 651:9: -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:651:12: ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
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
                case 5 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:655:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL97=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15707); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL97);

                    TOK_LP98=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15709); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP98);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15711);
                    simple_root_expr99=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr99.getTree());
                    TOK_RP100=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15713); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP100);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15715);
                    primary_expr_select101=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select101.getTree());
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
                    // 658:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:658:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:659:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1102=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15766); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1102);

                    TOK_LP103=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15768); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP103);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15770);
                    simple_root_expr104=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr104.getTree());
                    TOK_RP105=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15772); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP105);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15774);
                    primary_expr_select106=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select106.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, TOK_WORD1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 662:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:662:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:664:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT107=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15834); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT107);

                    TOK_LP108=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15836); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP108);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15838);
                    simple_root_expr109=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr109.getTree());
                    TOK_RP110=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15840); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP110);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15842);
                    primary_expr_select111=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select111.getTree());
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
                    // 667:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:667:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:669:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE112=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15902); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE112);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15904);
                    case_element_list_expr113=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr113.getTree());
                    TOK_ESAC114=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15906); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC114);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15908);
                    primary_expr_select115=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select115.getTree());
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
                    // 672:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:672:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:674:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD116=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper15968); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD116);

                    TOK_LP117=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15970); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP117);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15974);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA118=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper15976); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA118);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15980);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP119=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15982); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP119);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15984);
                    primary_expr_select120=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select120.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_WAREAD, s, f
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
                    // 677:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:677:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:679:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE121=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16048); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE121);

                    TOK_LP122=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16050); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP122);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16054);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16058); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16062);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16066); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16070);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP123=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16072); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP123);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16074);
                    primary_expr_select124=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select124.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, f, m, s, primary_expr_select
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
                    // 682:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:682:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:685:1: ctl_know returns [InternalSpec ret] : TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP ;
    public final ctl_know_return ctl_know() throws RecognitionException {
        ctl_know_return retval = new ctl_know_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token opk=null;
        Token TOK_LP125=null;
        Token TOK_RP126=null;
        agent_name_return agent = null;

        ctl_root_expr_return f = null;


        Object opk_tree=null;
        Object TOK_LP125_tree=null;
        Object TOK_RP126_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:688:9: ( TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:688:11: TOK_LP agent= agent_name opk= TOK_KNOW f= ctl_root_expr TOK_RP
            {
            root_0 = (Object)adaptor.nil();

            TOK_LP125=(Token)input.LT(1);
            match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_know6163); if (failed) return retval;
            pushFollow(FOLLOW_agent_name_in_ctl_know6168);
            agent=agent_name();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
            opk=(Token)input.LT(1);
            match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ctl_know6172); if (failed) return retval;
            if ( backtracking==0 ) {
            opk_tree = (Object)adaptor.create(opk);
            root_0 = (Object)adaptor.becomeRoot(opk_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_know6177);
            f=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            TOK_RP126=(Token)input.LT(1);
            match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_know6179); if (failed) return retval;
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

    public static class agent_name_return extends ParserRuleReturnScope {
        public InternalSpecAgentIdentifier ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start agent_name
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:704:1: agent_name returns [InternalSpecAgentIdentifier ret] : agentName= TOK_ATOM ;
    public final agent_name_return agent_name() throws RecognitionException {
        agent_name_return retval = new agent_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token agentName=null;

        Object agentName_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:706:9: (agentName= TOK_ATOM )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:706:11: agentName= TOK_ATOM
            {
            root_0 = (Object)adaptor.nil();

            agentName=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_agent_name6250); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:713:1: ltl_root_expr returns [InternalSpec ret] : ltl_implies_expr ;
    public final ltl_root_expr_return ltl_root_expr() throws RecognitionException {
        ltl_root_expr_return retval = new ltl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_implies_expr_return ltl_implies_expr127 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:714:9: ( ltl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:714:11: ltl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_implies_expr_in_ltl_root_expr6299);
            ltl_implies_expr127=ltl_implies_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ltl_implies_expr127.getTree());
            if ( backtracking==0 ) {
              if(!er()) retval.ret = ltl_implies_expr127.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:716:1: ltl_implies_expr returns [InternalSpec ret] : f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:719:9: (f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:719:11: f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_iff_expr_in_ltl_implies_expr6342);
            f=ltl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:720:9: (op= TOK_IMPLIES s= ltl_implies_expr )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TOK_IMPLIES) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:720:11: op= TOK_IMPLIES s= ltl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6358); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_implies_expr_in_ltl_implies_expr6363);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:724:1: ltl_iff_expr returns [InternalSpec ret] : f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:727:9: (f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:727:11: f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6428);
            f=ltl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:728:9: (op= TOK_IFF s= ltl_or_expr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==TOK_IFF) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:728:11: op= TOK_IFF s= ltl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ltl_iff_expr6444); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6449);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:732:1: ltl_or_expr returns [InternalSpec ret] : f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:735:9: (f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:735:11: f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6513);
            f=ltl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:736:9: (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:736:11: op= TOK_OR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ltl_or_expr6529); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6534);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:738:11: op= TOK_XOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ltl_or_expr6558); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6563);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:740:11: op= TOK_XNOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ltl_or_expr6587); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6592);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:744:1: ltl_and_expr returns [InternalSpec ret] : f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:747:9: (f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:747:11: f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6655);
            f=ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:748:9: (op= TOK_AND s= ltl_binary_expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==TOK_AND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:748:11: op= TOK_AND s= ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ltl_and_expr6671); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6676);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:754:1: ltl_binary_expr returns [InternalSpec ret] : f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:757:9: (f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:757:11: f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6741);
            f=ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:758:9: (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:758:11: op= TOK_UNTIL s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ltl_binary_expr6757); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6762);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:760:11: op= TOK_SINCE s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ltl_binary_expr6787); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6792);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:762:11: op= TOK_RELEASES s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ltl_binary_expr6817); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6822);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:764:11: op= TOK_TRIGGERED s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6847); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6852);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:767:11: op= TOK_KNOW s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ltl_binary_expr6885); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6890);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:771:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );
    public final ltl_unary_expr_return ltl_unary_expr() throws RecognitionException {
        ltl_unary_expr_return retval = new ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_pure_unary_expr_return ltl_pure_unary_expr128 = null;

        ltl_relational_expr_return ltl_relational_expr129 = null;


        RewriteRuleSubtreeStream stream_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr )
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
                            new NoViableAltException("771:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 10, input);

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
                        new NoViableAltException("771:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==TOK_LCB||(LA43_0>=TOK_PLUS && LA43_0<=TOK_MINUS)||LA43_0==TOK_LP||(LA43_0>=TOK_BOOL && LA43_0<=TOK_CASE)||(LA43_0>=TOK_WAREAD && LA43_0<=TOK_WAWRITE)||LA43_0==TOK_ATOM||LA43_0==TOK_NUMBER||LA43_0==TOK_NUMBER_WORD||(LA43_0>=TOK_FALSEEXP && LA43_0<=TOK_TRUEEXP)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("771:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7042);
                    ltl_pure_unary_expr128=ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_pure_unary_expr.add(ltl_pure_unary_expr128.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_pure_unary_expr128.ret; 
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
                    // 781:9: -> ^( PURE_LTL_T ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:781:12: ^( PURE_LTL_T ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:782:11: ltl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_relational_expr_in_ltl_unary_expr7083);
                    ltl_relational_expr129=ltl_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_relational_expr129.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_relational_expr129.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:785:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:9: (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr )
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
                    new NoViableAltException("785:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:11: op= TOK_OP_NEXT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7135); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7140);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:790:11: op= TOK_OP_PREV f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7164); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7169);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:792:11: op= TOK_OP_NOTPREVNOT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7193); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7198);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:794:11: op= TOK_OP_GLOBALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7222); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7227);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:796:11: op= TOK_OP_HISTORICALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7251); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7256);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:798:11: op= TOK_OP_FINALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7280); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7285);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:800:11: op= TOK_OP_ONCE f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7309); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7314);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:803:11: op= TOK_NOT fp= ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7348); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7353);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:807:1: ltl_relational_expr returns [InternalSpec ret] : f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:810:9: (f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:810:11: f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7405);
            f=ltl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:811:9: (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:811:11: op= TOK_EQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ltl_relational_expr7421); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7426);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:813:11: op= TOK_NOTEQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7451); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7456);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:815:11: op= TOK_LT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ltl_relational_expr7481); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7486);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:817:11: op= TOK_GT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ltl_relational_expr7511); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7516);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:819:11: op= TOK_LE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ltl_relational_expr7541); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7546);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:821:11: op= TOK_GE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ltl_relational_expr7571); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7576);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:825:1: ltl_in_expr returns [InternalSpec ret] : f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:828:9: (f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:828:11: f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7640);
            f=ltl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:829:9: (op= TOK_SETIN s= ltl_union_expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==TOK_SETIN) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:829:11: op= TOK_SETIN s= ltl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ltl_in_expr7656); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7661);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:833:1: ltl_union_expr returns [InternalSpec ret] : f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:836:9: (f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:836:11: f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7724);
            f=ltl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:837:9: (op= TOK_UNION s= ltl_set_expr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==TOK_UNION) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:837:11: op= TOK_UNION s= ltl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ltl_union_expr7740); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7745);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );
    public final ltl_set_expr_return ltl_set_expr() throws RecognitionException {
        ltl_set_expr_return retval = new ltl_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB132=null;
        Token TOK_RCB134=null;
        ltl_shift_expr_return ltl_shift_expr130 = null;

        subrange_return subrange131 = null;

        ltl_set_list_expr_return ltl_set_list_expr133 = null;


        Object TOK_LCB132_tree=null;
        Object TOK_RCB134_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ltl_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:844:9: ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) )
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
                        new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 2, input);

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
                            new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 3, input);

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
                            new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_4>=TOK_PLUS && LA48_4<=TOK_MINUS)||(LA48_4>=TOK_NOT && LA48_4<=TOK_LP)||(LA48_4>=TOK_BOOL && LA48_4<=TOK_CASE)||(LA48_4>=TOK_WAREAD && LA48_4<=TOK_WAWRITE)||LA48_4==TOK_ATOM||LA48_4==TOK_NUMBER_WORD||(LA48_4>=TOK_FALSEEXP && LA48_4<=TOK_TRUEEXP)) ) {
                    alt48=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 4, input);

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
                    new NoViableAltException("841:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:844:11: ltl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_shift_expr_in_ltl_set_expr7806);
                    ltl_shift_expr130=ltl_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_shift_expr130.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_shift_expr130.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:846:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ltl_set_expr7828);
                    subrange131=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange131.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange131.start,subrange131.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:848:11: TOK_LCB ltl_set_list_expr TOK_RCB
                    {
                    TOK_LCB132=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ltl_set_expr7851); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB132);

                    pushFollow(FOLLOW_ltl_set_list_expr_in_ltl_set_expr7853);
                    ltl_set_list_expr133=ltl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_set_list_expr.add(ltl_set_list_expr133.getTree());
                    TOK_RCB134=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ltl_set_expr7855); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB134);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB132.getText() + " " + input.toString(ltl_set_list_expr133.start,ltl_set_list_expr133.stop) + " " + TOK_RCB134.getText()); 
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
                    // 850:9: -> ^( SET_LIST_EXP_T ltl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:850:12: ^( SET_LIST_EXP_T ltl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:852:1: ltl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ltl_set_list_expr_return ltl_set_list_expr() throws RecognitionException {
        ltl_set_list_expr_return retval = new ltl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA136=null;
        simple_root_expr_return simple_root_expr135 = null;

        simple_root_expr_return simple_root_expr137 = null;


        Object TOK_COMMA136_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr7908);
            simple_root_expr135=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr135.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:28: ( TOK_COMMA simple_root_expr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==TOK_COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:853:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA136=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_set_list_expr7911); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr7914);
            	    simple_root_expr137=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr137.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:855:1: ltl_shift_expr returns [InternalSpec ret] : f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:858:9: (f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:858:11: f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7960);
            f=ltl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:859:9: (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:859:11: op= TOK_LSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ltl_shift_expr7976); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7981);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:861:11: op= TOK_RSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8005); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8010);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:865:1: ltl_remainder_expr returns [InternalSpec ret] : f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:868:9: (f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:868:11: f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8072);
            f=ltl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:9: (op= TOK_MOD s= ltl_additive_expr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==TOK_MOD) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:11: op= TOK_MOD s= ltl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ltl_remainder_expr8088); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8093);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:875:1: ltl_additive_expr returns [InternalSpec ret] : f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:878:9: (f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:878:11: f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8157);
            f=ltl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:879:9: (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:879:11: op= TOK_PLUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ltl_additive_expr8173); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8178);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:881:11: op= TOK_MINUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_additive_expr8202); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8207);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:885:1: ltl_multiplicative_expr returns [InternalSpec ret] : f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:888:9: (f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:888:11: f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8268);
            f=ltl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:889:9: (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:889:11: op= TOK_TIMES s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8284); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8289);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:891:11: op= TOK_DIVIDE s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8313); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8318);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:895:1: ltl_concatination_expr returns [InternalSpec ret] : f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:898:9: (f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:898:11: f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8379);
            f=ltl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:899:9: (op= TOK_CONCATENATION s= ltl_primary_expr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==TOK_CONCATENATION) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:899:11: op= TOK_CONCATENATION s= ltl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8395); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8400);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:904:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );
    public final ltl_primary_expr_return ltl_primary_expr() throws RecognitionException {
        ltl_primary_expr_return retval = new ltl_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ltl_primary_expr_return v = null;

        ltl_primary_expr_helper1_return ltl_primary_expr_helper1138 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ltl_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:907:9: ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("904:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:907:11: ltl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8461);
                    ltl_primary_expr_helper1138=ltl_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_primary_expr_helper1138.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_primary_expr_helper1138.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:909:11: op= TOK_MINUS v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_primary_expr8485); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8489);
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
                    // 911:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:911:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:912:11: op= TOK_NOT v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_primary_expr8530); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8534);
                    v=ltl_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_primary_expr.add(v.getTree());
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
                    // 914:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:914:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:917:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ltl_primary_expr_helper1_return ltl_primary_expr_helper1() throws RecognitionException {
        ltl_primary_expr_helper1_return retval = new ltl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP142=null;
        Token TOK_RP144=null;
        Token TOK_BOOL146=null;
        Token TOK_LP147=null;
        Token TOK_RP149=null;
        Token TOK_WORD1151=null;
        Token TOK_LP152=null;
        Token TOK_RP154=null;
        Token TOK_NEXT156=null;
        Token TOK_LP157=null;
        Token TOK_RP159=null;
        Token TOK_CASE161=null;
        Token TOK_ESAC163=null;
        Token TOK_WAREAD165=null;
        Token TOK_LP166=null;
        Token TOK_COMMA167=null;
        Token TOK_RP168=null;
        Token TOK_WAWRITE170=null;
        Token TOK_LP171=null;
        Token TOK_RP172=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant139 = null;

        primary_expr_select_return primary_expr_select140 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1141 = null;

        ltl_root_expr_return ltl_root_expr143 = null;

        primary_expr_select_return primary_expr_select145 = null;

        simple_root_expr_return simple_root_expr148 = null;

        primary_expr_select_return primary_expr_select150 = null;

        simple_root_expr_return simple_root_expr153 = null;

        primary_expr_select_return primary_expr_select155 = null;

        simple_root_expr_return simple_root_expr158 = null;

        primary_expr_select_return primary_expr_select160 = null;

        case_element_list_expr_return case_element_list_expr162 = null;

        primary_expr_select_return primary_expr_select164 = null;

        primary_expr_select_return primary_expr_select169 = null;

        primary_expr_select_return primary_expr_select173 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP142_tree=null;
        Object TOK_RP144_tree=null;
        Object TOK_BOOL146_tree=null;
        Object TOK_LP147_tree=null;
        Object TOK_RP149_tree=null;
        Object TOK_WORD1151_tree=null;
        Object TOK_LP152_tree=null;
        Object TOK_RP154_tree=null;
        Object TOK_NEXT156_tree=null;
        Object TOK_LP157_tree=null;
        Object TOK_RP159_tree=null;
        Object TOK_CASE161_tree=null;
        Object TOK_ESAC163_tree=null;
        Object TOK_WAREAD165_tree=null;
        Object TOK_LP166_tree=null;
        Object TOK_COMMA167_tree=null;
        Object TOK_RP168_tree=null;
        Object TOK_WAWRITE170_tree=null;
        Object TOK_LP171_tree=null;
        Object TOK_RP172_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:920:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
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
                    new NoViableAltException("917:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:920:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ltl_primary_expr_helper18599);
                    constant139=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant139.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18601);
                    primary_expr_select140=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select140.getTree());
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
                    // 923:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:923:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:924:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18652);
                    primary_expr_helper1_pointer1141=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1141.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:933:11: TOK_LP ltl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP142=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18705); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP142);

                    pushFollow(FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18707);
                    ltl_root_expr143=ltl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_root_expr.add(ltl_root_expr143.getTree());
                    TOK_RP144=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18709); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP144);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18711);
                    primary_expr_select145=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select145.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_root_expr143.ret; 
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
                    // 935:9: -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:935:12: ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:939:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL146=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18782); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL146);

                    TOK_LP147=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18784); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP147);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18786);
                    simple_root_expr148=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr148.getTree());
                    TOK_RP149=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18788); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP149);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18790);
                    primary_expr_select150=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select150.getTree());
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
                    // 942:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:942:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:943:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1151=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18841); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1151);

                    TOK_LP152=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18843); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP152);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18845);
                    simple_root_expr153=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr153.getTree());
                    TOK_RP154=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18847); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP154);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18849);
                    primary_expr_select155=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select155.getTree());
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
                    // 946:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:946:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:948:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT156=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper18909); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT156);

                    TOK_LP157=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18911); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP157);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18913);
                    simple_root_expr158=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr158.getTree());
                    TOK_RP159=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18915); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP159);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18917);
                    primary_expr_select160=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select160.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, primary_expr_select, TOK_NEXT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 951:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:951:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:953:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE161=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ltl_primary_expr_helper18977); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE161);

                    pushFollow(FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper18979);
                    case_element_list_expr162=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr162.getTree());
                    TOK_ESAC163=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper18981); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC163);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18983);
                    primary_expr_select164=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select164.getTree());
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
                    // 956:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:956:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:958:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD165=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19043); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD165);

                    TOK_LP166=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19045); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP166);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19049);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA167=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19051); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA167);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19055);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP168=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19057); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP168);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19059);
                    primary_expr_select169=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select169.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, f, TOK_WAREAD, s
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
                    // 961:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:961:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:963:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE170=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19123); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE170);

                    TOK_LP171=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19125); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP171);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19129);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19133); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19137);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19141); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19145);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP172=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19147); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP172);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19149);
                    primary_expr_select173=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select173.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, s, primary_expr_select, f, m
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
                    // 966:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:966:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:973:1: ctls_root_expr returns [InternalSpec ret] : ctls_implies_expr ;
    public final ctls_root_expr_return ctls_root_expr() throws RecognitionException {
        ctls_root_expr_return retval = new ctls_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_implies_expr_return ctls_implies_expr174 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:974:9: ( ctls_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:974:11: ctls_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_implies_expr_in_ctls_root_expr9230);
            ctls_implies_expr174=ctls_implies_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_implies_expr174.getTree());
            if ( backtracking==0 ) {
              if(!er()) retval.ret = ctls_implies_expr174.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:976:1: ctls_implies_expr returns [InternalSpec ret] : f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:979:9: (f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:979:11: f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_iff_expr_in_ctls_implies_expr9273);
            f=ctls_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:980:9: (op= TOK_IMPLIES s= ctls_implies_expr )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==TOK_IMPLIES) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:980:11: op= TOK_IMPLIES s= ctls_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9289); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_implies_expr_in_ctls_implies_expr9294);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:984:1: ctls_iff_expr returns [InternalSpec ret] : f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:987:9: (f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:987:11: f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9359);
            f=ctls_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:988:9: (op= TOK_IFF s= ctls_or_expr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==TOK_IFF) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:988:11: op= TOK_IFF s= ctls_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctls_iff_expr9375); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9380);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:992:1: ctls_or_expr returns [InternalSpec ret] : f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:995:9: (f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:995:11: f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9443);
            f=ctls_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:996:9: (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:996:11: op= TOK_OR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctls_or_expr9459); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9464);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:998:11: op= TOK_XOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctls_or_expr9488); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9493);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:11: op= TOK_XNOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctls_or_expr9517); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9522);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1004:1: ctls_and_expr returns [InternalSpec ret] : f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1007:9: (f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1007:11: f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9585);
            f=ctls_ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1008:9: (op= TOK_AND s= ctls_ltl_binary_expr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==TOK_AND) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1008:11: op= TOK_AND s= ctls_ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctls_and_expr9601); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9606);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1014:1: ctls_ltl_binary_expr returns [InternalSpec ret] : f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1017:9: (f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1017:11: f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9670);
            f=ctls_ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1018:9: (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1018:11: op= TOK_UNTIL s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9686); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9691);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1020:11: op= TOK_SINCE s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9716); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9721);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1022:11: op= TOK_RELEASES s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9746); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9751);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1024:11: op= TOK_TRIGGERED s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9776); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9781);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1028:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );
    public final ctls_ltl_unary_expr_return ctls_ltl_unary_expr() throws RecognitionException {
        ctls_ltl_unary_expr_return retval = new ctls_ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ltl_pure_unary_expr_return ctls_ltl_pure_unary_expr175 = null;

        ctls_ctl_expr_return ctls_ctl_expr176 = null;


        RewriteRuleSubtreeStream stream_ctls_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr )
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
                            new NoViableAltException("1028:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 17, input);

                        throw nvae;
                    }
                }
                else if ( ((LA62_8>=TOK_PLUS && LA62_8<=TOK_MINUS)||LA62_8==TOK_LP||(LA62_8>=TOK_BOOL && LA62_8<=TOK_CASE)||(LA62_8>=TOK_WAREAD && LA62_8<=TOK_AA)||LA62_8==TOK_EE||LA62_8==TOK_ATOM||LA62_8==TOK_NUMBER||LA62_8==TOK_NUMBER_WORD||(LA62_8>=TOK_FALSEEXP && LA62_8<=TOK_TRUEEXP)) ) {
                    alt62=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1028:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==TOK_LCB||(LA62_0>=TOK_PLUS && LA62_0<=TOK_MINUS)||LA62_0==TOK_LP||(LA62_0>=TOK_BOOL && LA62_0<=TOK_CASE)||(LA62_0>=TOK_WAREAD && LA62_0<=TOK_AA)||LA62_0==TOK_EE||LA62_0==TOK_ATOM||LA62_0==TOK_NUMBER||LA62_0==TOK_NUMBER_WORD||(LA62_0>=TOK_FALSEEXP && LA62_0<=TOK_TRUEEXP)) ) {
                alt62=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1028:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr9932);
                    ctls_ltl_pure_unary_expr175=ctls_ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_ltl_pure_unary_expr.add(ctls_ltl_pure_unary_expr175.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ltl_pure_unary_expr175.ret; 
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
                    // 1038:9: -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1038:12: ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1039:11: ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr9973);
                    ctls_ctl_expr176=ctls_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ctl_expr176.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ctl_expr176.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1042:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:9: (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr )
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
                    new NoViableAltException("1042:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1045:11: op= TOK_OP_NEXT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10023); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10028);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1047:11: op= TOK_OP_PREV f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10052); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10057);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1049:11: op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10081); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10086);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1051:11: op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10110); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10115);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1053:11: op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10139); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10144);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1055:11: op= TOK_OP_FINALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10168); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10173);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1057:11: op= TOK_OP_ONCE f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10197); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10202);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1060:11: op= TOK_NOT fp= ctls_ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10236); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10241);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1065:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );
    public final ctls_ctl_expr_return ctls_ctl_expr() throws RecognitionException {
        ctls_ctl_expr_return retval = new ctls_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_pure_ctl_expr_return ctls_pure_ctl_expr177 = null;

        ctls_relational_expr_return ctls_relational_expr178 = null;


        RewriteRuleSubtreeStream stream_ctls_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr )
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
                            new NoViableAltException("1065:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 15, input);

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
                        new NoViableAltException("1065:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA64_0==TOK_LCB||(LA64_0>=TOK_PLUS && LA64_0<=TOK_MINUS)||LA64_0==TOK_LP||(LA64_0>=TOK_BOOL && LA64_0<=TOK_CASE)||(LA64_0>=TOK_WAREAD && LA64_0<=TOK_WAWRITE)||LA64_0==TOK_ATOM||LA64_0==TOK_NUMBER||LA64_0==TOK_NUMBER_WORD||(LA64_0>=TOK_FALSEEXP && LA64_0<=TOK_TRUEEXP)) ) {
                alt64=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr
                    {
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10460);
                    ctls_pure_ctl_expr177=ctls_pure_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_pure_ctl_expr.add(ctls_pure_ctl_expr177.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_pure_ctl_expr177.ret; 
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
                    // 1080:9: -> ^( PURE_CTL_T ctls_pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1080:12: ^( PURE_CTL_T ctls_pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1081:11: ctls_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10498);
                    ctls_relational_expr178=ctls_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_relational_expr178.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_relational_expr178.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1084:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );
    public final ctls_pure_ctl_expr_return ctls_pure_ctl_expr() throws RecognitionException {
        ctls_pure_ctl_expr_return retval = new ctls_pure_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_ctl_expr_return f = null;

        subrange_return fsr = null;

        ctls_ctl_expr_return s = null;

        ctls_pure_ctl_expr_return fp = null;

        ctls_aa_return ctls_aa179 = null;

        ctls_ee_return ctls_ee180 = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1087:9: (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr )
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
                    new NoViableAltException("1084:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1087:11: op= TOK_EX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10549); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10554);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1089:11: op= TOK_AX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10578); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10583);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1091:11: op= TOK_EF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10607); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10612);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1093:11: op= TOK_AF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10636); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10641);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1095:11: op= TOK_EG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10665); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10670);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1097:11: op= TOK_AG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10694); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10699);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1100:11: ( TOK_AA )=> ctls_aa
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10728);
                    ctls_aa179=ctls_aa();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_aa179.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_aa179.ret; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1101:11: ( TOK_EE )=> ctls_ee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10748);
                    ctls_ee180=ctls_ee();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ee180.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ee180.ret; 
                    }

                    }
                    break;
                case 9 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1103:11: op= TOK_EBF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10765); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10770);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10774);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1105:11: op= TOK_ABF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10798); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10803);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10807);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1107:11: op= TOK_EBG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10831); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10836);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10840);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1109:11: op= TOK_ABG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr10864); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10869);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10873);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1112:11: op= TOK_NOT fp= ctls_pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr10907); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr10912);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1115:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );
    public final ctls_aa_return ctls_aa() throws RecognitionException {
        ctls_aa_return retval = new ctls_aa_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_abu_return ctls_abu181 = null;

        ctls_au_return ctls_au182 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:9: ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au )
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
                            new NoViableAltException("1115:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1115:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_abu_in_ctls_aa10971);
                    ctls_abu181=ctls_abu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_abu181.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_abu181.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1119:11: ( TOK_AA TOK_LB )=> ctls_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_au_in_ctls_aa11002);
                    ctls_au182=ctls_au();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_au182.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_au182.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1123:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );
    public final ctls_ee_return ctls_ee() throws RecognitionException {
        ctls_ee_return retval = new ctls_ee_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ebu_return ctls_ebu183 = null;

        ctls_eu_return ctls_eu184 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1125:9: ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu )
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
                            new NoViableAltException("1123:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1123:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1123:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1125:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ebu_in_ctls_ee11071);
                    ctls_ebu183=ctls_ebu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ebu183.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ebu183.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1127:11: ( TOK_EE TOK_LB )=> ctls_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_eu_in_ctls_ee11102);
                    ctls_eu184=ctls_eu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_eu184.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_eu184.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1132:1: ctls_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1135:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1135:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_au11167); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_au11172); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_au11177);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_au11181); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1138:1: ctls_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1141:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_eu11236); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_eu11241); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_eu11246);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_eu11250); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1144:1: ctls_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1147:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1147:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_abu11304); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_abu11309); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11314);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_abu11318); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_abu11322);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11326);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_abu11330); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1150:1: ctls_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1153:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1153:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_ebu11384); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_ebu11389); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11394);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_ebu11398); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_ebu11402);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11406);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_ebu11410); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1157:1: ctls_relational_expr returns [InternalSpec ret] : f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1160:9: (f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1160:11: f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11462);
            f=ctls_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1161:9: (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1161:11: op= TOK_EQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctls_relational_expr11478); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11483);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1163:11: op= TOK_NOTEQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11508); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11513);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1165:11: op= TOK_LT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctls_relational_expr11538); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11543);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1167:11: op= TOK_GT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctls_relational_expr11568); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11573);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1169:11: op= TOK_LE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctls_relational_expr11598); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11603);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1171:11: op= TOK_GE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctls_relational_expr11628); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11633);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1175:1: ctls_in_expr returns [InternalSpec ret] : f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1178:9: (f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1178:11: f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11696);
            f=ctls_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1179:9: (op= TOK_SETIN s= ctls_union_expr )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==TOK_SETIN) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1179:11: op= TOK_SETIN s= ctls_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctls_in_expr11712); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11717);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1183:1: ctls_union_expr returns [InternalSpec ret] : f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1186:9: (f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1186:11: f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11780);
            f=ctls_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1187:9: (op= TOK_UNION s= ctls_set_expr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==TOK_UNION) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1187:11: op= TOK_UNION s= ctls_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctls_union_expr11796); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11801);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );
    public final ctls_set_expr_return ctls_set_expr() throws RecognitionException {
        ctls_set_expr_return retval = new ctls_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB187=null;
        Token TOK_RCB189=null;
        ctls_shift_expr_return ctls_shift_expr185 = null;

        subrange_return subrange186 = null;

        ctls_set_list_expr_return ctls_set_list_expr188 = null;


        Object TOK_LCB187_tree=null;
        Object TOK_RCB189_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ctls_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1195:9: ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) )
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
                        new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 2, input);

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
                            new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA71_4 = input.LA(2);

                if ( (LA71_4==TOK_NUMBER) ) {
                    int LA71_8 = input.LA(3);

                    if ( (LA71_8==TOK_TWODOTS) ) {
                        alt71=2;
                    }
                    else if ( (LA71_8==EOF||(LA71_8>=TOK_INVAR_SPEC && LA71_8<=TOK_UNION)||(LA71_8>=TOK_LSHIFT && LA71_8<=TOK_CONCATENATION)||LA71_8==TOK_RP||(LA71_8>=TOK_LB && LA71_8<=TOK_RB)||LA71_8==TOK_BUNTIL||(LA71_8>=TOK_SINCE && LA71_8<=TOK_TRIGGERED)||LA71_8==TOK_DOT||LA71_8==TOK_SEMI) ) {
                        alt71=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA71_4>=TOK_PLUS && LA71_4<=TOK_MINUS)||(LA71_4>=TOK_NOT && LA71_4<=TOK_LP)||(LA71_4>=TOK_BOOL && LA71_4<=TOK_CASE)||(LA71_4>=TOK_WAREAD && LA71_4<=TOK_WAWRITE)||LA71_4==TOK_ATOM||LA71_4==TOK_NUMBER_WORD||(LA71_4>=TOK_FALSEEXP && LA71_4<=TOK_TRUEEXP)) ) {
                    alt71=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 4, input);

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
                    new NoViableAltException("1192:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1195:11: ctls_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_shift_expr_in_ctls_set_expr11863);
                    ctls_shift_expr185=ctls_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_shift_expr185.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_shift_expr185.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1197:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctls_set_expr11885);
                    subrange186=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange186.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange186.start,subrange186.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1199:11: TOK_LCB ctls_set_list_expr TOK_RCB
                    {
                    TOK_LCB187=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctls_set_expr11908); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB187);

                    pushFollow(FOLLOW_ctls_set_list_expr_in_ctls_set_expr11910);
                    ctls_set_list_expr188=ctls_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_set_list_expr.add(ctls_set_list_expr188.getTree());
                    TOK_RCB189=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctls_set_expr11912); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB189);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB187.getText() + " " + input.toString(ctls_set_list_expr188.start,ctls_set_list_expr188.stop) + " " + TOK_RCB189.getText()); 
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
                    // 1201:9: -> ^( SET_LIST_EXP_T ctls_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1201:12: ^( SET_LIST_EXP_T ctls_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1203:1: ctls_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctls_set_list_expr_return ctls_set_list_expr() throws RecognitionException {
        ctls_set_list_expr_return retval = new ctls_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA191=null;
        simple_root_expr_return simple_root_expr190 = null;

        simple_root_expr_return simple_root_expr192 = null;


        Object TOK_COMMA191_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1204:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1204:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr11965);
            simple_root_expr190=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr190.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1204:28: ( TOK_COMMA simple_root_expr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==TOK_COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1204:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA191=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_set_list_expr11968); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr11971);
            	    simple_root_expr192=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr192.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1206:1: ctls_shift_expr returns [InternalSpec ret] : f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1209:9: (f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1209:11: f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12017);
            f=ctls_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1210:9: (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1210:11: op= TOK_LSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12033); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12038);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1212:11: op= TOK_RSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12062); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12067);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1216:1: ctls_remainder_expr returns [InternalSpec ret] : f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1219:9: (f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1219:11: f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12129);
            f=ctls_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:9: (op= TOK_MOD s= ctls_additive_expr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==TOK_MOD) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1220:11: op= TOK_MOD s= ctls_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctls_remainder_expr12145); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12150);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1227:1: ctls_additive_expr returns [InternalSpec ret] : f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1230:9: (f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1230:11: f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12215);
            f=ctls_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1231:9: (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1231:11: op= TOK_PLUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctls_additive_expr12231); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12236);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1233:11: op= TOK_MINUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_additive_expr12260); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12265);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1237:1: ctls_multiplicative_expr returns [InternalSpec ret] : f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1240:9: (f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1240:11: f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12325);
            f=ctls_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1241:9: (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1241:11: op= TOK_TIMES s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12341); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12346);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1243:11: op= TOK_DIVIDE s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12370); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12375);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1247:1: ctls_concatination_expr returns [InternalSpec ret] : f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1250:9: (f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1250:11: f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12436);
            f=ctls_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1251:9: (op= TOK_CONCATENATION s= ctls_primary_expr )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==TOK_CONCATENATION) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1251:11: op= TOK_CONCATENATION s= ctls_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12452); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12457);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1256:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );
    public final ctls_primary_expr_return ctls_primary_expr() throws RecognitionException {
        ctls_primary_expr_return retval = new ctls_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_primary_expr_return v = null;

        ctls_primary_expr_helper1_return ctls_primary_expr_helper1193 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ctls_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1259:9: ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) )
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
                    new NoViableAltException("1256:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1259:11: ctls_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12526);
                    ctls_primary_expr_helper1193=ctls_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_primary_expr_helper1193.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_primary_expr_helper1193.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1261:11: op= TOK_MINUS v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_primary_expr12550); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12554);
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
                    // 1263:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1263:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1264:11: op= TOK_NOT v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_primary_expr12595); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12599);
                    v=ctls_primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_primary_expr.add(v.getTree());
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
                    // 1266:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1266:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1269:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctls_primary_expr_helper1_return ctls_primary_expr_helper1() throws RecognitionException {
        ctls_primary_expr_helper1_return retval = new ctls_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP197=null;
        Token TOK_RP199=null;
        Token TOK_BOOL201=null;
        Token TOK_LP202=null;
        Token TOK_RP204=null;
        Token TOK_WORD1206=null;
        Token TOK_LP207=null;
        Token TOK_RP209=null;
        Token TOK_NEXT211=null;
        Token TOK_LP212=null;
        Token TOK_RP214=null;
        Token TOK_CASE216=null;
        Token TOK_ESAC218=null;
        Token TOK_WAREAD220=null;
        Token TOK_LP221=null;
        Token TOK_COMMA222=null;
        Token TOK_RP223=null;
        Token TOK_WAWRITE225=null;
        Token TOK_LP226=null;
        Token TOK_RP227=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant194 = null;

        primary_expr_select_return primary_expr_select195 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1196 = null;

        ctls_root_expr_return ctls_root_expr198 = null;

        primary_expr_select_return primary_expr_select200 = null;

        simple_root_expr_return simple_root_expr203 = null;

        primary_expr_select_return primary_expr_select205 = null;

        simple_root_expr_return simple_root_expr208 = null;

        primary_expr_select_return primary_expr_select210 = null;

        simple_root_expr_return simple_root_expr213 = null;

        primary_expr_select_return primary_expr_select215 = null;

        case_element_list_expr_return case_element_list_expr217 = null;

        primary_expr_select_return primary_expr_select219 = null;

        primary_expr_select_return primary_expr_select224 = null;

        primary_expr_select_return primary_expr_select228 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP197_tree=null;
        Object TOK_RP199_tree=null;
        Object TOK_BOOL201_tree=null;
        Object TOK_LP202_tree=null;
        Object TOK_RP204_tree=null;
        Object TOK_WORD1206_tree=null;
        Object TOK_LP207_tree=null;
        Object TOK_RP209_tree=null;
        Object TOK_NEXT211_tree=null;
        Object TOK_LP212_tree=null;
        Object TOK_RP214_tree=null;
        Object TOK_CASE216_tree=null;
        Object TOK_ESAC218_tree=null;
        Object TOK_WAREAD220_tree=null;
        Object TOK_LP221_tree=null;
        Object TOK_COMMA222_tree=null;
        Object TOK_RP223_tree=null;
        Object TOK_WAWRITE225_tree=null;
        Object TOK_LP226_tree=null;
        Object TOK_RP227_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1272:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
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
                    new NoViableAltException("1269:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1272:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctls_primary_expr_helper112664);
                    constant194=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant194.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112666);
                    primary_expr_select195=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select195.getTree());
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
                    // 1275:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1275:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1276:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112717);
                    primary_expr_helper1_pointer1196=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1196.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1285:11: TOK_LP ctls_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP197=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112770); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP197);

                    pushFollow(FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112772);
                    ctls_root_expr198=ctls_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_root_expr.add(ctls_root_expr198.getTree());
                    TOK_RP199=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112774); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP199);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112776);
                    primary_expr_select200=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select200.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_root_expr198.ret; 
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
                    // 1287:9: -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1287:12: ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1291:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL201=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112847); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL201);

                    TOK_LP202=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112849); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP202);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112851);
                    simple_root_expr203=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr203.getTree());
                    TOK_RP204=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112853); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP204);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112855);
                    primary_expr_select205=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select205.getTree());
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
                    // 1294:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1294:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1295:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1206=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper112906); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1206);

                    TOK_LP207=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112908); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP207);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112910);
                    simple_root_expr208=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr208.getTree());
                    TOK_RP209=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112912); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP209);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112914);
                    primary_expr_select210=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select210.getTree());
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
                    // 1298:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1298:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1300:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT211=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper112974); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT211);

                    TOK_LP212=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112976); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP212);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112978);
                    simple_root_expr213=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr213.getTree());
                    TOK_RP214=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112980); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP214);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112982);
                    primary_expr_select215=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select215.getTree());
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
                    // 1303:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1303:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE216=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113042); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE216);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113044);
                    case_element_list_expr217=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr217.getTree());
                    TOK_ESAC218=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113046); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC218);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113048);
                    primary_expr_select219=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select219.getTree());
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
                    // 1308:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1308:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1310:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD220=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113108); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD220);

                    TOK_LP221=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113110); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP221);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113114);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA222=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113116); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA222);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113120);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP223=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113122); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP223);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113124);
                    primary_expr_select224=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select224.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_WAREAD, s, f
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
                    // 1313:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1313:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1315:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE225=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113188); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE225);

                    TOK_LP226=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113190); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP226);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113194);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113198); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113202);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113206); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113210);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP227=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113212); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP227);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113214);
                    primary_expr_select228=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select228.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: f, s, TOK_WAWRITE, m, primary_expr_select
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
                    // 1318:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1318:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1328:1: primary_expr_helper1_pointer1 : TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) ;
    public final primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1() throws RecognitionException {
        primary_expr_helper1_pointer1_return retval = new primary_expr_helper1_pointer1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_ATOM229=null;
        primary_expr_select_return primary_expr_select230 = null;


        Object TOK_ATOM229_tree=null;
        RewriteRuleTokenStream stream_TOK_ATOM=new RewriteRuleTokenStream(adaptor,"token TOK_ATOM");
        RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1328:31: ( TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1328:33: TOK_ATOM primary_expr_select
            {
            TOK_ATOM229=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113285); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_ATOM.add(TOK_ATOM229);

            pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113287);
            primary_expr_select230=primary_expr_select();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select230.getTree());

            // AST REWRITE
            // elements: TOK_ATOM, primary_expr_select
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1329:9: -> ^( VALUE_T TOK_ATOM NOP primary_expr_select )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1329:12: ^( VALUE_T TOK_ATOM NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:1: primary_expr_select : ( primary_expr_select_helper | primary_expr_ref )* ;
    public final primary_expr_select_return primary_expr_select() throws RecognitionException {
        primary_expr_select_return retval = new primary_expr_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_return primary_expr_select_helper231 = null;

        primary_expr_ref_return primary_expr_ref232 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:24: ( ( primary_expr_select_helper | primary_expr_ref )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:26: ( primary_expr_select_helper | primary_expr_ref )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:26: ( primary_expr_select_helper | primary_expr_ref )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:27: primary_expr_select_helper
            	    {
            	    pushFollow(FOLLOW_primary_expr_select_helper_in_primary_expr_select13330);
            	    primary_expr_select_helper231=primary_expr_select_helper();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper231.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:56: primary_expr_ref
            	    {
            	    pushFollow(FOLLOW_primary_expr_ref_in_primary_expr_select13334);
            	    primary_expr_ref232=primary_expr_ref();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_ref232.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:1: primary_expr_ref : ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) ;
    public final primary_expr_ref_return primary_expr_ref() throws RecognitionException {
        primary_expr_ref_return retval = new primary_expr_ref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_DOT233=null;
        Token set234=null;

        Object TOK_DOT233_tree=null;
        Object set234_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:21: ( ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:24: TOK_DOT ( TOK_ATOM | TOK_NUMBER )
            {
            TOK_DOT233=(Token)input.LT(1);
            match(input,TOK_DOT,FOLLOW_TOK_DOT_in_primary_expr_ref13357); if (failed) return retval;
            set234=(Token)input.LT(1);
            if ( input.LA(1)==TOK_ATOM||input.LA(1)==TOK_NUMBER ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set234));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_primary_expr_ref13360);    throw mse;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );
    public final primary_expr_select_helper_return primary_expr_select_helper() throws RecognitionException {
        primary_expr_select_helper_return retval = new primary_expr_select_helper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix235 = null;

        primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix236 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1338:29: ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix )
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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 2, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 3, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 4, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 23, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 5, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 6, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 7, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 8, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 29, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 9, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 30, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 10, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 31, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 11, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 12, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 34, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 13, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 35, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 14, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 36, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 37, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA81_39 = input.LA(4);

                        if ( (LA81_39==TOK_NUMBER) ) {
                            int LA81_84 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 84, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 39, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 40, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 41, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA81_43 = input.LA(4);

                        if ( (LA81_43==TOK_LP) ) {
                            int LA81_91 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 91, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 92, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 93, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 45, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA81_47 = input.LA(4);

                        if ( (LA81_47==TOK_LP) ) {
                            int LA81_96 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 96, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 47, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 97, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 48, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NOT:
                        {
                        switch ( input.LA(4) ) {
                        case TOK_FALSEEXP:
                            {
                            int LA81_100 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 100, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_TRUEEXP:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 101, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 102, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_PLUS:
                            {
                            int LA81_103 = input.LA(5);

                            if ( (LA81_103==TOK_NUMBER) ) {
                                int LA81_165 = input.LA(6);

                                if ( (synpred15()) ) {
                                    alt81=1;
                                }
                                else if ( (true) ) {
                                    alt81=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 165, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 103, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER_WORD:
                            {
                            int LA81_104 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 104, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_ATOM:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 105, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_LP:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 106, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_BOOL:
                            {
                            int LA81_107 = input.LA(5);

                            if ( (LA81_107==TOK_LP) ) {
                                int LA81_172 = input.LA(6);

                                if ( (synpred15()) ) {
                                    alt81=1;
                                }
                                else if ( (true) ) {
                                    alt81=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 172, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 107, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WORD1:
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 173, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 108, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NEXT:
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 174, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 109, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_CASE:
                            {
                            int LA81_110 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 110, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAREAD:
                            {
                            int LA81_111 = input.LA(5);

                            if ( (LA81_111==TOK_LP) ) {
                                int LA81_177 = input.LA(6);

                                if ( (synpred15()) ) {
                                    alt81=1;
                                }
                                else if ( (true) ) {
                                    alt81=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 177, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 111, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAWRITE:
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 178, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 112, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_MINUS:
                            {
                            int LA81_113 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 113, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NOT:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 114, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 50, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 15, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 51, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 52, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA81_54 = input.LA(4);

                        if ( (LA81_54==TOK_NUMBER) ) {
                            int LA81_120 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 120, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 54, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 55, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 56, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA81_58 = input.LA(4);

                        if ( (LA81_58==TOK_LP) ) {
                            int LA81_126 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 126, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 127, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 128, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 60, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 61, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA81_62 = input.LA(4);

                        if ( (LA81_62==TOK_LP) ) {
                            int LA81_131 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 131, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 62, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 132, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_MINUS:
                        {
                        switch ( input.LA(4) ) {
                        case TOK_FALSEEXP:
                            {
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 133, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_TRUEEXP:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 134, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 135, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_PLUS:
                            {
                            int LA81_136 = input.LA(5);

                            if ( (LA81_136==TOK_NUMBER) ) {
                                int LA81_199 = input.LA(6);

                                if ( (synpred15()) ) {
                                    alt81=1;
                                }
                                else if ( (true) ) {
                                    alt81=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 199, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 136, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER_WORD:
                            {
                            int LA81_137 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 137, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_ATOM:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 138, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_LP:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 139, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_BOOL:
                            {
                            int LA81_140 = input.LA(5);

                            if ( (LA81_140==TOK_LP) ) {
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 206, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 140, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WORD1:
                            {
                            int LA81_141 = input.LA(5);

                            if ( (LA81_141==TOK_LP) ) {
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 207, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 141, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NEXT:
                            {
                            int LA81_142 = input.LA(5);

                            if ( (LA81_142==TOK_LP) ) {
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 208, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 142, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_CASE:
                            {
                            int LA81_143 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 143, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAREAD:
                            {
                            int LA81_144 = input.LA(5);

                            if ( (LA81_144==TOK_LP) ) {
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 211, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 144, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAWRITE:
                            {
                            int LA81_145 = input.LA(5);

                            if ( (LA81_145==TOK_LP) ) {
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
                                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 212, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 145, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_MINUS:
                            {
                            int LA81_146 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt81=1;
                            }
                            else if ( (true) ) {
                                alt81=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 146, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NOT:
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
                                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 147, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 64, input);

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
                                new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 16, input);

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
                            new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1338:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1338:31: ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13394);
                    primary_expr_select_helper_arr_suffix235=primary_expr_select_helper_arr_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_arr_suffix235.getTree());

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1339:11: primary_expr_select_helper_bit_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13406);
                    primary_expr_select_helper_bit_suffix236=primary_expr_select_helper_bit_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_bit_suffix236.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1341:1: primary_expr_select_helper_arr_suffix : TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) ;
    public final primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix() throws RecognitionException {
        primary_expr_select_helper_arr_suffix_return retval = new primary_expr_select_helper_arr_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB237=null;
        Token TOK_RB239=null;
        simple_root_expr_return simple_root_expr238 = null;


        Object TOK_LB237_tree=null;
        Object TOK_RB239_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1342:9: ( TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1342:11: TOK_LB simple_root_expr TOK_RB
            {
            TOK_LB237=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13430); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB237);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13432);
            simple_root_expr238=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr238.getTree());
            TOK_RB239=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13434); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB239);


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
            // 1343:9: -> ^( ARRAY_INDEX_T simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1343:12: ^( ARRAY_INDEX_T simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1345:1: primary_expr_select_helper_bit_suffix : TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) ;
    public final primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix() throws RecognitionException {
        primary_expr_select_helper_bit_suffix_return retval = new primary_expr_select_helper_bit_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB240=null;
        Token TOK_COLON241=null;
        Token TOK_RB242=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;


        Object TOK_LB240_tree=null;
        Object TOK_COLON241_tree=null;
        Object TOK_RB242_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1346:9: ( TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1346:11: TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB
            {
            TOK_LB240=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13474); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB240);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13478);
            f=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
            TOK_COLON241=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13480); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON241);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13484);
            s=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
            TOK_RB242=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13486); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB242);


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
            // 1347:9: -> ^( BIT_SELECT_T $f $s)
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1347:12: ^( BIT_SELECT_T $f $s)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:1: case_element_expr : simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) ;
    public final case_element_expr_return case_element_expr() throws RecognitionException {
        case_element_expr_return retval = new case_element_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COLON244=null;
        Token TOK_SEMI246=null;
        simple_root_expr_return simple_root_expr243 = null;

        simple_root_expr_return simple_root_expr245 = null;


        Object TOK_COLON244_tree=null;
        Object TOK_SEMI246_tree=null;
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_SEMI=new RewriteRuleTokenStream(adaptor,"token TOK_SEMI");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:22: ( simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1350:24: simple_root_expr TOK_COLON simple_root_expr TOK_SEMI
            {
            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13534);
            simple_root_expr243=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr243.getTree());
            TOK_COLON244=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_case_element_expr13536); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON244);

            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13538);
            simple_root_expr245=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr245.getTree());
            TOK_SEMI246=(Token)input.LT(1);
            match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_case_element_expr13540); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_SEMI.add(TOK_SEMI246);


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
            // 1351:9: -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1351:12: ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1353:1: case_element_list_expr : case_element_expr ( case_element_expr )* ;
    public final case_element_list_expr_return case_element_list_expr() throws RecognitionException {
        case_element_list_expr_return retval = new case_element_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        case_element_expr_return case_element_expr247 = null;

        case_element_expr_return case_element_expr248 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1353:26: ( case_element_expr ( case_element_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1353:28: case_element_expr ( case_element_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13576);
            case_element_expr247=case_element_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr247.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1353:46: ( case_element_expr )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==TOK_LCB||(LA82_0>=TOK_PLUS && LA82_0<=TOK_MINUS)||(LA82_0>=TOK_NOT && LA82_0<=TOK_LP)||(LA82_0>=TOK_BOOL && LA82_0<=TOK_CASE)||(LA82_0>=TOK_WAREAD && LA82_0<=TOK_WAWRITE)||LA82_0==TOK_ATOM||LA82_0==TOK_NUMBER||LA82_0==TOK_NUMBER_WORD||(LA82_0>=TOK_FALSEEXP && LA82_0<=TOK_TRUEEXP)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1353:47: case_element_expr
            	    {
            	    pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13579);
            	    case_element_expr248=case_element_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr248.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1356:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );
    public final number_return number() throws RecognitionException {
        number_return retval = new number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER249=null;
        Token TOK_PLUS250=null;
        Token TOK_NUMBER251=null;

        Object TOK_NUMBER249_tree=null;
        Object TOK_PLUS250_tree=null;
        Object TOK_NUMBER251_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1356:14: ( TOK_NUMBER | TOK_PLUS TOK_NUMBER )
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
                    new NoViableAltException("1356:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1356:16: TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_NUMBER249=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13604); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER249_tree = (Object)adaptor.create(TOK_NUMBER249);
                    adaptor.addChild(root_0, TOK_NUMBER249_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1357:11: TOK_PLUS TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_PLUS250=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_number13616); if (failed) return retval;
                    TOK_NUMBER251=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13619); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER251_tree = (Object)adaptor.create(TOK_NUMBER251);
                    adaptor.addChild(root_0, TOK_NUMBER251_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1358:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );
    public final integer_return integer() throws RecognitionException {
        integer_return retval = new integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER252=null;
        Token TOK_PLUS253=null;
        Token TOK_NUMBER254=null;
        Token TOK_MINUS255=null;
        Token TOK_NUMBER256=null;

        Object TOK_NUMBER252_tree=null;
        Object TOK_PLUS253_tree=null;
        Object TOK_NUMBER254_tree=null;
        Object TOK_MINUS255_tree=null;
        Object TOK_NUMBER256_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NUMBER=new RewriteRuleTokenStream(adaptor,"token TOK_NUMBER");
        RewriteRuleTokenStream stream_TOK_PLUS=new RewriteRuleTokenStream(adaptor,"token TOK_PLUS");

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1358:15: ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) )
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
                    new NoViableAltException("1358:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1358:17: TOK_NUMBER
                    {
                    TOK_NUMBER252=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13632); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER252);


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
                    // 1359:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1359:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1360:11: TOK_PLUS TOK_NUMBER
                    {
                    TOK_PLUS253=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_integer13660); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_PLUS.add(TOK_PLUS253);

                    TOK_NUMBER254=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13662); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER254);


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
                    // 1361:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1361:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1362:11: TOK_MINUS TOK_NUMBER
                    {
                    TOK_MINUS255=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_integer13690); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(TOK_MINUS255);

                    TOK_NUMBER256=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13692); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER256);


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
                    // 1363:9: -> ^( TOK_MINUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1363:12: ^( TOK_MINUS TOK_NUMBER )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1365:1: number_word : TOK_NUMBER_WORD ;
    public final number_word_return number_word() throws RecognitionException {
        number_word_return retval = new number_word_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER_WORD257=null;

        Object TOK_NUMBER_WORD257_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1365:18: ( TOK_NUMBER_WORD )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1365:20: TOK_NUMBER_WORD
            {
            root_0 = (Object)adaptor.nil();

            TOK_NUMBER_WORD257=(Token)input.LT(1);
            match(input,TOK_NUMBER_WORD,FOLLOW_TOK_NUMBER_WORD_in_number_word13729); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_NUMBER_WORD257_tree = (Object)adaptor.create(TOK_NUMBER_WORD257);
            adaptor.addChild(root_0, TOK_NUMBER_WORD257_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1368:1: subrange returns [InternalSpecRange ret] : f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) ;
    public final subrange_return subrange() throws RecognitionException {
        subrange_return retval = new subrange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_TWODOTS258=null;
        integer_return f = null;

        integer_return s = null;


        Object TOK_TWODOTS258_tree=null;
        RewriteRuleTokenStream stream_TOK_TWODOTS=new RewriteRuleTokenStream(adaptor,"token TOK_TWODOTS");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1370:9: (f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1370:11: f= integer TOK_TWODOTS s= integer
            {
            pushFollow(FOLLOW_integer_in_subrange13768);
            f=integer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_integer.add(f.getTree());
            TOK_TWODOTS258=(Token)input.LT(1);
            match(input,TOK_TWODOTS,FOLLOW_TOK_TWODOTS_in_subrange13770); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_TWODOTS.add(TOK_TWODOTS258);

            pushFollow(FOLLOW_integer_in_subrange13774);
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
            // 1372:9: -> ^( SUBRANGE_T integer integer )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1372:12: ^( SUBRANGE_T integer integer )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_FALSEEXP259=null;
        Token TOK_TRUEEXP260=null;
        number_return number261 = null;

        number_word_return number_word262 = null;


        Object TOK_FALSEEXP259_tree=null;
        Object TOK_TRUEEXP260_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:15: ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word )
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
                    new NoViableAltException("1374:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1374:17: TOK_FALSEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_FALSEEXP259=(Token)input.LT(1);
                    match(input,TOK_FALSEEXP,FOLLOW_TOK_FALSEEXP_in_constant13823); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_FALSEEXP259_tree = (Object)adaptor.create(TOK_FALSEEXP259);
                    adaptor.addChild(root_0, TOK_FALSEEXP259_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1375:11: TOK_TRUEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_TRUEEXP260=(Token)input.LT(1);
                    match(input,TOK_TRUEEXP,FOLLOW_TOK_TRUEEXP_in_constant13835); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_TRUEEXP260_tree = (Object)adaptor.create(TOK_TRUEEXP260);
                    adaptor.addChild(root_0, TOK_TRUEEXP260_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1376:11: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_constant13847);
                    number261=number();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number261.getTree());

                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1377:11: number_word
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_word_in_constant13859);
                    number_word262=number_word();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number_word262.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:1: optsemi : ( TOK_SEMI )* ;
    public final optsemi_return optsemi() throws RecognitionException {
        optsemi_return retval = new optsemi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_SEMI263=null;

        Object TOK_SEMI263_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:15: ( ( TOK_SEMI )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:17: ( TOK_SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:17: ( TOK_SEMI )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==TOK_SEMI) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1381:17: TOK_SEMI
            	    {
            	    TOK_SEMI263=(Token)input.LT(1);
            	    match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_optsemi13884); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    TOK_SEMI263_tree = (Object)adaptor.create(TOK_SEMI263);
            	    adaptor.addChild(root_0, TOK_SEMI263_tree);
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
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:12: ( TOK_NOT )*
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==TOK_NOT) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:407:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred13122); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred13135);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:478:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:478:12: TOK_AA TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred23648); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred23650); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred23652);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred23654); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:479:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:479:12: TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred33674); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred33676); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred33678);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred33680); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:12: TOK_EE TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred43700); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred43702); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred43704);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred43706); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:481:12: TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred53726); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred53728); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred53730);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred53732); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:12: ( TOK_NOT )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==TOK_NOT) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:772:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred66942); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred66955);    throw mse;
        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:12: ( TOK_NOT )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==TOK_NOT) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1029:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred79832); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred79845);    throw mse;
        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:12: ( TOK_NOT )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==TOK_NOT) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred810285); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred810298);    throw mse;
        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1100:11: ( TOK_AA )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1100:12: TOK_AA
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred910723); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1101:11: ( TOK_EE )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1101:12: TOK_EE
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1010743); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1117:12: TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1110960); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1110962); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1110964);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1110966); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1119:11: ( TOK_AA TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1119:12: TOK_AA TOK_LB
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1210995); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1210997); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1125:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1125:12: TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1311060); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1311062); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1311064);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1311066); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1127:11: ( TOK_EE TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1127:12: TOK_EE TOK_LB
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1411095); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1411097); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1338:31: ( TOK_LB simple_root_expr TOK_RB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1338:32: TOK_LB simple_root_expr TOK_RB
        {
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1513385); if (failed) return ;
        pushFollow(FOLLOW_simple_root_expr_in_synpred1513387);
        simple_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_RB,FOLLOW_TOK_RB_in_synpred1513389); if (failed) return ;

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


 

    public static final BitSet FOLLOW_EOF_in_spec152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_list_in_spec164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_spec166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list230 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list246 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_invar_spec_in_spec_element289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_spec_in_spec_element303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_spec_in_spec_element317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_spec_in_spec_element331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_INVAR_SPEC_in_invar_spec379 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_invar_spec382 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_optsemi_in_invar_spec384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_SPEC_in_ctl_spec423 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_spec426 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_optsemi_in_ctl_spec428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LTL_SPEC_in_ltl_spec467 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_spec470 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_optsemi_in_ltl_spec472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec511 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_spec514 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_optsemi_in_ctls_spec516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_expr_in_simple_root_expr558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iff_expr_in_implies_expr602 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_implies_expr618 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_implies_expr_in_implies_expr623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr689 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_iff_expr705 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr710 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr775 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_OR_in_or_expr791 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr796 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_or_expr820 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr825 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_or_expr849 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr854 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr918 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TOK_AND_in_and_expr934 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr939 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1002 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_relational_expr1018 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1023 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_relational_expr1048 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1053 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LT_in_relational_expr1078 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1083 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GT_in_relational_expr1108 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1113 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LE_in_relational_expr1138 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1143 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GE_in_relational_expr1168 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1173 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1238 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_in_expr1254 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1259 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1323 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_union_expr1339 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1344 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_shift_expr_in_set_expr1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_set_expr1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_set_expr1451 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_set_list_expr_in_set_expr1453 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_set_expr1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1509 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_set_list_expr1512 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1515 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1560 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_shift_expr1576 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1581 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_shift_expr1605 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1610 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1673 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_remainder_expr1689 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1694 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1757 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_additive_expr1773 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1778 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_additive_expr1802 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1807 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1869 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_multiplicative_expr1885 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1890 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_multiplicative_expr1914 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1919 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr1981 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_concatination_expr1997 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr2002 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_in_primary_expr2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_primary_expr2114 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_primary_expr2158 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr_helper12227 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12304 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12306 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12308 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_primary_expr_helper12352 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12355 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12357 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12359 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_primary_expr_helper12404 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12406 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12408 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12410 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_primary_expr_helper12454 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12456 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12460 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_primary_expr_helper12504 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_primary_expr_helper12506 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_primary_expr_helper12508 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_primary_expr_helper12552 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12554 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12556 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12558 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12560 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12562 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_primary_expr_helper12608 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12610 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12612 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12614 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12616 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12618 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12620 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12622 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_root_expr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_iff_expr_in_ctl_implies_expr2735 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2751 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_implies_expr2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2821 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctl_iff_expr2837 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2842 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2906 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctl_or_expr2922 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2927 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctl_or_expr2951 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2956 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctl_or_expr2980 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2985 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3048 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctl_and_expr3064 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3069 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_pure_ctl_expr_in_ctl_expr3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_relational_expr_in_ctl_expr3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_pure_ctl_expr3403 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_pure_ctl_expr3432 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_pure_ctl_expr3461 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_pure_ctl_expr3490 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_pure_ctl_expr3519 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_pure_ctl_expr3548 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_au_in_pure_ctl_expr3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_abu_in_pure_ctl_expr3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_eu_in_pure_ctl_expr3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_ebu_in_pure_ctl_expr3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_pure_ctl_expr3753 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3758 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_pure_ctl_expr3786 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3791 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_pure_ctl_expr3819 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3824 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_pure_ctl_expr3852 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3857 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_expr3895 = new BitSet(new long[]{0xF004000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_pure_ctl_expr_in_pure_ctl_expr3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_au3954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_au3959 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_au3968 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au3972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_au3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_eu4031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_eu4036 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_eu4045 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_eu4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_abu4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_abu4113 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_abu4122 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_abu4126 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_abu4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_ebu4189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_ebu4194 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_ebu4203 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctl_ebu4207 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_ebu4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4276 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctl_relational_expr4292 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4297 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4322 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4327 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctl_relational_expr4352 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4357 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctl_relational_expr4382 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4387 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctl_relational_expr4412 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4417 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctl_relational_expr4442 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4447 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4511 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctl_in_expr4527 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4532 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4595 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctl_union_expr4611 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4616 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ctl_shift_expr_in_ctl_set_expr4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctl_set_expr4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctl_set_expr4722 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_set_list_expr_in_ctl_set_expr4724 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctl_set_expr4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4779 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_set_list_expr4782 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4785 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4831 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctl_shift_expr4847 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4852 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctl_shift_expr4876 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr4881 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4943 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctl_remainder_expr4959 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr4964 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5028 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctl_additive_expr5044 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5049 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_additive_expr5073 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5078 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5139 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5155 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5160 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5184 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5189 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5250 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5266 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5271 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_primary_expr5364 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctl_primary_expr5409 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctl_primary_expr_helper15478 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_know_in_ctl_primary_expr_helper15574 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15630 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15632 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15634 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15707 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15709 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15711 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15713 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15766 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15768 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15770 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15772 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper15834 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15836 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15838 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15840 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctl_primary_expr_helper15902 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper15904 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper15906 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper15968 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15970 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15974 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper15976 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15980 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15982 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16048 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16050 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16054 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16058 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16062 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16066 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16070 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16072 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_know6163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_know6168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ctl_know6172 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_know6177 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_know6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_agent_name6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_root_expr6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_iff_expr_in_ltl_implies_expr6342 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6358 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_implies_expr6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6428 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ltl_iff_expr6444 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6449 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6513 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ltl_or_expr6529 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6534 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ltl_or_expr6558 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6563 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ltl_or_expr6587 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6592 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6655 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ltl_and_expr6671 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6676 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6741 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ltl_binary_expr6757 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6762 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ltl_binary_expr6787 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6792 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ltl_binary_expr6817 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6822 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6847 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6852 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ltl_binary_expr6885 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6890 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D100L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_relational_expr_in_ltl_unary_expr7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7135 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7164 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7193 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7222 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7251 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7280 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7309 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7348 = new BitSet(new long[]{0x0004000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7405 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ltl_relational_expr7421 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7426 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7451 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7456 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ltl_relational_expr7481 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7486 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ltl_relational_expr7511 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7516 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ltl_relational_expr7541 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7546 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ltl_relational_expr7571 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7576 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7640 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ltl_in_expr7656 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7661 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7724 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ltl_union_expr7740 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7745 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ltl_shift_expr_in_ltl_set_expr7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ltl_set_expr7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ltl_set_expr7851 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_set_list_expr_in_ltl_set_expr7853 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ltl_set_expr7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr7908 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_set_list_expr7911 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr7914 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7960 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ltl_shift_expr7976 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7981 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8005 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8010 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8072 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ltl_remainder_expr8088 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8093 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8157 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ltl_additive_expr8173 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8178 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_additive_expr8202 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8207 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8268 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8284 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8289 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8313 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8318 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8379 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8395 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8400 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_primary_expr8485 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_primary_expr8530 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ltl_primary_expr_helper18599 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18705 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2FE2000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18707 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18709 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18782 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18784 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18786 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18788 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18841 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18843 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18845 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18847 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper18909 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18911 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18913 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18915 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ltl_primary_expr_helper18977 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper18979 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper18981 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19043 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19045 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19049 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19051 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19055 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19057 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19123 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19125 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19129 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19133 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19137 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19141 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19145 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19147 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_root_expr9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_iff_expr_in_ctls_implies_expr9273 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9289 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_implies_expr9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9359 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctls_iff_expr9375 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9380 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9443 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctls_or_expr9459 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9464 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctls_or_expr9488 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9493 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctls_or_expr9517 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9522 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9585 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctls_and_expr9601 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9606 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9670 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9686 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9691 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C100L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9716 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9721 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C100L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9746 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9751 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C100L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9776 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9781 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C100L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10023 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10052 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10081 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10110 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10139 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10168 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10197 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10236 = new BitSet(new long[]{0x0004000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10549 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10578 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10607 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10636 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10665 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10694 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10765 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10770 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10798 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10803 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10831 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10836 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr10864 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10869 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr10907 = new BitSet(new long[]{0xF004000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_abu_in_ctls_aa10971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_au_in_ctls_aa11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ebu_in_ctls_ee11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_eu_in_ctls_ee11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_au11167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_au11172 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_au11177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_au11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_eu11236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_eu11241 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_eu11246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_eu11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_abu11304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_abu11309 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_abu11318 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_abu11322 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_abu11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_ebu11384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_ebu11389 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_ebu11398 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_subrange_in_ctls_ebu11402 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_ebu11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11462 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctls_relational_expr11478 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11483 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11508 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11513 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctls_relational_expr11538 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11543 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctls_relational_expr11568 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11573 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctls_relational_expr11598 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11603 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctls_relational_expr11628 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11633 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11696 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctls_in_expr11712 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11717 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11780 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctls_union_expr11796 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11801 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ctls_shift_expr_in_ctls_set_expr11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctls_set_expr11885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctls_set_expr11908 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_set_list_expr_in_ctls_set_expr11910 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctls_set_expr11912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr11965 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_set_list_expr11968 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr11971 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12017 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12033 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12038 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12062 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12067 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12129 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctls_remainder_expr12145 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12150 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12215 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctls_additive_expr12231 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12236 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_additive_expr12260 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12265 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12325 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12341 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12346 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12370 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12375 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12436 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12452 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12457 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_primary_expr12550 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_primary_expr12595 = new BitSet(new long[]{0x0DEC600000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctls_primary_expr_helper112664 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112770 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112772 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112774 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112847 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112849 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112851 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112853 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper112906 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112908 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112910 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112912 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper112974 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112976 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112978 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112980 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113042 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113044 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113046 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113108 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113110 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113114 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113116 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113120 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113122 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113188 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113190 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113194 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113198 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113202 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113206 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113210 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113212 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113285 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_in_primary_expr_select13330 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_primary_expr_ref_in_primary_expr_select13334 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000080L});
    public static final BitSet FOLLOW_TOK_DOT_in_primary_expr_ref13357 = new BitSet(new long[]{0x0000000000000000L,0x0000000002002000L});
    public static final BitSet FOLLOW_set_in_primary_expr_ref13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13430 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13474 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13478 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13480 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13534 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_case_element_expr13536 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13538 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_TOK_SEMI_in_case_element_expr13540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13576 = new BitSet(new long[]{0x0DEC608000000002L,0x00000000D2002000L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13579 = new BitSet(new long[]{0x0DEC608000000002L,0x00000000D2002000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_number13616 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_integer13660 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_integer13690 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_WORD_in_number_word13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_subrange13768 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_TOK_TWODOTS_in_subrange13770 = new BitSet(new long[]{0x0000600000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_integer_in_subrange13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_FALSEEXP_in_constant13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_TRUEEXP_in_constant13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_word_in_constant13859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_SEMI_in_optsemi13884 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred13122 = new BitSet(new long[]{0xF004000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_set_in_synpred13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred23648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred23650 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred23652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred23654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred33674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred33676 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred33678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred33680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred43700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred43702 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred43704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred43706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred53726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred53728 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D200247FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred53730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred53732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred66942 = new BitSet(new long[]{0x0004000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_set_in_synpred66955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred79832 = new BitSet(new long[]{0x0004000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_set_in_synpred79845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred810285 = new BitSet(new long[]{0xF004000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_set_in_synpred810298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred910723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1010743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1110960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1110962 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1110964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1110966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1210995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1210997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1311060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1311062 = new BitSet(new long[]{0xFDEC608000000000L,0x00000000D2FE247FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1311064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1311066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1411095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1411097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1513385 = new BitSet(new long[]{0x0DEC608000000000L,0x00000000D2002000L});
    public static final BitSet FOLLOW_simple_root_expr_in_synpred1513387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_synpred1513389 = new BitSet(new long[]{0x0000000000000002L});

}