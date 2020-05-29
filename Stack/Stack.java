class Stack
{
	int top = -1;
	int stack[];
	int size;

	 Stack(int size)
	{
		this.size = size;
		stack = new int[size];
	}

	boolean isFull()
	{
		return top==size-1;
	}

	boolean isEmpty()
	{
		return top==-1;
	}

	void push(int a)
	{
		if(isFull())
		{
			System.out.println("Stack is full/OVERFLOW");
		}
		else
		{
			stack[++top] = a;
			System.out.println(a+" added to stack."+" Top is now at"+top);
		}
	}

	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty/UNDERFLOW");
		}
		else
		{
			int temp = stack[top];
			System.out.println(stack[top]+" popped out from stack."+" Top is now at"+top);
			top--;

			return temp;
		}
		return 0;
	}

	public static void main(String args[])
	{
		Stack s = new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		

	}
}