package Practice.practice;

import java.util.Scanner;

public class Nois_primeornot 
{
    public static boolean primecheck(int n)
    {
        boolean isprime=true;
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
                    return true;

    }    
    public static void main(String[] args) 
    {
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();

      boolean result=primecheck(n);

       if(result==true)
       {
        System.out.println("Is a Prime Number");
       }
       else
       {
        System.out.println("Is Not a Prime number");
       }
       
    }
}
