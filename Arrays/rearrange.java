class rearrange 
{ 
	
	public static void main(String[] args) 
	{ 
	
		int ar[] = {13,12, 10, 11, -5, 6, -7, 5, -3, -6};
		int len = ar.length;//10
		int ind = 0;
		int temp  =0;
		int count=0;
		for(int i=0;i<len;i++)
		{ind = i;
		    if(ar[i]<0)
		    {
		      temp =  ar[count];
		      ar[count] = ar[i];
		      while(count+1!=ind)
		      {ar[ind] = ar[ind-1];
		         ind--; 
		      }
		      ar[ind] = temp;
		      count++;
		    }
		}
		
		for(int i=0;i<len;i++)

{
    System.out.print(ar[i]+" ");
}		
	} 
} 
