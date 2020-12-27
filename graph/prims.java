//prims is used for minimum spanning tree
//step 1: choose random node;
//find adjacent node with minimum distance and fuck off
//greedyy chor 
//O(v*v)

import java.util.*;

public class prims{


static int min(boolean visited[],int distance[])
{
	int min = Integer.MAX_VALUE;
	int index = -1;

	for(int i=0;i<visited.length;i++)
	{
		if(distance[i]<min && !visited[i])
		{
			min = distance[i];
			index=i;
		}
	}
	return index;
}
	static void prims(int graph[][])
	{
		int v = graph.length;
		
		int distance[] = new int[v];
		int parent[] = new int[v];
		boolean visited[] = new boolean[v];

		for(int i=0;i<v;i++)
		{
			distance[i] =Integer.MAX_VALUE; 
		}

		distance[0] = 0;
		parent[0] = -1;//god

		for(int i=0;i<v-1;i++)
		{
			int src = min(visited,distance);//minimum distance node
			visited[src] = true;
			for(int des=0;des<v;des++)
			{
				if(graph[src][des]!=0 && !visited[des] && graph[src][des]<distance[des])
				{
					parent[des] = src;
					distance[des] = graph[src][des];
				}
			}

		}

		for(int i=0;i<v;i++)
		{
			System.out.println("source "+parent[i]+", destination "+i+", distance = "+distance[i]);
		}



	}
	public static void main(String[] args) {

		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };

        prims(graph);
	}
}