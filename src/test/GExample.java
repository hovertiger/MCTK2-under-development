package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

public class GExample extends JFrame implements ViewerListener, ActionListener {
	protected boolean loop = true;
	Graph graph = new SingleGraph("Clicks");
	JPanel jp;
	JButton VerifyButton;
	JButton ClearButton;
	Vector<JPanel> SPECVertor = new Vector<JPanel>();
	Vector<JPanel> LTLVertor = new Vector<JPanel>();
	Vector<JPanel> RTCTLSVertor = new Vector<JPanel>();
    
	Vector<JTextPane> SPECText = new Vector<JTextPane>();
    Vector<JTextPane> LTLText = new Vector<JTextPane>();
    Vector<JTextPane> RTCTLText = new Vector<JTextPane>();
    
    
	JPanel SPEC;
	JTextPane specText = new JTextPane();// 文本窗格
	JScrollPane specscroll;// 文本滚动条
	JButton specaButton;
	JButton specmButton;
	JButton specvButton;
	JButton specwButton;

	JPanel LTLSPEC;
	JTextPane ltlText = new JTextPane();// 文本窗格
	JScrollPane ltlscroll;// 文本滚动条
	JButton ltlaButton;
	JButton ltlmButton;
	JButton ltlvButton;
	JButton ltlwButton;

	JPanel RTCTLstarSPEC;
	JTextPane rtctlText = new JTextPane();// 文本窗格
	JScrollPane rtctlscroll;// 文本滚动条
	JButton rtctlaButton;
	JButton rtctlmButton;
	JButton rtctlvButton;
	JButton rtctlwButton;

	JTextPane ctext = new JTextPane();// 控制台窗格
	private JScrollPane scroll;
	private JScrollPane cscroll;
	private JSplitPane hp;
	private JSplitPane vp;

	public static void main(String args[]) {
		new GExample();
	}

	public GExample() {

		super("MCTK2-Graphical Verification ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);// 默认最大界面
		setMinimumSize(new Dimension(1200, 700));

		jp = new JPanel();// (new GridLayout(3,1));
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));

		JPanel VerifyClear = new JPanel();
		VerifyClear.setLayout(new BoxLayout(VerifyClear, BoxLayout.X_AXIS));
		VerifyButton = new JButton("Verify ALL");
		ClearButton = new JButton("Delete ALL");
		VerifyClear.add(VerifyButton);
		VerifyClear.add(Box.createRigidArea(new Dimension(200, 35)));
		VerifyClear.add(ClearButton);
		jp.add(VerifyClear);
		ClearButton.addActionListener(this);
		VerifyButton.addActionListener(this);

		
		SPEC = new JPanel();
		SPEC.setLayout(new BoxLayout(SPEC, BoxLayout.Y_AXIS));

		JPanel specpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		specmButton = new JButton("-");
		specaButton = new JButton("+");
		JLabel specBar = new JLabel("        SPEC          ");
		specBar.setHorizontalTextPosition(SwingConstants.CENTER);
		specvButton = new JButton("Verify");
		specwButton = new JButton("Witness");

