

class infiniteOccurence{

	static int find(int ar[],int start,int end,int num)
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
		
		int ar[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

		int key = 1;

		int start = 0;
		int end = 1;


		while(key>ar[end])
		{
			start = end;
			end*=2;
		}

		System.out.println(find(ar,start,end,key));




	}
}