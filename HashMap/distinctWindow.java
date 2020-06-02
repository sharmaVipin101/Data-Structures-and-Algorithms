import java.util.*;
class distinctWindow
{
	public static void main(String[] args) {
		int ar[] = {1, 2 ,1 ,3 ,4, 2, 3};
		int k = 4;
		int count = 0;
		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<k;i++)//0,1,2,3
		{
			if(h.containsKey(ar[i]))
			{
				h.put(ar[i],h.get(ar[i])+1);
			}
			else
			{
				h.put(ar[i],1);
				count++;
			}
		}
		System.out.print(count+" ");

		for(int i=k;i<ar.length;i++)//4 5 6 7(i==4||k==4)
		{
			if(h.get(ar[i-k])>1)
			{
				h.put(ar[i-k],h.get(ar[i-k])-1);
			}
			else
			{
				h.remove(ar[i-k]);
				count--;
			}

			if(h.containsKey(ar[i]))
			{
				h.put(ar[i],h.get(ar[i])+1);
			}
			else
			{
				h.put(ar[i],1);
				count++;
			}

			System.out.print(count+" ");
		}
	}
}