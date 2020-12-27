import java.util.*;

public class megr 
{

	static void merge(int ar[],int start,int mid,int end)
	{

		int len1 = mid-start+1;
		int len2 = end-mid;

		int a1[] = new int[len1];

		int a2[] = new int[len2];

		for(int i=0;i<len1;i++)
		{
			a1[i] = ar[start+i];
		}

		for(int i=0;i<len2;i++)
		{
			a2[i] = ar[mid+1+i];
		}

		int index = start;


		int i = 0,j=0;

		while(i<len1 && j<len2)
		{
			if(a1[i]<a2[j])
			{
				ar[index++] = a1[i++];
			}else if(a2[j]<a1[i])
			{
				ar[index++] = a2[j++];
			}else if(a1[i]==a2[j])
			{
				ar[index++] = a1[i];
				i++;
				j++;
			}
		}

		while(i<len1)
		{
			ar[index++] = a1[i++];
		}
		while(j<len2)
		{
			ar[index++] = a2[j++]
		}

	}

	static void sort(int ar[],int start,int end)
	{

		if(start<end)
		{
			int mid = start+(end-start)/2;

			sort(ar,start,mid);
			sort(ar,mid,end);

			merge(ar,start,mid,end);
		}

	}


	public static void main(String args[])
	{
		int ar[] = {38, 27, 43, 3, 9, 82, 10};

		sort(ar,0,ar.length-1);

		System.out.println(Arrays.toString(ar));
	}
}