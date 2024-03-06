package Practice.practice;

import java.util.Scanner;

public class Incomtax_calculator 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Amount :");
       int income = sc.nextInt();
        
       int tax ;
       if(income <= 500000)
       {
          
          System.out.println("Tax is 0 :");
       }
       else if(income >= 500000 && 1000000 >= income)
       {
        tax = (int)(income * (0.2));
         System.out.println("tax is :"+tax);
       }
       else
       {
          tax = (int) (income * 0.3);
          System.out.println("tax is :"+tax);
       }
   }    
}
