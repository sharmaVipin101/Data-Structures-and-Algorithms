class Node
{
	int data;
	Node left,right;
	Node(int a)
	{
		data = a;
	}
}
class Sum
{
	int sum_leaf = 0;
	int sum_non = 0;
}
class counts
{static Node root;
	static void leafs(Node root,Sum x)
	{
		if(root==null)
			return ;
		if(root.left==null&&root.right==null)
			{x.sum_leaf+=1;
				System.out.print(root.data+" ");
			}
		leafs(root.left,x);
		leafs(root.right,x);
	}
	static void nonleafs(Node root,Sum y)
	{
		if(root==null)
			return;
		if(root.left!=null||root.right!=null)
			{y.sum_non+=1;
				System.out.print(root.data+" ");}
		nonleafs(root.left,y);
		nonleafs(root.right,y);
	}
	public static void main(String[] args) {
		
		Sum sum = new Sum();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		leafs(root,sum);
		System.out.println(sum.sum_leaf);
		System.out.println("---");
		nonleafs(root,sum);
		System.out.println(sum.sum_non);
	}
}