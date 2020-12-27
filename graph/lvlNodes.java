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

	int atlvl(int lvle)
	{
		Queue<Integer> q = new LinkedList<>();

		q.add(0);

		int lvl[] = new int[v];

		lvl[0]=0;

		while(!q.isEmpty())
		{
			int temp = q.poll();

			for(int i:al.get(temp))
			{
				q.add(i);
				lvl[i]=lvl[temp]+1;
			}
		}
int count=0;
		for(int i:lvl)
		{
			if(i==lvle)
			{
				count++;
			}
		}

		return count;
	}

}

public class lvlNodes{
	public static void main(String[] args) {
			

		// 7
  //         0 1
  //         0 2
  //         1 3
  //         1 4 
  //         1 5
  //         2 6
  //         2

		Graph g = new Graph(7);
		g.add(0,1);
		g.add(0,2);
		g.add(1,3);
		g.add(1,4);
		g.add(1,5);
		g.add(2,6);
		int lvl=  2;

		System.out.println(g.atlvl(2));

	}
}