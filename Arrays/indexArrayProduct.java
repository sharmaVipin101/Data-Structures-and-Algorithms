import java.util.*;
class indexArrayProduct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY");
		int len = sc.nextInt();

		int ar[] = new int[len];
		
		System.out.println("ENTER ELEMENTS OF ARRAY");
		
		for(int i=0;i<len;i++)
		{
			ar[i] = sc.nextInt();
		}
		int sum = 0;
		
		int asum = 0;
		for(int i=0;i<len;i++)
		{
			sum = sum+i*ar[i];
			asum= asum+ar[i];

		}
		System.out.println(sum+"index product with No rotation");
		System.out.println(asum+"array sum");
		//1 2 3 4
		//0 1 2 3=>20

		for(int i=1;i<len;i++)
		{
			int som = sum -(asum-ar[i-1])+ar[i-1]*(len-1);
			System.out.println(som);
			sum = som;
		}



	}
}