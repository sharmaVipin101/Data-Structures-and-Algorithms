class rotateRight
{static void rotate(int ar[])
{int temp =ar[0];
	int k = 0;
	for(k=0;k<ar.length-1;k++)
	{
			ar[k] = ar[k+1];

	}ar[k] = temp;
}
	public static void main(String args[])
	{
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int len = ar.length;
		int by = 3;
		int rby = len - by;
		int temp = 0;



		for(int i=0;i<rby;i++)
		{
			rotate(ar);

		}
		for(int i=0;i<len;i++)
		{
			System.out.println(ar[i]);

		}


	}
}