import java.util.*;


class Pair{

	int a,b,c;

	Pair(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
}

class modify implements Comparator<Pair>{
	public int compare(Pair a,Pair b)
	{
		return b.c-a.c;
	} 
}

public class travelMatrix{



	static void dfs(int x,int y,int val,int row,int col,boolean visited[][],int ar[][])
	{
		visited[x][y]=true;
		System.out.println(x+" "+y+"--");

		if(x+1<row && !visited[x+1][y] && ar[x+1][y]<=ar[x][y])
		{
			dfs(x+1,y,val,row,col,visited,ar);
		}
		if(y+1<col && !visited[x][y+1] && ar[x][y+1]<=ar[x][y])
		{
			dfs(x,y+1,val,row,col,visited,ar);
		}
		if(x-1>=0 && !visited[x-1][y] && ar[x-1][y]<=ar[x][y])
		{
			dfs(x-1,y,val,row,col,visited,ar);
		}
		if(y-1>=0 && !visited[x][y-1] && ar[x][y-1]<=ar[x][y])
		{
			dfs(x,y-1,val,row,col,visited,ar);
		}
	}

	
	public static void main(String[] args) {
		
		int ar[][] = {{1,2,3},{2,3,1},{1,1,1}};

		PriorityQueue<Pair> q = new PriorityQueue<Pair>(new modify());

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				q.add(new Pair(i,j,ar[i][j]));
			}
		}

		boolean visited[][] = new boolean[3][3];

		for(Pair temp:q)
		{
			if(visited[temp.a][temp.b]==false)
			{
				System.out.println(temp.a+" "+temp.b);
				dfs(temp.a,temp.b,temp.c,3,3,visited,ar);
			}
		}
	}
}