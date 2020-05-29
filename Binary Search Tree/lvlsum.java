import java.util.*;
class Node
	{
		int data;
		Node left,right;
		Node(int a)
		{
			left = right = null;
			data  = a;
		}
	}
class lvlsum
{ static Node root;

	static void sum(Node root,int a)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
int sum = 0;
int lvl = 0;
		while(!q.isEmpty())
		{
			int size = q.size();
			
			
			boolean found = false;
			while(size-->0)
			{
				Node temp = q.poll();
				if(lvl==a)
				{
					sum+=temp.data;
					found = true;
				}
				else
				{
					if(temp.left!=null)
						q.add(temp.left);
					if(temp.right!=null)
						q.add(temp.right);
				}
			}
			if(found)
				break;
			lvl++;

		}
		System.out.println(sum);
	}
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(50);
		root.left.right = new Node(23);
		root.right.left = new Node(10);
		root.right.right = new Node(15);
		sum(root,2);

	}
}