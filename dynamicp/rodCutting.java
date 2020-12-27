class rodCutting{

	static int find(int len[],int ar[],int n,int sum)
	{
		int i=0;
		int j=0;

		int res[][] = new int[n+1][sum+1];

		for( i=0;i<=sum;i++){
			res[0][i] =0; 
		}

		for(i = 1;i<=n;i++){
			res[i][0] =0; 
		}


		for(i = 1;i<=n;i++){
			for(j=1;j<=sum;j++){


				if(len[i-1]<=j){

					res[i][j] = Math.max(ar[i-1]+res[i][j-len[i-1]],res[i-1][j]);
				}
				else res[i][j] = res[i-1][j];
			}
		}

		return res[n][sum];
	}
	public static void main(String[] args) {
		int len[] = {1,2,3,4};
		int  ar[] = {5,6,8,18};

		int n = 4;

		System.out.println(find(len,ar,n,ar.length));
	}
}