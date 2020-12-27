

class  lpalindromes{


static String reverse(String s)
{
	String temp = "";

	for(int i=s.length()-1;i>=0;i--)
	{
		temp+=s.charAt(i);
	}

	return temp;
}

	static int lps(String s1,int n){

		String s2 = reverse(s1);

		int res[][] = new int[n+1][n+1];

		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){


				if(i==0||j==0)
				{
					res[i][j] = 0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					res[i][j] = 1+res[i-1][j-1];
				}
				else res[i][j] = Math.max(res[i-1][j],res[i][j-1]);

			}
		}

		return n-res[n][n];
	}

	public static void main(String[] args) {
		

		String s1 = "arbecba";

		System.out.println("deletions required to make palindrome of given String are:"+lps(s1,s1.length()));
	}
}