import java.util.*;

public class rectangleArea{


	static int mah(int ar[]){

		Stack<Integer> s = new Stack<>();

		int i=0;
		int sum = 0;
		int max = Integer.MIN_VALUE;

		while(i<ar.length)
		{
			if(s.isEmpty() || ar[s.peek()]<=ar[i])
				s.push(i++);

			else{
				int temp = s.pop();
				sum= s.isEmpty() ? (ar[temp]*i) : (ar[temp]*(i-s.peek()-1));
				max = Math.max(sum,max);

			}
		}
		while(!s.isEmpty())
		{
			int temp = s.pop();
				sum= s.isEmpty() ? (ar[temp]*i) : (ar[temp]*(i-s.peek()-1));
				max = Math.max(sum,max);
		}

		return max;
	}
	public static void main(String[] args) {
		
		int ar[][] = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};

		


		int len = ar.length;

		int result = mah(ar[0]);
		System.out.println(result);


		for(int i=1;i<len;i++)
		{
			for(int j=0;j<ar[0].length;j++)
			{
				if(ar[i][j]==1)
				{
					ar[i][j]+=ar[i-1][j];	
				}
				

				
			}

			result = Math.max(result,mah(ar[i]));
		}

		System.out.println(result);


	}
}