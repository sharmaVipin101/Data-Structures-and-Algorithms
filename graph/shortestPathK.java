import java.util.*;

class Pair{
	int des,wei;
	Pair(int a,int b)
	{
		des=a;
		wei=b;
	}
}

class Graph{
	int v;
	ArrayList<ArrayList<Pair>> al = new ArrayList<ArrayList<Pair>>();

	Graph(int v){
		this.v=v;
		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}
	}

	void add(int src,int des,int wei)
	{
		al.get(src).add(new Pair(des,wei));
	}

	void find(int from,int to,int k)
	{
		boolean visited[] = new boolean[v];
		int sum=0;
		int res[] = {Integer.MAX_VALUE};
		dfs(from,to,k,visited,sum,res);

		System.out.println(res[0]);
	}

	void dfs(int from,int to,int k,boolean visited[],int sum,int res[])
	{
		if(from==to && k==0)
		{
			res[0]=Math.min(res[0],sum);
			return;
		}
		if(k==0)
			return;

		visited[from]=true;

		for(Pair i:al.get(from))
		{
			
			if(!visited[i.des])
			{
				sum+=i.wei;
				dfs(i.des,to,k-1,visited,sum,res);
					sum-=i.wei;
			}
		}
		visited[from]=false;
		
	}
}

public class shortestPathK
{
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		
		g.add(0,1,10);
		g.add(0,2,3);
		g.add(0,3,2);
		g.add(2,3,6);
		g.add(1,3,7);

		g.find(0,3,2);
	}
}