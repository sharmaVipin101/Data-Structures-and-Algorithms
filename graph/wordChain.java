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
		al.get(des).add(src);
	}

	void find(int src,int des)
	{
		boolean[] visited = new boolean[v];
		int lvl[] = new int[v];

		Queue<Integer> q = new LinkedList<>();

		q.add(src);
		lvl[src]=1;

		while(!q.isEmpty())
		{
			int temp = q.poll();
			visited[temp] = true;

			if(temp==des)
				break;

			for(int i:al.get(temp))
			{
				if(visited[i]==false)
				{
					q.add(i);
					lvl[i]=lvl[temp]+1;
				}
			}
		}

		System.out.println(lvl[des]);
	}
}

public class wordChain{

	static boolean compare(String a,String b)
	{
		int count = 0;

		for(int i=0;i<4;i++)
		{
			if(a.charAt(i)!=b.charAt(i))
				count++;
		}

		return count==1;
	}
	public static void main(String[] args) {
		
		//String ar[] = {"TOON","PLEA","POON", "PLEE", "SAME", "POIE", "PLEA", "PLIE", "POIN"};

		String ar[] = {"ABCV","EBAD","ABCD", "EBAD", "EBCD", "XYZA"};
	

		Graph g = new Graph(ar.length);

		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(compare(ar[i],ar[j]))
					g.add(i,j);
			}
		}

		int src = 0;//TOON
		int des = 1;//PLEA

		g.find(src,des);


	}
}