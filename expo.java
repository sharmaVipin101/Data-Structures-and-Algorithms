class expo
{
	public static void main(String args[])
	{
		int x = 2;
		int y = 5;
		int p = 3;

		int result = 1;

		x = x % p; 

		while(y>0)
		{	 
			if((y & 1)==1)//if y==odd
				result = (result*x)%p;

			y = y>>1;//y=y/2
			x = (x*x)%p;	//x=x^2
		}
		System.out.println(result);
	}
}