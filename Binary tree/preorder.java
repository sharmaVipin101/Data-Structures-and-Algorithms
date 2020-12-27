import java.util.*;

public class preorder{
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

	// static void preorder(Node root)
	// {
	// 	if(root==null)
	// 		return;
	// 	System.out.println(root.data);
	// 	preorder(root.left);
	// 	preorder(root.right);
	// }

	static void preorder(Node root)
	{
		Stack<Node> s = new Stack<>();

		Node curr = root;

		while(s.size()>0 || curr!=null)
		{
			if(curr!=null)
			{
				System.out.println(curr.data);
				s.push(curr);
				curr = curr.left;
			}else{
				curr = s.pop();
				curr = curr.right;
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

		preorder(root);
		
	}
}