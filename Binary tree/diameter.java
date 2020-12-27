class Node{
	int data;
	Node left,right;

	Node(int a)
	{
		data = a;
		left = right  =null;

	}
}
class diameter{

	 Node root;

	int res = 0;



	 int solve(Node root)
	 {
	 	find(root);

	 	return res;
	 }

	int find(Node root)
	{
		if(root==null)
			return 0;

		int l = find(root.left);
		int r = find(root.right);

		int includenot = 1+Math.max(l,r);

		int include = 1+l+r;

		res = Math.max(includenot,Math.max(res,include));

		return includenot;
	}

	

	public static void main(String args[])
	{
		diameter tree = new diameter(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 

        System.out.println(tree.solve(tree.root));
	}
}