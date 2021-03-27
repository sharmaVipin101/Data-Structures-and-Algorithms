import java.util.*;

public class MyClass {
    static class Pair{
        int a,b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    
    public static void main(String args[]) {
      
      int a = 2;
      int b[] = {1,2,3,1,2};
      int c[] = {2,4,6,2,3};
      int[] ans = solve(a,b,c);
      
      
      System.out.println(Arrays.toString(ans));
    }
    
    public static int[] solve(int a,int b[],int c[])
    {
        
        ArrayList<Pair> al = new ArrayList<>();
        
        for(int i=0;i<b.length;i++)
        {
            al.add(new Pair(b[i],c[i]));
        }
        
        Collections.sort(al,new Comparator<Pair>(){
            public int compare(Pair qw,Pair we){
                
                if(qw.a!=we.a)
                {
                    return qw.a-we.a;
                }else return we.b-qw.b;
            }
        });
        
        for(Pair p:al)
        System.out.println(p.a+" "+p.b);
        
       int ans[] = new int[2];
        double as = 0;
        
        for(int i=0;i<b.length-1;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                double d = (double)(al.get(j).b-al.get(i).b)-(al.get(j).a-al.get(i).a);
	            if(d>as)
	            {
	                as = d;
	                ans[0] = al.get(j).b-al.get(i).b;
	                ans[1] = al.get(j).a-al.get(i).a;
	            }
            }
        }

        zxcv(ans);

        return ans;
    }
    static void zxcv(int ar[][]){
    	int d = __gcd(ar[0],ar[1]);
    	ar[0] = ar[0]/d;
    	ar[1] = ar[1]/d;
    }
}