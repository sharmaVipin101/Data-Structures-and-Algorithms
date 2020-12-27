import java.util.*;

public class nextGreaterLeft{
	public static void main(String[] args) {
		
		int ar[] = {8,6,1,7,9,6};

		int res[] = new int[ar.length];

		int index = 0;

		Stack<Integer> s = new Stack<>();

		for(int i=0;i<ar.length;i++){
			if(s.isEmpty())
			{
				res[index++] = -1;
				s.push(ar[i]);
			}
			else if(s.peek()>ar[i])
			{
				res[index++] = s.peek();
				 s.push(ar[i]);
			}
			else if(s.peek()<=ar[i])
			{
				while(!s.isEmpty() && s.peek()<ar[i])
				{
					s.pop();
				}
				if(s.isEmpty())
				{
					res[index++] = -1;
					s.push(ar[i]);
				}
				else{
						res[index++] = s.peek();
					s.push(ar[i]);
				}
			}

		}
		
		for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
	}
}