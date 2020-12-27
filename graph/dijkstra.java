//shortest path from single source to any vertex/destination
//O(v*V)

import java.util.*;

public class dijkstra{

	static int min(boolean visited[],int distance[])
	{
		int index = -1;
		int min = Integer.MAX_VALUE;

		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i] && distance[i]<min)
			{
				min = distance[i];
				index = i;
			}
		}
		return index;

	}

	static void solve(int graph[][])
	{	int v = graph.length;

		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		int parent[] = new int[v];

		for(int i=0;i<v;i++)
		{
			distance[i] = Integer.MAX_VALUE;
		}
		distance[0] = 0;

		for(int i=0;i<v-1;i++)
		{
			int src = min(visited,distance);
			visited[src] = true;

			for(int des = 0;des<v;des++)
			{
				if(graph[src][des]!=0 && !visited[des]&& distance[src]!=Integer.MAX_VALUE && distance[src]+graph[src][des]<distance[des])
				{
					parent[des] = src;
					distance[des] = distance[src]+graph[src][des];
				}
			}
		}

		for(int i=0;i<v;i++)
		{
			System.out.println("source = "+parent[i]+", destination = "+i+", distance = "+distance[i]);
		}
	}
	public static void main(String[] args) {
		 int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 

         solve(graph);
	}
}