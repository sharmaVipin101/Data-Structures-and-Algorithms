class BinarySearch
{
	static int binary(int ar[],int min,int max,int key)
	{
		if(max>=min)
		{
		int pivot = min+(max-min)/2;
		if(ar[pivot]==key)
			return pivot;

		else if(ar[pivot]>key)
			return binary(ar,min,pivot-1,key);
		else
			return binary(ar,pivot+1,max,key);
		
	     }
	return 0;

	}

	public static void main(String args[])
	{
		int ar[] = {1,5, 9,12,16,17,23,26,30,31,53};
		int len =ar.length;//11
		
		for(int i=0;i<len;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");


		int x = binary(ar,0,len-1,30);

		System.out.println(x+" is the desired index");
	}
}