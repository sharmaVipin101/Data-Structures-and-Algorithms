import java.util.*;
import java.lang.*;
import java.io.*;
public class expr
 {
     
     static int solve(String s,int i,int j, boolean ist){
         
         if(i>j)
         return 0;
         
         if(i==j)
         {
             if(ist==true)
             {
                 if(s.charAt(i)=='T')
                  return 1;
                 else return 0;
             }
             else if(s.charAt(i)=='F') 
             	return 1;
             	else return 0;
         }
         
         int ans = 0;
         
         for(int k = i+1;k<j;k+=2){
             int lt = solve(s,i,k-1,true);
             int lf = solve(s,i,k-1,false);
             int rt = solve(s,k+1,j,true);
             int rf = solve(s,k+1,j,false);
             
             if(s.charAt(k)=='&')
             {
                 if(ist==true)
                 {
                     ans +=lt*rt;
                 }
                 else ans+=lf*rf+lt*rf+rt*lf;
             }
             if(s.charAt(k)=='|')
             {
                 if(ist==true)
                 {
                     ans+=lt*rt+lt*rf+rt*lf;
                 }
                 else ans+=rf*lf;
             }
             if(s.charAt(k)=='^')
             {
                 if(ist==true){
                     ans+=lf*rt+rf*lt;
                 }
                 else ans+=lt*rt+rf*lf;
             }
         }
         return ans;
         
     }
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 sc.nextLine();
	 while(t-->0){
	     
	     int len = sc.nextInt();
	     sc.nextLine();
	     String s = sc.nextLine();
	     
	     System.out.println(solve(s,0,len-1,true));
	     
	     
	 }
	 }
}
