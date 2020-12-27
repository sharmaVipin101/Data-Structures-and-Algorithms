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
		al.get(des).add(src);
	}

	void find()
	{
		boolean visited[] = new boolean[v];

		ArrayList<Integer> path = new ArrayList<>();
		path.add(0);
		dfs(0,visited,path);
			
	}

	boolean dfs(int src,boolean visited[],ArrayList<Integer> path)
	{
		if(path.size()==visited.length)
		{
			System.out.println(path.toString());
			return true;
		}

		visited[src]=true;

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				path.add(i);
				if(dfs(i,visited,path))
					return true;
				path.remove(path.size()-1);
			}
		}
		visited[src]=false;
return false;
	}

}
public class hamiltoniun
{
	public static void main(String[] args) {
		
		Graph g = new Graph(5);
		g.add(0,1);
		g.add(0,3);
		g.add(1,2);
		g.add(1,3);
		g.add(1,4);
		g.add(2,4);
		g.add(3,4);

		g.find();
	}
}