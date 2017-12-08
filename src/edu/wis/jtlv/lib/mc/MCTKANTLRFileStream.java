package edu.wis.jtlv.lib.mc;

import edu.wis.jtlv.env.spec.Spec;
import org.antlr.runtime.ANTLRFileStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MCTKANTLRFileStream extends ANTLRFileStream{
    public MCTKANTLRFileStream(String s) throws IOException {
        super(s);
    }

    public MCTKANTLRFileStream(String s, String s1) throws IOException {
        super(s, s1);
    }
    public String[] seperateSpecsFromModules() throws IOException {
        String dataStr = new String(data);
       // if(dataStr.equals("")) return "";
        if(dataStr.equals("")) return null;
        int charNum=0;
        dataStr=dataStr.replaceAll("[-]+[\\s\\S&&[^\n]]*[\r\n]+", "");
        String regEx = "(CTLSPEC|LTLSPEC|SPEC)[\\s\\S&&[^\n]]*\\;[\\s]*$";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx,Pattern.MULTILINE);  ;
        Matcher matcher = pattern.matcher(dataStr);
        ArrayList<String> tempList = new ArrayList<String>();
        while(matcher.find()){
            tempList.add(matcher.group());
            dataStr = dataStr.replaceAll(matcher.group(), "");
        }
        String []specStr = new String[tempList.size()];
         tempList.toArray(specStr);

//        for(String temp : tempList){
//            specStr=specStr + temp;
//        }
        charNum+=specStr.length;
        if(charNum>0) {
            this.data = dataStr.toCharArray();
            this.n = this.data.length;
            this.reset();
        }
        return specStr;
    }
}
