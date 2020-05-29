import java.util.*;
import java.io.*;
class nonOverlapSum
{
	static void maxsum(int ar[],int key)
	{
		for(int j=0;j<key;j++)
		{
		int sum = 0;
		int max_till = Integer.MIN_VALUE;
		int start = 0;
		int s = 0;
		int end = 0;

		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			if(sum>max_till)
				{max_till = sum;
			start = s;
			end = i;}
			if(sum<0)
				{sum = 0;
			s= i+1;}
		}

		System.out.println("SUM OF NON-OVERLAPPING ARRAY is"+max_till+"from "+start+" to "+end);

		for(int r = start;r<end;r++)
		{
			ar[r] = Integer.MIN_VALUE;
		}
	}

	}
	public static void main(String args[])
	{
		int ar[] = {4, 1, 1, -1, -3, -5, 6, 2, -6, -2};

		int key = 3;

		maxsum(ar,key);
	}
}