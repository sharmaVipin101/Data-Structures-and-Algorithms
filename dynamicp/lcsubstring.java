class lcsubstring{


	static int lcs(String s1,String s2,int l1,int l2){

		int res[][] = new int[l1+1][l2+1];
int min = 0;
		int i=0;
		int j=0;

		for(i=0;i<=l1;i++){
			for(j=0;j<=l2;j++){

				if(i==0 || j==0){
					res[i][j] = 0;
				}

				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					res[i][j] = 1+res[i-1][j-1];
					min = Math.max(min,res[i][j]);
				}
				else
					res[i][j] = 0;
			}
		}
return min;
	
	}


	public static void main(String[] args) {
		 

		 String s1 = "vipinsharma";
		 String s2 = "vipasd";

		 int l1 = s1.length();

		 int l2 = s2.length();

		 System.out.println(lcs(s1,s2,l1,l2));
	}
}