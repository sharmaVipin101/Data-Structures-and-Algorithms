import java.util.*;
class queueUsingStack
{			Stack<Integer> s1 = new Stack<>();
			Stack<Integer> s2 = new Stack<>();

	 void add(int a)
	{
			s1.push(a);
	}
	 void out()
	{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			int temp = s2.peek();
			s2.pop();
			System.out.println(temp);
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}

	}
	public static void main(String args[])
	{
			
			queueUsingStack q = new queueUsingStack();
			q.add(1);
			q.add(2);
			q.add(3);
			q.out();
			q.out();
			q.add(4);
			q.add(5);
			q.out(); 
			q.out();
			q.out();
	}
}