

class noOfSubsetsGivenSum{

	static int find(int ar[],int sum,int n){

		int i=0;
		int j=0;

		int res[][] = new int[n+1][sum+1];

		for(i=0;i<=sum;i++){
			res[0][i] = 0; 
		}

		for(i =0;i<=n;i++){
			res[i][0] = 1;
		}


		for(i =1;i<=n;i++){
			for(j=1;j<=sum;j++){

				if(ar[i-1]<=j){

					res[i][j] = res[i-1][j-ar[i-1]] + res[i-1][j];
				}
				else res[i][j] = res[i-1][j];
			}
		}

		return res[n][sum];



	}
	public static void main(String[] args) {
		
		int ar[] = {1,1,2,3};

		int diff = 1;

		int sum = 7;

		int t = 4;


		System.out.println(find(ar,t,ar.length));




	}
}