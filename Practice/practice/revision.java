package Practice.practice;

import java.util.Scanner;

public class revision 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Year :");
     int Year=sc.nextInt();

     if(Year%4==0)
     {
         System.out.println(Year+" is  a Leap year");
    }
    else
    {
         System.out.println(Year+" is not a Leap year");
    }
   }    
}
