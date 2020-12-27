import java.util.*;


public class connectCities{

	static int mini(int cost[],boolean visited[])
	{
		int inde=-1;
		int mi = 2147483647;

		for(int i=0;i<cost.length;i++)
		{
			if(visited[i]==false && cost[i]<mi)
			{
				inde = i;
				mi = cost[i];
			}
		}
		return inde;
	}

	static int min(int ar[][])
	{
		int len = ar.length;

		int cost[] = new int[len];
		boolean visited[] = new boolean[len];
		Arrays.fill(cost,Integer.MAX_VALUE);
		cost[0]=0;


		for(int i=0;i<len-1;i++)
		{
			int u = mini(cost,visited);
			visited[u]=true;
			for(int v=0;v<len;v++)
			{
				if(ar[u][v]!=0 && !visited[v] && cost[v]>ar[u][v])
				{
					cost[v]=ar[u][v];
				}
			}

		}

		int sum = 0;
		for(int i:cost)
			sum+=i;

		return sum;
	}
	public static void main(String[] args) {
		
		int ar[][] = {{0, 1, 1, 100, 0, 0}, 
                               {1, 0, 1, 0, 0, 0}, 
                               {1, 1, 0, 0, 0, 0},    
                               {100, 0, 0, 0, 2, 2}, 
                               {0, 0, 0, 2, 0, 2},   
                               {0, 0, 0, 2, 2, 0}}; 

		System.out.println(min(ar));

	}
}