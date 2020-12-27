// Given an array containing one digit numbers only, assuming we are 
// standing at first index, we need to reach to end of array using minimum
//  number of steps where in one step, we can jump to neighbor
//   indices or can jump to a position with same value.

//  In other words, if we are at index i, then in one step you 
//   can reach to, arr[i-1] or arr[i+1] or arr[K] such that arr[K]
//    = arr[i] (value of arr[K] is same as arr[i])


import java.util.*;


public class traverse_array{

	static int find(int ar[],int len)
	{
		ArrayList<Integer> al[] = new ArrayList[10];

		int distance[] = new int[len];
		boolean visited[] = new boolean[len];

		Queue<Integer> q=  new LinkedList<>();


		for(int i=0;i<10;i++)
			al[i]=(new ArrayList<>());

		for(int i=1;i<len;i++)
		{
			al[ar[i]].add(i);
		}

		q.add(0);
		visited[0]=true;
		distance[0]=0;

		while(!q.isEmpty())
		{
			int temp = q.poll();

			if(temp==len-1)
			{
				break;
			}

			int val = ar[temp];

			for(int i=0;i<al[val].size();i++)
			{
				int ele = al[val].get(i);
				if(!visited[ele])
				{
					visited[ele] = true;
					distance[ele] = distance[temp]+1;
					q.add(ele);
				}
			}

			al[val].clear();

			if(temp-1>=0 && !visited[temp-1])
			{
				q.add(temp-1);
				visited[temp-1]=true;
				distance[temp-1]=distance[temp]+1;
			}
			if(temp+1<len && !visited[temp+1])
			{
				q.add(temp+1);
				visited[temp+1]=true;
				distance[temp+1]=distance[temp]+1;
			}

		}

		return distance[len-1];
	}
	public static void main(String[] args) {
		
		int ar[] = {0, 1, 2, 3, 4, 5, 6, 7, 5, 4,3, 6, 0, 1, 2, 3, 4, 5, 7}
;
		
		int len = ar.length;

		System.out.println(find(ar,len));
	}
}