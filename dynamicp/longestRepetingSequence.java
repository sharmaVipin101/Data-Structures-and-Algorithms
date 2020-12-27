class longestRepetingSequence{



	static int find(String s1,int l1){

		String s2 = s1;
		int l2 = l1;


		int ar[][] = new int[l1+1][l2+1];

			for(int i=0;i<=l1;i++){
				for(int j=0;j<=l2;j++){
					if(i==0 || j==0)
					{
						ar[i][j] = 0;
					}

					else if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j)
					{
						ar[i][j] = 1+ar[i-1][j-1];
					}
					else ar[i][j] = Math.max(ar[i-1][j],ar[i][j-1]);
				}
			}

			return ar[l1][l2];
	}
	public static void main(String[] args) {
		
		String s1 = "aabebcdd";

		System.out.println(find(s1,s1.length()));
	}
}




//a   a    b  b  c  c  d  d ==String 1

//a   a    b  b  c  c  d  d == String 2

//0   1    2  3  4  5  6  7

//match 1 and 2 but index should not be same