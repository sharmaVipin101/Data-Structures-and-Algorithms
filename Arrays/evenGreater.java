import java.util.*;
class evenGreater
{
	public static void main(String args[])
	{
		int ar[] = {1, 2, 3, 4, 5, 6, 7};
		int len = ar.length;

		Arrays.sort(ar);
		int even = len/2;
		int odd = len/2;

		int tempar[] = new int[len];

		if(len%2==0)
		{for(int i = 0,j=even-1;j>=0;i+=2,j--)
			{
				tempar[i] = ar[j];
			}
		} 
		else
		{
			for(int i = 0,j=even;j>0;i+=2,j--)
			{
				tempar[i] = ar[j];
			}
			tempar[i] = ar[len-1];
		}

		//for(int i=1;i<len;i++)

		for(int i=0;i<len;i++)
		{
			System.out.print(tempar[i]+" ");
		}
		
		
		
	}
}


//1 1 2 4 5 6 8 8

//4 5 2 6 1 8 1 8
