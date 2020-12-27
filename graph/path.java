import java.util.*;



public class path{

	static boolean safe(int x,int y,int r,int c,boolean visited[][])
	{
		return x>=0 && x<r && y>=0 && y<c && !visited[x][y];
	}

	static boolean solve(int ar[][],int x,int y,int r,int c,ArrayList<Integer> path,boolean visited[][])
	{
		if(x==r-1 && y==c-1)
		{path.add(ar[x][y]);
			System.out.println(path.toString());
			path.remove(path.size()-1);
			return true;
		}

		visited[x][y]=true;
		path.add(ar[x][y]);
		if(safe(x,y-1,r,c,visited))
		{
			solve(ar,x,y-1,r,c,path,visited);
			
		}

		if(safe(x+1,y,r,c,visited))
		{	
			solve(ar,x+1,y,r,c,path,visited);
			
		}
		if(safe(x,y+1,r,c,visited))
		{
			solve(ar,x,y+1,r,c,path,visited);
			
		}
		if(safe(x-1,y,r,c,visited))
		{
			solve(ar,x-1,y,r,c,path,visited);
			
		}
		
path.remove(path.size()-1);
visited[x][y]=false;
		return false;
	}

	static void find(int ar[][])
	{
		int r = ar.length;
		int c = ar[0].length;

		int x=0;
		int y=0;
		ArrayList<Integer> path = new ArrayList<Integer>();
		boolean visited[][] = new boolean[r][c];
		solve(ar,x,y,r,c,path,visited);
	}
	public static void main(String[] args) {
		int ar[][] = { { 31, 100, 65, 12, 18 }, 
                     { 10, 13, 47, 157, 6 }, 
                     { 100, 113, 174, 11, 33 }, 
                     { 88, 124, 41, 20, 140 }, 
                     { 99, 32, 111, 41, 20 } }; 

         find(ar);
         find(ar);
         find(ar);
         find(ar);
         find(ar);
         find(ar);
	}
}