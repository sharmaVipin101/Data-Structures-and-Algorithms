import java.util.*;

public class inorder{
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

	// static void inorder(Node root)
	// {
	// 	if(root==null)
	// 		return;
	// 	inorder(root.left);
	// 	System.out.println(root.data);
	// 	inorder(root.right);
	// }

	static void inorder(Node root)
	{
		Stack<Node> s = new Stack<>();

		Node curr = root;

		while(s.size()>0 || curr!=null)
		{
			if(curr!=null)
			{
				s.push(curr);

				curr = curr.left;
			}else{

				curr = s.pop();
				System.out.println(curr.data);
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

		inorder(root);
		
	}
}