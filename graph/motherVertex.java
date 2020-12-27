import java.util.*;


class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

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
	}

	void mother(){

		boolean visited[] = new boolean[v];

int x=-1;
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{dfs(i,visited);
			x=i;}
		}

		Arrays.fill(visited,false);

		dfs(x,visited);
int j=0;
		for(j=0;j<v;j++)
		{
			if(visited[j]==false)
				break;
		}

		if(j==v)
			System.out.println(x+" is mv");
		else System.out.println("No mv");


	}

	void dfs(int src,boolean visited[])
	{
		visited[src]=true;

		for(int i:al.get(src))
		{
			if(visited[i]==false)
				dfs(i,visited);
		}
	}
}

public class motherVertex{
	public static void main(String[] args) {
		
		Graph g = new Graph(7);
		g.add(0,1);
		g.add(0,2);
		g.add(1,3);
		g.add(4,1);
		g.add(5,2);
		g.add(5,6);
		g.add(6,0);
		g.add(6,4);

	
			g.mother();

	}
}