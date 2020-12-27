
import java.util.*;

class knapsackr{

static int find(int n,int capacity,int val[],int wt[]){

	if(n==0||capacity==0)
		return 0;

	if(wt[n-1]<=capacity)
	{
		return Math.max((val[n-1]+find(n-1,capacity-wt[n-1],val,wt)),find(n-1,capacity,val,wt));
	}

	else
		return find(n-1,capacity,val,wt);
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int val[] = {60,80,100,200,50};
		int wt[] =  {10,20,20,10,25};

		int capacity = 50;

		int n = val.length;

		System.out.println(find(n,capacity,val,wt));

	}
}


//val[],weight[],