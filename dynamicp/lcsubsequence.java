

class lcsubsequence{


static int ar[][] = new int[100][100];

	// static int lcs(String s1,String s2,int l1,int l2){

	// 	if(l1==0 || l2==0)
	// 	{
	// 		return 0;
	// 	}

	// 	else if(s1.charAt(l1-1)==s2.charAt(l2-1))
	// 	{
	// 		return 1+lcs(s1,s2,l1-1,l2-1);
	// 	}

	// 	else return Math.max(lcs(s1,s2,l1-1,l2),lcs(s1,s2,l1,l2-1));
	// }recursion version




	// static int lcs(String s1,String s2,int l1,int l2,int ar[][]){


	// 		if(l1==0 || l2==0)
	// 		{
	// 			return 0;
	// 		}

	// 		if(ar[l1][l2]!=-1)
	// 		{
	// 			return ar[l1][l2];
	// 		}

	// 	else if(s1.charAt(l1-1)==s2.charAt(l2-1))
	// 	{
	// 		return ar[l1][l2] =  1+lcs(s1,s2,l1-1,l2-1,ar);
	// 	}

	// 	else return ar[l1][l2] =  Math.max(lcs(s1,s2,l1-1,l2,ar),lcs(s1,s2,l1,l2-1,ar));
	// }//memoizaton version

	
	static int lcs(String s1,String s2,int l1,int l2)
	{
		int res[][] = new int[l1+1][l2+1];
		int i = 0;
		int j = 0;

		for( i=0;i<=l1;i++){
			res[0][i] = 0;
		}

		for( i=0;i<=l1;i++){
			res[i][0] = 0;
		}


		for(i=1;i<=l1;i++){
			for(j=1;j<=l2;j++){


				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					res[i][j] = 1+res[i-1][j-1];
				}
				else res[i][j] = Math.max(res[i][j-1],res[i-1][j]);
			}
		}

return res[l1][l2];
	}


	public static void main(String[] args) {
		
		String s1 = "abcd";

		String s2 = "abced";

		int l1 = s1.length();

		int l2 = s2.length();


		// for(int i=0;i<=l1;i++){
		// 	for(int j=0;j<=l2;j++){
		// 		ar[i][j] = -1;
		// 	}
		// }used in memoization
		System.out.println(lcs(s1,s2,l1,l2));
	}
}