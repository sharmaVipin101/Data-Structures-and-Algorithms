import java.util.*;


class Pair{
	int des,wei;
	Pair(int des,int wei)
	{
		this.des=des;
		this.wei=wei;
	}
}

class Graph{
	int v;
	ArrayList<ArrayList<Pair>> al = new ArrayList<ArrayList<Pair>>();

	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
			al.add(new ArrayList<>());
	}

	void add(int src,int des,int wei)
	{
		al.get(src).add(new Pair(des,wei));
	}


	void min()
	{
		boolean visited[] = new boolean[v];
		boolean rec[] = new boolean[v];

		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				System.out.println(cycle(i,visited,rec,0,0));
			}
		}
	}

	boolean cycle(int src,boolean visited[],boolean rec[],double edges,double sum)
	{
		if(rec[src]==true)
		{
			System.out.println(sum/edges);
			return true;
		}

		if(visited[src])
			return false;

		visited[src]=true;
		rec[src] = true;


		for(Pair i:al.get(src))
		{
			
			{
				edges+=1;
				sum+=i.wei;
				if(cycle(i.des,visited,rec,edges+1,sum+i.wei))
					return true;
				edges-=1;
				sum-=i.wei;
			}
		}
		rec[src]=false;
		return false;
	}
}

public class meanCycle{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.add(0,1,1);
		g.add(0,2,10);
		g.add(1,2,3);
		g.add(2,3,2);
		g.add(3,1,0);
		g.add(3,0,8);
		g.min();
	}
}