import java.util.*;
class subArrayMaxFreq
{
	public static void main(String args[])
	{
		int ar[] = {4, 1, 1, 2, 2, 1, 3, 3} ;
		int len = ar.length;

		HashMap<Integer,Integer> map = new HashMap<>();
		HashMap<Integer,Integer> startIndex = new HashMap<>();
		HashMap<Integer,Integer> endIndex = new HashMap<>();

		int freq = 0;

		for(int i=0;i<len;i++)
		{
			if(map.containsKey(ar[i]))
			{
				map.put(ar[i],map.get(ar[i])+1);
			}
			else
			{
				startIndex.put(ar[i],i);
				map.put(ar[i],1);
			}
			endIndex.put(ar[i],i);
			freq = Math.max(freq,map.get(ar[i]));

		}

		int result=len;

		for(int i: map.keySet())
		{
			if(freq==map.get(i))
			{
				int leng = endIndex.get(i)-startIndex.get(i)+1;
				result = Math.min(result,leng);
			}
		}
		System.out.println(result);
	}
}