		String tips = "Please input a SPEC...";
		// insertDocument(specText,tips,Color.blue);
		specText.setPreferredSize(new Dimension(650, 50));
		specText.setText(tips);
		specText.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		specscroll = new JScrollPane(specText);
		specscroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		specscroll
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		specpanel.add(specaButton);
		specpanel.add(specmButton);
		specpanel.add(specBar);
		specpanel.add(specscroll);
		specpanel.add(specvButton);
		specpanel.add(specwButton);
		specpanel.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		specaButton.addActionListener(this);
		specmButton.addActionListener(this);
		SPEC.add(specpanel);
		SPECVertor.add(specpanel);
		SPECText.add(specText);
		specText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tips.equalsIgnoreCase(specText.getText())) {
                	specText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(specText.getText())) {
                	specText.setText(tips);
                }
            }
        });

		LTLSPEC = new JPanel();
		LTLSPEC.setLayout(new BoxLayout(LTLSPEC, BoxLayout.Y_AXIS));
		JPanel ltlpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		ltlmButton = new JButton("-");
		ltlaButton = new JButton("+");
		JLabel ltlBar = new JLabel("      LTLSPEC      ");
		ltlvButton = new JButton("Verify");
		ltlwButton = new JButton("Witness");

		String ltltips = "Please input a LTLSPEC...";
		ltlText.setPreferredSize(new Dimension(650, 50));
		ltlText.setText(ltltips);
		ltlText.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		ltlscroll = new JScrollPane(ltlText);
		ltlscroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		ltlscroll
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		ltlpanel.add(ltlaButton);
		ltlpanel.add(ltlmButton);
		ltlpanel.add(ltlBar);
		ltlpanel.add(ltlscroll);
		ltlpanel.add(ltlvButton);
		ltlpanel.add(ltlwButton);
		ltlpanel.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		ltlaButton.addActionListener(this);
		ltlmButton.addActionListener(this);
		LTLSPEC.add(ltlpanel);
		LTLVertor.add(ltlpanel);
		LTLText.add(ltlText);
		ltlText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ltltips.equalsIgnoreCase(ltlText.getText())) {
                	ltlText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(ltlText.getText())) {
                	ltlText.setText(ltltips);
                }
            }
        });
		

		RTCTLstarSPEC = new JPanel();
		RTCTLstarSPEC.setLayout(new BoxLayout(RTCTLstarSPEC, BoxLayout.Y_AXIS));

		JPanel rtctlpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		rtctlmButton = new JButton("-");
		rtctlaButton = new JButton("+");
		JLabel rtctlBar = new JLabel("RTCTLstarSPEC");
		rtctlvButton = new JButton("Verify");
		rtctlwButton = new JButton("Witness");

		String rtctltips = "Please input a RTCTLstarSPEC...";
		rtctlText.setPreferredSize(new Dimension(650, 50));
		rtctlText.setText(rtctltips);
		rtctlText
				.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		rtctlscroll = new JScrollPane(rtctlText);
		rtctlscroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		rtctlscroll
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		rtctlpanel.add(rtctlaButton);
		rtctlpanel.add(rtctlmButton);
		rtctlpanel.add(rtctlBar);
		rtctlpanel.add(rtctlscroll);
		rtctlpanel.add(rtctlvButton);
		rtctlpanel.add(rtctlwButton);
		rtctlpanel.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		rtctlaButton.addActionListener(this);
		rtctlmButton.addActionListener(this);
		RTCTLstarSPEC.add(rtctlpanel);
		RTCTLSVertor.add(ltlpanel);
		RTCTLText.add(rtctlText);
		rtctlText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (rtctltips.equalsIgnoreCase(rtctlText.getText())) {
                	rtctlText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(rtctlText.getText())) {
                	rtctlText.setText(rtctltips);
                }
            }
        });
		

		jp.add(SPEC);
		jp.add(LTLSPEC);
		jp.add(RTCTLstarSPEC);

		
		scroll = new JScrollPane(jp);
		// scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 0, 300, 200);
		scroll.setBorder(BorderFactory.createLineBorder(Color.green, 2));

		ctext = new JTextPane();
		cscroll = new JScrollPane(ctext);
		ctext.setForeground(Color.BLACK);
		// ctext.setText("Node information...");
		insertDocument(ctext, "Node information...", Color.red);

		cscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		cscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Viewer viewer = new Viewer(graph,
				Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
		ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);

		hp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

		hp.setLeftComponent(viewPanel);
		hp.setRightComponent(cscroll);
		hp.setDividerSize(5);//设置分隔条大小，以像素为单位
		hp.setDividerLocation(1600);

		
		
		vp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		// cp.setOrientation();
		vp.setTopComponent(scroll);
		vp.setBottomComponent(hp);
		vp.setDividerSize(8);//设置分隔条大小，以像素为单位
		vp.setDividerLocation(80);

		// panel.add(hp,BorderLayout.CENTER);
		// panel.add(vp,BorderLayout.NORTH);

		// getContentPane().add(panel);
		getContentPane().add(vp);
		// getContentPane().add(hp);
		// getContentPane().add(jp);
		// frame.add(stateBar, BorderLayout.NORTH);
		// pack();
		// setLocationRelativeTo(null);
		setVisible(true);
		viewer.enableAutoLayout();

		graph.setAutoCreate(true);
		graph.setStrict(false);
		graph.addEdge("S2S3", "S2", "S3");
		graph.addEdge("S3S4", "S3", "S4");
		graph.addEdge("S4S5", "S4", "S5");
		graph.addEdge("S5S6", "S5", "S6");
		graph.addEdge("S6S7", "S6", "S7");
		graph.addEdge("S7S8", "S7", "S8");
		Node s5 = graph.getNode("S5");
		s5.setAttribute("x", 5);

		graph.addAttribute("ui.stylesheet", "node {\n"
				+ "stroke-mode: plain;"
				+ "shape: circle; "
				+ "\tsize: 40px;\n"
				+
				// "size-mode: fit;" +
				"\tfill-color: green;\n" + "\tz-index: 10;\n"
				+ "text-size: 11;" + "}\n" + "\n" + "edge {\n" + "size: 2px; "
				+ "\tshape: line;\n" + "\tfill-color: blue;\n"
				+ "\tarrow-size: 8px, 6px;\n" + "\tarrow-shape: arrow;\n" + "}");

		for (Node node : graph) {
			node.addAttribute("label", node.getId() + "-AAAAAAAA");
		}
		// The default action when closing the view is to quit
		// the program.
		viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

		// We connect back the viewer to the graph,
		// the graph becomes a sink for the viewer.
		// We also install us as a viewer listener to
		// intercept the graphic events.
		ViewerPipe fromViewer = viewer.newViewerPipe();
		fromViewer.addViewerListener(this);
		fromViewer.addSink(graph);

		// Then we need a loop to do our work and to wait for events.
		// In this loop we will need to call the
		// pump() method before each use of the graph to copy back events
		// that have already occurred in the viewer thread inside
		// our thread.

		while (loop) {
			// fromViewer.pump();
			try {
				fromViewer.blockingPump();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			sleep();
			// or fromViewer.blockingPump(); in the nightly builds
			// here your simulation code.

			// You do not necessarily need to use a loop, this is only an
			// example.
			// as long as you call pump() before using the graph. pump() is non
			// blocking. If you only use the loop to look at event, use
			// blockingPump()
			// to avoid 100% CPU usage. The blockingPump() method is only
			// available from
			// the nightly builds.

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == specaButton
				|| e.getActionCommand().equals("specADD")) {
			NewSpec();
		}
		if (e.getSource() == ltlaButton
				|| e.getActionCommand().equals("ltlADD")) {
			NewLTLSpec();
		}
		if (e.getSource() == rtctlaButton
				|| e.getActionCommand().equals("rtctlADD")) {
			NewRTCTLSpec();
		}
		if (e.getSource() == VerifyButton) {
			
			String specstr="";
			Iterator<JTextPane> itspec=SPECText.iterator();
			while(itspec.hasNext())
			{
				String s=itspec.next().getText();
				if(!"".equals(s)&&!s.equals("Please input a SPEC..."))
					specstr+=s;
			}
			System.out.println("VerifyButton!"+specstr);
			
			
			String ltlstr="";
			Iterator<JTextPane> itltl=LTLText.iterator();
			while(itltl.hasNext())
			{
				String s=itltl.next().getText();
				if(!"".equals(s)&&!s.equals("Please input a LTLSPEC..."))
					ltlstr+=s;
			}
			System.out.println("VerifyButton!"+ltlstr);
			
			
			String rtctlstr="";
			Iterator<JTextPane> itrtctll=RTCTLText.iterator();
			while(itrtctll.hasNext())
			{
				String s=itrtctll.next().getText();
				if(!"".equals(s)&&!s.equals("Please input a RTCTLstarSPEC..."))
					rtctlstr+=s;
			}
			System.out.println("VerifyButton!"+rtctlstr);
		}
		if (e.getSource() == ClearButton) {
			while (SPECVertor.size() > 1) {
				SPEC.remove(SPECVertor.lastElement());
				SPECVertor.remove(SPECVertor.lastElement());
				SPECText.remove(SPECText.lastElement());
				SPEC.revalidate();
			}
			specText.setText("");
			
			while (LTLVertor.size() > 1) {
				LTLSPEC.remove(LTLVertor.lastElement());
				LTLVertor.remove(LTLVertor.lastElement());
				LTLText.remove(LTLText.lastElement());
				LTLSPEC.revalidate();
			}
			ltlText.setText("");
			
			while (RTCTLSVertor.size() > 1) {
				RTCTLstarSPEC.remove(RTCTLSVertor.lastElement());
				RTCTLSVertor.remove(RTCTLSVertor.lastElement());
				RTCTLText.remove(RTCTLText.lastElement());
				RTCTLstarSPEC.revalidate();
			}
			rtctlText.setText("");
		}

		if (e.getSource() == specmButton) {
			specText.setText("");
		}
		if (e.getSource() == ltlmButton) {
			ltlText.setText("");
		}
		if (e.getSource() == rtctlmButton) {
			rtctlText.setText("");
		}

	}

	// 动态添加组件*****************
	protected void NewSpec() {
		JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton specmB = new JButton("-");
		JButton specaB = new JButton("+");
		JLabel specBar = new JLabel("        SPEC          ");
		JButton specvB = new JButton("Verify");
		JButton specwB = new JButton("Witness");
		specaB.setActionCommand("specADD");
		
		String tips = "Please input a SPEC...";
		JTextPane specT = new JTextPane();// 文本窗格
		specT.setPreferredSize(new Dimension(650, 50));
		specT.setText(tips);
		specT.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		JScrollPane specscro = new JScrollPane(specT);
		specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		specp.add(specaB);
		specp.add(specmB);
		specp.add(specBar);
		specp.add(specscro);
		specp.add(specvB);
		specp.add(specwB);
		specp.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		SPEC.add(specp);
		SPECVertor.add(specp);
		SPECText.add(specT);
		SPEC.revalidate();
		
		specT.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tips.equalsIgnoreCase(specT.getText())) {
                	specT.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(specT.getText())) {
                	specT.setText(tips);
                }
            }
        });
		
		specaB.addActionListener(this);
		specmB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == specmB) {
					SPEC.remove(specp);
					int r=SPECVertor.indexOf(specp);
					System.out.print(r);
					SPECVertor.removeElementAt(r);
					SPECText.removeElementAt(r);
					SPEC.revalidate();
				}
			}
		});
		
		specvB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == specvB) {
					 if (tips.equalsIgnoreCase(specT.getText()))
                         ctext.setText(ctext.getText() + "\n Sorry,please input a specification !");
					 else
						 GRun(); 
					//调用验证函数
				}
			}
		});
		
		specwB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == specwB) {
                 //调用验证函数
					if (tips.equalsIgnoreCase(specT.getText()))
                        ctext.setText(ctext.getText() + "\n Sorry,please input a specification !");
					 else
						 GRun(); 
				}
			}
		});
	}

	protected void GRun() {
		// TODO Auto-generated method stub
		
	}

	// 动态添加组件*****************
	protected void NewLTLSpec() {
		JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton specmB = new JButton("-");
		JButton specaB = new JButton("+");
		JLabel specBar = new JLabel("      LTLSPEC      ");
		JButton specvB = new JButton("Verify");
		JButton specwB = new JButton("Witness");
		specaB.setActionCommand("ltlADD");
		

		String tips = "Please input a LTLSPEC...";
		JTextPane specT = new JTextPane();// 文本窗格
		specT.setPreferredSize(new Dimension(650, 50));
		specT.setText(tips);
		specT.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		JScrollPane specscro = new JScrollPane(specT);
		specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		specp.add(specaB);
		specp.add(specmB);
		specp.add(specBar);
		specp.add(specscro);
		specp.add(specvB);
		specp.add(specwB);
		specp.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		LTLSPEC.add(specp);
		LTLVertor.add(specp);
		LTLSPEC.revalidate();
		LTLText.add(specT);
		
		specT.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tips.equalsIgnoreCase(specT.getText())) {
                	specT.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(specT.getText())) {
                	specT.setText(tips);
                }
            }
        });
		
		specaB.addActionListener(this);
		specmB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == specmB) {
					LTLSPEC.remove(specp);
					int r=LTLVertor.indexOf(specp);
					LTLVertor.removeElementAt(r);
					LTLText.removeElementAt(r);
					LTLSPEC.revalidate();
				}
			}
		});
	}

	// 动态添加组件*****************
	protected void NewRTCTLSpec() {

		JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton specmB = new JButton("-");
		JButton specaB = new JButton("+");
		JLabel specBar = new JLabel("RTCTLstarSPEC");
		JButton specvB = new JButton("Verify");
		JButton specwB = new JButton("Witness");
		specaB.setActionCommand("rtctlADD");
		
		String tips = "Please input a RTCTLstarSPEC...";
		JTextPane specT = new JTextPane();// 文本窗格
		specT.setPreferredSize(new Dimension(650, 50));
		specT.setText(tips);
		specT.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 15));
		JScrollPane specscro = new JScrollPane(specT);
		specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		specp.add(specaB);
		specp.add(specmB);
		specp.add(specBar);
		specp.add(specscro);
		specp.add(specvB);
		specp.add(specwB);
		specp.setPreferredSize(new Dimension(200, 100)); // 设置容器的大小
		RTCTLstarSPEC.add(specp);
		RTCTLSVertor.add(specp);
		RTCTLstarSPEC.revalidate();
		RTCTLText.add(specT);
		specT.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tips.equalsIgnoreCase(specT.getText())) {
                	specT.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(specT.getText())) {
                	specT.setText(tips);
                }
            }
        });
		specaB.addActionListener(this);
		specmB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == specmB) {
					RTCTLstarSPEC.remove(specp);
					int r=RTCTLSVertor.indexOf(specp);
					RTCTLSVertor.removeElementAt(r);
					RTCTLText.removeElementAt(r);
					RTCTLstarSPEC.revalidate();
				}
			}
		});
	}


	public void insertDocument(JTextPane JTP, String str, Color textColor)// 根据传入的颜色及文字，将文字插入文本域
	{
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setForeground(set, textColor);// 设置文字颜色
		StyleConstants.setFontSize(set, 18);// 设置字体大小
		Document doc = JTP.getDocument();
		try {
			doc.insertString(doc.getLength(), str, set);// 插入文字
		} catch (BadLocationException e) {
		}
	}

	protected void sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}

	public void viewClosed(String id) {
		loop = false;
	}

	public void buttonPushed(String id) {
		// System.out.println("Button pushed on node " + id);
		// ctext.setText(ctext.getText()+"\n Button pushed on node " + id);
		insertDocument(ctext, "\n Button pushed on node " + id, Color.BLUE);
		if (id.equals("S5")) {
			graph.addEdge("S8S9", "S8", "S9");
			graph.addEdge("S9S5", "S9", "S5");
		}
	}

	public void buttonReleased(String id) {
		// ctext.setText(ctext.getText()+"\n Button released on node "+id);
		insertDocument(ctext, "\n Button released on node " + id, Color.ORANGE);
		// System.out.println("Button released on node "+id);
		Point P = new Point(0, cscroll.getVerticalScrollBar().getMaximum());
		cscroll.getViewport().setViewPosition(P);
	}


	public void mouseLeft(String id) {
		System.out.println("Mouse pushed on node " + id);

	}


	public void mouseOver(String id) {
		System.out.println("Mouse released on node " + id);

	}

}
