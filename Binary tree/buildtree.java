//tree from inorder and preorder
import java.util.*;




public class buildtree{
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
	static int index = 0;
	public static void main(String[] args) {
		int in[] = {4,2,5,1,6,3,7};
		int pre[] = {1,2,4,5,3,6,7};

		root = build(in,pre,0,in.length);
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

	static Node build(int in[],int pre[],int start,int end)
	{

		if(start>=end)
			return null;

		Node qw = new Node(pre[index++]);

		int mid = -1;
		for(int i=start;i<end;i++)
		{
			if(in[i]==qw.data)
			{
				mid = i;
				break;
			}
		}
		qw.left = build(in,pre,start,mid);
		qw.right = build(in,pre,mid+1,end);
		return qw;

	}
}