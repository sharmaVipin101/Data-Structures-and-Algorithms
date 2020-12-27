// Given a initial number x and two operations which are given below:

// Multiply number by 2.
// Subtract 1 from the number.


import java.util.*;


class Pair{
	int val,steps;
	Pair(int val,int steps)
	{
		this.val=val;
		this.steps=steps;
	}
}


public class gtoy{

	static int find(int x,int y)
	{

		Queue<Pair> q = new LinkedList<>();

		q.add(new Pair(x,0));

		while(!q.isEmpty())
		{
			Pair temp = q.poll();

			if(temp.val==y)
				return temp.steps;



			q.add(new Pair(temp.val*2,temp.steps+1));

			if(temp.val-1>0)
			q.add(new Pair(temp.val-1,temp.steps+1));
		}

		return -1;


	}

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;

		System.out.println(find(x,y));
	}
}