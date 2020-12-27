import java.util.*;

class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
			al.add(new ArrayList<>());

	}

	void addEdge(int src,int des)
	{
		al.get(src).add(des);
		al.get(des).add(src);
	}

	void cores(int k)
	{
		boolean visited[] = new boolean[v];

		int degree[] = new int[v];

		for(int i=0;i<al.size();i++)
		{
			degree[i]=al.get(i).size();
		}

		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				dfs(i,visited,degree,k);
			}
		}

		for(int i=0;i<v;i++)
		{
			if(degree[i]>=k)
			{
				System.out.print(i+"- ");
			

			for(int z:al.get(i))
			{
				if(degree[z]>=k)
				{
					System.out.print(z+" ");
				}
			}System.out.println();}
		}

		// for(int i=0;i<v;i++)
		// {
		// 	System.out.println(i+" "+degree[i]);
		// }
	}

	void dfs(int src,boolean visited[],int degree[],int k)
	{
		visited[src] = true;

		if(degree[src]<k)
		{
			degree[src]--;
		}

		for(int i:al.get(src))
		{
			if(degree[src]<k)
			{degree[i]--;}

			if(!visited[src])
			{
				dfs(i,visited,degree,k);
			}
		}
	}

}

public class kcores{
	public static void main(String[] args) {
		Graph g1 = new Graph(9); 
        g1.addEdge(0, 1); 
        g1.addEdge(0, 2); 
        g1.addEdge(1, 2); 
        g1.addEdge(1, 5); 
        g1.addEdge(2, 3); 
        g1.addEdge(2, 4); 
        g1.addEdge(2, 5); 
        g1.addEdge(2, 6); 
        g1.addEdge(3, 4); 
        g1.addEdge(3, 6); 
        g1.addEdge(3, 7); 
        g1.addEdge(4, 6); 
        g1.addEdge(4, 7); 
        g1.addEdge(5, 6); 
        g1.addEdge(5, 8); 
        g1.addEdge(6, 7); 
        g1.addEdge(6, 8); 

        g1.cores(3);


	}
}