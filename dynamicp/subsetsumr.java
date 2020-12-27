

class subsetsumr{

static boolean find(int ar[],int sum,int n){

	if(sum==0)
		return true;

	if(sum!=0 && n==0)
		return false;

	if(ar[n-1]<=sum)
	{
		return find(ar,sum-ar[n-1],n--) || find(ar,sum,n-1);

	}
	else return find(ar,sum,n-1);
}

	public static void main(String[] args) {
		int ar[] = {2,3,6,8,10};
		int sum = 9;
		int n = ar.length;

		System.out.println(find(ar,sum,n));
	}
}