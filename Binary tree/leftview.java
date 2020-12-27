import java.util.*;

public class leftview{
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int val)
		{
			data=val;
		}
	}


	static void leftview(Node root)
	{
		Queue<Node> q = new LinkedList<>();

		q.add(root);

		while(q.size()>0)
		{
			int len = q.size();

			for(int i=0;i<len;i++)
			{
				Node temp = q.poll();

				if(i==0)
				{
					System.out.println(temp.data);
				}
				if(temp.left!=null)
					q.add(temp.left);

				if(temp.right!=null)
					q.add(temp.right);

			}
		}
	}

	
	public static void main(String[] args) {

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);

		leftview(root);
		
	}
}