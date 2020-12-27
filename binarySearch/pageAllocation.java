

class pageAllocation{

	static boolean possible(int ar[],int n,int estimate,int students)
	{
		int countStudents = 1;

		int sum = 0;

		for(int i=0;i<n;i++)
		{
			

			sum+=ar[i];

			if(sum>estimate)
			{
				countStudents++;
				sum = ar[i];
			}
			if(countStudents>students)
				return false;
		}
		return true;
	}


	static int find(int ar[],int len,int students)
	{	
		int res = Integer.MAX_VALUE;

		int start = 0;
		
		if(students>len)
			return res;
		
		int sum = 0;

		for(int i=0;i<ar.length;i++)
			{
				sum+=ar[i];
			}

		while(start<=sum){

			int mid = start+(sum-start)/2;

			if(possible(ar,len,mid,students))
			{
				res = Math.min(res,mid);
				sum = mid-1;
			}

			else start = mid+1;

		}
		return res;
	}

	public static void main(String[] args) {
		
		int ar[] =  {12, 34, 67, 90};//students must be less then equal to books
		
	
		int start = Integer.MAX_VALUE;

		int students = 2;

		

		System.out.println(find(ar,ar.length,students));
	}
}