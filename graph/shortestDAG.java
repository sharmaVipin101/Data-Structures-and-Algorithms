import java.util.*;

class Pair{
	int des,weight;
	Pair(int a,int b)
	{
		des=a;
		weight=b;
	}
}

class Graph{
	int v;
	ArrayList<ArrayList<Pair>> al = new ArrayList<ArrayList<Pair>>();

	Graph(int v)
	{
		this.v=v;

		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}
	}

	void addEdge(int src,int des,int wei)
	{
		al.get(src).add(new Pair(des,wei));
	}

	void dfs(int src,boolean visited[],Stack<Integer> s)
	{
		visited[src]=true;

		for(Pair i:al.get(src))
		{
			if(!visited[i.des])
			{
				dfs(i.des,visited,s);
			}
		}
		s.push(src);
	}

	void path(int start)
	{
		boolean visited[] = new boolean[v];
		Stack<Integer> s = new Stack<>();

		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				dfs(i,visited,s);
			}
		}
int dist[] = new int[v];

for(int i=0;i<v;i++)
{
	dist[i]=Integer.MAX_VALUE;
}

dist[start]=0;

		while(!s.isEmpty())
		{
			int temp = s.pop();
			if(dist[temp]!=Integer.MAX_VALUE)
			{
				for(Pair i: al.get(temp))
				{
					if(dist[i.des]>dist[temp]+i.weight)
					{
						dist[i.des]=dist[temp]+i.weight;
					}
				}
			}
		}

		System.out.println(Arrays.toString(dist));
	}
}

public class shortestDAG{
	public static void main(String[] args) {
		
		Graph g = new Graph(6);

		g.addEdge(0, 1, 5); 
        g.addEdge(0, 2, 3); 
        g.addEdge(1, 3, 6); 
        g.addEdge(1, 2, 2); 
        g.addEdge(2, 4, 4); 
        g.addEdge(2, 5, 2); 
        g.addEdge(2, 3, 7); 
        g.addEdge(3, 4, -1); 
        g.addEdge(4, 5, -2);

       g.path(1);
	}
}