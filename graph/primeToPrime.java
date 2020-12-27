// Given two four digit prime numbers, suppose 1033 and 8179, 
// we need to find the shortest path from 1033 to 8179 by
// altering only single digit at a time such that every
// number that we get after changing a digit is prime.
// For example a solution is
// 1033, 1733, 3733, 3739, 3779, 8779, 8179


import java.util.*;

class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
			al.add(new ArrayList<>());
	}

	void add(int src,int des)
	{
		al.get(src).add(des);
	}

	int bfs(int s,int d)
	{
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[v];
int lvl[] = new int[v];
		q.add(s);
		lvl[s]=0;
		vis[s]=true;
		while(!q.isEmpty())
		{
			int temp = q.poll();
			

			for(int i:al.get(temp))
			{
				if(!vis[i])
				{
					lvl[i]=lvl[temp]+1;
					q.add(i);
					vis[i]=true;
				}
				if(i==d)
					return lvl[i];
			}
		}

		return -1;

	}

}

public class primeToPrime{

	static boolean compare(int a,int b)
	{
		String s = String.valueOf(a);
		String ss = String.valueOf(b);

		int count=0;

		for(int i=0;i<4;i++)
		{
			if(s.charAt(i)==ss.charAt(i))
				count++;
		}

		return count==1;
	}

	static void primes(ArrayList<Integer> al)
	{
		boolean ar[] = new boolean[10000];

		Arrays.fill(ar,true);

		for(int i=2;i*i<=9999;i++)
		{
			if(ar[i])
			{
				for(int j=i*i;j<=9999;j+=i)
				{
					ar[i]=false;
				}
			}
		}

		for(int i=1000;i<=9999;i++)
		{
			if(ar[i]==true)
				al.add(i);
		}
	}
	public static void main(String[] args) {
		
		String src = "1033";
		String des = "8179";
	
		ArrayList<Integer> al = new ArrayList<>();

		primes(al);

		Graph g = new Graph(al.size());

		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(compare(al.get(i),al.get(j)))
					g.add(i,j);
			}
		}
		int s=0,d=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==Integer.parseInt(src))
				s=i;

			if(al.get(i)==Integer.parseInt(des))
				d=i;
		}

		System.out.println(g.bfs(s,d));


	}
}