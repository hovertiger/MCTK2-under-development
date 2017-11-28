package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetFont implements ActionListener {
	JDialog setFont;
	String[] fontValues={"Regular","Arial","Microsoft YaHei"};//楷体，宋体，微软雅黑
	String[] styleValues={"Regular","Italic","Bold"};//"普通","斜体","粗体"
	int[] styleValues2={Font.PLAIN,Font.ITALIC,Font.BOLD};
	int[] sizeValues={5,6,7,8,9,10,12,14,16,18,20,22,24,26,28,36};
	JComboBox fontValue;
	JComboBox styleValue;
	JComboBox sizeValue;
	TextEditor textEditor;
	public SetFont(TextEditor te)
	{
		
		this.textEditor=te;
		setFont=new JDialog(te);
		setFont.setTitle("Font Settings");//字体设置
		fontValue=new JComboBox();
		styleValue=new JComboBox();
		sizeValue=new JComboBox();
		setFont.setLayout(new BorderLayout());
		init();
	}
	
	public void init()
	{
		JLabel font=new JLabel("Font");//字体
		JLabel style=new JLabel("Type");//类型
		JLabel size=new JLabel("Size");//大小
		
		for(int i=0;i<fontValues.length;i++)
		{
			fontValue.addItem(fontValues[i]);
		}
		for(int i=0;i<styleValues.length;i++)
		{
			styleValue.addItem(styleValues[i]);
		}
		for(int i=0;i<sizeValues.length;i++)
		{
			sizeValue.addItem(sizeValues[i]+"");
		}
		
		sizeValue.setSelectedIndex(8);
		
		JButton ok=new JButton("OK");//确认
		JButton no=new JButton("Cancel");//取消
		
		Panel names=new Panel(new GridLayout(3,1));
		names.add(font);
		names.add(style);
		names.add(size);
		Panel values=new Panel(new GridLayout(3, 1));
		values.add(fontValue);
		values.add(styleValue);
		values.add(sizeValue);
		Panel contral=new Panel();
		contral.add(ok);
		contral.add(no);
		ok.addActionListener(this);
		no.addActionListener(this);
		setFont.add("West",names);
		setFont.add("Center", values);
		setFont.add("South", contral);
		setFont.setSize(200, 200);
		setFont.setLocation(200, 200);
		setFont.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("OK"))
		{
			int fontIndex=fontValue.getSelectedIndex();
			int styleIndex=styleValue.getSelectedIndex();
			int sizeIndex=sizeValue.getSelectedIndex(); 
			Font f=new Font(fontValues[fontIndex],styleValues2[styleIndex],sizeValues[sizeIndex]);
			textEditor.setFontStyle(f);
			setFont.dispose();
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			setFont.dispose();
		}
	}
	
}
