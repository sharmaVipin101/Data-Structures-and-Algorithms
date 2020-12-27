

class subsetsumt{
	


	static boolean find(int ar[],int sum,int n)
	{


		boolean res[][] = new boolean[n+1][sum+1];



		for(int i=0;i<=n;i++)
		{
			res[i][0] = true;
		}



		int i=0;
		int j = 0;

		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++){

				
				if(ar[i-1]<=j){
					res[i][j] = res[i-1][j-ar[i-1]] || res[i-1][j];
				}
				else res[i][j] = res[i-1][j];

			}
		}

		return res[n][sum];
	}

	public static void main(String[] args) {
		
		int ar[] = {2,3,4,5,7,8,9};

		int sum = 13;

		int n = ar.length;

		

		System.out.println(find(ar,sum,n));

	}
}