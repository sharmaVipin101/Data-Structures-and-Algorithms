import java.util.*;


class Pair{
	int x,y,val;
	Pair(int x,int y,int val)
	{
		this.x=x;
		this.y=y;
		this.val=val;
	}
}

public class bank{

static void solve(char a[][])
{
	int r = a.length;
	int c = a[0].length;

	int dx[] = { -1, 0, 1, 0}; 
	int dy[] = { 0, 1, 0, -1 }; 

	int ar[][] = new int[r][c];

	Queue<Pair> q = new LinkedList<>();

	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			if(a[i][j]=='O')
			{
				ar[i][j]=Integer.MAX_VALUE;
				q.add(new Pair(i,j,0));
			}
			else if(a[i][j]=='G')
			{
				ar[i][j]=0;
			}else if(a[i][j]=='W')
			{
				ar[i][j]=-1;
			}
		}
	}


	while(!q.isEmpty())
	{
		Pair temp = q.poll();

		for(int i=0;i<4;i++)
		{
			if(safe(temp.x+dx[i],temp.y+dy[i],r,c,ar))
			{
				ar[temp.x+dx[i]][temp.y+dy[i]] = Math.min(ar[temp.x+dx[i]][temp.y+dy[i]],temp.val+1);
				q.add(new Pair(temp.x+dx[i],temp.y+dy[i],ar[temp.x+dx[i]][temp.y+dy[i]]));
			}
		}
	}

	for(int i[]:ar)
	{
		System.out.println(Arrays.toString(i));
	}



}

static boolean safe(int x,int y,int r,int c,int ar[][])
{
	return x>=0 && x<r && y>=0 && y<c && ar[x][y]!=-1;
}
	public static void main(String[] args) {
		
		char ar[][] = {{'O', 'O', 'O', 'O', 'G'}, 
				        {'O', 'W', 'W', 'O', 'O'}, 
				        {'O', 'O', 'O', 'W', 'O'}, 
				        {'G', 'W', 'W', 'W', 'O'}, 
				        {'O', 'O', 'O', 'O', 'G'}}; 

		solve(ar);
	}
}