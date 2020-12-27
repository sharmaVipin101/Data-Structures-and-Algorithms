import java.util.*;


class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

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

	boolean cycle(){

		int indegree[] = new int[v];

		Queue<Integer> q = new LinkedList<>();
		int count = 0;

		for(int i=0;i<al.size();i++)
		{
			indegree[i] = al.get(i).size();
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}

		while(!q.isEmpty())
		{
			int temp = q.poll();
			count++;

			for(int i:al.get(temp))
			{
				indegree[i]--;

				if(indegree[i]==0)
					q.add(i);
			}
		}

		if(count!=v)
		{
			return true;
		}return false;


	}


}
public class cycleDirectedBFS{

	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.add(0,1);
		g.add(0,2);
		g.add(1,2);
		g.add(2,0);
		g.add(2,3);
		g.add(3,3);

		if(g.cycle())
			System.out.println("YES");
		else System.out.println("NOO");
	}
}