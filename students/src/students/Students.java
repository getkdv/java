
package students;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class Students implements Comparable {
    private String name;
    private int marks;
    public Students(String nm, int mk)
    {
        this.name=nm;
        this.marks=mk;
    }
    public int getMarks()
    {
        return marks;
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name=name;
    }
    public int compareTo(Object obj)
    {
        Students s=(Students)obj;
        if (this.marks > s.getMarks()) 
            return 1; 
        else if (this.marks < s.getMarks()) 
            return -1;
        else 
            return 0;     
    }
    public String toString()
    {
        StringBuffer sf=new StringBuffer();
        sf.append("Name: "+name+"\n");
        sf.append("Marks: "+ marks +"\n"); 
        return sf.toString();
    }
    
    public static void main(String[] args) {
        Students s1 = new Students("karan", 26); 
        Students s2 = new Students("ayush", 90); 
        Students s3 = new Students("nitesh", 53);
        ArrayList <Students> obj=new ArrayList<>();
        {
            obj.add(s1);
            obj.add(s2);
            obj.add(s3);
            System.out.println("Students Details Are As Follows:-");
            ListIterator li = obj.listIterator(); 
            while(li.hasNext())
            {
                System.out.println(li.next());
            }
            Collections.sort(obj);
            System.out.println("Students Details After Sorting:- ");
            ListIterator li2 = obj.listIterator(); 
            while(li2.hasNext())
            {
                System.out.println(li2.next());
            }
        }
    
    }
    
}
