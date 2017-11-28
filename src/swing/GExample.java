package swing;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.lib.AlgExceptionI;
import edu.wis.jtlv.lib.AlgRunnerThread;
import edu.wis.jtlv.lib.mc.LTL.LTLModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTCTLK.GraphExplainRTCTLK;
import edu.wis.jtlv.lib.mc.RTCTLK.RTCTLKModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTLTLK.RTLTLKModelCheckAlg;
import org.graphstream.graph.Graph;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class GExample implements ActionListener {


    protected boolean loop = true;
    GraphExplainRTCTLK graph;

    //JLabel stateBar = new JLabel("MCTK-1.0.0");
    JTextPane text;
    JButton GButton;
    JTextPane ctext;
    JPopupMenu jPopMenu;
    JScrollPane scroll;
    JScrollPane cscroll;
    JSplitPane sp;
    TextEditor textEditor;
    JPanel vp;
    Clipboard clipboard;
//	public static void main(String args[]) {
//		new GExample();
//	}

    public GExample(TextEditor textEditor) {
        // We do as usual to display a graph. This
        // connect the graph outputs to the viewer.
        // The viewer is a sink of the graph.
        this.textEditor = textEditor;
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        JFrame frame = new JFrame();
        frame.setTitle("MCTK2-Graphical Verification ");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//默认最大界面
        frame.setMinimumSize(new Dimension(850, 700));
        JPanel panel = new JPanel(new BorderLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(850, 700);
            }
        };


        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        GButton = new JButton("Go");
        String tips = "Please input a specification to be verified...";
        text = new JTextPane();
        text.setPreferredSize(new Dimension(750, 50));
        text.setText(tips);
        text.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 18));
        scroll = new JScrollPane(text);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jp.add(scroll);
        jp.add(GButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                textEditor.setEnabled(true);
            }
        });
        text.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tips.equalsIgnoreCase(text.getText())) {
                    text.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(text.getText())) {
                    text.setText(tips);
                }
            }
        });

        GButton.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          if (e.getSource() == GButton) {
                                              if (tips.equalsIgnoreCase(text.getText()))
                                                  ctext.setText(ctext.getText() + "\n Sorry,please input a specification !");
                                              else {
                                                  try {
                                                      GRun();
                                                  } catch (IOException e1) {
                                                      e1.printStackTrace();
                                                  } catch (AlgExceptionI algExceptionI) {
                                                      algExceptionI.printStackTrace();
                                                  }
                                              }
                                          }
                                      }
                                  }
        );


        JPanel cp = new JPanel(new BorderLayout());
        //cp.setPreferredSize(new Dimension(300, 150));
        ctext = new JTextPane();
        cscroll = new JScrollPane(ctext);
        ctext.setText("Verification information...");
        ctext.setFont(new Font("标楷体", Font.TRUETYPE_FONT, 15));
        cscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        cscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        cp.add(cscroll);

        JMenuItem copy=new JMenuItem("Copy(C)");
        JMenuItem clear=new JMenuItem("Clear");
        jPopMenu=new JPopupMenu();
        jPopMenu.add(copy);
        jPopMenu.add(clear);
        copy.addActionListener(this);
        clear.addActionListener(this);
        ctext.add(jPopMenu);
        ctext.addMouseListener(new MyMouseListener());

        vp = new JPanel(new BorderLayout());//初始化
        sp = new JSplitPane();
        sp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);

//		 //vp=viewPanel;
        //sp.setLeftComponent(viewPanel);
        sp.setLeftComponent(vp);
        sp.setRightComponent(cp);
        sp.setDividerSize(5);
        sp.setDividerLocation(1600);

        panel.add(sp, BorderLayout.CENTER);
        panel.add(jp, BorderLayout.NORTH);
//
        frame.add(panel);
//        //frame.add(stateBar, BorderLayout.NORTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }



    private class MyMouseListener extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                jPopMenu.show(ctext, e.getX(), e.getY());
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        String name= e.getActionCommand();
        if(name.equals("Copy(C)"))
        {
            String temp=ctext.getSelectedText();
            StringSelection content = new StringSelection(temp);
            clipboard.setContents(content,null);
        }
        if(name.equals("Clear"))
        {
            ctext.setText("Verification information...\n");
        }
    }

    public Graph GRun() throws IOException, AlgExceptionI {
        String src = this.textEditor.contralPanel.fileOperation.getPath();
        String name = this.textEditor.contralPanel.fileOperation.getFileName();
        String url = src + name + ".smv";
        Env.resetEnv();
        Env.loadModule(url);
        SMVModule main = (SMVModule) Env.getModule("main");
        main.setFullPrintingMode(true);
        ctext.setText(ctext.getText().toString() + "\n========= DONE Loading Modules ============");

        String parse = text.getText();
        Spec[] all_specs = Env.loadSpecString(parse);
        ctext.setText(ctext.getText().toString() + "\n========= DONE Loading Specs ============");
        AlgRunnerThread runner;
        if (all_specs[0].isCTLSpec()||all_specs[0].isRealTimeCTLSpec() || all_specs[0].isCTLKSpec() ||all_specs[0].isRealTimeCTLKSpec() ) {
            RTCTLKModelCheckAlg algorithm = new RTCTLKModelCheckAlg(main, all_specs[0]);
            algorithm.SetText(ctext);

            runner = new AlgRunnerThread(algorithm);
            runner.runSequential();
            if (runner.getDoResult() != null)
                System.out.println(runner.getDoResult().resultString());
            if (runner.getDoException() != null)
                System.err.println(runner.getDoException().getMessage());
            this.graph = algorithm.GetGraph();
//            ViewGraphThread r = new ViewGraphThread(this.graph);
//            Thread t = new Thread(r);
//            t.start();
            //vp=SetGraph();
            SetGraphThread x = new SetGraphThread(this.graph, ctext, sp, vp);
            Thread y = new Thread(x);
            y.start();
        } else if (all_specs[0].isRealTimeLTLSpec()) {
            LTLModelCheckAlg checker = new LTLModelCheckAlg(main, all_specs[0]);
            // model checking a module
            checker.preAlgorithm();
            //System.out.println(i+checker.doAlgorithm().resultString());
            ctext.setText(ctext.getText().toString() + "\n" + checker.doAlgorithm().resultString());
        } else if (all_specs[0].isRealTimeLTLKSpec()) {
            RTLTLKModelCheckAlg checker = new RTLTLKModelCheckAlg(main, all_specs[0]);
            // model checking a module
            checker.preAlgorithm();
            //System.out.println(i+checker.doAlgorithm().resultString());
            ctext.setText(ctext.getText().toString() + "\n" + checker.doAlgorithm().resultString());
        }
        return null;
    }
}

