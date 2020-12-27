class peakElement{

	static int find(int ar[],int start,int end){

		while(start<=end){

			int mid = start+(end-start)/2;

			if((mid>0 && mid<ar.length-1)&&(ar[mid]>ar[mid-1]&&ar[mid]>ar[mid+1]))
			{
				
					return mid;
				

			}
			
			else if(ar[mid-1]>ar[mid])
			{
				end = mid-1;
			}
			else start = mid+1;

			 if(mid==0)
			{
				if(ar[mid]>ar[mid+1])
				{
					return 0;
				}
				else return 1;
			}
			else if(mid==ar.length-1)
			{
				if(ar[mid]>ar[mid-1])
				{
					return mid;
				}
				else return mid-1;
			}

		}return -1;
	}

	public static void main(String[] args) {
		
		int ar[] = { 1, 3, 5, 7, 10, 12,30,14,13};

		System.out.println(find(ar,0,ar.length-1));
	}
}