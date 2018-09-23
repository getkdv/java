
package studentscompare;
import java.lang.*;
import java.util.*;
public class Studentscompare {
private String name;
private int marks;
public Studentscompare(String nm,int mk)
{
    this.name=nm;
    this.marks=mk;
}
public int getmarks()
{
    return marks;
}
 public String getname()
 {
     return name;
 }
 public void setname(String name)
 {
    this.name=name;
 }
 public String toString()
 {
    StringBuffer sb=new StringBuffer ();
    sb.append("Name: "+name+"\n");
    sb.append("Marks: "+marks+"\n");
    return sb.toString();
 }
 public class markscomp implements Comparator
 {
     public int compare (Object a,Object b)
     {
          Studentscompare x=(Studentscompare) a;
          Studentscompare y=(Studentscompare) b;
            if (x.getmarks() > y.getmarks()) 
                return 1;
            else if (x.getmarks() < y.getmarks())
                return-1;
            else 
                return 0;
     }
     
 }
 public class namecomp implements Comparator
 {
     public int compare(Object c, Object d)
     {
         Studentscompare k=(Studentscompare) c;
         Studentscompare l=(Studentscompare) d;
         return k.getname().compareTo(l.getname()); 
     }
 }
    public static void main(String[] args) {
    Studentscompare s1 = new Studentscompare("karan", 26); 
        Studentscompare s2 = new Studentscompare ("ayush", 90); 
        Studentscompare s3 = new Studentscompare("nitesh", 53);
        ArrayList <Studentscompare> obj=new ArrayList<>();
        {
            obj.add(s1);
            obj.add(s2);
            obj.add(s3);
        }
         System.out.println("Students Details Are As Follows:-");
            ListIterator li = obj.listIterator(); 
            while(li.hasNext())
            {
                System.out.println(li.next());
            }
            Collections.sort(obj, new markscomp());
            System.out.println("Marks Wise Sorting:- ");
             ListIterator li2 = obj.listIterator(); 
            while(li2.hasNext())
            {
                System.out.println(li2.next());
            }
            Collections.sort(obj,new namecomp());
             System.out.println("Name Wise Sorting:- ");
             ListIterator li3 = obj.listIterator(); 
            while(li3.hasNext())
            {
                System.out.println(li3.next());
            }
  }  
}