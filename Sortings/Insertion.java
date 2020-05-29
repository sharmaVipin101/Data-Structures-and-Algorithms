import java.util.*;
class Insertion
{
	public static void main(String[] args) {
		int ar[] = {8,6,2,7,9,6,5,3,6,1};

		int len = ar.length;

		for(int i=1;i<len;i++)
		{
			int key = ar[i];
			int j = i-1;
			while(j>=0 && ar[j]>key)
			{
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = key;
		}
		System.out.println(Arrays.toString(ar));
	}
	
}