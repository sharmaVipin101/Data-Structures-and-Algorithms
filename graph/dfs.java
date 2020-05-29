import java.util.*;
class dfs
{	int size;
	LinkedList<Integer> qw[];

	dfs(int a)
	{
		size = a;
		qw = new LinkedList[size];
		for(int i=0;i<size;i++)
			qw[i] = new LinkedList<>();
	}

	void addEdge(int source,int destination)
	{
		qw[source].add(destination);
	}

	void dfs(int start)
	{
		boolean visited[] = new boolean[size];
		dfss(start,visited);
	}

	void dfss(int start, boolean visited[])
	{
		visited[start] = true;
		System.out.print(start+" ");

		Iterator<Integer> i = qw[start].iterator();

		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
				dfss(n,visited);
		}
	}

	public static void main(String args[])
	{
		dfs g = new dfs(4);

		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 

        g.dfs(2);
	}
}