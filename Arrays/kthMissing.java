import java.util.*;
class kthMissing
{
	public static void main(String args[])
	{
		// int ar[] = {2, 4, 10, 7};
		int ar[] = {1,2,3,10};
		int key = 5;
		int len = ar.length;

		Arrays.sort(ar);

		
		for(int i=0;i<len-1;i++)
		{
			int diff = 0;

			if(ar[i+1]!=ar[i]+1)
			{
				diff = ar[1+i]-ar[i]-1;
				if(key<=diff)
				{
					System.out.println(key+ar[i]);
					break;
				}
				else key-=diff;
				
			}

		}


	}
}