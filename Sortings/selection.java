import java.util.*;
class selection
{
	
	public static void main(String args[])
	{
		int ar[] = {8,6,2,7,9,6,5,3,6,1};

		for(int i=0;i<ar.length-1;i++)
		{
			int min_index = i;//1
			for(int j=i+1;j<ar.length;j++)//j=2
			{
				if(ar[j]<ar[min_index])
				{
					min_index = j;
				}//2<
			}
				int temp = ar[min_index];
				ar[min_index] = ar[i];
				ar[i] = temp;
			
		}

		System.out.println(Arrays.toString(ar));
	}
}
//time complexity O(n*n);
//no extra space required
//
//