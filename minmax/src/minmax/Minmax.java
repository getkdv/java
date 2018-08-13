package minmax;

import java.util.Scanner;

public class Minmax {

    public static void main(String[] args) {
          int a,b,c ;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number 1: ");
          a=sc.nextInt();
          System.out.println("Enter Number 2: ");
          b=sc.nextInt();
          System.out.println("Enter Number 3: ");
          c=sc.nextInt();
//         if(a<b && a<c)
//         {
//             System.out.println("Smallest Number Is  "+a);
//         }
//         else if(b<a && b<c)
//         {
//             System.out.println("Smallest Number Is  "+b);
//         }
//         else if (c<a && c<b)
//         {
//             System.out.println("Smallest Number Is  "+c);
//         }
//         else 
//         {
//             System.out.println("These Are Equal Numbers"+a);
//         }
            
            if(a>b && a>c)
            {
                System.out.println("Greater Number Is "+a);
            }
            else if(b>a && b>c)
            {
                System.out.println("Greater Number Is "+b);
            }
            else if (c>a && c>b)
            {
                System.out.println("Greater Number Is "+c);
            }
            else 
            {
                System.out.println("These Are Equal Numbers ");
            }
            
    }
    
}
