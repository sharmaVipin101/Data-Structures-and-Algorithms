import java.util.*;

class maximumDistanceBetweenTwoElements
{
	public static void main(String[] args) {
		int ar[] = {3, 2, 1 ,2 ,1 ,4,5, 8, 6, 7 ,4, 2};

			int max = 0;

		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<ar.length;i++)
		{
			if(h.containsKey(ar[i]))
			{
				max = Math.max(max,i-h.get(ar[i]));
			}
			else
				h.put(ar[i],1);

		}
		System.out.println(max);
	}
}