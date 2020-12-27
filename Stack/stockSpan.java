import java.util.*;

class stockSpan{

	static void find(int ar[])
	{
		Stack<Integer> s = new Stack<>();
		
		int res[] = new int[ar.length];
		int index = 0;

		res[index++] = 1;
		s.push(0);

		for(int i=1;i<ar.length;i++)
		{
				while(!s.isEmpty() && ar[s.peek()]<=ar[i])
					s.pop();

				res[index++] = s.isEmpty() ? i+1 : i-s.peek();

				s.push(i);
		}

		for(int i=0;i<ar.length;i++)
			System.out.print(res[i]+" ");

	}

	public static void main(String[] args) {
		
		int ar[] = {7,1,5,3,6,4};

		find(ar);
	}
}