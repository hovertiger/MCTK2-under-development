lexer grammar SMV;
@members {
public String getErrorMessage(RecognitionException e, String[] tokenNames) {
	String msg = null;
	if ( e instanceof SMVUnimplementedException) {
		msg = e.toString();
    		Env.doError(e, msg);
	} else if ( e instanceof SMVParseException) {
		msg = e.toString();
    		Env.doError(e, msg);
	} else if ( e instanceof SMVInternalParseException) {
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

}
@header {
package edu.wis.jtlv.env.core.smv;
import edu.wis.jtlv.env.Env;
//import edu.wis.jtlv.env.module.SMVParseException;
}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 933
TOK_FOR		: 'for';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 934
TOK_MODULE 	: 'MODULE';//                {yylval.lineno = yylineno; return(TOK_MODULE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 935
TOK_PROCESS	: 'process';//               {yylval.lineno = yylineno; return(TOK_PROCESS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 936
TOK_DEFINE		: 'DEFINE';//                {yylval.lineno = yylineno; return(TOK_DEFINE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 937
TOK_VAR		: 'VAR';//                   {yylval.lineno = yylineno; return(TOK_VAR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 938
TOK_IVAR		: 'IVAR';//                  {yylval.lineno = yylineno; return(TOK_IVAR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 939
TOK_INIT		: 'INIT';//                  {yylval.lineno = yylineno; return(TOK_INIT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 940
TOK_TRANS		: 'TRANS';//                 {yylval.lineno = yylineno; return(TOK_TRANS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 941
TOK_INVAR		: 'INVAR';//                 {yylval.lineno = yylineno; return(TOK_INVAR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 942
TOK_SPEC		: 'SPEC';//                  {yylval.lineno = yylineno; return(TOK_SPEC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 943
TOK_CTLSPEC		: 'CTLSPEC';//               {yylval.lineno = yylineno; return(TOK_CTLSPEC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 944
TOK_LTLSPEC		: 'LTLSPEC';//               {yylval.lineno = yylineno; return(TOK_LTLSPEC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 945
TOK_PSLSPEC		: 'PSLSPEC';//               {yylval.lineno = yylineno; Parser_switch_to_psl(); return(TOK_PSLSPEC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 946
TOK_COMPUTE	: 'COMPUTE';//               {yylval.lineno = yylineno; return(TOK_COMPUTE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 947
TOK_INVARSPEC	: 'INVARSPEC';//             {yylval.lineno = yylineno; return(TOK_INVARSPEC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 948
TOK_CONSTRAINT	: 'CONSTRAINT';//            {yylval.lineno = yylineno; return(TOK_CONSTRAINT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 949
TOK_CONSTANTS	: 'CONSTANTS';//             {yylval.lineno = yylineno; return(TOK_CONSTANTS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 950
TOK_SIMPWFF		: 'SIMPWFF';//               {yylval.lineno = yylineno; return(TOK_SIMPWFF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 951
TOK_CTLWFF		: 'CTLWFF';//                {yylval.lineno = yylineno; return(TOK_CTLWFF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 952
TOK_LTLWFF		: 'LTLWFF';//               {yylval.lineno = yylineno; return(TOK_LTLWFF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 953
TOK_COMPWFF	: 'COMPWFF';//               {yylval.lineno = yylineno; return(TOK_COMPWFF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 954
TOK_INCONTEXT	: 'IN';//                    {yylval.lineno = yylineno; return(TOK_INCONTEXT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 955
TOK_FAIRNESS	: 'FAIRNESS';//              {yylval.lineno = yylineno; return(TOK_FAIRNESS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 956
TOK_JUSTICE		: 'JUSTICE';//               {yylval.lineno = yylineno; return(TOK_JUSTICE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 957
TOK_COMPASSION	: 'COMPASSION';//            {yylval.lineno = yylineno; return(TOK_COMPASSION);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 958
TOK_ISA		: 'ISA';//                   {yylval.lineno = yylineno; return(TOK_ISA);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 959
TOK_ASSIGN		: 'ASSIGN';//                {yylval.lineno = yylineno; return(TOK_ASSIGN);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 960
TOK_GOTO		: 'GOTO';//                  {yylval.lineno = yylineno; return(TOK_GOTO);}

// LXY: Tokens for MAS
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 963
TOK_AGENT 	: 'AGENT';//                {yylval.lineno = yylineno; return(TOK_AGENT);} //LXY added
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 964
TOK_VISIBLE 	: 'VISIBLE';//                {yylval.lineno = yylineno; return(TOK_AGENT);} //LXY added
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 965
TOK_INVISIBLE 	: 'INVISIBLE';//                {yylval.lineno = yylineno; return(TOK_AGENT);} //LXY added
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 966
TOK_INVISIBLE_VAR	: 'INVISIBLEVAR';

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 968
TOK_GAME		: 'GAME';//                  {yylval.lineno = yylineno; return(TOK_GAME);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 969
TOK_PLAYER_1	: 'PLAYER_1';//              {yylval.lineno = yylineno; return(TOK_PLAYER_1);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 970
TOK_PLAYER_2	: 'PLAYER_2';//              {yylval.lineno = yylineno; return(TOK_PLAYER_2);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 971
TOK_REACHTARGET	: 'REACHTARGET';//           {yylval.lineno = yylineno; return(TOK_REACHTARGET);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 972
TOK_AVOIDTARGET	: 'AVOIDTARGET';//           {yylval.lineno = yylineno; return(TOK_AVOIDTARGET);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 973
TOK_REACHDEADLOCK	: 'REACHDEADLOCK';//         {yylval.lineno = yylineno; return(TOK_REACHDEADLOCK);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 974
TOK_AVOIDDEADLOCK	: 'AVOIDDEADLOCK';//         {yylval.lineno = yylineno; return(TOK_AVOIDDEADLOCK);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 975
TOK_BUCHIGAME	: 'BUCHIGAME';//             {yylval.lineno = yylineno; return(TOK_BUCHIGAME);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 976
TOK_GENREACTIVITY	: 'GENREACTIVITY';//         {yylval.lineno = yylineno; return(TOK_GENREACTIVITY);}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 978
TOK_ARRAY		: 'array';//                 {yylval.lineno = yylineno; return(TOK_ARRAY);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 979
TOK_OF		: 'of';//                    {yylval.lineno = yylineno; return(TOK_OF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 980
TOK_BOOLEAN	: 'boolean';//               {yylval.lineno = yylineno; return(TOK_BOOLEAN);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 981
TOK_INTEGER		: 'integer' | 'Integer';//               {yylval.lineno = yylineno; return(TOK_INTEGER);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 982
TOK_REAL		: 'real' | 'Real';//                  {yylval.lineno = yylineno; return(TOK_REAL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 983
TOK_WORD1		: 'word1';//                 {yylval.lineno = yylineno; return(TOK_WORD1);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 984
TOK_WORD		: 'word' | 'Word';//                  {yylval.lineno = yylineno; return(TOK_WORD);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 985
TOK_BOOL		: 'bool';//                  {yylval.lineno = yylineno; return(TOK_BOOL);}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 987
TOK_WAREAD		: 'READ';//                  {yylval.lineno = yylineno; return(TOK_WAREAD);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 988
TOK_WAWRITE	: 'WRITE';//                 {yylval.lineno = yylineno; return(TOK_WAWRITE);}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 990
TOK_EX		: 'EX';//                    {yylval.lineno = yylineno; return(TOK_EX);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 991
TOK_AX		: 'AX';//                    {yylval.lineno = yylineno; return(TOK_AX);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 992
TOK_EF		: 'EF';//                    {yylval.lineno = yylineno; return(TOK_EF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 993
TOK_AF		: 'AF';//                    {yylval.lineno = yylineno; return(TOK_AF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 994
TOK_EG		: 'EG';//                    {yylval.lineno = yylineno; return(TOK_EG);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 995
TOK_AG		: 'AG';//                    {yylval.lineno = yylineno; return(TOK_AG);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 996
TOK_EE		: 'E';//                     {yylval.lineno = yylineno; return(TOK_EE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 997
TOK_OP_FUTURE	: 'F';//                     {yylval.lineno = yylineno; return(TOK_OP_FUTURE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 998
TOK_OP_ONCE	: 'O';//                     {yylval.lineno = yylineno; return(TOK_OP_ONCE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 999
TOK_OP_GLOBAL	: 'G';//                     {yylval.lineno = yylineno; return(TOK_OP_GLOBAL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1000
TOK_OP_HISTORICAL	: 'H';//                     {yylval.lineno = yylineno; return(TOK_OP_HISTORICAL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1001
TOK_OP_NEXT	: 'X';//                     {yylval.lineno = yylineno; return(TOK_OP_NEXT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1002
TOK_OP_PREC		: 'Y';//                     {yylval.lineno = yylineno; return(TOK_OP_PREC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1003
TOK_OP_NOTPRECNOT	: 'Z';//                     {yylval.lineno = yylineno; return(TOK_OP_NOTPRECNOT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1004
TOK_AA		: 'A';//                     {yylval.lineno = yylineno; return(TOK_AA);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1005
TOK_UNTIL		: 'U';//                     {yylval.lineno = yylineno; return(TOK_UNTIL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1006
TOK_SINCE		: 'S';//                     {yylval.lineno = yylineno; return(TOK_SINCE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1007
TOK_RELEASES	: 'V';//                     {yylval.lineno = yylineno; return(TOK_RELEASES);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1008
TOK_TRIGGERED	: 'T';//                     {yylval.lineno = yylineno; return(TOK_TRIGGERED);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1009
TOK_BUNTIL		: 'BU';//                    {yylval.lineno = yylineno; return(TOK_BUNTIL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1010
TOK_EBF		: 'EBF';//                   {yylval.lineno = yylineno; return(TOK_EBF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1011
TOK_ABF		: 'ABF';//                   {yylval.lineno = yylineno; return(TOK_ABF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1012
TOK_EBG		: 'EBG';//                   {yylval.lineno = yylineno; return(TOK_EBG);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1013
TOK_ABG		: 'ABG';//                   {yylval.lineno = yylineno; return(TOK_ABG);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1014
TOK_MMIN		: 'MIN';//                   {yylval.lineno = yylineno; return(TOK_MMIN);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1015
TOK_MMAX		: 'MAX';//                   {yylval.lineno = yylineno; return(TOK_MMAX);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1016
TOK_LP		: '(';//                     {yylval.lineno = yylineno; return(TOK_LP);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1017
TOK_RP		: ')';//                     {yylval.lineno = yylineno; return(TOK_RP);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1018
TOK_LB		: '[';//                     {yylval.lineno = yylineno; return(TOK_LB);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1019
TOK_RB		: ']';//                     {yylval.lineno = yylineno; return(TOK_RB);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1020
TOK_LCB		: '{';//                     {yylval.lineno = yylineno; return(TOK_LCB);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1021
TOK_RCB		: '}';//                     {yylval.lineno = yylineno; return(TOK_RCB);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1022
TOK_FALSEEXP	: 'FALSE';//                 {
		//		yylval.node = new_node(FALSEEXP,Nil,Nil);
		//		return(TOK_FALSEEXP);
		//	}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1026
TOK_TRUEEXP		: 'TRUE';//                  {
		//		yylval.node = new_node(TRUEEXP,Nil,Nil);
		//		return(TOK_TRUEEXP);
		//	}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1030
TOK_CASE		: 'case';//                  {yylval.lineno = yylineno; return(TOK_CASE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1031
TOK_ESAC		: 'esac';//                  {yylval.lineno = yylineno; return(TOK_ESAC);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1032
TOK_EQDEF		: ':=';//                    {yylval.lineno = yylineno; return(TOK_EQDEF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1033
TOK_PLUS		: '+';//                     {yylval.lineno = yylineno; return(TOK_PLUS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1034
TOK_MINUS		: '-';//                     {yylval.lineno = yylineno; return(TOK_MINUS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1035
TOK_TIMES		: '*';//                     {yylval.lineno = yylineno; return(TOK_TIMES);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1036
TOK_DIVIDE		: '/';//                     {yylval.lineno = yylineno; return(TOK_DIVIDE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1037
TOK_MOD		: 'mod';//                   {yylval.lineno = yylineno; return(TOK_MOD);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1038
TOK_LSHIFT		: '<<';//                    {yylval.lineno = yylineno; return(TOK_LSHIFT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1039
TOK_RSHIFT		: '>>';//                    {yylval.lineno = yylineno; return(TOK_RSHIFT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1040
TOK_LROTATE	: '<<<';//                   {yylval.lineno = yylineno; return(TOK_LROTATE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1041
TOK_RROTATE	: '>>>';//                   {yylval.lineno = yylineno; return(TOK_RROTATE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1042
TOK_EQUAL		: '=';//                     {yylval.lineno = yylineno; return(TOK_EQUAL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1043
TOK_NOTEQUAL	: '!=';//                    {yylval.lineno = yylineno; return(TOK_NOTEQUAL);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1044
TOK_LE		: '<=';//                    {yylval.lineno = yylineno; return(TOK_LE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1045
TOK_GE		: '>=';//                    {yylval.lineno = yylineno; return(TOK_GE);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1046
TOK_LT		: '<';//                     {yylval.lineno = yylineno; return(TOK_LT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1047
TOK_GT		: '>';//                     {yylval.lineno = yylineno; return(TOK_GT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1048
TOK_NEXT		: 'next';//                  {yylval.lineno = yylineno; return(TOK_NEXT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1049
TOK_SMALLINIT	: 'init';//                  {yylval.lineno = yylineno; return(TOK_SMALLINIT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1050
TOK_SELF		: 'self';//                  {yylval.lineno = yylineno; return(TOK_SELF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1051
TOK_UNION		: 'union';//                 {yylval.lineno = yylineno; return(TOK_UNION);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1052
TOK_SETIN		: 'in';//                    {yylval.lineno = yylineno; return(TOK_SETIN);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1053
TOK_TWODOTS	: '..';//                    {yylval.lineno = yylineno; return(TOK_TWODOTS);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1054
TOK_DOT		: '.';//                     {yylval.lineno = yylineno; return(TOK_DOT);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1055
TOK_IMPLIES		: '->';//                    {yylval.lineno = yylineno; return(TOK_IMPLIES);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1056
TOK_IFF		: '<->';//                   {yylval.lineno = yylineno; return(TOK_IFF);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1057
TOK_OR		: '|';//                     {yylval.lineno = yylineno; return(TOK_OR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1058
TOK_AND		: '&';//                     {yylval.lineno = yylineno; return(TOK_AND);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1059
TOK_XOR		: 'xor';//                   {yylval.lineno = yylineno; return(TOK_XOR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1060
TOK_XNOR		: 'xnor';//                  {yylval.lineno = yylineno; return(TOK_XNOR);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1061
TOK_NOT		: '!';//                     {yylval.lineno = yylineno; return(TOK_NOT);}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1063
TOK_COMMA		: ',';//                     {yylval.lineno = yylineno; return(TOK_COMMA);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1064
TOK_COLON		: ':';//                     {yylval.lineno = yylineno; return(TOK_COLON);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1065
TOK_SEMI		: ';';//                     {yylval.lineno = yylineno; return(TOK_SEMI);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1066
TOK_CONCATENATION	: '::';//                    {yylval.lineno = yylineno; return(TOK_CONCATENATION);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1067
TOK_PRED		: 'PRED';//                  {yylval.lineno = yylineno; return(TOK_PRED);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1068
TOK_PREDSLIST	: 'PREDICATES';//            {yylval.lineno = yylineno; return(TOK_PREDSLIST);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1069
TOK_MIRROR		: 'MIRROR';//                {yylval.lineno = yylineno; return(TOK_MIRROR);}

 /* word constants */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1072
TOK_NUMBER_WORD	: '0' ('b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H') ('0'..'9')* '_' ('0'..'9' | 'a'..'f' | 'A'..'F') ('0'..'9' | 'a'..'f' | 'A'..'F' | '_')*;

 /* real, fractional and exponential constants */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1075
TOK_NUMBER_FRAC	: ('f' | 'F') '\'' ('0'..'9')+ '/' ('0'..'9')+;
/* not implemented in JTLV, and make problems in the parsing, conflict with '0..8'
TOK_NUMBER_EXP	: ('0'..'9')+ ('.' ('0'..'9')+)? ('e' | 'E') ('+' | '-') ('0'..'9')+;
TOK_NUMBER_REAL	: ('0'..'9')+ '.' ('0'..'9')+;
*/
 /* integer number */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1081
TOK_NUMBER		: ('0'..'9')+;

/* identifier */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1084
TOK_ATOM		: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '\\' | '$' | '#' | '-')*;


// basic JTLV extension
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1088
JTOK_WS 		:   (   ' '
		|   '\t'
		|   '\r'
		|   '\n'
		)+
		{ $channel=HIDDEN; };
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1094
JTOK_MULTI_COMMENT	: ('/*' (
		options { greedy=false;}
		:  // '\r' '\n' |
		'\r'
		|   '\n'
		|   ~('\n'|'\r')
		)*
		'*/'
		{$channel=HIDDEN;});
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SMV.g" 1103
JTOK_LINE_COMMENT	: ('--' (~('\n'|'\r'))* (('\n'|'\r'('\n')?))? {$channel=HIDDEN;})
		|
		('//' (~('\n'|'\r'))* (('\n'|'\r'('\n')?))? {$channel=HIDDEN;});

