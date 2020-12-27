import java.util.*;


class kSortedArray{


	static void find(int ar[],int k)
	{
		PriorityQueue<Integer> q = new PriorityQueue<>();

		for(int i=0;i<ar.length;i++)
		{
			q.add(ar[i]);
			if(q.size()>k)
			{
				System.out.print(q.poll()+" ");
			}
		}

		while(q.size()>0)
		{
			System.out.print(q.poll()+" ");
		}

	}

	public static void main(String[] args) {
		
		int ar[] = {6,5,3,2,8,10,9};

		int k = 3;

		find(ar,k);
	}
}