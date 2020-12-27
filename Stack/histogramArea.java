

import java.util.*;


public class histogramArea{

	static void mah(int ar[])
	{int area = 0;
		int max = 0;
		Stack<Integer> s = new Stack<>();
int i=0;
		while(i<ar.length)
		{

			if(s.isEmpty() || ar[s.peek()]<=ar[i])
				s.push(i++);

			else{
				int top = s.pop();
				area = ar[top]* (s.isEmpty()? i : i-s.peek()-1);
				max = Math.max(area,max);
			}
		} 

		while(s.isEmpty())
		{
			int top = s.pop();
				area = ar[top]* (s.isEmpty()? (i) : (i-s.peek()-1));
				max = Math.max(area,max);
		}
	System.out.println(max);
	}
	public static void main(String[] args) {
		
		int ar[] = { 6, 2, 5, 4, 5, 1, 6 }; 

		mah(ar);
	}
}