package Practice.practice;

import java.util.Scanner;

public class Printlargest_number 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("enetr a values :");
      int a =sc.nextInt(); 
      int b =sc.nextInt(); 
      int c =sc.nextInt();
      
    //   if(a>b)
    //   {
    //     if(a>c)
    //     {
    //         System.out.println("a is a bigger :"+a);
    //     }
    //     else
    //     {
    //         if(c>b)
    //         {
    //             System.out.println("C is bigger :"+c);
    //         }
    //     }
    //   }
    //   else
    //   {
    //      System.out.println("b is bigger :"+b);
    //   }

    if(a >= b  && a>=c )
    {
        System.out.println("a is a bigger : "+a);
    }
    else if (b >= c)
    {
        System.out.println("b is a bigger :"+b); 
    }
    else
    {
        System.out.println("c is bigger :"+c);
    }
   }    
}
