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

	void dfs()
	{
		boolean visited[] = new boolean[v];
		Stack<Integer> s = new Stack<Integer>();

		s.push(2);

		


		while(!s.isEmpty())
		{
			int temp = s.pop();
			visited[temp] = true;
			System.out.print(temp+" ");

			for(int i:al.get(temp))
			{
				if(visited[i]==false)
				{
					s.push(i);
				}
			}

		}

	}
}


public class dfsiterative{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);

		g.add(0,1);
		g.add(1,2);
		g.add(2,3);
		g.add(3,3);
		g.add(2,0);
		g.add(0,2);

		g.dfs();
	}
}