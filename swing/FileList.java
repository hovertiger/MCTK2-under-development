package swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class FileList{
	
	String[] data;
	DefaultMutableTreeNode root,child,parent;
	JTree tree;
	DefaultTreeModel model;
	public FileList()
	{
		data=new String[30];
		data[0]="Unnaming";
		setTree();
	}
	public JTree getTree()
	{
		return tree;
	}
	public void setTree()
	{
		root=new DefaultMutableTreeNode("File Directory");
		tree=new JTree(root);
		model=(DefaultTreeModel)tree.getModel();
		child=new FileTree(data).node();
		parent=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
		if(parent==null)parent=root;
		model.insertNodeInto(child, parent, 0);
			
		for(int i=0; i<tree.getRowCount(); i++)//ʹ��Ĭ��չ��
		   {
		       tree.expandRow(i);
		   }

	}
	
	public void setData(String[] data)
	{
		this.data=data;
	}
	class FileTree{
		DefaultMutableTreeNode r;
		public FileTree(String[] data)
		{
			r=new DefaultMutableTreeNode(data[0]);
			for(int i=1;i<data.length;i++)
			{
				if(data[i]!=null)
				r.add(new DefaultMutableTreeNode(data[i]));
			}
		}
		public DefaultMutableTreeNode node()
		{
			return r;
		}
	}
}
