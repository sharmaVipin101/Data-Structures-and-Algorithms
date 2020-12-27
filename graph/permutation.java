import java.util.*;
import java.math.*;

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
		ArrayList<Integer> path  = new ArrayList<>();

		for(int i=1;i<v;i++)
		{
			boolean visited[] = new boolean[v];
			path.add(i);
			if(dfs(i,visited,path))
				System.out.println(path.toString());
			else path.remove(path.size()-1);
		}

	}

	boolean dfs(int src,boolean visited[],ArrayList<Integer> path)
	{
		if(path.size()==v-1)
			return true;

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

public class permutation{

	static boolean perfert(int num)
	{
		double res = Math.sqrt(num);

		return (res-Math.floor(res))==0;
	}
	public static void main(String[] args) {
		
		int n = 17;

		Graph g = new Graph(n+1);

		for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(perfert(i+j))
				{
					g.add(i,j);
				}
			}
		}

		g.find();

	}
}