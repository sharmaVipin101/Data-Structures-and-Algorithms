

class minDiff{

	static int find(int ar[],int start,int end,int key){

		while(start<=end)
		{
			int mid = start+(end-start)/2;

			if(ar[mid]==key)
			{
				return 0;
			}
			else if(ar[mid]>key)
			{
				end = mid-1;
			}
			else start = mid+1;
		}

		return Math.min(Math.abs(ar[start]-key),Math.abs(ar[start]-key));
	}

	public static void main(String[] args) {
		
		int ar[] = {1,2,5,7,12,15};
		int key = 10;

		System.out.println(find(ar,0,ar.length-1,key));
	}
}