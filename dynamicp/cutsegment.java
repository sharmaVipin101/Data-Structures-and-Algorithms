import java.util.*;
import java.lang.*;
import java.io.*;
class cutsegment
 {
     static int find(int ar[],int len)
     {
         int a = ar[0];
         int b = ar[1];
         int c = ar[2];
         
         int dp[] = new int[len+1];
         
         Arrays.fill(dp,-1);
         dp[0]=0;
         for(int i=0;i<=len;i++)
         {
             if(dp[i]==-1)
             continue;
             
             if(i+a<=len)
             {
                 dp[i+a] = Math.max(dp[i+a],1+dp[i]);
             }
             if(i+b<=len)
             {
                 dp[i+b] = Math.max(dp[i+b],1+dp[i]);
             }
             if(i+c<=len)
             {
                 dp[i+c] = Math.max(dp[i+c],1+dp[i]);
             }
         }return dp[len];
     }
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     
	     int t = sc.nextInt();
	     
	     while(t-->0)
	     {
	         int len = sc.nextInt();
	         
	         int ar[] = new int[3];
	         
	         for(int i=0;i<3;i++)
	         ar[i] = sc.nextInt();
	         
	         System.out.println(find(ar,len));
	     }
	 }
}