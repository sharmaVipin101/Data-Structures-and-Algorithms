class printlcsequence{

static String max(String a,String b){
	return a.length() > b.length() ? a:b;
}

	static String lcs(String s1,String s2,int l1,int l2){

		String res[][] = new String[l1+1][l2+1];

		for(int i=0;i<=l1;i++){
			for(int j=0;j<=l2;j++){
				if(i==0 || j==0){
					res[i][j] = "";
				}

				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					res[i][j] = s1.charAt(i-1)+res[i-1][j-1];
				}
				else res[i][j] = max(res[i][j-1],res[i-1][j]);
			}
		}

		return res[l1][l2];
	}
	public static void main(String[] args) {
		

		String s1 = "abcdefgh";

		String s2 = "aercgegh";

		int l1 = s1.length();

		int l2 = s1.length();

		System.out.println(lcs(s1,s2,l1,l2));
	}
}