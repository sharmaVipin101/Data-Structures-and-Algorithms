import java.util.*;
class rotatedSortedArray
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY");
		int len = sc.nextInt();

		int ar[] = new int[len];
		
		System.out.println("ENTER ELEMENTS OF ARRAY *SORTED BUT ROTATED*");
		
		for(int i=0;i<len;i++)
		{
			ar[i] = sc.nextInt();
		}
		int index = 0;
		for(int i=0;i<len-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				index = i;
				break;
			}
		}
		int temp = ar[0];
		for(int i=0;i<len;i++)
		{ 
			System.out.print(ar[(i+index+1)%len]+" ");
			
		}


	}
}//{15, 18, 2, 3, 6, 12}