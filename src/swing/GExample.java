package swing;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.module.SMVModule;
import edu.wis.jtlv.env.spec.Spec;
import edu.wis.jtlv.lib.AlgExceptionI;
import edu.wis.jtlv.lib.AlgResultI;
import edu.wis.jtlv.lib.AlgRunnerThread;
import edu.wis.jtlv.lib.mc.LTL.LTLModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTCTLK.GraphExplainRTCTLK;
import edu.wis.jtlv.lib.mc.RTCTLK.RTCTLKModelCheckAlg;
import edu.wis.jtlv.lib.mc.RTLTLK.RTLTLKModelCheckAlg;
import org.graphstream.graph.Graph;
import sun.plugin2.util.ColorUtil;

import static edu.wis.jtlv.lib.AlgResultI.ResultStatus.failed;
import static edu.wis.jtlv.lib.AlgResultI.ResultStatus.succeed;


public class GExample implements ActionListener {

    GraphExplainRTCTLK graph;
    JPanel jp;
    JPanel showgraph;
    JPopupMenu jPopMenu;
    JMenuItem copy, clear;
    Clipboard clipboard;
    JButton VerifyButton;
    JButton ClearButton;
    JButton SaveButton;
    Vector<JPanel> SPECVertor = new Vector<JPanel>();
    Vector<JPanel> LTLVertor = new Vector<JPanel>();
    Vector<JPanel> RTCTLSVertor = new Vector<JPanel>();

    Vector<JTextPane> SPECText = new Vector<JTextPane>();
    Vector<JTextPane> LTLText = new Vector<JTextPane>();
    Vector<JTextPane> RTCTLText = new Vector<JTextPane>();


    JPanel SPEC;
    JTextPane specText = new JTextPane();// �ı�����
    JScrollPane specscroll;// �ı�������
    JButton specaButton;
    JButton specmButton;
    JButton specvButton;
    JButton specwButton;

    JPanel LTLSPEC;
    JTextPane ltlText = new JTextPane();// �ı�����
    JScrollPane ltlscroll;// �ı�������
    JButton ltlaButton;
    JButton ltlmButton;
    JButton ltlvButton;
    JButton ltlwButton;

    JPanel RTCTLstarSPEC;
    JTextPane rtctlText = new JTextPane();// �ı�����
    JScrollPane rtctlscroll;// �ı�������
    JButton rtctlaButton;
    JButton rtctlmButton;
    JButton rtctlvButton;
    JButton rtctlwButton;

    JTextPane ctext = new JTextPane();// ����̨����
    JScrollPane scroll;
    JScrollPane cscroll;
    JSplitPane hp;
    JSplitPane vp;
    TextEditor textEditor;
    final String tips = "Please input a SPEC...";
    final String ltltips = "Please input a LTLSPEC...";
    final String rtctltips = "Please input a RTCTLstarSPEC...";

