import java.util.*;

class Pair{
	int a;
	int b;

	Pair(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class kclosest{
	public static void main(String[] args) {

		Comparator<Pair> z = new Comparator<Pair>() {
            @Override
            public int compare(Pair s1, Pair s2) {
                return s2.a - s1.a;//assec top to down
            }
        };
		
		PriorityQueue<Pair> q = new PriorityQueue<>(z);
	
		int ar[] = {5,6,7,8,9};
		int k = 3;
		int cl = 7;

		for(int i=0;i<ar.length;i++){

			q.add(new Pair(Math.abs(cl-ar[i]),ar[i]));

			if(q.size()>k)
			{
				q.poll();
			}
		}

		while(q.size()>0)
		{
			System.out.println(q.poll().b+" ");
		}
		
		
	}
}
