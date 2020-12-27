import java.util.*;

public class SpecialStack extends Stack<Integer>{

	Stack<Integer> min = new Stack<>();

	void push(int a)
	{
		if(isEmpty() || min.peek()>=a)
		{
			super.push(a);
			min.push(a);
		}
		else {
			super.push(a);

		}
	}

	public Integer pop()
	{
		int temp = super.pop();
		if(temp==min.peek())
			min.pop();

		return temp;
	}

	int getmin()
	{
		return min.peek();
	}



	public static void main(String[] args) {
		
		SpecialStack s = new SpecialStack();
      s.push(10);
      s.push(9);
      System.out.println(s.getmin());
      s.push(10);
      s.push(10);
      

	}
}