import java.util.*;

class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	int count;
	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}


	}

	void add(int src,int des)
	{
		al.get(src).add(des);
	}

	int count(int src,int des)
	{
		boolean visited[] = new boolean[v];

		return count(src,des,visited);
	}

	int count(int src,int des,boolean visited[])
	{
		if(src==des)
		{
			count++;
			
		}
		else{
		

			for(int i:al.get(src))
			{
			
					count(i,des,visited);
				
			}

		}

		return count;

	}
}

public class pathBetweenTwo{
	public static void main(String[] args) {
		

		//a=0,b=1,c=2,d=3,e=4
		Graph g = new Graph(5);

		g.add(0,1);
		g.add(0,4);
		g.add(0,2);
		g.add(1,3);
		g.add(1,4);
		g.add(2,4);
		g.add(3,2);

		System.out.println(g.count(0,4));

	}
}