import java.util.*;
class abcd
{
	public static void main(String args[])
	{
		int ar[] = {3, 4, 7, 1, 2, 9, 8};

		HashMap<Integer,List<Integer>> h = new HashMap<>();

		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int sum = ar[i]+ar[j];
				if(!h.containsKey(sum))
				{
					ArrayList<Integer> l = new ArrayList<>();
					l.add(i);
					l.add(j);
					h.put(sum,l);
				}
				else
				{
				List<Integer> l =h.get(sum);
				System.out.println(ar[l.get(0)]+" "+ar[l.get(1)]+" "+ar[i]+" "+ar[j]);
				break;
				}
			}
		}
	}
}