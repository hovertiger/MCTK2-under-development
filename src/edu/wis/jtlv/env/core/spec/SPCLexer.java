// $ANTLR 3.0.1 /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g 2017-10-18 16:02:36

package edu.wis.jtlv.env.core.spec;
import edu.wis.jtlv.env.Env;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SPCLexer extends Lexer {
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
    public static final int Tokens=101;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:17: ( 'CTLSPEC' | 'SPEC' )
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
                    new NoViableAltException("1390:1: TOK_CTL_SPEC : ( 'CTLSPEC' | 'SPEC' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:19: 'CTLSPEC'
                    {
                    match("CTLSPEC"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1390:31: 'SPEC'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1391:21: ( 'CTL*SPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1391:23: 'CTL*SPEC'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1392:17: ( 'LTLSPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1392:19: 'LTLSPEC'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1393:19: ( 'INVARSPEC' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1393:21: 'INVARSPEC'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1395:13: ( 'EX' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1395:15: 'EX'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1396:13: ( 'AX' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1396:15: 'AX'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:13: ( 'EF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1397:15: 'EF'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1398:13: ( 'AF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1398:15: 'AF'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1399:13: ( 'EG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1399:15: 'EG'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1400:13: ( 'AG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1400:15: 'AG'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1401:13: ( 'E' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1401:15: 'E'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1402:13: ( 'A' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1402:15: 'A'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1403:16: ( 'BU' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1403:18: 'BU'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1404:14: ( 'EBF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1404:16: 'EBF'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1405:14: ( 'ABF' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1405:16: 'ABF'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1406:14: ( 'EBG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1406:16: 'EBG'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1407:14: ( 'ABG' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1407:16: 'ABG'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:19: ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' )
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
                    new NoViableAltException("1409:1: TOK_OP_FINALLY : ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:21: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:28: 'F'
                    {
                    match('F'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:34: 'FINALLY'
                    {
                    match("FINALLY"); 


                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1409:46: 'EVENTUALLY'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1410:17: ( '<_>' | 'O' | 'ONCE' )
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
                    new NoViableAltException("1410:1: TOK_OP_ONCE : ( '<_>' | 'O' | 'ONCE' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1410:19: '<_>'
                    {
                    match("<_>"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1410:27: 'O'
                    {
                    match('O'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1410:33: 'ONCE'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:20: ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' )
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
                    new NoViableAltException("1411:1: TOK_OP_GLOBALLY : ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:22: '[]'
                    {
                    match("[]"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:29: 'G'
                    {
                    match('G'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:35: 'GLOBALLY'
                    {
                    match("GLOBALLY"); 


                    }
                    break;
                case 4 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1411:48: 'ALWAYS'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:23: ( '[_]' | 'H' | 'HISTORICALLY' )
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
                    new NoViableAltException("1412:1: TOK_OP_HISTORICALLY : ( '[_]' | 'H' | 'HISTORICALLY' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:25: '[_]'
                    {
                    match("[_]"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:33: 'H'
                    {
                    match('H'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1412:39: 'HISTORICALLY'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:17: ( '()' | 'X' | 'NEXT' )
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
                    new NoViableAltException("1413:1: TOK_OP_NEXT : ( '()' | 'X' | 'NEXT' );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:19: '()'
                    {
                    match("()"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:26: 'X'
                    {
                    match('X'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1413:32: 'NEXT'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:17: ( '(_)' | 'Y' | 'PREV' )
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
                    new NoViableAltException("1414:1: TOK_OP_PREV : ( '(_)' | 'Y' | 'PREV' );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:19: '(_)'
                    {
                    match("(_)"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:27: 'Y'
                    {
                    match('Y'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1414:33: 'PREV'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:15: ( 'Until' | 'U' | 'UNTIL' )
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
                    new NoViableAltException("1415:1: TOK_UNTIL : ( 'Until' | 'U' | 'UNTIL' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:17: 'Until'
                    {
                    match("Until"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:27: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1415:33: 'UNTIL'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:15: ( 'Since' | 'S' | 'SINCE' )
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
                    new NoViableAltException("1416:1: TOK_SINCE : ( 'Since' | 'S' | 'SINCE' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:17: 'Since'
                    {
                    match("Since"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:27: 'S'
                    {
                    match('S'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1416:33: 'SINCE'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:17: ( 'Awaits' | 'V' | 'RELEASES' )
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
                    new NoViableAltException("1417:1: TOK_RELEASES : ( 'Awaits' | 'V' | 'RELEASES' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:19: 'Awaits'
                    {
                    match("Awaits"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:30: 'V'
                    {
                    match('V'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1417:36: 'RELEASES'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:18: ( 'Backto' | 'T' | 'TRIGGERED' )
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
                    new NoViableAltException("1418:1: TOK_TRIGGERED : ( 'Backto' | 'T' | 'TRIGGERED' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:20: 'Backto'
                    {
                    match("Backto"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:31: 'T'
                    {
                    match('T'); 

                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1418:37: 'TRIGGERED'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1419:21: ( 'Z' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1419:23: 'Z'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:13: ( 'K' | 'KNOW' | 'Know' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='K') ) {
                switch ( input.LA(2) ) {
                case 'N':
                    {
                    alt12=2;
                    }
                    break;
                case 'n':
                    {
                    alt12=3;
                    }
                    break;
                default:
                    alt12=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1422:1: TOK_KNOW : ( 'K' | 'KNOW' | 'Know' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:15: 'K'
                    {
                    match('K'); 

                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:21: 'KNOW'
                    {
                    match("KNOW"); 


                    }
                    break;
                case 3 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1422:30: 'Know'
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

    // $ANTLR start TOK_LP
    public final void mTOK_LP() throws RecognitionException {
        try {
            int _type = TOK_LP;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:13: ( '(' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1427:15: '('
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:13: ( ')' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1428:15: ')'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:13: ( '[' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1429:15: '['
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:13: ( ']' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1430:15: ']'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:14: ( '{' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1431:16: '{'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:14: ( '}' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1432:16: '}'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:17: ( 'FALSE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1433:19: 'FALSE'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:17: ( 'TRUE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1434:19: 'TRUE'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:15: ( 'word1' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1438:17: 'word1'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:14: ( 'word' | 'Word' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='w') ) {
                alt13=1;
            }
            else if ( (LA13_0=='W') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1439:1: TOK_WORD : ( 'word' | 'Word' );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:16: 'word'
                    {
                    match("word"); 


                    }
                    break;
                case 2 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1439:25: 'Word'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1440:14: ( 'bool' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1440:16: 'bool'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1441:16: ( 'READ' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1441:18: 'READ'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1442:17: ( 'WRITE' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1442:19: 'WRITE'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1444:14: ( 'case' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1444:16: 'case'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1445:14: ( 'esac' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1445:16: 'esac'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1446:14: ( '+' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1446:16: '+'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1447:15: ( '-' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1447:17: '-'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1448:15: ( '*' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1448:17: '*'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1449:16: ( '/' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1449:18: '/'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1450:14: ( 'mod' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1450:16: 'mod'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1451:16: ( '<<' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1451:18: '<<'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1452:16: ( '>>' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1452:18: '>>'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1455:15: ( '=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1455:17: '='
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1456:17: ( '!=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1456:19: '!='
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1457:13: ( '<=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1457:15: '<='
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1458:13: ( '>=' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1458:15: '>='
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1459:13: ( '<' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1459:15: '<'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1460:13: ( '>' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1460:15: '>'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1461:14: ( 'next' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1461:16: 'next'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1463:15: ( 'union' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1463:17: 'union'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1464:15: ( 'in' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1464:17: 'in'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1465:17: ( '..' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1465:19: '..'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1466:14: ( '.' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1466:16: '.'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1469:17: ( '->' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1469:19: '->'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1470:14: ( '<->' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1470:16: '<->'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1471:13: ( '|' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1471:15: '|'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1472:14: ( '&' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1472:16: '&'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1473:14: ( 'xor' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1473:16: 'xor'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1474:14: ( 'xnor' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1474:16: 'xnor'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1475:14: ( '!' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1475:16: '!'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1477:15: ( ',' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1477:17: ','
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1478:15: ( ':' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1478:17: ':'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1479:14: ( ';' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1479:16: ';'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1480:21: ( '::' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1480:23: '::'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:21: ( '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:23: '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
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

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:75: ( '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:76: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop14;
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

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1489:124: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='f')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:21: ( ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:23: ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:40: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:41: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            match('/'); 
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:56: ( '0' .. '9' )+
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1492:57: '0' .. '9'
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:17: ( ( '0' .. '9' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:19: ( '0' .. '9' )+
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:19: ( '0' .. '9' )+
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
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1495:20: '0' .. '9'
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
    // $ANTLR end TOK_NUMBER

    // $ANTLR start TOK_ATOM
    public final void mTOK_ATOM() throws RecognitionException {
        try {
            int _type = TOK_ATOM;
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1498:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )* )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1498:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1498:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='#' && LA19_0<='$')||LA19_0=='-'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='\\'||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    break loop19;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1501:15: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1501:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1501:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1507:23: ( ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' ) )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1507:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            {
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1507:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1507:26: '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/'
            {
            match("/*"); 

            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1507:31: ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )*
            loop21:
            do {
                int alt21=4;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=4;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFE')) ) {
                        alt21=3;
                    }


                }
                else if ( (LA21_0=='\r') ) {
                    alt21=1;
                }
                else if ( (LA21_0=='\n') ) {
                    alt21=2;
                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFE')) ) {
                    alt21=3;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1510:9: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1511:13: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1512:13: ~ ( '\\n' | '\\r' )
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
            	    break loop21;
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
            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:22: ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='-') ) {
                alt30=1;
            }
            else if ( (LA30_0=='/') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1516:1: JTOK_LINE_COMMENT : ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:25: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("--"); 

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:30: (~ ( '\\n' | '\\r' ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFE')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:31: ~ ( '\\n' | '\\r' )
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

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:46: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:47: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:47: ( '\\n' | '\\r' ( '\\n' )? )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0=='\n') ) {
                                alt24=1;
                            }
                            else if ( (LA24_0=='\r') ) {
                                alt24=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1516:47: ( '\\n' | '\\r' ( '\\n' )? )", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:48: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:53: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:57: ( '\\n' )?
                                    int alt23=2;
                                    int LA23_0 = input.LA(1);

                                    if ( (LA23_0=='\n') ) {
                                        alt23=1;
                                    }
                                    switch (alt23) {
                                        case 1 :
                                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1516:58: '\\n'
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
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:12: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("//"); 

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:17: (~ ( '\\n' | '\\r' ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFE')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:18: ~ ( '\\n' | '\\r' )
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
                    	    break loop26;
                        }
                    } while (true);

                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:33: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:34: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:34: ( '\\n' | '\\r' ( '\\n' )? )
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0=='\n') ) {
                                alt28=1;
                            }
                            else if ( (LA28_0=='\r') ) {
                                alt28=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1517:34: ( '\\n' | '\\r' ( '\\n' )? )", 28, 0, input);

                                throw nvae;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:35: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:40: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:44: ( '\\n' )?
                                    int alt27=2;
                                    int LA27_0 = input.LA(1);

                                    if ( (LA27_0=='\n') ) {
                                        alt27=1;
                                    }
                                    switch (alt27) {
                                        case 1 :
                                            // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1517:45: '\\n'
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
        // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:8: ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_KNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT )
        int alt31=80;
        switch ( input.LA(1) ) {
        case 'C':
            {
            int LA31_1 = input.LA(2);

            if ( (LA31_1=='T') ) {
                int LA31_57 = input.LA(3);

                if ( (LA31_57=='L') ) {
                    switch ( input.LA(4) ) {
                    case 'S':
                        {
                        int LA31_185 = input.LA(5);

                        if ( (LA31_185=='P') ) {
                            int LA31_226 = input.LA(6);

                            if ( (LA31_226=='E') ) {
                                int LA31_255 = input.LA(7);

                                if ( (LA31_255=='C') ) {
                                    int LA31_271 = input.LA(8);

                                    if ( ((LA31_271>='#' && LA31_271<='$')||LA31_271=='-'||(LA31_271>='0' && LA31_271<='9')||(LA31_271>='A' && LA31_271<='Z')||LA31_271=='\\'||LA31_271=='_'||(LA31_271>='a' && LA31_271<='z')) ) {
                                        alt31=77;
                                    }
                                    else {
                                        alt31=1;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                        }
                        break;
                    case '*':
                        {
                        alt31=2;
                        }
                        break;
                    default:
                        alt31=77;}

                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'S':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA31_58 = input.LA(3);

                if ( (LA31_58=='n') ) {
                    int LA31_138 = input.LA(4);

                    if ( (LA31_138=='c') ) {
                        int LA31_187 = input.LA(5);

                        if ( (LA31_187=='e') ) {
                            int LA31_227 = input.LA(6);

                            if ( ((LA31_227>='#' && LA31_227<='$')||LA31_227=='-'||(LA31_227>='0' && LA31_227<='9')||(LA31_227>='A' && LA31_227<='Z')||LA31_227=='\\'||LA31_227=='_'||(LA31_227>='a' && LA31_227<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=25;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'I':
                {
                int LA31_59 = input.LA(3);

                if ( (LA31_59=='N') ) {
                    int LA31_139 = input.LA(4);

                    if ( (LA31_139=='C') ) {
                        int LA31_188 = input.LA(5);

                        if ( (LA31_188=='E') ) {
                            int LA31_228 = input.LA(6);

                            if ( ((LA31_228>='#' && LA31_228<='$')||LA31_228=='-'||(LA31_228>='0' && LA31_228<='9')||(LA31_228>='A' && LA31_228<='Z')||LA31_228=='\\'||LA31_228=='_'||(LA31_228>='a' && LA31_228<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=25;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'P':
                {
                int LA31_60 = input.LA(3);

                if ( (LA31_60=='E') ) {
                    int LA31_140 = input.LA(4);

                    if ( (LA31_140=='C') ) {
                        int LA31_189 = input.LA(5);

                        if ( ((LA31_189>='#' && LA31_189<='$')||LA31_189=='-'||(LA31_189>='0' && LA31_189<='9')||(LA31_189>='A' && LA31_189<='Z')||LA31_189=='\\'||LA31_189=='_'||(LA31_189>='a' && LA31_189<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=1;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=25;}

            }
            break;
        case 'L':
            {
            int LA31_3 = input.LA(2);

            if ( (LA31_3=='T') ) {
                int LA31_62 = input.LA(3);

                if ( (LA31_62=='L') ) {
                    int LA31_141 = input.LA(4);

                    if ( (LA31_141=='S') ) {
                        int LA31_190 = input.LA(5);

                        if ( (LA31_190=='P') ) {
                            int LA31_230 = input.LA(6);

                            if ( (LA31_230=='E') ) {
                                int LA31_256 = input.LA(7);

                                if ( (LA31_256=='C') ) {
                                    int LA31_272 = input.LA(8);

                                    if ( ((LA31_272>='#' && LA31_272<='$')||LA31_272=='-'||(LA31_272>='0' && LA31_272<='9')||(LA31_272>='A' && LA31_272<='Z')||LA31_272=='\\'||LA31_272=='_'||(LA31_272>='a' && LA31_272<='z')) ) {
                                        alt31=77;
                                    }
                                    else {
                                        alt31=3;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'I':
            {
            int LA31_4 = input.LA(2);

            if ( (LA31_4=='N') ) {
                int LA31_63 = input.LA(3);

                if ( (LA31_63=='V') ) {
                    int LA31_142 = input.LA(4);

                    if ( (LA31_142=='A') ) {
                        int LA31_191 = input.LA(5);

                        if ( (LA31_191=='R') ) {
                            int LA31_231 = input.LA(6);

                            if ( (LA31_231=='S') ) {
                                int LA31_257 = input.LA(7);

                                if ( (LA31_257=='P') ) {
                                    int LA31_273 = input.LA(8);

                                    if ( (LA31_273=='E') ) {
                                        int LA31_281 = input.LA(9);

                                        if ( (LA31_281=='C') ) {
                                            int LA31_287 = input.LA(10);

                                            if ( ((LA31_287>='#' && LA31_287<='$')||LA31_287=='-'||(LA31_287>='0' && LA31_287<='9')||(LA31_287>='A' && LA31_287<='Z')||LA31_287=='\\'||LA31_287=='_'||(LA31_287>='a' && LA31_287<='z')) ) {
                                                alt31=77;
                                            }
                                            else {
                                                alt31=4;}
                                        }
                                        else {
                                            alt31=77;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'E':
            {
            switch ( input.LA(2) ) {
            case 'X':
                {
                int LA31_64 = input.LA(3);

                if ( ((LA31_64>='#' && LA31_64<='$')||LA31_64=='-'||(LA31_64>='0' && LA31_64<='9')||(LA31_64>='A' && LA31_64<='Z')||LA31_64=='\\'||LA31_64=='_'||(LA31_64>='a' && LA31_64<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=5;}
                }
                break;
            case 'F':
                {
                int LA31_65 = input.LA(3);

                if ( ((LA31_65>='#' && LA31_65<='$')||LA31_65=='-'||(LA31_65>='0' && LA31_65<='9')||(LA31_65>='A' && LA31_65<='Z')||LA31_65=='\\'||LA31_65=='_'||(LA31_65>='a' && LA31_65<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=7;}
                }
                break;
            case 'G':
                {
                int LA31_66 = input.LA(3);

                if ( ((LA31_66>='#' && LA31_66<='$')||LA31_66=='-'||(LA31_66>='0' && LA31_66<='9')||(LA31_66>='A' && LA31_66<='Z')||LA31_66=='\\'||LA31_66=='_'||(LA31_66>='a' && LA31_66<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=9;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'F':
                    {
                    int LA31_146 = input.LA(4);

                    if ( ((LA31_146>='#' && LA31_146<='$')||LA31_146=='-'||(LA31_146>='0' && LA31_146<='9')||(LA31_146>='A' && LA31_146<='Z')||LA31_146=='\\'||LA31_146=='_'||(LA31_146>='a' && LA31_146<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=14;}
                    }
                    break;
                case 'G':
                    {
                    int LA31_147 = input.LA(4);

                    if ( ((LA31_147>='#' && LA31_147<='$')||LA31_147=='-'||(LA31_147>='0' && LA31_147<='9')||(LA31_147>='A' && LA31_147<='Z')||LA31_147=='\\'||LA31_147=='_'||(LA31_147>='a' && LA31_147<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=16;}
                    }
                    break;
                default:
                    alt31=77;}

                }
                break;
            case 'V':
                {
                int LA31_68 = input.LA(3);

                if ( (LA31_68=='E') ) {
                    int LA31_148 = input.LA(4);

                    if ( (LA31_148=='N') ) {
                        int LA31_194 = input.LA(5);

                        if ( (LA31_194=='T') ) {
                            int LA31_232 = input.LA(6);

                            if ( (LA31_232=='U') ) {
                                int LA31_258 = input.LA(7);

                                if ( (LA31_258=='A') ) {
                                    int LA31_274 = input.LA(8);

                                    if ( (LA31_274=='L') ) {
                                        int LA31_282 = input.LA(9);

                                        if ( (LA31_282=='L') ) {
                                            int LA31_288 = input.LA(10);

                                            if ( (LA31_288=='Y') ) {
                                                int LA31_292 = input.LA(11);

                                                if ( ((LA31_292>='#' && LA31_292<='$')||LA31_292=='-'||(LA31_292>='0' && LA31_292<='9')||(LA31_292>='A' && LA31_292<='Z')||LA31_292=='\\'||LA31_292=='_'||(LA31_292>='a' && LA31_292<='z')) ) {
                                                    alt31=77;
                                                }
                                                else {
                                                    alt31=18;}
                                            }
                                            else {
                                                alt31=77;}
                                        }
                                        else {
                                            alt31=77;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=11;}

            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 'X':
                {
                int LA31_70 = input.LA(3);

                if ( ((LA31_70>='#' && LA31_70<='$')||LA31_70=='-'||(LA31_70>='0' && LA31_70<='9')||(LA31_70>='A' && LA31_70<='Z')||LA31_70=='\\'||LA31_70=='_'||(LA31_70>='a' && LA31_70<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=6;}
                }
                break;
            case 'F':
                {
                int LA31_71 = input.LA(3);

                if ( ((LA31_71>='#' && LA31_71<='$')||LA31_71=='-'||(LA31_71>='0' && LA31_71<='9')||(LA31_71>='A' && LA31_71<='Z')||LA31_71=='\\'||LA31_71=='_'||(LA31_71>='a' && LA31_71<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=8;}
                }
                break;
            case 'G':
                {
                int LA31_72 = input.LA(3);

                if ( ((LA31_72>='#' && LA31_72<='$')||LA31_72=='-'||(LA31_72>='0' && LA31_72<='9')||(LA31_72>='A' && LA31_72<='Z')||LA31_72=='\\'||LA31_72=='_'||(LA31_72>='a' && LA31_72<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=10;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'G':
                    {
                    int LA31_152 = input.LA(4);

                    if ( ((LA31_152>='#' && LA31_152<='$')||LA31_152=='-'||(LA31_152>='0' && LA31_152<='9')||(LA31_152>='A' && LA31_152<='Z')||LA31_152=='\\'||LA31_152=='_'||(LA31_152>='a' && LA31_152<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=17;}
                    }
                    break;
                case 'F':
                    {
                    int LA31_153 = input.LA(4);

                    if ( ((LA31_153>='#' && LA31_153<='$')||LA31_153=='-'||(LA31_153>='0' && LA31_153<='9')||(LA31_153>='A' && LA31_153<='Z')||LA31_153=='\\'||LA31_153=='_'||(LA31_153>='a' && LA31_153<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=15;}
                    }
                    break;
                default:
                    alt31=77;}

                }
                break;
            case 'L':
                {
                int LA31_74 = input.LA(3);

                if ( (LA31_74=='W') ) {
                    int LA31_154 = input.LA(4);

                    if ( (LA31_154=='A') ) {
                        int LA31_197 = input.LA(5);

                        if ( (LA31_197=='Y') ) {
                            int LA31_233 = input.LA(6);

                            if ( (LA31_233=='S') ) {
                                int LA31_259 = input.LA(7);

                                if ( ((LA31_259>='#' && LA31_259<='$')||LA31_259=='-'||(LA31_259>='0' && LA31_259<='9')||(LA31_259>='A' && LA31_259<='Z')||LA31_259=='\\'||LA31_259=='_'||(LA31_259>='a' && LA31_259<='z')) ) {
                                    alt31=77;
                                }
                                else {
                                    alt31=20;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'w':
                {
                int LA31_75 = input.LA(3);

                if ( (LA31_75=='a') ) {
                    int LA31_155 = input.LA(4);

                    if ( (LA31_155=='i') ) {
                        int LA31_198 = input.LA(5);

                        if ( (LA31_198=='t') ) {
                            int LA31_234 = input.LA(6);

                            if ( (LA31_234=='s') ) {
                                int LA31_260 = input.LA(7);

                                if ( ((LA31_260>='#' && LA31_260<='$')||LA31_260=='-'||(LA31_260>='0' && LA31_260<='9')||(LA31_260>='A' && LA31_260<='Z')||LA31_260=='\\'||LA31_260=='_'||(LA31_260>='a' && LA31_260<='z')) ) {
                                    alt31=77;
                                }
                                else {
                                    alt31=26;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=12;}

            }
            break;
        case 'B':
            {
            switch ( input.LA(2) ) {
            case 'U':
                {
                int LA31_77 = input.LA(3);

                if ( ((LA31_77>='#' && LA31_77<='$')||LA31_77=='-'||(LA31_77>='0' && LA31_77<='9')||(LA31_77>='A' && LA31_77<='Z')||LA31_77=='\\'||LA31_77=='_'||(LA31_77>='a' && LA31_77<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=13;}
                }
                break;
            case 'a':
                {
                int LA31_78 = input.LA(3);

                if ( (LA31_78=='c') ) {
                    int LA31_157 = input.LA(4);

                    if ( (LA31_157=='k') ) {
                        int LA31_199 = input.LA(5);

                        if ( (LA31_199=='t') ) {
                            int LA31_235 = input.LA(6);

                            if ( (LA31_235=='o') ) {
                                int LA31_261 = input.LA(7);

                                if ( ((LA31_261>='#' && LA31_261<='$')||LA31_261=='-'||(LA31_261>='0' && LA31_261<='9')||(LA31_261>='A' && LA31_261<='Z')||LA31_261=='\\'||LA31_261=='_'||(LA31_261>='a' && LA31_261<='z')) ) {
                                    alt31=77;
                                }
                                else {
                                    alt31=27;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            default:
                alt31=77;}

            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '<':
                {
                alt31=50;
                }
                break;
            case '=':
                {
                alt31=54;
                }
                break;
            case '>':
                {
                alt31=18;
                }
                break;
            case '-':
                {
                alt31=64;
                }
                break;
            case '_':
                {
                alt31=19;
                }
                break;
            default:
                alt31=56;}

            }
            break;
        case 'F':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA31_85 = input.LA(3);

                if ( (LA31_85=='N') ) {
                    int LA31_158 = input.LA(4);

                    if ( (LA31_158=='A') ) {
                        int LA31_200 = input.LA(5);

                        if ( (LA31_200=='L') ) {
                            int LA31_236 = input.LA(6);

                            if ( (LA31_236=='L') ) {
                                int LA31_262 = input.LA(7);

                                if ( (LA31_262=='Y') ) {
                                    int LA31_275 = input.LA(8);

                                    if ( ((LA31_275>='#' && LA31_275<='$')||LA31_275=='-'||(LA31_275>='0' && LA31_275<='9')||(LA31_275>='A' && LA31_275<='Z')||LA31_275=='\\'||LA31_275=='_'||(LA31_275>='a' && LA31_275<='z')) ) {
                                        alt31=77;
                                    }
                                    else {
                                        alt31=18;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case '\'':
                {
                alt31=75;
                }
                break;
            case 'A':
                {
                int LA31_87 = input.LA(3);

                if ( (LA31_87=='L') ) {
                    int LA31_159 = input.LA(4);

                    if ( (LA31_159=='S') ) {
                        int LA31_201 = input.LA(5);

                        if ( (LA31_201=='E') ) {
                            int LA31_237 = input.LA(6);

                            if ( ((LA31_237>='#' && LA31_237<='$')||LA31_237=='-'||(LA31_237>='0' && LA31_237<='9')||(LA31_237>='A' && LA31_237<='Z')||LA31_237=='\\'||LA31_237=='_'||(LA31_237>='a' && LA31_237<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=36;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=18;}

            }
            break;
        case 'O':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA31_88 = input.LA(3);

                if ( (LA31_88=='C') ) {
                    int LA31_160 = input.LA(4);

                    if ( (LA31_160=='E') ) {
                        int LA31_202 = input.LA(5);

                        if ( ((LA31_202>='#' && LA31_202<='$')||LA31_202=='-'||(LA31_202>='0' && LA31_202<='9')||(LA31_202>='A' && LA31_202<='Z')||LA31_202=='\\'||LA31_202=='_'||(LA31_202>='a' && LA31_202<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=19;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=19;}

            }
            break;
        case '[':
            {
            switch ( input.LA(2) ) {
            case ']':
                {
                alt31=20;
                }
                break;
            case '_':
                {
                alt31=21;
                }
                break;
            default:
                alt31=32;}

            }
            break;
        case 'G':
            {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA31_92 = input.LA(3);

                if ( (LA31_92=='O') ) {
                    int LA31_161 = input.LA(4);

                    if ( (LA31_161=='B') ) {
                        int LA31_203 = input.LA(5);

                        if ( (LA31_203=='A') ) {
                            int LA31_238 = input.LA(6);

                            if ( (LA31_238=='L') ) {
                                int LA31_264 = input.LA(7);

                                if ( (LA31_264=='L') ) {
                                    int LA31_276 = input.LA(8);

                                    if ( (LA31_276=='Y') ) {
                                        int LA31_283 = input.LA(9);

                                        if ( ((LA31_283>='#' && LA31_283<='$')||LA31_283=='-'||(LA31_283>='0' && LA31_283<='9')||(LA31_283>='A' && LA31_283<='Z')||LA31_283=='\\'||LA31_283=='_'||(LA31_283>='a' && LA31_283<='z')) ) {
                                            alt31=77;
                                        }
                                        else {
                                            alt31=20;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=20;}

            }
            break;
        case 'H':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA31_93 = input.LA(3);

                if ( (LA31_93=='S') ) {
                    int LA31_162 = input.LA(4);

                    if ( (LA31_162=='T') ) {
                        int LA31_204 = input.LA(5);

                        if ( (LA31_204=='O') ) {
                            int LA31_239 = input.LA(6);

                            if ( (LA31_239=='R') ) {
                                int LA31_265 = input.LA(7);

                                if ( (LA31_265=='I') ) {
                                    int LA31_277 = input.LA(8);

                                    if ( (LA31_277=='C') ) {
                                        int LA31_284 = input.LA(9);

                                        if ( (LA31_284=='A') ) {
                                            int LA31_289 = input.LA(10);

                                            if ( (LA31_289=='L') ) {
                                                int LA31_293 = input.LA(11);

                                                if ( (LA31_293=='L') ) {
                                                    int LA31_294 = input.LA(12);

                                                    if ( (LA31_294=='Y') ) {
                                                        int LA31_295 = input.LA(13);

                                                        if ( ((LA31_295>='#' && LA31_295<='$')||LA31_295=='-'||(LA31_295>='0' && LA31_295<='9')||(LA31_295>='A' && LA31_295<='Z')||LA31_295=='\\'||LA31_295=='_'||(LA31_295>='a' && LA31_295<='z')) ) {
                                                            alt31=77;
                                                        }
                                                        else {
                                                            alt31=21;}
                                                    }
                                                    else {
                                                        alt31=77;}
                                                }
                                                else {
                                                    alt31=77;}
                                            }
                                            else {
                                                alt31=77;}
                                        }
                                        else {
                                            alt31=77;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=21;}

            }
            break;
        case '(':
            {
            switch ( input.LA(2) ) {
            case ')':
                {
                alt31=22;
                }
                break;
            case '_':
                {
                alt31=23;
                }
                break;
            default:
                alt31=30;}

            }
            break;
        case 'X':
            {
            int LA31_15 = input.LA(2);

            if ( ((LA31_15>='#' && LA31_15<='$')||LA31_15=='-'||(LA31_15>='0' && LA31_15<='9')||(LA31_15>='A' && LA31_15<='Z')||LA31_15=='\\'||LA31_15=='_'||(LA31_15>='a' && LA31_15<='z')) ) {
                alt31=77;
            }
            else {
                alt31=22;}
            }
            break;
        case 'N':
            {
            int LA31_16 = input.LA(2);

            if ( (LA31_16=='E') ) {
                int LA31_97 = input.LA(3);

                if ( (LA31_97=='X') ) {
                    int LA31_163 = input.LA(4);

                    if ( (LA31_163=='T') ) {
                        int LA31_205 = input.LA(5);

                        if ( ((LA31_205>='#' && LA31_205<='$')||LA31_205=='-'||(LA31_205>='0' && LA31_205<='9')||(LA31_205>='A' && LA31_205<='Z')||LA31_205=='\\'||LA31_205=='_'||(LA31_205>='a' && LA31_205<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=22;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'Y':
            {
            int LA31_17 = input.LA(2);

            if ( ((LA31_17>='#' && LA31_17<='$')||LA31_17=='-'||(LA31_17>='0' && LA31_17<='9')||(LA31_17>='A' && LA31_17<='Z')||LA31_17=='\\'||LA31_17=='_'||(LA31_17>='a' && LA31_17<='z')) ) {
                alt31=77;
            }
            else {
                alt31=23;}
            }
            break;
        case 'P':
            {
            int LA31_18 = input.LA(2);

            if ( (LA31_18=='R') ) {
                int LA31_98 = input.LA(3);

                if ( (LA31_98=='E') ) {
                    int LA31_164 = input.LA(4);

                    if ( (LA31_164=='V') ) {
                        int LA31_206 = input.LA(5);

                        if ( ((LA31_206>='#' && LA31_206<='$')||LA31_206=='-'||(LA31_206>='0' && LA31_206<='9')||(LA31_206>='A' && LA31_206<='Z')||LA31_206=='\\'||LA31_206=='_'||(LA31_206>='a' && LA31_206<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=23;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'U':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA31_99 = input.LA(3);

                if ( (LA31_99=='t') ) {
                    int LA31_165 = input.LA(4);

                    if ( (LA31_165=='i') ) {
                        int LA31_207 = input.LA(5);

                        if ( (LA31_207=='l') ) {
                            int LA31_240 = input.LA(6);

                            if ( ((LA31_240>='#' && LA31_240<='$')||LA31_240=='-'||(LA31_240>='0' && LA31_240<='9')||(LA31_240>='A' && LA31_240<='Z')||LA31_240=='\\'||LA31_240=='_'||(LA31_240>='a' && LA31_240<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=24;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'N':
                {
                int LA31_100 = input.LA(3);

                if ( (LA31_100=='T') ) {
                    int LA31_166 = input.LA(4);

                    if ( (LA31_166=='I') ) {
                        int LA31_208 = input.LA(5);

                        if ( (LA31_208=='L') ) {
                            int LA31_241 = input.LA(6);

                            if ( ((LA31_241>='#' && LA31_241<='$')||LA31_241=='-'||(LA31_241>='0' && LA31_241<='9')||(LA31_241>='A' && LA31_241<='Z')||LA31_241=='\\'||LA31_241=='_'||(LA31_241>='a' && LA31_241<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=24;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=24;}

            }
            break;
        case 'V':
            {
            int LA31_20 = input.LA(2);

            if ( ((LA31_20>='#' && LA31_20<='$')||LA31_20=='-'||(LA31_20>='0' && LA31_20<='9')||(LA31_20>='A' && LA31_20<='Z')||LA31_20=='\\'||LA31_20=='_'||(LA31_20>='a' && LA31_20<='z')) ) {
                alt31=77;
            }
            else {
                alt31=26;}
            }
            break;
        case 'R':
            {
            int LA31_21 = input.LA(2);

            if ( (LA31_21=='E') ) {
                switch ( input.LA(3) ) {
                case 'A':
                    {
                    int LA31_167 = input.LA(4);

                    if ( (LA31_167=='D') ) {
                        int LA31_209 = input.LA(5);

                        if ( ((LA31_209>='#' && LA31_209<='$')||LA31_209=='-'||(LA31_209>='0' && LA31_209<='9')||(LA31_209>='A' && LA31_209<='Z')||LA31_209=='\\'||LA31_209=='_'||(LA31_209>='a' && LA31_209<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=41;}
                    }
                    else {
                        alt31=77;}
                    }
                    break;
                case 'L':
                    {
                    int LA31_168 = input.LA(4);

                    if ( (LA31_168=='E') ) {
                        int LA31_210 = input.LA(5);

                        if ( (LA31_210=='A') ) {
                            int LA31_243 = input.LA(6);

                            if ( (LA31_243=='S') ) {
                                int LA31_266 = input.LA(7);

                                if ( (LA31_266=='E') ) {
                                    int LA31_278 = input.LA(8);

                                    if ( (LA31_278=='S') ) {
                                        int LA31_285 = input.LA(9);

                                        if ( ((LA31_285>='#' && LA31_285<='$')||LA31_285=='-'||(LA31_285>='0' && LA31_285<='9')||(LA31_285>='A' && LA31_285<='Z')||LA31_285=='\\'||LA31_285=='_'||(LA31_285>='a' && LA31_285<='z')) ) {
                                            alt31=77;
                                        }
                                        else {
                                            alt31=26;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                    }
                    break;
                default:
                    alt31=77;}

            }
            else {
                alt31=77;}
            }
            break;
        case 'T':
            {
            switch ( input.LA(2) ) {
            case 'R':
                {
                switch ( input.LA(3) ) {
                case 'I':
                    {
                    int LA31_169 = input.LA(4);

                    if ( (LA31_169=='G') ) {
                        int LA31_211 = input.LA(5);

                        if ( (LA31_211=='G') ) {
                            int LA31_244 = input.LA(6);

                            if ( (LA31_244=='E') ) {
                                int LA31_267 = input.LA(7);

                                if ( (LA31_267=='R') ) {
                                    int LA31_279 = input.LA(8);

                                    if ( (LA31_279=='E') ) {
                                        int LA31_286 = input.LA(9);

                                        if ( (LA31_286=='D') ) {
                                            int LA31_290 = input.LA(10);

                                            if ( ((LA31_290>='#' && LA31_290<='$')||LA31_290=='-'||(LA31_290>='0' && LA31_290<='9')||(LA31_290>='A' && LA31_290<='Z')||LA31_290=='\\'||LA31_290=='_'||(LA31_290>='a' && LA31_290<='z')) ) {
                                                alt31=77;
                                            }
                                            else {
                                                alt31=27;}
                                        }
                                        else {
                                            alt31=77;}
                                    }
                                    else {
                                        alt31=77;}
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=77;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                    }
                    break;
                case 'U':
                    {
                    int LA31_170 = input.LA(4);

                    if ( (LA31_170=='E') ) {
                        int LA31_212 = input.LA(5);

                        if ( ((LA31_212>='#' && LA31_212<='$')||LA31_212=='-'||(LA31_212>='0' && LA31_212<='9')||(LA31_212>='A' && LA31_212<='Z')||LA31_212=='\\'||LA31_212=='_'||(LA31_212>='a' && LA31_212<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=37;}
                    }
                    else {
                        alt31=77;}
                    }
                    break;
                default:
                    alt31=77;}

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
                alt31=77;
                }
                break;
            default:
                alt31=27;}

            }
            break;
        case 'Z':
            {
            int LA31_23 = input.LA(2);

            if ( ((LA31_23>='#' && LA31_23<='$')||LA31_23=='-'||(LA31_23>='0' && LA31_23<='9')||(LA31_23>='A' && LA31_23<='Z')||LA31_23=='\\'||LA31_23=='_'||(LA31_23>='a' && LA31_23<='z')) ) {
                alt31=77;
            }
            else {
                alt31=28;}
            }
            break;
        case 'K':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA31_107 = input.LA(3);

                if ( (LA31_107=='O') ) {
                    int LA31_171 = input.LA(4);

                    if ( (LA31_171=='W') ) {
                        int LA31_213 = input.LA(5);

                        if ( ((LA31_213>='#' && LA31_213<='$')||LA31_213=='-'||(LA31_213>='0' && LA31_213<='9')||(LA31_213>='A' && LA31_213<='Z')||LA31_213=='\\'||LA31_213=='_'||(LA31_213>='a' && LA31_213<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=29;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'n':
                {
                int LA31_108 = input.LA(3);

                if ( (LA31_108=='o') ) {
                    int LA31_172 = input.LA(4);

                    if ( (LA31_172=='w') ) {
                        int LA31_214 = input.LA(5);

                        if ( ((LA31_214>='#' && LA31_214<='$')||LA31_214=='-'||(LA31_214>='0' && LA31_214<='9')||(LA31_214>='A' && LA31_214<='Z')||LA31_214=='\\'||LA31_214=='_'||(LA31_214>='a' && LA31_214<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=29;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
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
                alt31=77;
                }
                break;
            default:
                alt31=29;}

            }
            break;
        case ')':
            {
            alt31=31;
            }
            break;
        case ']':
            {
            alt31=33;
            }
            break;
        case '{':
            {
            alt31=34;
            }
            break;
        case '}':
            {
            alt31=35;
            }
            break;
        case 'w':
            {
            int LA31_29 = input.LA(2);

            if ( (LA31_29=='o') ) {
                int LA31_110 = input.LA(3);

                if ( (LA31_110=='r') ) {
                    int LA31_173 = input.LA(4);

                    if ( (LA31_173=='d') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA31_246 = input.LA(6);

                            if ( ((LA31_246>='#' && LA31_246<='$')||LA31_246=='-'||(LA31_246>='0' && LA31_246<='9')||(LA31_246>='A' && LA31_246<='Z')||LA31_246=='\\'||LA31_246=='_'||(LA31_246>='a' && LA31_246<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=38;}
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
                            alt31=77;
                            }
                            break;
                        default:
                            alt31=39;}

                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'W':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA31_111 = input.LA(3);

                if ( (LA31_111=='r') ) {
                    int LA31_174 = input.LA(4);

                    if ( (LA31_174=='d') ) {
                        int LA31_216 = input.LA(5);

                        if ( ((LA31_216>='#' && LA31_216<='$')||LA31_216=='-'||(LA31_216>='0' && LA31_216<='9')||(LA31_216>='A' && LA31_216<='Z')||LA31_216=='\\'||LA31_216=='_'||(LA31_216>='a' && LA31_216<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=39;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'R':
                {
                int LA31_112 = input.LA(3);

                if ( (LA31_112=='I') ) {
                    int LA31_175 = input.LA(4);

                    if ( (LA31_175=='T') ) {
                        int LA31_217 = input.LA(5);

                        if ( (LA31_217=='E') ) {
                            int LA31_248 = input.LA(6);

                            if ( ((LA31_248>='#' && LA31_248<='$')||LA31_248=='-'||(LA31_248>='0' && LA31_248<='9')||(LA31_248>='A' && LA31_248<='Z')||LA31_248=='\\'||LA31_248=='_'||(LA31_248>='a' && LA31_248<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=42;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            default:
                alt31=77;}

            }
            break;
        case 'b':
            {
            int LA31_31 = input.LA(2);

            if ( (LA31_31=='o') ) {
                int LA31_113 = input.LA(3);

                if ( (LA31_113=='o') ) {
                    int LA31_176 = input.LA(4);

                    if ( (LA31_176=='l') ) {
                        int LA31_218 = input.LA(5);

                        if ( ((LA31_218>='#' && LA31_218<='$')||LA31_218=='-'||(LA31_218>='0' && LA31_218<='9')||(LA31_218>='A' && LA31_218<='Z')||LA31_218=='\\'||LA31_218=='_'||(LA31_218>='a' && LA31_218<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=40;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'c':
            {
            int LA31_32 = input.LA(2);

            if ( (LA31_32=='a') ) {
                int LA31_114 = input.LA(3);

                if ( (LA31_114=='s') ) {
                    int LA31_177 = input.LA(4);

                    if ( (LA31_177=='e') ) {
                        int LA31_219 = input.LA(5);

                        if ( ((LA31_219>='#' && LA31_219<='$')||LA31_219=='-'||(LA31_219>='0' && LA31_219<='9')||(LA31_219>='A' && LA31_219<='Z')||LA31_219=='\\'||LA31_219=='_'||(LA31_219>='a' && LA31_219<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=43;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'e':
            {
            int LA31_33 = input.LA(2);

            if ( (LA31_33=='s') ) {
                int LA31_115 = input.LA(3);

                if ( (LA31_115=='a') ) {
                    int LA31_178 = input.LA(4);

                    if ( (LA31_178=='c') ) {
                        int LA31_220 = input.LA(5);

                        if ( ((LA31_220>='#' && LA31_220<='$')||LA31_220=='-'||(LA31_220>='0' && LA31_220<='9')||(LA31_220>='A' && LA31_220<='Z')||LA31_220=='\\'||LA31_220=='_'||(LA31_220>='a' && LA31_220<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=44;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case '+':
            {
            alt31=45;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt31=63;
                }
                break;
            case '-':
                {
                alt31=80;
                }
                break;
            default:
                alt31=46;}

            }
            break;
        case '*':
            {
            alt31=47;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt31=79;
                }
                break;
            case '/':
                {
                alt31=80;
                }
                break;
            default:
                alt31=48;}

            }
            break;
        case 'm':
            {
            int LA31_38 = input.LA(2);

            if ( (LA31_38=='o') ) {
                int LA31_121 = input.LA(3);

                if ( (LA31_121=='d') ) {
                    int LA31_179 = input.LA(4);

                    if ( ((LA31_179>='#' && LA31_179<='$')||LA31_179=='-'||(LA31_179>='0' && LA31_179<='9')||(LA31_179>='A' && LA31_179<='Z')||LA31_179=='\\'||LA31_179=='_'||(LA31_179>='a' && LA31_179<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=49;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt31=51;
                }
                break;
            case '=':
                {
                alt31=55;
                }
                break;
            default:
                alt31=57;}

            }
            break;
        case '=':
            {
            alt31=52;
            }
            break;
        case '!':
            {
            int LA31_41 = input.LA(2);

            if ( (LA31_41=='=') ) {
                alt31=53;
            }
            else {
                alt31=69;}
            }
            break;
        case 'n':
            {
            int LA31_42 = input.LA(2);

            if ( (LA31_42=='e') ) {
                int LA31_127 = input.LA(3);

                if ( (LA31_127=='x') ) {
                    int LA31_180 = input.LA(4);

                    if ( (LA31_180=='t') ) {
                        int LA31_222 = input.LA(5);

                        if ( ((LA31_222>='#' && LA31_222<='$')||LA31_222=='-'||(LA31_222>='0' && LA31_222<='9')||(LA31_222>='A' && LA31_222<='Z')||LA31_222=='\\'||LA31_222=='_'||(LA31_222>='a' && LA31_222<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=58;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'u':
            {
            int LA31_43 = input.LA(2);

            if ( (LA31_43=='n') ) {
                int LA31_128 = input.LA(3);

                if ( (LA31_128=='i') ) {
                    int LA31_181 = input.LA(4);

                    if ( (LA31_181=='o') ) {
                        int LA31_223 = input.LA(5);

                        if ( (LA31_223=='n') ) {
                            int LA31_253 = input.LA(6);

                            if ( ((LA31_253>='#' && LA31_253<='$')||LA31_253=='-'||(LA31_253>='0' && LA31_253<='9')||(LA31_253>='A' && LA31_253<='Z')||LA31_253=='\\'||LA31_253=='_'||(LA31_253>='a' && LA31_253<='z')) ) {
                                alt31=77;
                            }
                            else {
                                alt31=59;}
                        }
                        else {
                            alt31=77;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
            }
            else {
                alt31=77;}
            }
            break;
        case 'i':
            {
            int LA31_44 = input.LA(2);

            if ( (LA31_44=='n') ) {
                int LA31_129 = input.LA(3);

                if ( ((LA31_129>='#' && LA31_129<='$')||LA31_129=='-'||(LA31_129>='0' && LA31_129<='9')||(LA31_129>='A' && LA31_129<='Z')||LA31_129=='\\'||LA31_129=='_'||(LA31_129>='a' && LA31_129<='z')) ) {
                    alt31=77;
                }
                else {
                    alt31=60;}
            }
            else {
                alt31=77;}
            }
            break;
        case '.':
            {
            int LA31_45 = input.LA(2);

            if ( (LA31_45=='.') ) {
                alt31=61;
            }
            else {
                alt31=62;}
            }
            break;
        case '|':
            {
            alt31=65;
            }
            break;
        case '&':
            {
            alt31=66;
            }
            break;
        case 'x':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA31_132 = input.LA(3);

                if ( (LA31_132=='r') ) {
                    int LA31_183 = input.LA(4);

                    if ( ((LA31_183>='#' && LA31_183<='$')||LA31_183=='-'||(LA31_183>='0' && LA31_183<='9')||(LA31_183>='A' && LA31_183<='Z')||LA31_183=='\\'||LA31_183=='_'||(LA31_183>='a' && LA31_183<='z')) ) {
                        alt31=77;
                    }
                    else {
                        alt31=67;}
                }
                else {
                    alt31=77;}
                }
                break;
            case 'n':
                {
                int LA31_133 = input.LA(3);

                if ( (LA31_133=='o') ) {
                    int LA31_184 = input.LA(4);

                    if ( (LA31_184=='r') ) {
                        int LA31_225 = input.LA(5);

                        if ( ((LA31_225>='#' && LA31_225<='$')||LA31_225=='-'||(LA31_225>='0' && LA31_225<='9')||(LA31_225>='A' && LA31_225<='Z')||LA31_225=='\\'||LA31_225=='_'||(LA31_225>='a' && LA31_225<='z')) ) {
                            alt31=77;
                        }
                        else {
                            alt31=68;}
                    }
                    else {
                        alt31=77;}
                }
                else {
                    alt31=77;}
                }
                break;
            default:
                alt31=77;}

            }
            break;
        case ',':
            {
            alt31=70;
            }
            break;
        case ':':
            {
            int LA31_50 = input.LA(2);

            if ( (LA31_50==':') ) {
                alt31=73;
            }
            else {
                alt31=71;}
            }
            break;
        case ';':
            {
            alt31=72;
            }
            break;
        case '0':
            {
            int LA31_52 = input.LA(2);

            if ( (LA31_52=='B'||LA31_52=='D'||LA31_52=='H'||LA31_52=='O'||LA31_52=='b'||LA31_52=='d'||LA31_52=='h'||LA31_52=='o') ) {
                alt31=74;
            }
            else {
                alt31=76;}
            }
            break;
        case 'f':
            {
            int LA31_53 = input.LA(2);

            if ( (LA31_53=='\'') ) {
                alt31=75;
            }
            else {
                alt31=77;}
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
            alt31=76;
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
            alt31=77;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt31=78;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_KNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT );", 31, 0, input);

            throw nvae;
        }

        switch (alt31) {
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
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:329: TOK_LP
                {
                mTOK_LP(); 

                }
                break;
            case 31 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:336: TOK_RP
                {
                mTOK_RP(); 

                }
                break;
            case 32 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:343: TOK_LB
                {
                mTOK_LB(); 

                }
                break;
            case 33 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:350: TOK_RB
                {
                mTOK_RB(); 

                }
                break;
            case 34 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:357: TOK_LCB
                {
                mTOK_LCB(); 

                }
                break;
            case 35 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:365: TOK_RCB
                {
                mTOK_RCB(); 

                }
                break;
            case 36 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:373: TOK_FALSEEXP
                {
                mTOK_FALSEEXP(); 

                }
                break;
            case 37 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:386: TOK_TRUEEXP
                {
                mTOK_TRUEEXP(); 

                }
                break;
            case 38 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:398: TOK_WORD1
                {
                mTOK_WORD1(); 

                }
                break;
            case 39 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:408: TOK_WORD
                {
                mTOK_WORD(); 

                }
                break;
            case 40 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:417: TOK_BOOL
                {
                mTOK_BOOL(); 

                }
                break;
            case 41 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:426: TOK_WAREAD
                {
                mTOK_WAREAD(); 

                }
                break;
            case 42 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:437: TOK_WAWRITE
                {
                mTOK_WAWRITE(); 

                }
                break;
            case 43 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:449: TOK_CASE
                {
                mTOK_CASE(); 

                }
                break;
            case 44 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:458: TOK_ESAC
                {
                mTOK_ESAC(); 

                }
                break;
            case 45 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:467: TOK_PLUS
                {
                mTOK_PLUS(); 

                }
                break;
            case 46 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:476: TOK_MINUS
                {
                mTOK_MINUS(); 

                }
                break;
            case 47 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:486: TOK_TIMES
                {
                mTOK_TIMES(); 

                }
                break;
            case 48 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:496: TOK_DIVIDE
                {
                mTOK_DIVIDE(); 

                }
                break;
            case 49 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:507: TOK_MOD
                {
                mTOK_MOD(); 

                }
                break;
            case 50 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:515: TOK_LSHIFT
                {
                mTOK_LSHIFT(); 

                }
                break;
            case 51 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:526: TOK_RSHIFT
                {
                mTOK_RSHIFT(); 

                }
                break;
            case 52 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:537: TOK_EQUAL
                {
                mTOK_EQUAL(); 

                }
                break;
            case 53 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:547: TOK_NOTEQUAL
                {
                mTOK_NOTEQUAL(); 

                }
                break;
            case 54 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:560: TOK_LE
                {
                mTOK_LE(); 

                }
                break;
            case 55 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:567: TOK_GE
                {
                mTOK_GE(); 

                }
                break;
            case 56 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:574: TOK_LT
                {
                mTOK_LT(); 

                }
                break;
            case 57 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:581: TOK_GT
                {
                mTOK_GT(); 

                }
                break;
            case 58 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:588: TOK_NEXT
                {
                mTOK_NEXT(); 

                }
                break;
            case 59 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:597: TOK_UNION
                {
                mTOK_UNION(); 

                }
                break;
            case 60 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:607: TOK_SETIN
                {
                mTOK_SETIN(); 

                }
                break;
            case 61 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:617: TOK_TWODOTS
                {
                mTOK_TWODOTS(); 

                }
                break;
            case 62 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:629: TOK_DOT
                {
                mTOK_DOT(); 

                }
                break;
            case 63 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:637: TOK_IMPLIES
                {
                mTOK_IMPLIES(); 

                }
                break;
            case 64 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:649: TOK_IFF
                {
                mTOK_IFF(); 

                }
                break;
            case 65 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:657: TOK_OR
                {
                mTOK_OR(); 

                }
                break;
            case 66 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:664: TOK_AND
                {
                mTOK_AND(); 

                }
                break;
            case 67 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:672: TOK_XOR
                {
                mTOK_XOR(); 

                }
                break;
            case 68 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:680: TOK_XNOR
                {
                mTOK_XNOR(); 

                }
                break;
            case 69 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:689: TOK_NOT
                {
                mTOK_NOT(); 

                }
                break;
            case 70 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:697: TOK_COMMA
                {
                mTOK_COMMA(); 

                }
                break;
            case 71 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:707: TOK_COLON
                {
                mTOK_COLON(); 

                }
                break;
            case 72 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:717: TOK_SEMI
                {
                mTOK_SEMI(); 

                }
                break;
            case 73 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:726: TOK_CONCATENATION
                {
                mTOK_CONCATENATION(); 

                }
                break;
            case 74 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:744: TOK_NUMBER_WORD
                {
                mTOK_NUMBER_WORD(); 

                }
                break;
            case 75 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:760: TOK_NUMBER_FRAC
                {
                mTOK_NUMBER_FRAC(); 

                }
                break;
            case 76 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:776: TOK_NUMBER
                {
                mTOK_NUMBER(); 

                }
                break;
            case 77 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:787: TOK_ATOM
                {
                mTOK_ATOM(); 

                }
                break;
            case 78 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:796: JTOK_WS
                {
                mJTOK_WS(); 

                }
                break;
            case 79 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:804: JTOK_MULTI_COMMENT
                {
                mJTOK_MULTI_COMMENT(); 

                }
                break;
            case 80 :
                // /Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g:1:823: JTOK_LINE_COMMENT
                {
                mJTOK_LINE_COMMENT(); 

                }
                break;

        }

    }


 

}