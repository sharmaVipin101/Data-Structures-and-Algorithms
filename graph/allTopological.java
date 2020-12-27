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

	void addEdge(int src,int des)
	{
		al.get(src).add(des);

	}

	void topo(){

		ArrayList<Integer> res = new ArrayList<>();
		boolean visited[] = new boolean[v];

		int in[] = new int[v];

		for(int i=0;i<v;i++)
		{
			for(int ty:al.get(i))
			{
				in[ty]++;
			}
		}

		alltopo(visited,in,res);

	}

	void alltopo(boolean visited[],int in[],ArrayList<Integer> path)
	{
		for(int i=0;i<v;i++)
		{
			if(!visited[i] && in[i]==0)
			{
				visited[i] = true;
				path.add(i);
				for(int l:al.get(i))
				{
					in[l]--;
				}

				alltopo(visited,in,path);

				visited[i] = false;
				path.remove(i);
				for(int l:al.get(i))
				{
					in[l]++;
				}
			}
			if(path.size()==v)
			{
			for(int m:path)
			{
				System.out.print(m+" ");
			}System.out.println("");
		}
		}
	}
}

public class allTopological{
	public static void main(String[] args) {
		
		Graph graph = new Graph(6); 
        graph.addEdge(5, 2); 
        graph.addEdge(5, 0); 
        graph.addEdge(4, 0); 
        graph.addEdge(4, 1); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 1); 


        graph.topo();

	}
}