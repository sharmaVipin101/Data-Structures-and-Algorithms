import java.util.*;

class vt
{ static class Node
	{
		Node left=null,right=null;
		int data;
		Node(int a)
		{
			data = a;
		}
	}
	
	static void insertMap(Map<Integer,List<Integer>> map,int distance,int data)
	{
		if(!map.containsKey(distance))
		{
			map.put(distance,new ArrayList<>());
		}
		map.get(distance).add(data);

	}
	static void printVertical(Node root,int distance,Map<Integer,List<Integer>> map)
	{
		if(root==null)
		{
			return;
		}
		
			insertMap(map,distance,root.data);

			printVertical(root.left,distance-1,map);

			printVertical(root.right,distance+1,map);
		

	}
	static void  printVertical(Node root)
	{
		Map<Integer,List<Integer>> map = new TreeMap<>();

		printVertical(root,0,map);

		for(Collection<Integer> c: map.values())
			System.out.println(c);



	}
	public static void main(String args[])
	{
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		root.right.left.right.left = new Node(9);
		root.right.left.right.right = new Node(10);

		printVertical(root);
	}
}