import java.util.*;
class multiLeft
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 3, 5, 7, 9};
		int by = 14;

		int len = a.length;
		int rby = by%len;

		for(int i=0;i<len;i++)
		System.out.print(a[(i+rby)%len]+" ");

	}
}