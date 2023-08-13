import java.util.*;
public class Function_Q5 
{
      public static int sumdigit(int n)
      {
        int sumdigit=0;

        while(n>0)
        {
            int lastdigit=  n%10;
            sumdigit +=lastdigit;   //sumdigit = subdigit + lastdigit
            n=n/10;
        }
        return sumdigit;
      }     

     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a integer :");
         int n=sc.nextInt();
         
         System.out.println("The sum is  "+sumdigit(n));
     }
}
