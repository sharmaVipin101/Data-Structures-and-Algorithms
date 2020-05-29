import java.util.*;
class stackUsingQueue
{	Queue<Integer> q = new LinkedList<>();
	Stack<Integer> s = new Stack<>();

	void push(int a)
	{
		q.add(a);
		System.out.println(a+" added to stack");
	}

	void pop()
	{

		while(q.size()!=0)
		{
			s.push(q.poll());
		}
		int temp = s.peek();

		while(!s.isEmpty())
		{
			q.add(s.pop());
		}

		System.out.println(temp+" is removed/popped");
		



	}

	public static void main(String args[])
	{
		stackUsingQueue sq = new stackUsingQueue();

		sq.push(5);
		sq.push(10);
		sq.pop();
		sq.push(15);
		sq.push(20);
		sq.push(25);
		sq.pop();
		sq.push(30);
		sq.pop();
	}
}