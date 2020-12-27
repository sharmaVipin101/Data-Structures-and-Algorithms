	
class floor{

	static int find(int ar[],int start, int end,int key)
	{int res = -1;
		while(start<=end){

			int mid = start +(end-start)/2;

			if(ar[mid]==key)
			{
				res =  ar[mid];
				break;
			}
			else if(ar[mid]>key)
			{
				end = mid-1;
			}
			else{
				res = Math.max(res,ar[mid]);
				end = mid-1;
			}
		}

		return res;

	}

	public static void main(String[] args) {
		
		int ar[] = {1,2,8,10,10,12,19};
		int key = 5;

		System.out.println(find(ar,0,ar.length-1,key));
	}
}