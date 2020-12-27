import java.util.*;


class Graph{
	int v;
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

	Graph(int v)
	{
		this.v=v;
		for(int i=0;i<v;i++)
			al.add(new ArrayList<Integer>());
	}

	void add(int src,int des)
	{
		al.get(src).add(des);
	}

	void topo()
	{
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[v];


		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			dfs(i,visited,s);
		}
		while (!s.isEmpty()) 
        { 
            System.out.print((char)('a' + s.pop()) + " "); 
        } 
	}

	void dfs(int src,boolean visited[], Stack<Integer> s)
	{
		visited[src]=true;

		for(int i:al.get(src))
		{
			if(!visited[i])
			{
				dfs(i,visited,s);
			}
		}
		s.push(src);
	}
}


public class alienD{

	static void find(String words[],int n)
	{
		Graph g = new Graph(n);

		for(int ip=0;ip<n-1;ip++)
		{
			String a = words[ip];
			String b = words[ip+1];

			for(int i=0;i<Math.min(a.length(),b.length());i++)
			{
				if(a.charAt(i)!=b.charAt(i))
				{
					g.add(a.charAt(i)-'a',b.charAt(i)-'a');
					break;
				}
			}
		}

		g.topo();
	}
	public static void main(String[] args) {
		
		String words[] = {"baa","abcd","abca","cab","cad"};

		find(words,words.length);
	}
}