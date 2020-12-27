

import java.util.*;

class triangleSum{

	static int find(int ar[][])
	{
		int r = ar.length;//4

		int c = ar[r-1].length;//4

		int dp[] = new int[c];

		for(int i=0;i<c;i++)
		{
			dp[i] = ar[r-1][i];
			//System.out.print(dp[i]+" ");
		}

		for(int i=r-2;i>=0;i--)//i goes  2 to 0
		{
			for(int j=0;j<ar[i].length;j++)
			{
				dp[j] = ar[i][j]+Math.min(dp[j],dp[j+1]);
				System.out.print(dp[j]+" ");
			}System.out.println("");
		}
		return dp[0];
	}
	public static void main(String[] args) {
		
		int ar[][] = {{2},{3,4},{5,6,7},{8,9,10,11}};

		System.out.println(find(ar));
	}
}