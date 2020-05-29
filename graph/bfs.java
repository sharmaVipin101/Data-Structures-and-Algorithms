import java.util.*;
class bfs
{int size = 0;
 LinkedList<Integer> linklistarray[];
	bfs(int size)
	{
		this.size = size;
		linklistarray = new LinkedList[size];

		for(int i=0;i<size;i++)
		{
		 linklistarray[i] = new LinkedList<Integer>();
		}


	}

	void addEdge(int source,int destination)
	{
		linklistarray[source].add(destination);
	}

	void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(linklistarray[i]);
		}
	}

	void breadthSearch(int start)
	{
		boolean visited[] = new boolean[size];

		Queue<Integer> q = new LinkedList<>();

		q.add(start);
		visited[start] = true;

		while(!q.isEmpty())
		{
			int temp = q.poll();
			System.out.print(temp+" ");

			Iterator<Integer> z = linklistarray[temp].iterator();
			while(z.hasNext())
			{
				int n = z.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    q.add(n); 
                } 
			}
		}
	}
	public static void main(String args[])
	{
		bfs g = new bfs(5);

		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 

        g.print();

        g.breadthSearch(2);



	}
}