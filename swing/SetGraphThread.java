package swing;

import edu.wis.jtlv.lib.mc.ModelCheckAlgException;
import edu.wis.jtlv.lib.mc.RTCTLK.GraphExplainRTCTLK;
import edu.wis.jtlv.lib.mc.RTCTLK.ViewerExplainRTCTLK;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

import javax.swing.*;

public class SetGraphThread implements Runnable, ViewerListener {
    GraphExplainRTCTLK graph;
    JTextPane ctext;
    JPanel vp;
    JSplitPane sp;
    protected boolean loop = true;

    public SetGraphThread(GraphExplainRTCTLK graph, JTextPane ctext, JSplitPane sp, JPanel vp) {
        this.graph = graph;
        this.ctext = ctext;
        this.vp = vp;
        this.sp=sp;
    }

    @Override
    public void run() {
        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        this.vp = viewPanel;
        this.sp.setLeftComponent(vp);
        this.sp.setDividerSize(5);
        this.sp.setDividerLocation(600);

        viewer.enableAutoLayout();
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        graph.addAttribute("ui.label", graph.getId());
        for (Node n : graph) {
            n.addAttribute("ui.label", n.getId());
        }
        graph.addAttribute("ui.stylesheet",
                "node { stroke-mode: plain; shape: circle; size: 40px; fill-color: green; z-index: 10; text-size: 11; }" +
                        "node.initialState {fill-color: pink;} " +
                        "node.epistemicState {fill-color: gold;} " +
                        "edge { size: 2px; shape: line; fill-color: green; arrow-size: 8px, 6px; arrow-shape: arrow; }" +
                        "edge.epistemicEdge { fill-color: gold; shape: cubic-curve;} " +
                        "sprite {size: 0px;}"
        );
        graph.setAutoCreate(true);
        graph.setStrict(false);

        // The default action when closing the view is to quit
        // the program.
        //viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        // We connect back the viewer to the graph,
        // the graph becomes a sink for the viewer.
        // We also install us as a viewer listener to
        // intercept the graphic events.
        ViewerPipe fromViewer = viewer.newViewerPipe();
        fromViewer.addViewerListener(this);
        fromViewer.addSink(graph);
        while (loop) {
            //fromViewer.pump();
            try {
                fromViewer.blockingPump();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    public void viewClosed(String id) {
        loop = false;
    }

    public void buttonPushed(String id) {
        //Node n = graph.getNode(id);
        //System.out.println("-------- State "+id+" --------");
        ctext.setText(ctext.getText().toString() + "\n" + "-------- State " + id + " --------");
        String str = graph.getNodeSatSpec(id);
        if (str != null && !str.equals(""))
            //System.out.println("[satisfies " + str + "]");
            ctext.setText(ctext.getText().toString() + "\n" + "[satisfies " + str + "]");
        //System.out.println( graph.getNodeStateDetails(id));
        ctext.setText(ctext.getText().toString() + "\n" + graph.getNodeStateDetails(id));
        try {
            graph.getChecker().explainOneGraphNode(graph, id);
        } catch (ModelCheckAlgException e) {
            e.printStackTrace();
        }
    }

    public void buttonReleased(String id) {
        //ctext.setText(ctext.getText() + "\n Button released on node " + id);
        //System.out.println("Button released on node "+id);
    }
}