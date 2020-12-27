

class searchBitonic{


	static int left(int ar[],int start,int end,int key)
	{
		while(start<=end)
		{
			int mid = start+(end-start)/2;

			if(ar[mid]==key)
			{
				return mid;
			}
			else if(ar[mid]>key)
			{
				end = mid-1;
			}
			else start = mid+1;
		}
		return -1;
	}

	static int right(int ar[],int start,int end,int key){

		while(start<=end)
		{
			int mid = start+(end-start)/2;

			if(ar[mid]==key)
				return mid;

			else if(ar[mid]>key)
			{
				start = mid+1;
			}
			else end = mid-1;  
		}
		return -1;
	}

	static int find(int ar[],int start,int end)
	{
		int peak=-1;

		while(start<=end)
		{

			int mid = start+(end-start)/2;

			if(mid>0 && mid<ar.length-1)
			{
				if(ar[mid]>ar[mid-1] && ar[mid]>ar[mid-1])
				{
					return mid;
				}
				else if(ar[mid-1]>ar[mid])
				{
					end = mid-1;
				}
				else start = mid+1;
			}
			else if(mid==0) 
			{
				if(ar[0]>ar[1])
					return 0;
			}
			else if(mid==ar.length-1) {
				if(ar[mid]>ar[mid-1])
					return mid-1;
				
			}
		}
		return peak;
	}
	public static void main(String[] args) {
		
		int ar[] = {-3, 9, 8, 20, 17, 5, 1};

		int key = 1;

		int pindex = find(ar,0,ar.length-1);

		int ans1 = left(ar,0,pindex,key);
		int ans2 = right(ar,pindex+1,ar.length-1,key);

		System.out.println(ans1==-1?ans2:ans1);
	}
}