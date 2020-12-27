import java.util.*;

class Graph{
	int v;
	ArrayList<Integer> al[];

	Graph(int a)
	{
		v=a;
		al = new ArrayList[v];
		for(int i=0;i<v;i++)
		{
			al[i] = new ArrayList<Integer>();
		}

	}
	void add(int src,int des)
	{
		al[src].add(des);
	}
}

public class Solution{
    public static void main(String args[])
    {
        
		Map<Integer, Integer> ladder = new HashMap();
		Map<Integer, Integer> snake = new HashMap();

		
		ladder.put(1, 38);
		ladder.put(4, 14);
		ladder.put(9, 31);
		ladder.put(21, 42);
		ladder.put(28, 84);
		ladder.put(51, 67);
		ladder.put(72, 91);
		ladder.put(80, 99);

		
		snake.put(17, 7);
		snake.put(54, 34);
		snake.put(62, 19);
		snake.put(64, 60);
		snake.put(87, 36);
		snake.put(93, 73);
		snake.put(95, 75);
		snake.put(98, 79);

		findSolution(ladder, snake);
    }
    
    static void findSolution(Map<Integer, Integer> ladder,Map<Integer, Integer> snake)
    {
        Graph g = new Graph(101);
        
        for(int i=0;i<100;i++)
        {
            for(int j=1;j<=6 && i+j<=100;j++)
            {
                int src = i;
                
                int snake = snake.get(i+j)==null ? 0 : snake.get(i+j);
                int ladder = ladder.get(i+j)==null ? 0 :ladder.get(i+j);
                
                if(snake!=0 || ladder!=0)
                {
                   g.add(i,snake+ladder);
                }else g.add(i,i+j);
            }
        }
    }
}