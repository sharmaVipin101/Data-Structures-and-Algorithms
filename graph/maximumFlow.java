import java.util.*;


public class maximumFlow{

	static int v=6;//vertices

	static int find(int ar[][],int src,int des)
	{
		int r = 6;
		int c = 6;

		int temp[][] = new int[r][c];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				temp[i][j]=ar[i][j];
			}
		}

		int parent[] = new int[v];
		int max_flow = 0;

		while(bfs(temp,src,des,parent))
		{

			
			int flow =Integer.MAX_VALUE;
			
			for(int i=des;i!=src;i=parent[i])
			{
				int y = parent[i];
				flow = Math.min(flow,temp[y][i]);
			}

			for(int i=des;i!=src;i=parent[i])
			{
				int y = parent[i];
				temp[y][i]-=flow;
				temp[i][y]+=flow;
			}
			
			max_flow+=flow;






		}
		return max_flow;
	}

	static boolean bfs(int ar[][],int src,int des,int parent[])
	{
		Queue<Integer> q = new LinkedList<>();
		boolean visited[] = new boolean[v];

		q.add(src);
		visited[src]=true;
		parent[src]=-1;

		while(!q.isEmpty())
		{
			int temp = q.poll();

			

			for(int i =0;i<v;i++)
			{
				if(ar[temp][i]>0 && visited[i])
				{
					visited[i]=true;
					q.add(i);
					parent[i]=temp;
				}
			}
		}

		return visited[des]==true;
	}
	public static void main(String[] args) {
		
		int ar[][] = {{0, 16, 13, 0, 0, 0}, 
                      {0, 0, 10, 12, 0, 0}, 
                      {0, 4, 0, 0, 14, 0}, 
                      {0, 0, 9, 0, 0, 20}, 
                      {0, 0, 0, 7, 0, 4}, 
                      {0, 0, 0, 0, 0, 0}}; 


           System.out.println(find(ar,0,5));
	}
}