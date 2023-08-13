import java.util.*;
public class Function_Q2_Even 
{
       public static int Even(int n)
       {
          if(n%2==0)
          {
              System.out.println("True");
          }
          else
          {
            System.out.println("False");
          }

          return n;
       }
       public static void main(String[] args) 
       {
          Scanner sc= new Scanner(System.in);
          System.out.print("Enter Number :");
          int n=sc.nextInt();
          Even(n); 
       }
}
