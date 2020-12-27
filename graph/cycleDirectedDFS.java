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

	void add(int src,int des)
	{
		al.get(src).add(des);
	}

	boolean cycle()
	{
		boolean visited[] = new boolean[v];
		boolean rec[] = new boolean[v];

		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				if(dfs(i,visited,rec))
					return true;
			}
		}

		return false;
	}

	boolean dfs(int src,boolean visited[],boolean rec[])
	{

		if(rec[src]==true)
			return true;

		if(visited[src])
			return false;

		visited[src] = true;
		rec[src] = true;

		for(int i:al.get(src))
		{
			
			{
				if(dfs(i,visited,rec))
					return true;
			}
		}
		rec[src] = false;
		return false;
	}


}


public class cycleDirectedDFS{
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		
		g.add(0,1);
		g.add(1,2);
		g.add(2,3);
		// g.add(3,0);
		// g.add(2,0);
		// g.add(2,3);
		// g.add(3,3);

		if(g.cycle())
		{
			System.out.println("YES");
		}else System.out.println("NOO");
	}
}