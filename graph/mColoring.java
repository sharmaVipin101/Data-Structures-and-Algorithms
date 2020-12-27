import java.util.*;


public class mColoring{

	static boolean safe(int p,int color[],int ar[][],int index)
	{
		for(int i=0;i<color.length;i++)
		{
			if(ar[index][i]==1 && color[i]==p)
				return false;
		}
		return true;
	}

	static boolean possible(int m,int ar[][],int color[],int index)
	{
		if(index==m)
		{
			return true;
		}

		for(int i=1;i<=m;i++)
		{
			if(safe(i,color,ar,index))
			{
				color[index]=i;
			
				if(possible(m,ar,color,index+1))
				{
					return true;
				}

				color[index]=0;
			}
		}
		return false;
	}

	static boolean find(int m,int ar[][])
	{

		int color[] = new int[m];

		if(possible(m,ar,color,0))
			{System.out.println(Arrays.toString(color));return true;}
		else return false;
	}
	public static void main(String[] args) {

		int ar[][] = {{0, 1, 1, 1},
						{1, 0, 1, 0},
						{1, 1, 0, 1},
						{1, 0, 1, 0}};

		int m = 4;

		System.out.println(find(m,ar));
	}
}