import java.util.*;
class bfs
{
	int size = 0;
 	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

	bfs(int size)
	{
		this.size = size;
		for(int i=0;i<size;i++)
		{
		 	al.add(new ArrayList<>());
		}
	}

	void addEdge(int src,int des)
	{
		al.get(src).add(des);
	}


	void breadthSearch(int src)
	{
		boolean visited[] = new boolean[size];

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(src);

		while(q.size()>0)
		{
			int temp = q.poll();

			System.out.println(temp);
			visited[temp] = true;

			for(int i:al.get(temp))
			{
				if(!visited[i])
				{
					q.add(i);
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

    

        g.breadthSearch(2);



	}
}