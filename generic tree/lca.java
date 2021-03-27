import java.util.*;

//how to find lca using binary lifting ?

//suppose we have two nodes a and b, we will find the largest parent which is not common to both
//lets say c1 and c2 are the largest(ancestor) parent which is not common so the answer will be parent(c1) == parent(c2).


class lca{
	
	static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	static int parent[][] = new int[15][5];
	static int lvl[];

	static void build_tree(int ar[])
	{	
		int child = 2;

		for(int i=0;i<ar.length;i++)
		{
			al.get(ar[i]).add(child++);
		}
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

	static void lifting(int node,int par)
	{
		parent[node][0] = par;//parent of node at 2^0 level = par;

		for(int i=1;i<5;i++)
		{
			if(parent[node][i-1] != -1)
			{
				parent[node][i] = parent[ parent[node][i-1] ][i-1];
			}else parent[node][i] = -1;
		}

		for(int child:al.get(node))
			lifting(child,node);
	}
	
	static void dfs_to_get_lvl(int lvl[],int node,int l)
	{
		lvl[node] = l;

		for(int child:al.get(node))
			dfs_to_get_lvl(lvl,child,l+1);
	}

	static int lca(int a,int b)
	{
		if(lvl[a]>lvl[b])
		{
			a = find(a,lvl[a]-lvl[b]);
		}else if(lvl[b]>lvl[a])
		{
			b = find(b,lvl[b]-lvl[a]);
		}

		if(a==b)
			return a;

		for(int i=4;i>=0;i--)
		{
			if(parent[a][i]!=parent[b][i])
			{
				a = parent[a][i];
				b = parent[b][i];
			}
		}
		return find(a,1);

	}

	public static void main(String[] args) {

		int ar[] = {1,1,2,2,3,3,4,4,5,5};//index is connected to ar[index] (1 based indexing); tree at the end to visualize
		
		int n = ar.length;
		lvl  = new int[15];

		for(int i=0;i<=12;i++)
			al.add(new ArrayList<>());	
		
		build_tree(ar);

		lifting(1,-1);//pre-processing

		dfs_to_get_lvl(lvl,1,0);

		System.out.println(lca(8,4));

	}
}


//			  1
//		 2		   3
//	  4	    5    6     7
//  8  9 10  11
