package edu.wis.jtlv.lib.mc;

import edu.wis.jtlv.env.spec.Spec;
import org.antlr.runtime.ANTLRFileStream;

import java.io.IOException;
import java.util.Vector;

public class MCTKANTLRFileStream extends ANTLRFileStream{
    public MCTKANTLRFileStream(String s) throws IOException {
        super(s);
    }

    public MCTKANTLRFileStream(String s, String s1) throws IOException {
        super(s, s1);
    }

    public String seperateSpecsFromModules() throws IOException {
        String dataStr = new String(data);
        if(dataStr.equals("")) return "";

        String specStr = "";
        int charNum=0;
        while (true) {
            int start_spec = dataStr.indexOf("SPECIFICATIONS");
            if (start_spec == -1) break;
            int end_spec = dataStr.indexOf("END", start_spec);
            if (end_spec == -1) break;

            specStr += dataStr.substring(start_spec + ("SPECIFICATIONS".length()), end_spec);
            charNum+=specStr.length();

            dataStr = dataStr.replace(dataStr.substring(start_spec, end_spec + 3), "");

        }

        if(charNum>0) {
            this.data = dataStr.toCharArray();
            this.n = this.data.length;
            this.reset();
        }
        return specStr;
    }

}
