
import java.util.*;

public class histogram{

	static void findleft(int ar[],int left[])
	{	int index = 0;
		Stack<Integer> s = new Stack<>();
		

		for(int i=0;i<ar.length;i++)
		{
			if(s.isEmpty())
			{
				s.push(i);
				left[index++] = -1;
			}
			else if(ar[s.peek()]<ar[i])
			{
				left[index++] = s.peek();
				s.push(i);
			}
			else {
				while(!s.isEmpty() && ar[s.peek()]>=ar[i])
				{
					s.pop();
				}
				if(s.isEmpty())
				{
					left[index++] = -1;
					s.push(i);
				}
				else 
				{	
					left[index++] = s.peek();
					s.push(i);
				}
			}


		}
	}
	
	
	static void findRight(int ar[],int right[])
	{	
		Stack<Integer> s = new Stack<>();
		

		for(int i=ar.length-1;i>=0;i--)
		{
			if(s.isEmpty())
			{
				s.push(i);
				right[i] = ar.length;
			}
			else if(ar[s.peek()]<ar[i])
			{
				right[i] = s.peek();
				s.push(i);
			}
			else {
				while(!s.isEmpty() && ar[s.peek()]>=ar[i])
				{
					s.pop();
				}
				if(s.isEmpty())
				{
					right[i] = ar.length;
					s.push(i);
				}
				else 
				{	
					right[i] = s.peek();
					s.push(i);
				}
			}


		}
	}

	public static void main(String[] args) {
		
		int ar[] = { 6, 2, 5, 4, 5, 1, 6 }; 

		int left[] = new int[ar.length];
		findleft(ar,left);



		int right[] = new int[ar.length];
		findRight(ar,right);
		
		int result[] = new int[ar.length];
		
		int max = Integer.MIN_VALUE;
		
		
				for(int i=0;i<left.length;i++)
        		{
        		    result[i] = (right[i]-left[i]-1)*ar[i];
        			max = Math.max(max,result[i]);
        		}
        		
        		System.out.println(max);
	}
}