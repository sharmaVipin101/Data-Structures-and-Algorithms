import java.util.*;
class arrayRotate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print length of Array");
		int len = sc.nextInt();

		int ar[] = new int[len];

		for(int i=0;i<len;i++)
		{
			ar[i] = sc.nextInt();
		}

		System.out.println("Enter the rotations");
		int rot = sc.nextInt();

		


System.out.println("````");
		for(int i=0;i<len;i++)
			System.out.print(ar[(i+rot)%len]+" ");//rotate by ith index;

	}
}