    public GExample(TextEditor textEditor) {
        JFrame frame = new JFrame();
        frame.setTitle("MCTK2-Graphical Verification ");
        //frame.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);// Ĭ��������
        frame.setMinimumSize(new Dimension(1200, 700));
        this.textEditor = textEditor;
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();


        jp = new JPanel();// (new GridLayout(3,1));
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));

        JPanel VerifyClear = new JPanel();
        VerifyClear.setLayout(new BoxLayout(VerifyClear, BoxLayout.X_AXIS));
        VerifyButton = new JButton("Verify ALL");
        ClearButton = new JButton("Delete ALL");
        SaveButton = new JButton("Save ALL");
        VerifyClear.add(VerifyButton);
        VerifyClear.add(Box.createRigidArea(new Dimension(170, 35)));
        VerifyClear.add(ClearButton);
        VerifyClear.add(Box.createRigidArea(new Dimension(170, 35)));
        VerifyClear.add(SaveButton);
        jp.add(VerifyClear);
        ClearButton.addActionListener(this);
        VerifyButton.addActionListener(this);
        SaveButton.addActionListener(this);

        SPEC = new JPanel();
        SPEC.setLayout(new BoxLayout(SPEC, BoxLayout.Y_AXIS));

        JPanel specpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        specmButton = new JButton("-");
        specaButton = new JButton("+");
        JLabel specBar = new JLabel("        SPEC          ");
        specBar.setHorizontalTextPosition(SwingConstants.CENTER);
        specvButton = new JButton("Verify");
        specwButton = new JButton("Witness");


        // insertDocument(specText,tips,Color.blue);
        specText.setPreferredSize(new Dimension(650, 50));
        specText.setText(tips);
        specText.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
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
        specpanel.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
        specaButton.addActionListener(this);
        specmButton.addActionListener(this);
        specvButton.addActionListener(this);
        specwButton.addActionListener(this);
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


        ltlText.setPreferredSize(new Dimension(650, 50));
        ltlText.setText(ltltips);
        ltlText.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
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
        ltlpanel.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
        ltlaButton.addActionListener(this);
        ltlmButton.addActionListener(this);
        ltlvButton.addActionListener(this);
        ltlwButton.addActionListener(this);

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


        rtctlText.setPreferredSize(new Dimension(650, 50));
        rtctlText.setText(rtctltips);
        rtctlText
                .setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
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
        rtctlpanel.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
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

        ctext = new JTextPane();
        cscroll = new JScrollPane(ctext);
        insertDocument(ctext, "Verification information...", Color.BLUE, 1);

        //ctext.setFont(new Font("�꿬��", Font.TRUETYPE_FONT, 15));
        //insertDocument(ctext, "Node information...", Color.red);

        cscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        cscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        copy = new JMenuItem("Copy(C)");
        clear = new JMenuItem("Clear");
        jPopMenu = new JPopupMenu();
        jPopMenu.add(copy);
        jPopMenu.add(clear);
        copy.addActionListener(this);
        clear.addActionListener(this);
        ctext.add(jPopMenu);
        ctext.addMouseListener(new MyMouseListener());

        showgraph = new JPanel(new BorderLayout());//��ʼ��
        hp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        hp.setLeftComponent(showgraph);
        hp.setRightComponent(cscroll);
        hp.setDividerSize(5);//���÷ָ�����С��������Ϊ��λ
        hp.setDividerLocation(1600);

        vp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        // cp.setOrientation();
        vp.setTopComponent(scroll);
        vp.setBottomComponent(hp);
        vp.setDividerSize(6);//���÷ָ�����С��������Ϊ��λ
        vp.setDividerLocation(0.8);

         //=========================================================================================
         //ReadSMVSpec();//��ȡSMV���ı�����
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                textEditor.setEnabled(true);
            }
        });
        frame.add(vp);
        frame.setVisible(true);
        //frame.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == copy) {
            String temp = ctext.getSelectedText();
            StringSelection content = new StringSelection(temp);
            clipboard.setContents(content, null);
        }
        if (e.getSource() == clear) {
            ctext.setText("");
            insertDocument(ctext, "Verification information...", Color.BLUE, 1);
        }
        if (e.getSource() == specaButton
                || e.getActionCommand().equals("specADD")) {
            NewSpec("");
        }
        if (e.getSource() == specvButton) {
            String specific = specText.getText();
            if (tips.equalsIgnoreCase(specific) || specific.equals(""))
                insertDocument(ctext, "\n Sorry,please input a specification !", new Color(60, 179, 113), 2);
            else
                try {
                    GRun("SPEC ".concat(specific), false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (AlgExceptionI algExceptionI) {
                    algExceptionI.printStackTrace();
                }
        }
        if (e.getSource() == specwButton) {
            String specific = specText.getText();
            if (tips.equalsIgnoreCase(specific) || specific.equals(""))
                insertDocument(ctext, "\n Sorry,please input a specification !", new Color(60, 179, 113), 2);
            else
                try {
                    GRun("SPEC ".concat(specific), true);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (AlgExceptionI algExceptionI) {
                    algExceptionI.printStackTrace();
                }
        }
        if (e.getSource() == ltlaButton
                || e.getActionCommand().equals("ltlADD")) {
            NewLTLSpec("");
        }
        if (e.getSource() == rtctlaButton
                || e.getActionCommand().equals("rtctlADD")) {
            NewRTCTLSpec("");
        }
        if (e.getSource() == VerifyButton) {
            String parse = GetAllSpec();
            if ("".equals(parse))
                insertDocument(ctext, "\n Sorry,please input a specification !", new Color(60, 179, 113), 2);
                //ctext.setText(ctext.getText() + "\n Sorry,please input a specification !");
            else
                try {
                    GRun(parse, false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (AlgExceptionI algExceptionI) {
                    algExceptionI.printStackTrace();
                }

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

        if (e.getSource() == SaveButton) {
            //��ȡ�������ʱ��浽SMV�ļ�
            String parse = GetAllSpec();
            this.textEditor.text.setText(this.textEditor.text.getText() + parse);
            if (this.textEditor.contralPanel.fileOperation.save())
                textEditor.setLeftSplitPane(this.textEditor.contralPanel.fileOperation.setFileList());
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

    private class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                jPopMenu.show(ctext, e.getX(), e.getY());
            }
        }
    }
    // ��̬������*****************
    protected void NewSpec(String property) {
        JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton specmB = new JButton("-");
        JButton specaB = new JButton("+");
        JLabel specBar = new JLabel("        SPEC          ");
        JButton specvB = new JButton("Verify");
        JButton specwB = new JButton("Witness");
        specaB.setActionCommand("specADD");

        String tips = "Please input a SPEC...";
        JTextPane specT = new JTextPane();// �ı�����
        specT.setPreferredSize(new Dimension(650, 50));
        if (property.equals(""))
          specT.setText(tips);
        else
            specT.setText(property);
        specT.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
        JScrollPane specscro = new JScrollPane(specT);
        specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        specp.add(specaB);
        specp.add(specmB);
        specp.add(specBar);
        specp.add(specscro);
        specp.add(specvB);
        specp.add(specwB);
        specp.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
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
                    int r = SPECVertor.indexOf(specp);
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
                    String specific = specT.getText();
                    if (tips.equalsIgnoreCase(specific) || specific.equals(""))
                        insertDocument(ctext, "\n Sorry,please input a specification !", new Color(60, 179, 113), 2);
                    else
                        try {
                            GRun("SPEC ".concat(specific), false);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        } catch (AlgExceptionI algExceptionI) {
                            algExceptionI.printStackTrace();
                        }
                }
            }
        });

        specwB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == specwB) {
                    String specific = specT.getText();
                    if (tips.equalsIgnoreCase(specific) || specific.equals(""))
                        insertDocument(ctext, "\n Sorry,please input a specification !", new Color(60, 179, 113), 2);
                    else
                        try {
                            GRun("SPEC ".concat(specific), true);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        } catch (AlgExceptionI algExceptionI) {
                            algExceptionI.printStackTrace();
                        }
                }
            }
        });
    }

    protected void NewLTLSpec(String property) {
        JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton specmB = new JButton("-");
        JButton specaB = new JButton("+");
        JLabel specBar = new JLabel("      LTLSPEC      ");
        JButton specvB = new JButton("Verify");
        JButton specwB = new JButton("Witness");
        specaB.setActionCommand("ltlADD");


        String tips = "Please input a LTLSPEC...";
        JTextPane specT = new JTextPane();// �ı�����
        specT.setPreferredSize(new Dimension(650, 50));
        if (property.equals(""))
            specT.setText(tips);
        else
            specT.setText(property);
        specT.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
        JScrollPane specscro = new JScrollPane(specT);
        specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        specp.add(specaB);
        specp.add(specmB);
        specp.add(specBar);
        specp.add(specscro);
        specp.add(specvB);
        specp.add(specwB);
        specp.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
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
                    int r = LTLVertor.indexOf(specp);
                    LTLVertor.removeElementAt(r);
                    LTLText.removeElementAt(r);
                    LTLSPEC.revalidate();
                }
            }
        });
    }

    // ��̬������*****************
    protected void NewRTCTLSpec(String property) {

        JPanel specp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton specmB = new JButton("-");
        JButton specaB = new JButton("+");
        JLabel specBar = new JLabel("RTCTLstarSPEC");
        JButton specvB = new JButton("Verify");
        JButton specwB = new JButton("Witness");
        specaB.setActionCommand("rtctlADD");

        String tips = "Please input a RTCTLstarSPEC...";
        JTextPane specT = new JTextPane();// �ı�����
        specT.setPreferredSize(new Dimension(650, 50));
        if (property.equals(""))
            specT.setText(tips);
        else
            specT.setText(property);
        specT.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 15));
        JScrollPane specscro = new JScrollPane(specT);
        specscro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        specscro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        specp.add(specaB);
        specp.add(specmB);
        specp.add(specBar);
        specp.add(specscro);
        specp.add(specvB);
        specp.add(specwB);
        specp.setPreferredSize(new Dimension(200, 100)); // ���������Ĵ�С
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
                    int r = RTCTLSVertor.indexOf(specp);
                    RTCTLSVertor.removeElementAt(r);
                    RTCTLText.removeElementAt(r);
                    RTCTLstarSPEC.revalidate();
                }
            }
        });
    }


    protected String GetAllSpec() {
        // TODO Auto-generated method stub
        String specstr = "";
        Iterator<JTextPane> itspec = SPECText.iterator();
        while (itspec.hasNext()) {
            String s = itspec.next().getText();
            if (!"".equals(s) && !s.equals("Please input a SPEC...") && !!s.trim().startsWith("--"))//��ȥע��
                specstr += "\nSPEC " + s;
        }

        String ltlstr = "";
        Iterator<JTextPane> itltl = LTLText.iterator();
        while (itltl.hasNext()) {
            String s = itltl.next().getText();
            if (!"".equals(s) && !s.equals("Please input a LTLSPEC...") && !!s.trim().startsWith("--"))
                ltlstr += s;
        }
        //System.out.println("VerifyButton!"+ltlstr);


        String rtctlstr = "";
        Iterator<JTextPane> itrtctll = RTCTLText.iterator();
        while (itrtctll.hasNext()) {
            String s = itrtctll.next().getText();
            if (!"".equals(s) && !s.equals("Please input a RTCTLstarSPEC...") && !s.trim().startsWith("--"))
                rtctlstr += s;
        }
        //System.out.println("VerifyButton!"+rtctlstr);

        return specstr + ltlstr + rtctlstr;
    }

    protected void ReadSMVSpec() {
        String src=textEditor.contralPanel.fileOperation.getPath();
        String name=textEditor.contralPanel.fileOperation.getFileName();
        String	url=src+name+".smv";
        Env.resetEnv();
        try {
            Env.loadModule(url);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        SMVModule main = (SMVModule) Env.getModule("main");
        main.setFullPrintingMode(true);
        System.out.println("\n========= DONE Loading Modules ============");

        String parse = GetProperty(textEditor.text.getText().toString());
        System.out.println("parse---" + parse);

        Spec[] all_specs = Env.loadSpecString(parse);

        for (int i = 0; i < all_specs.length; i++){
            System.out.println(i+"------" + all_specs[i]);
        if (all_specs[i].isCTLSpec() || all_specs[i].isRealTimeCTLSpec() || all_specs[i].isCTLKSpec() || all_specs[i].isRealTimeCTLKSpec()) {
            if (i == 0)
                specText.setText(all_specs[i].toString());
            else
                NewSpec(all_specs[i].toString());
        } else if (all_specs[i].isLTLSpec() || all_specs[i].isRealTimeLTLSpec() || all_specs[i].isRealTimeLTLKSpec()) {
            if (i == 0)
                ltlText.setText(all_specs[i].toString());
            else
                NewLTLSpec(all_specs[i].toString());
        }
        //RTCTL star ����
    }
    }

    public String GetProperty(String spec) {
        String ms=spec.replaceAll("[-]+[\\s\\S&&[^\n]]*[\r\n]+", "");
        String regEx = "(CTLSPEC|LTLSPEC|SPEC)[\\s\\S&&[^\n]]*\\;[\\s]*$";
        // ����������ʽ
        Pattern pattern = Pattern.compile(regEx,Pattern.MULTILINE);  ;
        Matcher matcher = pattern.matcher(ms);
        ArrayList<String> tempList = new ArrayList<String>();
        while(matcher.find()){
            tempList.add(matcher.group());
        }
        String s="";
        for(String temp : tempList){
            s=s + temp;
        }
        return s;
    }
    public static void insertDocument(JTextPane JTP, String str, Color textColor, int setFont)// ���ݴ������ɫ�����֣������ֲ������̨
    {
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setForeground(set, textColor);// ����������ɫ
        StyleConstants.setFontSize(set, 18);// ���������С
        switch (setFont) {
            case 1://�������
                StyleConstants.setFontFamily(set, "������");
            case 2://��ʾ�����棬�쳣
                StyleConstants.setFontFamily(set, "�꿬��");
            case 3://������ʾ
                StyleConstants.setFontFamily(set, "�����п�");
            default:
                StyleConstants.setFontFamily(set, "΢���ź�");
        }
        Document doc = JTP.getDocument();
        try {
            doc.insertString(doc.getLength(), str, set);// ��������
        } catch (BadLocationException e) {
        }
    }

    public Graph GRun(String parse, Boolean isgraph) throws IOException, AlgExceptionI {
        String src = this.textEditor.contralPanel.fileOperation.getPath();
        String name = this.textEditor.contralPanel.fileOperation.getFileName();
        String url = src + name + ".smv";
        Env.resetEnv();
        Env.loadModule(url);
        SMVModule main = (SMVModule) Env.getModule("main");
        main.setFullPrintingMode(true);
        insertDocument(ctext, "\n========= DONE Loading Modules ============", Color.ORANGE, 1);

        Spec[] all_specs = Env.loadSpecString(parse);
        insertDocument(ctext, "\n========= DONE Loading Specs ============", Color.ORANGE, 1);

        AlgRunnerThread runner;
        for (int i = 0; i < all_specs.length; i++) {
            if (all_specs[i].isCTLSpec() || all_specs[i].isRealTimeCTLSpec() || all_specs[i].isCTLKSpec() || all_specs[i].isRealTimeCTLKSpec()) {
                RTCTLKModelCheckAlg algorithm = new RTCTLKModelCheckAlg(main, all_specs[i]);
                algorithm.SetText(ctext);

                if (isgraph) {//��ͼ�ķ���
                    algorithm.SetShowGraph(true);
                    runner = new AlgRunnerThread(algorithm);
                    runner.runSequential();

                    if (runner.getDoResult() != null)
                        insertDocument(ctext, "\n" + runner.getDoResult().resultString(), Color.BLACK, 1);
                    if (runner.getDoException() != null)
                        insertDocument(ctext, "\n" + runner.getDoException().getMessage(), Color.BLACK, 1);

                    if (runner.getDoResult().getResultStat() == failed) {//property���Ϊ�� û��ͼ�η���
                        this.graph = algorithm.GetGraph();
                        SetGraphThread x = new SetGraphThread(this.graph, ctext, hp, showgraph);
                        Thread y = new Thread(x);
                        y.start();
                    }
                } else//ֻ������֤���
                {
                    runner = new AlgRunnerThread(algorithm);
                    runner.runSequential();
                    if (runner.getDoResult() != null)
                        insertDocument(ctext, "\n" + runner.getDoResult().resultString(), Color.BLACK, 1);
                    if (runner.getDoException() != null)
                        insertDocument(ctext, "\n" + runner.getDoException().getMessage(), Color.BLACK, 1);
                }
            } else if (all_specs[i].isLTLSpec() || all_specs[i].isRealTimeLTLSpec() || all_specs[i].isRealTimeLTLKSpec()) {
                LTLModelCheckAlg checker = new LTLModelCheckAlg(main, all_specs[0]);
                // model checking a module
                checker.preAlgorithm();
                //System.out.println(i+checker.doAlgorithm().resultString());
                ctext.setText(ctext.getText().toString() + "\n" + checker.doAlgorithm().resultString());
            }
            //RTCTL star ����


        }
        return null;
    }
}

