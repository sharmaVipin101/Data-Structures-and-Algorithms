

import java.util.*;

class Pair{
	int num;
	int fre;

	Pair(int a,int b)
	{
		num = a;
		fre = b;
	}
}

class kFrequent{
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,1,2,3,3,4,4};

		int k = 2;


		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<ar.length;i++)
		{
			if(h.containsKey(ar[i]))
			{
				h.put(ar[i],h.get(ar[i])+1);
			}
			else h.put(ar[i],1);
		}

		PriorityQueue<Pair> q = new PriorityQueue<>(new Comparator<Pair>(){

			public int compare(Pair a,Pair b)
			{
				return a.fre-b.fre;
			}
		});

		for(int i:h.keySet())
		{
			q.add(new Pair(i,h.get(i)));
			if(q.size()>k)
			{
				q.poll();
			}
		}

		while(q.size()>0)
		{
			System.out.println(q.poll().num);
		}

	}
}