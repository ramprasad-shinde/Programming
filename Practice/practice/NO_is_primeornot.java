package Practice;

import java.util.Scanner;

public class NO_is_primeornot 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number :");
       int n = sc.nextInt();
        boolean isprime = true;
       if(n==2)
       {
         isprime =true;
       }
       else
       {
         
          
          for(int i=2;i<Math.sqrt(n);i++)     // Math.sqrt(n) == n-1 == under root n
          {
            if(n%i==0)
            {
                isprime = false;
            }
          }
          if(isprime==true)
          {
            System.out.println("n is a prime Number");
          }
          else
          {
            System.out.println("n is not aprime number");
          }
       }
   }    
}
