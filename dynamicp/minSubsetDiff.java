
import java.util.*;
class minSubsetDiff{

	static int find(int ar[],int n,int sum){

		int i=0;
		int j = 0;

		boolean res[][] = new boolean[n+1][sum+1];

		for( i=0;i<=sum;i++){
			res[0][i] = false;
		}
		for(i=0;i<=n;i++)
		{
			res[i][0]=true;
		}


		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++){

				if(ar[i-1]<=j){
					res[i][j] = res[i-1][j-ar[i-1]] || res[i-1][j];
				}
				else res[i][j] = res[i-1][j];
			}
		}

		ArrayList<Integer> al = new ArrayList<>();

		for(i=0;i<=sum/2;i++)
		{
			if(res[n][i]==true)
				al.add(i);
		}

		// for(i=0;i<al.size();i++){
		// 	System.out.print(al.get(i)+" ");
		// }

return sum-2*al.get(al.size()-1);
	}

	public static void main(String[] args) {
		

		int ar[] = {1,2,7,2};

		int n = ar.length;

		int sum = 12;


		System.out.println(find(ar,n,sum));
	}
}