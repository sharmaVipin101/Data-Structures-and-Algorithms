import java.util.*;

class kthLargest{

	static void find(int ar[],int k)
	{
		PriorityQueue<Integer> q = new PriorityQueue<>();

		for(int i=0;i<ar.length;i++){

			q.add(ar[i]);
			if(q.size()>k)
				q.poll();
		}

		while(q.size()>0)
		{
			System.out.print(q.poll()+" ");
		}
	}
	public static void main(String[] args) {
		
		int ar[] = {7,10,4,3,20,15};
		int k = 3;

		find(ar,k);
	}
}