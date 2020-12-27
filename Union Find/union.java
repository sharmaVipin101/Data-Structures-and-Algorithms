
















class union{

	int parent[];
	int rank[];
	
	union(int len)
	{
		rank = new int[len];
		parent = new int[len];
		for(int i=0;i<len;i++)
		{
			parent[i]=i;
		}
	}

	boolean connected(int a,int b)
	{
		return find(a)==find(b);
	}

	int find(int a)//set parent and hence finds parent 
	{
		if(parent[a]==a)
			return a;

		parent[a] = find(parent[a]);

		return parent[a];
	}

	void add(int a,int b)
	{
		int p1 = find(a);
		int p2 = find(b);

		if(p1==p2)
			return;

		if(rank[p1]==rank[p2])
		{
			parent[p1] = p2;
			rank[p2]++;
		}else if(rank[p1]>rank[p2])
		{
			parent[p2]=p1;
		}else parent[p1]=p2;
	}


}