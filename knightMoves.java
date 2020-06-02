import java.util.*;

class knightMoves{

	static class xyz
	{
		int x;
		int y;
		int dis;

		xyz(int x,int y,int dis)
		{
			this.x = x;
			this.y = y;
			this.dis = dis;
		}
	}

	static boolean inside(int a,int b,int c)
	{
		if(a>=0 && a<=c && b>=0 && b<=c)
		{
			return true;
		}
		return false;
	}


	static int steps(int start[],int end[],int n)
	{
		int dx[] = {-2,2,-2,2,-1,1,-1,1};
		int dy[] = {-1,1,1,-1,-2,2,2,-2};

		ArrayList<xyz> al = new ArrayList<>();

		al.add(new xyz(start[0],start[1],0));

		boolean visited[][] = new boolean[n+1][n+1];

	

		

		visited[start[0]][start[1]] = true;

		while(!al.isEmpty())
		{
			xyz t = al.get(0);
			al.remove(0);

			if(t.x==end[0] && t.y==end[1])
			{
				return t.dis;
			}

			for(int i=0;i<8;i++)
			{
				int x = t.x+dx[i];
				int y = t.y+dy[i];

				if(inside(x,y,n) && !visited[x][y])
                {
					visited[x][y] = true;
					al.add(new xyz(x,y,t.dis+1));
				}
			}
		}
        
  //       while(!al.isEmpty())
  //       {
  //           xyz t = al.get(0);
            
  //           al.remove(0);
            
  //           if(t.x==end[0] && t.y==end[1])
  //           {
  //               return t.dis;
  //           }
            
            // for(int i=0;i<8;i++)
            // {
            //     int x = t.x+dx[i];
            //     int y = t.y+dy[i];
                
                // if(inside(x,y,n) && !visited[x][y])
                // {
  //                   visited[x][y] = true;
  //                   al.add(new xyz(x,y,t.dis+1));
  //               }
                
  //           }
		// }
		return -1;		
	}

	public static void main(String[] args) {
		
		int N = 30;  
	    int knightPos[] = {1, 1};  
	    int targetPos[] = {30, 30}; 
        System.out.println(steps(knightPos, targetPos, N)); 
	}
}