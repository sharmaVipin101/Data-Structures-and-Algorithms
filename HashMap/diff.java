import java.util.*;
class diff
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> qw = new HashMap<>();

		HashMap<String,Integer> zx = new HashMap<>();

		qw.put("apple",60);
		qw.put("bread",20);
		qw.put("wheat",50);
		qw.put("oil",30);
		////////////////////
		zx.put("milk",20);
		zx.put("bread",15);
		zx.put("wheat",40);
		zx.put("apple",60);
		int count=0;
		for(String i:qw.keySet())
		{
			if(zx.containsKey(i)&&zx.get(i)!=qw.get(i))
			{
				count++;
			}
				
		}
		System.out.println(count);
		
	}
}