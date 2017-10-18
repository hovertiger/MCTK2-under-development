lexer grammar SPC;
@members {
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
}
@header {
package edu.wis.jtlv.env.core.spec;
import edu.wis.jtlv.env.Env;
}

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1390
TOK_CTL_SPEC				: 'CTLSPEC' | 'SPEC';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1391
TOK_CTL_STAR_SPEC			: 'CTL*SPEC';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1392
TOK_LTL_SPEC				: 'LTLSPEC';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1393
TOK_INVAR_SPEC				: 'INVARSPEC';

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1395
TOK_EX						: 'EX';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1396
TOK_AX						: 'AX';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1397
TOK_EF						: 'EF';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1398
TOK_AF						: 'AF';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1399
TOK_EG						: 'EG';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1400
TOK_AG						: 'AG';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1401
TOK_EE						: 'E';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1402
TOK_AA						: 'A';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1403
TOK_BUNTIL					: 'BU';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1404
TOK_EBF						: 'EBF';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1405
TOK_ABF						: 'ABF';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1406
TOK_EBG						: 'EBG';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1407
TOK_ABG						: 'ABG';
// the last is the TLV notation.
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1409
TOK_OP_FINALLY				: '<>' | 'F' | 'FINALLY' | 'EVENTUALLY';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1410
TOK_OP_ONCE					: '<_>' | 'O' | 'ONCE';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1411
TOK_OP_GLOBALLY				: '[]' | 'G' | 'GLOBALLY' | 'ALWAYS';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1412
TOK_OP_HISTORICALLY			: '[_]' | 'H' | 'HISTORICALLY';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1413
TOK_OP_NEXT					: '()' | 'X' | 'NEXT';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1414
TOK_OP_PREV					: '(_)' | 'Y' | 'PREV';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1415
TOK_UNTIL					: 'Until' | 'U' | 'UNTIL';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1416
TOK_SINCE					: 'Since' | 'S' | 'SINCE';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1417
TOK_RELEASES				: 'Awaits' | 'V' | 'RELEASES';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1418
TOK_TRIGGERED				: 'Backto' | 'T' | 'TRIGGERED';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1419
TOK_OP_NOTPREVNOT			: 'Z';

//epistemic
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1422
TOK_KNOW				: 'K' | 'KNOW' | 'Know';

//TOK_MMIN					: 'MIN';// !!!
//TOK_MMAX					: 'MAX';// !!!

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1427
TOK_LP						: '(';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1428
TOK_RP						: ')';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1429
TOK_LB						: '[';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1430
TOK_RB						: ']';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1431
TOK_LCB						: '{';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1432
TOK_RCB						: '}';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1433
TOK_FALSEEXP				: 'FALSE';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1434
TOK_TRUEEXP					: 'TRUE';

// ALL NON SIMPLE OPERATOR SHOULD BE REMOVED OR ELSE THEY
// WOULD NOT HAVE MEANING IN BETWEEN TL STATEMENTS
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1438
TOK_WORD1					: 'word1';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1439
TOK_WORD					: 'word' | 'Word';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1440
TOK_BOOL					: 'bool';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1441
TOK_WAREAD					: 'READ';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1442
TOK_WAWRITE					: 'WRITE';// ???

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1444
TOK_CASE					: 'case';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1445
TOK_ESAC					: 'esac';// ???
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1446
TOK_PLUS					: '+';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1447
TOK_MINUS					: '-';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1448
TOK_TIMES					: '*';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1449
TOK_DIVIDE					: '/';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1450
TOK_MOD						: 'mod';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1451
TOK_LSHIFT					: '<<';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1452
TOK_RSHIFT					: '>>';
//TOK_LROTATE					: '<<<';
//TOK_RROTATE					: '>>>';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1455
TOK_EQUAL					: '=';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1456
TOK_NOTEQUAL				: '!=';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1457
TOK_LE						: '<=';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1458
TOK_GE						: '>=';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1459
TOK_LT						: '<';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1460
TOK_GT						: '>';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1461
TOK_NEXT					: 'next';
//TOK_SELF					: 'self';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1463
TOK_UNION					: 'union';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1464
TOK_SETIN					: 'in';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1465
TOK_TWODOTS					: '..';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1466
TOK_DOT						: '.';

// basic logic operators...
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1469
TOK_IMPLIES					: '->';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1470
TOK_IFF						: '<->';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1471
TOK_OR						: '|';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1472
TOK_AND						: '&';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1473
TOK_XOR						: 'xor';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1474
TOK_XNOR					: 'xnor';
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1475
TOK_NOT						: '!';

// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1477
TOK_COMMA					: ',';//                     {yylval.lineno = yylineno; return(TOK_COMMA);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1478
TOK_COLON					: ':';//                     {yylval.lineno = yylineno; return(TOK_COLON);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1479
TOK_SEMI					: ';';//                     {yylval.lineno = yylineno; return(TOK_SEMI);}
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1480
TOK_CONCATENATION			: '::';//                    {yylval.lineno = yylineno; return(TOK_CONCATENATION);}



/////////////////////////////////////////////////////////////////////
// basic JTLV extension - atoms, whitespaces and comments
/////////////////////////////////////////////////////////////////////

/* word constants */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1489
TOK_NUMBER_WORD					: '0' ('b' | 'B' | 'o' | 'O' | 'd' | 'D' | 'h' | 'H') ('0'..'9')* '_' ('0'..'9' | 'a'..'f' | 'A'..'F') ('0'..'9' | 'a'..'f' | 'A'..'F' | '_')*;

 /* real, fractional and exponential constants */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1492
TOK_NUMBER_FRAC					: ('f' | 'F') '\'' ('0'..'9')+ '/' ('0'..'9')+;

/* integer number */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1495
TOK_NUMBER						: ('0'..'9')+;

/* identifier */
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1498
TOK_ATOM						: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '\\' | '$' | '#' | '-')*;


// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1501
JTOK_WS 						:   (   ' '
								|   '\t'
								|   '\r'
								|   '\n'
								)+
								{ $channel=HIDDEN; };
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1507
JTOK_MULTI_COMMENT				: ('/*' (
								options { greedy=false;}
								:  // '\r' '\n' |
								'\r'
								|   '\n'
								|   ~('\n'|'\r')
								)*
								'*/'
								{$channel=HIDDEN;});
// $ANTLR src "/Users/lxy/Documents/Doc-LXY-iMac/RecentDoc/Development/JTLV/MCTK2/PARSERS/SPC.g" 1516
JTOK_LINE_COMMENT				: ('--' (~('\n'|'\r'))* (('\n'|'\r'('\n')?))? {$channel=HIDDEN;})
								| ('//' (~('\n'|'\r'))* (('\n'|'\r'('\n')?))? {$channel=HIDDEN;});

