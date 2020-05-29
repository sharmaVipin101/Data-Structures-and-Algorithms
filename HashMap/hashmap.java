import java.util.*;
// import java.util.Scanner;
class hashmap
{
	public static void main(String args[])
	{
		
    HashMap<String, String> capital = new HashMap<String, String>();
    capital.put("J&k", "Srinagar");
    capital.put("Himachal","Shimla");
    capital.put("India","Delhi");

    for(String i:capital.keySet())
    {
    	System.out.println(i +get(i));
    }

    // for(String i:capital.values())
    // {
    // 	System.out.println(i);
    // }


	}
}
