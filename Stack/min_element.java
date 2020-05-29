import java.util.*;
class min_element
{	Stack main = new Stack();
	
	Stack small = new Stack();
	

	void add(int a)
	{
		main.add(a);
		
	}

	void min()
	{
		if(main.isEmpty())
		{
			int y = Integer.MAX_VALUE;
			small.push(y);
		}
		if(small.peek()>main.peek())
		{
			small.push(main.peek());
		}
		else
			small.push(small.peek());
		System.out.print(small.pop()+" ");

	}

	public static void main(String args[])
	{
		min_element s = new min_element();

		
		s.add(5);
		s.min();
		s.add(7);
		s.min();
		s.add(4);
		s.min();
		s.add(8);
		s.min();
		s.add(3);
		s.min();
		s.add(0);
		s.min();
		s.add(6);
		s.min();


	}
}