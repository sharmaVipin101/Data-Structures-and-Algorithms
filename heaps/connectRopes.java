import java.util.*;


class connectRopes{

	public static void main(String[] args) {
		
		int ar[] = {4,3,2,6};

		PriorityQueue<Integer> q = new PriorityQueue<>();


		for(int i=0;i<ar.length;i++){

			q.add(ar[i]);
		}

int res = 0;

		while(q.size()>=2)
		{
			int a = q.poll();
			int b = q.poll();
			res+=a+b;
			q.add(a+b);
		}
		System.out.println(res);
	}
}