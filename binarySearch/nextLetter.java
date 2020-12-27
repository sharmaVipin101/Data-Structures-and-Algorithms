class nextLetter{


	static char find(char ar[],int start,int end,char key)
	{
		char res = '0';

		while(start<=end)
		{
			int mid = start+(end-start)/2;

			if(ar[mid]==key)
			{
				start = mid+1;		
			}
			else if(key-ar[mid]>0)
			{
				
				start = mid+1;
			}
			else 
				{res = ar[mid];
					end = mid-1;
				}
		}return res;
	}
	public static void main(String[] args) {
		
		char ar[] = {'a','c','f','h'};

		char key = 'f';

		System.out.println(find(ar,0,ar.length-1,key));
	}
}