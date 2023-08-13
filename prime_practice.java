import java.util.*;
public class prime_practice 
{
 public static void main(String[] args) 
 {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a Number :");
    int n=sc.nextInt();
     if(n==2)
     {
        System.out.println(n+": IS a prime number ");
     }
     else
     {
       boolean isprime=true;
       for(int i=2;i<=n-1;i++)    //i<=Math.sqrt(n)
       {
        if(n%i==0)
        {
            isprime=false;
        }
       }
       
       if(isprime==true)
       {
        System.out.println(n+": is a prime number"); 
       }
       else
       {
        System.out.println(n+": is not a prime number");
       }
     }
 }   
}
