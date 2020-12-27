import java.util.*;

class nearestSmallerLeft{

	public static void main(String[] args) {
		
		int ar[] = {4,8,6,1,7,9,6};

		int res[] = new int[ar.length];
		int index;

		Stack<Integer> s = new Stack<>();

		for(int i=0;i<ar.length;i++){
			if(s.isEmpty())
			{
				res[index++] = -1;
				s.push(ar[i]);

			}
			else if(s.peek()<ar[i])
			{
				res[index++] = s.peek();
				s.push(Ar[i]);
			}
			else if(s.peek()>=ar[i])
			{
				while(!s.isEmpty() && s.peek()>ar[i])
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
	}
} 
