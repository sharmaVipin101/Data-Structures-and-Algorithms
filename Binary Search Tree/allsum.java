class Sum
{
	int sum = 0;
}
class allsum
{ Sum add = new Sum();
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int a)
		{
			data = a;
			left = right = null;
		}
	}

Node modify(Node root)
{
	modifyy(root,add);
	return root;
}
void modifyy(Node root,Sum pointer)
{
	if(root!=null)
	{
		modifyy(root.right,pointer);
		pointer.sum+= root.data;
		root.data = pointer.sum;
		modifyy(root.left,pointer);

	}
}

void print(Node root)
{
	if(root!=null)
	{
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
}

	public static void main(String args[])
	{
		allsum s = new allsum();

		root = new Node(5);
		root.left = new Node(1);
		root.right = new Node(10);
		s.print(root);
		System.out.println("after modifications");
		Node node = s.modify(root);
		s.print(node);
	}
}