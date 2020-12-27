

import java.util.*;

class ktimesorted{

	static int find(int ar[],int start,int end){
 
		 while(start<=end)
		 {
		 	int mid = start +(end-start)/2;

		 	if(mid>start && ar[mid-1]>ar[mid])//when mid is the smallest element
		 	{
		 		return mid;
		 	}
		 	else if(end>mid && ar[mid+1]<ar[mid])//when mid+1 element is the smallest
		 	{
		 		return mid+1;
		 	}
		 	else if(ar[mid]<ar[end])
		 	{
		 		mid=end-1;
		 	}
		 	else start = mid+1;

		 }return -1;
	}

	public static void main(String[] args) {
		
		int ar[] = {15, 18, 2, 3, 6, 12};

		System.out.println(find(ar,0,ar.length-1));
	}
}

