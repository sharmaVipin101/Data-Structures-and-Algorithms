import java.util.*;


class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	int length=0;
	Graph(int v){
		this.v=v;
		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}

	}

	void add(int src,int des)
	{
		al.get(src).add(des);
		al.get(des).add(src);
	}

	boolean length()
	{
		ArrayList<Integer> li = new ArrayList<>();
	
		boolean visited[] = new boolean[v];
int len=0;
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				if(dfs(i,visited,-1,li,len))
					{System.out.println(li.toString());
						System.out.println(length);
						return true;
					}
			}
		}
		
		return false;
	}

	boolean dfs(int src,boolean visited[],int parent,ArrayList<Integer> li,int len)   
	{
		li.add(src);
		visited[src] = true;

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				if(dfs(i,visited,src,li,len+1))
					{length=len;
						return true;
					}
			}else if(parent!=i)
			{length=len;
				return true;
			}
		}
		li.remove(src); 
		return false;
	}

}

public class cycleLength{

	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.add(0,1);
		g.add(1,2);
		g.add(2,3);
		g.add(3,1);
		// g.add(2,3);
		// g.add(3,4);

		System.out.println(g.length());
	}
}

