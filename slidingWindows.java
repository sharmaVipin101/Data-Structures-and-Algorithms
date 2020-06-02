import java.util.*;
class slidingWindows{

	static void slide(int ar[],int k,int n)
	{
		Deque<Integer> q = new LinkedList<>();

		for(int i=0;i<k;i++)
		{
			while(!q.isEmpty() && ar[i]>=ar[q.peekLast()])
			{
				q.removeLast();
			} 
			q.addLast(i);
		}

		for(int i=k;i<n;i++)
		{
			System.out.print(ar[q.peekFirst()]+" ");

			while(!q.isEmpty() && ar[i]<=i-k)
			{
				q.removeFirst();
			}

			while(!q.isEmpty() && ar[i]>=ar[q.peekLast()])
			{
				q.removeLast();
			} 
			q.addLast(i);

		}
			System.out.print(ar[q.peekFirst()]+" ");


	}

	public static void main(String[] args) {
		
		int ar[] = {8, 5, 10, 7 ,9 ,4 ,15, 12, 90, 13};
		int n = ar.length;

		slide(ar,4,n);
	}
}