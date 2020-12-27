

class rainWater{

	static int find(int ar[],int n)
	{
		int left[] = new int[n];
		int right[] = new int[n];

		left[0] = ar[0];

		for(int i=1;i<n;i++)
		{
			left[i] = Math.max(left[i-1],ar[i]);
		}

		right[n-1] = ar[n-1];

		for(int i=n-2;i>=0;i--)
		{
			right[i] = Math.max(right[i+1],ar[i]);
		}

int sum = 0;

		for(int i=0;i<n;i++)
		{
			sum+=Math.min(left[i],right[i])-ar[i];
		}

		return sum;

	}
	public static void main(String[] args) {
		
		int ar[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

		System.out.println(find(ar,ar.length));
	}
}