package Practice.practice;

import java.util.Scanner;

public class Number_even_odd 
{
   public static void even(int n)
   {
        if(n%2==0)
        {
            System.out.println("NUmber is even :");
        }
        else
        {
            System.out.println("Number is odd");
        }
   }
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number :");
       int n = sc.nextInt();
       even(n); 
   }    
}
