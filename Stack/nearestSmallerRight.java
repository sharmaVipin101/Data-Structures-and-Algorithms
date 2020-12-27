import java.util.*;

public class nearestSmallerRight{
	public static void main(String[] args) {
		
		int ar[] = {8,6,2,7,9,6};

		int res[] = new int[ar.length];
		int index = 0;

		Stack<Integer> s = new Stack<>();

		for(int i=ar.length-1;i>=0;i--)
		{
			if(s.isEmpty())
			{
				s.push(ar[i]);
				res[index++] = -1;
			}
			else if(s.peek()<ar[i])
			{
				res[index++] = s.peek();
				s.push(ar[i]);
			}
			else if(ar[i]<=s.peek())
			{
				while(!s.isEmpty() && ar[i]<s.peek())
				{
					s.pop();
				}
				if(s.isEmpty())
				{
					s.push(ar[i]);
					res[index++] = -1;
				}
				else{res[index++] = s.peek();
					s.push(ar[i]);
					
				}
			}
		}
		for(int i=res.length-1;i>=0;i--)
		System.out.print(res[i]+" ");

	}
}