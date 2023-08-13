import java.util.*;                             //Jay shree Ram//
public class prime_number 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a Number :");
        int n= sc.nextInt();

        if(n==2)


        {
            System.out.println("n is prime");
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
                System.out.println("n is prime number");
            }
            else
            {
                System.out.println("n is not prime number");
            }
        }
       

        

    }
}
