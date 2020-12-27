import java.util.*;

class Pair{
	char x;
	int time;
	int profit;
	Pair(char x,int time,int profit)
	{
		this.x=x;
		this.time=time;
		this.profit=profit;
	}
}


class modify implements Comparator<Pair>{

	public int compare(Pair a,Pair b)
	{
		return b.profit-a.profit;
	}

}
public class job{
	public static void main(String[] args) {
		
		ArrayList<Pair> al = new ArrayList<>();

		al.add(new Pair('a',4,20));
		al.add(new Pair('b',1,40));
		al.add(new Pair('c',1,40));
		al.add(new Pair('d',1,30));

		Collections.sort(al,new modify());

		boolean res[] = new boolean[4];

		for(int i=0;i<4;i++)
		{
			Pair p = al.get(i);
			for(int j=Math.min(3,p.time);j>=0;j--)
			{
				if(res[j]==false)
					{
						res[j]=true;
						break;
					}
			}
		}
System.out.println(Arrays.toString(res));

		//find();

	}
}