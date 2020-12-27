import java.util.*;

class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
int count = 0;
	Graph(int v)
	{
		this.v=v;

		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}
	}

	void add(int src,int des)
	{
		al.get(src).add(des);
		al.get(des).add(src);
	}

	int cycles(int n)
	{
		boolean visited[] = new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			dfs(i,n,visited);
		visited[i]=true;//if cycle is 1-2-3-4-1 :- ans can be 1 or 4
		}
		return count;
	}

	void dfs(int src,int n,boolean visited[])
	{
		visited[src]=true;



		if(n==0)
		{visited[src]=false;
			count++;
			return;
		}

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				dfs(i,n-1,visited);
			}
		}
		visited[src] = false;


	}
}

public class nLengthCycle{
	public static void main(String[] args) {
	
		Graph g = new Graph(5);
		g.add(0,1);
		g.add(0,3);
		g.add(1,2);
		g.add(1,4);
		g.add(2,3);
		g.add(3,4);

		System.out.println(g.cycles(4));	
	}
}