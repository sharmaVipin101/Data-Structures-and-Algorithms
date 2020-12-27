//tree from inorder and postorder
import java.util.*;




public class buildtreee{
	static Node root=null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
		}
	}
	static int index = 6;
	public static void main(String[] args) {
		int in[] = {4,2,5,1,6,3,7};
		int po[] = {4,5,2,6,7,3,1};

		root = build(in,po,0,in.length);
		inorder(root);
		
	}

		static void inorder(Node root)
		{
			if(root==null)
				return;
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}

	static Node build(int in[],int po[],int start,int end)
	{

		if(start>=end)
			return null;

		Node qw = new Node(po[index--]);

		int mid = -1;
		for(int i=start;i<end;i++)
		{
			if(in[i]==qw.data)
			{
				mid = i;
				break;
			}
		}
		qw.right = build(in,po,mid+1,end);
		qw.left = build(in,po,start,mid);
		
		return qw;

	}
}