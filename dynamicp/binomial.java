

class binomial{

	static int find(int n,int r){

		int dp[][] = new int[n+1][r+1];

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=(i<r ? i:r);j++)
			{
				if(i==j || j==0)
				{
					dp[i][j] = 1;
				}
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}

		return dp[n][r];
	}

	public static void main(String[] args) {
		
		int n = 5;
		int r = 2;

		System.out.println(find(n,r));
	}
}