

class equalsumr{

	static boolean find(int ar[],int sum,int n)
	{
		if(sum==0)
			return true;

		if(sum!=0 && n==0)
		{
			return false;
		}

		if(ar[n-1]<=sum){

			return find(ar,sum-ar[n-1],n-1)||find(ar,sum,n-1);
		}
		else return find(ar,sum,n-1);
	}
	public static void main(String[] args) {
		
		int ar[] = {1,5,5,11};

		int sum = 0;

		for(int i=0;i<ar.length;i++){
			sum+=ar[i];
		} 

		System.out.println(find(ar,sum/2,ar.length));
	}
}