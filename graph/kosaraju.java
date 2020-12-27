//strongly connected components
//

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

	void scc()
	{
		Stack<Integer> s = new Stack<>();

		boolean visited[] = new boolean[v];

		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			dfs(s,visited,i);		
		}

		ArrayList<ArrayList<Integer>> tr = transpose();


		findSCC(tr,s);

	}

	void findSCC(ArrayList<ArrayList<Integer>> tr,Stack<Integer> s)
	{
		boolean visited[] = new boolean[v];
		
		while(!s.isEmpty())
		{int v = s.pop();

		if(visited[v]==false)
		{
			dfss(v,visited,tr);
			System.out.println("");
		}
		}
	}

	void dfss(int src,boolean visited[],ArrayList<ArrayList<Integer>> tr)
	{
		visited[src] = true;

		System.out.print(src+" ");
		for(int i:tr.get(src))
		{
			if(visited[i]==false)
			{
				dfss(i,visited,tr);
			}
		}
	}

	void dfs(Stack<Integer> s,boolean visited[],int src)
	{
		visited[src] = true;

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				dfs(s,visited,i);
			}
		}
		s.push(src);
	}

	ArrayList<ArrayList<Integer>> transpose(){

		ArrayList<ArrayList<Integer>> tr = new ArrayList<ArrayList<Integer>>();

		for(int i=0;i<v;i++)
		{
			tr.add(new ArrayList<>());
		}
		for(int i=0;i<al.size();i++)
		{
			for(int j:al.get(i))
			{
				tr.get(j).add(i);
			}
		}

		return tr;
	}
}

public class kosaraju
{
	public static void main(String[] args) {
		
		Graph g = new Graph(5);
		g.add(1,0);
		g.add(0,2);
		g.add(2,1);
		g.add(0,3);
		g.add(3,4);

		g.scc();
	}
}