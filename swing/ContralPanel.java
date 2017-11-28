package swing;


import edu.wis.jtlv.lib.AlgExceptionI;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ContralPanel extends JPanel implements ActionListener{

	TextEditor textEditor;
	FileOperation fileOperation;
	JMenuBar menubar;
	TextEditor ConsoleEditor;
	UndoManager uo;
	Document doc;


	//创建工具栏
	JPanel toolBar=new JPanel();

	private JButton newButton;
	private JButton openButton;
	private JButton saveAsButton;
	private JButton saveButton;
	private JButton undoButton;
	private JButton redoButton;
	private JButton cutButton;
	private JButton copyButton;
	private JButton pasteButton;

	public ContralPanel(TextEditor textEditor)
	{
		this.textEditor=textEditor;
		fileOperation=new FileOperation(textEditor);
		creatMenu();
	}


	public void creatMenu()
	{
		menubar=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu style=new JMenu("Style");
		//JMenu language=new JMenu("语言");
		JMenu about=new JMenu("Help");
		JMenu run=new JMenu("Run");

		menubar.add(file);
		menubar.add(edit);
		menubar.add(style);
		//menubar.add(language);
		menubar.add(run);
		menubar.add(about);

		JMenuItem newFile=new JMenuItem("New");
		setShortcut(newFile, KeyEvent.VK_N);
		JMenuItem open=new JMenuItem("Open File");
		setShortcut(open, KeyEvent.VK_O);
		JMenuItem save=new JMenuItem("Save");
		setShortcut(save, KeyEvent.VK_S);
		JMenuItem saveas=new JMenuItem("Save As");
		JMenuItem quit=new JMenuItem("Close");
		setShortcut(quit, KeyEvent.VK_Q);
		JMenuItem setFont=new JMenuItem("Set Front");

		JMenuItem redo=new JMenuItem("Undo");
		setShortcut(redo, KeyEvent.VK_Z);
		JMenuItem undo=new JMenuItem("Redo");
		setShortcut(undo, KeyEvent.VK_Y);


		JMenuItem copy=new JMenuItem("Copy");
		setShortcut(copy, KeyEvent.VK_C);
		JMenuItem paste=new JMenuItem("Paste");
		setShortcut(paste, KeyEvent.VK_V);
		JMenuItem cut=new JMenuItem("Cut");
		setShortcut(cut, KeyEvent.VK_X);
		JMenuItem selall=new JMenuItem("Select All");
		setShortcut(cut, KeyEvent.VK_A);

		JMenuItem about1=new JMenuItem("About information");
		JMenuItem about2=new JMenuItem("Useage Introduction");
		JMenuItem smvRun=new JMenuItem("Verify SMV Property");
		setShortcut(smvRun, KeyEvent.VK_F11);
		JMenuItem graphexamp= new JMenuItem("Graph Counter-example");
		setShortcut(graphexamp, KeyEvent.VK_W);

		file.add(newFile);
		file.addSeparator();
		file.add(open);
		file.addSeparator();
		file.add(save);
		file.addSeparator();
		file.add(saveas);
		file.addSeparator();
		file.add(quit);
		edit.add(undo);
		edit.add(redo);
		edit.add(copy);
		edit.add(paste);
		edit.add(cut);
		edit.add(selall);


		style.add(setFont);
//		language.add(java);
//		language.addSeparator();
//		language.add(c);
//		language.addSeparator();
//		language.add(html);
		//language.add(smv);
		//language.addSeparator();
		about.add(about1);
		about.addSeparator();
		about.add(about2);
		run.add(smvRun);
		run.add(graphexamp);

		textEditor.addWindowListener (new WindowAdapter ()
		{
			// 按下窗口关闭钮事件处理
			public void windowClosing ( WindowEvent e )
			{
				int exi = JOptionPane.showConfirmDialog (null, "Do you want to quit the program?", "Confirm Exit", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (exi == JOptionPane.OK_OPTION)
				{
//					if(fileOperation.save())//退出时自动保存smv文件
//						textEditor.setLeftSplitPane(fileOperation.setFileList());
					System.exit (0);
				}
				else
				{
					return;
				}
			}
		});

		newFile.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		quit.addActionListener(this);
		undo.addActionListener(this);
		redo.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		cut.addActionListener(this);
		selall.addActionListener(this);

		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
//		URL newUrl=getClass().getResource("swing/Icons/New.gif");
//		ImageIcon newIcon=new ImageIcon(getToolkit().getImage(newUrl));
		Icon newIcon=new ImageIcon("swing/Icons/New.gif");
		Icon openIcon=new ImageIcon("swing/Icons/Open.gif");
		Icon saveIcon=new ImageIcon("swing/Icons/Save.gif");
		Icon saveAsIcon=new ImageIcon("swing/Icons/SaveAs.gif");
		Icon undoIcon=new ImageIcon("swing/Icons/Undo.gif");
		Icon redoIcon=new ImageIcon("swing/Icons/Redo.gif");
		Icon cutIcon=new ImageIcon("swing/Icons/Cut.gif");
		Icon copyIcon=new ImageIcon("swing/Icons/Copy.gif");
		Icon pasteIcon=new ImageIcon("swing/Icons/Paste.gif");

		newButton= new JButton(newIcon);
		openButton=new JButton(openIcon);
		saveButton= new JButton(saveIcon);
		saveAsButton=new JButton(saveAsIcon);
		undoButton=new JButton(undoIcon);
		redoButton=new JButton(redoIcon);
		cutButton=new JButton(cutIcon);
		copyButton=new JButton(copyIcon);
		pasteButton=new JButton(pasteIcon);

		newButton.setPreferredSize(new Dimension(22,22));
		openButton.setPreferredSize(new Dimension(22,22));
		saveButton.setPreferredSize(new Dimension(22,22));
		saveAsButton.setPreferredSize(new Dimension(22,22));
		undoButton.setPreferredSize(new Dimension(22,22));
		redoButton.setPreferredSize(new Dimension(22,22));
		cutButton.setPreferredSize(new Dimension(22,22));
		copyButton.setPreferredSize(new Dimension(22,22));
		pasteButton.setPreferredSize(new Dimension(22,22));

		//注册工具栏按钮事件
		newButton.addActionListener(this);
		openButton.addActionListener(this);
		saveButton.addActionListener(this);
		saveAsButton.addActionListener(this);
		undoButton.addActionListener(this);
		redoButton.addActionListener(this);
		cutButton.addActionListener(this);
		copyButton.addActionListener(this);
		pasteButton.addActionListener(this);

		//设置按钮提示文字
		newButton.setToolTipText("New File");
		openButton.setToolTipText("Open");
		saveButton.setToolTipText("Save");
		saveAsButton.setToolTipText("Save As");
		undoButton.setToolTipText("Undo");
		redoButton.setToolTipText("Redo");
		cutButton.setToolTipText("Cut");
		copyButton.setToolTipText("Copy");
		pasteButton.setToolTipText("Paste");
		//向工具栏添加按钮
		toolBar.add(newButton);
		toolBar.add(openButton);
		toolBar.add(saveButton);
		toolBar.add(saveAsButton);
		toolBar.add(undoButton);
		toolBar.add(redoButton);
		toolBar.add(cutButton);
		toolBar.add(copyButton);
		toolBar.add(pasteButton);

		//改变标题栏窗口左侧默认图标
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image   image=tk.createImage("swing/Icons/Notepad.gif");
		this.textEditor.setIconImage(image);





		uo = new UndoManager();
		doc=textEditor.text.getDocument();
		doc.addUndoableEditListener(new UndoableEditListener()
		{
			public void undoableEditHappened(UndoableEditEvent e)
			{
				uo.addEdit(e.getEdit());
			}
		});

		setFont.addActionListener(this);
//		c.addActionListener(this);
//		java.addActionListener(this);
//		html.addActionListener(this);
//		smv.addActionListener(this);
		about1.addActionListener(this);
		about2.addActionListener(this);
		smvRun.addActionListener(this);
		graphexamp.addActionListener(this);
	}

	public void addMenuBar()
	{
		textEditor.setJMenuBar(menubar);
		textEditor.add("North", toolBar);
	}

	public void setShortcut(JMenuItem jmi,int key)
	{
		KeyStroke ms1 = KeyStroke.getKeyStroke(key,InputEvent.CTRL_MASK);
		jmi.setMnemonic(key);
		jmi.setAccelerator(ms1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Save")||e.getSource()==saveButton)
		{
			if(fileOperation.save())
				textEditor.setLeftSplitPane(fileOperation.setFileList());
		}
		if(e.getActionCommand().equals("Save As")||e.getSource()==saveAsButton)
		{
			if(fileOperation.SaveAs())
				textEditor.setLeftSplitPane(fileOperation.setFileList());
		}
		if(e.getActionCommand().equals("New")||e.getSource()==newButton)
		{
			if(fileOperation.creat())
				textEditor.setLeftSplitPane(fileOperation.setFileList());
		}
		if(e.getActionCommand().equals("Open File")||e.getSource()==openButton)
		{
			if(fileOperation.open())
				textEditor.setLeftSplitPane(fileOperation.setFileList());
		}
		if(e.getActionCommand().equals("Close"))
		{
			textEditor.dispose();
		}
		if(e.getActionCommand().equals("Set Front"))
		{
			new SetFont(textEditor);
		}
		if(e.getActionCommand().equals("Undo")||e.getSource()==undoButton)
		{
			if(uo.canUndo())
				uo.undo();
			System.out.println("Undo");
		}
		if(e.getActionCommand().equals("Redo")||e.getSource()==redoButton)
		{
			if(uo.canRedo())
			uo.redo();
			System.out.println("Redo");
		}
		if(e.getActionCommand().equals("Copy")||e.getSource()==copyButton)
		{
			textEditor.text.copy();// 复制
			System.out.println("Copy");
		}
		if(e.getActionCommand().equals("Paste")||e.getSource()==pasteButton)
		{
			textEditor.text.paste();// 粘贴
			textEditor.setRowContent();
			System.out.println("Paste");
		}
		if(e.getActionCommand().equals("Cut")||e.getSource()==cutButton)
		{
			textEditor.text.cut();// 粘贴
			textEditor.setRowContent();
			System.out.println("Cut");
		}
		if(e.getActionCommand().equals("Select All"))
		{
			textEditor.text.selectAll();// 全选
			System.out.println("Select All");
		}
//		if(e.getActionCommand().equals("Java"))
//		{
//			textEditor.setLanguage("java");
//		}
//		if(e.getActionCommand().equals("SMV"))
//		{
//			textEditor.setLanguage("smv");
//		}

		if(e.getActionCommand().equals("About information"))
		{
			JOptionPane.showMessageDialog(null,"Developer:   LXY,LS ......\nEmail:   liangsen@hqu.edu.cn\nVersion:1.0.0(Free)","About",JOptionPane.PLAIN_MESSAGE);
		}

		if(e.getActionCommand().equals("Useage Introduction"))
		{
			JOptionPane.showMessageDialog(null,"1.Please make sure that the JAVA environment is configured correctly, otherwise it cannot be compiled and run."+ "\n2.JDK1.8.0 and above.","Useage Introduction",JOptionPane.PLAIN_MESSAGE);
//					+ "\n2.目前仅支持Java语言编译"
//					+"\n3.运行HTML文档请设置好默认浏览器","使用说明",JOptionPane.PLAIN_MESSAGE);
		}
		if(e.getActionCommand().equals("Verify SMV Property"))
		{
			//System.out.println("Verify smv Property...");
			textEditor.jtext.setText(textEditor.jtext.getText().toString()+"\nVerify SMV Property");
			fileOperation.save();
			//String src=fileOperation.getPath();
			//String name=fileOperation.getFileName();
			//TextEditor currentText=this.textEditor;
			try {
				new Run().smvRun(this.textEditor);
			} catch (AlgExceptionI algExceptionI) {
				algExceptionI.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Graph Counter-example"))
		{
				//textEditor.jtext.setText(textEditor.jtext.getText().toString()+"\ngraphexamp.isSelected()");
				textEditor.setEnabled(false);
				GraphThread r = new GraphThread(this.textEditor);
				Thread t = new Thread(r);
				t.start();
		}
	}




}
