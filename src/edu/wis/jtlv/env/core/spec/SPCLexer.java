// $ANTLR 3.0.1 G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g 2017-12-04 22:01:40

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
    public static final int Tokens=106;
    public static final int TOK_LP=53;
    public static final int TOK_LT=35;
    public static final int TOK_COLON=95;
    public static final int TOK_OP_BOUND_GLOBALLY=92;
    public static final int JTOK_MULTI_COMMENT=104;
    public static final int TOK_SETIN=39;
    public static final int SPEC_LIST_T=5;
    public static final int TOK_EQUAL=33;
    public static final int TOK_LB=73;
    public static final int TOK_TRUEEXP=100;
    public static final int TOK_BUNTIL=77;
    public static final int TOK_LE=37;
    public static final int TOK_UNTIL=74;
    public static final int TOK_OP_BOUND_FINALLY=91;
    public static final int TOK_DOT=93;
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
    public static final int TOK_SEMI=96;
    public static final int TOK_AA=72;
    public static final int TOK_NUMBER_FRAC=102;
    public static final int TOK_MINUS=48;
    public static final int TOK_NUMBER_WORD=97;
    public static final int TOK_IMPLIES=27;
    public static final int TOK_KNOW=78;
    public static final int TOK_AX=63;
    public static final int JTOK_WS=103;
    public static final int TOK_OP_GLOBALLY=87;
    public static final int TOK_FALSEEXP=99;
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
    public static final int TOK_TWODOTS=98;
    public static final int NOP=4;
    public static final int TOK_COMMA=43;
    public static final int TOK_UNION=40;
    public static final int TOK_NUMBER=94;
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
    public static final int JTOK_LINE_COMMENT=105;
    public static final int TOK_OP_HISTORICALLY=88;
    public static final int TOK_WORD1=56;
    public static final int TOK_CONCATENATION=51;
    public static final int TOK_NEXT=57;
    public static final int TOK_RELEASES=82;
    public static final int TOK_EX=62;
    public static final int TOK_MOD=46;
    public static final int TOK_WORD=101;
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
    public String getGrammarFileName() { return "G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g"; }

    // $ANTLR start TOK_CTL_SPEC
    public final void mTOK_CTL_SPEC() throws RecognitionException {
        try {
            int _type = TOK_CTL_SPEC;
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1416:17: ( 'CTLSPEC' | 'SPEC' )
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
                    new NoViableAltException("1416:1: TOK_CTL_SPEC : ( 'CTLSPEC' | 'SPEC' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1416:19: 'CTLSPEC'
                    {
                    match("CTLSPEC"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1416:31: 'SPEC'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1417:21: ( 'CTL*SPEC' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1417:23: 'CTL*SPEC'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1418:17: ( 'LTLSPEC' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1418:19: 'LTLSPEC'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1419:19: ( 'INVARSPEC' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1419:21: 'INVARSPEC'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1421:13: ( 'EX' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1421:15: 'EX'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1422:13: ( 'AX' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1422:15: 'AX'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1423:13: ( 'EF' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1423:15: 'EF'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1424:13: ( 'AF' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1424:15: 'AF'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1425:13: ( 'EG' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1425:15: 'EG'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1426:13: ( 'AG' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1426:15: 'AG'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1427:13: ( 'E' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1427:15: 'E'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1428:13: ( 'A' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1428:15: 'A'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1429:16: ( 'BU' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1429:18: 'BU'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1430:14: ( 'EBF' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1430:16: 'EBF'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1431:14: ( 'ABF' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1431:16: 'ABF'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1432:14: ( 'EBG' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1432:16: 'EBG'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1433:14: ( 'ABG' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1433:16: 'ABG'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1435:19: ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' )
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
                    new NoViableAltException("1435:1: TOK_OP_FINALLY : ( '<>' | 'F' | 'FINALLY' | 'EVENTUALLY' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1435:21: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1435:28: 'F'
                    {
                    match('F'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1435:34: 'FINALLY'
                    {
                    match("FINALLY"); 


                    }
                    break;
                case 4 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1435:46: 'EVENTUALLY'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1436:17: ( '<_>' | 'O' | 'ONCE' )
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
                    new NoViableAltException("1436:1: TOK_OP_ONCE : ( '<_>' | 'O' | 'ONCE' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1436:19: '<_>'
                    {
                    match("<_>"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1436:27: 'O'
                    {
                    match('O'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1436:33: 'ONCE'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1437:20: ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' )
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
                    new NoViableAltException("1437:1: TOK_OP_GLOBALLY : ( '[]' | 'G' | 'GLOBALLY' | 'ALWAYS' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1437:22: '[]'
                    {
                    match("[]"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1437:29: 'G'
                    {
                    match('G'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1437:35: 'GLOBALLY'
                    {
                    match("GLOBALLY"); 


                    }
                    break;
                case 4 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1437:48: 'ALWAYS'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1438:23: ( '[_]' | 'H' | 'HISTORICALLY' )
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
                    new NoViableAltException("1438:1: TOK_OP_HISTORICALLY : ( '[_]' | 'H' | 'HISTORICALLY' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1438:25: '[_]'
                    {
                    match("[_]"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1438:33: 'H'
                    {
                    match('H'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1438:39: 'HISTORICALLY'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1439:17: ( '()' | 'X' | 'NEXT' )
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
                    new NoViableAltException("1439:1: TOK_OP_NEXT : ( '()' | 'X' | 'NEXT' );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1439:19: '()'
                    {
                    match("()"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1439:26: 'X'
                    {
                    match('X'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1439:32: 'NEXT'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1440:17: ( '(_)' | 'Y' | 'PREV' )
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
                    new NoViableAltException("1440:1: TOK_OP_PREV : ( '(_)' | 'Y' | 'PREV' );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1440:19: '(_)'
                    {
                    match("(_)"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1440:27: 'Y'
                    {
                    match('Y'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1440:33: 'PREV'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1441:15: ( 'Until' | 'U' | 'UNTIL' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='U') ) {
                switch ( input.LA(2) ) {
                case 'N':
                    {
                    alt8=3;
                    }
                    break;
                case 'n':
                    {
                    alt8=1;
                    }
                    break;
                default:
                    alt8=2;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1441:1: TOK_UNTIL : ( 'Until' | 'U' | 'UNTIL' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1441:17: 'Until'
                    {
                    match("Until"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1441:27: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1441:33: 'UNTIL'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1442:15: ( 'Since' | 'S' | 'SINCE' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='S') ) {
                switch ( input.LA(2) ) {
                case 'I':
                    {
                    alt9=3;
                    }
                    break;
                case 'i':
                    {
                    alt9=1;
                    }
                    break;
                default:
                    alt9=2;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1442:1: TOK_SINCE : ( 'Since' | 'S' | 'SINCE' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1442:17: 'Since'
                    {
                    match("Since"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1442:27: 'S'
                    {
                    match('S'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1442:33: 'SINCE'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1443:17: ( 'Awaits' | 'V' | 'RELEASES' )
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
                    new NoViableAltException("1443:1: TOK_RELEASES : ( 'Awaits' | 'V' | 'RELEASES' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1443:19: 'Awaits'
                    {
                    match("Awaits"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1443:30: 'V'
                    {
                    match('V'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1443:36: 'RELEASES'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1444:18: ( 'Backto' | 'T' | 'TRIGGERED' )
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
                    new NoViableAltException("1444:1: TOK_TRIGGERED : ( 'Backto' | 'T' | 'TRIGGERED' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1444:20: 'Backto'
                    {
                    match("Backto"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1444:31: 'T'
                    {
                    match('T'); 

                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1444:37: 'TRIGGERED'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1445:21: ( 'Z' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1445:23: 'Z'
            {
            match('Z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_NOTPREVNOT

    // $ANTLR start TOK_OP_BOUND_FINALLY
    public final void mTOK_OP_BOUND_FINALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_BOUND_FINALLY;
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1447:24: ( 'BF' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1447:26: 'BF'
            {
            match("BF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_BOUND_FINALLY

    // $ANTLR start TOK_OP_BOUND_GLOBALLY
    public final void mTOK_OP_BOUND_GLOBALLY() throws RecognitionException {
        try {
            int _type = TOK_OP_BOUND_GLOBALLY;
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1448:25: ( 'BG' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1448:27: 'BG'
            {
            match("BG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOK_OP_BOUND_GLOBALLY

    // $ANTLR start TOK_KNOW
    public final void mTOK_KNOW() throws RecognitionException {
        try {
            int _type = TOK_KNOW;
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1451:13: ( 'K' | 'KNOW' | 'Know' )
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
                    new NoViableAltException("1451:1: TOK_KNOW : ( 'K' | 'KNOW' | 'Know' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1451:15: 'K'
                    {
                    match('K'); 

                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1451:21: 'KNOW'
                    {
                    match("KNOW"); 


                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1451:30: 'Know'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1452:14: ( 'SK' | 'SKNOW' | 'Sknow' )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='S') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='K') ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2=='N') ) {
                        alt13=2;
                    }
                    else {
                        alt13=1;}
                }
                else if ( (LA13_1=='k') ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1452:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1452:1: TOK_SKNOW : ( 'SK' | 'SKNOW' | 'Sknow' );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1452:16: 'SK'
                    {
                    match("SK"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1452:23: 'SKNOW'
                    {
                    match("SKNOW"); 


                    }
                    break;
                case 3 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1452:33: 'Sknow'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1457:13: ( '(' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1457:15: '('
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1458:13: ( ')' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1458:15: ')'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1459:13: ( '[' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1459:15: '['
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1460:13: ( ']' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1460:15: ']'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1461:14: ( '{' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1461:16: '{'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1462:14: ( '}' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1462:16: '}'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1463:17: ( 'FALSE' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1463:19: 'FALSE'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1464:17: ( 'TRUE' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1464:19: 'TRUE'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1468:15: ( 'word1' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1468:17: 'word1'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1469:14: ( 'word' | 'Word' )
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
                    new NoViableAltException("1469:1: TOK_WORD : ( 'word' | 'Word' );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1469:16: 'word'
                    {
                    match("word"); 


                    }
                    break;
                case 2 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1469:25: 'Word'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1470:14: ( 'bool' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1470:16: 'bool'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1471:16: ( 'READ' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1471:18: 'READ'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1472:17: ( 'WRITE' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1472:19: 'WRITE'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1474:14: ( 'case' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1474:16: 'case'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1475:14: ( 'esac' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1475:16: 'esac'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1476:14: ( '+' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1476:16: '+'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1477:15: ( '-' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1477:17: '-'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1478:15: ( '*' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1478:17: '*'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1479:16: ( '/' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1479:18: '/'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1480:14: ( 'mod' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1480:16: 'mod'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1481:16: ( '<<' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1481:18: '<<'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1482:16: ( '>>' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1482:18: '>>'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1485:15: ( '=' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1485:17: '='
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1486:17: ( '!=' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1486:19: '!='
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1487:13: ( '<=' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1487:15: '<='
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1488:13: ( '>=' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1488:15: '>='
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1489:13: ( '<' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1489:15: '<'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1490:13: ( '>' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1490:15: '>'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1491:14: ( 'next' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1491:16: 'next'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1493:15: ( 'union' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1493:17: 'union'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1494:15: ( 'in' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1494:17: 'in'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1495:17: ( '..' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1495:19: '..'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1496:14: ( '.' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1496:16: '.'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1499:17: ( '->' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1499:19: '->'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1500:14: ( '<->' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1500:16: '<->'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1501:13: ( '|' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1501:15: '|'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1502:14: ( '&' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1502:16: '&'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1503:14: ( 'xor' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1503:16: 'xor'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1504:14: ( 'xnor' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1504:16: 'xnor'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1505:14: ( '!' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1505:16: '!'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1507:15: ( ',' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1507:17: ','
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1508:15: ( ':' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1508:17: ':'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1509:14: ( ';' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1509:16: ';'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1510:21: ( '::' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1510:23: '::'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1519:21: ( '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )* )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1519:23: '0' ( 'b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H' ) ( '0' .. '9' )* '_' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
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

            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1519:75: ( '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1519:76: '0' .. '9'
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

            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1519:124: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:21: ( ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+ )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:23: ( 'f' | 'F' ) '\\'' ( '0' .. '9' )+ '/' ( '0' .. '9' )+
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:40: ( '0' .. '9' )+
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
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:41: '0' .. '9'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:56: ( '0' .. '9' )+
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
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1522:57: '0' .. '9'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1525:17: ( ( '0' .. '9' )+ )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1525:19: ( '0' .. '9' )+
            {
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1525:19: ( '0' .. '9' )+
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
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1525:20: '0' .. '9'
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1528:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )* )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1528:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1528:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\\\' | '$' | '#' | '-' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='#' && LA20_0<='$')||LA20_0=='-'||(LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='\\'||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1531:15: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1531:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1531:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1537:23: ( ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' ) )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1537:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            {
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1537:25: ( '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/' )
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1537:26: '/*' ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )* '*/'
            {
            match("/*"); 

            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1537:31: ( options {greedy=false; } : '\\r' | '\\n' | ~ ( '\\n' | '\\r' ) )*
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
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1540:9: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 2 :
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1541:13: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1542:13: ~ ( '\\n' | '\\r' )
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
            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:22: ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) )
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
                    new NoViableAltException("1546:1: JTOK_LINE_COMMENT : ( ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) | ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? ) );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:24: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:25: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("--"); 

                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:30: (~ ( '\\n' | '\\r' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFE')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:31: ~ ( '\\n' | '\\r' )
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

                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:46: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:47: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:47: ( '\\n' | '\\r' ( '\\n' )? )
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
                                    new NoViableAltException("1546:47: ( '\\n' | '\\r' ( '\\n' )? )", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:48: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:53: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:57: ( '\\n' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='\n') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1546:58: '\\n'
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
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    {
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )? )
                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:12: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    {
                    match("//"); 

                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:17: (~ ( '\\n' | '\\r' ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFE')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:18: ~ ( '\\n' | '\\r' )
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

                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:33: ( ( '\\n' | '\\r' ( '\\n' )? ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:34: ( '\\n' | '\\r' ( '\\n' )? )
                            {
                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:34: ( '\\n' | '\\r' ( '\\n' )? )
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
                                    new NoViableAltException("1547:34: ( '\\n' | '\\r' ( '\\n' )? )", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:35: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;
                                case 2 :
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:40: '\\r' ( '\\n' )?
                                    {
                                    match('\r'); 
                                    // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:44: ( '\\n' )?
                                    int alt28=2;
                                    int LA28_0 = input.LA(1);

                                    if ( (LA28_0=='\n') ) {
                                        alt28=1;
                                    }
                                    switch (alt28) {
                                        case 1 :
                                            // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1547:45: '\\n'
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
        // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:8: ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT )
        int alt32=83;
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
                        int LA32_195 = input.LA(5);

                        if ( (LA32_195=='P') ) {
                            int LA32_237 = input.LA(6);

                            if ( (LA32_237=='E') ) {
                                int LA32_268 = input.LA(7);

                                if ( (LA32_268=='C') ) {
                                    int LA32_284 = input.LA(8);

                                    if ( ((LA32_284>='#' && LA32_284<='$')||LA32_284=='-'||(LA32_284>='0' && LA32_284<='9')||(LA32_284>='A' && LA32_284<='Z')||LA32_284=='\\'||LA32_284=='_'||(LA32_284>='a' && LA32_284<='z')) ) {
                                        alt32=80;
                                    }
                                    else {
                                        alt32=1;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                        }
                        break;
                    default:
                        alt32=80;}

                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'S':
            {
            switch ( input.LA(2) ) {
            case 'P':
                {
                int LA32_58 = input.LA(3);

                if ( (LA32_58=='E') ) {
                    int LA32_142 = input.LA(4);

                    if ( (LA32_142=='C') ) {
                        int LA32_196 = input.LA(5);

                        if ( ((LA32_196>='#' && LA32_196<='$')||LA32_196=='-'||(LA32_196>='0' && LA32_196<='9')||(LA32_196>='A' && LA32_196<='Z')||LA32_196=='\\'||LA32_196=='_'||(LA32_196>='a' && LA32_196<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=1;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'i':
                {
                int LA32_59 = input.LA(3);

                if ( (LA32_59=='n') ) {
                    int LA32_143 = input.LA(4);

                    if ( (LA32_143=='c') ) {
                        int LA32_197 = input.LA(5);

                        if ( (LA32_197=='e') ) {
                            int LA32_239 = input.LA(6);

                            if ( ((LA32_239>='#' && LA32_239<='$')||LA32_239=='-'||(LA32_239>='0' && LA32_239<='9')||(LA32_239>='A' && LA32_239<='Z')||LA32_239=='\\'||LA32_239=='_'||(LA32_239>='a' && LA32_239<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=25;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'I':
                {
                int LA32_60 = input.LA(3);

                if ( (LA32_60=='N') ) {
                    int LA32_144 = input.LA(4);

                    if ( (LA32_144=='C') ) {
                        int LA32_198 = input.LA(5);

                        if ( (LA32_198=='E') ) {
                            int LA32_240 = input.LA(6);

                            if ( ((LA32_240>='#' && LA32_240<='$')||LA32_240=='-'||(LA32_240>='0' && LA32_240<='9')||(LA32_240>='A' && LA32_240<='Z')||LA32_240=='\\'||LA32_240=='_'||(LA32_240>='a' && LA32_240<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=25;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'K':
                {
                switch ( input.LA(3) ) {
                case 'N':
                    {
                    int LA32_145 = input.LA(4);

                    if ( (LA32_145=='O') ) {
                        int LA32_199 = input.LA(5);

                        if ( (LA32_199=='W') ) {
                            int LA32_241 = input.LA(6);

                            if ( ((LA32_241>='#' && LA32_241<='$')||LA32_241=='-'||(LA32_241>='0' && LA32_241<='9')||(LA32_241>='A' && LA32_241<='Z')||LA32_241=='\\'||LA32_241=='_'||(LA32_241>='a' && LA32_241<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=32;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
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
                    alt32=80;
                    }
                    break;
                default:
                    alt32=32;}

                }
                break;
            case 'k':
                {
                int LA32_62 = input.LA(3);

                if ( (LA32_62=='n') ) {
                    int LA32_147 = input.LA(4);

                    if ( (LA32_147=='o') ) {
                        int LA32_200 = input.LA(5);

                        if ( (LA32_200=='w') ) {
                            int LA32_242 = input.LA(6);

                            if ( ((LA32_242>='#' && LA32_242<='$')||LA32_242=='-'||(LA32_242>='0' && LA32_242<='9')||(LA32_242>='A' && LA32_242<='Z')||LA32_242=='\\'||LA32_242=='_'||(LA32_242>='a' && LA32_242<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=32;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                    int LA32_148 = input.LA(4);

                    if ( (LA32_148=='S') ) {
                        int LA32_201 = input.LA(5);

                        if ( (LA32_201=='P') ) {
                            int LA32_243 = input.LA(6);

                            if ( (LA32_243=='E') ) {
                                int LA32_269 = input.LA(7);

                                if ( (LA32_269=='C') ) {
                                    int LA32_285 = input.LA(8);

                                    if ( ((LA32_285>='#' && LA32_285<='$')||LA32_285=='-'||(LA32_285>='0' && LA32_285<='9')||(LA32_285>='A' && LA32_285<='Z')||LA32_285=='\\'||LA32_285=='_'||(LA32_285>='a' && LA32_285<='z')) ) {
                                        alt32=80;
                                    }
                                    else {
                                        alt32=3;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'I':
            {
            int LA32_4 = input.LA(2);

            if ( (LA32_4=='N') ) {
                int LA32_65 = input.LA(3);

                if ( (LA32_65=='V') ) {
                    int LA32_149 = input.LA(4);

                    if ( (LA32_149=='A') ) {
                        int LA32_202 = input.LA(5);

                        if ( (LA32_202=='R') ) {
                            int LA32_244 = input.LA(6);

                            if ( (LA32_244=='S') ) {
                                int LA32_270 = input.LA(7);

                                if ( (LA32_270=='P') ) {
                                    int LA32_286 = input.LA(8);

                                    if ( (LA32_286=='E') ) {
                                        int LA32_294 = input.LA(9);

                                        if ( (LA32_294=='C') ) {
                                            int LA32_300 = input.LA(10);

                                            if ( ((LA32_300>='#' && LA32_300<='$')||LA32_300=='-'||(LA32_300>='0' && LA32_300<='9')||(LA32_300>='A' && LA32_300<='Z')||LA32_300=='\\'||LA32_300=='_'||(LA32_300>='a' && LA32_300<='z')) ) {
                                                alt32=80;
                                            }
                                            else {
                                                alt32=4;}
                                        }
                                        else {
                                            alt32=80;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'E':
            {
            switch ( input.LA(2) ) {
            case 'X':
                {
                int LA32_66 = input.LA(3);

                if ( ((LA32_66>='#' && LA32_66<='$')||LA32_66=='-'||(LA32_66>='0' && LA32_66<='9')||(LA32_66>='A' && LA32_66<='Z')||LA32_66=='\\'||LA32_66=='_'||(LA32_66>='a' && LA32_66<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=5;}
                }
                break;
            case 'F':
                {
                int LA32_67 = input.LA(3);

                if ( ((LA32_67>='#' && LA32_67<='$')||LA32_67=='-'||(LA32_67>='0' && LA32_67<='9')||(LA32_67>='A' && LA32_67<='Z')||LA32_67=='\\'||LA32_67=='_'||(LA32_67>='a' && LA32_67<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=7;}
                }
                break;
            case 'G':
                {
                int LA32_68 = input.LA(3);

                if ( ((LA32_68>='#' && LA32_68<='$')||LA32_68=='-'||(LA32_68>='0' && LA32_68<='9')||(LA32_68>='A' && LA32_68<='Z')||LA32_68=='\\'||LA32_68=='_'||(LA32_68>='a' && LA32_68<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=9;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'G':
                    {
                    int LA32_153 = input.LA(4);

                    if ( ((LA32_153>='#' && LA32_153<='$')||LA32_153=='-'||(LA32_153>='0' && LA32_153<='9')||(LA32_153>='A' && LA32_153<='Z')||LA32_153=='\\'||LA32_153=='_'||(LA32_153>='a' && LA32_153<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=16;}
                    }
                    break;
                case 'F':
                    {
                    int LA32_154 = input.LA(4);

                    if ( ((LA32_154>='#' && LA32_154<='$')||LA32_154=='-'||(LA32_154>='0' && LA32_154<='9')||(LA32_154>='A' && LA32_154<='Z')||LA32_154=='\\'||LA32_154=='_'||(LA32_154>='a' && LA32_154<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=14;}
                    }
                    break;
                default:
                    alt32=80;}

                }
                break;
            case 'V':
                {
                int LA32_70 = input.LA(3);

                if ( (LA32_70=='E') ) {
                    int LA32_155 = input.LA(4);

                    if ( (LA32_155=='N') ) {
                        int LA32_205 = input.LA(5);

                        if ( (LA32_205=='T') ) {
                            int LA32_245 = input.LA(6);

                            if ( (LA32_245=='U') ) {
                                int LA32_271 = input.LA(7);

                                if ( (LA32_271=='A') ) {
                                    int LA32_287 = input.LA(8);

                                    if ( (LA32_287=='L') ) {
                                        int LA32_295 = input.LA(9);

                                        if ( (LA32_295=='L') ) {
                                            int LA32_301 = input.LA(10);

                                            if ( (LA32_301=='Y') ) {
                                                int LA32_305 = input.LA(11);

                                                if ( ((LA32_305>='#' && LA32_305<='$')||LA32_305=='-'||(LA32_305>='0' && LA32_305<='9')||(LA32_305>='A' && LA32_305<='Z')||LA32_305=='\\'||LA32_305=='_'||(LA32_305>='a' && LA32_305<='z')) ) {
                                                    alt32=80;
                                                }
                                                else {
                                                    alt32=18;}
                                            }
                                            else {
                                                alt32=80;}
                                        }
                                        else {
                                            alt32=80;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                    alt32=80;
                }
                else {
                    alt32=6;}
                }
                break;
            case 'F':
                {
                int LA32_73 = input.LA(3);

                if ( ((LA32_73>='#' && LA32_73<='$')||LA32_73=='-'||(LA32_73>='0' && LA32_73<='9')||(LA32_73>='A' && LA32_73<='Z')||LA32_73=='\\'||LA32_73=='_'||(LA32_73>='a' && LA32_73<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=8;}
                }
                break;
            case 'G':
                {
                int LA32_74 = input.LA(3);

                if ( ((LA32_74>='#' && LA32_74<='$')||LA32_74=='-'||(LA32_74>='0' && LA32_74<='9')||(LA32_74>='A' && LA32_74<='Z')||LA32_74=='\\'||LA32_74=='_'||(LA32_74>='a' && LA32_74<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=10;}
                }
                break;
            case 'B':
                {
                switch ( input.LA(3) ) {
                case 'G':
                    {
                    int LA32_159 = input.LA(4);

                    if ( ((LA32_159>='#' && LA32_159<='$')||LA32_159=='-'||(LA32_159>='0' && LA32_159<='9')||(LA32_159>='A' && LA32_159<='Z')||LA32_159=='\\'||LA32_159=='_'||(LA32_159>='a' && LA32_159<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=17;}
                    }
                    break;
                case 'F':
                    {
                    int LA32_160 = input.LA(4);

                    if ( ((LA32_160>='#' && LA32_160<='$')||LA32_160=='-'||(LA32_160>='0' && LA32_160<='9')||(LA32_160>='A' && LA32_160<='Z')||LA32_160=='\\'||LA32_160=='_'||(LA32_160>='a' && LA32_160<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=15;}
                    }
                    break;
                default:
                    alt32=80;}

                }
                break;
            case 'L':
                {
                int LA32_76 = input.LA(3);

                if ( (LA32_76=='W') ) {
                    int LA32_161 = input.LA(4);

                    if ( (LA32_161=='A') ) {
                        int LA32_208 = input.LA(5);

                        if ( (LA32_208=='Y') ) {
                            int LA32_246 = input.LA(6);

                            if ( (LA32_246=='S') ) {
                                int LA32_272 = input.LA(7);

                                if ( ((LA32_272>='#' && LA32_272<='$')||LA32_272=='-'||(LA32_272>='0' && LA32_272<='9')||(LA32_272>='A' && LA32_272<='Z')||LA32_272=='\\'||LA32_272=='_'||(LA32_272>='a' && LA32_272<='z')) ) {
                                    alt32=80;
                                }
                                else {
                                    alt32=20;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'w':
                {
                int LA32_77 = input.LA(3);

                if ( (LA32_77=='a') ) {
                    int LA32_162 = input.LA(4);

                    if ( (LA32_162=='i') ) {
                        int LA32_209 = input.LA(5);

                        if ( (LA32_209=='t') ) {
                            int LA32_247 = input.LA(6);

                            if ( (LA32_247=='s') ) {
                                int LA32_273 = input.LA(7);

                                if ( ((LA32_273>='#' && LA32_273<='$')||LA32_273=='-'||(LA32_273>='0' && LA32_273<='9')||(LA32_273>='A' && LA32_273<='Z')||LA32_273=='\\'||LA32_273=='_'||(LA32_273>='a' && LA32_273<='z')) ) {
                                    alt32=80;
                                }
                                else {
                                    alt32=26;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                    alt32=80;
                }
                else {
                    alt32=13;}
                }
                break;
            case 'a':
                {
                int LA32_80 = input.LA(3);

                if ( (LA32_80=='c') ) {
                    int LA32_164 = input.LA(4);

                    if ( (LA32_164=='k') ) {
                        int LA32_210 = input.LA(5);

                        if ( (LA32_210=='t') ) {
                            int LA32_248 = input.LA(6);

                            if ( (LA32_248=='o') ) {
                                int LA32_274 = input.LA(7);

                                if ( ((LA32_274>='#' && LA32_274<='$')||LA32_274=='-'||(LA32_274>='0' && LA32_274<='9')||(LA32_274>='A' && LA32_274<='Z')||LA32_274=='\\'||LA32_274=='_'||(LA32_274>='a' && LA32_274<='z')) ) {
                                    alt32=80;
                                }
                                else {
                                    alt32=27;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'F':
                {
                int LA32_81 = input.LA(3);

                if ( ((LA32_81>='#' && LA32_81<='$')||LA32_81=='-'||(LA32_81>='0' && LA32_81<='9')||(LA32_81>='A' && LA32_81<='Z')||LA32_81=='\\'||LA32_81=='_'||(LA32_81>='a' && LA32_81<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=29;}
                }
                break;
            case 'G':
                {
                int LA32_82 = input.LA(3);

                if ( ((LA32_82>='#' && LA32_82<='$')||LA32_82=='-'||(LA32_82>='0' && LA32_82<='9')||(LA32_82>='A' && LA32_82<='Z')||LA32_82=='\\'||LA32_82=='_'||(LA32_82>='a' && LA32_82<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=30;}
                }
                break;
            default:
                alt32=80;}

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
                alt32=53;
                }
                break;
            case '=':
                {
                alt32=57;
                }
                break;
            case '-':
                {
                alt32=67;
                }
                break;
            default:
                alt32=59;}

            }
            break;
        case 'F':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA32_89 = input.LA(3);

                if ( (LA32_89=='N') ) {
                    int LA32_167 = input.LA(4);

                    if ( (LA32_167=='A') ) {
                        int LA32_211 = input.LA(5);

                        if ( (LA32_211=='L') ) {
                            int LA32_249 = input.LA(6);

                            if ( (LA32_249=='L') ) {
                                int LA32_275 = input.LA(7);

                                if ( (LA32_275=='Y') ) {
                                    int LA32_288 = input.LA(8);

                                    if ( ((LA32_288>='#' && LA32_288<='$')||LA32_288=='-'||(LA32_288>='0' && LA32_288<='9')||(LA32_288>='A' && LA32_288<='Z')||LA32_288=='\\'||LA32_288=='_'||(LA32_288>='a' && LA32_288<='z')) ) {
                                        alt32=80;
                                    }
                                    else {
                                        alt32=18;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'A':
                {
                int LA32_90 = input.LA(3);

                if ( (LA32_90=='L') ) {
                    int LA32_168 = input.LA(4);

                    if ( (LA32_168=='S') ) {
                        int LA32_212 = input.LA(5);

                        if ( (LA32_212=='E') ) {
                            int LA32_250 = input.LA(6);

                            if ( ((LA32_250>='#' && LA32_250<='$')||LA32_250=='-'||(LA32_250>='0' && LA32_250<='9')||(LA32_250>='A' && LA32_250<='Z')||LA32_250=='\\'||LA32_250=='_'||(LA32_250>='a' && LA32_250<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=39;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case '\'':
                {
                alt32=78;
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
                alt32=80;
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
                int LA32_92 = input.LA(3);

                if ( (LA32_92=='C') ) {
                    int LA32_169 = input.LA(4);

                    if ( (LA32_169=='E') ) {
                        int LA32_213 = input.LA(5);

                        if ( ((LA32_213>='#' && LA32_213<='$')||LA32_213=='-'||(LA32_213>='0' && LA32_213<='9')||(LA32_213>='A' && LA32_213<='Z')||LA32_213=='\\'||LA32_213=='_'||(LA32_213>='a' && LA32_213<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=19;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                alt32=35;}

            }
            break;
        case 'G':
            {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA32_96 = input.LA(3);

                if ( (LA32_96=='O') ) {
                    int LA32_170 = input.LA(4);

                    if ( (LA32_170=='B') ) {
                        int LA32_214 = input.LA(5);

                        if ( (LA32_214=='A') ) {
                            int LA32_251 = input.LA(6);

                            if ( (LA32_251=='L') ) {
                                int LA32_277 = input.LA(7);

                                if ( (LA32_277=='L') ) {
                                    int LA32_289 = input.LA(8);

                                    if ( (LA32_289=='Y') ) {
                                        int LA32_296 = input.LA(9);

                                        if ( ((LA32_296>='#' && LA32_296<='$')||LA32_296=='-'||(LA32_296>='0' && LA32_296<='9')||(LA32_296>='A' && LA32_296<='Z')||LA32_296=='\\'||LA32_296=='_'||(LA32_296>='a' && LA32_296<='z')) ) {
                                            alt32=80;
                                        }
                                        else {
                                            alt32=20;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                int LA32_97 = input.LA(3);

                if ( (LA32_97=='S') ) {
                    int LA32_171 = input.LA(4);

                    if ( (LA32_171=='T') ) {
                        int LA32_215 = input.LA(5);

                        if ( (LA32_215=='O') ) {
                            int LA32_252 = input.LA(6);

                            if ( (LA32_252=='R') ) {
                                int LA32_278 = input.LA(7);

                                if ( (LA32_278=='I') ) {
                                    int LA32_290 = input.LA(8);

                                    if ( (LA32_290=='C') ) {
                                        int LA32_297 = input.LA(9);

                                        if ( (LA32_297=='A') ) {
                                            int LA32_302 = input.LA(10);

                                            if ( (LA32_302=='L') ) {
                                                int LA32_306 = input.LA(11);

                                                if ( (LA32_306=='L') ) {
                                                    int LA32_307 = input.LA(12);

                                                    if ( (LA32_307=='Y') ) {
                                                        int LA32_308 = input.LA(13);

                                                        if ( ((LA32_308>='#' && LA32_308<='$')||LA32_308=='-'||(LA32_308>='0' && LA32_308<='9')||(LA32_308>='A' && LA32_308<='Z')||LA32_308=='\\'||LA32_308=='_'||(LA32_308>='a' && LA32_308<='z')) ) {
                                                            alt32=80;
                                                        }
                                                        else {
                                                            alt32=21;}
                                                    }
                                                    else {
                                                        alt32=80;}
                                                }
                                                else {
                                                    alt32=80;}
                                            }
                                            else {
                                                alt32=80;}
                                        }
                                        else {
                                            alt32=80;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                alt32=33;}

            }
            break;
        case 'X':
            {
            int LA32_15 = input.LA(2);

            if ( ((LA32_15>='#' && LA32_15<='$')||LA32_15=='-'||(LA32_15>='0' && LA32_15<='9')||(LA32_15>='A' && LA32_15<='Z')||LA32_15=='\\'||LA32_15=='_'||(LA32_15>='a' && LA32_15<='z')) ) {
                alt32=80;
            }
            else {
                alt32=22;}
            }
            break;
        case 'N':
            {
            int LA32_16 = input.LA(2);

            if ( (LA32_16=='E') ) {
                int LA32_101 = input.LA(3);

                if ( (LA32_101=='X') ) {
                    int LA32_172 = input.LA(4);

                    if ( (LA32_172=='T') ) {
                        int LA32_216 = input.LA(5);

                        if ( ((LA32_216>='#' && LA32_216<='$')||LA32_216=='-'||(LA32_216>='0' && LA32_216<='9')||(LA32_216>='A' && LA32_216<='Z')||LA32_216=='\\'||LA32_216=='_'||(LA32_216>='a' && LA32_216<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=22;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'Y':
            {
            int LA32_17 = input.LA(2);

            if ( ((LA32_17>='#' && LA32_17<='$')||LA32_17=='-'||(LA32_17>='0' && LA32_17<='9')||(LA32_17>='A' && LA32_17<='Z')||LA32_17=='\\'||LA32_17=='_'||(LA32_17>='a' && LA32_17<='z')) ) {
                alt32=80;
            }
            else {
                alt32=23;}
            }
            break;
        case 'P':
            {
            int LA32_18 = input.LA(2);

            if ( (LA32_18=='R') ) {
                int LA32_102 = input.LA(3);

                if ( (LA32_102=='E') ) {
                    int LA32_173 = input.LA(4);

                    if ( (LA32_173=='V') ) {
                        int LA32_217 = input.LA(5);

                        if ( ((LA32_217>='#' && LA32_217<='$')||LA32_217=='-'||(LA32_217>='0' && LA32_217<='9')||(LA32_217>='A' && LA32_217<='Z')||LA32_217=='\\'||LA32_217=='_'||(LA32_217>='a' && LA32_217<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=23;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'U':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA32_103 = input.LA(3);

                if ( (LA32_103=='t') ) {
                    int LA32_174 = input.LA(4);

                    if ( (LA32_174=='i') ) {
                        int LA32_218 = input.LA(5);

                        if ( (LA32_218=='l') ) {
                            int LA32_253 = input.LA(6);

                            if ( ((LA32_253>='#' && LA32_253<='$')||LA32_253=='-'||(LA32_253>='0' && LA32_253<='9')||(LA32_253>='A' && LA32_253<='Z')||LA32_253=='\\'||LA32_253=='_'||(LA32_253>='a' && LA32_253<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=24;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'N':
                {
                int LA32_104 = input.LA(3);

                if ( (LA32_104=='T') ) {
                    int LA32_175 = input.LA(4);

                    if ( (LA32_175=='I') ) {
                        int LA32_219 = input.LA(5);

                        if ( (LA32_219=='L') ) {
                            int LA32_254 = input.LA(6);

                            if ( ((LA32_254>='#' && LA32_254<='$')||LA32_254=='-'||(LA32_254>='0' && LA32_254<='9')||(LA32_254>='A' && LA32_254<='Z')||LA32_254=='\\'||LA32_254=='_'||(LA32_254>='a' && LA32_254<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=24;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
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
                alt32=80;
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
                    int LA32_176 = input.LA(4);

                    if ( (LA32_176=='E') ) {
                        int LA32_220 = input.LA(5);

                        if ( (LA32_220=='A') ) {
                            int LA32_255 = input.LA(6);

                            if ( (LA32_255=='S') ) {
                                int LA32_279 = input.LA(7);

                                if ( (LA32_279=='E') ) {
                                    int LA32_291 = input.LA(8);

                                    if ( (LA32_291=='S') ) {
                                        int LA32_298 = input.LA(9);

                                        if ( ((LA32_298>='#' && LA32_298<='$')||LA32_298=='-'||(LA32_298>='0' && LA32_298<='9')||(LA32_298>='A' && LA32_298<='Z')||LA32_298=='\\'||LA32_298=='_'||(LA32_298>='a' && LA32_298<='z')) ) {
                                            alt32=80;
                                        }
                                        else {
                                            alt32=26;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                    }
                    break;
                case 'A':
                    {
                    int LA32_177 = input.LA(4);

                    if ( (LA32_177=='D') ) {
                        int LA32_221 = input.LA(5);

                        if ( ((LA32_221>='#' && LA32_221<='$')||LA32_221=='-'||(LA32_221>='0' && LA32_221<='9')||(LA32_221>='A' && LA32_221<='Z')||LA32_221=='\\'||LA32_221=='_'||(LA32_221>='a' && LA32_221<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=44;}
                    }
                    else {
                        alt32=80;}
                    }
                    break;
                default:
                    alt32=80;}

            }
            else {
                alt32=80;}
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
                    int LA32_178 = input.LA(4);

                    if ( (LA32_178=='E') ) {
                        int LA32_222 = input.LA(5);

                        if ( ((LA32_222>='#' && LA32_222<='$')||LA32_222=='-'||(LA32_222>='0' && LA32_222<='9')||(LA32_222>='A' && LA32_222<='Z')||LA32_222=='\\'||LA32_222=='_'||(LA32_222>='a' && LA32_222<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=40;}
                    }
                    else {
                        alt32=80;}
                    }
                    break;
                case 'I':
                    {
                    int LA32_179 = input.LA(4);

                    if ( (LA32_179=='G') ) {
                        int LA32_223 = input.LA(5);

                        if ( (LA32_223=='G') ) {
                            int LA32_258 = input.LA(6);

                            if ( (LA32_258=='E') ) {
                                int LA32_280 = input.LA(7);

                                if ( (LA32_280=='R') ) {
                                    int LA32_292 = input.LA(8);

                                    if ( (LA32_292=='E') ) {
                                        int LA32_299 = input.LA(9);

                                        if ( (LA32_299=='D') ) {
                                            int LA32_303 = input.LA(10);

                                            if ( ((LA32_303>='#' && LA32_303<='$')||LA32_303=='-'||(LA32_303>='0' && LA32_303<='9')||(LA32_303>='A' && LA32_303<='Z')||LA32_303=='\\'||LA32_303=='_'||(LA32_303>='a' && LA32_303<='z')) ) {
                                                alt32=80;
                                            }
                                            else {
                                                alt32=27;}
                                        }
                                        else {
                                            alt32=80;}
                                    }
                                    else {
                                        alt32=80;}
                                }
                                else {
                                    alt32=80;}
                            }
                            else {
                                alt32=80;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                    }
                    break;
                default:
                    alt32=80;}

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
                alt32=80;
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
                alt32=80;
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
                int LA32_111 = input.LA(3);

                if ( (LA32_111=='O') ) {
                    int LA32_180 = input.LA(4);

                    if ( (LA32_180=='W') ) {
                        int LA32_224 = input.LA(5);

                        if ( ((LA32_224>='#' && LA32_224<='$')||LA32_224=='-'||(LA32_224>='0' && LA32_224<='9')||(LA32_224>='A' && LA32_224<='Z')||LA32_224=='\\'||LA32_224=='_'||(LA32_224>='a' && LA32_224<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=31;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'n':
                {
                int LA32_112 = input.LA(3);

                if ( (LA32_112=='o') ) {
                    int LA32_181 = input.LA(4);

                    if ( (LA32_181=='w') ) {
                        int LA32_225 = input.LA(5);

                        if ( ((LA32_225>='#' && LA32_225<='$')||LA32_225=='-'||(LA32_225>='0' && LA32_225<='9')||(LA32_225>='A' && LA32_225<='Z')||LA32_225=='\\'||LA32_225=='_'||(LA32_225>='a' && LA32_225<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=31;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
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
                alt32=80;
                }
                break;
            default:
                alt32=31;}

            }
            break;
        case ')':
            {
            alt32=34;
            }
            break;
        case ']':
            {
            alt32=36;
            }
            break;
        case '{':
            {
            alt32=37;
            }
            break;
        case '}':
            {
            alt32=38;
            }
            break;
        case 'w':
            {
            int LA32_29 = input.LA(2);

            if ( (LA32_29=='o') ) {
                int LA32_114 = input.LA(3);

                if ( (LA32_114=='r') ) {
                    int LA32_182 = input.LA(4);

                    if ( (LA32_182=='d') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA32_259 = input.LA(6);

                            if ( ((LA32_259>='#' && LA32_259<='$')||LA32_259=='-'||(LA32_259>='0' && LA32_259<='9')||(LA32_259>='A' && LA32_259<='Z')||LA32_259=='\\'||LA32_259=='_'||(LA32_259>='a' && LA32_259<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=41;}
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
                            alt32=80;
                            }
                            break;
                        default:
                            alt32=42;}

                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'W':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_115 = input.LA(3);

                if ( (LA32_115=='r') ) {
                    int LA32_183 = input.LA(4);

                    if ( (LA32_183=='d') ) {
                        int LA32_227 = input.LA(5);

                        if ( ((LA32_227>='#' && LA32_227<='$')||LA32_227=='-'||(LA32_227>='0' && LA32_227<='9')||(LA32_227>='A' && LA32_227<='Z')||LA32_227=='\\'||LA32_227=='_'||(LA32_227>='a' && LA32_227<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=42;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'R':
                {
                int LA32_116 = input.LA(3);

                if ( (LA32_116=='I') ) {
                    int LA32_184 = input.LA(4);

                    if ( (LA32_184=='T') ) {
                        int LA32_228 = input.LA(5);

                        if ( (LA32_228=='E') ) {
                            int LA32_261 = input.LA(6);

                            if ( ((LA32_261>='#' && LA32_261<='$')||LA32_261=='-'||(LA32_261>='0' && LA32_261<='9')||(LA32_261>='A' && LA32_261<='Z')||LA32_261=='\\'||LA32_261=='_'||(LA32_261>='a' && LA32_261<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=45;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            default:
                alt32=80;}

            }
            break;
        case 'b':
            {
            int LA32_31 = input.LA(2);

            if ( (LA32_31=='o') ) {
                int LA32_117 = input.LA(3);

                if ( (LA32_117=='o') ) {
                    int LA32_185 = input.LA(4);

                    if ( (LA32_185=='l') ) {
                        int LA32_229 = input.LA(5);

                        if ( ((LA32_229>='#' && LA32_229<='$')||LA32_229=='-'||(LA32_229>='0' && LA32_229<='9')||(LA32_229>='A' && LA32_229<='Z')||LA32_229=='\\'||LA32_229=='_'||(LA32_229>='a' && LA32_229<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=43;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'c':
            {
            int LA32_32 = input.LA(2);

            if ( (LA32_32=='a') ) {
                int LA32_118 = input.LA(3);

                if ( (LA32_118=='s') ) {
                    int LA32_186 = input.LA(4);

                    if ( (LA32_186=='e') ) {
                        int LA32_230 = input.LA(5);

                        if ( ((LA32_230>='#' && LA32_230<='$')||LA32_230=='-'||(LA32_230>='0' && LA32_230<='9')||(LA32_230>='A' && LA32_230<='Z')||LA32_230=='\\'||LA32_230=='_'||(LA32_230>='a' && LA32_230<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=46;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'e':
            {
            int LA32_33 = input.LA(2);

            if ( (LA32_33=='s') ) {
                int LA32_119 = input.LA(3);

                if ( (LA32_119=='a') ) {
                    int LA32_187 = input.LA(4);

                    if ( (LA32_187=='c') ) {
                        int LA32_231 = input.LA(5);

                        if ( ((LA32_231>='#' && LA32_231<='$')||LA32_231=='-'||(LA32_231>='0' && LA32_231<='9')||(LA32_231>='A' && LA32_231<='Z')||LA32_231=='\\'||LA32_231=='_'||(LA32_231>='a' && LA32_231<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=47;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case '+':
            {
            alt32=48;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt32=66;
                }
                break;
            case '-':
                {
                alt32=83;
                }
                break;
            default:
                alt32=49;}

            }
            break;
        case '*':
            {
            alt32=50;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt32=82;
                }
                break;
            case '/':
                {
                alt32=83;
                }
                break;
            default:
                alt32=51;}

            }
            break;
        case 'm':
            {
            int LA32_38 = input.LA(2);

            if ( (LA32_38=='o') ) {
                int LA32_125 = input.LA(3);

                if ( (LA32_125=='d') ) {
                    int LA32_188 = input.LA(4);

                    if ( ((LA32_188>='#' && LA32_188<='$')||LA32_188=='-'||(LA32_188>='0' && LA32_188<='9')||(LA32_188>='A' && LA32_188<='Z')||LA32_188=='\\'||LA32_188=='_'||(LA32_188>='a' && LA32_188<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=52;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt32=54;
                }
                break;
            case '=':
                {
                alt32=58;
                }
                break;
            default:
                alt32=60;}

            }
            break;
        case '=':
            {
            alt32=55;
            }
            break;
        case '!':
            {
            int LA32_41 = input.LA(2);

            if ( (LA32_41=='=') ) {
                alt32=56;
            }
            else {
                alt32=72;}
            }
            break;
        case 'n':
            {
            int LA32_42 = input.LA(2);

            if ( (LA32_42=='e') ) {
                int LA32_131 = input.LA(3);

                if ( (LA32_131=='x') ) {
                    int LA32_189 = input.LA(4);

                    if ( (LA32_189=='t') ) {
                        int LA32_233 = input.LA(5);

                        if ( ((LA32_233>='#' && LA32_233<='$')||LA32_233=='-'||(LA32_233>='0' && LA32_233<='9')||(LA32_233>='A' && LA32_233<='Z')||LA32_233=='\\'||LA32_233=='_'||(LA32_233>='a' && LA32_233<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=61;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'u':
            {
            int LA32_43 = input.LA(2);

            if ( (LA32_43=='n') ) {
                int LA32_132 = input.LA(3);

                if ( (LA32_132=='i') ) {
                    int LA32_190 = input.LA(4);

                    if ( (LA32_190=='o') ) {
                        int LA32_234 = input.LA(5);

                        if ( (LA32_234=='n') ) {
                            int LA32_266 = input.LA(6);

                            if ( ((LA32_266>='#' && LA32_266<='$')||LA32_266=='-'||(LA32_266>='0' && LA32_266<='9')||(LA32_266>='A' && LA32_266<='Z')||LA32_266=='\\'||LA32_266=='_'||(LA32_266>='a' && LA32_266<='z')) ) {
                                alt32=80;
                            }
                            else {
                                alt32=62;}
                        }
                        else {
                            alt32=80;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
            }
            else {
                alt32=80;}
            }
            break;
        case 'i':
            {
            int LA32_44 = input.LA(2);

            if ( (LA32_44=='n') ) {
                int LA32_133 = input.LA(3);

                if ( ((LA32_133>='#' && LA32_133<='$')||LA32_133=='-'||(LA32_133>='0' && LA32_133<='9')||(LA32_133>='A' && LA32_133<='Z')||LA32_133=='\\'||LA32_133=='_'||(LA32_133>='a' && LA32_133<='z')) ) {
                    alt32=80;
                }
                else {
                    alt32=63;}
            }
            else {
                alt32=80;}
            }
            break;
        case '.':
            {
            int LA32_45 = input.LA(2);

            if ( (LA32_45=='.') ) {
                alt32=64;
            }
            else {
                alt32=65;}
            }
            break;
        case '|':
            {
            alt32=68;
            }
            break;
        case '&':
            {
            alt32=69;
            }
            break;
        case 'x':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA32_136 = input.LA(3);

                if ( (LA32_136=='r') ) {
                    int LA32_192 = input.LA(4);

                    if ( ((LA32_192>='#' && LA32_192<='$')||LA32_192=='-'||(LA32_192>='0' && LA32_192<='9')||(LA32_192>='A' && LA32_192<='Z')||LA32_192=='\\'||LA32_192=='_'||(LA32_192>='a' && LA32_192<='z')) ) {
                        alt32=80;
                    }
                    else {
                        alt32=70;}
                }
                else {
                    alt32=80;}
                }
                break;
            case 'n':
                {
                int LA32_137 = input.LA(3);

                if ( (LA32_137=='o') ) {
                    int LA32_193 = input.LA(4);

                    if ( (LA32_193=='r') ) {
                        int LA32_236 = input.LA(5);

                        if ( ((LA32_236>='#' && LA32_236<='$')||LA32_236=='-'||(LA32_236>='0' && LA32_236<='9')||(LA32_236>='A' && LA32_236<='Z')||LA32_236=='\\'||LA32_236=='_'||(LA32_236>='a' && LA32_236<='z')) ) {
                            alt32=80;
                        }
                        else {
                            alt32=71;}
                    }
                    else {
                        alt32=80;}
                }
                else {
                    alt32=80;}
                }
                break;
            default:
                alt32=80;}

            }
            break;
        case ',':
            {
            alt32=73;
            }
            break;
        case ':':
            {
            int LA32_50 = input.LA(2);

            if ( (LA32_50==':') ) {
                alt32=76;
            }
            else {
                alt32=74;}
            }
            break;
        case ';':
            {
            alt32=75;
            }
            break;
        case '0':
            {
            int LA32_52 = input.LA(2);

            if ( (LA32_52=='B'||LA32_52=='D'||LA32_52=='H'||LA32_52=='O'||LA32_52=='b'||LA32_52=='d'||LA32_52=='h'||LA32_52=='o') ) {
                alt32=77;
            }
            else {
                alt32=79;}
            }
            break;
        case 'f':
            {
            int LA32_53 = input.LA(2);

            if ( (LA32_53=='\'') ) {
                alt32=78;
            }
            else {
                alt32=80;}
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
            alt32=79;
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
            alt32=80;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt32=81;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( TOK_CTL_SPEC | TOK_CTL_STAR_SPEC | TOK_LTL_SPEC | TOK_INVAR_SPEC | TOK_EX | TOK_AX | TOK_EF | TOK_AF | TOK_EG | TOK_AG | TOK_EE | TOK_AA | TOK_BUNTIL | TOK_EBF | TOK_ABF | TOK_EBG | TOK_ABG | TOK_OP_FINALLY | TOK_OP_ONCE | TOK_OP_GLOBALLY | TOK_OP_HISTORICALLY | TOK_OP_NEXT | TOK_OP_PREV | TOK_UNTIL | TOK_SINCE | TOK_RELEASES | TOK_TRIGGERED | TOK_OP_NOTPREVNOT | TOK_OP_BOUND_FINALLY | TOK_OP_BOUND_GLOBALLY | TOK_KNOW | TOK_SKNOW | TOK_LP | TOK_RP | TOK_LB | TOK_RB | TOK_LCB | TOK_RCB | TOK_FALSEEXP | TOK_TRUEEXP | TOK_WORD1 | TOK_WORD | TOK_BOOL | TOK_WAREAD | TOK_WAWRITE | TOK_CASE | TOK_ESAC | TOK_PLUS | TOK_MINUS | TOK_TIMES | TOK_DIVIDE | TOK_MOD | TOK_LSHIFT | TOK_RSHIFT | TOK_EQUAL | TOK_NOTEQUAL | TOK_LE | TOK_GE | TOK_LT | TOK_GT | TOK_NEXT | TOK_UNION | TOK_SETIN | TOK_TWODOTS | TOK_DOT | TOK_IMPLIES | TOK_IFF | TOK_OR | TOK_AND | TOK_XOR | TOK_XNOR | TOK_NOT | TOK_COMMA | TOK_COLON | TOK_SEMI | TOK_CONCATENATION | TOK_NUMBER_WORD | TOK_NUMBER_FRAC | TOK_NUMBER | TOK_ATOM | JTOK_WS | JTOK_MULTI_COMMENT | JTOK_LINE_COMMENT );", 32, 0, input);

            throw nvae;
        }

        switch (alt32) {
            case 1 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:10: TOK_CTL_SPEC
                {
                mTOK_CTL_SPEC(); 

                }
                break;
            case 2 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:23: TOK_CTL_STAR_SPEC
                {
                mTOK_CTL_STAR_SPEC(); 

                }
                break;
            case 3 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:41: TOK_LTL_SPEC
                {
                mTOK_LTL_SPEC(); 

                }
                break;
            case 4 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:54: TOK_INVAR_SPEC
                {
                mTOK_INVAR_SPEC(); 

                }
                break;
            case 5 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:69: TOK_EX
                {
                mTOK_EX(); 

                }
                break;
            case 6 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:76: TOK_AX
                {
                mTOK_AX(); 

                }
                break;
            case 7 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:83: TOK_EF
                {
                mTOK_EF(); 

                }
                break;
            case 8 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:90: TOK_AF
                {
                mTOK_AF(); 

                }
                break;
            case 9 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:97: TOK_EG
                {
                mTOK_EG(); 

                }
                break;
            case 10 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:104: TOK_AG
                {
                mTOK_AG(); 

                }
                break;
            case 11 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:111: TOK_EE
                {
                mTOK_EE(); 

                }
                break;
            case 12 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:118: TOK_AA
                {
                mTOK_AA(); 

                }
                break;
            case 13 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:125: TOK_BUNTIL
                {
                mTOK_BUNTIL(); 

                }
                break;
            case 14 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:136: TOK_EBF
                {
                mTOK_EBF(); 

                }
                break;
            case 15 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:144: TOK_ABF
                {
                mTOK_ABF(); 

                }
                break;
            case 16 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:152: TOK_EBG
                {
                mTOK_EBG(); 

                }
                break;
            case 17 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:160: TOK_ABG
                {
                mTOK_ABG(); 

                }
                break;
            case 18 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:168: TOK_OP_FINALLY
                {
                mTOK_OP_FINALLY(); 

                }
                break;
            case 19 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:183: TOK_OP_ONCE
                {
                mTOK_OP_ONCE(); 

                }
                break;
            case 20 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:195: TOK_OP_GLOBALLY
                {
                mTOK_OP_GLOBALLY(); 

                }
                break;
            case 21 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:211: TOK_OP_HISTORICALLY
                {
                mTOK_OP_HISTORICALLY(); 

                }
                break;
            case 22 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:231: TOK_OP_NEXT
                {
                mTOK_OP_NEXT(); 

                }
                break;
            case 23 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:243: TOK_OP_PREV
                {
                mTOK_OP_PREV(); 

                }
                break;
            case 24 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:255: TOK_UNTIL
                {
                mTOK_UNTIL(); 

                }
                break;
            case 25 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:265: TOK_SINCE
                {
                mTOK_SINCE(); 

                }
                break;
            case 26 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:275: TOK_RELEASES
                {
                mTOK_RELEASES(); 

                }
                break;
            case 27 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:288: TOK_TRIGGERED
                {
                mTOK_TRIGGERED(); 

                }
                break;
            case 28 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:302: TOK_OP_NOTPREVNOT
                {
                mTOK_OP_NOTPREVNOT(); 

                }
                break;
            case 29 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:320: TOK_OP_BOUND_FINALLY
                {
                mTOK_OP_BOUND_FINALLY(); 

                }
                break;
            case 30 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:341: TOK_OP_BOUND_GLOBALLY
                {
                mTOK_OP_BOUND_GLOBALLY(); 

                }
                break;
            case 31 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:363: TOK_KNOW
                {
                mTOK_KNOW(); 

                }
                break;
            case 32 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:372: TOK_SKNOW
                {
                mTOK_SKNOW(); 

                }
                break;
            case 33 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:382: TOK_LP
                {
                mTOK_LP(); 

                }
                break;
            case 34 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:389: TOK_RP
                {
                mTOK_RP(); 

                }
                break;
            case 35 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:396: TOK_LB
                {
                mTOK_LB(); 

                }
                break;
            case 36 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:403: TOK_RB
                {
                mTOK_RB(); 

                }
                break;
            case 37 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:410: TOK_LCB
                {
                mTOK_LCB(); 

                }
                break;
            case 38 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:418: TOK_RCB
                {
                mTOK_RCB(); 

                }
                break;
            case 39 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:426: TOK_FALSEEXP
                {
                mTOK_FALSEEXP(); 

                }
                break;
            case 40 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:439: TOK_TRUEEXP
                {
                mTOK_TRUEEXP(); 

                }
                break;
            case 41 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:451: TOK_WORD1
                {
                mTOK_WORD1(); 

                }
                break;
            case 42 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:461: TOK_WORD
                {
                mTOK_WORD(); 

                }
                break;
            case 43 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:470: TOK_BOOL
                {
                mTOK_BOOL(); 

                }
                break;
            case 44 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:479: TOK_WAREAD
                {
                mTOK_WAREAD(); 

                }
                break;
            case 45 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:490: TOK_WAWRITE
                {
                mTOK_WAWRITE(); 

                }
                break;
            case 46 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:502: TOK_CASE
                {
                mTOK_CASE(); 

                }
                break;
            case 47 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:511: TOK_ESAC
                {
                mTOK_ESAC(); 

                }
                break;
            case 48 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:520: TOK_PLUS
                {
                mTOK_PLUS(); 

                }
                break;
            case 49 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:529: TOK_MINUS
                {
                mTOK_MINUS(); 

                }
                break;
            case 50 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:539: TOK_TIMES
                {
                mTOK_TIMES(); 

                }
                break;
            case 51 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:549: TOK_DIVIDE
                {
                mTOK_DIVIDE(); 

                }
                break;
            case 52 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:560: TOK_MOD
                {
                mTOK_MOD(); 

                }
                break;
            case 53 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:568: TOK_LSHIFT
                {
                mTOK_LSHIFT(); 

                }
                break;
            case 54 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:579: TOK_RSHIFT
                {
                mTOK_RSHIFT(); 

                }
                break;
            case 55 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:590: TOK_EQUAL
                {
                mTOK_EQUAL(); 

                }
                break;
            case 56 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:600: TOK_NOTEQUAL
                {
                mTOK_NOTEQUAL(); 

                }
                break;
            case 57 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:613: TOK_LE
                {
                mTOK_LE(); 

                }
                break;
            case 58 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:620: TOK_GE
                {
                mTOK_GE(); 

                }
                break;
            case 59 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:627: TOK_LT
                {
                mTOK_LT(); 

                }
                break;
            case 60 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:634: TOK_GT
                {
                mTOK_GT(); 

                }
                break;
            case 61 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:641: TOK_NEXT
                {
                mTOK_NEXT(); 

                }
                break;
            case 62 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:650: TOK_UNION
                {
                mTOK_UNION(); 

                }
                break;
            case 63 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:660: TOK_SETIN
                {
                mTOK_SETIN(); 

                }
                break;
            case 64 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:670: TOK_TWODOTS
                {
                mTOK_TWODOTS(); 

                }
                break;
            case 65 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:682: TOK_DOT
                {
                mTOK_DOT(); 

                }
                break;
            case 66 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:690: TOK_IMPLIES
                {
                mTOK_IMPLIES(); 

                }
                break;
            case 67 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:702: TOK_IFF
                {
                mTOK_IFF(); 

                }
                break;
            case 68 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:710: TOK_OR
                {
                mTOK_OR(); 

                }
                break;
            case 69 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:717: TOK_AND
                {
                mTOK_AND(); 

                }
                break;
            case 70 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:725: TOK_XOR
                {
                mTOK_XOR(); 

                }
                break;
            case 71 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:733: TOK_XNOR
                {
                mTOK_XNOR(); 

                }
                break;
            case 72 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:742: TOK_NOT
                {
                mTOK_NOT(); 

                }
                break;
            case 73 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:750: TOK_COMMA
                {
                mTOK_COMMA(); 

                }
                break;
            case 74 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:760: TOK_COLON
                {
                mTOK_COLON(); 

                }
                break;
            case 75 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:770: TOK_SEMI
                {
                mTOK_SEMI(); 

                }
                break;
            case 76 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:779: TOK_CONCATENATION
                {
                mTOK_CONCATENATION(); 

                }
                break;
            case 77 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:797: TOK_NUMBER_WORD
                {
                mTOK_NUMBER_WORD(); 

                }
                break;
            case 78 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:813: TOK_NUMBER_FRAC
                {
                mTOK_NUMBER_FRAC(); 

                }
                break;
            case 79 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:829: TOK_NUMBER
                {
                mTOK_NUMBER(); 

                }
                break;
            case 80 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:840: TOK_ATOM
                {
                mTOK_ATOM(); 

                }
                break;
            case 81 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:849: JTOK_WS
                {
                mJTOK_WS(); 

                }
                break;
            case 82 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:857: JTOK_MULTI_COMMENT
                {
                mJTOK_MULTI_COMMENT(); 

                }
                break;
            case 83 :
                // G:\\Desktop\\major\\search_04\\JTLV_PARSERS\\SPC.g:1:876: JTOK_LINE_COMMENT
                {
                mJTOK_LINE_COMMENT(); 

                }
                break;

        }

    }


 

}