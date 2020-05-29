import java.util.*;
class Node
	{
		int data;
		Node left;
		Node right;
		Node(int a)
		{
			data = a;
			left=null;
			right = null;
		}
	}
class right
{	static Node root;
	

	static int find(Node root,int key)
	{if(root==null)
		return -1;

		Queue<Node> q = new LinkedList<>();

		q.add(root);

		while(!q.isEmpty())
		{
			int qlen = q.size();

			while(qlen-->0)
			{
				Node temp = q.poll();
				if(temp.data==key)
				{
					if(qlen==0)
						return -1;
					return q.peek().data;

				}
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		   //   	 1
	    //         /  \
	    //        /    \
	    //       2      3
	    //      / \      \
	    //     4   5      6
	    //               / \
	    //              7   8
	    // 
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		int x = find(root,5);
		System.out.println(x);


	}
}