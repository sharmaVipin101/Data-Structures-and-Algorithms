class avlTreeDeletion
{
	Node root;
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
int getBalance(Node root)
{
	if (root == null) 
			return 0; 
	return (height(root.left)-height(root.right));
}
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

	Node rightRotate(Node root)
	{
		Node temp = root.left;
		root.left = root.left.right;
		temp.right = root;
		temp.height = setHeight(temp);
		root.height = setHeight(temp);
		return temp;
	}
	//1
   //2
  //3

	Node leftRotate(Node root)
	{
		Node temp = root.right;
		root.right = root.right.left;
		temp.left = root;
		temp.height = setHeight(temp);
		root.height = setHeight(root);
		return temp;
	}
	//1
	 //2
	  //3
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
				root = rightRotate(root);
			}
			else
			{
				root.left = leftRotate(root.left);
				root = rightRotate(root);
			}

		}
		if(balance<-1)
		{
			if(height(root.right.right)>=height(root.right.left))
			{
				root = leftRotate(root);
			}
			else
			{
				root.right = rightRotate(root.right);
				root = leftRotate(root);
			}
		}
		else
		{
			root.height = setHeight(root);
		}
		return root;
	}//YOUTUBE CODE






void delete(int a)
{
	root = delete_rec(root,a);
}

Node delete_rec(Node root,int key)
{
	if(root==null)
	{
		return root;
	}
	else if(key<root.data)
	{
		root.left = delete_rec(root.left,key);
	}
	else if(key>root.data)
	{
		root.right = delete_rec(root.right,key);
	}

	else
	{

		if(root.left==null)
			return root.right;
		if(root.right==null)
			return root.left;

		root.data = min_right(root.right);
		root.right = delete_rec(root.right,root.data);
	}



int balance = (height(root.left)-height(root.right));

		if(balance>1)
		{
			if(height(root.left.left)>=height(root.left.right))
			{
				root = rightRotate(root);
			}
			else
			{
				root.left = leftRotate(root.left);
				root = rightRotate(root);
			}

		}
		if(balance<-1)
		{
			if(height(root.right.right)>=height(root.right.left))
			{
				root = leftRotate(root);
			}
			else
			{
				root.right = rightRotate(root.right);
				root = leftRotate(root);
			}
		}
		else
		{
			root.height = setHeight(root);
		}
	
	
  
        return root; 
    }
int min_right(Node root)
{
	Node temp = root; 

		
		while (temp.left != null) 
		temp = temp.left; 

		return temp.data; 
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////DELETION IN AVL

	void print()
	{
		print_rec(root);
	}

	void print_rec(Node root)
	{
		if(root!=null)
		{System.out.print(root.data+" ");
			print_rec(root.left);
			
			print_rec(root.right);
		}

	}

	public static void main(String args[])
	{
		avlTreeDeletion avl = new avlTreeDeletion();

		avl.add(8);
		avl.add(6);
		avl.add(2);
		avl.add(7);
		avl.add(9);
		avl.add(5);
		avl.add(3);
		avl.add(1);
		avl.add(0);

		avl.print();
		// avl.delete(8);
		// System.out.println("After Deletion");
		// avl.print();
	}
}