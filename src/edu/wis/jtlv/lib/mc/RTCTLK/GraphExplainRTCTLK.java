package edu.wis.jtlv.lib.mc.RTCTLK;

import com.sun.deploy.util.OrderedHashSet;
import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.env.spec.SpecBDD;
import net.sf.javabdd.BDD;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import sun.security.util.Cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class GraphExplainRTCTLK extends MultiGraph {

    public RTCTLKModelCheckAlg getChecker() {
        return checker;
    }

    public void setChecker(RTCTLKModelCheckAlg checker) {
        this.checker = checker;
    }

    private RTCTLKModelCheckAlg checker;

    public GraphExplainRTCTLK(String id, boolean strictChecking, boolean autoCreate, int initialNodeCapacity, int initialEdgeCapacity, RTCTLKModelCheckAlg checker) {
        super(id, strictChecking, autoCreate, initialNodeCapacity, initialEdgeCapacity);
        this.checker = checker;
    }

    public GraphExplainRTCTLK(String id, RTCTLKModelCheckAlg checker) {
        super(id);
        this.checker = checker;
    }

    public Node addStateNode(int pathNo, int stateNo, BDD stateBDD, Spec satSpec) {
        String stateId = pathNo+"."+stateNo;
        if(stateId==null || stateId.equals("")) return null;
        Node n = addNode(stateId);
        if(n==null) return null;
        n.addAttribute("ui.label", n.getId());

        n.setAttribute("pathNo", pathNo);
        n.setAttribute("stateNo", stateNo);
        n.setAttribute("BDD", stateBDD);
        n.setAttribute("note_stateDetails", Env.getOneBDDStateDetails(stateBDD,"\n"));

        Queue<Spec> Q = new LinkedList<Spec>();
        if(satSpec!=null) {
            if(satSpec.hasTemporalOperators() || satSpec.hasEpistemicOperators())
                Q.offer(satSpec);
            n.setAttribute("note_satSpec", satSpec.toString());
        }else
            n.setAttribute("note_satSpec", "");

        n.setAttribute("queue_satSpec", Q);

        return n;
    }

    public boolean setNodeBDD(String nodeId, BDD stateBDD) {
        Node n = getNode(nodeId); if(n==null) return false;
        n.setAttribute("BDD", stateBDD);
        n.setAttribute("note_stateDetails", Env.getOneBDDStateDetails(stateBDD,"\n"));
        return true;
    }

    public boolean addNodeSatSpec(String nodeId, Spec satSpec) {
        if(nodeId.equals("")) return false;
        Node n = getNode(nodeId); if(n==null) return false;

        Queue<Spec> Q = n.getAttribute("queue_satSpec");
        if(satSpec!=null) {
            if(satSpec.hasTemporalOperators() || satSpec.hasEpistemicOperators())
                Q.offer(satSpec);

            String oldSatSpec = getNodeSatSpec(nodeId);
            n.setAttribute("note_satSpec",  oldSatSpec.equals("") ? satSpec.toString() : oldSatSpec + ", \n"+satSpec.toString());
        }

        n.setAttribute("queue_satSpec", Q);
        return true;
    }

    public int getNodePathNo(String nodeID) {
        Node n = getNode(nodeID); if(n==null) return -1;
        return n.getAttribute("pathNo");
    }

    public int getNodeStateNo(String nodeID) {
        Node n = getNode(nodeID); if(n==null) return -1;
        return n.getAttribute("stateNo");
    }

    public BDD getNodeBDD(String nodeID) {
        Node n = getNode(nodeID); if(n==null) return null;
        return n.getAttribute("BDD");
    }

    public String getNodeSatSpec(String nodeID) {
        Node n = getNode(nodeID); if(n==null) return "";
        return n.getAttribute("note_satSpec");
    }

    public String getNodeStateDetails(String nodeID) {
        Node n = getNode(nodeID); if(n==null) return "";
        return n.getAttribute("note_stateDetails");
    }

}
