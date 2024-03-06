package Practice.practice;

import java.util.Scanner;

public class FunQ5 
{
   public static void intsum(int n)
   {
    int sum=0;

    while(n>0)
    {
        int lastdigit = n%10;
        sum=sum+lastdigit;
        n=n/10;
    }
    System.out.println("Sum of Integers :"+sum);
   }    
   public static void main(String[] args) 
   {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a Number :");
       int n = sc.nextInt();
       intsum(n); 
   }
}
