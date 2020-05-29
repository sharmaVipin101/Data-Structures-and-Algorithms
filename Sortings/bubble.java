import java.util.*;
class bubble
{
	public static void main(String args[])
	{
		int ar[] = {8,6,2,7,9,6,5,3,6,1};

		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
//starts from 0th index and will take largest no. to end.(therefor we do not check last position(-i-1) in second loop)

//worst and average O(n*n),best O(n) sorted;

