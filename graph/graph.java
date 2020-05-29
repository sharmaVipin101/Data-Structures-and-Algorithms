class graph//adjacency matrix
{	int Nodes;
	boolean directed;
	boolean weighted;
	int adjacency[][];
	graph(int Nodes,boolean directed)
	{
		this.Nodes = Nodes;
		this.directed = directed;
		adjacency = new int[Nodes][Nodes];
	}
public	void addEdge(int source,int destination)
	{
		if(directed)
		{
			adjacency[source][destination] = destination+1;
		}
		else 
			{adjacency[source][destination] = destination+1;
			adjacency[destination][source] = source+1;}


	}

	public	void addEdge(int source,int destination,int weighted)
	{
		if(directed)
		{
			adjacency[source][destination] = weighted;
		}
		else 
		{
				adjacency[source][destination] = weighted;
			adjacency[destination][source] = weighted;
		}

	}



public	void printAdjacency()
	{
		for(int i=0;i<Nodes;i++)
		{
			for(int j= 0 ;j<Nodes;j++)
			{
				System.out.print(adjacency[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

public	void printEdges()
	{
		for(int i=0;i<Nodes;i++)
		{System.out.print("Path from "+i+" to :");
			for(int j= 0 ;j<Nodes;j++)
			{if(adjacency[i][j]>0)
				System.out.print(adjacency[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[])
	{//////////////////nodes/directed
	graph g = new graph(5,false);

	g.addEdge(1,2);
	g.addEdge(1,4);
	g.addEdge(1,3);
	g.addEdge(2,4);
	g.addEdge(3,4);

	g.printAdjacency();
	System.out.println("______________________ ");
	g.printEdges();

	}

}