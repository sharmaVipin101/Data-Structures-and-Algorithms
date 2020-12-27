
import java.util.*;


class Pair{

	int num;
	int freq;

	Pair(int a,int b)
	{
		num = a;
		freq = b;
	}

	@Override
	public String toString()
	{
		return "("+num+" "+freq+" )";
	}

}

class fequencySort{
	public static void main(String[] args) {
		
		int ar[] = {1,1,1,3,2,2,4};

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
				return a.freq-b.freq;
			}
		});

		for(int i:h.keySet())
		{
			q.add(new Pair(i,h.get(i)));
		}


		while(q.size()>0)
		{
			System.out.println(q.poll());
		}


	}
}