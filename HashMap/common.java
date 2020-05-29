import java.util.*;
class common
{
	public static void main(String args[])
	{
		int a[] = { 1,2,3,4,5,6,7,8,9,10 }; 
        
        int b[] = { 10,11,12,13,14};

        HashMap<Integer,Integer> qw = new HashMap<>(); 
        HashMap<Integer,Integer> zx = new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
        	if(qw.containsKey(a[i]))
        	{
        		qw.put(a[i],qw.get(a[i])+1);
        	}
        	else
        		qw.put(a[i],1);
        } 

        for(int i=0;i<b.length;i++)
        {
        	if(zx.containsKey(b[i]))
        	{
        		zx.put(b[i],zx.get(b[i])+1);
        	}
        	else
        		zx.put(b[i],1);
        }

        int res = 0;
        for(int i: qw.keySet())
        {
        	if(zx.containsKey(i))
        		res+=Math.min(qw.get(i),zx.get(i));

        } 
        System.out.println(res);



	}
}
//////////////////
//1    2		//
//2    3		//
//3 	4		//
//4		5		//
//		8		//
//////////////////