// $ANTLR 3.0.1 /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g 2017-10-18 09:47:19

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NOP", "SPEC_LIST_T", "SUBRANGE_T", "VALUE_T", "SET_LIST_EXP_T", "BLOCK_T", "CASE_LIST_EXPR_T", "CASE_ELEMENT_EXPR_T", "BIT_SELECT_T", "ARRAY_INDEX_T", "TOK_UNARY_MINUS_T", "PURE_CTL_T", "PURE_LTL_T", "PURE_CTL_EPISTEMIC_T", "CTL_KNOW_T", "TOK_INVAR_SPEC", "TOK_CTL_SPEC", "TOK_LTL_SPEC", "TOK_CTL_STAR_SPEC", "TOK_IMPLIES", "TOK_IFF", "TOK_OR", "TOK_XOR", "TOK_XNOR", "TOK_AND", "TOK_EQUAL", "TOK_NOTEQUAL", "TOK_LT", "TOK_GT", "TOK_LE", "TOK_GE", "TOK_SETIN", "TOK_UNION", "TOK_LCB", "TOK_RCB", "TOK_COMMA", "TOK_LSHIFT", "TOK_RSHIFT", "TOK_MOD", "TOK_PLUS", "TOK_MINUS", "TOK_TIMES", "TOK_DIVIDE", "TOK_CONCATENATION", "TOK_NOT", "TOK_LP", "TOK_RP", "TOK_BOOL", "TOK_WORD1", "TOK_NEXT", "TOK_CASE", "TOK_ESAC", "TOK_WAREAD", "TOK_WAWRITE", "TOK_KNOW", "TOK_ATOM", "TOK_EX", "TOK_AX", "TOK_EF", "TOK_AF", "TOK_EG", "TOK_AG", "TOK_EBF", "TOK_ABF", "TOK_EBG", "TOK_ABG", "TOK_AA", "TOK_LB", "TOK_UNTIL", "TOK_RB", "TOK_EE", "TOK_BUNTIL", "TOK_SINCE", "TOK_RELEASES", "TOK_TRIGGERED", "TOK_OP_NEXT", "TOK_OP_PREV", "TOK_OP_NOTPREVNOT", "TOK_OP_GLOBALLY", "TOK_OP_HISTORICALLY", "TOK_OP_FINALLY", "TOK_OP_ONCE", "TOK_DOT", "TOK_NUMBER", "TOK_COLON", "TOK_SEMI", "TOK_NUMBER_WORD", "TOK_TWODOTS", "TOK_FALSEEXP", "TOK_TRUEEXP", "TOK_WORD", "TOK_NUMBER_FRAC", "JTOK_WS", "JTOK_MULTI_COMMENT", "JTOK_LINE_COMMENT"
    };
    public static final int TOK_PLUS=43;
    public static final int TOK_RCB=38;
    public static final int CTL_KNOW_T=18;
    public static final int TOK_UNARY_MINUS_T=14;
    public static final int TOK_XOR=26;
    public static final int ARRAY_INDEX_T=13;
    public static final int TOK_ABG=69;
    public static final int TOK_ABF=67;
    public static final int TOK_TIMES=45;
    public static final int TOK_EBG=68;
    public static final int TOK_EBF=66;
    public static final int TOK_LP=49;
    public static final int TOK_LT=31;
    public static final int TOK_COLON=88;
    public static final int JTOK_MULTI_COMMENT=97;
    public static final int TOK_SETIN=35;
    public static final int SPEC_LIST_T=5;
    public static final int TOK_EQUAL=29;
    public static final int TOK_LB=71;
    public static final int TOK_TRUEEXP=93;
    public static final int TOK_BUNTIL=75;
    public static final int TOK_LE=33;
    public static final int TOK_UNTIL=72;
    public static final int TOK_DOT=86;
    public static final int SUBRANGE_T=6;
    public static final int CASE_ELEMENT_EXPR_T=11;
    public static final int TOK_ATOM=59;
    public static final int TOK_XNOR=27;
    public static final int TOK_AG=65;
    public static final int TOK_AF=63;
    public static final int TOK_WAWRITE=57;
    public static final int TOK_RB=73;
    public static final int TOK_OP_ONCE=85;
    public static final int TOK_SEMI=89;
    public static final int TOK_AA=70;
    public static final int TOK_NUMBER_FRAC=95;
    public static final int TOK_MINUS=44;
    public static final int TOK_NUMBER_WORD=90;
    public static final int TOK_IMPLIES=23;
    public static final int TOK_KNOW=58;
    public static final int TOK_AX=61;
    public static final int JTOK_WS=96;
    public static final int TOK_OP_GLOBALLY=82;
    public static final int TOK_FALSEEXP=92;
    public static final int TOK_RP=50;
    public static final int VALUE_T=7;
    public static final int TOK_RSHIFT=41;
    public static final int TOK_SINCE=76;
    public static final int TOK_WAREAD=56;
    public static final int TOK_OR=25;
    public static final int TOK_OP_NOTPREVNOT=81;
    public static final int TOK_NOT=48;
    public static final int TOK_OP_PREV=80;
    public static final int BLOCK_T=9;
    public static final int TOK_LSHIFT=40;
    public static final int TOK_AND=28;
    public static final int TOK_GT=32;
    public static final int TOK_TRIGGERED=78;
    public static final int TOK_CASE=54;
    public static final int TOK_CTL_STAR_SPEC=22;
    public static final int TOK_IFF=24;
    public static final int TOK_GE=34;
    public static final int SET_LIST_EXP_T=8;
    public static final int CASE_LIST_EXPR_T=10;
    public static final int TOK_TWODOTS=91;
    public static final int NOP=4;
    public static final int TOK_COMMA=39;
    public static final int TOK_UNION=36;
    public static final int TOK_NUMBER=87;
    public static final int TOK_LTL_SPEC=21;
    public static final int TOK_ESAC=55;
    public static final int TOK_LCB=37;
    public static final int TOK_DIVIDE=46;
    public static final int TOK_OP_NEXT=79;
    public static final int PURE_CTL_EPISTEMIC_T=17;
    public static final int TOK_EG=64;
    public static final int TOK_EF=62;
    public static final int PURE_CTL_T=15;
    public static final int TOK_NOTEQUAL=30;
    public static final int BIT_SELECT_T=12;
    public static final int TOK_INVAR_SPEC=19;
    public static final int TOK_EE=74;
    public static final int EOF=-1;
    public static final int TOK_BOOL=51;
    public static final int PURE_LTL_T=16;
    public static final int TOK_OP_FINALLY=84;
    public static final int JTOK_LINE_COMMENT=98;
    public static final int TOK_OP_HISTORICALLY=83;
    public static final int TOK_WORD1=52;
    public static final int TOK_CONCATENATION=47;
    public static final int TOK_NEXT=53;
    public static final int TOK_RELEASES=77;
    public static final int TOK_EX=60;
    public static final int TOK_MOD=42;
    public static final int TOK_WORD=94;
    public static final int TOK_CTL_SPEC=20;

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:128:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:129:9: ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) )
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
                    new NoViableAltException("128:1: spec returns [WAArrayOfSpec ret] : ( EOF | spec_list EOF -> ^( SPEC_LIST_T spec_list ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:129:11: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF1=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec144); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EOF1_tree = (Object)adaptor.create(EOF1);
                    adaptor.addChild(root_0, EOF1_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:130:11: spec_list EOF
                    {
                    pushFollow(FOLLOW_spec_list_in_spec156);
                    spec_list2=spec_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_spec_list.add(spec_list2.getTree());
                    EOF3=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_spec158); if (failed) return retval;
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
                    // 132:9: -> ^( SPEC_LIST_T spec_list )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:132:12: ^( SPEC_LIST_T spec_list )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:134:1: spec_list returns [WAArrayOfSpec ret] : f= spec_element (s= spec_element )* ;
    public final spec_list_return spec_list() throws RecognitionException {
        spec_list_return retval = new spec_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        spec_element_return f = null;

        spec_element_return s = null;



        retval.ret = new WAArrayOfSpec(); 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:136:9: (f= spec_element (s= spec_element )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:136:11: f= spec_element (s= spec_element )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_spec_element_in_spec_list222);
            f=spec_element();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if(!er()) retval.ret.specs.add(f.ret); else retval.ret.specs.add(null); in_my_recovery_mode = false; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:137:9: (s= spec_element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=TOK_INVAR_SPEC && LA2_0<=TOK_CTL_STAR_SPEC)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:137:11: s= spec_element
            	    {
            	    pushFollow(FOLLOW_spec_element_in_spec_list238);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:140:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );
    public final spec_element_return spec_element() throws RecognitionException {
        spec_element_return retval = new spec_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        invar_spec_return invar_spec4 = null;

        ctl_spec_return ctl_spec5 = null;

        ltl_spec_return ltl_spec6 = null;

        ctls_spec_return ctls_spec7 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:141:9: ( invar_spec | ctl_spec | ltl_spec | ctls_spec )
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
                    new NoViableAltException("140:1: spec_element returns [InternalSpec ret] : ( invar_spec | ctl_spec | ltl_spec | ctls_spec );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:141:11: invar_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_invar_spec_in_spec_element281);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:142:11: ctl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_spec_in_spec_element295);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:143:11: ltl_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_spec_in_spec_element309);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:144:11: ctls_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_spec_in_spec_element323);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:156:1: invar_spec returns [InternalSpec ret] : TOK_INVAR_SPEC simple_root_expr optsemi ;
    public final invar_spec_return invar_spec() throws RecognitionException {
        invar_spec_return retval = new invar_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_INVAR_SPEC8=null;
        simple_root_expr_return simple_root_expr9 = null;

        optsemi_return optsemi10 = null;


        Object TOK_INVAR_SPEC8_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:158:9: ( TOK_INVAR_SPEC simple_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:158:11: TOK_INVAR_SPEC simple_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_INVAR_SPEC8=(Token)input.LT(1);
            match(input,TOK_INVAR_SPEC,FOLLOW_TOK_INVAR_SPEC_in_invar_spec371); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_INVAR_SPEC8_tree = (Object)adaptor.create(TOK_INVAR_SPEC8);
            root_0 = (Object)adaptor.becomeRoot(TOK_INVAR_SPEC8_tree, root_0);
            }
            pushFollow(FOLLOW_simple_root_expr_in_invar_spec374);
            simple_root_expr9=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr9.getTree());
            pushFollow(FOLLOW_optsemi_in_invar_spec376);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:160:1: ctl_spec returns [InternalSpec ret] : TOK_CTL_SPEC ctl_root_expr optsemi ;
    public final ctl_spec_return ctl_spec() throws RecognitionException {
        ctl_spec_return retval = new ctl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_SPEC11=null;
        ctl_root_expr_return ctl_root_expr12 = null;

        optsemi_return optsemi13 = null;


        Object TOK_CTL_SPEC11_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:162:9: ( TOK_CTL_SPEC ctl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:162:11: TOK_CTL_SPEC ctl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_SPEC11=(Token)input.LT(1);
            match(input,TOK_CTL_SPEC,FOLLOW_TOK_CTL_SPEC_in_ctl_spec415); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_SPEC11_tree = (Object)adaptor.create(TOK_CTL_SPEC11);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_SPEC11_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_spec418);
            ctl_root_expr12=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctl_root_expr12.getTree());
            pushFollow(FOLLOW_optsemi_in_ctl_spec420);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:164:1: ltl_spec returns [InternalSpec ret] : TOK_LTL_SPEC ltl_root_expr optsemi ;
    public final ltl_spec_return ltl_spec() throws RecognitionException {
        ltl_spec_return retval = new ltl_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LTL_SPEC14=null;
        ltl_root_expr_return ltl_root_expr15 = null;

        optsemi_return optsemi16 = null;


        Object TOK_LTL_SPEC14_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:166:9: ( TOK_LTL_SPEC ltl_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:166:11: TOK_LTL_SPEC ltl_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_LTL_SPEC14=(Token)input.LT(1);
            match(input,TOK_LTL_SPEC,FOLLOW_TOK_LTL_SPEC_in_ltl_spec459); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_LTL_SPEC14_tree = (Object)adaptor.create(TOK_LTL_SPEC14);
            root_0 = (Object)adaptor.becomeRoot(TOK_LTL_SPEC14_tree, root_0);
            }
            pushFollow(FOLLOW_ltl_root_expr_in_ltl_spec462);
            ltl_root_expr15=ltl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ltl_root_expr15.getTree());
            pushFollow(FOLLOW_optsemi_in_ltl_spec464);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:168:1: ctls_spec returns [InternalSpec ret] : TOK_CTL_STAR_SPEC ctls_root_expr optsemi ;
    public final ctls_spec_return ctls_spec() throws RecognitionException {
        ctls_spec_return retval = new ctls_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_CTL_STAR_SPEC17=null;
        ctls_root_expr_return ctls_root_expr18 = null;

        optsemi_return optsemi19 = null;


        Object TOK_CTL_STAR_SPEC17_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:170:9: ( TOK_CTL_STAR_SPEC ctls_root_expr optsemi )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:170:11: TOK_CTL_STAR_SPEC ctls_root_expr optsemi
            {
            root_0 = (Object)adaptor.nil();

            TOK_CTL_STAR_SPEC17=(Token)input.LT(1);
            match(input,TOK_CTL_STAR_SPEC,FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec503); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_CTL_STAR_SPEC17_tree = (Object)adaptor.create(TOK_CTL_STAR_SPEC17);
            root_0 = (Object)adaptor.becomeRoot(TOK_CTL_STAR_SPEC17_tree, root_0);
            }
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_spec506);
            ctls_root_expr18=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_root_expr18.getTree());
            pushFollow(FOLLOW_optsemi_in_ctls_spec508);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:179:1: simple_root_expr returns [InternalSpec ret] : implies_expr ;
    public final simple_root_expr_return simple_root_expr() throws RecognitionException {
        simple_root_expr_return retval = new simple_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        implies_expr_return implies_expr20 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:180:9: ( implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:180:11: implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_implies_expr_in_simple_root_expr550);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:182:1: implies_expr returns [InternalSpec ret] : f= iff_expr (op= TOK_IMPLIES s= implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:185:9: (f= iff_expr (op= TOK_IMPLIES s= implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:185:11: f= iff_expr (op= TOK_IMPLIES s= implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iff_expr_in_implies_expr594);
            f=iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:186:9: (op= TOK_IMPLIES s= implies_expr )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOK_IMPLIES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:186:11: op= TOK_IMPLIES s= implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_implies_expr610); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_implies_expr_in_implies_expr615);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:190:1: iff_expr returns [InternalSpec ret] : f= or_expr (op= TOK_IFF s= or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:193:9: (f= or_expr (op= TOK_IFF s= or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:193:11: f= or_expr (op= TOK_IFF s= or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_iff_expr681);
            f=or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:194:9: (op= TOK_IFF s= or_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TOK_IFF) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:194:11: op= TOK_IFF s= or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_iff_expr697); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expr_in_iff_expr702);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:198:1: or_expr returns [InternalSpec ret] : f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:201:9: (f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:201:11: f= and_expr (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr767);
            f=and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:202:9: (op= TOK_OR s= and_expr | op= TOK_XOR s= and_expr | op= TOK_XNOR s= and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:202:11: op= TOK_OR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_or_expr783); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr788);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:204:11: op= TOK_XOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_or_expr812); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr817);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:206:11: op= TOK_XNOR s= and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_or_expr841); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expr_in_or_expr846);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:210:1: and_expr returns [InternalSpec ret] : f= relational_expr (op= TOK_AND s= relational_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:213:9: (f= relational_expr (op= TOK_AND s= relational_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:213:11: f= relational_expr (op= TOK_AND s= relational_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expr_in_and_expr910);
            f=relational_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:214:9: (op= TOK_AND s= relational_expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TOK_AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:214:11: op= TOK_AND s= relational_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_and_expr926); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_relational_expr_in_and_expr931);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:218:1: relational_expr returns [InternalSpec ret] : f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:221:9: (f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:221:11: f= in_expr (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_relational_expr994);
            f=in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:222:9: (op= TOK_EQUAL s= in_expr | op= TOK_NOTEQUAL s= in_expr | op= TOK_LT s= in_expr | op= TOK_GT s= in_expr | op= TOK_LE s= in_expr | op= TOK_GE s= in_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:222:11: op= TOK_EQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_relational_expr1010); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1015);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:224:11: op= TOK_NOTEQUAL s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_relational_expr1040); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1045);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:226:11: op= TOK_LT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_relational_expr1070); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1075);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:228:11: op= TOK_GT s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_relational_expr1100); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1105);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:230:11: op= TOK_LE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_relational_expr1130); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1135);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:232:11: op= TOK_GE s= in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_relational_expr1160); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_in_expr_in_relational_expr1165);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:236:1: in_expr returns [InternalSpec ret] : f= union_expr (op= TOK_SETIN s= union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:239:9: (f= union_expr (op= TOK_SETIN s= union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:239:11: f= union_expr (op= TOK_SETIN s= union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_in_expr1230);
            f=union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:240:9: (op= TOK_SETIN s= union_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TOK_SETIN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:240:11: op= TOK_SETIN s= union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_in_expr1246); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_union_expr_in_in_expr1251);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:244:1: union_expr returns [InternalSpec ret] : f= set_expr (op= TOK_UNION s= set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:247:9: (f= set_expr (op= TOK_UNION s= set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:247:11: f= set_expr (op= TOK_UNION s= set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_set_expr_in_union_expr1315);
            f=set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:248:9: (op= TOK_UNION s= set_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TOK_UNION) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:248:11: op= TOK_UNION s= set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_union_expr1331); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_set_expr_in_union_expr1336);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:255:9: ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) )
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
                        new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 2, input);

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
                            new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 3, input);

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
                            new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA11_4>=TOK_PLUS && LA11_4<=TOK_MINUS)||(LA11_4>=TOK_NOT && LA11_4<=TOK_LP)||(LA11_4>=TOK_BOOL && LA11_4<=TOK_CASE)||(LA11_4>=TOK_WAREAD && LA11_4<=TOK_WAWRITE)||LA11_4==TOK_ATOM||LA11_4==TOK_NUMBER_WORD||(LA11_4>=TOK_FALSEEXP && LA11_4<=TOK_TRUEEXP)) ) {
                    alt11=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 4, input);

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
                    new NoViableAltException("252:1: set_expr returns [InternalSpec ret] : ( shift_expr | subrange | TOK_LCB set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T set_list_expr ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:255:11: shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_shift_expr_in_set_expr1398);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:257:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_set_expr1420);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:259:11: TOK_LCB set_list_expr TOK_RCB
                    {
                    TOK_LCB23=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_set_expr1443); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB23);

                    pushFollow(FOLLOW_set_list_expr_in_set_expr1445);
                    set_list_expr24=set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_set_list_expr.add(set_list_expr24.getTree());
                    TOK_RCB25=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_set_expr1447); if (failed) return retval;
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
                    // 261:9: -> ^( SET_LIST_EXP_T set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:261:12: ^( SET_LIST_EXP_T set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:263:1: set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final set_list_expr_return set_list_expr() throws RecognitionException {
        set_list_expr_return retval = new set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA27=null;
        simple_root_expr_return simple_root_expr26 = null;

        simple_root_expr_return simple_root_expr28 = null;


        Object TOK_COMMA27_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:264:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:264:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1501);
            simple_root_expr26=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr26.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:264:28: ( TOK_COMMA simple_root_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TOK_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:264:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA27=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_set_list_expr1504); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_set_list_expr1507);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:266:1: shift_expr returns [InternalSpec ret] : f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:269:9: (f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:269:11: f= remainder_expr (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_remainder_expr_in_shift_expr1552);
            f=remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:270:9: (op= TOK_LSHIFT s= remainder_expr | op= TOK_RSHIFT s= remainder_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:270:11: op= TOK_LSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_shift_expr1568); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1573);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:272:11: op= TOK_RSHIFT s= remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_shift_expr1597); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_remainder_expr_in_shift_expr1602);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:276:1: remainder_expr returns [InternalSpec ret] : f= additive_expr (op= TOK_MOD s= additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:279:9: (f= additive_expr (op= TOK_MOD s= additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:279:11: f= additive_expr (op= TOK_MOD s= additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expr_in_remainder_expr1665);
            f=additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:280:9: (op= TOK_MOD s= additive_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TOK_MOD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:280:11: op= TOK_MOD s= additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_remainder_expr1681); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additive_expr_in_remainder_expr1686);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:284:1: additive_expr returns [InternalSpec ret] : f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:287:9: (f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:287:11: f= multiplicative_expr (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1749);
            f=multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:288:9: (op= TOK_PLUS s= multiplicative_expr | op= TOK_MINUS s= multiplicative_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:288:11: op= TOK_PLUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_additive_expr1765); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1770);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:290:11: op= TOK_MINUS s= multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_additive_expr1794); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1799);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:294:1: multiplicative_expr returns [InternalSpec ret] : f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:297:9: (f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:297:11: f= concatination_expr (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1861);
            f=concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:298:9: (op= TOK_TIMES s= concatination_expr | op= TOK_DIVIDE s= concatination_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:298:11: op= TOK_TIMES s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_multiplicative_expr1877); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1882);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:300:11: op= TOK_DIVIDE s= concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_multiplicative_expr1906); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concatination_expr_in_multiplicative_expr1911);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:304:1: concatination_expr returns [InternalSpec ret] : f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:307:9: (f= primary_expr (op= TOK_CONCATENATION s= primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:307:11: f= primary_expr (op= TOK_CONCATENATION s= primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_expr_in_concatination_expr1973);
            f=primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:308:9: (op= TOK_CONCATENATION s= primary_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TOK_CONCATENATION) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:308:11: op= TOK_CONCATENATION s= primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_concatination_expr1989); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_primary_expr_in_concatination_expr1994);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:313:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:316:9: ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) )
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
                    new NoViableAltException("313:1: primary_expr returns [InternalSpec ret] : ( primary_expr_helper1 | op= TOK_MINUS v= primary_expr -> ^( TOK_UNARY_MINUS_T primary_expr ) | op= TOK_NOT v= primary_expr -> ^( TOK_NOT primary_expr ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:316:11: primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_in_primary_expr2064);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:320:11: op= TOK_MINUS v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_primary_expr2106); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2110);
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
                    // 322:9: -> ^( TOK_UNARY_MINUS_T primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:322:12: ^( TOK_UNARY_MINUS_T primary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:323:11: op= TOK_NOT v= primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_primary_expr2150); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_primary_expr_in_primary_expr2154);
                    v=primary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr.add(v.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_not(input, ((Token)retval.start), op.getText() + " " + input.toString(v.start,v.stop), v.ret); 
                    }

                    // AST REWRITE
                    // elements: primary_expr, TOK_NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:9: -> ^( TOK_NOT primary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:325:12: ^( TOK_NOT primary_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:328:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:331:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) )
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
                    new NoViableAltException("328:1: primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T simple_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select ) | TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:331:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr_helper12219);
                    constant30=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant30.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12221);
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
                    // 333:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:333:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:334:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12263);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:339:11: TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP33=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12296); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP33);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12298);
                    simple_root_expr34=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr34.getTree());
                    TOK_RP35=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12300); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP35);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12302);
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
                    // 341:9: -> ^( BLOCK_T simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:341:12: ^( BLOCK_T simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:342:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL37=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_primary_expr_helper12344); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL37);

                    TOK_LP38=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12347); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP38);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12349);
                    simple_root_expr39=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr39.getTree());
                    TOK_RP40=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12351); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP40);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12353);
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
                    // 344:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:344:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:345:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD142=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_primary_expr_helper12396); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD142);

                    TOK_LP43=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12398); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP43);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12400);
                    simple_root_expr44=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr44.getTree());
                    TOK_RP45=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12402); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP45);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12404);
                    primary_expr_select46=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select46.getTree());
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
                    // 347:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:347:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:348:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT47=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_primary_expr_helper12446); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT47);

                    TOK_LP48=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12448); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP48);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12450);
                    simple_root_expr49=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr49.getTree());
                    TOK_RP50=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12452); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP50);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12454);
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
                    // 350:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:350:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:351:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE52=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_primary_expr_helper12496); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE52);

                    pushFollow(FOLLOW_case_element_list_expr_in_primary_expr_helper12498);
                    case_element_list_expr53=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr53.getTree());
                    TOK_ESAC54=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_primary_expr_helper12500); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC54);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12502);
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
                    // 353:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:353:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:354:11: TOK_WAREAD TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD56=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_primary_expr_helper12544); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD56);

                    TOK_LP57=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12546); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP57);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12548);
                    simple_root_expr58=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr58.getTree());
                    TOK_COMMA59=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12550); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA59);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12552);
                    simple_root_expr60=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr60.getTree());
                    TOK_RP61=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12554); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP61);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12556);
                    primary_expr_select62=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select62.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, simple_root_expr, simple_root_expr, TOK_WAREAD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:9: -> ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:356:12: ^( TOK_WAREAD simple_root_expr simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:357:11: TOK_WAWRITE TOK_LP simple_root_expr TOK_COMMA simple_root_expr TOK_COMMA simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE63=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_primary_expr_helper12600); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE63);

                    TOK_LP64=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_primary_expr_helper12602); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP64);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12604);
                    simple_root_expr65=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr65.getTree());
                    TOK_COMMA66=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12606); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA66);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12608);
                    simple_root_expr67=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr67.getTree());
                    TOK_COMMA68=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_primary_expr_helper12610); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA68);

                    pushFollow(FOLLOW_simple_root_expr_in_primary_expr_helper12612);
                    simple_root_expr69=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr69.getTree());
                    TOK_RP70=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_primary_expr_helper12614); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP70);

                    pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper12616);
                    primary_expr_select71=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select71.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: simple_root_expr, primary_expr_select, simple_root_expr, TOK_WAWRITE, simple_root_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:9: -> ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:359:12: ^( TOK_WAWRITE simple_root_expr simple_root_expr simple_root_expr NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:365:1: ctl_root_expr returns [InternalSpec ret] : ctl_implies_expr ;
    public final ctl_root_expr_return ctl_root_expr() throws RecognitionException {
        ctl_root_expr_return retval = new ctl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctl_implies_expr_return ctl_implies_expr72 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:366:9: ( ctl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:366:11: ctl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_implies_expr_in_ctl_root_expr2684);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:368:1: ctl_implies_expr returns [InternalSpec ret] : f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:371:9: (f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:371:11: f= ctl_iff_expr (op= TOK_IMPLIES s= ctl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_iff_expr_in_ctl_implies_expr2727);
            f=ctl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:372:9: (op= TOK_IMPLIES s= ctl_implies_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TOK_IMPLIES) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:372:11: op= TOK_IMPLIES s= ctl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2743); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_implies_expr_in_ctl_implies_expr2748);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:376:1: ctl_iff_expr returns [InternalSpec ret] : f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:379:9: (f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:379:11: f= ctl_or_expr (op= TOK_IFF s= ctl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2813);
            f=ctl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:380:9: (op= TOK_IFF s= ctl_or_expr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TOK_IFF) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:380:11: op= TOK_IFF s= ctl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctl_iff_expr2829); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_or_expr_in_ctl_iff_expr2834);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:384:1: ctl_or_expr returns [InternalSpec ret] : f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:387:9: (f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:387:11: f= ctl_and_expr (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2898);
            f=ctl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:388:9: (op= TOK_OR s= ctl_and_expr | op= TOK_XOR s= ctl_and_expr | op= TOK_XNOR s= ctl_and_expr )*
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:388:11: op= TOK_OR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctl_or_expr2914); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2919);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:390:11: op= TOK_XOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctl_or_expr2943); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2948);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:392:11: op= TOK_XNOR s= ctl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctl_or_expr2972); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_and_expr_in_ctl_or_expr2977);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:396:1: ctl_and_expr returns [InternalSpec ret] : f= ctl_expr (op= TOK_AND s= ctl_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:399:9: (f= ctl_expr (op= TOK_AND s= ctl_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:399:11: f= ctl_expr (op= TOK_AND s= ctl_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3040);
            f=ctl_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:400:9: (op= TOK_AND s= ctl_expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TOK_AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:400:11: op= TOK_AND s= ctl_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctl_and_expr3056); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_expr_in_ctl_and_expr3061);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:404:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );
    public final ctl_expr_return ctl_expr() throws RecognitionException {
        ctl_expr_return retval = new ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        pure_ctl_expr_return pure_ctl_expr73 = null;

        ctl_relational_expr_return ctl_relational_expr74 = null;


        RewriteRuleSubtreeStream stream_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr )
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
                            new NoViableAltException("404:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 15, input);

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
                        new NoViableAltException("404:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==TOK_LCB||(LA24_0>=TOK_PLUS && LA24_0<=TOK_MINUS)||LA24_0==TOK_LP||(LA24_0>=TOK_BOOL && LA24_0<=TOK_CASE)||(LA24_0>=TOK_WAREAD && LA24_0<=TOK_WAWRITE)||LA24_0==TOK_ATOM||LA24_0==TOK_NUMBER||LA24_0==TOK_NUMBER_WORD||(LA24_0>=TOK_FALSEEXP && LA24_0<=TOK_TRUEEXP)) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("404:1: ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr -> ^( PURE_CTL_T pure_ctl_expr ) | ctl_relational_expr );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> pure_ctl_expr
                    {
                    pushFollow(FOLLOW_pure_ctl_expr_in_ctl_expr3289);
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
                    // 419:11: -> ^( PURE_CTL_T pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:419:14: ^( PURE_CTL_T pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:420:11: ctl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_relational_expr_in_ctl_expr3329);
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

    public static class pure_ctl_epistemic_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pure_ctl_epistemic_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:428:1: pure_ctl_epistemic_expr returns [InternalSpec ret] : ( ( TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP )=> ctl_know | op= TOK_NOT fp= pure_ctl_epistemic_expr );
    public final pure_ctl_epistemic_expr_return pure_ctl_epistemic_expr() throws RecognitionException {
        pure_ctl_epistemic_expr_return retval = new pure_ctl_epistemic_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        pure_ctl_epistemic_expr_return fp = null;

        ctl_know_return ctl_know75 = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:431:3: ( ( TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP )=> ctl_know | op= TOK_NOT fp= pure_ctl_epistemic_expr )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==TOK_LP) && (synpred2())) {
                alt25=1;
            }
            else if ( (LA25_0==TOK_NOT) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("428:1: pure_ctl_epistemic_expr returns [InternalSpec ret] : ( ( TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP )=> ctl_know | op= TOK_NOT fp= pure_ctl_epistemic_expr );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:431:5: ( TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP )=> ctl_know
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_know_in_pure_ctl_epistemic_expr3390);
                    ctl_know75=ctl_know();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_know75.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_know75.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:433:5: op= TOK_NOT fp= pure_ctl_epistemic_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_pure_ctl_epistemic_expr3403); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_pure_ctl_epistemic_expr_in_pure_ctl_epistemic_expr3408);
                    fp=pure_ctl_epistemic_expr();
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
    // $ANTLR end pure_ctl_epistemic_expr

    public static class ctl_know_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_know
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:437:1: ctl_know returns [InternalSpec ret] : lb= TOK_LP agent= agent_name op= TOK_KNOW f= ctl_root_expr rb= TOK_RP ;
    public final ctl_know_return ctl_know() throws RecognitionException {
        ctl_know_return retval = new ctl_know_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token op=null;
        Token rb=null;
        agent_name_return agent = null;

        ctl_root_expr_return f = null;


        Object lb_tree=null;
        Object op_tree=null;
        Object rb_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:440:9: (lb= TOK_LP agent= agent_name op= TOK_KNOW f= ctl_root_expr rb= TOK_RP )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:440:11: lb= TOK_LP agent= agent_name op= TOK_KNOW f= ctl_root_expr rb= TOK_RP
            {
            root_0 = (Object)adaptor.nil();

            lb=(Token)input.LT(1);
            match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_know3452); if (failed) return retval;
            pushFollow(FOLLOW_agent_name_in_ctl_know3457);
            agent=agent_name();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, agent.getTree());
            op=(Token)input.LT(1);
            match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ctl_know3461); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_know3466);
            f=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_know3470); if (failed) return retval;
            if ( backtracking==0 ) {
               if (!er()) exp_str = lb.getText() + input.toString(agent.start,agent.stop) + op.getText() + input.toString(f.start,f.stop) + rb.getText(); 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:445:1: agent_name returns [InternalSpecAgentIdentifier ret] : agentName= TOK_ATOM ;
    public final agent_name_return agent_name() throws RecognitionException {
        agent_name_return retval = new agent_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token agentName=null;

        Object agentName_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:447:9: (agentName= TOK_ATOM )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:447:11: agentName= TOK_ATOM
            {
            root_0 = (Object)adaptor.nil();

            agentName=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_agent_name3509); if (failed) return retval;
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

    public static class pure_ctl_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pure_ctl_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );
    public final pure_ctl_expr_return pure_ctl_expr() throws RecognitionException {
        pure_ctl_expr_return retval = new pure_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctl_expr_return f = null;

        subrange_return fsr = null;

        ctl_expr_return s = null;

        pure_ctl_expr_return fp = null;

        ctl_au_return ctl_au76 = null;

        ctl_abu_return ctl_abu77 = null;

        ctl_eu_return ctl_eu78 = null;

        ctl_ebu_return ctl_ebu79 = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:454:9: (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr )
            int alt26=15;
            switch ( input.LA(1) ) {
            case TOK_EX:
                {
                alt26=1;
                }
                break;
            case TOK_AX:
                {
                alt26=2;
                }
                break;
            case TOK_EF:
                {
                alt26=3;
                }
                break;
            case TOK_AF:
                {
                alt26=4;
                }
                break;
            case TOK_EG:
                {
                alt26=5;
                }
                break;
            case TOK_AG:
                {
                alt26=6;
                }
                break;
            case TOK_AA:
                {
                int LA26_7 = input.LA(2);

                if ( (LA26_7==TOK_LB) ) {
                    int LA26_14 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt26=7;
                    }
                    else if ( (synpred4()) ) {
                        alt26=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 26, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 26, 7, input);

                    throw nvae;
                }
                }
                break;
            case TOK_EE:
                {
                int LA26_8 = input.LA(2);

                if ( (LA26_8==TOK_LB) ) {
                    int LA26_15 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt26=9;
                    }
                    else if ( (synpred6()) ) {
                        alt26=10;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 26, 15, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 26, 8, input);

                    throw nvae;
                }
                }
                break;
            case TOK_EBF:
                {
                alt26=11;
                }
                break;
            case TOK_ABF:
                {
                alt26=12;
                }
                break;
            case TOK_EBG:
                {
                alt26=13;
                }
                break;
            case TOK_ABG:
                {
                alt26=14;
                }
                break;
            case TOK_NOT:
                {
                alt26=15;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("451:1: pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctl_expr | op= TOK_AX f= ctl_expr | op= TOK_EF f= ctl_expr | op= TOK_AF f= ctl_expr | op= TOK_EG f= ctl_expr | op= TOK_AG f= ctl_expr | ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au | ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu | ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu | ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu | op= TOK_EBF fsr= subrange s= ctl_expr | op= TOK_ABF fsr= subrange s= ctl_expr | op= TOK_EBG fsr= subrange s= ctl_expr | op= TOK_ABG fsr= subrange s= ctl_expr | op= TOK_NOT fp= pure_ctl_expr );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:454:11: op= TOK_EX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_pure_ctl_expr3575); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3580);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:456:11: op= TOK_AX f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_pure_ctl_expr3604); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3609);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:458:11: op= TOK_EF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_pure_ctl_expr3633); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3638);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:460:11: op= TOK_AF f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_pure_ctl_expr3662); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3667);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:462:11: op= TOK_EG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_pure_ctl_expr3691); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3696);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:464:11: op= TOK_AG f= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_pure_ctl_expr3720); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3725);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:474:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_au_in_pure_ctl_expr3831);
                    ctl_au76=ctl_au();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_au76.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_au76.ret; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:475:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_abu_in_pure_ctl_expr3857);
                    ctl_abu77=ctl_abu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_abu77.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_abu77.ret; 
                    }

                    }
                    break;
                case 9 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:476:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )=> ctl_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_eu_in_pure_ctl_expr3883);
                    ctl_eu78=ctl_eu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_eu78.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_eu78.ret; 
                    }

                    }
                    break;
                case 10 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:477:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )=> ctl_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_ebu_in_pure_ctl_expr3909);
                    ctl_ebu79=ctl_ebu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_ebu79.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_ebu79.ret; 
                    }

                    }
                    break;
                case 11 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:478:11: op= TOK_EBF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_pure_ctl_expr3925); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3930);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3934);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:480:11: op= TOK_ABF fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_pure_ctl_expr3958); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3963);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr3967);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:482:11: op= TOK_EBG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_pure_ctl_expr3991); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr3996);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr4000);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:484:11: op= TOK_ABG fsr= subrange s= ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_pure_ctl_expr4024); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_pure_ctl_expr4029);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctl_expr_in_pure_ctl_expr4033);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:487:11: op= TOK_NOT fp= pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_pure_ctl_expr4067); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_pure_ctl_expr_in_pure_ctl_expr4072);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:490:1: ctl_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:493:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:493:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_au4126); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_au4131); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au4136);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_au4140); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_au4144);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_au4148); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:496:1: ctl_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:499:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:499:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_UNTIL sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_eu4203); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_eu4208); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4213);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctl_eu4217); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_eu4221);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_eu4225); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:502:1: ctl_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:505:9: (op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:505:11: op= TOK_AA lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctl_abu4280); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_abu4285); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4290);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_abu4294); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_abu4298);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_abu4302);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_abu4306); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:508:1: ctl_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:511:9: (op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:511:11: op= TOK_EE lb= TOK_LB fre= ctl_root_expr opu= TOK_BUNTIL msr= subrange sre= ctl_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctl_ebu4361); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctl_ebu4366); if (failed) return retval;
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4371);
            fre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctl_ebu4375); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctl_ebu4379);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctl_root_expr_in_ctl_ebu4383);
            sre=ctl_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctl_ebu4387); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:515:1: ctl_relational_expr returns [InternalSpec ret] : f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:518:9: (f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:518:11: f= ctl_in_expr (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4448);
            f=ctl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:519:9: (op= TOK_EQUAL s= ctl_in_expr | op= TOK_NOTEQUAL s= ctl_in_expr | op= TOK_LT s= ctl_in_expr | op= TOK_GT s= ctl_in_expr | op= TOK_LE s= ctl_in_expr | op= TOK_GE s= ctl_in_expr )*
            loop27:
            do {
                int alt27=7;
                switch ( input.LA(1) ) {
                case TOK_EQUAL:
                    {
                    alt27=1;
                    }
                    break;
                case TOK_NOTEQUAL:
                    {
                    alt27=2;
                    }
                    break;
                case TOK_LT:
                    {
                    alt27=3;
                    }
                    break;
                case TOK_GT:
                    {
                    alt27=4;
                    }
                    break;
                case TOK_LE:
                    {
                    alt27=5;
                    }
                    break;
                case TOK_GE:
                    {
                    alt27=6;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:519:11: op= TOK_EQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctl_relational_expr4464); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4469);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:521:11: op= TOK_NOTEQUAL s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4494); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4499);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:523:11: op= TOK_LT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctl_relational_expr4524); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4529);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:525:11: op= TOK_GT s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctl_relational_expr4554); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4559);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:527:11: op= TOK_LE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctl_relational_expr4584); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4589);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:529:11: op= TOK_GE s= ctl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctl_relational_expr4614); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_in_expr_in_ctl_relational_expr4619);
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
    // $ANTLR end ctl_relational_expr

    public static class ctl_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_in_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:533:1: ctl_in_expr returns [InternalSpec ret] : f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:536:9: (f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:536:11: f= ctl_union_expr (op= TOK_SETIN s= ctl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4683);
            f=ctl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:537:9: (op= TOK_SETIN s= ctl_union_expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==TOK_SETIN) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:537:11: op= TOK_SETIN s= ctl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctl_in_expr4699); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_union_expr_in_ctl_in_expr4704);
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
    // $ANTLR end ctl_in_expr

    public static class ctl_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_union_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:541:1: ctl_union_expr returns [InternalSpec ret] : f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:544:9: (f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:544:11: f= ctl_set_expr (op= TOK_UNION s= ctl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4767);
            f=ctl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:545:9: (op= TOK_UNION s= ctl_set_expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==TOK_UNION) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:545:11: op= TOK_UNION s= ctl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctl_union_expr4783); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_set_expr_in_ctl_union_expr4788);
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
            	    break loop29;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );
    public final ctl_set_expr_return ctl_set_expr() throws RecognitionException {
        ctl_set_expr_return retval = new ctl_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB82=null;
        Token TOK_RCB84=null;
        ctl_shift_expr_return ctl_shift_expr80 = null;

        subrange_return subrange81 = null;

        ctl_set_list_expr_return ctl_set_list_expr83 = null;


        Object TOK_LCB82_tree=null;
        Object TOK_RCB84_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ctl_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:552:9: ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) )
            int alt30=3;
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
                alt30=1;
                }
                break;
            case TOK_NUMBER:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==TOK_TWODOTS) ) {
                    alt30=2;
                }
                else if ( (LA30_2==EOF||(LA30_2>=TOK_INVAR_SPEC && LA30_2<=TOK_UNION)||(LA30_2>=TOK_LSHIFT && LA30_2<=TOK_CONCATENATION)||LA30_2==TOK_RP||(LA30_2>=TOK_LB && LA30_2<=TOK_RB)||LA30_2==TOK_BUNTIL||LA30_2==TOK_DOT||LA30_2==TOK_SEMI) ) {
                    alt30=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==TOK_NUMBER) ) {
                    int LA30_7 = input.LA(3);

                    if ( (LA30_7==EOF||(LA30_7>=TOK_INVAR_SPEC && LA30_7<=TOK_UNION)||(LA30_7>=TOK_LSHIFT && LA30_7<=TOK_CONCATENATION)||LA30_7==TOK_RP||(LA30_7>=TOK_LB && LA30_7<=TOK_RB)||LA30_7==TOK_BUNTIL||LA30_7==TOK_DOT||LA30_7==TOK_SEMI) ) {
                        alt30=1;
                    }
                    else if ( (LA30_7==TOK_TWODOTS) ) {
                        alt30=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==TOK_NUMBER) ) {
                    int LA30_8 = input.LA(3);

                    if ( (LA30_8==EOF||(LA30_8>=TOK_INVAR_SPEC && LA30_8<=TOK_UNION)||(LA30_8>=TOK_LSHIFT && LA30_8<=TOK_CONCATENATION)||LA30_8==TOK_RP||(LA30_8>=TOK_LB && LA30_8<=TOK_RB)||LA30_8==TOK_BUNTIL||LA30_8==TOK_DOT||LA30_8==TOK_SEMI) ) {
                        alt30=1;
                    }
                    else if ( (LA30_8==TOK_TWODOTS) ) {
                        alt30=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA30_4>=TOK_PLUS && LA30_4<=TOK_MINUS)||(LA30_4>=TOK_NOT && LA30_4<=TOK_LP)||(LA30_4>=TOK_BOOL && LA30_4<=TOK_CASE)||(LA30_4>=TOK_WAREAD && LA30_4<=TOK_WAWRITE)||LA30_4==TOK_ATOM||LA30_4==TOK_NUMBER_WORD||(LA30_4>=TOK_FALSEEXP && LA30_4<=TOK_TRUEEXP)) ) {
                    alt30=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            case TOK_LCB:
                {
                alt30=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("549:1: ctl_set_expr returns [InternalSpec ret] : ( ctl_shift_expr | subrange | TOK_LCB ctl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctl_set_list_expr ) );", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:552:11: ctl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_shift_expr_in_ctl_set_expr4849);
                    ctl_shift_expr80=ctl_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_shift_expr80.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_shift_expr80.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:554:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctl_set_expr4871);
                    subrange81=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange81.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange81.start,subrange81.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:556:11: TOK_LCB ctl_set_list_expr TOK_RCB
                    {
                    TOK_LCB82=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctl_set_expr4894); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB82);

                    pushFollow(FOLLOW_ctl_set_list_expr_in_ctl_set_expr4896);
                    ctl_set_list_expr83=ctl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_set_list_expr.add(ctl_set_list_expr83.getTree());
                    TOK_RCB84=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctl_set_expr4898); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB84);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB82.getText() + " " + input.toString(ctl_set_list_expr83.start,ctl_set_list_expr83.stop) + " " + TOK_RCB84.getText()); 
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
                    // 558:9: -> ^( SET_LIST_EXP_T ctl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:558:12: ^( SET_LIST_EXP_T ctl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:560:1: ctl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctl_set_list_expr_return ctl_set_list_expr() throws RecognitionException {
        ctl_set_list_expr_return retval = new ctl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA86=null;
        simple_root_expr_return simple_root_expr85 = null;

        simple_root_expr_return simple_root_expr87 = null;


        Object TOK_COMMA86_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:561:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:561:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4951);
            simple_root_expr85=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr85.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:561:28: ( TOK_COMMA simple_root_expr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==TOK_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:561:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA86=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_set_list_expr4954); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctl_set_list_expr4957);
            	    simple_root_expr87=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr87.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:563:1: ctl_shift_expr returns [InternalSpec ret] : f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:566:9: (f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:566:11: f= ctl_remainder_expr (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5003);
            f=ctl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:9: (op= TOK_LSHIFT s= ctl_remainder_expr | op= TOK_RSHIFT s= ctl_remainder_expr )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TOK_LSHIFT) ) {
                    alt32=1;
                }
                else if ( (LA32_0==TOK_RSHIFT) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:567:11: op= TOK_LSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctl_shift_expr5019); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5024);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:569:11: op= TOK_RSHIFT s= ctl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctl_shift_expr5048); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5053);
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
    // $ANTLR end ctl_shift_expr

    public static class ctl_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_remainder_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:573:1: ctl_remainder_expr returns [InternalSpec ret] : f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:576:9: (f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:576:11: f= ctl_additive_expr (op= TOK_MOD s= ctl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr5115);
            f=ctl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:577:9: (op= TOK_MOD s= ctl_additive_expr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==TOK_MOD) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:577:11: op= TOK_MOD s= ctl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctl_remainder_expr5131); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_additive_expr_in_ctl_remainder_expr5136);
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
    // $ANTLR end ctl_remainder_expr

    public static class ctl_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_additive_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:583:1: ctl_additive_expr returns [InternalSpec ret] : f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:586:9: (f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:586:11: f= ctl_multiplicative_expr (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5200);
            f=ctl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:587:9: (op= TOK_PLUS s= ctl_multiplicative_expr | op= TOK_MINUS s= ctl_multiplicative_expr )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==TOK_PLUS) ) {
                    alt34=1;
                }
                else if ( (LA34_0==TOK_MINUS) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:587:11: op= TOK_PLUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctl_additive_expr5216); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5221);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:589:11: op= TOK_MINUS s= ctl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_additive_expr5245); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5250);
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
    // $ANTLR end ctl_additive_expr

    public static class ctl_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_multiplicative_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:593:1: ctl_multiplicative_expr returns [InternalSpec ret] : f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:596:9: (f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:596:11: f= ctl_concatination_expr (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5311);
            f=ctl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:597:9: (op= TOK_TIMES s= ctl_concatination_expr | op= TOK_DIVIDE s= ctl_concatination_expr )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==TOK_TIMES) ) {
                    alt35=1;
                }
                else if ( (LA35_0==TOK_DIVIDE) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:597:11: op= TOK_TIMES s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5327); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5332);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:599:11: op= TOK_DIVIDE s= ctl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5356); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5361);
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
    // $ANTLR end ctl_multiplicative_expr

    public static class ctl_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctl_concatination_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:603:1: ctl_concatination_expr returns [InternalSpec ret] : f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:606:9: (f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:606:11: f= ctl_primary_expr (op= TOK_CONCATENATION s= ctl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5422);
            f=ctl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:607:9: (op= TOK_CONCATENATION s= ctl_primary_expr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==TOK_CONCATENATION) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:607:11: op= TOK_CONCATENATION s= ctl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5438); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5443);
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
            	    break loop36;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:612:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );
    public final ctl_primary_expr_return ctl_primary_expr() throws RecognitionException {
        ctl_primary_expr_return retval = new ctl_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctl_primary_expr_return v = null;

        ctl_primary_expr_helper1_return ctl_primary_expr_helper188 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ctl_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctl_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:615:9: ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) )
            int alt37=3;
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
                alt37=1;
                }
                break;
            case TOK_MINUS:
                {
                alt37=2;
                }
                break;
            case TOK_NOT:
                {
                alt37=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("612:1: ctl_primary_expr returns [InternalSpec ret] : ( ctl_primary_expr_helper1 | op= TOK_MINUS v= ctl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctl_primary_expr -> ^( TOK_NOT $v) );", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:615:11: ctl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5512);
                    ctl_primary_expr_helper188=ctl_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctl_primary_expr_helper188.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_primary_expr_helper188.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:617:11: op= TOK_MINUS v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctl_primary_expr5536); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5540);
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
                    // 619:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:619:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:620:11: op= TOK_NOT v= ctl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctl_primary_expr5581); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctl_primary_expr_in_ctl_primary_expr5585);
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
                    // 622:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:622:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:625:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctl_primary_expr_helper1_return ctl_primary_expr_helper1() throws RecognitionException {
        ctl_primary_expr_helper1_return retval = new ctl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP94=null;
        Token TOK_RP96=null;
        Token TOK_BOOL98=null;
        Token TOK_LP99=null;
        Token TOK_RP101=null;
        Token TOK_WORD1103=null;
        Token TOK_LP104=null;
        Token TOK_RP106=null;
        Token TOK_NEXT108=null;
        Token TOK_LP109=null;
        Token TOK_RP111=null;
        Token TOK_CASE113=null;
        Token TOK_ESAC115=null;
        Token TOK_WAREAD117=null;
        Token TOK_LP118=null;
        Token TOK_COMMA119=null;
        Token TOK_RP120=null;
        Token TOK_WAWRITE122=null;
        Token TOK_LP123=null;
        Token TOK_RP124=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant89 = null;

        primary_expr_select_return primary_expr_select90 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer191 = null;

        ctl_know_return ctl_know92 = null;

        primary_expr_select_return primary_expr_select93 = null;

        ctl_root_expr_return ctl_root_expr95 = null;

        primary_expr_select_return primary_expr_select97 = null;

        simple_root_expr_return simple_root_expr100 = null;

        primary_expr_select_return primary_expr_select102 = null;

        simple_root_expr_return simple_root_expr105 = null;

        primary_expr_select_return primary_expr_select107 = null;

        simple_root_expr_return simple_root_expr110 = null;

        primary_expr_select_return primary_expr_select112 = null;

        case_element_list_expr_return case_element_list_expr114 = null;

        primary_expr_select_return primary_expr_select116 = null;

        primary_expr_select_return primary_expr_select121 = null;

        primary_expr_select_return primary_expr_select125 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP94_tree=null;
        Object TOK_RP96_tree=null;
        Object TOK_BOOL98_tree=null;
        Object TOK_LP99_tree=null;
        Object TOK_RP101_tree=null;
        Object TOK_WORD1103_tree=null;
        Object TOK_LP104_tree=null;
        Object TOK_RP106_tree=null;
        Object TOK_NEXT108_tree=null;
        Object TOK_LP109_tree=null;
        Object TOK_RP111_tree=null;
        Object TOK_CASE113_tree=null;
        Object TOK_ESAC115_tree=null;
        Object TOK_WAREAD117_tree=null;
        Object TOK_LP118_tree=null;
        Object TOK_COMMA119_tree=null;
        Object TOK_RP120_tree=null;
        Object TOK_WAWRITE122_tree=null;
        Object TOK_LP123_tree=null;
        Object TOK_RP124_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:628:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt38=10;
            switch ( input.LA(1) ) {
            case TOK_PLUS:
            case TOK_NUMBER:
            case TOK_NUMBER_WORD:
            case TOK_FALSEEXP:
            case TOK_TRUEEXP:
                {
                alt38=1;
                }
                break;
            case TOK_ATOM:
                {
                alt38=2;
                }
                break;
            case TOK_LP:
                {
                int LA38_3 = input.LA(2);

                if ( (LA38_3==TOK_LCB||(LA38_3>=TOK_PLUS && LA38_3<=TOK_MINUS)||(LA38_3>=TOK_NOT && LA38_3<=TOK_LP)||(LA38_3>=TOK_BOOL && LA38_3<=TOK_CASE)||(LA38_3>=TOK_WAREAD && LA38_3<=TOK_WAWRITE)||(LA38_3>=TOK_EX && LA38_3<=TOK_AA)||LA38_3==TOK_EE||LA38_3==TOK_NUMBER||LA38_3==TOK_NUMBER_WORD||(LA38_3>=TOK_FALSEEXP && LA38_3<=TOK_TRUEEXP)) ) {
                    alt38=4;
                }
                else if ( (LA38_3==TOK_ATOM) ) {
                    int LA38_11 = input.LA(3);

                    if ( ((LA38_11>=TOK_IMPLIES && LA38_11<=TOK_UNION)||(LA38_11>=TOK_LSHIFT && LA38_11<=TOK_CONCATENATION)||LA38_11==TOK_RP||LA38_11==TOK_LB||LA38_11==TOK_DOT) ) {
                        alt38=4;
                    }
                    else if ( (LA38_11==TOK_KNOW) ) {
                        alt38=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("625:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 38, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 38, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_BOOL:
                {
                alt38=5;
                }
                break;
            case TOK_WORD1:
                {
                alt38=6;
                }
                break;
            case TOK_NEXT:
                {
                alt38=7;
                }
                break;
            case TOK_CASE:
                {
                alt38=8;
                }
                break;
            case TOK_WAREAD:
                {
                alt38=9;
                }
                break;
            case TOK_WAWRITE:
                {
                alt38=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("625:1: ctl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | ctl_know primary_expr_select -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select ) | TOK_LP ctl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:628:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctl_primary_expr_helper15650);
                    constant89=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant89.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15652);
                    primary_expr_select90=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select90.getTree());
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
                    // 631:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:631:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:632:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15703);
                    primary_expr_helper1_pointer191=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer191.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:639:11: ctl_know primary_expr_select
                    {
                    pushFollow(FOLLOW_ctl_know_in_ctl_primary_expr_helper15746);
                    ctl_know92=ctl_know();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_know.add(ctl_know92.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15748);
                    primary_expr_select93=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select93.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_know92.ret; 
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
                    // 641:9: -> ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:641:12: ^( CTL_KNOW_T ctl_know NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:645:11: TOK_LP ctl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP94=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15802); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP94);

                    pushFollow(FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15804);
                    ctl_root_expr95=ctl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctl_root_expr.add(ctl_root_expr95.getTree());
                    TOK_RP96=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15806); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP96);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15808);
                    primary_expr_select97=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select97.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctl_root_expr95.ret; 
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
                    // 647:9: -> ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:647:12: ^( BLOCK_T ctl_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:651:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL98=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15879); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL98);

                    TOK_LP99=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15881); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP99);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15883);
                    simple_root_expr100=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr100.getTree());
                    TOK_RP101=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15885); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP101);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15887);
                    primary_expr_select102=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select102.getTree());
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
                    // 654:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:654:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:655:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1103=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15938); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1103);

                    TOK_LP104=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper15940); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP104);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15942);
                    simple_root_expr105=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr105.getTree());
                    TOK_RP106=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper15944); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP106);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15946);
                    primary_expr_select107=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select107.getTree());
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
                    // 658:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:658:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:660:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT108=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper16006); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT108);

                    TOK_LP109=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16008); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP109);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16010);
                    simple_root_expr110=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr110.getTree());
                    TOK_RP111=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16012); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP111);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16014);
                    primary_expr_select112=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select112.getTree());
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
                    // 663:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:663:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:665:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE113=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctl_primary_expr_helper16074); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE113);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper16076);
                    case_element_list_expr114=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr114.getTree());
                    TOK_ESAC115=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper16078); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC115);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16080);
                    primary_expr_select116=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select116.getTree());
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
                    // 668:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:668:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:670:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD117=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16140); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD117);

                    TOK_LP118=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16142); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP118);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16146);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA119=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16148); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA119);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16152);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP120=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16154); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP120);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16156);
                    primary_expr_select121=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select121.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAREAD, f, s, primary_expr_select
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
                    // 673:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:673:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:675:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE122=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16220); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE122);

                    TOK_LP123=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctl_primary_expr_helper16222); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP123);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16226);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16230); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16234);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16238); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16242);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP124=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctl_primary_expr_helper16244); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP124);

                    pushFollow(FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16246);
                    primary_expr_select125=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select125.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: s, primary_expr_select, m, f, TOK_WAWRITE
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
                    // 678:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:678:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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

    public static class ltl_root_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_root_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:684:1: ltl_root_expr returns [InternalSpec ret] : ltl_implies_expr ;
    public final ltl_root_expr_return ltl_root_expr() throws RecognitionException {
        ltl_root_expr_return retval = new ltl_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_implies_expr_return ltl_implies_expr126 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:685:9: ( ltl_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:685:11: ltl_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_implies_expr_in_ltl_root_expr6326);
            ltl_implies_expr126=ltl_implies_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ltl_implies_expr126.getTree());
            if ( backtracking==0 ) {
              if(!er()) retval.ret = ltl_implies_expr126.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:687:1: ltl_implies_expr returns [InternalSpec ret] : f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:690:9: (f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:690:11: f= ltl_iff_expr (op= TOK_IMPLIES s= ltl_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_iff_expr_in_ltl_implies_expr6369);
            f=ltl_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:691:9: (op= TOK_IMPLIES s= ltl_implies_expr )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TOK_IMPLIES) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:691:11: op= TOK_IMPLIES s= ltl_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6385); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_implies_expr_in_ltl_implies_expr6390);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:695:1: ltl_iff_expr returns [InternalSpec ret] : f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:698:9: (f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:698:11: f= ltl_or_expr (op= TOK_IFF s= ltl_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6455);
            f=ltl_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:699:9: (op= TOK_IFF s= ltl_or_expr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TOK_IFF) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:699:11: op= TOK_IFF s= ltl_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ltl_iff_expr6471); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_or_expr_in_ltl_iff_expr6476);
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
    // $ANTLR end ltl_iff_expr

    public static class ltl_or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_or_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:703:1: ltl_or_expr returns [InternalSpec ret] : f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:706:9: (f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:706:11: f= ltl_and_expr (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6540);
            f=ltl_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:707:9: (op= TOK_OR s= ltl_and_expr | op= TOK_XOR s= ltl_and_expr | op= TOK_XNOR s= ltl_and_expr )*
            loop41:
            do {
                int alt41=4;
                switch ( input.LA(1) ) {
                case TOK_OR:
                    {
                    alt41=1;
                    }
                    break;
                case TOK_XOR:
                    {
                    alt41=2;
                    }
                    break;
                case TOK_XNOR:
                    {
                    alt41=3;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:707:11: op= TOK_OR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ltl_or_expr6556); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6561);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:709:11: op= TOK_XOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ltl_or_expr6585); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6590);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:711:11: op= TOK_XNOR s= ltl_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ltl_or_expr6614); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_and_expr_in_ltl_or_expr6619);
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
    // $ANTLR end ltl_or_expr

    public static class ltl_and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_and_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:715:1: ltl_and_expr returns [InternalSpec ret] : f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:718:9: (f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:718:11: f= ltl_binary_expr (op= TOK_AND s= ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6682);
            f=ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:719:9: (op= TOK_AND s= ltl_binary_expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==TOK_AND) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:719:11: op= TOK_AND s= ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ltl_and_expr6698); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_binary_expr_in_ltl_and_expr6703);
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
    // $ANTLR end ltl_and_expr

    public static class ltl_binary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_binary_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:725:1: ltl_binary_expr returns [InternalSpec ret] : f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:728:9: (f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:728:11: f= ltl_unary_expr (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6768);
            f=ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:729:9: (op= TOK_UNTIL s= ltl_unary_expr | op= TOK_SINCE s= ltl_unary_expr | op= TOK_RELEASES s= ltl_unary_expr | op= TOK_TRIGGERED s= ltl_unary_expr | op= TOK_KNOW s= ltl_unary_expr )*
            loop43:
            do {
                int alt43=6;
                switch ( input.LA(1) ) {
                case TOK_UNTIL:
                    {
                    alt43=1;
                    }
                    break;
                case TOK_SINCE:
                    {
                    alt43=2;
                    }
                    break;
                case TOK_RELEASES:
                    {
                    alt43=3;
                    }
                    break;
                case TOK_TRIGGERED:
                    {
                    alt43=4;
                    }
                    break;
                case TOK_KNOW:
                    {
                    alt43=5;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:729:11: op= TOK_UNTIL s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ltl_binary_expr6784); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6789);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:731:11: op= TOK_SINCE s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ltl_binary_expr6814); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6819);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:733:11: op= TOK_RELEASES s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ltl_binary_expr6844); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6849);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:735:11: op= TOK_TRIGGERED s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6874); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6879);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:738:11: op= TOK_KNOW s= ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_ltl_binary_expr6912); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_binary_expr6917);
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
            	    break loop43;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:742:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );
    public final ltl_unary_expr_return ltl_unary_expr() throws RecognitionException {
        ltl_unary_expr_return retval = new ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ltl_pure_unary_expr_return ltl_pure_unary_expr127 = null;

        ltl_relational_expr_return ltl_relational_expr128 = null;


        RewriteRuleSubtreeStream stream_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==TOK_OP_NEXT) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_PREV) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_NOTPREVNOT) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_GLOBALLY) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_HISTORICALLY) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_FINALLY) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_OP_ONCE) && (synpred7())) {
                alt44=1;
            }
            else if ( (LA44_0==TOK_NOT) ) {
                int LA44_8 = input.LA(2);

                if ( ((LA44_8>=TOK_PLUS && LA44_8<=TOK_MINUS)||LA44_8==TOK_LP||(LA44_8>=TOK_BOOL && LA44_8<=TOK_CASE)||(LA44_8>=TOK_WAREAD && LA44_8<=TOK_WAWRITE)||LA44_8==TOK_ATOM||LA44_8==TOK_NUMBER||LA44_8==TOK_NUMBER_WORD||(LA44_8>=TOK_FALSEEXP && LA44_8<=TOK_TRUEEXP)) ) {
                    alt44=2;
                }
                else if ( (LA44_8==TOK_NOT) ) {
                    int LA44_10 = input.LA(3);

                    if ( (synpred7()) ) {
                        alt44=1;
                    }
                    else if ( (true) ) {
                        alt44=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("742:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 44, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA44_8==TOK_OP_NEXT) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_PREV) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_NOTPREVNOT) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_GLOBALLY) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_HISTORICALLY) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_FINALLY) && (synpred7())) {
                    alt44=1;
                }
                else if ( (LA44_8==TOK_OP_ONCE) && (synpred7())) {
                    alt44=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("742:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 44, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA44_0==TOK_LCB||(LA44_0>=TOK_PLUS && LA44_0<=TOK_MINUS)||LA44_0==TOK_LP||(LA44_0>=TOK_BOOL && LA44_0<=TOK_CASE)||(LA44_0>=TOK_WAREAD && LA44_0<=TOK_WAWRITE)||LA44_0==TOK_ATOM||LA44_0==TOK_NUMBER||LA44_0==TOK_NUMBER_WORD||(LA44_0>=TOK_FALSEEXP && LA44_0<=TOK_TRUEEXP)) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("742:1: ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr -> ^( PURE_LTL_T ltl_pure_unary_expr ) | ltl_relational_expr );", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7069);
                    ltl_pure_unary_expr127=ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_pure_unary_expr.add(ltl_pure_unary_expr127.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_pure_unary_expr127.ret; 
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
                    // 752:9: -> ^( PURE_LTL_T ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:752:12: ^( PURE_LTL_T ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:753:11: ltl_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_relational_expr_in_ltl_unary_expr7110);
                    ltl_relational_expr128=ltl_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_relational_expr128.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_relational_expr128.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:756:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:759:9: (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr )
            int alt45=8;
            switch ( input.LA(1) ) {
            case TOK_OP_NEXT:
                {
                alt45=1;
                }
                break;
            case TOK_OP_PREV:
                {
                alt45=2;
                }
                break;
            case TOK_OP_NOTPREVNOT:
                {
                alt45=3;
                }
                break;
            case TOK_OP_GLOBALLY:
                {
                alt45=4;
                }
                break;
            case TOK_OP_HISTORICALLY:
                {
                alt45=5;
                }
                break;
            case TOK_OP_FINALLY:
                {
                alt45=6;
                }
                break;
            case TOK_OP_ONCE:
                {
                alt45=7;
                }
                break;
            case TOK_NOT:
                {
                alt45=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("756:1: ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ltl_unary_expr | op= TOK_OP_PREV f= ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ltl_unary_expr | op= TOK_OP_GLOBALLY f= ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ltl_unary_expr | op= TOK_OP_FINALLY f= ltl_unary_expr | op= TOK_OP_ONCE f= ltl_unary_expr | op= TOK_NOT fp= ltl_pure_unary_expr );", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:759:11: op= TOK_OP_NEXT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7162); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7167);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:761:11: op= TOK_OP_PREV f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7191); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7196);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:763:11: op= TOK_OP_NOTPREVNOT f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7220); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7225);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:765:11: op= TOK_OP_GLOBALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7249); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7254);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:767:11: op= TOK_OP_HISTORICALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7278); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7283);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:769:11: op= TOK_OP_FINALLY f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7307); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7312);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:771:11: op= TOK_OP_ONCE f= ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7336); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7341);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:774:11: op= TOK_NOT fp= ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7375); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7380);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:778:1: ltl_relational_expr returns [InternalSpec ret] : f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:781:9: (f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:781:11: f= ltl_in_expr (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7432);
            f=ltl_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:782:9: (op= TOK_EQUAL s= ltl_in_expr | op= TOK_NOTEQUAL s= ltl_in_expr | op= TOK_LT s= ltl_in_expr | op= TOK_GT s= ltl_in_expr | op= TOK_LE s= ltl_in_expr | op= TOK_GE s= ltl_in_expr )*
            loop46:
            do {
                int alt46=7;
                switch ( input.LA(1) ) {
                case TOK_EQUAL:
                    {
                    alt46=1;
                    }
                    break;
                case TOK_NOTEQUAL:
                    {
                    alt46=2;
                    }
                    break;
                case TOK_LT:
                    {
                    alt46=3;
                    }
                    break;
                case TOK_GT:
                    {
                    alt46=4;
                    }
                    break;
                case TOK_LE:
                    {
                    alt46=5;
                    }
                    break;
                case TOK_GE:
                    {
                    alt46=6;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:782:11: op= TOK_EQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ltl_relational_expr7448); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7453);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:784:11: op= TOK_NOTEQUAL s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7478); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7483);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:786:11: op= TOK_LT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ltl_relational_expr7508); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7513);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:788:11: op= TOK_GT s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ltl_relational_expr7538); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7543);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:790:11: op= TOK_LE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ltl_relational_expr7568); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7573);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:792:11: op= TOK_GE s= ltl_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ltl_relational_expr7598); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_in_expr_in_ltl_relational_expr7603);
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
    // $ANTLR end ltl_relational_expr

    public static class ltl_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_in_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:796:1: ltl_in_expr returns [InternalSpec ret] : f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:799:9: (f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:799:11: f= ltl_union_expr (op= TOK_SETIN s= ltl_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7667);
            f=ltl_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:800:9: (op= TOK_SETIN s= ltl_union_expr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==TOK_SETIN) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:800:11: op= TOK_SETIN s= ltl_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ltl_in_expr7683); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_union_expr_in_ltl_in_expr7688);
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
    // $ANTLR end ltl_in_expr

    public static class ltl_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_union_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:804:1: ltl_union_expr returns [InternalSpec ret] : f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:807:9: (f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:807:11: f= ltl_set_expr (op= TOK_UNION s= ltl_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7751);
            f=ltl_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:808:9: (op= TOK_UNION s= ltl_set_expr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==TOK_UNION) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:808:11: op= TOK_UNION s= ltl_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ltl_union_expr7767); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_set_expr_in_ltl_union_expr7772);
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
            	    break loop48;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );
    public final ltl_set_expr_return ltl_set_expr() throws RecognitionException {
        ltl_set_expr_return retval = new ltl_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB131=null;
        Token TOK_RCB133=null;
        ltl_shift_expr_return ltl_shift_expr129 = null;

        subrange_return subrange130 = null;

        ltl_set_list_expr_return ltl_set_list_expr132 = null;


        Object TOK_LCB131_tree=null;
        Object TOK_RCB133_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ltl_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:815:9: ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) )
            int alt49=3;
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
                alt49=1;
                }
                break;
            case TOK_NUMBER:
                {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==TOK_TWODOTS) ) {
                    alt49=2;
                }
                else if ( (LA49_2==EOF||(LA49_2>=TOK_INVAR_SPEC && LA49_2<=TOK_UNION)||(LA49_2>=TOK_LSHIFT && LA49_2<=TOK_CONCATENATION)||LA49_2==TOK_RP||LA49_2==TOK_KNOW||(LA49_2>=TOK_LB && LA49_2<=TOK_UNTIL)||(LA49_2>=TOK_SINCE && LA49_2<=TOK_TRIGGERED)||LA49_2==TOK_DOT||LA49_2==TOK_SEMI) ) {
                    alt49=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==TOK_NUMBER) ) {
                    int LA49_7 = input.LA(3);

                    if ( (LA49_7==TOK_TWODOTS) ) {
                        alt49=2;
                    }
                    else if ( (LA49_7==EOF||(LA49_7>=TOK_INVAR_SPEC && LA49_7<=TOK_UNION)||(LA49_7>=TOK_LSHIFT && LA49_7<=TOK_CONCATENATION)||LA49_7==TOK_RP||LA49_7==TOK_KNOW||(LA49_7>=TOK_LB && LA49_7<=TOK_UNTIL)||(LA49_7>=TOK_SINCE && LA49_7<=TOK_TRIGGERED)||LA49_7==TOK_DOT||LA49_7==TOK_SEMI) ) {
                        alt49=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA49_4 = input.LA(2);

                if ( (LA49_4==TOK_NUMBER) ) {
                    int LA49_8 = input.LA(3);

                    if ( (LA49_8==EOF||(LA49_8>=TOK_INVAR_SPEC && LA49_8<=TOK_UNION)||(LA49_8>=TOK_LSHIFT && LA49_8<=TOK_CONCATENATION)||LA49_8==TOK_RP||LA49_8==TOK_KNOW||(LA49_8>=TOK_LB && LA49_8<=TOK_UNTIL)||(LA49_8>=TOK_SINCE && LA49_8<=TOK_TRIGGERED)||LA49_8==TOK_DOT||LA49_8==TOK_SEMI) ) {
                        alt49=1;
                    }
                    else if ( (LA49_8==TOK_TWODOTS) ) {
                        alt49=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA49_4>=TOK_PLUS && LA49_4<=TOK_MINUS)||(LA49_4>=TOK_NOT && LA49_4<=TOK_LP)||(LA49_4>=TOK_BOOL && LA49_4<=TOK_CASE)||(LA49_4>=TOK_WAREAD && LA49_4<=TOK_WAWRITE)||LA49_4==TOK_ATOM||LA49_4==TOK_NUMBER_WORD||(LA49_4>=TOK_FALSEEXP && LA49_4<=TOK_TRUEEXP)) ) {
                    alt49=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 4, input);

                    throw nvae;
                }
                }
                break;
            case TOK_LCB:
                {
                alt49=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("812:1: ltl_set_expr returns [InternalSpec ret] : ( ltl_shift_expr | subrange | TOK_LCB ltl_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ltl_set_list_expr ) );", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:815:11: ltl_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_shift_expr_in_ltl_set_expr7833);
                    ltl_shift_expr129=ltl_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_shift_expr129.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_shift_expr129.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:817:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ltl_set_expr7855);
                    subrange130=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange130.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange130.start,subrange130.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:819:11: TOK_LCB ltl_set_list_expr TOK_RCB
                    {
                    TOK_LCB131=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ltl_set_expr7878); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB131);

                    pushFollow(FOLLOW_ltl_set_list_expr_in_ltl_set_expr7880);
                    ltl_set_list_expr132=ltl_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_set_list_expr.add(ltl_set_list_expr132.getTree());
                    TOK_RCB133=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ltl_set_expr7882); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB133);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB131.getText() + " " + input.toString(ltl_set_list_expr132.start,ltl_set_list_expr132.stop) + " " + TOK_RCB133.getText()); 
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
                    // 821:9: -> ^( SET_LIST_EXP_T ltl_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:821:12: ^( SET_LIST_EXP_T ltl_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:823:1: ltl_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ltl_set_list_expr_return ltl_set_list_expr() throws RecognitionException {
        ltl_set_list_expr_return retval = new ltl_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA135=null;
        simple_root_expr_return simple_root_expr134 = null;

        simple_root_expr_return simple_root_expr136 = null;


        Object TOK_COMMA135_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:824:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:824:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr7935);
            simple_root_expr134=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr134.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:824:28: ( TOK_COMMA simple_root_expr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==TOK_COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:824:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA135=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_set_list_expr7938); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ltl_set_list_expr7941);
            	    simple_root_expr136=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr136.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:826:1: ltl_shift_expr returns [InternalSpec ret] : f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:829:9: (f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:829:11: f= ltl_remainder_expr (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7987);
            f=ltl_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:830:9: (op= TOK_LSHIFT s= ltl_remainder_expr | op= TOK_RSHIFT s= ltl_remainder_expr )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==TOK_LSHIFT) ) {
                    alt51=1;
                }
                else if ( (LA51_0==TOK_RSHIFT) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:830:11: op= TOK_LSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8003); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8008);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:832:11: op= TOK_RSHIFT s= ltl_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8032); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8037);
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
    // $ANTLR end ltl_shift_expr

    public static class ltl_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_remainder_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:836:1: ltl_remainder_expr returns [InternalSpec ret] : f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:839:9: (f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:839:11: f= ltl_additive_expr (op= TOK_MOD s= ltl_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8099);
            f=ltl_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:840:9: (op= TOK_MOD s= ltl_additive_expr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==TOK_MOD) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:840:11: op= TOK_MOD s= ltl_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ltl_remainder_expr8115); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8120);
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
    // $ANTLR end ltl_remainder_expr

    public static class ltl_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_additive_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:846:1: ltl_additive_expr returns [InternalSpec ret] : f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:849:9: (f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:849:11: f= ltl_multiplicative_expr (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8184);
            f=ltl_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:850:9: (op= TOK_PLUS s= ltl_multiplicative_expr | op= TOK_MINUS s= ltl_multiplicative_expr )*
            loop53:
            do {
                int alt53=3;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==TOK_PLUS) ) {
                    alt53=1;
                }
                else if ( (LA53_0==TOK_MINUS) ) {
                    alt53=2;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:850:11: op= TOK_PLUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ltl_additive_expr8200); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8205);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:852:11: op= TOK_MINUS s= ltl_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_additive_expr8229); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8234);
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
    // $ANTLR end ltl_additive_expr

    public static class ltl_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_multiplicative_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:856:1: ltl_multiplicative_expr returns [InternalSpec ret] : f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:859:9: (f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:859:11: f= ltl_concatination_expr (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8295);
            f=ltl_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:860:9: (op= TOK_TIMES s= ltl_concatination_expr | op= TOK_DIVIDE s= ltl_concatination_expr )*
            loop54:
            do {
                int alt54=3;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==TOK_TIMES) ) {
                    alt54=1;
                }
                else if ( (LA54_0==TOK_DIVIDE) ) {
                    alt54=2;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:860:11: op= TOK_TIMES s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8311); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8316);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:862:11: op= TOK_DIVIDE s= ltl_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8340); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8345);
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
    // $ANTLR end ltl_multiplicative_expr

    public static class ltl_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ltl_concatination_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:866:1: ltl_concatination_expr returns [InternalSpec ret] : f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:9: (f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:869:11: f= ltl_primary_expr (op= TOK_CONCATENATION s= ltl_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8406);
            f=ltl_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:870:9: (op= TOK_CONCATENATION s= ltl_primary_expr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==TOK_CONCATENATION) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:870:11: op= TOK_CONCATENATION s= ltl_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8422); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8427);
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
            	    break loop55;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:875:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );
    public final ltl_primary_expr_return ltl_primary_expr() throws RecognitionException {
        ltl_primary_expr_return retval = new ltl_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ltl_primary_expr_return v = null;

        ltl_primary_expr_helper1_return ltl_primary_expr_helper1137 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ltl_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ltl_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:878:9: ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) )
            int alt56=3;
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
                alt56=1;
                }
                break;
            case TOK_MINUS:
                {
                alt56=2;
                }
                break;
            case TOK_NOT:
                {
                alt56=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("875:1: ltl_primary_expr returns [InternalSpec ret] : ( ltl_primary_expr_helper1 | op= TOK_MINUS v= ltl_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ltl_primary_expr -> ^( TOK_NOT $v) );", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:878:11: ltl_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8488);
                    ltl_primary_expr_helper1137=ltl_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ltl_primary_expr_helper1137.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_primary_expr_helper1137.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:880:11: op= TOK_MINUS v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ltl_primary_expr8512); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8516);
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
                    // 882:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:882:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:883:11: op= TOK_NOT v= ltl_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ltl_primary_expr8557); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ltl_primary_expr_in_ltl_primary_expr8561);
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
                    // 885:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:885:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:888:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ltl_primary_expr_helper1_return ltl_primary_expr_helper1() throws RecognitionException {
        ltl_primary_expr_helper1_return retval = new ltl_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP141=null;
        Token TOK_RP143=null;
        Token TOK_BOOL145=null;
        Token TOK_LP146=null;
        Token TOK_RP148=null;
        Token TOK_WORD1150=null;
        Token TOK_LP151=null;
        Token TOK_RP153=null;
        Token TOK_NEXT155=null;
        Token TOK_LP156=null;
        Token TOK_RP158=null;
        Token TOK_CASE160=null;
        Token TOK_ESAC162=null;
        Token TOK_WAREAD164=null;
        Token TOK_LP165=null;
        Token TOK_COMMA166=null;
        Token TOK_RP167=null;
        Token TOK_WAWRITE169=null;
        Token TOK_LP170=null;
        Token TOK_RP171=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant138 = null;

        primary_expr_select_return primary_expr_select139 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1140 = null;

        ltl_root_expr_return ltl_root_expr142 = null;

        primary_expr_select_return primary_expr_select144 = null;

        simple_root_expr_return simple_root_expr147 = null;

        primary_expr_select_return primary_expr_select149 = null;

        simple_root_expr_return simple_root_expr152 = null;

        primary_expr_select_return primary_expr_select154 = null;

        simple_root_expr_return simple_root_expr157 = null;

        primary_expr_select_return primary_expr_select159 = null;

        case_element_list_expr_return case_element_list_expr161 = null;

        primary_expr_select_return primary_expr_select163 = null;

        primary_expr_select_return primary_expr_select168 = null;

        primary_expr_select_return primary_expr_select172 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP141_tree=null;
        Object TOK_RP143_tree=null;
        Object TOK_BOOL145_tree=null;
        Object TOK_LP146_tree=null;
        Object TOK_RP148_tree=null;
        Object TOK_WORD1150_tree=null;
        Object TOK_LP151_tree=null;
        Object TOK_RP153_tree=null;
        Object TOK_NEXT155_tree=null;
        Object TOK_LP156_tree=null;
        Object TOK_RP158_tree=null;
        Object TOK_CASE160_tree=null;
        Object TOK_ESAC162_tree=null;
        Object TOK_WAREAD164_tree=null;
        Object TOK_LP165_tree=null;
        Object TOK_COMMA166_tree=null;
        Object TOK_RP167_tree=null;
        Object TOK_WAWRITE169_tree=null;
        Object TOK_LP170_tree=null;
        Object TOK_RP171_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:891:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt57=9;
            switch ( input.LA(1) ) {
            case TOK_PLUS:
            case TOK_NUMBER:
            case TOK_NUMBER_WORD:
            case TOK_FALSEEXP:
            case TOK_TRUEEXP:
                {
                alt57=1;
                }
                break;
            case TOK_ATOM:
                {
                alt57=2;
                }
                break;
            case TOK_LP:
                {
                alt57=3;
                }
                break;
            case TOK_BOOL:
                {
                alt57=4;
                }
                break;
            case TOK_WORD1:
                {
                alt57=5;
                }
                break;
            case TOK_NEXT:
                {
                alt57=6;
                }
                break;
            case TOK_CASE:
                {
                alt57=7;
                }
                break;
            case TOK_WAREAD:
                {
                alt57=8;
                }
                break;
            case TOK_WAWRITE:
                {
                alt57=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("888:1: ltl_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ltl_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:891:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ltl_primary_expr_helper18626);
                    constant138=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant138.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18628);
                    primary_expr_select139=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select139.getTree());
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
                    // 894:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:894:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:895:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18679);
                    primary_expr_helper1_pointer1140=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1140.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:904:11: TOK_LP ltl_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP141=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18732); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP141);

                    pushFollow(FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18734);
                    ltl_root_expr142=ltl_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ltl_root_expr.add(ltl_root_expr142.getTree());
                    TOK_RP143=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18736); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP143);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18738);
                    primary_expr_select144=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select144.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ltl_root_expr142.ret; 
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
                    // 906:9: -> ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:906:12: ^( BLOCK_T ltl_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:910:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL145=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18809); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL145);

                    TOK_LP146=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18811); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP146);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18813);
                    simple_root_expr147=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr147.getTree());
                    TOK_RP148=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18815); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP148);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18817);
                    primary_expr_select149=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select149.getTree());
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
                    // 913:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:913:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:914:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1150=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18868); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1150);

                    TOK_LP151=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18870); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP151);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18872);
                    simple_root_expr152=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr152.getTree());
                    TOK_RP153=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18874); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP153);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18876);
                    primary_expr_select154=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select154.getTree());
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
                    // 917:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:917:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:919:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT155=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper18936); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT155);

                    TOK_LP156=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper18938); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP156);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18940);
                    simple_root_expr157=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr157.getTree());
                    TOK_RP158=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper18942); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP158);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18944);
                    primary_expr_select159=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select159.getTree());
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
                    // 922:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:922:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:924:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE160=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19004); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE160);

                    pushFollow(FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19006);
                    case_element_list_expr161=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr161.getTree());
                    TOK_ESAC162=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19008); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC162);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19010);
                    primary_expr_select163=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select163.getTree());
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
                    // 927:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:927:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:929:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD164=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19070); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD164);

                    TOK_LP165=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19072); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP165);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19076);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA166=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19078); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA166);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19082);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP167=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19084); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP167);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19086);
                    primary_expr_select168=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select168.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_WAREAD, f, s
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
                    // 932:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:932:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:934:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE169=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19150); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE169);

                    TOK_LP170=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ltl_primary_expr_helper19152); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP170);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19156);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19160); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19164);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19168); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19172);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP171=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ltl_primary_expr_helper19174); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP171);

                    pushFollow(FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19176);
                    primary_expr_select172=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select172.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: f, primary_expr_select, TOK_WAWRITE, m, s
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
                    // 937:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:937:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:944:1: ctls_root_expr returns [InternalSpec ret] : ctls_implies_expr ;
    public final ctls_root_expr_return ctls_root_expr() throws RecognitionException {
        ctls_root_expr_return retval = new ctls_root_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_implies_expr_return ctls_implies_expr173 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:945:9: ( ctls_implies_expr )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:945:11: ctls_implies_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_implies_expr_in_ctls_root_expr9257);
            ctls_implies_expr173=ctls_implies_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ctls_implies_expr173.getTree());
            if ( backtracking==0 ) {
              if(!er()) retval.ret = ctls_implies_expr173.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:947:1: ctls_implies_expr returns [InternalSpec ret] : f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:950:9: (f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )? )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:950:11: f= ctls_iff_expr (op= TOK_IMPLIES s= ctls_implies_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_iff_expr_in_ctls_implies_expr9300);
            f=ctls_iff_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:951:9: (op= TOK_IMPLIES s= ctls_implies_expr )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TOK_IMPLIES) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:951:11: op= TOK_IMPLIES s= ctls_implies_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_IMPLIES,FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9316); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_implies_expr_in_ctls_implies_expr9321);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:955:1: ctls_iff_expr returns [InternalSpec ret] : f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:958:9: (f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:958:11: f= ctls_or_expr (op= TOK_IFF s= ctls_or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9386);
            f=ctls_or_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:959:9: (op= TOK_IFF s= ctls_or_expr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==TOK_IFF) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:959:11: op= TOK_IFF s= ctls_or_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_IFF,FOLLOW_TOK_IFF_in_ctls_iff_expr9402); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_or_expr_in_ctls_iff_expr9407);
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
    // $ANTLR end ctls_iff_expr

    public static class ctls_or_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_or_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:963:1: ctls_or_expr returns [InternalSpec ret] : f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:966:9: (f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:966:11: f= ctls_and_expr (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9470);
            f=ctls_and_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:967:9: (op= TOK_OR s= ctls_and_expr | op= TOK_XOR s= ctls_and_expr | op= TOK_XNOR s= ctls_and_expr )*
            loop60:
            do {
                int alt60=4;
                switch ( input.LA(1) ) {
                case TOK_OR:
                    {
                    alt60=1;
                    }
                    break;
                case TOK_XOR:
                    {
                    alt60=2;
                    }
                    break;
                case TOK_XNOR:
                    {
                    alt60=3;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:967:11: op= TOK_OR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_OR,FOLLOW_TOK_OR_in_ctls_or_expr9486); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9491);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:969:11: op= TOK_XOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XOR,FOLLOW_TOK_XOR_in_ctls_or_expr9515); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9520);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:971:11: op= TOK_XNOR s= ctls_and_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_XNOR,FOLLOW_TOK_XNOR_in_ctls_or_expr9544); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_and_expr_in_ctls_or_expr9549);
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
    // $ANTLR end ctls_or_expr

    public static class ctls_and_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_and_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:975:1: ctls_and_expr returns [InternalSpec ret] : f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:978:9: (f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:978:11: f= ctls_ltl_binary_expr (op= TOK_AND s= ctls_ltl_binary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9612);
            f=ctls_ltl_binary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:979:9: (op= TOK_AND s= ctls_ltl_binary_expr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==TOK_AND) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:979:11: op= TOK_AND s= ctls_ltl_binary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_AND,FOLLOW_TOK_AND_in_ctls_and_expr9628); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9633);
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
    // $ANTLR end ctls_and_expr

    public static class ctls_ltl_binary_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_ltl_binary_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:985:1: ctls_ltl_binary_expr returns [InternalSpec ret] : f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:988:9: (f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:988:11: f= ctls_ltl_unary_expr (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9697);
            f=ctls_ltl_unary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:989:9: (op= TOK_UNTIL s= ctls_ltl_unary_expr | op= TOK_SINCE s= ctls_ltl_unary_expr | op= TOK_RELEASES s= ctls_ltl_unary_expr | op= TOK_TRIGGERED s= ctls_ltl_unary_expr )*
            loop62:
            do {
                int alt62=5;
                switch ( input.LA(1) ) {
                case TOK_UNTIL:
                    {
                    alt62=1;
                    }
                    break;
                case TOK_SINCE:
                    {
                    alt62=2;
                    }
                    break;
                case TOK_RELEASES:
                    {
                    alt62=3;
                    }
                    break;
                case TOK_TRIGGERED:
                    {
                    alt62=4;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:989:11: op= TOK_UNTIL s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9713); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9718);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:991:11: op= TOK_SINCE s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SINCE,FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9743); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9748);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:993:11: op= TOK_RELEASES s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RELEASES,FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9773); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9778);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:995:11: op= TOK_TRIGGERED s= ctls_ltl_unary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TRIGGERED,FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9803); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9808);
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
            	    break loop62;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:999:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );
    public final ctls_ltl_unary_expr_return ctls_ltl_unary_expr() throws RecognitionException {
        ctls_ltl_unary_expr_return retval = new ctls_ltl_unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ltl_pure_unary_expr_return ctls_ltl_pure_unary_expr174 = null;

        ctls_ctl_expr_return ctls_ctl_expr175 = null;


        RewriteRuleSubtreeStream stream_ctls_ltl_pure_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_ltl_pure_unary_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:9: ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==TOK_OP_NEXT) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_PREV) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_NOTPREVNOT) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_GLOBALLY) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_HISTORICALLY) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_FINALLY) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_OP_ONCE) && (synpred8())) {
                alt63=1;
            }
            else if ( (LA63_0==TOK_NOT) ) {
                int LA63_8 = input.LA(2);

                if ( (LA63_8==TOK_OP_NEXT) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_PREV) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_NOTPREVNOT) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_GLOBALLY) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_HISTORICALLY) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_FINALLY) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_OP_ONCE) && (synpred8())) {
                    alt63=1;
                }
                else if ( (LA63_8==TOK_NOT) ) {
                    int LA63_17 = input.LA(3);

                    if ( (synpred8()) ) {
                        alt63=1;
                    }
                    else if ( (true) ) {
                        alt63=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("999:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 63, 17, input);

                        throw nvae;
                    }
                }
                else if ( ((LA63_8>=TOK_PLUS && LA63_8<=TOK_MINUS)||LA63_8==TOK_LP||(LA63_8>=TOK_BOOL && LA63_8<=TOK_CASE)||(LA63_8>=TOK_WAREAD && LA63_8<=TOK_WAWRITE)||(LA63_8>=TOK_ATOM && LA63_8<=TOK_AA)||LA63_8==TOK_EE||LA63_8==TOK_NUMBER||LA63_8==TOK_NUMBER_WORD||(LA63_8>=TOK_FALSEEXP && LA63_8<=TOK_TRUEEXP)) ) {
                    alt63=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("999:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 63, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==TOK_LCB||(LA63_0>=TOK_PLUS && LA63_0<=TOK_MINUS)||LA63_0==TOK_LP||(LA63_0>=TOK_BOOL && LA63_0<=TOK_CASE)||(LA63_0>=TOK_WAREAD && LA63_0<=TOK_WAWRITE)||(LA63_0>=TOK_ATOM && LA63_0<=TOK_AA)||LA63_0==TOK_EE||LA63_0==TOK_NUMBER||LA63_0==TOK_NUMBER_WORD||(LA63_0>=TOK_FALSEEXP && LA63_0<=TOK_TRUEEXP)) ) {
                alt63=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("999:1: ctls_ltl_unary_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr ) | ctls_ctl_expr );", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )=> ctls_ltl_pure_unary_expr
                    {
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr9959);
                    ctls_ltl_pure_unary_expr174=ctls_ltl_pure_unary_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_ltl_pure_unary_expr.add(ctls_ltl_pure_unary_expr174.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ltl_pure_unary_expr174.ret; 
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
                    // 1009:9: -> ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1009:12: ^( PURE_LTL_T ctls_ltl_pure_unary_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1010:11: ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10000);
                    ctls_ctl_expr175=ctls_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ctl_expr175.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ctl_expr175.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1013:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1016:9: (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr )
            int alt64=8;
            switch ( input.LA(1) ) {
            case TOK_OP_NEXT:
                {
                alt64=1;
                }
                break;
            case TOK_OP_PREV:
                {
                alt64=2;
                }
                break;
            case TOK_OP_NOTPREVNOT:
                {
                alt64=3;
                }
                break;
            case TOK_OP_GLOBALLY:
                {
                alt64=4;
                }
                break;
            case TOK_OP_HISTORICALLY:
                {
                alt64=5;
                }
                break;
            case TOK_OP_FINALLY:
                {
                alt64=6;
                }
                break;
            case TOK_OP_ONCE:
                {
                alt64=7;
                }
                break;
            case TOK_NOT:
                {
                alt64=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1013:1: ctls_ltl_pure_unary_expr returns [InternalSpec ret] : (op= TOK_OP_NEXT f= ctls_ltl_unary_expr | op= TOK_OP_PREV f= ctls_ltl_unary_expr | op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr | op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr | op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr | op= TOK_OP_FINALLY f= ctls_ltl_unary_expr | op= TOK_OP_ONCE f= ctls_ltl_unary_expr | op= TOK_NOT fp= ctls_ltl_pure_unary_expr );", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1016:11: op= TOK_OP_NEXT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NEXT,FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10050); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10055);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1018:11: op= TOK_OP_PREV f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_PREV,FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10079); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10084);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1020:11: op= TOK_OP_NOTPREVNOT f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_NOTPREVNOT,FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10108); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10113);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1022:11: op= TOK_OP_GLOBALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_GLOBALLY,FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10137); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10142);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1024:11: op= TOK_OP_HISTORICALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_HISTORICALLY,FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10166); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10171);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1026:11: op= TOK_OP_FINALLY f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_FINALLY,FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10195); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10200);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1028:11: op= TOK_OP_ONCE f= ctls_ltl_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_OP_ONCE,FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10224); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10229);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1031:11: op= TOK_NOT fp= ctls_ltl_pure_unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10263); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10268);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1036:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );
    public final ctls_ctl_expr_return ctls_ctl_expr() throws RecognitionException {
        ctls_ctl_expr_return retval = new ctls_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_pure_ctl_expr_return ctls_pure_ctl_expr176 = null;

        ctls_relational_expr_return ctls_relational_expr177 = null;


        RewriteRuleSubtreeStream stream_ctls_pure_ctl_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_pure_ctl_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:9: ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TOK_EX) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_AX) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_EF) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_AF) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_EG) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_AG) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_AA) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_EE) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_EBF) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_ABF) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_EBG) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_ABG) && (synpred9())) {
                alt65=1;
            }
            else if ( (LA65_0==TOK_NOT) ) {
                int LA65_13 = input.LA(2);

                if ( ((LA65_13>=TOK_PLUS && LA65_13<=TOK_MINUS)||LA65_13==TOK_LP||(LA65_13>=TOK_BOOL && LA65_13<=TOK_CASE)||(LA65_13>=TOK_WAREAD && LA65_13<=TOK_WAWRITE)||LA65_13==TOK_ATOM||LA65_13==TOK_NUMBER||LA65_13==TOK_NUMBER_WORD||(LA65_13>=TOK_FALSEEXP && LA65_13<=TOK_TRUEEXP)) ) {
                    alt65=2;
                }
                else if ( (LA65_13==TOK_NOT) ) {
                    int LA65_15 = input.LA(3);

                    if ( (synpred9()) ) {
                        alt65=1;
                    }
                    else if ( (true) ) {
                        alt65=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1036:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 65, 15, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_13==TOK_EX) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_AX) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_EF) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_AF) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_EG) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_AG) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_AA) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_EE) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_EBF) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_ABF) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_EBG) && (synpred9())) {
                    alt65=1;
                }
                else if ( (LA65_13==TOK_ABG) && (synpred9())) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1036:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 65, 13, input);

                    throw nvae;
                }
            }
            else if ( (LA65_0==TOK_LCB||(LA65_0>=TOK_PLUS && LA65_0<=TOK_MINUS)||LA65_0==TOK_LP||(LA65_0>=TOK_BOOL && LA65_0<=TOK_CASE)||(LA65_0>=TOK_WAREAD && LA65_0<=TOK_WAWRITE)||LA65_0==TOK_ATOM||LA65_0==TOK_NUMBER||LA65_0==TOK_NUMBER_WORD||(LA65_0>=TOK_FALSEEXP && LA65_0<=TOK_TRUEEXP)) ) {
                alt65=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1036:1: ctls_ctl_expr returns [InternalSpec ret] : ( ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr -> ^( PURE_CTL_T ctls_pure_ctl_expr ) | ctls_relational_expr );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )=> ctls_pure_ctl_expr
                    {
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10487);
                    ctls_pure_ctl_expr176=ctls_pure_ctl_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_pure_ctl_expr.add(ctls_pure_ctl_expr176.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_pure_ctl_expr176.ret; 
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
                    // 1051:9: -> ^( PURE_CTL_T ctls_pure_ctl_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1051:12: ^( PURE_CTL_T ctls_pure_ctl_expr )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1052:11: ctls_relational_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10525);
                    ctls_relational_expr177=ctls_relational_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_relational_expr177.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_relational_expr177.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1055:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );
    public final ctls_pure_ctl_expr_return ctls_pure_ctl_expr() throws RecognitionException {
        ctls_pure_ctl_expr_return retval = new ctls_pure_ctl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_ctl_expr_return f = null;

        subrange_return fsr = null;

        ctls_ctl_expr_return s = null;

        ctls_pure_ctl_expr_return fp = null;

        ctls_aa_return ctls_aa178 = null;

        ctls_ee_return ctls_ee179 = null;


        Object op_tree=null;

        boolean append_end = false; String exp_str = ""; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1058:9: (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr )
            int alt66=13;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==TOK_EX) ) {
                alt66=1;
            }
            else if ( (LA66_0==TOK_AX) ) {
                alt66=2;
            }
            else if ( (LA66_0==TOK_EF) ) {
                alt66=3;
            }
            else if ( (LA66_0==TOK_AF) ) {
                alt66=4;
            }
            else if ( (LA66_0==TOK_EG) ) {
                alt66=5;
            }
            else if ( (LA66_0==TOK_AG) ) {
                alt66=6;
            }
            else if ( (LA66_0==TOK_AA) && (synpred10())) {
                alt66=7;
            }
            else if ( (LA66_0==TOK_EE) && (synpred11())) {
                alt66=8;
            }
            else if ( (LA66_0==TOK_EBF) ) {
                alt66=9;
            }
            else if ( (LA66_0==TOK_ABF) ) {
                alt66=10;
            }
            else if ( (LA66_0==TOK_EBG) ) {
                alt66=11;
            }
            else if ( (LA66_0==TOK_ABG) ) {
                alt66=12;
            }
            else if ( (LA66_0==TOK_NOT) ) {
                alt66=13;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1055:1: ctls_pure_ctl_expr returns [InternalSpec ret] : (op= TOK_EX f= ctls_ctl_expr | op= TOK_AX f= ctls_ctl_expr | op= TOK_EF f= ctls_ctl_expr | op= TOK_AF f= ctls_ctl_expr | op= TOK_EG f= ctls_ctl_expr | op= TOK_AG f= ctls_ctl_expr | ( TOK_AA )=> ctls_aa | ( TOK_EE )=> ctls_ee | op= TOK_EBF fsr= subrange s= ctls_ctl_expr | op= TOK_ABF fsr= subrange s= ctls_ctl_expr | op= TOK_EBG fsr= subrange s= ctls_ctl_expr | op= TOK_ABG fsr= subrange s= ctls_ctl_expr | op= TOK_NOT fp= ctls_pure_ctl_expr );", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1058:11: op= TOK_EX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EX,FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10576); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10581);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1060:11: op= TOK_AX f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AX,FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10605); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10610);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1062:11: op= TOK_EF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EF,FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10634); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10639);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1064:11: op= TOK_AF f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AF,FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10663); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10668);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1066:11: op= TOK_EG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EG,FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10692); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10697);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1068:11: op= TOK_AG f= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_AG,FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10721); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10726);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1071:11: ( TOK_AA )=> ctls_aa
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10755);
                    ctls_aa178=ctls_aa();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_aa178.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_aa178.ret; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1072:11: ( TOK_EE )=> ctls_ee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10775);
                    ctls_ee179=ctls_ee();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ee179.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ee179.ret; 
                    }

                    }
                    break;
                case 9 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1074:11: op= TOK_EBF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBF,FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10792); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10797);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10801);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1076:11: op= TOK_ABF fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABF,FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10825); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10830);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10834);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1078:11: op= TOK_EBG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_EBG,FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10858); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10863);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10867);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1080:11: op= TOK_ABG fsr= subrange s= ctls_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_ABG,FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr10891); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_subrange_in_ctls_pure_ctl_expr10896);
                    fsr=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fsr.getTree());
                    pushFollow(FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10900);
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1083:11: op= TOK_NOT fp= ctls_pure_ctl_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr10934); if (failed) return retval;
                    if ( backtracking==0 ) {
                    op_tree = (Object)adaptor.create(op);
                    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
                    }
                    pushFollow(FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr10939);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1086:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );
    public final ctls_aa_return ctls_aa() throws RecognitionException {
        ctls_aa_return retval = new ctls_aa_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_abu_return ctls_abu180 = null;

        ctls_au_return ctls_au181 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1088:9: ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==TOK_AA) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==TOK_LB) ) {
                    int LA67_2 = input.LA(3);

                    if ( (synpred12()) ) {
                        alt67=1;
                    }
                    else if ( (synpred13()) ) {
                        alt67=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1086:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 67, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1086:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1086:1: ctls_aa returns [InternalSpec ret] : ( ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu | ( TOK_AA TOK_LB )=> ctls_au );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1088:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_abu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_abu_in_ctls_aa10998);
                    ctls_abu180=ctls_abu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_abu180.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_abu180.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1090:11: ( TOK_AA TOK_LB )=> ctls_au
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_au_in_ctls_aa11029);
                    ctls_au181=ctls_au();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_au181.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_au181.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1094:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );
    public final ctls_ee_return ctls_ee() throws RecognitionException {
        ctls_ee_return retval = new ctls_ee_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ctls_ebu_return ctls_ebu182 = null;

        ctls_eu_return ctls_eu183 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1096:9: ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==TOK_EE) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==TOK_LB) ) {
                    int LA68_2 = input.LA(3);

                    if ( (synpred14()) ) {
                        alt68=1;
                    }
                    else if ( (synpred15()) ) {
                        alt68=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1094:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 68, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1094:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1094:1: ctls_ee returns [InternalSpec ret] : ( ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu | ( TOK_EE TOK_LB )=> ctls_eu );", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1096:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )=> ctls_ebu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_ebu_in_ctls_ee11098);
                    ctls_ebu182=ctls_ebu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_ebu182.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_ebu182.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1098:11: ( TOK_EE TOK_LB )=> ctls_eu
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_eu_in_ctls_ee11129);
                    ctls_eu183=ctls_eu();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_eu183.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_eu183.ret; 
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1103:1: ctls_au returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1106:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1106:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_au11194); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_au11199); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_au11204);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_au11208); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1109:1: ctls_eu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1112:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1112:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_eu11263); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_eu11268); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_eu11273);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_eu11277); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1115:1: ctls_abu returns [InternalSpec ret] : op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1118:9: (op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1118:11: op= TOK_AA lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_AA,FOLLOW_TOK_AA_in_ctls_abu11331); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_abu11336); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11341);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_abu11345); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_abu11349);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_abu11353);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_abu11357); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1121:1: ctls_ebu returns [InternalSpec ret] : op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1124:9: (op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1124:11: op= TOK_EE lb= TOK_LB fre= ctls_root_expr opu= TOK_BUNTIL msr= subrange sre= ctls_root_expr rb= TOK_RB
            {
            root_0 = (Object)adaptor.nil();

            op=(Token)input.LT(1);
            match(input,TOK_EE,FOLLOW_TOK_EE_in_ctls_ebu11411); if (failed) return retval;
            if ( backtracking==0 ) {
            op_tree = (Object)adaptor.create(op);
            root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            }
            lb=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_ctls_ebu11416); if (failed) return retval;
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11421);
            fre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fre.getTree());
            opu=(Token)input.LT(1);
            match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_ctls_ebu11425); if (failed) return retval;
            if ( backtracking==0 ) {
            opu_tree = (Object)adaptor.create(opu);
            adaptor.addChild(root_0, opu_tree);
            }
            pushFollow(FOLLOW_subrange_in_ctls_ebu11429);
            msr=subrange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, msr.getTree());
            pushFollow(FOLLOW_ctls_root_expr_in_ctls_ebu11433);
            sre=ctls_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sre.getTree());
            rb=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_ctls_ebu11437); if (failed) return retval;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1128:1: ctls_relational_expr returns [InternalSpec ret] : f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1131:9: (f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1131:11: f= ctls_in_expr (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11489);
            f=ctls_in_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1132:9: (op= TOK_EQUAL s= ctls_in_expr | op= TOK_NOTEQUAL s= ctls_in_expr | op= TOK_LT s= ctls_in_expr | op= TOK_GT s= ctls_in_expr | op= TOK_LE s= ctls_in_expr | op= TOK_GE s= ctls_in_expr )*
            loop69:
            do {
                int alt69=7;
                switch ( input.LA(1) ) {
                case TOK_EQUAL:
                    {
                    alt69=1;
                    }
                    break;
                case TOK_NOTEQUAL:
                    {
                    alt69=2;
                    }
                    break;
                case TOK_LT:
                    {
                    alt69=3;
                    }
                    break;
                case TOK_GT:
                    {
                    alt69=4;
                    }
                    break;
                case TOK_LE:
                    {
                    alt69=5;
                    }
                    break;
                case TOK_GE:
                    {
                    alt69=6;
                    }
                    break;

                }

                switch (alt69) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1132:11: op= TOK_EQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_EQUAL,FOLLOW_TOK_EQUAL_in_ctls_relational_expr11505); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11510);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1134:11: op= TOK_NOTEQUAL s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_NOTEQUAL,FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11535); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11540);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1136:11: op= TOK_LT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LT,FOLLOW_TOK_LT_in_ctls_relational_expr11565); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11570);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1138:11: op= TOK_GT s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GT,FOLLOW_TOK_GT_in_ctls_relational_expr11595); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11600);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1140:11: op= TOK_LE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LE,FOLLOW_TOK_LE_in_ctls_relational_expr11625); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11630);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1142:11: op= TOK_GE s= ctls_in_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_GE,FOLLOW_TOK_GE_in_ctls_relational_expr11655); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_in_expr_in_ctls_relational_expr11660);
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
    // $ANTLR end ctls_relational_expr

    public static class ctls_in_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_in_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1146:1: ctls_in_expr returns [InternalSpec ret] : f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1149:9: (f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1149:11: f= ctls_union_expr (op= TOK_SETIN s= ctls_union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11723);
            f=ctls_union_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1150:9: (op= TOK_SETIN s= ctls_union_expr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==TOK_SETIN) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1150:11: op= TOK_SETIN s= ctls_union_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_SETIN,FOLLOW_TOK_SETIN_in_ctls_in_expr11739); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_union_expr_in_ctls_in_expr11744);
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
    // $ANTLR end ctls_in_expr

    public static class ctls_union_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_union_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1154:1: ctls_union_expr returns [InternalSpec ret] : f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1157:9: (f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1157:11: f= ctls_set_expr (op= TOK_UNION s= ctls_set_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11807);
            f=ctls_set_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1158:9: (op= TOK_UNION s= ctls_set_expr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==TOK_UNION) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1158:11: op= TOK_UNION s= ctls_set_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_UNION,FOLLOW_TOK_UNION_in_ctls_union_expr11823); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_set_expr_in_ctls_union_expr11828);
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
            	    break loop71;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );
    public final ctls_set_expr_return ctls_set_expr() throws RecognitionException {
        ctls_set_expr_return retval = new ctls_set_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LCB186=null;
        Token TOK_RCB188=null;
        ctls_shift_expr_return ctls_shift_expr184 = null;

        subrange_return subrange185 = null;

        ctls_set_list_expr_return ctls_set_list_expr187 = null;


        Object TOK_LCB186_tree=null;
        Object TOK_RCB188_tree=null;
        RewriteRuleTokenStream stream_TOK_RCB=new RewriteRuleTokenStream(adaptor,"token TOK_RCB");
        RewriteRuleTokenStream stream_TOK_LCB=new RewriteRuleTokenStream(adaptor,"token TOK_LCB");
        RewriteRuleSubtreeStream stream_ctls_set_list_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_set_list_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1166:9: ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) )
            int alt72=3;
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
                alt72=1;
                }
                break;
            case TOK_NUMBER:
                {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==EOF||(LA72_2>=TOK_INVAR_SPEC && LA72_2<=TOK_UNION)||(LA72_2>=TOK_LSHIFT && LA72_2<=TOK_CONCATENATION)||LA72_2==TOK_RP||(LA72_2>=TOK_LB && LA72_2<=TOK_RB)||(LA72_2>=TOK_BUNTIL && LA72_2<=TOK_TRIGGERED)||LA72_2==TOK_DOT||LA72_2==TOK_SEMI) ) {
                    alt72=1;
                }
                else if ( (LA72_2==TOK_TWODOTS) ) {
                    alt72=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 2, input);

                    throw nvae;
                }
                }
                break;
            case TOK_PLUS:
                {
                int LA72_3 = input.LA(2);

                if ( (LA72_3==TOK_NUMBER) ) {
                    int LA72_7 = input.LA(3);

                    if ( (LA72_7==TOK_TWODOTS) ) {
                        alt72=2;
                    }
                    else if ( (LA72_7==EOF||(LA72_7>=TOK_INVAR_SPEC && LA72_7<=TOK_UNION)||(LA72_7>=TOK_LSHIFT && LA72_7<=TOK_CONCATENATION)||LA72_7==TOK_RP||(LA72_7>=TOK_LB && LA72_7<=TOK_RB)||(LA72_7>=TOK_BUNTIL && LA72_7<=TOK_TRIGGERED)||LA72_7==TOK_DOT||LA72_7==TOK_SEMI) ) {
                        alt72=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 3, input);

                    throw nvae;
                }
                }
                break;
            case TOK_MINUS:
                {
                int LA72_4 = input.LA(2);

                if ( (LA72_4==TOK_NUMBER) ) {
                    int LA72_8 = input.LA(3);

                    if ( (LA72_8==TOK_TWODOTS) ) {
                        alt72=2;
                    }
                    else if ( (LA72_8==EOF||(LA72_8>=TOK_INVAR_SPEC && LA72_8<=TOK_UNION)||(LA72_8>=TOK_LSHIFT && LA72_8<=TOK_CONCATENATION)||LA72_8==TOK_RP||(LA72_8>=TOK_LB && LA72_8<=TOK_RB)||(LA72_8>=TOK_BUNTIL && LA72_8<=TOK_TRIGGERED)||LA72_8==TOK_DOT||LA72_8==TOK_SEMI) ) {
                        alt72=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA72_4>=TOK_PLUS && LA72_4<=TOK_MINUS)||(LA72_4>=TOK_NOT && LA72_4<=TOK_LP)||(LA72_4>=TOK_BOOL && LA72_4<=TOK_CASE)||(LA72_4>=TOK_WAREAD && LA72_4<=TOK_WAWRITE)||LA72_4==TOK_ATOM||LA72_4==TOK_NUMBER_WORD||(LA72_4>=TOK_FALSEEXP && LA72_4<=TOK_TRUEEXP)) ) {
                    alt72=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 4, input);

                    throw nvae;
                }
                }
                break;
            case TOK_LCB:
                {
                alt72=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1163:1: ctls_set_expr returns [InternalSpec ret] : ( ctls_shift_expr | subrange | TOK_LCB ctls_set_list_expr TOK_RCB -> ^( SET_LIST_EXP_T ctls_set_list_expr ) );", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1166:11: ctls_shift_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_shift_expr_in_ctls_set_expr11890);
                    ctls_shift_expr184=ctls_shift_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_shift_expr184.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_shift_expr184.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1168:11: subrange
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subrange_in_ctls_set_expr11912);
                    subrange185=subrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subrange185.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_range(input, ((Token)retval.start), input.toString(subrange185.start,subrange185.stop)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1170:11: TOK_LCB ctls_set_list_expr TOK_RCB
                    {
                    TOK_LCB186=(Token)input.LT(1);
                    match(input,TOK_LCB,FOLLOW_TOK_LCB_in_ctls_set_expr11935); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LCB.add(TOK_LCB186);

                    pushFollow(FOLLOW_ctls_set_list_expr_in_ctls_set_expr11937);
                    ctls_set_list_expr187=ctls_set_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_set_list_expr.add(ctls_set_list_expr187.getTree());
                    TOK_RCB188=(Token)input.LT(1);
                    match(input,TOK_RCB,FOLLOW_TOK_RCB_in_ctls_set_expr11939); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RCB.add(TOK_RCB188);

                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_set(input, ((Token)retval.start), TOK_LCB186.getText() + " " + input.toString(ctls_set_list_expr187.start,ctls_set_list_expr187.stop) + " " + TOK_RCB188.getText()); 
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
                    // 1172:9: -> ^( SET_LIST_EXP_T ctls_set_list_expr )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1172:12: ^( SET_LIST_EXP_T ctls_set_list_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1174:1: ctls_set_list_expr : simple_root_expr ( TOK_COMMA simple_root_expr )* ;
    public final ctls_set_list_expr_return ctls_set_list_expr() throws RecognitionException {
        ctls_set_list_expr_return retval = new ctls_set_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COMMA190=null;
        simple_root_expr_return simple_root_expr189 = null;

        simple_root_expr_return simple_root_expr191 = null;


        Object TOK_COMMA190_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1175:9: ( simple_root_expr ( TOK_COMMA simple_root_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1175:11: simple_root_expr ( TOK_COMMA simple_root_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr11992);
            simple_root_expr189=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr189.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1175:28: ( TOK_COMMA simple_root_expr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==TOK_COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1175:29: TOK_COMMA simple_root_expr
            	    {
            	    TOK_COMMA190=(Token)input.LT(1);
            	    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_set_list_expr11995); if (failed) return retval;
            	    pushFollow(FOLLOW_simple_root_expr_in_ctls_set_list_expr11998);
            	    simple_root_expr191=simple_root_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, simple_root_expr191.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1177:1: ctls_shift_expr returns [InternalSpec ret] : f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1180:9: (f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1180:11: f= ctls_remainder_expr (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12044);
            f=ctls_remainder_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1181:9: (op= TOK_LSHIFT s= ctls_remainder_expr | op= TOK_RSHIFT s= ctls_remainder_expr )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==TOK_LSHIFT) ) {
                    alt74=1;
                }
                else if ( (LA74_0==TOK_RSHIFT) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1181:11: op= TOK_LSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_LSHIFT,FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12060); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12065);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1183:11: op= TOK_RSHIFT s= ctls_remainder_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_RSHIFT,FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12089); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12094);
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
    // $ANTLR end ctls_shift_expr

    public static class ctls_remainder_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_remainder_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1187:1: ctls_remainder_expr returns [InternalSpec ret] : f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1190:9: (f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1190:11: f= ctls_additive_expr (op= TOK_MOD s= ctls_additive_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12156);
            f=ctls_additive_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1191:9: (op= TOK_MOD s= ctls_additive_expr )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==TOK_MOD) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1191:11: op= TOK_MOD s= ctls_additive_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MOD,FOLLOW_TOK_MOD_in_ctls_remainder_expr12172); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12177);
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
    // $ANTLR end ctls_remainder_expr

    public static class ctls_additive_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_additive_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1198:1: ctls_additive_expr returns [InternalSpec ret] : f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1201:9: (f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1201:11: f= ctls_multiplicative_expr (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12242);
            f=ctls_multiplicative_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1202:9: (op= TOK_PLUS s= ctls_multiplicative_expr | op= TOK_MINUS s= ctls_multiplicative_expr )*
            loop76:
            do {
                int alt76=3;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==TOK_PLUS) ) {
                    alt76=1;
                }
                else if ( (LA76_0==TOK_MINUS) ) {
                    alt76=2;
                }


                switch (alt76) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1202:11: op= TOK_PLUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_ctls_additive_expr12258); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12263);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1204:11: op= TOK_MINUS s= ctls_multiplicative_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_additive_expr12287); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12292);
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
    // $ANTLR end ctls_additive_expr

    public static class ctls_multiplicative_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_multiplicative_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1208:1: ctls_multiplicative_expr returns [InternalSpec ret] : f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1211:9: (f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1211:11: f= ctls_concatination_expr (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12352);
            f=ctls_concatination_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1212:9: (op= TOK_TIMES s= ctls_concatination_expr | op= TOK_DIVIDE s= ctls_concatination_expr )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==TOK_TIMES) ) {
                    alt77=1;
                }
                else if ( (LA77_0==TOK_DIVIDE) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1212:11: op= TOK_TIMES s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_TIMES,FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12368); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12373);
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1214:11: op= TOK_DIVIDE s= ctls_concatination_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_DIVIDE,FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12397); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12402);
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
    // $ANTLR end ctls_multiplicative_expr

    public static class ctls_concatination_expr_return extends ParserRuleReturnScope {
        public InternalSpec ret;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ctls_concatination_expr
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1218:1: ctls_concatination_expr returns [InternalSpec ret] : f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* ;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1221:9: (f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1221:11: f= ctls_primary_expr (op= TOK_CONCATENATION s= ctls_primary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12463);
            f=ctls_primary_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( backtracking==0 ) {
               if (!er()) exp_str += input.toString(f.start,f.stop); if(!er()) retval.ret = f.ret; 
            }
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1222:9: (op= TOK_CONCATENATION s= ctls_primary_expr )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==TOK_CONCATENATION) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1222:11: op= TOK_CONCATENATION s= ctls_primary_expr
            	    {
            	    op=(Token)input.LT(1);
            	    match(input,TOK_CONCATENATION,FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12479); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    root_0 = (Object)adaptor.becomeRoot(op_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12484);
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
            	    break loop78;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1227:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );
    public final ctls_primary_expr_return ctls_primary_expr() throws RecognitionException {
        ctls_primary_expr_return retval = new ctls_primary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        ctls_primary_expr_return v = null;

        ctls_primary_expr_helper1_return ctls_primary_expr_helper1192 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NOT=new RewriteRuleTokenStream(adaptor,"token TOK_NOT");
        RewriteRuleSubtreeStream stream_ctls_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule ctls_primary_expr");
        boolean append_end = false; 
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1230:9: ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) )
            int alt79=3;
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
                alt79=1;
                }
                break;
            case TOK_MINUS:
                {
                alt79=2;
                }
                break;
            case TOK_NOT:
                {
                alt79=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1227:1: ctls_primary_expr returns [InternalSpec ret] : ( ctls_primary_expr_helper1 | op= TOK_MINUS v= ctls_primary_expr -> ^( TOK_UNARY_MINUS_T $v) | op= TOK_NOT v= ctls_primary_expr -> ^( TOK_NOT $v) );", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1230:11: ctls_primary_expr_helper1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12553);
                    ctls_primary_expr_helper1192=ctls_primary_expr_helper1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ctls_primary_expr_helper1192.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_primary_expr_helper1192.ret; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1232:11: op= TOK_MINUS v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_ctls_primary_expr12577); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12581);
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
                    // 1234:9: -> ^( TOK_UNARY_MINUS_T $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1234:12: ^( TOK_UNARY_MINUS_T $v)
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1235:11: op= TOK_NOT v= ctls_primary_expr
                    {
                    op=(Token)input.LT(1);
                    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_ctls_primary_expr12622); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NOT.add(op);

                    pushFollow(FOLLOW_ctls_primary_expr_in_ctls_primary_expr12626);
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
                    // 1237:9: -> ^( TOK_NOT $v)
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1237:12: ^( TOK_NOT $v)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1240:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );
    public final ctls_primary_expr_helper1_return ctls_primary_expr_helper1() throws RecognitionException {
        ctls_primary_expr_helper1_return retval = new ctls_primary_expr_helper1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tc1=null;
        Token tc2=null;
        Token TOK_LP196=null;
        Token TOK_RP198=null;
        Token TOK_BOOL200=null;
        Token TOK_LP201=null;
        Token TOK_RP203=null;
        Token TOK_WORD1205=null;
        Token TOK_LP206=null;
        Token TOK_RP208=null;
        Token TOK_NEXT210=null;
        Token TOK_LP211=null;
        Token TOK_RP213=null;
        Token TOK_CASE215=null;
        Token TOK_ESAC217=null;
        Token TOK_WAREAD219=null;
        Token TOK_LP220=null;
        Token TOK_COMMA221=null;
        Token TOK_RP222=null;
        Token TOK_WAWRITE224=null;
        Token TOK_LP225=null;
        Token TOK_RP226=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;

        simple_root_expr_return m = null;

        constant_return constant193 = null;

        primary_expr_select_return primary_expr_select194 = null;

        primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1195 = null;

        ctls_root_expr_return ctls_root_expr197 = null;

        primary_expr_select_return primary_expr_select199 = null;

        simple_root_expr_return simple_root_expr202 = null;

        primary_expr_select_return primary_expr_select204 = null;

        simple_root_expr_return simple_root_expr207 = null;

        primary_expr_select_return primary_expr_select209 = null;

        simple_root_expr_return simple_root_expr212 = null;

        primary_expr_select_return primary_expr_select214 = null;

        case_element_list_expr_return case_element_list_expr216 = null;

        primary_expr_select_return primary_expr_select218 = null;

        primary_expr_select_return primary_expr_select223 = null;

        primary_expr_select_return primary_expr_select227 = null;


        Object tc1_tree=null;
        Object tc2_tree=null;
        Object TOK_LP196_tree=null;
        Object TOK_RP198_tree=null;
        Object TOK_BOOL200_tree=null;
        Object TOK_LP201_tree=null;
        Object TOK_RP203_tree=null;
        Object TOK_WORD1205_tree=null;
        Object TOK_LP206_tree=null;
        Object TOK_RP208_tree=null;
        Object TOK_NEXT210_tree=null;
        Object TOK_LP211_tree=null;
        Object TOK_RP213_tree=null;
        Object TOK_CASE215_tree=null;
        Object TOK_ESAC217_tree=null;
        Object TOK_WAREAD219_tree=null;
        Object TOK_LP220_tree=null;
        Object TOK_COMMA221_tree=null;
        Object TOK_RP222_tree=null;
        Object TOK_WAWRITE224_tree=null;
        Object TOK_LP225_tree=null;
        Object TOK_RP226_tree=null;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1243:9: ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) )
            int alt80=9;
            switch ( input.LA(1) ) {
            case TOK_PLUS:
            case TOK_NUMBER:
            case TOK_NUMBER_WORD:
            case TOK_FALSEEXP:
            case TOK_TRUEEXP:
                {
                alt80=1;
                }
                break;
            case TOK_ATOM:
                {
                alt80=2;
                }
                break;
            case TOK_LP:
                {
                alt80=3;
                }
                break;
            case TOK_BOOL:
                {
                alt80=4;
                }
                break;
            case TOK_WORD1:
                {
                alt80=5;
                }
                break;
            case TOK_NEXT:
                {
                alt80=6;
                }
                break;
            case TOK_CASE:
                {
                alt80=7;
                }
                break;
            case TOK_WAREAD:
                {
                alt80=8;
                }
                break;
            case TOK_WAWRITE:
                {
                alt80=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1240:1: ctls_primary_expr_helper1 returns [InternalSpec ret] : ( constant primary_expr_select -> ^( VALUE_T constant NOP primary_expr_select ) | primary_expr_helper1_pointer1 | TOK_LP ctls_root_expr TOK_RP primary_expr_select -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select ) | TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select ) | TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select ) | TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select ) | TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select ) | TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAREAD $f $s NOP primary_expr_select ) | TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select ) );", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1243:11: constant primary_expr_select
                    {
                    pushFollow(FOLLOW_constant_in_ctls_primary_expr_helper112691);
                    constant193=constant();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constant.add(constant193.getTree());
                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112693);
                    primary_expr_select194=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select194.getTree());
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
                    // 1246:9: -> ^( VALUE_T constant NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1246:12: ^( VALUE_T constant NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1247:11: primary_expr_helper1_pointer1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112744);
                    primary_expr_helper1_pointer1195=primary_expr_helper1_pointer1();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_helper1_pointer1195.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1256:11: TOK_LP ctls_root_expr TOK_RP primary_expr_select
                    {
                    TOK_LP196=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112797); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP196);

                    pushFollow(FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112799);
                    ctls_root_expr197=ctls_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_ctls_root_expr.add(ctls_root_expr197.getTree());
                    TOK_RP198=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112801); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP198);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112803);
                    primary_expr_select199=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select199.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) retval.ret = ctls_root_expr197.ret; 
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
                    // 1258:9: -> ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1258:12: ^( BLOCK_T ctls_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1262:11: TOK_BOOL TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_BOOL200=(Token)input.LT(1);
                    match(input,TOK_BOOL,FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112874); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_BOOL.add(TOK_BOOL200);

                    TOK_LP201=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112876); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP201);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112878);
                    simple_root_expr202=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr202.getTree());
                    TOK_RP203=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112880); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP203);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112882);
                    primary_expr_select204=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select204.getTree());
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
                    // 1265:9: -> ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1265:12: ^( TOK_BOOL simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1266:11: TOK_WORD1 TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WORD1205=(Token)input.LT(1);
                    match(input,TOK_WORD1,FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper112933); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WORD1.add(TOK_WORD1205);

                    TOK_LP206=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper112935); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP206);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112937);
                    simple_root_expr207=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr207.getTree());
                    TOK_RP208=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper112939); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP208);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112941);
                    primary_expr_select209=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select209.getTree());
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
                    // 1269:9: -> ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1269:12: ^( TOK_WORD1 simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1271:11: TOK_NEXT TOK_LP simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_NEXT210=(Token)input.LT(1);
                    match(input,TOK_NEXT,FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113001); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NEXT.add(TOK_NEXT210);

                    TOK_LP211=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113003); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP211);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113005);
                    simple_root_expr212=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr212.getTree());
                    TOK_RP213=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113007); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP213);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113009);
                    primary_expr_select214=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select214.getTree());
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
                    // 1274:9: -> ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1274:12: ^( TOK_NEXT simple_root_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1276:11: TOK_CASE case_element_list_expr TOK_ESAC primary_expr_select
                    {
                    TOK_CASE215=(Token)input.LT(1);
                    match(input,TOK_CASE,FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113069); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_CASE.add(TOK_CASE215);

                    pushFollow(FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113071);
                    case_element_list_expr216=case_element_list_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_case_element_list_expr.add(case_element_list_expr216.getTree());
                    TOK_ESAC217=(Token)input.LT(1);
                    match(input,TOK_ESAC,FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113073); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_ESAC.add(TOK_ESAC217);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113075);
                    primary_expr_select218=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select218.getTree());
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
                    // 1279:9: -> ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1279:12: ^( CASE_LIST_EXPR_T case_element_list_expr NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1281:11: TOK_WAREAD TOK_LP f= simple_root_expr TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAREAD219=(Token)input.LT(1);
                    match(input,TOK_WAREAD,FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113135); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAREAD.add(TOK_WAREAD219);

                    TOK_LP220=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113137); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP220);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113141);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    TOK_COMMA221=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113143); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(TOK_COMMA221);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113147);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP222=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113149); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP222);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113151);
                    primary_expr_select223=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select223.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: primary_expr_select, TOK_WAREAD, f, s
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
                    // 1284:9: -> ^( TOK_WAREAD $f $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1284:12: ^( TOK_WAREAD $f $s NOP primary_expr_select )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1286:11: TOK_WAWRITE TOK_LP f= simple_root_expr tc1= TOK_COMMA m= simple_root_expr tc2= TOK_COMMA s= simple_root_expr TOK_RP primary_expr_select
                    {
                    TOK_WAWRITE224=(Token)input.LT(1);
                    match(input,TOK_WAWRITE,FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113215); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_WAWRITE.add(TOK_WAWRITE224);

                    TOK_LP225=(Token)input.LT(1);
                    match(input,TOK_LP,FOLLOW_TOK_LP_in_ctls_primary_expr_helper113217); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_LP.add(TOK_LP225);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113221);
                    f=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
                    tc1=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113225); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc1);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113229);
                    m=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(m.getTree());
                    tc2=(Token)input.LT(1);
                    match(input,TOK_COMMA,FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113233); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_COMMA.add(tc2);

                    pushFollow(FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113237);
                    s=simple_root_expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
                    TOK_RP226=(Token)input.LT(1);
                    match(input,TOK_RP,FOLLOW_TOK_RP_in_ctls_primary_expr_helper113239); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_RP.add(TOK_RP226);

                    pushFollow(FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113241);
                    primary_expr_select227=primary_expr_select();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select227.getTree());
                    if ( backtracking==0 ) {
                       if(!er()) append_end = true; if(!er()) retval.ret = InitSpec.mk_ref(input, ((Token)retval.start), input.toString(retval.start,input.LT(-1))); 
                    }

                    // AST REWRITE
                    // elements: TOK_WAWRITE, primary_expr_select, s, m, f
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
                    // 1289:9: -> ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1289:12: ^( TOK_WAWRITE $f $m $s NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1299:1: primary_expr_helper1_pointer1 : TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) ;
    public final primary_expr_helper1_pointer1_return primary_expr_helper1_pointer1() throws RecognitionException {
        primary_expr_helper1_pointer1_return retval = new primary_expr_helper1_pointer1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_ATOM228=null;
        primary_expr_select_return primary_expr_select229 = null;


        Object TOK_ATOM228_tree=null;
        RewriteRuleTokenStream stream_TOK_ATOM=new RewriteRuleTokenStream(adaptor,"token TOK_ATOM");
        RewriteRuleSubtreeStream stream_primary_expr_select=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr_select");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1299:31: ( TOK_ATOM primary_expr_select -> ^( VALUE_T TOK_ATOM NOP primary_expr_select ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1299:33: TOK_ATOM primary_expr_select
            {
            TOK_ATOM228=(Token)input.LT(1);
            match(input,TOK_ATOM,FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113312); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_ATOM.add(TOK_ATOM228);

            pushFollow(FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113314);
            primary_expr_select229=primary_expr_select();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_primary_expr_select.add(primary_expr_select229.getTree());

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
            // 1300:9: -> ^( VALUE_T TOK_ATOM NOP primary_expr_select )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1300:12: ^( VALUE_T TOK_ATOM NOP primary_expr_select )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:1: primary_expr_select : ( primary_expr_select_helper | primary_expr_ref )* ;
    public final primary_expr_select_return primary_expr_select() throws RecognitionException {
        primary_expr_select_return retval = new primary_expr_select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_return primary_expr_select_helper230 = null;

        primary_expr_ref_return primary_expr_ref231 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:24: ( ( primary_expr_select_helper | primary_expr_ref )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:26: ( primary_expr_select_helper | primary_expr_ref )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:26: ( primary_expr_select_helper | primary_expr_ref )*
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==TOK_LB) ) {
                    alt81=1;
                }
                else if ( (LA81_0==TOK_DOT) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:27: primary_expr_select_helper
            	    {
            	    pushFollow(FOLLOW_primary_expr_select_helper_in_primary_expr_select13357);
            	    primary_expr_select_helper230=primary_expr_select_helper();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper230.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1305:56: primary_expr_ref
            	    {
            	    pushFollow(FOLLOW_primary_expr_ref_in_primary_expr_select13361);
            	    primary_expr_ref231=primary_expr_ref();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_ref231.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:1: primary_expr_ref : ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) ;
    public final primary_expr_ref_return primary_expr_ref() throws RecognitionException {
        primary_expr_ref_return retval = new primary_expr_ref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_DOT232=null;
        Token set233=null;

        Object TOK_DOT232_tree=null;
        Object set233_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:21: ( ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:23: ( TOK_DOT ( TOK_ATOM | TOK_NUMBER ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1307:24: TOK_DOT ( TOK_ATOM | TOK_NUMBER )
            {
            TOK_DOT232=(Token)input.LT(1);
            match(input,TOK_DOT,FOLLOW_TOK_DOT_in_primary_expr_ref13384); if (failed) return retval;
            set233=(Token)input.LT(1);
            if ( input.LA(1)==TOK_ATOM||input.LA(1)==TOK_NUMBER ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set233));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_primary_expr_ref13387);    throw mse;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );
    public final primary_expr_select_helper_return primary_expr_select_helper() throws RecognitionException {
        primary_expr_select_helper_return retval = new primary_expr_select_helper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix234 = null;

        primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix235 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1309:29: ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==TOK_LB) ) {
                switch ( input.LA(2) ) {
                case TOK_FALSEEXP:
                    {
                    int LA82_2 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_TRUEEXP:
                    {
                    int LA82_3 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_NUMBER:
                    {
                    int LA82_4 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_PLUS:
                    {
                    int LA82_5 = input.LA(3);

                    if ( (LA82_5==TOK_NUMBER) ) {
                        int LA82_23 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 23, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_NUMBER_WORD:
                    {
                    int LA82_6 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_ATOM:
                    {
                    int LA82_7 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_LP:
                    {
                    int LA82_8 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_BOOL:
                    {
                    int LA82_9 = input.LA(3);

                    if ( (LA82_9==TOK_LP) ) {
                        int LA82_29 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 29, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WORD1:
                    {
                    int LA82_10 = input.LA(3);

                    if ( (LA82_10==TOK_LP) ) {
                        int LA82_30 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 30, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_NEXT:
                    {
                    int LA82_11 = input.LA(3);

                    if ( (LA82_11==TOK_LP) ) {
                        int LA82_31 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 31, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_CASE:
                    {
                    int LA82_12 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WAREAD:
                    {
                    int LA82_13 = input.LA(3);

                    if ( (LA82_13==TOK_LP) ) {
                        int LA82_34 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 34, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_WAWRITE:
                    {
                    int LA82_14 = input.LA(3);

                    if ( (LA82_14==TOK_LP) ) {
                        int LA82_35 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 35, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case TOK_MINUS:
                    {
                    switch ( input.LA(3) ) {
                    case TOK_NUMBER:
                        {
                        int LA82_36 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_FALSEEXP:
                        {
                        int LA82_37 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_TRUEEXP:
                        {
                        int LA82_38 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA82_39 = input.LA(4);

                        if ( (LA82_39==TOK_NUMBER) ) {
                            int LA82_83 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 83, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER_WORD:
                        {
                        int LA82_40 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_ATOM:
                        {
                        int LA82_41 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_LP:
                        {
                        int LA82_42 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA82_43 = input.LA(4);

                        if ( (LA82_43==TOK_LP) ) {
                            int LA82_89 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 89, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
                        {
                        int LA82_44 = input.LA(4);

                        if ( (LA82_44==TOK_LP) ) {
                            int LA82_90 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 90, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
                        {
                        int LA82_45 = input.LA(4);

                        if ( (LA82_45==TOK_LP) ) {
                            int LA82_91 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 91, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 45, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_CASE:
                        {
                        int LA82_46 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA82_47 = input.LA(4);

                        if ( (LA82_47==TOK_LP) ) {
                            int LA82_94 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 94, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 47, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
                        {
                        int LA82_48 = input.LA(4);

                        if ( (LA82_48==TOK_LP) ) {
                            int LA82_95 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 95, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 48, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_MINUS:
                        {
                        int LA82_49 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NOT:
                        {
                        switch ( input.LA(4) ) {
                        case TOK_FALSEEXP:
                            {
                            int LA82_98 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 98, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_TRUEEXP:
                            {
                            int LA82_99 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 99, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER:
                            {
                            int LA82_100 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 100, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_PLUS:
                            {
                            int LA82_101 = input.LA(5);

                            if ( (LA82_101==TOK_NUMBER) ) {
                                int LA82_166 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 166, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 101, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER_WORD:
                            {
                            int LA82_102 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 102, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_ATOM:
                            {
                            int LA82_103 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 103, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_LP:
                            {
                            int LA82_104 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 104, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_BOOL:
                            {
                            int LA82_105 = input.LA(5);

                            if ( (LA82_105==TOK_LP) ) {
                                int LA82_173 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 173, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 105, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WORD1:
                            {
                            int LA82_106 = input.LA(5);

                            if ( (LA82_106==TOK_LP) ) {
                                int LA82_174 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 174, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 106, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NEXT:
                            {
                            int LA82_107 = input.LA(5);

                            if ( (LA82_107==TOK_LP) ) {
                                int LA82_175 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 175, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 107, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_CASE:
                            {
                            int LA82_108 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 108, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAREAD:
                            {
                            int LA82_109 = input.LA(5);

                            if ( (LA82_109==TOK_LP) ) {
                                int LA82_178 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 178, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 109, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAWRITE:
                            {
                            int LA82_110 = input.LA(5);

                            if ( (LA82_110==TOK_LP) ) {
                                int LA82_179 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 179, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 110, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_MINUS:
                            {
                            int LA82_111 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 111, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NOT:
                            {
                            int LA82_112 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 112, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 50, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 15, input);

                        throw nvae;
                    }

                    }
                    break;
                case TOK_NOT:
                    {
                    switch ( input.LA(3) ) {
                    case TOK_FALSEEXP:
                        {
                        int LA82_51 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_TRUEEXP:
                        {
                        int LA82_52 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER:
                        {
                        int LA82_53 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_PLUS:
                        {
                        int LA82_54 = input.LA(4);

                        if ( (LA82_54==TOK_NUMBER) ) {
                            int LA82_118 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 118, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NUMBER_WORD:
                        {
                        int LA82_55 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_ATOM:
                        {
                        int LA82_56 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_LP:
                        {
                        int LA82_57 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_BOOL:
                        {
                        int LA82_58 = input.LA(4);

                        if ( (LA82_58==TOK_LP) ) {
                            int LA82_125 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 125, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WORD1:
                        {
                        int LA82_59 = input.LA(4);

                        if ( (LA82_59==TOK_LP) ) {
                            int LA82_126 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 126, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_NEXT:
                        {
                        int LA82_60 = input.LA(4);

                        if ( (LA82_60==TOK_LP) ) {
                            int LA82_127 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 127, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 60, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_CASE:
                        {
                        int LA82_61 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 61, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAREAD:
                        {
                        int LA82_62 = input.LA(4);

                        if ( (LA82_62==TOK_LP) ) {
                            int LA82_130 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 130, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 62, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_WAWRITE:
                        {
                        int LA82_63 = input.LA(4);

                        if ( (LA82_63==TOK_LP) ) {
                            int LA82_131 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 131, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOK_MINUS:
                        {
                        switch ( input.LA(4) ) {
                        case TOK_FALSEEXP:
                            {
                            int LA82_132 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 132, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_TRUEEXP:
                            {
                            int LA82_133 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 133, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER:
                            {
                            int LA82_134 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 134, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_PLUS:
                            {
                            int LA82_135 = input.LA(5);

                            if ( (LA82_135==TOK_NUMBER) ) {
                                int LA82_201 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 201, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 135, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NUMBER_WORD:
                            {
                            int LA82_136 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 136, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_ATOM:
                            {
                            int LA82_137 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 137, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_LP:
                            {
                            int LA82_138 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 138, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_BOOL:
                            {
                            int LA82_139 = input.LA(5);

                            if ( (LA82_139==TOK_LP) ) {
                                int LA82_208 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 208, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 139, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WORD1:
                            {
                            int LA82_140 = input.LA(5);

                            if ( (LA82_140==TOK_LP) ) {
                                int LA82_209 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 209, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 140, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NEXT:
                            {
                            int LA82_141 = input.LA(5);

                            if ( (LA82_141==TOK_LP) ) {
                                int LA82_210 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 210, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 141, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_CASE:
                            {
                            int LA82_142 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 142, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAREAD:
                            {
                            int LA82_143 = input.LA(5);

                            if ( (LA82_143==TOK_LP) ) {
                                int LA82_213 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 213, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 143, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_WAWRITE:
                            {
                            int LA82_144 = input.LA(5);

                            if ( (LA82_144==TOK_LP) ) {
                                int LA82_214 = input.LA(6);

                                if ( (synpred16()) ) {
                                    alt82=1;
                                }
                                else if ( (true) ) {
                                    alt82=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 214, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 144, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_MINUS:
                            {
                            int LA82_145 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 145, input);

                                throw nvae;
                            }
                            }
                            break;
                        case TOK_NOT:
                            {
                            int LA82_146 = input.LA(5);

                            if ( (synpred16()) ) {
                                alt82=1;
                            }
                            else if ( (true) ) {
                                alt82=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 146, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 64, input);

                            throw nvae;
                        }

                        }
                        break;
                    case TOK_NOT:
                        {
                        int LA82_65 = input.LA(4);

                        if ( (synpred16()) ) {
                            alt82=1;
                        }
                        else if ( (true) ) {
                            alt82=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 16, input);

                        throw nvae;
                    }

                    }
                    break;
                case TOK_LCB:
                    {
                    int LA82_17 = input.LA(3);

                    if ( (synpred16()) ) {
                        alt82=1;
                    }
                    else if ( (true) ) {
                        alt82=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1309:1: primary_expr_select_helper : ( ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix | primary_expr_select_helper_bit_suffix );", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1309:31: ( TOK_LB simple_root_expr TOK_RB )=> primary_expr_select_helper_arr_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13421);
                    primary_expr_select_helper_arr_suffix234=primary_expr_select_helper_arr_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_arr_suffix234.getTree());

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1310:11: primary_expr_select_helper_bit_suffix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13433);
                    primary_expr_select_helper_bit_suffix235=primary_expr_select_helper_bit_suffix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primary_expr_select_helper_bit_suffix235.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1312:1: primary_expr_select_helper_arr_suffix : TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) ;
    public final primary_expr_select_helper_arr_suffix_return primary_expr_select_helper_arr_suffix() throws RecognitionException {
        primary_expr_select_helper_arr_suffix_return retval = new primary_expr_select_helper_arr_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB236=null;
        Token TOK_RB238=null;
        simple_root_expr_return simple_root_expr237 = null;


        Object TOK_LB236_tree=null;
        Object TOK_RB238_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1313:9: ( TOK_LB simple_root_expr TOK_RB -> ^( ARRAY_INDEX_T simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1313:11: TOK_LB simple_root_expr TOK_RB
            {
            TOK_LB236=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13457); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB236);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13459);
            simple_root_expr237=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr237.getTree());
            TOK_RB238=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13461); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB238);


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
            // 1314:9: -> ^( ARRAY_INDEX_T simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1314:12: ^( ARRAY_INDEX_T simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1316:1: primary_expr_select_helper_bit_suffix : TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) ;
    public final primary_expr_select_helper_bit_suffix_return primary_expr_select_helper_bit_suffix() throws RecognitionException {
        primary_expr_select_helper_bit_suffix_return retval = new primary_expr_select_helper_bit_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_LB239=null;
        Token TOK_COLON240=null;
        Token TOK_RB241=null;
        simple_root_expr_return f = null;

        simple_root_expr_return s = null;


        Object TOK_LB239_tree=null;
        Object TOK_COLON240_tree=null;
        Object TOK_RB241_tree=null;
        RewriteRuleTokenStream stream_TOK_LB=new RewriteRuleTokenStream(adaptor,"token TOK_LB");
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_RB=new RewriteRuleTokenStream(adaptor,"token TOK_RB");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1317:9: ( TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB -> ^( BIT_SELECT_T $f $s) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1317:11: TOK_LB f= simple_root_expr TOK_COLON s= simple_root_expr TOK_RB
            {
            TOK_LB239=(Token)input.LT(1);
            match(input,TOK_LB,FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13501); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_LB.add(TOK_LB239);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13505);
            f=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(f.getTree());
            TOK_COLON240=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13507); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON240);

            pushFollow(FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13511);
            s=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(s.getTree());
            TOK_RB241=(Token)input.LT(1);
            match(input,TOK_RB,FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13513); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_RB.add(TOK_RB241);


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
            // 1318:9: -> ^( BIT_SELECT_T $f $s)
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1318:12: ^( BIT_SELECT_T $f $s)
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1321:1: case_element_expr : simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) ;
    public final case_element_expr_return case_element_expr() throws RecognitionException {
        case_element_expr_return retval = new case_element_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_COLON243=null;
        Token TOK_SEMI245=null;
        simple_root_expr_return simple_root_expr242 = null;

        simple_root_expr_return simple_root_expr244 = null;


        Object TOK_COLON243_tree=null;
        Object TOK_SEMI245_tree=null;
        RewriteRuleTokenStream stream_TOK_COLON=new RewriteRuleTokenStream(adaptor,"token TOK_COLON");
        RewriteRuleTokenStream stream_TOK_SEMI=new RewriteRuleTokenStream(adaptor,"token TOK_SEMI");
        RewriteRuleSubtreeStream stream_simple_root_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_root_expr");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1321:22: ( simple_root_expr TOK_COLON simple_root_expr TOK_SEMI -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1321:24: simple_root_expr TOK_COLON simple_root_expr TOK_SEMI
            {
            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13561);
            simple_root_expr242=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr242.getTree());
            TOK_COLON243=(Token)input.LT(1);
            match(input,TOK_COLON,FOLLOW_TOK_COLON_in_case_element_expr13563); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_COLON.add(TOK_COLON243);

            pushFollow(FOLLOW_simple_root_expr_in_case_element_expr13565);
            simple_root_expr244=simple_root_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simple_root_expr.add(simple_root_expr244.getTree());
            TOK_SEMI245=(Token)input.LT(1);
            match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_case_element_expr13567); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_SEMI.add(TOK_SEMI245);


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
            // 1322:9: -> ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1322:12: ^( CASE_ELEMENT_EXPR_T simple_root_expr simple_root_expr )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:1: case_element_list_expr : case_element_expr ( case_element_expr )* ;
    public final case_element_list_expr_return case_element_list_expr() throws RecognitionException {
        case_element_list_expr_return retval = new case_element_list_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        case_element_expr_return case_element_expr246 = null;

        case_element_expr_return case_element_expr247 = null;



        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:26: ( case_element_expr ( case_element_expr )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:28: case_element_expr ( case_element_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13603);
            case_element_expr246=case_element_expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr246.getTree());
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:46: ( case_element_expr )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==TOK_LCB||(LA83_0>=TOK_PLUS && LA83_0<=TOK_MINUS)||(LA83_0>=TOK_NOT && LA83_0<=TOK_LP)||(LA83_0>=TOK_BOOL && LA83_0<=TOK_CASE)||(LA83_0>=TOK_WAREAD && LA83_0<=TOK_WAWRITE)||LA83_0==TOK_ATOM||LA83_0==TOK_NUMBER||LA83_0==TOK_NUMBER_WORD||(LA83_0>=TOK_FALSEEXP && LA83_0<=TOK_TRUEEXP)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1324:47: case_element_expr
            	    {
            	    pushFollow(FOLLOW_case_element_expr_in_case_element_list_expr13606);
            	    case_element_expr247=case_element_expr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, case_element_expr247.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1327:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );
    public final number_return number() throws RecognitionException {
        number_return retval = new number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER248=null;
        Token TOK_PLUS249=null;
        Token TOK_NUMBER250=null;

        Object TOK_NUMBER248_tree=null;
        Object TOK_PLUS249_tree=null;
        Object TOK_NUMBER250_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1327:14: ( TOK_NUMBER | TOK_PLUS TOK_NUMBER )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==TOK_NUMBER) ) {
                alt84=1;
            }
            else if ( (LA84_0==TOK_PLUS) ) {
                alt84=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1327:1: number : ( TOK_NUMBER | TOK_PLUS TOK_NUMBER );", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1327:16: TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_NUMBER248=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13631); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER248_tree = (Object)adaptor.create(TOK_NUMBER248);
                    adaptor.addChild(root_0, TOK_NUMBER248_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1328:11: TOK_PLUS TOK_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_PLUS249=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_number13643); if (failed) return retval;
                    TOK_NUMBER250=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_number13646); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_NUMBER250_tree = (Object)adaptor.create(TOK_NUMBER250);
                    adaptor.addChild(root_0, TOK_NUMBER250_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1329:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );
    public final integer_return integer() throws RecognitionException {
        integer_return retval = new integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER251=null;
        Token TOK_PLUS252=null;
        Token TOK_NUMBER253=null;
        Token TOK_MINUS254=null;
        Token TOK_NUMBER255=null;

        Object TOK_NUMBER251_tree=null;
        Object TOK_PLUS252_tree=null;
        Object TOK_NUMBER253_tree=null;
        Object TOK_MINUS254_tree=null;
        Object TOK_NUMBER255_tree=null;
        RewriteRuleTokenStream stream_TOK_MINUS=new RewriteRuleTokenStream(adaptor,"token TOK_MINUS");
        RewriteRuleTokenStream stream_TOK_NUMBER=new RewriteRuleTokenStream(adaptor,"token TOK_NUMBER");
        RewriteRuleTokenStream stream_TOK_PLUS=new RewriteRuleTokenStream(adaptor,"token TOK_PLUS");

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1329:15: ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case TOK_NUMBER:
                {
                alt85=1;
                }
                break;
            case TOK_PLUS:
                {
                alt85=2;
                }
                break;
            case TOK_MINUS:
                {
                alt85=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1329:1: integer : ( TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_PLUS TOK_NUMBER -> ^( TOK_PLUS TOK_NUMBER ) | TOK_MINUS TOK_NUMBER -> ^( TOK_MINUS TOK_NUMBER ) );", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1329:17: TOK_NUMBER
                    {
                    TOK_NUMBER251=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13659); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER251);


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
                    // 1330:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1330:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1331:11: TOK_PLUS TOK_NUMBER
                    {
                    TOK_PLUS252=(Token)input.LT(1);
                    match(input,TOK_PLUS,FOLLOW_TOK_PLUS_in_integer13687); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_PLUS.add(TOK_PLUS252);

                    TOK_NUMBER253=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13689); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER253);


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
                    // 1332:9: -> ^( TOK_PLUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1332:12: ^( TOK_PLUS TOK_NUMBER )
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1333:11: TOK_MINUS TOK_NUMBER
                    {
                    TOK_MINUS254=(Token)input.LT(1);
                    match(input,TOK_MINUS,FOLLOW_TOK_MINUS_in_integer13717); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_MINUS.add(TOK_MINUS254);

                    TOK_NUMBER255=(Token)input.LT(1);
                    match(input,TOK_NUMBER,FOLLOW_TOK_NUMBER_in_integer13719); if (failed) return retval;
                    if ( backtracking==0 ) stream_TOK_NUMBER.add(TOK_NUMBER255);


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
                    // 1334:9: -> ^( TOK_MINUS TOK_NUMBER )
                    {
                        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1334:12: ^( TOK_MINUS TOK_NUMBER )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:1: number_word : TOK_NUMBER_WORD ;
    public final number_word_return number_word() throws RecognitionException {
        number_word_return retval = new number_word_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_NUMBER_WORD256=null;

        Object TOK_NUMBER_WORD256_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:18: ( TOK_NUMBER_WORD )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1336:20: TOK_NUMBER_WORD
            {
            root_0 = (Object)adaptor.nil();

            TOK_NUMBER_WORD256=(Token)input.LT(1);
            match(input,TOK_NUMBER_WORD,FOLLOW_TOK_NUMBER_WORD_in_number_word13756); if (failed) return retval;
            if ( backtracking==0 ) {
            TOK_NUMBER_WORD256_tree = (Object)adaptor.create(TOK_NUMBER_WORD256);
            adaptor.addChild(root_0, TOK_NUMBER_WORD256_tree);
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1339:1: subrange returns [InternalSpecRange ret] : f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) ;
    public final subrange_return subrange() throws RecognitionException {
        subrange_return retval = new subrange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_TWODOTS257=null;
        integer_return f = null;

        integer_return s = null;


        Object TOK_TWODOTS257_tree=null;
        RewriteRuleTokenStream stream_TOK_TWODOTS=new RewriteRuleTokenStream(adaptor,"token TOK_TWODOTS");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1341:9: (f= integer TOK_TWODOTS s= integer -> ^( SUBRANGE_T integer integer ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1341:11: f= integer TOK_TWODOTS s= integer
            {
            pushFollow(FOLLOW_integer_in_subrange13795);
            f=integer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_integer.add(f.getTree());
            TOK_TWODOTS257=(Token)input.LT(1);
            match(input,TOK_TWODOTS,FOLLOW_TOK_TWODOTS_in_subrange13797); if (failed) return retval;
            if ( backtracking==0 ) stream_TOK_TWODOTS.add(TOK_TWODOTS257);

            pushFollow(FOLLOW_integer_in_subrange13801);
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
            // 1343:9: -> ^( SUBRANGE_T integer integer )
            {
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1343:12: ^( SUBRANGE_T integer integer )
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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1345:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_FALSEEXP258=null;
        Token TOK_TRUEEXP259=null;
        number_return number260 = null;

        number_word_return number_word261 = null;


        Object TOK_FALSEEXP258_tree=null;
        Object TOK_TRUEEXP259_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1345:15: ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word )
            int alt86=4;
            switch ( input.LA(1) ) {
            case TOK_FALSEEXP:
                {
                alt86=1;
                }
                break;
            case TOK_TRUEEXP:
                {
                alt86=2;
                }
                break;
            case TOK_PLUS:
            case TOK_NUMBER:
                {
                alt86=3;
                }
                break;
            case TOK_NUMBER_WORD:
                {
                alt86=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: constant : ( TOK_FALSEEXP | TOK_TRUEEXP | number | number_word );", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1345:17: TOK_FALSEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_FALSEEXP258=(Token)input.LT(1);
                    match(input,TOK_FALSEEXP,FOLLOW_TOK_FALSEEXP_in_constant13850); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_FALSEEXP258_tree = (Object)adaptor.create(TOK_FALSEEXP258);
                    adaptor.addChild(root_0, TOK_FALSEEXP258_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1346:11: TOK_TRUEEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    TOK_TRUEEXP259=(Token)input.LT(1);
                    match(input,TOK_TRUEEXP,FOLLOW_TOK_TRUEEXP_in_constant13862); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TOK_TRUEEXP259_tree = (Object)adaptor.create(TOK_TRUEEXP259);
                    adaptor.addChild(root_0, TOK_TRUEEXP259_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1347:11: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_constant13874);
                    number260=number();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number260.getTree());

                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1348:11: number_word
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_word_in_constant13886);
                    number_word261=number_word();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number_word261.getTree());

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
    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:1: optsemi : ( TOK_SEMI )* ;
    public final optsemi_return optsemi() throws RecognitionException {
        optsemi_return retval = new optsemi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TOK_SEMI262=null;

        Object TOK_SEMI262_tree=null;

        try {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:15: ( ( TOK_SEMI )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:17: ( TOK_SEMI )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:17: ( TOK_SEMI )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==TOK_SEMI) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1352:17: TOK_SEMI
            	    {
            	    TOK_SEMI262=(Token)input.LT(1);
            	    match(input,TOK_SEMI,FOLLOW_TOK_SEMI_in_optsemi13911); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    TOK_SEMI262_tree = (Object)adaptor.create(TOK_SEMI262);
            	    adaptor.addChild(root_0, TOK_SEMI262_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
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
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:12: ( TOK_NOT )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==TOK_NOT) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:405:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred13114); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop88;
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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred13127);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:431:5: ( TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:431:6: TOK_LP agent_name TOK_KNOW ctl_root_expr TOK_RP
        {
        match(input,TOK_LP,FOLLOW_TOK_LP_in_synpred23377); if (failed) return ;
        pushFollow(FOLLOW_agent_name_in_synpred23379);
        agent_name();
        _fsp--;
        if (failed) return ;
        match(input,TOK_KNOW,FOLLOW_TOK_KNOW_in_synpred23381); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred23383);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_RP,FOLLOW_TOK_RP_in_synpred23385); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:474:11: ( TOK_AA TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:474:12: TOK_AA TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred33820); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred33822); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred33824);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred33826); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:475:11: ( TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:475:12: TOK_AA TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred43846); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred43848); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred43850);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred43852); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:476:11: ( TOK_EE TOK_LB ctl_root_expr TOK_UNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:476:12: TOK_EE TOK_LB ctl_root_expr TOK_UNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred53872); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred53874); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred53876);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_UNTIL,FOLLOW_TOK_UNTIL_in_synpred53878); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:477:11: ( TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:477:12: TOK_EE TOK_LB ctl_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred63898); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred63900); if (failed) return ;
        pushFollow(FOLLOW_ctl_root_expr_in_synpred63902);
        ctl_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred63904); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:12: ( TOK_NOT )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==TOK_NOT) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:743:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred76969); if (failed) return ;

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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred76982);    throw mse;
        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:11: ( ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:12: ( TOK_NOT )* ( TOK_OP_NEXT | TOK_OP_PREV | TOK_OP_NOTPREVNOT | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_FINALLY | TOK_OP_ONCE )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:12: ( TOK_NOT )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==TOK_NOT) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1000:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred89859); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop90;
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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred89872);    throw mse;
        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:11: ( ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG ) )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:12: ( TOK_NOT )* ( TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_AA | TOK_EE | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG )
        {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:12: ( TOK_NOT )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==TOK_NOT) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1037:12: TOK_NOT
        	    {
        	    match(input,TOK_NOT,FOLLOW_TOK_NOT_in_synpred910312); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop91;
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
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred910325);    throw mse;
        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1071:11: ( TOK_AA )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1071:12: TOK_AA
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1010750); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1072:11: ( TOK_EE )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1072:12: TOK_EE
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1110770); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1088:11: ( TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1088:12: TOK_AA TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1210987); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1210989); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1210991);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1210993); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1090:11: ( TOK_AA TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1090:12: TOK_AA TOK_LB
        {
        match(input,TOK_AA,FOLLOW_TOK_AA_in_synpred1311022); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1311024); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1096:11: ( TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1096:12: TOK_EE TOK_LB ctls_root_expr TOK_BUNTIL
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1411087); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1411089); if (failed) return ;
        pushFollow(FOLLOW_ctls_root_expr_in_synpred1411091);
        ctls_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_BUNTIL,FOLLOW_TOK_BUNTIL_in_synpred1411093); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1098:11: ( TOK_EE TOK_LB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1098:12: TOK_EE TOK_LB
        {
        match(input,TOK_EE,FOLLOW_TOK_EE_in_synpred1511122); if (failed) return ;
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1511124); if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1309:31: ( TOK_LB simple_root_expr TOK_RB )
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1309:32: TOK_LB simple_root_expr TOK_RB
        {
        match(input,TOK_LB,FOLLOW_TOK_LB_in_synpred1613412); if (failed) return ;
        pushFollow(FOLLOW_simple_root_expr_in_synpred1613414);
        simple_root_expr();
        _fsp--;
        if (failed) return ;
        match(input,TOK_RB,FOLLOW_TOK_RB_in_synpred1613416); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

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
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_EOF_in_spec144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_list_in_spec156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_spec158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list222 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_spec_element_in_spec_list238 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_invar_spec_in_spec_element281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_spec_in_spec_element295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_spec_in_spec_element309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_spec_in_spec_element323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_INVAR_SPEC_in_invar_spec371 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_invar_spec374 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_optsemi_in_invar_spec376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_SPEC_in_ctl_spec415 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_spec418 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_optsemi_in_ctl_spec420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LTL_SPEC_in_ltl_spec459 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_spec462 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_optsemi_in_ltl_spec464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CTL_STAR_SPEC_in_ctls_spec503 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_spec506 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_optsemi_in_ctls_spec508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_expr_in_simple_root_expr550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iff_expr_in_implies_expr594 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_implies_expr610 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_implies_expr_in_implies_expr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr681 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_iff_expr697 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_or_expr_in_iff_expr702 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr767 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_OR_in_or_expr783 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr788 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_or_expr812 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr817 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_or_expr841 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr846 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr910 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_AND_in_and_expr926 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_relational_expr_in_and_expr931 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr994 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_relational_expr1010 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1015 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_relational_expr1040 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1045 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LT_in_relational_expr1070 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1075 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GT_in_relational_expr1100 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1105 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LE_in_relational_expr1130 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1135 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GE_in_relational_expr1160 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_in_expr_in_relational_expr1165 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1230 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_in_expr1246 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_union_expr_in_in_expr1251 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1315 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_union_expr1331 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_set_expr_in_union_expr1336 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_shift_expr_in_set_expr1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_set_expr1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_set_expr1443 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_set_list_expr_in_set_expr1445 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_set_expr1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1501 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_set_list_expr1504 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_set_list_expr1507 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1552 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_shift_expr1568 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1573 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_shift_expr1597 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_remainder_expr_in_shift_expr1602 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1665 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_remainder_expr1681 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_additive_expr_in_remainder_expr1686 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1749 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_additive_expr1765 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1770 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_additive_expr1794 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1799 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1861 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_multiplicative_expr1877 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1882 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_multiplicative_expr1906 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_concatination_expr_in_multiplicative_expr1911 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr1973 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_concatination_expr1989 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_primary_expr_in_concatination_expr1994 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_in_primary_expr2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_primary_expr2106 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_primary_expr2150 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_primary_expr_in_primary_expr2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr_helper12219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_primary_expr_helper12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12296 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12298 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_primary_expr_helper12344 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12347 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12349 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_primary_expr_helper12396 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12398 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12400 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_primary_expr_helper12446 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12448 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12450 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_primary_expr_helper12496 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_primary_expr_helper12498 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_primary_expr_helper12500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_primary_expr_helper12544 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12546 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12548 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12550 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12552 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12554 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_primary_expr_helper12600 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_primary_expr_helper12602 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12604 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12606 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_primary_expr_helper12610 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_helper12612 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_primary_expr_helper12614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_root_expr2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_iff_expr_in_ctl_implies_expr2727 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctl_implies_expr2743 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_implies_expr_in_ctl_implies_expr2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2813 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctl_iff_expr2829 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_or_expr_in_ctl_iff_expr2834 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2898 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctl_or_expr2914 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2919 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctl_or_expr2943 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2948 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctl_or_expr2972 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_and_expr_in_ctl_or_expr2977 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3040 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctl_and_expr3056 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_ctl_and_expr3061 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_pure_ctl_expr_in_ctl_expr3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_relational_expr_in_ctl_expr3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_know_in_pure_ctl_epistemic_expr3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_epistemic_expr3403 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_pure_ctl_epistemic_expr_in_pure_ctl_epistemic_expr3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_know3452 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_agent_name_in_ctl_know3457 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ctl_know3461 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_know3466 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_know3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_agent_name3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_pure_ctl_expr3575 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_pure_ctl_expr3604 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_pure_ctl_expr3633 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_pure_ctl_expr3662 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_pure_ctl_expr3691 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_pure_ctl_expr3720 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_au_in_pure_ctl_expr3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_abu_in_pure_ctl_expr3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_eu_in_pure_ctl_expr3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_ebu_in_pure_ctl_expr3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_pure_ctl_expr3925 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3930 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_pure_ctl_expr3958 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3963 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_pure_ctl_expr3991 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr3996 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_pure_ctl_expr4024 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_pure_ctl_expr4029 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_expr_in_pure_ctl_expr4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_pure_ctl_expr4067 = new BitSet(new long[]{0xF001000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_pure_ctl_expr_in_pure_ctl_expr4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_au4126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_au4131 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_au4140 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_au4144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_au4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_eu4203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_eu4208 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctl_eu4217 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_eu4221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_eu4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctl_abu4280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_abu4285 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_abu4294 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctl_abu4298 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_abu4302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_abu4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctl_ebu4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctl_ebu4366 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctl_ebu4375 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctl_ebu4379 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_ebu4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctl_ebu4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4448 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctl_relational_expr4464 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4469 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctl_relational_expr4494 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4499 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctl_relational_expr4524 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4529 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctl_relational_expr4554 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4559 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctl_relational_expr4584 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4589 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctl_relational_expr4614 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_in_expr_in_ctl_relational_expr4619 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4683 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctl_in_expr4699 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_union_expr_in_ctl_in_expr4704 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4767 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctl_union_expr4783 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_set_expr_in_ctl_union_expr4788 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ctl_shift_expr_in_ctl_set_expr4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctl_set_expr4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctl_set_expr4894 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_set_list_expr_in_ctl_set_expr4896 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctl_set_expr4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4951 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_set_list_expr4954 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_set_list_expr4957 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5003 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctl_shift_expr5019 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5024 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctl_shift_expr5048 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_remainder_expr_in_ctl_shift_expr5053 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr5115 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctl_remainder_expr5131 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_additive_expr_in_ctl_remainder_expr5136 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5200 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctl_additive_expr5216 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5221 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_additive_expr5245 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_multiplicative_expr_in_ctl_additive_expr5250 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5311 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctl_multiplicative_expr5327 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5332 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctl_multiplicative_expr5356 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_concatination_expr_in_ctl_multiplicative_expr5361 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5422 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctl_concatination_expr5438 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_concatination_expr5443 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ctl_primary_expr_helper1_in_ctl_primary_expr5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctl_primary_expr5536 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctl_primary_expr5581 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctl_primary_expr_in_ctl_primary_expr5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctl_primary_expr_helper15650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctl_primary_expr_helper15703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_know_in_ctl_primary_expr_helper15746 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15802 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_ctl_primary_expr_helper15804 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctl_primary_expr_helper15879 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15881 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15883 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctl_primary_expr_helper15938 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper15940 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper15942 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper15944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper15946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctl_primary_expr_helper16006 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16008 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16010 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctl_primary_expr_helper16074 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctl_primary_expr_helper16076 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctl_primary_expr_helper16078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctl_primary_expr_helper16140 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16142 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16146 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16148 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16152 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctl_primary_expr_helper16220 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctl_primary_expr_helper16222 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16226 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16230 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16234 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctl_primary_expr_helper16238 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctl_primary_expr_helper16242 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctl_primary_expr_helper16244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctl_primary_expr_helper16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_root_expr6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_iff_expr_in_ltl_implies_expr6369 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ltl_implies_expr6385 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_implies_expr_in_ltl_implies_expr6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6455 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ltl_iff_expr6471 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_or_expr_in_ltl_iff_expr6476 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6540 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ltl_or_expr6556 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6561 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ltl_or_expr6585 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6590 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ltl_or_expr6614 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_and_expr_in_ltl_or_expr6619 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6682 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ltl_and_expr6698 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_binary_expr_in_ltl_and_expr6703 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6768 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ltl_binary_expr6784 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6789 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ltl_binary_expr6814 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6819 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ltl_binary_expr6844 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6849 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ltl_binary_expr6874 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6879 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_KNOW_in_ltl_binary_expr6912 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_binary_expr6917 = new BitSet(new long[]{0x0400000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_unary_expr7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_relational_expr_in_ltl_unary_expr7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ltl_pure_unary_expr7162 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ltl_pure_unary_expr7191 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ltl_pure_unary_expr7220 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ltl_pure_unary_expr7249 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ltl_pure_unary_expr7278 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ltl_pure_unary_expr7307 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ltl_pure_unary_expr7336 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_unary_expr_in_ltl_pure_unary_expr7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_pure_unary_expr7375 = new BitSet(new long[]{0x0001000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_ltl_pure_unary_expr_in_ltl_pure_unary_expr7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7432 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ltl_relational_expr7448 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7453 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ltl_relational_expr7478 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7483 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ltl_relational_expr7508 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7513 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ltl_relational_expr7538 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7543 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ltl_relational_expr7568 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7573 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ltl_relational_expr7598 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_in_expr_in_ltl_relational_expr7603 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7667 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ltl_in_expr7683 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_union_expr_in_ltl_in_expr7688 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7751 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ltl_union_expr7767 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_set_expr_in_ltl_union_expr7772 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ltl_shift_expr_in_ltl_set_expr7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ltl_set_expr7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ltl_set_expr7878 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_set_list_expr_in_ltl_set_expr7880 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ltl_set_expr7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr7935 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_set_list_expr7938 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_set_list_expr7941 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr7987 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ltl_shift_expr8003 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8008 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ltl_shift_expr8032 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_remainder_expr_in_ltl_shift_expr8037 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8099 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ltl_remainder_expr8115 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_additive_expr_in_ltl_remainder_expr8120 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8184 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ltl_additive_expr8200 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8205 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_additive_expr8229 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_multiplicative_expr_in_ltl_additive_expr8234 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8295 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ltl_multiplicative_expr8311 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8316 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ltl_multiplicative_expr8340 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_concatination_expr_in_ltl_multiplicative_expr8345 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8406 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ltl_concatination_expr8422 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_concatination_expr8427 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ltl_primary_expr_helper1_in_ltl_primary_expr8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ltl_primary_expr8512 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ltl_primary_expr8557 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ltl_primary_expr_in_ltl_primary_expr8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ltl_primary_expr_helper18626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ltl_primary_expr_helper18679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18732 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034BF8000L});
    public static final BitSet FOLLOW_ltl_root_expr_in_ltl_primary_expr_helper18734 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ltl_primary_expr_helper18809 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18811 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18813 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ltl_primary_expr_helper18868 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18870 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18872 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ltl_primary_expr_helper18936 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper18938 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper18940 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper18942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper18944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ltl_primary_expr_helper19004 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ltl_primary_expr_helper19006 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ltl_primary_expr_helper19008 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ltl_primary_expr_helper19070 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19072 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19076 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19078 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19082 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ltl_primary_expr_helper19150 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ltl_primary_expr_helper19152 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19156 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19160 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19164 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ltl_primary_expr_helper19168 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ltl_primary_expr_helper19172 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ltl_primary_expr_helper19174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ltl_primary_expr_helper19176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_root_expr9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_iff_expr_in_ctls_implies_expr9300 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_TOK_IMPLIES_in_ctls_implies_expr9316 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_implies_expr_in_ctls_implies_expr9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9386 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_TOK_IFF_in_ctls_iff_expr9402 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_or_expr_in_ctls_iff_expr9407 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9470 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_OR_in_ctls_or_expr9486 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9491 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XOR_in_ctls_or_expr9515 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9520 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TOK_XNOR_in_ctls_or_expr9544 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_and_expr_in_ctls_or_expr9549 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9612 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_TOK_AND_in_ctls_and_expr9628 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_binary_expr_in_ctls_and_expr9633 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_ctls_ltl_binary_expr9713 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_SINCE_in_ctls_ltl_binary_expr9743 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_RELEASES_in_ctls_ltl_binary_expr9773 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_TOK_TRIGGERED_in_ctls_ltl_binary_expr9803 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_binary_expr9808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007100L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_unary_expr9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_ltl_unary_expr10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NEXT_in_ctls_ltl_pure_unary_expr10050 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_PREV_in_ctls_ltl_pure_unary_expr10079 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_NOTPREVNOT_in_ctls_ltl_pure_unary_expr10108 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_GLOBALLY_in_ctls_ltl_pure_unary_expr10137 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_HISTORICALLY_in_ctls_ltl_pure_unary_expr10166 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_FINALLY_in_ctls_ltl_pure_unary_expr10195 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_OP_ONCE_in_ctls_ltl_pure_unary_expr10224 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_ltl_unary_expr_in_ctls_ltl_pure_unary_expr10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_ltl_pure_unary_expr10263 = new BitSet(new long[]{0x0001000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_ctls_ltl_pure_unary_expr_in_ctls_ltl_pure_unary_expr10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_ctl_expr10487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_relational_expr_in_ctls_ctl_expr10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EX_in_ctls_pure_ctl_expr10576 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AX_in_ctls_pure_ctl_expr10605 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EF_in_ctls_pure_ctl_expr10634 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AF_in_ctls_pure_ctl_expr10663 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EG_in_ctls_pure_ctl_expr10692 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AG_in_ctls_pure_ctl_expr10721 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_aa_in_ctls_pure_ctl_expr10755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ee_in_ctls_pure_ctl_expr10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBF_in_ctls_pure_ctl_expr10792 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10797 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABF_in_ctls_pure_ctl_expr10825 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10830 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EBG_in_ctls_pure_ctl_expr10858 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10863 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ABG_in_ctls_pure_ctl_expr10891 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_pure_ctl_expr10896 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctls_ctl_expr_in_ctls_pure_ctl_expr10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_pure_ctl_expr10934 = new BitSet(new long[]{0xF001000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_ctls_pure_ctl_expr_in_ctls_pure_ctl_expr10939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_abu_in_ctls_aa10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_au_in_ctls_aa11029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_ebu_in_ctls_ee11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_eu_in_ctls_ee11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_au11194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_au11199 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_au11204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_au11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_eu11263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_eu11268 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_eu11273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_eu11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_ctls_abu11331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_abu11336 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_abu11345 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_abu11349 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_abu11353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_abu11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_ctls_ebu11411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_ctls_ebu11416 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_ctls_ebu11425 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_subrange_in_ctls_ebu11429 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_ebu11433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_ctls_ebu11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11489 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_EQUAL_in_ctls_relational_expr11505 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11510 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_NOTEQUAL_in_ctls_relational_expr11535 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11540 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LT_in_ctls_relational_expr11565 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11570 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GT_in_ctls_relational_expr11595 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11600 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_LE_in_ctls_relational_expr11625 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11630 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_TOK_GE_in_ctls_relational_expr11655 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_in_expr_in_ctls_relational_expr11660 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11723 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_TOK_SETIN_in_ctls_in_expr11739 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_union_expr_in_ctls_in_expr11744 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11807 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TOK_UNION_in_ctls_union_expr11823 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_set_expr_in_ctls_union_expr11828 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ctls_shift_expr_in_ctls_set_expr11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrange_in_ctls_set_expr11912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LCB_in_ctls_set_expr11935 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_set_list_expr_in_ctls_set_expr11937 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_TOK_RCB_in_ctls_set_expr11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr11992 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_set_list_expr11995 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_set_list_expr11998 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12044 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_LSHIFT_in_ctls_shift_expr12060 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12065 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_TOK_RSHIFT_in_ctls_shift_expr12089 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_remainder_expr_in_ctls_shift_expr12094 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12156 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TOK_MOD_in_ctls_remainder_expr12172 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_additive_expr_in_ctls_remainder_expr12177 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12242 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_ctls_additive_expr12258 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12263 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_additive_expr12287 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_multiplicative_expr_in_ctls_additive_expr12292 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12352 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_TIMES_in_ctls_multiplicative_expr12368 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12373 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_TOK_DIVIDE_in_ctls_multiplicative_expr12397 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_concatination_expr_in_ctls_multiplicative_expr12402 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12463 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TOK_CONCATENATION_in_ctls_concatination_expr12479 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_concatination_expr12484 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ctls_primary_expr_helper1_in_ctls_primary_expr12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_ctls_primary_expr12577 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_ctls_primary_expr12622 = new BitSet(new long[]{0x0B7B180000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_ctls_primary_expr_in_ctls_primary_expr12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_ctls_primary_expr_helper112691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_helper1_pointer1_in_ctls_primary_expr_helper112744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112797 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_ctls_primary_expr_helper112799 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_BOOL_in_ctls_primary_expr_helper112874 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112876 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112878 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WORD1_in_ctls_primary_expr_helper112933 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper112935 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper112937 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper112939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper112941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NEXT_in_ctls_primary_expr_helper113001 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113003 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113005 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_CASE_in_ctls_primary_expr_helper113069 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_case_element_list_expr_in_ctls_primary_expr_helper113071 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TOK_ESAC_in_ctls_primary_expr_helper113073 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAREAD_in_ctls_primary_expr_helper113135 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113137 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113141 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113143 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113147 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_WAWRITE_in_ctls_primary_expr_helper113215 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TOK_LP_in_ctls_primary_expr_helper113217 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113221 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113225 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113229 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TOK_COMMA_in_ctls_primary_expr_helper113233 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_ctls_primary_expr_helper113237 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_ctls_primary_expr_helper113239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_ctls_primary_expr_helper113241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_ATOM_in_primary_expr_helper1_pointer113312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_select_in_primary_expr_helper1_pointer113314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_in_primary_expr_select13357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_primary_expr_ref_in_primary_expr_select13361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400080L});
    public static final BitSet FOLLOW_TOK_DOT_in_primary_expr_ref13384 = new BitSet(new long[]{0x0800000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_set_in_primary_expr_ref13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_arr_suffix_in_primary_expr_select_helper13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_select_helper_bit_suffix_in_primary_expr_select_helper13433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_arr_suffix13457 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_arr_suffix13459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_arr_suffix13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_primary_expr_select_helper_bit_suffix13501 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13505 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_primary_expr_select_helper_bit_suffix13507 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_primary_expr_select_helper_bit_suffix13511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_primary_expr_select_helper_bit_suffix13513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13561 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TOK_COLON_in_case_element_expr13563 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_case_element_expr13565 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TOK_SEMI_in_case_element_expr13567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13603 = new BitSet(new long[]{0x0B7B182000000002L,0x0000000034800000L});
    public static final BitSet FOLLOW_case_element_expr_in_case_element_list_expr13606 = new BitSet(new long[]{0x0B7B182000000002L,0x0000000034800000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_number13643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_number13646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_PLUS_in_integer13687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_MINUS_in_integer13717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TOK_NUMBER_in_integer13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NUMBER_WORD_in_number_word13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_subrange13795 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_TOK_TWODOTS_in_subrange13797 = new BitSet(new long[]{0x0000180000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_integer_in_subrange13801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_FALSEEXP_in_constant13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_TRUEEXP_in_constant13862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_word_in_constant13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_SEMI_in_optsemi13911 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred13114 = new BitSet(new long[]{0xF001000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_set_in_synpred13127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LP_in_synpred23377 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_agent_name_in_synpred23379 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TOK_KNOW_in_synpred23381 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred23383 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TOK_RP_in_synpred23385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred33820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred33822 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred33824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred33826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred43846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred43848 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred43850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred43852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred53872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred53874 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred53876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TOK_UNTIL_in_synpred53878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred63898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred63900 = new BitSet(new long[]{0xFB7B182000000000L,0x000000003480047FL});
    public static final BitSet FOLLOW_ctl_root_expr_in_synpred63902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred63904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred76969 = new BitSet(new long[]{0x0001000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_set_in_synpred76982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred89859 = new BitSet(new long[]{0x0001000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_set_in_synpred89872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_NOT_in_synpred910312 = new BitSet(new long[]{0xF001000000000000L,0x000000000000047FL});
    public static final BitSet FOLLOW_set_in_synpred910325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1010750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1110770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1210987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1210989 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1210991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1210993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_AA_in_synpred1311022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1311024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1411087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1411089 = new BitSet(new long[]{0xFB7B182000000000L,0x0000000034BF847FL});
    public static final BitSet FOLLOW_ctls_root_expr_in_synpred1411091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TOK_BUNTIL_in_synpred1411093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_EE_in_synpred1511122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1511124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_LB_in_synpred1613412 = new BitSet(new long[]{0x0B7B182000000000L,0x0000000034800000L});
    public static final BitSet FOLLOW_simple_root_expr_in_synpred1613414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TOK_RB_in_synpred1613416 = new BitSet(new long[]{0x0000000000000002L});

}