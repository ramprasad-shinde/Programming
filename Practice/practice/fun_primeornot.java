package Practice.practice;

import java.util.Scanner;

public class fun_primeornot 
{
    public static void primeornot(int n)
    {
        
       
        if(n==2)
        {
              System.out.println("Is aprime number");
        }
        else
        {
             boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                }
                
            }

            if(isprime==true)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
    }
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();

        //   System.out.println(primeornot(n));

        primeornot(n);
        }    
}
