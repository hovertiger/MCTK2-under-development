package edu.wis.jtlv.lib.mc.RTCTLK;

import edu.wis.jtlv.env.spec.Spec;

public class GraphNodePendentSpecElement {
    String nodeId;
    Spec spec;

    public GraphNodePendentSpecElement(String nodeId, Spec spec) {
        this.nodeId = nodeId;
        this.spec = spec;
    }
}

