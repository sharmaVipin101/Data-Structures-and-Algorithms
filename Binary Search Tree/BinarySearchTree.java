class BinarySearchTree
{	Node root;
	class Node
	{
		Node right,left;
		int data = 0;
		Node(int a)
		{
			data = a;
			right = null;
			left = null;
		}
	}
/////////////////////////////////////////////////////////////////
	void add(int a)
	{
		root = insert_rec(a,root);
	}

	Node insert_rec(int value,Node root)
	{
		if(root==null)
			{root = new Node(value);
			return root;}
		if(value< root.data)
		{
			root.left = insert_rec(value,root.left);
		}
		if(value>root.data)
		{
			root.right = insert_rec(value,root.right);
		}
		return root;
	}



///////////////////////////////////////////////////////////////////INSERTION IN BST IMPLEMENTATION

	void delete(int a)
	{
		root = delete_rec(root,a);
	}

	Node delete_rec(Node root, int value)
	{
		if(root==null)
			return root;
		if(value<root.data)
		{
			root.left = delete_rec(root.left,value);
		}

		else if(value>root.data)
		{
			root.right = delete_rec(root.right,value);
		}//Got the Node with desired value to be deleted;
		
		else
		{
			if(root.left==null)
				return root.right;
			if(root.right==null)
				return root.left;//these 4 lines will make Node value = null if desired Node to be delete is leaf or having only one child;

			root.data = min_right_value(root.right);//if node is having 2 childs then after deletion which node will take its place??Ans=>Min.right node

			root.right = delete_rec(root.right,root.data);
		}
		return root;

	} 
	int min_right_value(Node root)
	{
		int min = root.data;
		while(root.left!=null)
		{
			min = root.left.data;
			root=root.left;
		} 
		return min;
	}

////////////////////////////////////////////////////////////////////DELETION IN BST IMPLEMENTATION

	void inorder_display()
	{
		inorder_display_rec(root);
	}
	void inorder_display_rec(Node root)
	{
		if(root!=null)
		{
			inorder_display_rec(root.left);
			System.out.println(root.data);
			inorder_display_rec(root.right);
		}
	}
	///////
	void postorder_display()
	{
		postorder_display_rec(root);
	}
	void postorder_display_rec(Node root)
	{
		if(root!=null)
		{
			postorder_display_rec(root.left);
			postorder_display_rec(root.right);
			System.out.println(root.data);
		}
	}
	///
	void preorder_display()
	{
		preorder_display_rec(root);
	}
	void preorder_display_rec(Node root)
	{
		if(root!=null)
		{	
			System.out.println(root.data);
			preorder_display_rec(root.left);
			preorder_display_rec(root.right);
		}
	}
	//

	public static void main(String args[])
	{
		BinarySearchTree bst = new BinarySearchTree();
		////////////////////////////////////////////
		bst.add(50);
		bst.add(30);
		bst.add(20);
		bst.add(40);
		bst.add(70);
		bst.add(60);
		bst.add(80);
		System.out.println("INORDER DISPLAY");
		bst.inorder_display();
		System.out.println("");

		System.out.println("POSTORDER DISPLAY");
		bst.postorder_display();
		System.out.println("");
		
		System.out.println("PREORDER DISPLAY");
		bst.preorder_display();
		System.out.println("");

		////////////////////////////////////////////////// INSERTION IN BINARY TREE

		///////////////////////////////////////////

		bst.delete(20);
		System.out.println("INORDER DISPLAY AFTER DELETION 20");
		bst.inorder_display();
		System.out.println("");



		bst.delete(30);
		System.out.println("INORDER DISPLAY AFTER DELETION 30");
		bst.inorder_display();
		System.out.println("");


		bst.delete(50);
		System.out.println("INORDER DISPLAY AFTER DELETION 50");
		bst.inorder_display();
		System.out.println("");

		////////////////////////////////////////////DELETION IN BST




	}
}