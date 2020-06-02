import java.util.*;

class consecutiveSequence
{
	public static void main(String[] args) {
		int ar[] = {36 ,41 ,56 ,35, 44, 33, 34, 92, 43, 32, 42};

		int len = ar.length;

		HashSet<Integer> h = new HashSet<>();

		for(int i=0;i<len;i++)
		{
			h.add(ar[i]);
		}
		int res = 0;
		for(int i=0;i<len;i++)
		{
			if(!h.contains(ar[i]-1))
			{
				int j = ar[i];

				while(h.contains(j))
				{
					j++;
				}

				if(j-ar[i]>res)
				{
					res = j-ar[i];
				}
			}
		}
		System.out.println(res);
	}
}