import java.util.*;

class nothreeconsSum{

	static int find(int ar[],int len)
	{
		int res[] = new int[len];

		res[0] = ar[0];

		res[1] = ar[0]+ar[1];

		res[2] = Math.max(res[1],Math.max(ar[0]+ar[2],ar[1]+ar[2]));

		for(int i=3;i<len;i++)
		{
			res[i] = Math.max(Math.max(res[i-1],ar[i]+res[i-2]),ar[i-1]+res[i-3]+ar[i]);
		}

		return res[len-1];

	}
	public static void main(String[] args) {
		
		int ar[] = {3000,2000,1000,3,10};


		int len = ar.length;

		System.out.println(find(ar,len));
	}
}


