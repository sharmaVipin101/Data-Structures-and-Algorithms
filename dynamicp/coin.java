import java.util.*;

//number of ways to make n

public class coin{

	// static int find(int ar[],int sum,int len)
	// {
	// 	if(sum==0)
	// 		return 1;

	// 	if(len==0)
	// 		return 0;

	// 	if(ar[len-1]<=sum)
	// 	{
	// 		return find(ar,sum-ar[len-1],len)+find(ar,sum,len-1);
	// 	}else return find(ar,sum,len-1);
	// }

	static int find(int ar[],int sum,int len)
	{
		int dp[][] = new int[len+1][sum+1];

		for(int i=0;i<=len;i++)
		{
			dp[i][0] = 1;
		}

		for(int i=1;i<=len;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(ar[i-1]<=j)
				{
					dp[i][j] = dp[i][j-ar[i-1]]+dp[i-1][j];
				}else dp[i][j] = dp[i-1][j];
			}
		}

		return dp[len][sum];

	}

	public static void main(String[] args) {
		
		int n = 10;
		int ar[] = {2,5,3,6};

		System.out.println(find(ar,n,ar.length));

	}
}