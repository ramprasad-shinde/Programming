package Practice.practice;

import java.util.Scanner;

public class Year_is_Leap_year 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a year :");
       int year = sc.nextInt();

       if(year%4==0)
       {
        System.out.println("It is a Leap year");
       }
       else
       {
        System.out.println("It is not a Leap year");
       }

   }    
}
