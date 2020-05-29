class avlTreeInsertion
{Node root;
	class Node
	{
		int height;
		int data;
		Node left;
		Node right;
		Node(int a)
		{
			data = a;
		}
	}
//////////////////////////////////////////////

	int setHeight(Node root)
	{
		if(root==null)
			return 0;
		return (1+Math.max(setHeight(root.left),setHeight(root.right)));

	}
	int height(Node root)
	{
		if(root==null)
			return 0;
		return root.height;
	}

	Node rotateRight(Node root)
	{	Node temp = root.left;
		root.left = root.left.right;
		temp.right = root;
		temp.height = setHeight(temp);
		root.height = setHeight(root);
		return temp;

	}
	///1
	//2
/////3
	Node rotateLeft(Node root)
	{
		Node temp = root.right;
		root.right = root.right.left;
		temp.left = root;
		root.height = setHeight(root);
		temp.height = setHeight(temp);
		return temp;

	}

	//1
	///2
	////3
//////////////////////////////////////////////
	void add(int a)
	{
		root = add_rec(root,a);
	}
	Node add_rec(Node root,int key)
	{
		Node qw = new Node(key);
		if(root==null)
		{
			root = qw;
		}
		else if(key<root.data)
		{
			root.left = add_rec(root.left,key);
		}
		else if(key>root.data)
		{
			root.right = add_rec(root.right,key);
		}

		int balance = (height(root.left)-height(root.right));

		if(balance>1)
		{
			if(height(root.left.left)>=height(root.left.right))
			{
				root = rotateRight(root);
			}
			else
			{
				root.left = rotateLeft(root.left);
				root = rotateRight(root);
			}

		}
		if(balance<-1)
		{
			if(height(root.right.right)>=height(root.right.left))
			{
				root = rotateLeft(root);
			}
			else
			{
				root.right = rotateRight(root.right);
				root = rotateLeft(root);
			}
		}
		else
		{
			root.height = setHeight(root);
		}
		return root;
	}
	/////////////////////////////////////////////////

		void print()
		{
			print_rec(root);
		}

		void print_rec(Node root)
		{
			if(root!=null)
			{
				System.out.print(root.data+" ");
			print_rec(root.left);
			
			print_rec(root.right);
			}

		}

/////////////////////////////////////////////////
	public static void main(String args[])
	{
		avlTreeInsertion avl = new avlTreeInsertion();

		avl.add(1);
		avl.add(2);
		avl.add(3);
		avl.add(4);
		avl.add(5);
		avl.add(6);
		avl.add(7);

		avl.print();
	}
}