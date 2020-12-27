
import java.util.*;

class knapsackt{

	static int ar[][] = new int[100][100];

static int find(int n,int capacity,int val[],int wt[]){
int i=0;
int j=0;
	for(i=0;i<n+1;i++)
	{
		for(j = 0;j<capacity+1;j++)
		{
			if(i==0||j==0)
				ar[i][j] = 0;
	
			else if(wt[i-1]<=j)
			{
				ar[i][j] = Math.max((val[i-1]+ar[i-1][j-wt[i-1]]),ar[i-1][j]);
			}
			else ar[i][j] = ar[i-1][j];
		}
	}
return ar[n][capacity];
}

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		int val[] = {60,80,100,200,50};
		int wt[] =  {10,20,20,10,25};

		int capacity = 50;

		int n = val.length;

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=capacity;j++)
			{
				ar[i][j] = -1;
			}
		}

		System.out.println(find(n,capacity,val,wt));

	}
}


//val[],weight[],