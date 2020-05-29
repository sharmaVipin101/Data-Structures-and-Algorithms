import java.util.*;

class gaph
{
    HashMap<Integer,List<Integer>> hm = new HashMap<>();

   void addEdge(int source,int destination,boolean bi_directional)
    {
        if(!hm.containsKey(source))
        {
            hm.put(source,new LinkedList<Integer>());
        }
        if(!hm.containsKey(destination))
        {
            hm.put(destination,new LinkedList<Integer>());
        }
        hm.get(source).add(destination);
        if(bi_directional)
            hm.get(destination).add(source);

    }
    void vertexCount()
    {

        System.out.println("Total vertices are -: "+hm.size());
    }
    void edgesCount(boolean bi_directional)
    {
        int total = 0;
        for(int i:hm.keySet())
        {
            total+=hm.get(i).size();
        }
        if(bi_directional)
            total/=2;
        System.out.println("total edges are -:"+total);
    }
    void print()
    {
        for(int i:hm.keySet())
        {
            System.out.println(i+" "+hm.get(i));
        }
    }
    public static void main(String args[])
    {
        gaph g = new gaph();
        //source,destination,bi-directional
        
        g.addEdge(0, 1, true); 
        g.addEdge(0, 4, true); 
        g.addEdge(1, 2, true); 
        g.addEdge(1, 3, true); 
        g.addEdge(1, 4, true); 
        g.addEdge(2, 3, true); 
        g.addEdge(3, 4, true); 

        System.out.println("Graph -:");
        g.print();

        g.vertexCount();

        g.edgesCount(true);

        

    }
}