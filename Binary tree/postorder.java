import java.util.*;

public class postorder{
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

	static void postorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}

	
	public static void main(String[] args) {

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		postorder(root);
		
	}
}