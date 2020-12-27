

class sortedGrid{

	static void find(int ar[][],int vlen,int hlen,int key)
	{int i=0;
		int j = hlen;
		while(i>=0 && i<=vlen && j<=hlen && j>=0)
		{
			if(ar[i][j]==key){
				System.out.println(i+" "+j);
				return;
			}
			if(ar[i][j]>key)
			{
				j--;
			}
			else if(ar[i][j]<key)
			{
				i++;
			}

		}System.out.println("Not found");
	}

	public static void main(String[] args) {
		
		int ar[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,35,39,50}};

		int key = 31;

		//System.out.println(ar.length);//  |
		//System.out.println(ar[0].length);//  -

		 find(ar,ar.length-1,ar[0].length-1, key);
	}

}