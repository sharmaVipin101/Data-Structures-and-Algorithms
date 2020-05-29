class pushZero
{
	public static void main(String args[])
	{
		int ar[] = {1, 2, 0, 0, 0, 3, 6};

		int len = ar.length;
		int count= 0;
		
		for(int i=0;i<len;i++)
		{
			if(ar[i]!=0)
			{
				int temp = ar[count];
				ar[count] = ar[i];
				ar[i] = temp;
				count++;
			}

		}

		for(int i=0;i<len;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}
}

//0 1 2 0 4 5 0 0 8