import java.util.*;
class 2arrayPair
{
	public static void main(String args[])
	{
		 int arr[][] = new int[5][2]; 
        arr[0][0] = 11; arr[0][1] = 20; 
        arr[1][0] = 30; arr[1][1] = 40; 
        arr[2][0] = 5;  arr[2][1] = 10; 
        arr[3][0] = 40;  arr[3][1] = 30; 
        arr[4][0] = 10;  arr[4][1] = 5; 

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
        	int first = arr[i][0];
        	int second = arr[i][1];

        	if(h.containsKey(second)&&h.get(second)==first)
        	{
        		System.out.println(first+" "+second);
        	}
        	else
        	{
        		h.put(first,second);
        	}
        }
	}
}