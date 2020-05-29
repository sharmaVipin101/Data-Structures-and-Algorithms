class lvlOrder
{static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int a)
		{
			data = a;
			left = right = null;
		}
	}

	int height(Node root)
	{
		if(root==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
	void print()
	{
		int h = height(root);
		for(int i=0;i<h;i++)
		{
			level(root,i+1);
		}
	}
	void level(Node root,int num)
	{
		if(root==null)
			return;
		if(num==1)
		{
			System.out.print(root.data+" ");
		}
		if(num>1)
		{
			level(root.left,num-1);
			level(root.right,num-1);
		}
	}
	public static void main(String args[])
	{
		lvlOrder l = new lvlOrder();
		l.root = new Node(1); 
        l.root.left = new Node(2); 
        l.root.right = new Node(3); 
        l.root.left.left = new Node(4); 
        l.root.left.right = new Node(5); 

        System.out.println("Level order traversal is -:");
        l.print();

	}
}