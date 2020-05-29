import java.util.*;
class subArraySum
{
	public static void main(String args[])
	{
		int ar[] = { 10, 2, -2, -20, 10 }; 
		
		int len = ar.length;
		
		int requiredSum = -10;

		int sum = 0;
		
		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<len;i++)
		{
			sum=sum+ar[i];
			if(sum==requiredSum)
			{
				System.out.println("subarray found from 0 to "+i);

			}
			if(h.containsKey(sum-requiredSum))
			{
				System.out.println("subarray found from "+(h.get(sum-requiredSum)+1)+" to "+i);
			}
			else
				h.put(sum,i);
		}

	}
}