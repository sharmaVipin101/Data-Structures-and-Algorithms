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

	void find(){

		int in[] = new int[v];
		int out[] = new int[v];


		for(int i=0;i<v;i++)
		{
			out[i] = al.get(i).size();
			for(int j:al.get(i))
			in[j]++;
		}

		// System.out.println(Arrays.toString(in));
		// System.out.println(Arrays.toString(out));
int src = -1;
int des = -1;

		for(int i=0;i<v;i++)
		{
			if(in[i]-out[i]<0)
			{
				src = i;
			}
			if((out[i]-in[i]%2!=0))
			{
				des = i;
			}
		}

		// System.out.println(src+" "+des);

		ArrayList<Integer> path  = new ArrayList<Integer>();

		dfs(src,des,out,path);

		System.out.println(path.toString());
	}

	void dfs(int src,int des,int out[],ArrayList<Integer> path)
	{
// System.out.println(src);

		// for(int i:al.get(src))
		// {
		// 	if(out[i]!=0)
		// 	{
		// 		out[i] = out[i]-1;
		// 		dfs(i,des,out,path);
		// 	}
		// }path.add(src);

		while(out[src]!=0)
		{
			int next = al.get(src).get(--out[src]);
			dfs(next,des,out,path);
		}
		path.add(src);
	}
}

public class euler{
	public static void main(String[] args) {
		
		Graph g = new Graph(7);

		// g.add(0,null);
		g.add(1,2);
		g.add(1,3);
		g.add(2,2);
		g.add(2,4);
		g.add(2,4);
		g.add(3,2);
		g.add(3,1);
		g.add(3,5);
		g.add(4,6);
		g.add(4,3);
		g.add(5,6);
		g.add(6,3);

		g.find();

	}
}