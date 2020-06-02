import java.util.*;

class largestSubarrayZeroSum
{
	public static void main(String[] args) {

		int sum = 0;
		int max = 0;
		int ar[] = {15, -2 ,2 ,-8 ,1 ,7 ,10 ,23};

		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
			if(h.containsKey(sum))
			{
				max = Math.max(max,i-h.get(sum));
			}
			else
				h.put(sum,i);
		}
		System.out.println(max);
	}
}