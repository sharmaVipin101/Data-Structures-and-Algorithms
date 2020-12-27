import java.util.*;

class Graph{
	int v;

	ArrayList<ArrayList<Pair>> al = new ArrayList<ArrayList<Pair>>();

	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
			al.add(new ArrayList<>());


	}

	void addEdge(int src,int des,int wei)
	{
		al.get(src).add(new Pair(des,wei));
	}


	void find(int src,int des)
	{
		boolean visited[] = new boolean[v];
		int dist[] = new int[v];

		for(int i=0;i<v;i++)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;


		for(int i=0;i<v-1;i++)
		{
			int u = min(visited,dist);

			visited[u]=true;

			for(Pair j:al.get(i))
			{
				if(!visited[j.des] && dist[j.des]>dist[u]+j.wei)
				{
					dist[j.des]=dist[u]+j.wei;
				}
			}
		}

		System.out.println(Arrays.toString(dist));
	}

	int min(boolean visited[],int dist[])
	{
		int index = -1;
		int min = 11111;

		for(int i=0;i<v;i++){
			if(visited[i]==false && dist[i]<min)
			{
				min=dist[i];
				index=i;
			}
		}
		return index;
	}
}



public class shortestPath{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);

		g.addEdge(0, 1, 2); 
        g.addEdge(0, 2, 2); 
        g.addEdge(1, 2, 1); 
        g.addEdge(1, 3, 1); 
        g.addEdge(2, 0, 1); 
        g.addEdge(2, 3, 2); 
        g.addEdge(3, 3, 2); 

        g.find(0,3);
	}
}


