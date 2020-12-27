

class friendspair{

	static long find(int n)
	{
		long dp[] = new long[n+1];

		for( int i=0;i<=n;i++)
		{
			if(i<3)
				dp[i] = i%1000000007;
			else dp[i] = (dp[i-1]%1000000007+((i-1)*dp[i-2])%1000000007)%1000000007;
		}
		return dp[n]%1000000007;
	}
	public static void main(String[] args) {
		
		int num = 84;

		System.out.println(find(num));


	}
}