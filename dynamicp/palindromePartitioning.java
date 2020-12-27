

class palindromePartitioning
{

static boolean palin(String s,int i,int j){

	for(int a = i,b = j;a<b;a++,b--){
		if(s.charAt(a)!=s.charAt(b))
			return false;

	}
	return true;

}
	static int pp(String s,int i,int j)
	{
		if(i>=j)
			return 0;


		if(palin(s,i,j))
			return 0;

		
		int min = Integer.MAX_VALUE;

		for(int k=i;k<=j-1;k++){

		int	temp = 1+pp(s,i,k)+pp(s,k+1,j);

			min = Math.min(min,temp);
		}
return min;
		
	} 

	public static void main(String[] args) {
	
		String s = "abcd";

		System.out.println(pp(s,0,s.length()-1));
	}
}