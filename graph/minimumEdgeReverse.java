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
}

public class minimumEdgeReverse{
	public static void main(String[] args) {
		
		Graph g = new Graph(7);

		g.add(0,1);
		g.add(2,1);
		g.add(2,3);
		g.add(4,5);
		g.add(5,1);
		g.add(6,3);
		g.add(6,4);

		find();
	}
}