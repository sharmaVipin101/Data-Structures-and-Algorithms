import java.util.*;
import java.lang.*;
class graphs
{
	int vertices;
	LinkedList<Integer> adjacency[];
	boolean directed;

	graphs(int vertices,boolean directed)
	{
		this.vertices = vertices;
		this.directed = directed;
		adjacency = new LinkedList[vertices];

		for(int i=0;i<vertices;i++)
		{
			adjacency[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int source,int destination)
	{
		if(directed)
		{
			adjacency[source].add(destination);
		}
		else
		{
			adjacency[source].add(destination);
			adjacency[destination].add(source);
		}
	}
		void printAdjacency()
	{
		for(int i=0;i<vertices;i++)
		{
			System.out.println("The "+i+" has edge towards :-"+adjacency[i]);
		}
	}



	public static void main(String args[])
	{///////////////////////vertices,directed
		graphs g = new graphs(5,true);

		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,1);
		g.addEdge(1,3);
		g.addEdge(3,5);
		g.addEdge(2,5);

		g.printAdjacency();




	}
}