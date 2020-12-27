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
		al.get(des).add(src);
	}

	boolean find()
	{
		boolean visited[] = new boolean[v];


		dfs(0,visited);

		for(boolean b:visited)
		{
			if(b==false)
			{
				return false;
			}
		}
		return true;
	}

	boolean dfs(int src,boolean visited[])
	{
		visited[src] = true;

		for(int i:al.get(src))
		{
			if(visited[i]==false)
			{
				return dfs(i,visited);
			}
		}

return false;
	}
}

public class wordCircle{
	public static void main(String[] args) {
		
		 //String ar[] ={"for", "geek", "rig", "kaf"};
		String ar[] = {"ijk", "kji", "abc", "cba"};
		Graph g = new Graph(ar.length);

		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length ;j++)
			{
				if(ar[i].charAt(ar[i].length()-1)==ar[j].charAt(0))
				{
					g.add(i,j);
					//System.out.println(i+" "+j);
				}
			}
		}

		System.out.println(g.find());
	}
}