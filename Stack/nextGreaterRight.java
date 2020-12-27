import java.util.*;
import java.io.*;

public class nextGreaterRight{



	public static void main(String[] args) {
		
		int ar[] = {4, 5, 2, 25};

		int res[] = new int[ar.length];
		int index = 0;
		
		
        Stack<Integer> s = new Stack<>(); 

		for(int i=ar.length-1;i>=0;i--)
		{
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
				while(s.peek()<ar[i] && !s.isEmpty())
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
				s.push(ar[i]);}
			}


		}


		for(int i=res.length-1;i>=0;i--)
		{
			System.out.println(res[i]+" ");
		}
	}
}