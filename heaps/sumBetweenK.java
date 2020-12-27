import java.util.*;

class sumBetweenK{
	public static void main(String[] args) {
		
		int ar[] = { 20, 8, 22, 4, 12, 10, 14 }; 
    	int k1 = 3, k2 = 6;
    	int count = k2-k1-1;

    	PriorityQueue<Integer> q = new PriorityQueue<>();

    	for(int i=0;i<ar.length;i++)
    	{
    		q.add(ar[i]);
    	}

    	while(k1-->0)
    	{
    		q.poll();
    	}

    	int sum = 0;

    	while(count-->0)
    	{
    		sum+=q.poll();
    	}

    	System.out.println(sum);



	}
}