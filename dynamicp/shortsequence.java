


class shortsequence{

	static int find(String s1,String s2,int l1,int l2,int count){
		int res[][] = new int[l1+1][l2+1];

		for(int i=0;i<=l1;i++){
			for(int j=0;j<=l2;j++){
				if(i==0 || j==0){
					res[i][j] = 0;
				}

				else if(s1.charAt(i-1)==s2.charAt(j-1)){
					res[i][j] = 1+res[i-1][j-1];
					
				}
				else res[i][j] = Math.max(res[i-1][j],res[i][j-1]);
			}
		}
		return res[l1][l2];
	}
	public static void main(String[] args) {
		

		String s1 = "aggtab";

		String s2 = "gxtxayb";
int count = 0;
		int z = (find(s1,s2,s1.length(),s2.length(),count));

		System.out.println("count = "+z);

int er = s1.length()+s2.length()-z;

System.out.println("res = "+er);

	}
}