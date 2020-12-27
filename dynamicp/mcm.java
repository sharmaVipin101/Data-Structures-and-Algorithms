
class mcm{

	static int find(int ar[],int i,int j){

		if(i==j)
		{
			return 0;
		}

		int temp = 0;
		int min = Integer.MAX_VALUE;

		for(int k=i;k<j;k++){

			temp = find(ar,i,k) + find(ar,k+1,j) + ar[i-1]*ar[k]*ar[j];

			min = Math.min(min,temp);
		}

		return min;
	}


	public static void main(String[] args) {
		
		int ar[] = {40,20,30,10,30};

		System.out.println(find(ar,1,ar.length-1));
	}
}