package Practice.practice;

import java.util.Scanner;

public class isprime_range 
{
     public static boolean chekprime(int n)
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
     public static void primeinrange(int n)
     {
        for(int i=2;i<=n;i++)
        {
            if(chekprime(i))//true
            {
                System.out.print(i+" ");
            }
        
        }
     }  
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range :");
        int n = sc.nextInt();   
        primeinrange(n);
     }
}
