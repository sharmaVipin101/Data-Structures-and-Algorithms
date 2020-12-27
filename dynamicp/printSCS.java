

class printSCS{

static String reverse(String qw)
{
	String temp = "";

	for(int i=qw.length()-1;i>=0;i--)
	{
		temp+=qw.charAt(i);
	}
	return temp;
}

	static String scs(String s1,String s2,int l1,int l2){
		int ar[][] = new int[l1+1][l2+1];

		for(int i=0;i<=l1;i++){
			for(int j=0;j<=l2;j++){

				if(i==0){
					ar[i][j] = j; 
				}
				if(j==0){
					ar[i][j] = i;
				}

				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					ar[i][j] = 1+ar[i-1][j-1];
				}

				else ar[i][j] =1+ Math.min(ar[i-1][j],ar[i][j-1]);
			}
		}
int i = l1;
int j = l2;

	String res = "";
	String tr = "";

		while(i>0 && j>0){

			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
				res+=s1.charAt(i-1);
				i--;
				j--;
			}

			else if(ar[i-1][j]>ar[i][j-1])
			{
				res+=s2.charAt(j-1);
				j--;
			}
			else 
			{
				res+=s1.charAt(i-1);
				i--;
			}
		}
		while(i>0)
		{
			res+=s1.charAt(i-1);
			i--;
		}

		while(j>0)
		{
			res+=s2.charAt(j-1);
			j--;
		}

		return tr = reverse(res);
	}

	public static void main(String[] args) {
		
		String s1 = "aggtab";

		String s2 = "gxtxayb";

		System.out.println(scs(s1,s2,s1.length(),s2.length()));
	}
}