package Practice.practice;

import java.util.Scanner;

public class FunQ2_evenodd 
{
    public static boolean iseven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
        boolean result=iseven(n);
         if(result==true)  
         {
            System.out.println("Number is Even");
         }  
         else
         {
            System.out.println("Number is odd");
         }
    }

}
