import java.util.*;
class Node
	{
		int data;
		Node left,right;
		Node(int a)
		{
			data = a;
			left = right = null;
		}
	}
	
class lvlorderQueue
{	static Node root;

	void print()
	{
		Queue<Node> q = new LinkedList<Node>();

		q.add(root);

		while(!q.isEmpty())
		{
			Node temp = q.poll();
			
			System.out.print(temp.data+" ");

			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}

	public static void main(String args[])
	{
		lvlorderQueue l = new lvlorderQueue();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		l.print();
	}
}