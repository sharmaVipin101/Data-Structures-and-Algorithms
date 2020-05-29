import java.util.*;
class maxDiff
{
	public static void main(String args[])
	{
		int ar[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		
		int len = ar.length;

		HashMap<Integer,Integer> h = new HashMap<>();

		int diff = 0;

		for(int i=0;i<len;i++)
		{
			if(!h.containsKey(ar[i]))
			{
				h.put(ar[i],i);
			}
			diff = Math.max(diff,i-h.get(ar[i]));
		}
		System.out.println(diff);

	}
}