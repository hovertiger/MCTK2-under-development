package edu.wis.jtlv.lib.mc.tl;

import edu.wis.jtlv.env.module.Module;
import edu.wis.jtlv.env.spec.Spec;

public class RTLTLKModelCheckAlg extends LTLModelCheckAlg {
    public RTLTLKModelCheckAlg(Module design, Spec property) {
        super(design, property);
    }

    public RTLTLKModelCheckAlg(Module design, Module user_tester) {
        super(design, user_tester);
    }
}
