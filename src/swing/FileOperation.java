package swing;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.*;


public class FileOperation {
	JFileChooser jc=new JFileChooser();
	TextEditor textEditor;
	String src;
	String fileName;
	
	public FileOperation(TextEditor textEditor)
	{
		this.textEditor=textEditor;
		src="";
		jc.setAcceptAllFileFilterUsed(false);
		jc.addChoosableFileFilter(new MyFileFilter("SMV Code(.smv)",".smv"));//添加文件过滤器

//		jc.addChoosableFileFilter(new MyFileFilter("Java代码(.java)",".java"));//添加文件过滤器
		FileSystemView fsv = FileSystemView.getFileSystemView();
		jc.setCurrentDirectory(fsv.getHomeDirectory());//设置默认路径为桌面路径

	}
	public void treeOpen(String fileName)
	{
		File newFile;
		BufferedReader br;
		src=getPath()+fileName;
		newFile=new File(src);
		this.fileName=fileName;
		setStyle(newFile);//设置编辑区的文本格式
		textEditor.text.setText("");//清空编辑区
		try
		{
			String s;
			StringBuffer sbf=new StringBuffer();
			br=new BufferedReader(new FileReader(newFile));
			while((s=br.readLine())!=null)
			{
				sbf.append(s+"\r\n");
			}
			br.close();
			if(sbf.length()>2)
			sbf=new StringBuffer(sbf.substring(0, sbf.length()-2));
			String content=sbf.toString().replaceAll("\\t", "   ");
			textEditor.text.setText(content);
			textEditor.setRowContent();
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public boolean open()
	{
		if(JFileChooser.APPROVE_OPTION == jc.showOpenDialog(textEditor)) 
		{
			File newFile;
			File file = jc.getSelectedFile();
			if(file.getName()==null) return false;
			BufferedReader br;
			newFile=file;
			src=newFile.toString();//获取文件路径
			fileName=newFile.getName();//获取文件名
			setStyle(newFile);//设置编辑区的文本格式
			textEditor.text.setText("");//清空编辑区
			try
			{
				String s;
				StringBuffer sbf=new StringBuffer();
				br=new BufferedReader(new FileReader(newFile));
				while((s=br.readLine())!=null)
				{
					sbf.append(s+"\r\n");
				}
				br.close();
				if(sbf.length()>2)
				sbf=new StringBuffer(sbf.substring(0, sbf.length()-2));
				String content=sbf.toString().replaceAll("\\t", "   ");
				textEditor.text.setText(content);
				textEditor.setRowContent();
				return true;
			}catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		return false;
	}
	
	public boolean save()
	{
		if(src!="")//文件已存在（打开）
		{
			BufferedWriter br;
			File newFile=new File(src);
			try {
				String content=textEditor.getContent();
				br = new BufferedWriter(new FileWriter(newFile));
				br.write(content+"");
				br.flush(); 
				br.close();
				//System.out.println("写入成功");
				return true;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else//文件未存在（打开）
		{
			if(JFileChooser.APPROVE_OPTION == jc.showSaveDialog(textEditor)) 
			{
				File newFile;
				File file = jc.getSelectedFile();
				if(file.getName()==null) return false;
				BufferedWriter br;
				MyFileFilter filter = (MyFileFilter) jc.getFileFilter();
				String ends = filter.getEnds();
				if (file.toString().indexOf(ends)!=-1) 
				{
					newFile = file;
				} 
				else 
				{
					newFile = new File(file.getAbsolutePath() + ends);
				}
				src=newFile.toString();
				fileName=newFile.getName();
				if(newFile.exists())//已存在同名文件，删除
				{
					newFile.delete();
				}
				try {
					String content=textEditor.getContent();
					System.out.println(content.length());
					br = new BufferedWriter(new FileWriter(newFile));
					br.write(content+"");
					br.flush();
					br.close();
					return true;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean SaveAs()
	{
			if(JFileChooser.APPROVE_OPTION == jc.showSaveDialog(textEditor))
			{
				File newFile;
				File file = jc.getSelectedFile();
				if(file.getName()==null) return false;
				BufferedWriter br;
				MyFileFilter filter = (MyFileFilter) jc.getFileFilter();
				String ends = filter.getEnds();
				if (file.toString().indexOf(ends)!=-1)
				{
					newFile = file;
				}
				else
				{
					newFile = new File(file.getAbsolutePath() + ends);
				}
				src=newFile.toString();
				fileName=newFile.getName();
				if(newFile.exists())//已存在同名文件，弹出提示对话框
				{
					int result = JOptionPane.showConfirmDialog(textEditor, "A file with the same name already exists. Rename it?", "Warning",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (result == 0) {//Yes
						SaveAs();
					} else if (result == 1) {//No
						newFile.delete();
					}
				}
				try {
					String content=textEditor.getContent();
					System.out.println(content.length());
					br = new BufferedWriter(new FileWriter(newFile));
					br.write(content+"");
					br.flush();
					br.close();
					return true;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		return false;
	}


	public boolean creat()
	{
		if(JFileChooser.APPROVE_OPTION == jc.showSaveDialog(textEditor)) 
		{
			File newFile;
			File file = jc.getSelectedFile();
			if(file.getName()==null) return false;
			BufferedWriter br;
			MyFileFilter filter = (MyFileFilter) jc.getFileFilter();
	        String ends = filter.getEnds();
			if (file.toString().indexOf(ends)!=-1) 
			{
			    newFile = file;
			} 
			else 
			{
			    newFile = new File(file.getAbsolutePath() + ends);
			}
			src=newFile.toString();
			fileName=newFile.getName();
			if(newFile.exists())//已存在同名文件，弹出提示对话框
			{
				JOptionPane.showOptionDialog(null, "A file with the same name already exists. Please rename it！",
						"Warning", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, null, null);
				creat();
			}
			setStyle(newFile);
			textEditor.text.setText("");
			try {
			   br = new BufferedWriter(new FileWriter(newFile));
			   br.write("");
			   br.flush(); //刷新缓冲区的数据到文件
			   br.close();
			   return true;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		return false;
	}
	
	public void setStyle(File file)
	{
		String name=file.getName();
		textEditor.setTitle("MCTK2-"+file.getAbsolutePath());
		if(name.indexOf("smv")!=-1)
		{
			textEditor.setLanguage("smv");
		}
		//textEditor.setTitle("代码编辑器-"+name);
//		if(name.indexOf("java")!=-1)
//		{
//			textEditor.setLanguage("java");
//		}
	}
	
	public String getPath()
	{
		String name=getFileName();
		int t=src.lastIndexOf(name,src.length()-1);
		String path=src.substring(0, t);
		return path;
	}
	
	public String getFileName()
	{
		if(fileName==null) return"";
		int point=fileName.indexOf(".");
		String name=fileName.substring(0, point);
		return name;
	}
	
	public FileList setFileList()
	{
		
		FileList fileList=new FileList();;
		String[] list=new String[30];
		String rootName;
		String path=getPath();
		int x=path.lastIndexOf('\\', path.length()-2);
		if(x==-1)
		{
			rootName="Volume: "+path.charAt(0);//盘
		}
		else{
			rootName=path.substring(x+1,path.length()-1);
		}
		list[0]=rootName;
		int p=1;
		File file=new File(path);
		String[] s=file.list();
		int point=fileName.indexOf('.');
		String end=fileName.substring(point, fileName.length());
		for(int i=0;i<s.length;i++)
		{
			if(s[i].indexOf(end)!=-1)
			{
				list[p++]=s[i];
			}
		}
		
		
		fileList.setData(list);
		fileList.setTree();
		return fileList;
		
	}
	
class MyFileFilter extends FileFilter {

		  String ends; // 文件后缀
		  String description; // 文件描述

		  public MyFileFilter(String description,String ends) {
		    this.ends = ends; // 设置文件后缀
		    this.description = description; // 设置文件描述文字
		  }

		  @Override
		  public boolean accept(File f) {
			  if (f.isDirectory()) return true;
			    String fileName = f.getName();
			    if (fileName.toUpperCase().endsWith(this.ends.toUpperCase())) return true;//判断文件名后缀
			    return false;
		  }

		  @Override
		  public String getDescription() {
		    return this.description;
		  }
		 
		  public String getEnds() {
		    return this.ends;
		  }

		}
}
