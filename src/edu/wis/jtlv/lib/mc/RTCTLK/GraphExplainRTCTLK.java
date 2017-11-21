package edu.wis.jtlv.lib.mc.RTCTLK;

import edu.wis.jtlv.env.Env;
import net.sf.javabdd.BDD;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

public class GraphExplainRTCTLK extends MultiGraph {

    public GraphExplainRTCTLK(String id, boolean strictChecking, boolean autoCreate, int initialNodeCapacity, int initialEdgeCapacity) {
        super(id, strictChecking, autoCreate, initialNodeCapacity, initialEdgeCapacity);
    }

    public GraphExplainRTCTLK(String id) {
        super(id);
    }

    public Node addStateNode(int pathNo, int stateNo, BDD stateBDD, String satSpec) {
        String stateId = pathNo+"."+stateNo;
        if(stateId==null || stateId.equals("")) return null;
        Node n = addNode(stateId);
        if(n==null) return null;

        n.setAttribute("pathNo", pathNo);
        n.setAttribute("stateNo", stateNo);
        n.setAttribute("BDD", stateBDD);
        n.setAttribute("note_stateDetails", Env.getOneBDDStateDetails(stateBDD,"\n"));
        n.setAttribute("note_satSpec", satSpec);
        return n;
    }

    public boolean setNodeBDD(String nodeID, BDD stateBDD) {
        Node n = getNode(nodeID); if(n==null) return false;
        n.setAttribute("BDD", stateBDD);
        n.setAttribute("note_stateDetails", Env.getOneBDDStateDetails(stateBDD,"\n"));
        return true;
    }

    public boolean setNodeNoteSatSpec(String nodeID, String satSpec) {
        Node n = getNode(nodeID); if(n==null) return false;
        n.setAttribute("note_satSpec", satSpec);
        return true;
    }

    public boolean addNodeNoteSatSpec(String nodeID, String satSpec) {
        Node n = getNode(nodeID); if(n==null) return false;
        String oldSatSpec = getNodeSatSpec(nodeID);
        n.setAttribute("note_satSpec",  oldSatSpec.equals("") ? satSpec : oldSatSpec + ", \n"+satSpec);
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
