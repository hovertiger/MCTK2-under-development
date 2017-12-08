package swing;

public class KeyWord {
//	private String[] javaKeyWords;
//	private String[] cKeyWords;
//	private String[] htmlKeyWords;
	private String[] smvKeyWords;
	public KeyWord()
	{
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
	public boolean isKeyWord(String word)
	{
			for(int i=0;i<smvKeyWords.length;i++)
			{
				if(smvKeyWords[i].equals(word))
				{
					return true;
				}
			}
		return false;
	}
}
