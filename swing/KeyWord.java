package swing;

public class KeyWord {
//	private String[] javaKeyWords;
//	private String[] cKeyWords;
//	private String[] htmlKeyWords;
	private String[] smvKeyWords;
	public KeyWord()
	{
//		javaKeyWords=new String[]{"boolean","byte","char","double","float","int","long","short","void",
//								  "new","super","this","instanceof","null","if","else","switch","case",
//								  "default","do","while","for","break","continue","return","try","catch",
//								  "finally","throw","assert","synchronized","abstract","final","private",
//								  "protected","public","static","class","extends","interface","implements",
//								  "import","package","native","transient","volatile","true","false","String",
//								  "StringBuffer","StringBulider","import","Vector","Stack","HashSet","TreeSet",
//								  "ArrayList","LinkList","Map","Date","Calendar",
//								};
//		cKeyWords=new String[]{"include","char","double","float","int","long","short","void","new","this","NULL",
//								"if","else","switch","case","default","do","while","for","break","continue",
//								"return","try","catch","private","protected","public","static","class","define",
//								"const","using","namespace","string"
//								};
//		htmlKeyWords=new String[]{"html","head","body","title","base","META","link","ISINDEX","style","pre","h1",
//									"h2","h3","h4","h5","h6","h7","b","i","tt","cite","em","strong","font","p",
//									"br","blockquote","dl","dt","dd","ol","li","ul","div","img","hr","table",
//									"tr","td","th","frameset","noframes","frame","form","select","option",
//									"textarea","input","PRE","TT","ADDRESS","SAMP","DL"};
		
		
		smvKeyWords=new String[]{"A", "ABF", "ABG", "abs", "AF", "AG", "array", "ASSIGN", "AX", "bool", "boolean", "BU", 
				"case", "COMPASSION", "COMPID","COMPUTE", "COMPWFF", "CONSTANTS", "CONSTARRAY", "CONSTRAINT", "count", "CTLSPEC", "CTLWFF", "DEFINE",
				"E", "EBF", "EBG", "EF", "EG", "esac", "EX", "extend", "F", "FAIRNESS", "FALSE", "floor", "FROZENVAR", "FUN", "G", "H", "IN",
				"in", "INIT", "init", "Integer", "integer", "NVAR", "INVARSPEC", "ISA", "ITYPE", "IVAR", "JUSTICE", "LTLSPEC",
				"LTLWFF", "MAX", "max", "MDEFINE", "MIN", "min", "MIRROR", "mod", "MODULE", "NAME", "next", "NEXTWFF", "O", "of",
				"PRED", "PREDICATES", "PSLSPEC", "Real", "real", "resize", "S", "self", "signed", "SIMPWFF", "sizeof", "SPEC",
				"swconst", "T", "toint", "TRANS", "TRUE", "typeof", "U", "union", "unsigned", "uwconst", "V", "VAR", "Word", "word",
				"word1", "X", "xnor", "xor", "Y", "Z",
				//new
				"KNOW","AGENT"};
	}
	public boolean isKeyWord(String word,String lan)
	{
		if(lan.equals("smv"))
		{
			for(int i=0;i<smvKeyWords.length;i++)
			{
				if(smvKeyWords[i].equals(word))
				{
					return true;
				}
			}
		}
		return false;
	}
}
