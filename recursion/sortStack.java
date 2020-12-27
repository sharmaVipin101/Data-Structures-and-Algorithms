import java.util.*;


public class MyClass {
    
    
    
    static void sortutil(Stack<Integer> s,int temp)
    {
        if(s.isEmpty() || s.peek()<temp)
        {
            s.push(temp);
            return;
        }
        
            
            int q = s.pop();
            
            sortutil(s,temp);
            
            s.push(q);
        
    }
    
    
    static void sort(Stack<Integer> s)
    {
        
        if(!s.isEmpty())
        {
            int temp = s.pop();
            
            sort(s);
            
            sortutil(s,temp);
        }
    }
    
    
   
    public static void main(String args[]) {
      
      
      Stack<Integer> s = new Stack<>();
      
      s.push(8);
      s.push(6);
      s.push(2);
      s.push(7);
      s.push(9);
      s.push(6);
      s.push(5);
      s.push(3);
      sort(s);

     printStack(s);
         }
    
    static void printStack(Stack<Integer> s) 
    { 
       ListIterator<Integer> lt = s.listIterator(); 
         
       // forwarding 
       while(lt.hasNext()) 
           System.out.print(lt.next()+" "); 
           
    }
}