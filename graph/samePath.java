import java.util.*;


class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
int time = 0;
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

	boolean possible(int src,int des)
	{
		boolean visited[] = new boolean[v];
		int in[] = new int[v];
		int out[] = new int[v];

		dfs(src,des,visited,in,out);

		// for(int i=0;i<v;i++)
		// {
		// 	System.out.println(i+" "+in[i]+" "+out[i]);
		// }
		
		return in[src]<in[des] && out[src]>out[des];

	}

	void dfs(int src,int des,boolean visited[],int in[],int out[])
	{
		visited[src]=true;

		in[src] = ++time;

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				dfs(i,des,visited,in,out);
			}
		}
		out[src]=++time;
	}
}
public class samePath{
	public static void main(String[] args) {
		
		Graph g = new Graph(10);
		g.add(1,2);
		g.add(1,3);
		g.add(3,6);
		g.add(2,4);
		g.add(2,5);
		g.add(5,7);
		g.add(5,8);
		g.add(5,9);

		System.out.println(g.possible(1,5));
		System.out.println(g.possible(2,9));
		System.out.println(g.possible(2,6));
	}
}