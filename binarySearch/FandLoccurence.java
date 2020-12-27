
import java.util.*;


class FandLoccurence{

	static int findl(int ar[],int start,int end,int num)
	{int res = -1;
		
		while(start<=end){

			int mid = start+ (end-start)/2;

		if(ar[mid]==num)
		{
			res = mid;
			end = mid-1;
		} 
		else if(ar[mid]>num)
		{
			end = mid-1;
		}
		else start = mid+1;
		}

return res;
	}

	public static void main(String[] args) {
		
		int ar[] = {2,10,10,10,10,10,18,20};
		int num = 10;

		System.out.println("left most"+findl(ar,0,ar.length-1,num));

		System.out.println("right most"+findr(ar,0,ar.length-1,num));
	}

	static int findr(int ar[],int start,int end,int num)
	{int res = -1;
		
		while(start<=end){

			int mid = start+ (end-start)/2;

		if(ar[mid]==num)
		{
			res = mid;
			start = mid+1;
		} 
		else if(ar[mid]>num)
		{
			end = mid-1;
		}
		else start = mid+1;
		}

return res;
	}
}