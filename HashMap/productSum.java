import java.util.*;
class productSum
{
	public static void main(String args[])
	{
		int ar[] = {3,5,10,30,35}; 
		int len = ar.length;

		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<len;i++)
		{
			if(!h.containsKey(ar[i]))
			{
				h.put(ar[i],1);
			}
		}

		Arrays.sort(ar);

		for(int i=len-1;i>1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(ar[i]%ar[j]==0)
				{
					int x= ar[i]/ar[j];
					if(h.get(x)>0)
					{
						System.out.println(ar[i]);
						
					}
				}
			}
		}
	}
}
//3 5 10 30 35 
//10