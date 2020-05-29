import java.util.*;
class arrayPair
{
	 void findPair(int ar[],int res)
	{	HashMap<Integer, Integer> pair = new HashMap<Integer,Integer>();
		int i = 0;
		for(i = 0;i<ar.length;i++)
		{
			if(pair.containsKey(res-ar[i]))
			{
				System.out.println(ar[i]+" "+ar[pair.get(res-ar[i])]);
				break;
			}
			pair.put(ar[i], i);//WHY THIS LINE
		}
		
	}

	public static void main(String args[])
	{	arrayPair a = new arrayPair();
		
		int ar[] = {1,5,9,12,45,13,26,31,10,23};
		int res = 10;


		a.findPair(ar,res);
	}
}//