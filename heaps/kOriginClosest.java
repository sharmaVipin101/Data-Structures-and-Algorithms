import java.util.*;


class kOriginClosest{

	public static void main(String[] args) {
		
		int ar[][] ={{1,3},{-2,2},{5,8},{0,1}};
		int k = 2;

		PriorityQueue<int[]> q = new PriorityQueue<>(k,new Comparator<>(){

			public int compare(int[] a,int[] b)
			{
				return (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]);
			}
		}); 

		for(int[] i:ar){
			q.add(i);
		}

		// int res[][] = new int[k][2];

		for(int i=0;i<k;i++)
		{
			int temp[] = q.poll();
			System.out.println(temp[0]+" "+temp[1]);
		}
	}
}