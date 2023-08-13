import java.util.*;
public class Loop_Q4 
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter Number :");
          int n=sc.nextInt();
          int table;

          for(int i=1;i<=10;i++)
          {
             table=i*n;
            System.out.println(i + " * "+ n +" = "+table );

          }
          
     }    
}
