// $ANTLR 3.0.1 /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g 2017-11-30 13:26:28

package edu.wis.jtlv.env.core.spec;
import edu.wis.jtlv.env.Env;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SPCLexer extends Lexer {
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
    public static final int Tokens=104;
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

    public SPCLexer() {;} 
    public SPCLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g"; }

    // $ANTLR start TOK_CTL_SPEC
    public final void mTOK_CTL_SPEC() throws RecognitionException {
        try {
            int _type = TOK_CTL_SPEC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1406:17: ( 'CTLSPEC' | 'SPEC' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='C') ) {
                alt1=1;
            }
            else if ( (LA1_0=='S') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1406:1: TOK_CTL_SPEC : ( 'CTLSPEC' | 'SPEC' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1406:19: 'CTLSPEC'
                    {
                    match("CTLSPEC"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1406:31: 'SPEC'
                    {
                    match("SPEC"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CTL_SPEC

    // $ANTLR start TOK_CTL_STAR_SPEC
    public final void mTOK_CTL_STAR_SPEC() throws RecognitionException {
        try {
            int _type = TOK_CTL_STAR_SPEC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1407:21: ( 'CTL*SPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1407:23: 'CTL*SPEC'
            {
            match("CTL*SPEC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CTL_STAR_SPEC

    // $ANTLR start TOK_LTL_SPEC
    public final void mTOK_LTL_SPEC() throws RecognitionException {
        try {
            int _type = TOK_LTL_SPEC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1408:17: ( 'LTLSPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1408:19: 'LTLSPEC'
            {
            match("LTLSPEC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LTL_SPEC

    // $ANTLR start TOK_INVAR_SPEC
    public final void mTOK_INVAR_SPEC() throws RecognitionException {
        try {
            int _type = TOK_INVAR_SPEC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:19: ( 'INVARSPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:21: 'INVARSPEC'
            {
            match("INVARSPEC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_INVAR_SPEC

    // $ANTLR start TOK_EX
    public final void mTOK_EX() throws RecognitionException {
        try {
            int _type = TOK_EX;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:13: ( 'EX' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:15: 'EX'
            {
            match("EX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EX

    // $ANTLR start TOK_AX
    public final void mTOK_AX() throws RecognitionException {
        try {
            int _type = TOK_AX;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:13: ( 'AX' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:15: 'AX'
            {
            match("AX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AX

    // $ANTLR start TOK_EF
    public final void mTOK_EF() throws RecognitionException {
        try {
            int _type = TOK_EF;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:13: ( 'EF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:15: 'EF'
            {
            match("EF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EF

    // $ANTLR start TOK_AF
    public final void mTOK_AF() throws RecognitionException {
        try {
            int _type = TOK_AF;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:13: ( 'AF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:15: 'AF'
            {
            match("AF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AF

    // $ANTLR start TOK_EG
    public final void mTOK_EG() throws RecognitionException {
        try {
            int _type = TOK_EG;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:13: ( 'EG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:15: 'EG'
            {
            match("EG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EG

    // $ANTLR start TOK_AG
    public final void mTOK_AG() throws RecognitionException {
        try {
            int _type = TOK_AG;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:13: ( 'AG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:15: 'AG'
            {
            match("AG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AG

    // $ANTLR start TOK_EE
    public final void mTOK_EE() throws RecognitionException {
        try {
            int _type = TOK_EE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:13: ( 'E' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:15: 'E'
            {
            match('E'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EE

    // $ANTLR start TOK_AA
    public final void mTOK_AA() throws RecognitionException {
        try {
            int _type = TOK_AA;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:13: ( 'A' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:15: 'A'
            {
            match('A'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AA

    // $ANTLR start TOK_BUNTIL
    public final void mTOK_BUNTIL() throws RecognitionException {
        try {
            int _type = TOK_BUNTIL;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1419:16: ( 'BU' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1419:18: 'BU'
            {
            match("BU"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_BUNTIL

    // $ANTLR start TOK_EBF
    public final void mTOK_EBF() throws RecognitionException {
        try {
            int _type = TOK_EBF;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1420:14: ( 'EBF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1420:16: 'EBF'
            {
            match("EBF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EBF

    // $ANTLR start TOK_ABF
    public final void mTOK_ABF() throws RecognitionException {
        try {
            int _type = TOK_ABF;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1421:14: ( 'ABF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1421:16: 'ABF'
            {
            match("ABF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ABF

    // $ANTLR start TOK_EBG
    public final void mTOK_EBG() throws RecognitionException {
        try {
            int _type = TOK_EBG;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:14: ( 'EBG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:16: 'EBG'
            {
            match("EBG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EBG

    // $ANTLR start TOK_ABG
    public final void mTOK_ABG() throws RecognitionException {
        try {
            int _type = TOK_ABG;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1423:14: ( 'ABG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1423:16: 'ABG'
            {
            match("ABG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ABG

    // $ANTLR start TOK_OP_FINALLY
    public final void mTOK_OP_FINALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_FINALLY;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1425:19: ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt2=1;
                }
                break;
            case 'F':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='I') ) {
                    alt2=3;
                }
                else {
                    alt2=2;}
                }
                break;
            case 'E':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1425:1: TOK_OP_FINALLY : ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1425:21: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1425:28: 'F'
                    {
                    match('F'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1425:34: 'FINALLY'
                    {
                    match("FINALLY"); 


                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1425:46: 'EVENTUALLY'
                    {
                    match("EVENTUALLY"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_FINALLY

    // $ANTLR start TOK_OP_ONCE
    public final void mTOK_OP_ONCE() throws RecognitionException {
        try {
            int _type = TOK_OP_ONCE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1426:17: ( '<_>' | 'O' | 'ONCE' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            else if ( (LA3_0=='O') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='N') ) {
                    alt3=3;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1426:1: TOK_OP_ONCE : ( '<_>' | 'O' | 'ONCE' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1426:19: '<_>'
                    {
                    match("<_>"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1426:27: 'O'
                    {
                    match('O'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1426:33: 'ONCE'
                    {
                    match("ONCE"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_ONCE

    // $ANTLR start TOK_OP_GLOBALLY
    public final void mTOK_OP_GLOBALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_GLOBALLY;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:20: ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case '[':
                {
                alt4=1;
                }
                break;
            case 'G':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='L') ) {
                    alt4=3;
                }
                else {
                    alt4=2;}
                }
                break;
            case 'A':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1427:1: TOK_OP_GLOBALLY : ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:22: '[]'
                    {
                    match("[]"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:29: 'G'
                    {
                    match('G'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:35: 'GLOBALLY'
                    {
                    match("GLOBALLY"); 


                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:48: 'ALWAYS'
                    {
                    match("ALWAYS"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_GLOBALLY

    // $ANTLR start TOK_OP_HISTORICALLY
    public final void mTOK_OP_HISTORICALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_HISTORICALLY;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:23: ( '[_]' | 'H' | 'HISTORICALLY' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='[') ) {
                alt5=1;
            }
            else if ( (LA5_0=='H') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='I') ) {
                    alt5=3;
                }
                else {
                    alt5=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1428:1: TOK_OP_HISTORICALLY : ( '[_]' | 'H' | 'HISTORICALLY' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:25: '[_]'
                    {
                    match("[_]"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:33: 'H'
                    {
                    match('H'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:39: 'HISTORICALLY'
                    {
                    match("HISTORICALLY"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_HISTORICALLY

    // $ANTLR start TOK_OP_NEXT
    public final void mTOK_OP_NEXT() throws RecognitionException {
        try {
            int _type = TOK_OP_NEXT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:17: ( '()' | 'X' | 'NEXT' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case '(':
                {
                alt6=1;
                }
                break;
            case 'X':
                {
                alt6=2;
                }
                break;
            case 'N':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1429:1: TOK_OP_NEXT : ( '()' | 'X' | 'NEXT' );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:19: '()'
                    {
                    match("()"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:26: 'X'
                    {
                    match('X'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:32: 'NEXT'
                    {
                    match("NEXT"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_NEXT

    // $ANTLR start TOK_OP_PREV
    public final void mTOK_OP_PREV() throws RecognitionException {
        try {
            int _type = TOK_OP_PREV;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:17: ( '(_)' | 'Y' | 'PREV' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case '(':
                {
                alt7=1;
                }
                break;
            case 'Y':
                {
                alt7=2;
                }
                break;
            case 'P':
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1430:1: TOK_OP_PREV : ( '(_)' | 'Y' | 'PREV' );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:19: '(_)'
                    {
                    match("(_)"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:27: 'Y'
                    {
                    match('Y'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:33: 'PREV'
                    {
                    match("PREV"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_PREV

    // $ANTLR start TOK_UNTIL
    public final void mTOK_UNTIL() throws RecognitionException {
        try {
            int _type = TOK_UNTIL;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:15: ( 'Until' | 'U' | 'UNTIL' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='U') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt8=1;
                    }
                    break;
                case 'N':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    alt8=2;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1431:1: TOK_UNTIL : ( 'Until' | 'U' | 'UNTIL' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:17: 'Until'
                    {
                    match("Until"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:27: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:33: 'UNTIL'
                    {
                    match("UNTIL"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_UNTIL

    // $ANTLR start TOK_SINCE
    public final void mTOK_SINCE() throws RecognitionException {
        try {
            int _type = TOK_SINCE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:15: ( 'Since' | 'S' | 'SINCE' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='S') ) {
                switch ( input.LA(2) ) {
                case 'i':
                    {
                    alt9=1;
                    }
                    break;
                case 'I':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    alt9=2;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1432:1: TOK_SINCE : ( 'Since' | 'S' | 'SINCE' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:17: 'Since'
                    {
                    match("Since"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:27: 'S'
                    {
                    match('S'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:33: 'SINCE'
                    {
                    match("SINCE"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SINCE

    // $ANTLR start TOK_RELEASES
    public final void mTOK_RELEASES() throws RecognitionException {
        try {
            int _type = TOK_RELEASES;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:17: ( 'Awaits' | 'V' | 'RELEASES' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt10=1;
                }
                break;
            case 'V':
                {
                alt10=2;
                }
                break;
            case 'R':
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1433:1: TOK_RELEASES : ( 'Awaits' | 'V' | 'RELEASES' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:19: 'Awaits'
                    {
                    match("Awaits"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:30: 'V'
                    {
                    match('V'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:36: 'RELEASES'
                    {
                    match("RELEASES"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RELEASES

    // $ANTLR start TOK_TRIGGERED
    public final void mTOK_TRIGGERED() throws RecognitionException {
        try {
            int _type = TOK_TRIGGERED;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:18: ( 'Backto' | 'T' | 'TRIGGERED' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='B') ) {
                alt11=1;
            }
            else if ( (LA11_0=='T') ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2=='R') ) {
                    alt11=3;
                }
                else {
                    alt11=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1434:1: TOK_TRIGGERED : ( 'Backto' | 'T' | 'TRIGGERED' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:20: 'Backto'
                    {
                    match("Backto"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:31: 'T'
                    {
                    match('T'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:37: 'TRIGGERED'
                    {
                    match("TRIGGERED"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TRIGGERED

    // $ANTLR start TOK_OP_NOTPREVNOT
    public final void mTOK_OP_NOTPREVNOT() throws RecognitionException {
        try {
            int _type = TOK_OP_NOTPREVNOT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1435:21: ( 'Z' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1435:23: 'Z'
            {
            match('Z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_NOTPREVNOT

    // $ANTLR start TOK_KNOW
    public final void mTOK_KNOW() throws RecognitionException {
        try {
            int _type = TOK_KNOW;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:13: ( 'K' | 'KNOW' | 'Know' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='K') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt12=3;
                    }
                    break;
                case 'N':
                    {
                    alt12=2;
                    }
                    break;
                default:
                    alt12=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1438:1: TOK_KNOW : ( 'K' | 'KNOW' | 'Know' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:15: 'K'
                    {
                    match('K'); 

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:21: 'KNOW'
                    {
                    match("KNOW"); 


                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:30: 'Know'
                    {
                    match("Know"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_KNOW

    // $ANTLR start TOK_SKNOW
    public final void mTOK_SKNOW() throws RecognitionException {
        try {
            int _type = TOK_SKNOW;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:14: ( 'SK' | 'SKNOW' | 'Sknow' )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='S') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='k') ) {
                    alt13=3;
                }
                else if ( (LA13_1=='K') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='N') ) {
                        alt13=2;
                    }
                    else {
                        alt13=1;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1439:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1439:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:16: 'SK'
                    {
                    match("SK"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:23: 'SKNOW'
                    {
                    match("SKNOW"); 


                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:33: 'Sknow'
                    {
                    match("Sknow"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SKNOW

    // $ANTLR start TOK_LP
    public final void mTOK_LP() throws RecognitionException {
        try {
            int _type = TOK_LP;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1444:13: ( '(' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1444:15: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LP

    // $ANTLR start TOK_RP
    public final void mTOK_RP() throws RecognitionException {
        try {
            int _type = TOK_RP;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1445:13: ( ')' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1445:15: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RP

    // $ANTLR start TOK_LB
    public final void mTOK_LB() throws RecognitionException {
        try {
            int _type = TOK_LB;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1446:13: ( '[' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1446:15: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LB

    // $ANTLR start TOK_RB
    public final void mTOK_RB() throws RecognitionException {
        try {
            int _type = TOK_RB;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1447:13: ( ']' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1447:15: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RB

    // $ANTLR start TOK_LCB
    public final void mTOK_LCB() throws RecognitionException {
        try {
            int _type = TOK_LCB;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1448:14: ( '{' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1448:16: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LCB

    // $ANTLR start TOK_RCB
    public final void mTOK_RCB() throws RecognitionException {
        try {
            int _type = TOK_RCB;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1449:14: ( '}' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1449:16: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RCB

    // $ANTLR start TOK_FALSEEXP
    public final void mTOK_FALSEEXP() throws RecognitionException {
        try {
            int _type = TOK_FALSEEXP;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1450:17: ( 'FALSE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1450:19: 'FALSE'
            {
            match("FALSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_FALSEEXP

    // $ANTLR start TOK_TRUEEXP
    public final void mTOK_TRUEEXP() throws RecognitionException {
        try {
            int _type = TOK_TRUEEXP;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1451:17: ( 'TRUE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1451:19: 'TRUE'
            {
            match("TRUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TRUEEXP

    // $ANTLR start TOK_WORD1
    public final void mTOK_WORD1() throws RecognitionException {
        try {
            int _type = TOK_WORD1;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1455:15: ( 'word1' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1455:17: 'word1'
            {
            match("word1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WORD1

    // $ANTLR start TOK_WORD
    public final void mTOK_WORD() throws RecognitionException {
        try {
            int _type = TOK_WORD;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1456:14: ( 'word' | 'Word' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='w') ) {
                alt14=1;
            }
            else if ( (LA14_0=='W') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1456:1: TOK_WORD : ( 'word' | 'Word' );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1456:16: 'word'
                    {
                    match("word"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1456:25: 'Word'
                    {
                    match("Word"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WORD

    // $ANTLR start TOK_BOOL
    public final void mTOK_BOOL() throws RecognitionException {
        try {
            int _type = TOK_BOOL;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1457:14: ( 'bool' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1457:16: 'bool'
            {
            match("bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_BOOL

    // $ANTLR start TOK_WAREAD
    public final void mTOK_WAREAD() throws RecognitionException {
        try {
            int _type = TOK_WAREAD;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1458:16: ( 'READ' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1458:18: 'READ'
            {
            match("READ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WAREAD

    // $ANTLR start TOK_WAWRITE
    public final void mTOK_WAWRITE() throws RecognitionException {
        try {
            int _type = TOK_WAWRITE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1459:17: ( 'WRITE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1459:19: 'WRITE'
            {
            match("WRITE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_WAWRITE

    // $ANTLR start TOK_CASE
    public final void mTOK_CASE() throws RecognitionException {
        try {
            int _type = TOK_CASE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1461:14: ( 'case' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1461:16: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CASE

    // $ANTLR start TOK_ESAC
    public final void mTOK_ESAC() throws RecognitionException {
        try {
            int _type = TOK_ESAC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1462:14: ( 'esac' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1462:16: 'esac'
            {
            match("esac"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ESAC

    // $ANTLR start TOK_PLUS
    public final void mTOK_PLUS() throws RecognitionException {
        try {
            int _type = TOK_PLUS;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1463:14: ( '+' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1463:16: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_PLUS

    // $ANTLR start TOK_MINUS
    public final void mTOK_MINUS() throws RecognitionException {
        try {
            int _type = TOK_MINUS;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1464:15: ( '-' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1464:17: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_MINUS

    // $ANTLR start TOK_TIMES
    public final void mTOK_TIMES() throws RecognitionException {
        try {
            int _type = TOK_TIMES;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1465:15: ( '*' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1465:17: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TIMES

    // $ANTLR start TOK_DIVIDE
    public final void mTOK_DIVIDE() throws RecognitionException {
        try {
            int _type = TOK_DIVIDE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1466:16: ( '/' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1466:18: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_DIVIDE

    // $ANTLR start TOK_MOD
    public final void mTOK_MOD() throws RecognitionException {
        try {
            int _type = TOK_MOD;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1467:14: ( 'mod' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1467:16: 'mod'
            {
            match("mod"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_MOD

    // $ANTLR start TOK_LSHIFT
    public final void mTOK_LSHIFT() throws RecognitionException {
        try {
            int _type = TOK_LSHIFT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1468:16: ( '<<' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1468:18: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LSHIFT

    // $ANTLR start TOK_RSHIFT
    public final void mTOK_RSHIFT() throws RecognitionException {
        try {
            int _type = TOK_RSHIFT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1469:16: ( '>>' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1469:18: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_RSHIFT

    // $ANTLR start TOK_EQUAL
    public final void mTOK_EQUAL() throws RecognitionException {
        try {
            int _type = TOK_EQUAL;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1472:15: ( '=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1472:17: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_EQUAL

    // $ANTLR start TOK_NOTEQUAL
    public final void mTOK_NOTEQUAL() throws RecognitionException {
        try {
            int _type = TOK_NOTEQUAL;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1473:17: ( '!=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1473:19: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NOTEQUAL

    // $ANTLR start TOK_LE
    public final void mTOK_LE() throws RecognitionException {
        try {
            int _type = TOK_LE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1474:13: ( '<=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1474:15: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LE

    // $ANTLR start TOK_GE
    public final void mTOK_GE() throws RecognitionException {
        try {
            int _type = TOK_GE;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1475:13: ( '>=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1475:15: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_GE

    // $ANTLR start TOK_LT
    public final void mTOK_LT() throws RecognitionException {
        try {
            int _type = TOK_LT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1476:13: ( '<' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1476:15: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_LT

    // $ANTLR start TOK_GT
    public final void mTOK_GT() throws RecognitionException {
        try {
            int _type = TOK_GT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1477:13: ( '>' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1477:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_GT

    // $ANTLR start TOK_NEXT
    public final void mTOK_NEXT() throws RecognitionException {
        try {
            int _type = TOK_NEXT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1478:14: ( 'next' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1478:16: 'next'
            {
            match("next"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NEXT

    // $ANTLR start TOK_UNION
    public final void mTOK_UNION() throws RecognitionException {
        try {
            int _type = TOK_UNION;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1480:15: ( 'union' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1480:17: 'union'
            {
            match("union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_UNION

    // $ANTLR start TOK_SETIN
    public final void mTOK_SETIN() throws RecognitionException {
        try {
            int _type = TOK_SETIN;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1481:15: ( 'in' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1481:17: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SETIN

    // $ANTLR start TOK_TWODOTS
    public final void mTOK_TWODOTS() throws RecognitionException {
        try {
            int _type = TOK_TWODOTS;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1482:17: ( '..' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1482:19: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_TWODOTS

    // $ANTLR start TOK_DOT
    public final void mTOK_DOT() throws RecognitionException {
        try {
            int _type = TOK_DOT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1483:14: ( '.' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1483:16: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_DOT

    // $ANTLR start TOK_IMPLIES
    public final void mTOK_IMPLIES() throws RecognitionException {
        try {
            int _type = TOK_IMPLIES;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1486:17: ( '->' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1486:19: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_IMPLIES

    // $ANTLR start TOK_IFF
    public final void mTOK_IFF() throws RecognitionException {
        try {
            int _type = TOK_IFF;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1487:14: ( '<->' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1487:16: '<->'
            {
            match("<->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_IFF

    // $ANTLR start TOK_OR
    public final void mTOK_OR() throws RecognitionException {
        try {
            int _type = TOK_OR;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1488:13: ( '|' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1488:15: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OR

    // $ANTLR start TOK_AND
    public final void mTOK_AND() throws RecognitionException {
        try {
            int _type = TOK_AND;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:14: ( '&' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:16: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_AND

    // $ANTLR start TOK_XOR
    public final void mTOK_XOR() throws RecognitionException {
        try {
            int _type = TOK_XOR;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1490:14: ( 'xor' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1490:16: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_XOR

    // $ANTLR start TOK_XNOR
    public final void mTOK_XNOR() throws RecognitionException {
        try {
            int _type = TOK_XNOR;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1491:14: ( 'xnor' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1491:16: 'xnor'
            {
            match("xnor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_XNOR

    // $ANTLR start TOK_NOT
    public final void mTOK_NOT() throws RecognitionException {
        try {
            int _type = TOK_NOT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:14: ( '!' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:16: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NOT

    // $ANTLR start TOK_COMMA
    public final void mTOK_COMMA() throws RecognitionException {
        try {
            int _type = TOK_COMMA;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1494:15: ( ',' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1494:17: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_COMMA

    // $ANTLR start TOK_COLON
    public final void mTOK_COLON() throws RecognitionException {
        try {
            int _type = TOK_COLON;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:15: ( ':' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:17: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_COLON

    // $ANTLR start TOK_SEMI
    public final void mTOK_SEMI() throws RecognitionException {
        try {
            int _type = TOK_SEMI;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1496:14: ( ';' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1496:16: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_SEMI

    // $ANTLR start TOK_CONCATENATION
    public final void mTOK_CONCATENATION() throws RecognitionException {
        try {
            int _type = TOK_CONCATENATION;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1497:21: ( '::' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1497:23: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_CONCATENATION

    // $ANTLR start TOK_NUMBER_WORD
    public final void mTOK_NUMBER_WORD() throws RecognitionException {
        try {
            int _type = TOK_NUMBER_WORD;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1506:21: ( '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1506:23: '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
            {
            match('0'); 
            if ( input.LA(1)=='B'||input.LA(1)=='D'||input.LA(1)=='H'||input.LA(1)=='O'||input.LA(1)=='b'||input.LA(1)=='d'||input.LA(1)=='h'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1506:75: ( '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1506:76: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('_'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1506:124: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER_WORD

    // $ANTLR start TOK_NUMBER_FRAC
    public final void mTOK_NUMBER_FRAC() throws RecognitionException {
        try {
            int _type = TOK_NUMBER_FRAC;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:21: ( ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:23: ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('\''); 
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:40: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:41: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            match('/'); 
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:56: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1509:57: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER_FRAC

    // $ANTLR start TOK_NUMBER
    public final void mTOK_NUMBER() throws RecognitionException {
        try {
            int _type = TOK_NUMBER;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1512:17: ( ( '0' .. '9' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1512:19: ( '0' .. '9' )+
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1512:19: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1512:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_NUMBER

    // $ANTLR start TOK_ATOM
    public final void mTOK_ATOM() throws RecognitionException {
        try {
            int _type = TOK_ATOM;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1515:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1515:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1515:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='#' && LA20_0<='$')||LA20_0=='-'||(LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='\\'||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_ATOM

    // $ANTLR start JTOK_WS
    public final void mJTOK_WS() throws RecognitionException {
        try {
            int _type = JTOK_WS;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1518:15: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1518:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1518:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_WS

    // $ANTLR start JTOK_MULTI_COMMENT
    public final void mJTOK_MULTI_COMMENT() throws RecognitionException {
        try {
            int _type = JTOK_MULTI_COMMENT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1524:23: ( ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1524:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1524:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1524:26: '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/'
            {
            match("/*"); 

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1524:31: ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )*
            loop22:
            do {
                int alt22=4;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=4;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFE')) ) {
                        alt22=3;
                    }


                }
                else if ( (LA22_0=='\r') ) {
                    alt22=1;
                }
                else if ( (LA22_0=='\n') ) {
                    alt22=2;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFE')) ) {
                    alt22=3;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1527:9: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1528:13: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1529:13: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_MULTI_COMMENT

    // $ANTLR start JTOK_LINE_COMMENT
    public final void mJTOK_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = JTOK_LINE_COMMENT;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:22: ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='-') ) {
                alt31=1;
            }
            else if ( (LA31_0=='/') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1533:1: JTOK_LINE_COMMENT : ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:25: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("--"); 

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:30: (~ ( '\\n' | '\\r' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFE')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:31: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:46: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:47: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:47: ( '\\n' | '\\r' ( '\\n' )? )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0=='\n') ) {
                                alt25=1;
                            }
                            else if ( (LA25_0=='\r') ) {
                                alt25=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1533:47: ( '\\n' | '\\r' ( '\\n' )? )", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:48: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:53: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:57: ( '\\n' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='\n') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1533:58: '\\n'
                                            {
                                            match('\n'); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    channel=HIDDEN;

                    }


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:12: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("//"); 

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:17: (~ ( '\\n' | '\\r' ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFE')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:18: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:33: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:34: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:34: ( '\\n' | '\\r' ( '\\n' )? )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0=='\n') ) {
                                alt29=1;
                            }
                            else if ( (LA29_0=='\r') ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1534:34: ( '\\n' | '\\r' ( '\\n' )? )", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:35: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:40: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:44: ( '\\n' )?
                                    int alt28=2;
                                    int LA28_0 = input.LA(1);

                                    if ( (LA28_0=='\n') ) {
                                        alt28=1;
                                    }
                                    switch (alt28) {
                                        case 1 :
                                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1534:45: '\\n'
                                            {
                                            match('\n'); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    channel=HIDDEN;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JTOK_LINE_COMMENT

    public void mTokens() throws RecognitionException {
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:8: ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT )
        int alt32=81;
        switch ( input.LA(1) ) {
        case 'C':
            {
            int LA32_1 = input.LA(2);

            if ( (LA32_1=='T') ) {
                int LA32_57 = input.LA(3);

                if ( (LA32_57=='L') ) {
                    switch ( input.LA(4) ) {
                    case '*':
                        {
                        alt32=2;
                        }
                        break;
                    case 'S':
                        {
                        int LA32_191 = input.LA(5);

                        if ( (LA32_191=='P') ) {
                            int LA32_233 = input.LA(6);

                            if ( (LA32_233=='E') ) {
                                int LA32_264 = input.LA(7);

                                if ( (LA32_264=='C') ) {
                                    int LA32_280 = input.LA(8);

                                    if ( ((LA32_280>='#' && LA32_280<='$')||LA32_280=='-'||(LA32_280>='0' && LA32_280<='9')||(LA32_280>='A' && LA32_280<='Z')||LA32_280=='\\'||LA32_280=='_'||(LA32_280>='a' && LA32_280<='z')) ) {
                                        alt32=78;
                                    }
                                    else {
                                        alt32=1;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                        }
                        break;
                    default:
                        alt32=78;}

                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'S':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA32_58 = input.LA(3);

                if ( (LA32_58=='n') ) {
                    int LA32_140 = input.LA(4);

                    if ( (LA32_140=='c') ) {
                        int LA32_192 = input.LA(5);

                        if ( (LA32_192=='e') ) {
                            int LA32_234 = input.LA(6);

                            if ( ((LA32_234>='#' && LA32_234<='$')||LA32_234=='-'||(LA32_234>='0' && LA32_234<='9')||(LA32_234>='A' && LA32_234<='Z')||LA32_234=='\\'||LA32_234=='_'||(LA32_234>='a' && LA32_234<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=25;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'I':
                {
                int LA32_59 = input.LA(3);

                if ( (LA32_59=='N') ) {
                    int LA32_141 = input.LA(4);

                    if ( (LA32_141=='C') ) {
                        int LA32_193 = input.LA(5);

                        if ( (LA32_193=='E') ) {
                            int LA32_235 = input.LA(6);

                            if ( ((LA32_235>='#' && LA32_235<='$')||LA32_235=='-'||(LA32_235>='0' && LA32_235<='9')||(LA32_235>='A' && LA32_235<='Z')||LA32_235=='\\'||LA32_235=='_'||(LA32_235>='a' && LA32_235<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=25;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'K':
                {
                switch ( input.LA(3) ) {
                case 'N':
                    {
                    int LA32_142 = input.LA(4);

                    if ( (LA32_142=='O') ) {
                        int LA32_194 = input.LA(5);

                        if ( (LA32_194=='W') ) {
                            int LA32_236 = input.LA(6);

                            if ( ((LA32_236>='#' && LA32_236<='$')||LA32_236=='-'||(LA32_236>='0' && LA32_236<='9')||(LA32_236>='A' && LA32_236<='Z')||LA32_236=='\\'||LA32_236=='_'||(LA32_236>='a' && LA32_236<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=30;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                    }
                    break;
                case '#':
                case '$':
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '\\':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt32=78;
                    }
                    break;
                default:
                    alt32=30;}

                }
                break;
            case 'k':
                {
                int LA32_61 = input.LA(3);

                if ( (LA32_61=='n') ) {
                    int LA32_144 = input.LA(4);

                    if ( (LA32_144=='o') ) {
                        int LA32_195 = input.LA(5);

                        if ( (LA32_195=='w') ) {
                            int LA32_237 = input.LA(6);

                            if ( ((LA32_237>='#' && LA32_237<='$')||LA32_237=='-'||(LA32_237>='0' && LA32_237<='9')||(LA32_237>='A' && LA32_237<='Z')||LA32_237=='\\'||LA32_237=='_'||(LA32_237>='a' && LA32_237<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=30;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'P':
                {
                int LA32_62 = input.LA(3);

                if ( (LA32_62=='E') ) {
                    int LA32_145 = input.LA(4);

                    if ( (LA32_145=='C') ) {
                        int LA32_196 = input.LA(5);

                        if ( ((LA32_196>='#' && LA32_196<='$')||LA32_196=='-'||(LA32_196>='0' && LA32_196<='9')||(LA32_196>='A' && LA32_196<='Z')||LA32_196=='\\'||LA32_196=='_'||(LA32_196>='a' && LA32_196<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=1;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=25;}

            }
            break;
        case 'L':
            {
            int LA32_3 = input.LA(2);

            if ( (LA32_3=='T') ) {
                int LA32_64 = input.LA(3);

                if ( (LA32_64=='L') ) {
                    int LA32_146 = input.LA(4);

                    if ( (LA32_146=='S') ) {
                        int LA32_197 = input.LA(5);

                        if ( (LA32_197=='P') ) {
                            int LA32_239 = input.LA(6);

                            if ( (LA32_239=='E') ) {
                                int LA32_265 = input.LA(7);

                                if ( (LA32_265=='C') ) {
                                    int LA32_281 = input.LA(8);

                                    if ( ((LA32_281>='#' && LA32_281<='$')||LA32_281=='-'||(LA32_281>='0' && LA32_281<='9')||(LA32_281>='A' && LA32_281<='Z')||LA32_281=='\\'||LA32_281=='_'||(LA32_281>='a' && LA32_281<='z')) ) {
                                        alt32=78;
                                    }
                                    else {
                                        alt32=3;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'I':
            {
            int LA32_4 = input.LA(2);

            if ( (LA32_4=='N') ) {
                int LA32_65 = input.LA(3);

                if ( (LA32_65=='V') ) {
                    int LA32_147 = input.LA(4);

                    if ( (LA32_147=='A') ) {
                        int LA32_198 = input.LA(5);

                        if ( (LA32_198=='R') ) {
                            int LA32_240 = input.LA(6);

                            if ( (LA32_240=='S') ) {
                                int LA32_266 = input.LA(7);

                                if ( (LA32_266=='P') ) {
                                    int LA32_282 = input.LA(8);

                                    if ( (LA32_282=='E') ) {
                                        int LA32_290 = input.LA(9);

                                        if ( (LA32_290=='C') ) {
                                            int LA32_296 = input.LA(10);

                                            if ( ((LA32_296>='#' && LA32_296<='$')||LA32_296=='-'||(LA32_296>='0' && LA32_296<='9')||(LA32_296>='A' && LA32_296<='Z')||LA32_296=='\\'||LA32_296=='_'||(LA32_296>='a' && LA32_296<='z')) ) {
                                                alt32=78;
                                            }
                                            else {
                                                alt32=4;}
                                        }
                                        else {
                                            alt32=78;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'E':
            {
            switch ( input.LA(2) ) {
            case 'X':
                {
                int LA32_66 = input.LA(3);

                if ( ((LA32_66>='#' && LA32_66<='$')||LA32_66=='-'||(LA32_66>='0' && LA32_66<='9')||(LA32_66>='A' && LA32_66<='Z')||LA32_66=='\\'||LA32_66=='_'||(LA32_66>='a' && LA32_66<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=5;}
                }
                break;
            case 'F':
                {
                int LA32_67 = input.LA(3);

                if ( ((LA32_67>='#' && LA32_67<='$')||LA32_67=='-'||(LA32_67>='0' && LA32_67<='9')||(LA32_67>='A' && LA32_67<='Z')||LA32_67=='\\'||LA32_67=='_'||(LA32_67>='a' && LA32_67<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=7;}
                }
                break;
            case 'G':
                {
                int LA32_68 = input.LA(3);

                if ( ((LA32_68>='#' && LA32_68<='$')||LA32_68=='-'||(LA32_68>='0' && LA32_68<='9')||(LA32_68>='A' && LA32_68<='Z')||LA32_68=='\\'||LA32_68=='_'||(LA32_68>='a' && LA32_68<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=9;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'F':
                    {
                    int LA32_151 = input.LA(4);

                    if ( ((LA32_151>='#' && LA32_151<='$')||LA32_151=='-'||(LA32_151>='0' && LA32_151<='9')||(LA32_151>='A' && LA32_151<='Z')||LA32_151=='\\'||LA32_151=='_'||(LA32_151>='a' && LA32_151<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=14;}
                    }
                    break;
                case 'G':
                    {
                    int LA32_152 = input.LA(4);

                    if ( ((LA32_152>='#' && LA32_152<='$')||LA32_152=='-'||(LA32_152>='0' && LA32_152<='9')||(LA32_152>='A' && LA32_152<='Z')||LA32_152=='\\'||LA32_152=='_'||(LA32_152>='a' && LA32_152<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=16;}
                    }
                    break;
                default:
                    alt32=78;}

                }
                break;
            case 'V':
                {
                int LA32_70 = input.LA(3);

                if ( (LA32_70=='E') ) {
                    int LA32_153 = input.LA(4);

                    if ( (LA32_153=='N') ) {
                        int LA32_201 = input.LA(5);

                        if ( (LA32_201=='T') ) {
                            int LA32_241 = input.LA(6);

                            if ( (LA32_241=='U') ) {
                                int LA32_267 = input.LA(7);

                                if ( (LA32_267=='A') ) {
                                    int LA32_283 = input.LA(8);

                                    if ( (LA32_283=='L') ) {
                                        int LA32_291 = input.LA(9);

                                        if ( (LA32_291=='L') ) {
                                            int LA32_297 = input.LA(10);

                                            if ( (LA32_297=='Y') ) {
                                                int LA32_301 = input.LA(11);

                                                if ( ((LA32_301>='#' && LA32_301<='$')||LA32_301=='-'||(LA32_301>='0' && LA32_301<='9')||(LA32_301>='A' && LA32_301<='Z')||LA32_301=='\\'||LA32_301=='_'||(LA32_301>='a' && LA32_301<='z')) ) {
                                                    alt32=78;
                                                }
                                                else {
                                                    alt32=18;}
                                            }
                                            else {
                                                alt32=78;}
                                        }
                                        else {
                                            alt32=78;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'C':
            case 'D':
            case 'E':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'W':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=11;}

            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 'X':
                {
                int LA32_72 = input.LA(3);

                if ( ((LA32_72>='#' && LA32_72<='$')||LA32_72=='-'||(LA32_72>='0' && LA32_72<='9')||(LA32_72>='A' && LA32_72<='Z')||LA32_72=='\\'||LA32_72=='_'||(LA32_72>='a' && LA32_72<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=6;}
                }
                break;
            case 'F':
                {
                int LA32_73 = input.LA(3);

                if ( ((LA32_73>='#' && LA32_73<='$')||LA32_73=='-'||(LA32_73>='0' && LA32_73<='9')||(LA32_73>='A' && LA32_73<='Z')||LA32_73=='\\'||LA32_73=='_'||(LA32_73>='a' && LA32_73<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=8;}
                }
                break;
            case 'G':
                {
                int LA32_74 = input.LA(3);

                if ( ((LA32_74>='#' && LA32_74<='$')||LA32_74=='-'||(LA32_74>='0' && LA32_74<='9')||(LA32_74>='A' && LA32_74<='Z')||LA32_74=='\\'||LA32_74=='_'||(LA32_74>='a' && LA32_74<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=10;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'F':
                    {
                    int LA32_157 = input.LA(4);

                    if ( ((LA32_157>='#' && LA32_157<='$')||LA32_157=='-'||(LA32_157>='0' && LA32_157<='9')||(LA32_157>='A' && LA32_157<='Z')||LA32_157=='\\'||LA32_157=='_'||(LA32_157>='a' && LA32_157<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=15;}
                    }
                    break;
                case 'G':
                    {
                    int LA32_158 = input.LA(4);

                    if ( ((LA32_158>='#' && LA32_158<='$')||LA32_158=='-'||(LA32_158>='0' && LA32_158<='9')||(LA32_158>='A' && LA32_158<='Z')||LA32_158=='\\'||LA32_158=='_'||(LA32_158>='a' && LA32_158<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=17;}
                    }
                    break;
                default:
                    alt32=78;}

                }
                break;
            case 'L':
                {
                int LA32_76 = input.LA(3);

                if ( (LA32_76=='W') ) {
                    int LA32_159 = input.LA(4);

                    if ( (LA32_159=='A') ) {
                        int LA32_204 = input.LA(5);

                        if ( (LA32_204=='Y') ) {
                            int LA32_242 = input.LA(6);

                            if ( (LA32_242=='S') ) {
                                int LA32_268 = input.LA(7);

                                if ( ((LA32_268>='#' && LA32_268<='$')||LA32_268=='-'||(LA32_268>='0' && LA32_268<='9')||(LA32_268>='A' && LA32_268<='Z')||LA32_268=='\\'||LA32_268=='_'||(LA32_268>='a' && LA32_268<='z')) ) {
                                    alt32=78;
                                }
                                else {
                                    alt32=20;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'w':
                {
                int LA32_77 = input.LA(3);

                if ( (LA32_77=='a') ) {
                    int LA32_160 = input.LA(4);

                    if ( (LA32_160=='i') ) {
                        int LA32_205 = input.LA(5);

                        if ( (LA32_205=='t') ) {
                            int LA32_243 = input.LA(6);

                            if ( (LA32_243=='s') ) {
                                int LA32_269 = input.LA(7);

                                if ( ((LA32_269>='#' && LA32_269<='$')||LA32_269=='-'||(LA32_269>='0' && LA32_269<='9')||(LA32_269>='A' && LA32_269<='Z')||LA32_269=='\\'||LA32_269=='_'||(LA32_269>='a' && LA32_269<='z')) ) {
                                    alt32=78;
                                }
                                else {
                                    alt32=26;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'C':
            case 'D':
            case 'E':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=12;}

            }
            break;
        case 'B':
            {
            switch ( input.LA(2) ) {
            case 'U':
                {
                int LA32_79 = input.LA(3);

                if ( ((LA32_79>='#' && LA32_79<='$')||LA32_79=='-'||(LA32_79>='0' && LA32_79<='9')||(LA32_79>='A' && LA32_79<='Z')||LA32_79=='\\'||LA32_79=='_'||(LA32_79>='a' && LA32_79<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=13;}
                }
                break;
            case 'a':
                {
                int LA32_80 = input.LA(3);

                if ( (LA32_80=='c') ) {
                    int LA32_162 = input.LA(4);

                    if ( (LA32_162=='k') ) {
                        int LA32_206 = input.LA(5);

                        if ( (LA32_206=='t') ) {
                            int LA32_244 = input.LA(6);

                            if ( (LA32_244=='o') ) {
                                int LA32_270 = input.LA(7);

                                if ( ((LA32_270>='#' && LA32_270<='$')||LA32_270=='-'||(LA32_270>='0' && LA32_270<='9')||(LA32_270>='A' && LA32_270<='Z')||LA32_270=='\\'||LA32_270=='_'||(LA32_270>='a' && LA32_270<='z')) ) {
                                    alt32=78;
                                }
                                else {
                                    alt32=27;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            default:
                alt32=78;}

            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt32=18;
                }
                break;
            case '_':
                {
                alt32=19;
                }
                break;
            case '<':
                {
                alt32=51;
                }
                break;
            case '=':
                {
                alt32=55;
                }
                break;
            case '-':
                {
                alt32=65;
                }
                break;
            default:
                alt32=57;}

            }
            break;
        case 'F':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA32_87 = input.LA(3);

                if ( (LA32_87=='N') ) {
                    int LA32_163 = input.LA(4);

                    if ( (LA32_163=='A') ) {
                        int LA32_207 = input.LA(5);

                        if ( (LA32_207=='L') ) {
                            int LA32_245 = input.LA(6);

                            if ( (LA32_245=='L') ) {
                                int LA32_271 = input.LA(7);

                                if ( (LA32_271=='Y') ) {
                                    int LA32_284 = input.LA(8);

                                    if ( ((LA32_284>='#' && LA32_284<='$')||LA32_284=='-'||(LA32_284>='0' && LA32_284<='9')||(LA32_284>='A' && LA32_284<='Z')||LA32_284=='\\'||LA32_284=='_'||(LA32_284>='a' && LA32_284<='z')) ) {
                                        alt32=78;
                                    }
                                    else {
                                        alt32=18;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'A':
                {
                int LA32_88 = input.LA(3);

                if ( (LA32_88=='L') ) {
                    int LA32_164 = input.LA(4);

                    if ( (LA32_164=='S') ) {
                        int LA32_208 = input.LA(5);

                        if ( (LA32_208=='E') ) {
                            int LA32_246 = input.LA(6);

                            if ( ((LA32_246>='#' && LA32_246<='$')||LA32_246=='-'||(LA32_246>='0' && LA32_246<='9')||(LA32_246>='A' && LA32_246<='Z')||LA32_246=='\\'||LA32_246=='_'||(LA32_246>='a' && LA32_246<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=37;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '\'':
                {
                alt32=76;
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=18;}

            }
            break;
        case 'O':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA32_90 = input.LA(3);

                if ( (LA32_90=='C') ) {
                    int LA32_165 = input.LA(4);

                    if ( (LA32_165=='E') ) {
                        int LA32_209 = input.LA(5);

                        if ( ((LA32_209>='#' && LA32_209<='$')||LA32_209=='-'||(LA32_209>='0' && LA32_209<='9')||(LA32_209>='A' && LA32_209<='Z')||LA32_209=='\\'||LA32_209=='_'||(LA32_209>='a' && LA32_209<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=19;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=19;}

            }
            break;
        case '[':
            {
            switch ( input.LA(2) ) {
            case ']':
                {
                alt32=20;
                }
                break;
            case '_':
                {
                alt32=21;
                }
                break;
            default:
                alt32=33;}

            }
            break;
        case 'G':
            {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA32_94 = input.LA(3);

                if ( (LA32_94=='O') ) {
                    int LA32_166 = input.LA(4);

                    if ( (LA32_166=='B') ) {
                        int LA32_210 = input.LA(5);

                        if ( (LA32_210=='A') ) {
                            int LA32_247 = input.LA(6);

                            if ( (LA32_247=='L') ) {
                                int LA32_273 = input.LA(7);

                                if ( (LA32_273=='L') ) {
                                    int LA32_285 = input.LA(8);

                                    if ( (LA32_285=='Y') ) {
                                        int LA32_292 = input.LA(9);

                                        if ( ((LA32_292>='#' && LA32_292<='$')||LA32_292=='-'||(LA32_292>='0' && LA32_292<='9')||(LA32_292>='A' && LA32_292<='Z')||LA32_292=='\\'||LA32_292=='_'||(LA32_292>='a' && LA32_292<='z')) ) {
                                            alt32=78;
                                        }
                                        else {
                                            alt32=20;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=20;}

            }
            break;
        case 'H':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA32_95 = input.LA(3);

                if ( (LA32_95=='S') ) {
                    int LA32_167 = input.LA(4);

                    if ( (LA32_167=='T') ) {
                        int LA32_211 = input.LA(5);

                        if ( (LA32_211=='O') ) {
                            int LA32_248 = input.LA(6);

                            if ( (LA32_248=='R') ) {
                                int LA32_274 = input.LA(7);

                                if ( (LA32_274=='I') ) {
                                    int LA32_286 = input.LA(8);

                                    if ( (LA32_286=='C') ) {
                                        int LA32_293 = input.LA(9);

                                        if ( (LA32_293=='A') ) {
                                            int LA32_298 = input.LA(10);

                                            if ( (LA32_298=='L') ) {
                                                int LA32_302 = input.LA(11);

                                                if ( (LA32_302=='L') ) {
                                                    int LA32_303 = input.LA(12);

                                                    if ( (LA32_303=='Y') ) {
                                                        int LA32_304 = input.LA(13);

                                                        if ( ((LA32_304>='#' && LA32_304<='$')||LA32_304=='-'||(LA32_304>='0' && LA32_304<='9')||(LA32_304>='A' && LA32_304<='Z')||LA32_304=='\\'||LA32_304=='_'||(LA32_304>='a' && LA32_304<='z')) ) {
                                                            alt32=78;
                                                        }
                                                        else {
                                                            alt32=21;}
                                                    }
                                                    else {
                                                        alt32=78;}
                                                }
                                                else {
                                                    alt32=78;}
                                            }
                                            else {
                                                alt32=78;}
                                        }
                                        else {
                                            alt32=78;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=21;}

            }
            break;
        case '(':
            {
            switch ( input.LA(2) ) {
            case ')':
                {
                alt32=22;
                }
                break;
            case '_':
                {
                alt32=23;
                }
                break;
            default:
                alt32=31;}

            }
            break;
        case 'X':
            {
            int LA32_15 = input.LA(2);

            if ( ((LA32_15>='#' && LA32_15<='$')||LA32_15=='-'||(LA32_15>='0' && LA32_15<='9')||(LA32_15>='A' && LA32_15<='Z')||LA32_15=='\\'||LA32_15=='_'||(LA32_15>='a' && LA32_15<='z')) ) {
                alt32=78;
            }
            else {
                alt32=22;}
            }
            break;
        case 'N':
            {
            int LA32_16 = input.LA(2);

            if ( (LA32_16=='E') ) {
                int LA32_99 = input.LA(3);

                if ( (LA32_99=='X') ) {
                    int LA32_168 = input.LA(4);

                    if ( (LA32_168=='T') ) {
                        int LA32_212 = input.LA(5);

                        if ( ((LA32_212>='#' && LA32_212<='$')||LA32_212=='-'||(LA32_212>='0' && LA32_212<='9')||(LA32_212>='A' && LA32_212<='Z')||LA32_212=='\\'||LA32_212=='_'||(LA32_212>='a' && LA32_212<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=22;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'Y':
            {
            int LA32_17 = input.LA(2);

            if ( ((LA32_17>='#' && LA32_17<='$')||LA32_17=='-'||(LA32_17>='0' && LA32_17<='9')||(LA32_17>='A' && LA32_17<='Z')||LA32_17=='\\'||LA32_17=='_'||(LA32_17>='a' && LA32_17<='z')) ) {
                alt32=78;
            }
            else {
                alt32=23;}
            }
            break;
        case 'P':
            {
            int LA32_18 = input.LA(2);

            if ( (LA32_18=='R') ) {
                int LA32_100 = input.LA(3);

                if ( (LA32_100=='E') ) {
                    int LA32_169 = input.LA(4);

                    if ( (LA32_169=='V') ) {
                        int LA32_213 = input.LA(5);

                        if ( ((LA32_213>='#' && LA32_213<='$')||LA32_213=='-'||(LA32_213>='0' && LA32_213<='9')||(LA32_213>='A' && LA32_213<='Z')||LA32_213=='\\'||LA32_213=='_'||(LA32_213>='a' && LA32_213<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=23;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'U':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA32_101 = input.LA(3);

                if ( (LA32_101=='t') ) {
                    int LA32_170 = input.LA(4);

                    if ( (LA32_170=='i') ) {
                        int LA32_214 = input.LA(5);

                        if ( (LA32_214=='l') ) {
                            int LA32_249 = input.LA(6);

                            if ( ((LA32_249>='#' && LA32_249<='$')||LA32_249=='-'||(LA32_249>='0' && LA32_249<='9')||(LA32_249>='A' && LA32_249<='Z')||LA32_249=='\\'||LA32_249=='_'||(LA32_249>='a' && LA32_249<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=24;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'N':
                {
                int LA32_102 = input.LA(3);

                if ( (LA32_102=='T') ) {
                    int LA32_171 = input.LA(4);

                    if ( (LA32_171=='I') ) {
                        int LA32_215 = input.LA(5);

                        if ( (LA32_215=='L') ) {
                            int LA32_250 = input.LA(6);

                            if ( ((LA32_250>='#' && LA32_250<='$')||LA32_250=='-'||(LA32_250>='0' && LA32_250<='9')||(LA32_250>='A' && LA32_250<='Z')||LA32_250=='\\'||LA32_250=='_'||(LA32_250>='a' && LA32_250<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=24;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=24;}

            }
            break;
        case 'V':
            {
            int LA32_20 = input.LA(2);

            if ( ((LA32_20>='#' && LA32_20<='$')||LA32_20=='-'||(LA32_20>='0' && LA32_20<='9')||(LA32_20>='A' && LA32_20<='Z')||LA32_20=='\\'||LA32_20=='_'||(LA32_20>='a' && LA32_20<='z')) ) {
                alt32=78;
            }
            else {
                alt32=26;}
            }
            break;
        case 'R':
            {
            int LA32_21 = input.LA(2);

            if ( (LA32_21=='E') ) {
                switch ( input.LA(3) ) {
                case 'L':
                    {
                    int LA32_172 = input.LA(4);

                    if ( (LA32_172=='E') ) {
                        int LA32_216 = input.LA(5);

                        if ( (LA32_216=='A') ) {
                            int LA32_251 = input.LA(6);

                            if ( (LA32_251=='S') ) {
                                int LA32_275 = input.LA(7);

                                if ( (LA32_275=='E') ) {
                                    int LA32_287 = input.LA(8);

                                    if ( (LA32_287=='S') ) {
                                        int LA32_294 = input.LA(9);

                                        if ( ((LA32_294>='#' && LA32_294<='$')||LA32_294=='-'||(LA32_294>='0' && LA32_294<='9')||(LA32_294>='A' && LA32_294<='Z')||LA32_294=='\\'||LA32_294=='_'||(LA32_294>='a' && LA32_294<='z')) ) {
                                            alt32=78;
                                        }
                                        else {
                                            alt32=26;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                    }
                    break;
                case 'A':
                    {
                    int LA32_173 = input.LA(4);

                    if ( (LA32_173=='D') ) {
                        int LA32_217 = input.LA(5);

                        if ( ((LA32_217>='#' && LA32_217<='$')||LA32_217=='-'||(LA32_217>='0' && LA32_217<='9')||(LA32_217>='A' && LA32_217<='Z')||LA32_217=='\\'||LA32_217=='_'||(LA32_217>='a' && LA32_217<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=42;}
                    }
                    else {
                        alt32=78;}
                    }
                    break;
                default:
                    alt32=78;}

            }
            else {
                alt32=78;}
            }
            break;
        case 'T':
            {
            switch ( input.LA(2) ) {
            case 'R':
                {
                switch ( input.LA(3) ) {
                case 'U':
                    {
                    int LA32_174 = input.LA(4);

                    if ( (LA32_174=='E') ) {
                        int LA32_218 = input.LA(5);

                        if ( ((LA32_218>='#' && LA32_218<='$')||LA32_218=='-'||(LA32_218>='0' && LA32_218<='9')||(LA32_218>='A' && LA32_218<='Z')||LA32_218=='\\'||LA32_218=='_'||(LA32_218>='a' && LA32_218<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=38;}
                    }
                    else {
                        alt32=78;}
                    }
                    break;
                case 'I':
                    {
                    int LA32_175 = input.LA(4);

                    if ( (LA32_175=='G') ) {
                        int LA32_219 = input.LA(5);

                        if ( (LA32_219=='G') ) {
                            int LA32_254 = input.LA(6);

                            if ( (LA32_254=='E') ) {
                                int LA32_276 = input.LA(7);

                                if ( (LA32_276=='R') ) {
                                    int LA32_288 = input.LA(8);

                                    if ( (LA32_288=='E') ) {
                                        int LA32_295 = input.LA(9);

                                        if ( (LA32_295=='D') ) {
                                            int LA32_299 = input.LA(10);

                                            if ( ((LA32_299>='#' && LA32_299<='$')||LA32_299=='-'||(LA32_299>='0' && LA32_299<='9')||(LA32_299>='A' && LA32_299<='Z')||LA32_299=='\\'||LA32_299=='_'||(LA32_299>='a' && LA32_299<='z')) ) {
                                                alt32=78;
                                            }
                                            else {
                                                alt32=27;}
                                        }
                                        else {
                                            alt32=78;}
                                    }
                                    else {
                                        alt32=78;}
                                }
                                else {
                                    alt32=78;}
                            }
                            else {
                                alt32=78;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                    }
                    break;
                default:
                    alt32=78;}

                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=27;}

            }
            break;
        case 'Z':
            {
            int LA32_23 = input.LA(2);

            if ( ((LA32_23>='#' && LA32_23<='$')||LA32_23=='-'||(LA32_23>='0' && LA32_23<='9')||(LA32_23>='A' && LA32_23<='Z')||LA32_23=='\\'||LA32_23=='_'||(LA32_23>='a' && LA32_23<='z')) ) {
                alt32=78;
            }
            else {
                alt32=28;}
            }
            break;
        case 'K':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA32_109 = input.LA(3);

                if ( (LA32_109=='O') ) {
                    int LA32_176 = input.LA(4);

                    if ( (LA32_176=='W') ) {
                        int LA32_220 = input.LA(5);

                        if ( ((LA32_220>='#' && LA32_220<='$')||LA32_220=='-'||(LA32_220>='0' && LA32_220<='9')||(LA32_220>='A' && LA32_220<='Z')||LA32_220=='\\'||LA32_220=='_'||(LA32_220>='a' && LA32_220<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=29;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'n':
                {
                int LA32_110 = input.LA(3);

                if ( (LA32_110=='o') ) {
                    int LA32_177 = input.LA(4);

                    if ( (LA32_177=='w') ) {
                        int LA32_221 = input.LA(5);

                        if ( ((LA32_221>='#' && LA32_221<='$')||LA32_221=='-'||(LA32_221>='0' && LA32_221<='9')||(LA32_221>='A' && LA32_221<='Z')||LA32_221=='\\'||LA32_221=='_'||(LA32_221>='a' && LA32_221<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=29;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case '#':
            case '$':
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '\\':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt32=78;
                }
                break;
            default:
                alt32=29;}

            }
            break;
        case ')':
            {
            alt32=32;
            }
            break;
        case ']':
            {
            alt32=34;
            }
            break;
        case '{':
            {
            alt32=35;
            }
            break;
        case '}':
            {
            alt32=36;
            }
            break;
        case 'w':
            {
            int LA32_29 = input.LA(2);

            if ( (LA32_29=='o') ) {
                int LA32_112 = input.LA(3);

                if ( (LA32_112=='r') ) {
                    int LA32_178 = input.LA(4);

                    if ( (LA32_178=='d') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA32_255 = input.LA(6);

                            if ( ((LA32_255>='#' && LA32_255<='$')||LA32_255=='-'||(LA32_255>='0' && LA32_255<='9')||(LA32_255>='A' && LA32_255<='Z')||LA32_255=='\\'||LA32_255=='_'||(LA32_255>='a' && LA32_255<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=39;}
                            }
                            break;
                        case '#':
                        case '$':
                        case '-':
                        case '0':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '\\':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt32=78;
                            }
                            break;
                        default:
                            alt32=40;}

                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'W':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_113 = input.LA(3);

                if ( (LA32_113=='r') ) {
                    int LA32_179 = input.LA(4);

                    if ( (LA32_179=='d') ) {
                        int LA32_223 = input.LA(5);

                        if ( ((LA32_223>='#' && LA32_223<='$')||LA32_223=='-'||(LA32_223>='0' && LA32_223<='9')||(LA32_223>='A' && LA32_223<='Z')||LA32_223=='\\'||LA32_223=='_'||(LA32_223>='a' && LA32_223<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=40;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'R':
                {
                int LA32_114 = input.LA(3);

                if ( (LA32_114=='I') ) {
                    int LA32_180 = input.LA(4);

                    if ( (LA32_180=='T') ) {
                        int LA32_224 = input.LA(5);

                        if ( (LA32_224=='E') ) {
                            int LA32_257 = input.LA(6);

                            if ( ((LA32_257>='#' && LA32_257<='$')||LA32_257=='-'||(LA32_257>='0' && LA32_257<='9')||(LA32_257>='A' && LA32_257<='Z')||LA32_257=='\\'||LA32_257=='_'||(LA32_257>='a' && LA32_257<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=43;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            default:
                alt32=78;}

            }
            break;
        case 'b':
            {
            int LA32_31 = input.LA(2);

            if ( (LA32_31=='o') ) {
                int LA32_115 = input.LA(3);

                if ( (LA32_115=='o') ) {
                    int LA32_181 = input.LA(4);

                    if ( (LA32_181=='l') ) {
                        int LA32_225 = input.LA(5);

                        if ( ((LA32_225>='#' && LA32_225<='$')||LA32_225=='-'||(LA32_225>='0' && LA32_225<='9')||(LA32_225>='A' && LA32_225<='Z')||LA32_225=='\\'||LA32_225=='_'||(LA32_225>='a' && LA32_225<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=41;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'c':
            {
            int LA32_32 = input.LA(2);

            if ( (LA32_32=='a') ) {
                int LA32_116 = input.LA(3);

                if ( (LA32_116=='s') ) {
                    int LA32_182 = input.LA(4);

                    if ( (LA32_182=='e') ) {
                        int LA32_226 = input.LA(5);

                        if ( ((LA32_226>='#' && LA32_226<='$')||LA32_226=='-'||(LA32_226>='0' && LA32_226<='9')||(LA32_226>='A' && LA32_226<='Z')||LA32_226=='\\'||LA32_226=='_'||(LA32_226>='a' && LA32_226<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=44;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'e':
            {
            int LA32_33 = input.LA(2);

            if ( (LA32_33=='s') ) {
                int LA32_117 = input.LA(3);

                if ( (LA32_117=='a') ) {
                    int LA32_183 = input.LA(4);

                    if ( (LA32_183=='c') ) {
                        int LA32_227 = input.LA(5);

                        if ( ((LA32_227>='#' && LA32_227<='$')||LA32_227=='-'||(LA32_227>='0' && LA32_227<='9')||(LA32_227>='A' && LA32_227<='Z')||LA32_227=='\\'||LA32_227=='_'||(LA32_227>='a' && LA32_227<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=45;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case '+':
            {
            alt32=46;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt32=64;
                }
                break;
            case '-':
                {
                alt32=81;
                }
                break;
            default:
                alt32=47;}

            }
            break;
        case '*':
            {
            alt32=48;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt32=80;
                }
                break;
            case '/':
                {
                alt32=81;
                }
                break;
            default:
                alt32=49;}

            }
            break;
        case 'm':
            {
            int LA32_38 = input.LA(2);

            if ( (LA32_38=='o') ) {
                int LA32_123 = input.LA(3);

                if ( (LA32_123=='d') ) {
                    int LA32_184 = input.LA(4);

                    if ( ((LA32_184>='#' && LA32_184<='$')||LA32_184=='-'||(LA32_184>='0' && LA32_184<='9')||(LA32_184>='A' && LA32_184<='Z')||LA32_184=='\\'||LA32_184=='_'||(LA32_184>='a' && LA32_184<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=50;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt32=52;
                }
                break;
            case '=':
                {
                alt32=56;
                }
                break;
            default:
                alt32=58;}

            }
            break;
        case '=':
            {
            alt32=53;
            }
            break;
        case '!':
            {
            int LA32_41 = input.LA(2);

            if ( (LA32_41=='=') ) {
                alt32=54;
            }
            else {
                alt32=70;}
            }
            break;
        case 'n':
            {
            int LA32_42 = input.LA(2);

            if ( (LA32_42=='e') ) {
                int LA32_129 = input.LA(3);

                if ( (LA32_129=='x') ) {
                    int LA32_185 = input.LA(4);

                    if ( (LA32_185=='t') ) {
                        int LA32_229 = input.LA(5);

                        if ( ((LA32_229>='#' && LA32_229<='$')||LA32_229=='-'||(LA32_229>='0' && LA32_229<='9')||(LA32_229>='A' && LA32_229<='Z')||LA32_229=='\\'||LA32_229=='_'||(LA32_229>='a' && LA32_229<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=59;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'u':
            {
            int LA32_43 = input.LA(2);

            if ( (LA32_43=='n') ) {
                int LA32_130 = input.LA(3);

                if ( (LA32_130=='i') ) {
                    int LA32_186 = input.LA(4);

                    if ( (LA32_186=='o') ) {
                        int LA32_230 = input.LA(5);

                        if ( (LA32_230=='n') ) {
                            int LA32_262 = input.LA(6);

                            if ( ((LA32_262>='#' && LA32_262<='$')||LA32_262=='-'||(LA32_262>='0' && LA32_262<='9')||(LA32_262>='A' && LA32_262<='Z')||LA32_262=='\\'||LA32_262=='_'||(LA32_262>='a' && LA32_262<='z')) ) {
                                alt32=78;
                            }
                            else {
                                alt32=60;}
                        }
                        else {
                            alt32=78;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
            }
            else {
                alt32=78;}
            }
            break;
        case 'i':
            {
            int LA32_44 = input.LA(2);

            if ( (LA32_44=='n') ) {
                int LA32_131 = input.LA(3);

                if ( ((LA32_131>='#' && LA32_131<='$')||LA32_131=='-'||(LA32_131>='0' && LA32_131<='9')||(LA32_131>='A' && LA32_131<='Z')||LA32_131=='\\'||LA32_131=='_'||(LA32_131>='a' && LA32_131<='z')) ) {
                    alt32=78;
                }
                else {
                    alt32=61;}
            }
            else {
                alt32=78;}
            }
            break;
        case '.':
            {
            int LA32_45 = input.LA(2);

            if ( (LA32_45=='.') ) {
                alt32=62;
            }
            else {
                alt32=63;}
            }
            break;
        case '|':
            {
            alt32=66;
            }
            break;
        case '&':
            {
            alt32=67;
            }
            break;
        case 'x':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_134 = input.LA(3);

                if ( (LA32_134=='r') ) {
                    int LA32_188 = input.LA(4);

                    if ( ((LA32_188>='#' && LA32_188<='$')||LA32_188=='-'||(LA32_188>='0' && LA32_188<='9')||(LA32_188>='A' && LA32_188<='Z')||LA32_188=='\\'||LA32_188=='_'||(LA32_188>='a' && LA32_188<='z')) ) {
                        alt32=78;
                    }
                    else {
                        alt32=68;}
                }
                else {
                    alt32=78;}
                }
                break;
            case 'n':
                {
                int LA32_135 = input.LA(3);

                if ( (LA32_135=='o') ) {
                    int LA32_189 = input.LA(4);

                    if ( (LA32_189=='r') ) {
                        int LA32_232 = input.LA(5);

                        if ( ((LA32_232>='#' && LA32_232<='$')||LA32_232=='-'||(LA32_232>='0' && LA32_232<='9')||(LA32_232>='A' && LA32_232<='Z')||LA32_232=='\\'||LA32_232=='_'||(LA32_232>='a' && LA32_232<='z')) ) {
                            alt32=78;
                        }
                        else {
                            alt32=69;}
                    }
                    else {
                        alt32=78;}
                }
                else {
                    alt32=78;}
                }
                break;
            default:
                alt32=78;}

            }
            break;
        case ',':
            {
            alt32=71;
            }
            break;
        case ':':
            {
            int LA32_50 = input.LA(2);

            if ( (LA32_50==':') ) {
                alt32=74;
            }
            else {
                alt32=72;}
            }
            break;
        case ';':
            {
            alt32=73;
            }
            break;
        case '0':
            {
            int LA32_52 = input.LA(2);

            if ( (LA32_52=='B'||LA32_52=='D'||LA32_52=='H'||LA32_52=='O'||LA32_52=='b'||LA32_52=='d'||LA32_52=='h'||LA32_52=='o') ) {
                alt32=75;
            }
            else {
                alt32=77;}
            }
            break;
        case 'f':
            {
            int LA32_53 = input.LA(2);

            if ( (LA32_53=='\'') ) {
                alt32=76;
            }
            else {
                alt32=78;}
            }
            break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt32=77;
            }
            break;
        case 'D':
        case 'J':
        case 'M':
        case 'Q':
        case '_':
        case 'a':
        case 'd':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'v':
        case 'y':
        case 'z':
            {
            alt32=78;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt32=79;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT );", 32, 0, input);

            throw nvae;
        }

        switch (alt32) {
            case 1 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:10: TOK_CTL_SPEC
                {
                mTOK_CTL_SPEC(); 

                }
                break;
            case 2 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:23: TOK_CTL_STAR_SPEC
                {
                mTOK_CTL_STAR_SPEC(); 

                }
                break;
            case 3 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:41: TOK_LTL_SPEC
                {
                mTOK_LTL_SPEC(); 

                }
                break;
            case 4 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:54: TOK_INVAR_SPEC
                {
                mTOK_INVAR_SPEC(); 

                }
                break;
            case 5 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:69: TOK_EX
                {
                mTOK_EX(); 

                }
                break;
            case 6 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:76: TOK_AX
                {
                mTOK_AX(); 

                }
                break;
            case 7 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:83: TOK_EF
                {
                mTOK_EF(); 

                }
                break;
            case 8 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:90: TOK_AF
                {
                mTOK_AF(); 

                }
                break;
            case 9 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:97: TOK_EG
                {
                mTOK_EG(); 

                }
                break;
            case 10 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:104: TOK_AG
                {
                mTOK_AG(); 

                }
                break;
            case 11 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:111: TOK_EE
                {
                mTOK_EE(); 

                }
                break;
            case 12 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:118: TOK_AA
                {
                mTOK_AA(); 

                }
                break;
            case 13 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:125: TOK_BUNTIL
                {
                mTOK_BUNTIL(); 

                }
                break;
            case 14 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:136: TOK_EBF
                {
                mTOK_EBF(); 

                }
                break;
            case 15 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:144: TOK_ABF
                {
                mTOK_ABF(); 

                }
                break;
            case 16 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:152: TOK_EBG
                {
                mTOK_EBG(); 

                }
                break;
            case 17 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:160: TOK_ABG
                {
                mTOK_ABG(); 

                }
                break;
            case 18 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:168: TOK_OP_FINALLY
                {
                mTOK_OP_FINALLY(); 

                }
                break;
            case 19 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:183: TOK_OP_ONCE
                {
                mTOK_OP_ONCE(); 

                }
                break;
            case 20 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:195: TOK_OP_GLOBALLY
                {
                mTOK_OP_GLOBALLY(); 

                }
                break;
            case 21 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:211: TOK_OP_HISTORICALLY
                {
                mTOK_OP_HISTORICALLY(); 

                }
                break;
            case 22 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:231: TOK_OP_NEXT
                {
                mTOK_OP_NEXT(); 

                }
                break;
            case 23 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:243: TOK_OP_PREV
                {
                mTOK_OP_PREV(); 

                }
                break;
            case 24 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:255: TOK_UNTIL
                {
                mTOK_UNTIL(); 

                }
                break;
            case 25 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:265: TOK_SINCE
                {
                mTOK_SINCE(); 

                }
                break;
            case 26 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:275: TOK_RELEASES
                {
                mTOK_RELEASES(); 

                }
                break;
            case 27 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:288: TOK_TRIGGERED
                {
                mTOK_TRIGGERED(); 

                }
                break;
            case 28 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:302: TOK_OP_NOTPREVNOT
                {
                mTOK_OP_NOTPREVNOT(); 

                }
                break;
            case 29 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:320: TOK_KNOW
                {
                mTOK_KNOW(); 

                }
                break;
            case 30 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:329: TOK_SKNOW
                {
                mTOK_SKNOW(); 

                }
                break;
            case 31 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:339: TOK_LP
                {
                mTOK_LP(); 

                }
                break;
            case 32 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:346: TOK_RP
                {
                mTOK_RP(); 

                }
                break;
            case 33 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:353: TOK_LB
                {
                mTOK_LB(); 

                }
                break;
            case 34 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:360: TOK_RB
                {
                mTOK_RB(); 

                }
                break;
            case 35 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:367: TOK_LCB
                {
                mTOK_LCB(); 

                }
                break;
            case 36 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:375: TOK_RCB
                {
                mTOK_RCB(); 

                }
                break;
            case 37 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:383: TOK_FALSEEXP
                {
                mTOK_FALSEEXP(); 

                }
                break;
            case 38 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:396: TOK_TRUEEXP
                {
                mTOK_TRUEEXP(); 

                }
                break;
            case 39 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:408: TOK_WORD1
                {
                mTOK_WORD1(); 

                }
                break;
            case 40 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:418: TOK_WORD
                {
                mTOK_WORD(); 

                }
                break;
            case 41 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:427: TOK_BOOL
                {
                mTOK_BOOL(); 

                }
                break;
            case 42 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:436: TOK_WAREAD
                {
                mTOK_WAREAD(); 

                }
                break;
            case 43 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:447: TOK_WAWRITE
                {
                mTOK_WAWRITE(); 

                }
                break;
            case 44 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:459: TOK_CASE
                {
                mTOK_CASE(); 

                }
                break;
            case 45 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:468: TOK_ESAC
                {
                mTOK_ESAC(); 

                }
                break;
            case 46 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:477: TOK_PLUS
                {
                mTOK_PLUS(); 

                }
                break;
            case 47 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:486: TOK_MINUS
                {
                mTOK_MINUS(); 

                }
                break;
            case 48 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:496: TOK_TIMES
                {
                mTOK_TIMES(); 

                }
                break;
            case 49 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:506: TOK_DIVIDE
                {
                mTOK_DIVIDE(); 

                }
                break;
            case 50 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:517: TOK_MOD
                {
                mTOK_MOD(); 

                }
                break;
            case 51 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:525: TOK_LSHIFT
                {
                mTOK_LSHIFT(); 

                }
                break;
            case 52 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:536: TOK_RSHIFT
                {
                mTOK_RSHIFT(); 

                }
                break;
            case 53 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:547: TOK_EQUAL
                {
                mTOK_EQUAL(); 

                }
                break;
            case 54 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:557: TOK_NOTEQUAL
                {
                mTOK_NOTEQUAL(); 

                }
                break;
            case 55 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:570: TOK_LE
                {
                mTOK_LE(); 

                }
                break;
            case 56 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:577: TOK_GE
                {
                mTOK_GE(); 

                }
                break;
            case 57 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:584: TOK_LT
                {
                mTOK_LT(); 

                }
                break;
            case 58 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:591: TOK_GT
                {
                mTOK_GT(); 

                }
                break;
            case 59 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:598: TOK_NEXT
                {
                mTOK_NEXT(); 

                }
                break;
            case 60 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:607: TOK_UNION
                {
                mTOK_UNION(); 

                }
                break;
            case 61 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:617: TOK_SETIN
                {
                mTOK_SETIN(); 

                }
                break;
            case 62 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:627: TOK_TWODOTS
                {
                mTOK_TWODOTS(); 

                }
                break;
            case 63 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:639: TOK_DOT
                {
                mTOK_DOT(); 

                }
                break;
            case 64 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:647: TOK_IMPLIES
                {
                mTOK_IMPLIES(); 

                }
                break;
            case 65 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:659: TOK_IFF
                {
                mTOK_IFF(); 

                }
                break;
            case 66 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:667: TOK_OR
                {
                mTOK_OR(); 

                }
                break;
            case 67 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:674: TOK_AND
                {
                mTOK_AND(); 

                }
                break;
            case 68 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:682: TOK_XOR
                {
                mTOK_XOR(); 

                }
                break;
            case 69 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:690: TOK_XNOR
                {
                mTOK_XNOR(); 

                }
                break;
            case 70 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:699: TOK_NOT
                {
                mTOK_NOT(); 

                }
                break;
            case 71 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:707: TOK_COMMA
                {
                mTOK_COMMA(); 

                }
                break;
            case 72 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:717: TOK_COLON
                {
                mTOK_COLON(); 

                }
                break;
            case 73 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:727: TOK_SEMI
                {
                mTOK_SEMI(); 

                }
                break;
            case 74 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:736: TOK_CONCATENATION
                {
                mTOK_CONCATENATION(); 

                }
                break;
            case 75 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:754: TOK_NUMBER_WORD
                {
                mTOK_NUMBER_WORD(); 

                }
                break;
            case 76 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:770: TOK_NUMBER_FRAC
                {
                mTOK_NUMBER_FRAC(); 

                }
                break;
            case 77 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:786: TOK_NUMBER
                {
                mTOK_NUMBER(); 

                }
                break;
            case 78 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:797: TOK_ATOM
                {
                mTOK_ATOM(); 

                }
                break;
            case 79 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:806: JTOK_WS
                {
                mJTOK_WS(); 

                }
                break;
            case 80 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:814: JTOK_MULTI_COMMENT
                {
                mJTOK_MULTI_COMMENT(); 

                }
                break;
            case 81 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:833: JTOK_LINE_COMMENT
                {
                mJTOK_LINE_COMMENT(); 

                }
                break;

        }

    }


 

}