import java.util.*;


class kthSmallest{

	static int find(int ar[],int k)
	{
		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

		for(int i=0;i<ar.length;i++)
		{
			q.add(ar[i]);
			if(q.size()>k)
			{
				q.poll();
			}
		}
		return q.peek();
	}

	public static void main(String[] args) {
		
		int ar[] = {7,10,4,3,20,15};

		int k = 3;

		System.out.println(find(ar,k));
	}
}