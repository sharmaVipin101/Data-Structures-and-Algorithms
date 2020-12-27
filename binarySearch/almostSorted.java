import java.util.*;

class almostSorted{

	static int find(int ar[],int start,int end,int key)
	{
		while(start<=end)
		{
			int mid = start +(end-start)/2;

			if(ar[mid]==key)
			{
				return mid;
			}
			else if(mid-1>=0 && ar[mid-1]==key)
			{
				return mid-1;
			}
			else if(mid+1<=end && ar[mid+1]==key)
			{
				return mid+1;
			}

			else if(ar[mid]>key)
			{
				end = mid-2;
			}
			else start = mid+2;
		}return -1;
	}

	public static void main(String[] args) {
		
		int ar[] = {10, 3, 40, 20, 50, 80, 70};

		int key = 40;

		System.out.println(find(ar,0,ar.length-1,key));
	}
}