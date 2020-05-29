class quick
{
	static int partition(int ar[],int start,int end)
	{
		 int pivot = ar[end];

		 int i = start-1;

		 for(int j=start;j<end;j++)
		 {
		 	if(ar[j]<pivot)
		 	{
		 		i++;
		 		int temp = ar[i];
		 		ar[i] = ar[j];
		 		ar[j] = temp;
		 	}
		 }
		 int temp = ar[i+1];
		 ar[i+1] = ar[end];
		 ar[end] = temp;

		 return i+1;
	}
	static void sort(int ar[],int start,int end)
	{
		if(start<end)
		{
		int pi = partition(ar,start,end);

		sort(ar,pi+1,end);
		sort(ar,start,pi-1);
		}
	}
	static void print(int ar[])
	{
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
	public static void main(String[] args) {
		
		int ar[] = {8,6,2,7,9,6,5,3,6,1};
		int len = ar.length;

		sort(ar,0,len-1);
		print(ar);
	}
}