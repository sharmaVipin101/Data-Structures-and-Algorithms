import java.util.*;


public class segment{
	static int st[] = new int[16];

	static void build(int ar[],int start,int end,int index)
	{
		if(start==end)
		{
			st[index] = ar[start];
		}

		int mid = (start+end)/2;

		build(ar,start,mid,2*index+1);
		build(ar,mid+1,end,2*end+2);
		st[index] = st[index*2]+st[index*2+1];
		

	}

	static int getsum(int qs,int qe,int ss,int se,int index)
	{
		if(qs> se || qe<ss)
			return 0;
		if(ss>qs && qe<se)
			return st[index];

		int mid = (ss+se)/2;

		return getsum(qs,qe,ss,mid,2*index+1)+getsum(qs,qe,mid+1,se,2*index+2);
	}
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4};

		build(ar,0,ar.length-1,0);

		int x = getsum(2,3,0,9,0);

		System.out.println(x);

	}
}