class goldmine{

	static int find(int ar[][],int n,int n)
	{
		int dp[][] = new int[n][n];

		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				int lup = (i-1==0 || j-1==0 ||  ? 0 : gold[i-1][j-1]);

				int left = (j-1==0 ? 0 : gold[i][j-1]);

				int ldn = (j-1==0 || i==n-1 ? 0 : gold[i+1][j+1]);

				dp[i][j] = gold[i][j]+Math.max(lup,Math.max(left,ldn));
			}
		}
		int max = dp[0][n-1];
		for(int i=1;i<n;i++)
			max = Math.max(max,dp[i][n-1]);

		return max;
	}
	public static void main(String[] args) {
		
		int gold[][]= { {1, 3, 1, 5}, 
						{2, 2, 4, 1}, 
						{5, 0, 2, 3}, 
						{0, 6, 1, 2} }; 

		System.out.println(find(gold,4,4));

	}
}