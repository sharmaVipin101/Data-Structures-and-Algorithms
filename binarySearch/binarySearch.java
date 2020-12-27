
import java.util.*;

class binarySearch{

	static int find(int ar[],int start,int end,int key)
	{
		int mid = start + (end-start)/2;

		if(ar[mid]==key)
			return mid;

		if(ar[mid]<key)
		{
			start = mid+1;
		}
		else end = mid-1;

		return find(ar,start,end,key);

	}

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6,7,8,9,10};

		int k = 8;

		System.out.println(find(ar,0,ar.length-1,k));
	}
}
