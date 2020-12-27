//all source to all destination, minimum distance


import java.util.*;

public class floyd{
final static int INF = 9999;
	static void solve(int graph[][])
	{
		int res[][] = new int[graph.length][graph[0].length];

		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[0].length;j++)
			{
				res[i][j] = graph[i][j];
			}
		}

		for(int k=0;k<graph.length;k++)
		{
			for(int i=0;i<graph.length;i++)
			{
				for(int j=0;j<graph.length;j++)
				{
					if(graph[i][k]+graph[k][j]<graph[i][j])
					{
						graph[i][j] = graph[i][k]+graph[k][j];
					}
				}
			}
		}

		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}System.out.println("");
		}


	}
	public static void main(String[] args) {
		int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        };

        solve(graph);
	}
}