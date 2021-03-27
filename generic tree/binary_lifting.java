import java.util.*;

// What is binary lifting ?
// A process/algo to reach from a node to an ancestor node by dividing the distance in binary form.
// like to reach from a node(x) to kth parent(y) if k == 13 then k = 1101 = 8 + 4 + 0 + 1. so we will firstly go from x to th parent then its 4th parent then its first parent.
// we need to store all the binary parents(at a distance of 1,2,4,8) of all nodes in the tree. i.e nlogn pre-processing.



class binary_lifting{

	static ArrayList<ArrayList<Integer>> al = new ArrayList<>();

	static int parent[][] = new int[15][5];//number of nodes , max parent i.e 1,2,4,8;

	static void lifting(int node,int par)
	{
		parent[node][0] = par;// 2^0 th parent of the node = 1st parent = par;

		for(int i=1;i<5;i++)
		{
			if(parent[node][i-1]!=-1)//means if possible
			{
				parent[node][i] = parent[ parent[node][i-1] ][i-1]; //2^nth parent = 2^(n-1)th parent's 2^(n-1)th parent.
			}else parent[node][i-1] = -1;
		}

		for(int child:al.get(node))
			lifting(child,node);
	}

	static int find(int node,int lvl)
	{
		for(int i=4;i>=0;i--)
		{
			if(node==-1 || lvl==0)//if parent not possible or if lvl==0 means node itself
				break;

			if(lvl>=(1<<i))
			{
				lvl -= (1<<i);
				node = parent[node][i];
			}
		}
		return node;
	}

	public static void main(String[] args) {

		int ar[] = {1,1,2,2,3,3,4,4,5,5};//index is connected to ar[index] (1 based indexing); tree at the end to visualize
		
		int n = ar.length;

		for(int i=0;i<=12;i++)
			al.add(new ArrayList<>());	
		
		build_tree(ar);

		 lifting(1,-1);//pre-processing

		 System.out.println(find(10,3));// 2th parent of 10

	}

	static void build_tree(int ar[])
	{	
		int child = 2;

		for(int i=0;i<ar.length;i++)
		{
			al.get(ar[i]).add(child++);
		}
	}
}


//			  1
//		 2		   3
//	  4	    5    6     7
//  8  9 10  11    