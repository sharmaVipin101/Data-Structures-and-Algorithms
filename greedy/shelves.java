import java.util.*;

public class shelves{
    public static void main(String args[]) {
        
      int w = 24;
      int m = 4;
      int n = 7;
      
      //n is preffered

      int ms=0;
      int ns=0;
      int sp = 0;


        ms = w/m;
        w = w%m;

        ns = w/n;
        w = w%n;

        sp = w;

 System.out.println(ms+" "+ns+" "+sp);
      while(ms>0)
      {
        w+=m;
        ms--;


        ns = w/n;
        w = w%n;

        sp = w;
      System.out.println(ms+" "+ns+" "+sp);
      }
      
      
    }
}