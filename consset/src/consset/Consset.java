package consset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Consset {

int id;
Consset(int i)
{
  
    this.id=i;    
}
 void disp()
 {
     System.out.println("Id"+id);
 }
    public static void main(String[] args) {
        
      TreeSet<Integer> ts=new TreeSet<>();
      Integer ts1 = new Integer(225); 
      Integer ts2 = new Integer(280);
      Integer ts3 = new Integer(353);
      Integer ts4 = new Integer(454);
        ts.add(ts1);
      ts.add(ts2);
      ts.add(ts3);
      ts.add(ts4);
      ts.remove(ts3);
      ts.remove(ts4);
      
     
      Iterator i=ts.iterator();
      while(i.hasNext())
      {
          System.out.println(i.next());
      }
        System.out.println(ts.size());
    }
        
        
    }
    
}
