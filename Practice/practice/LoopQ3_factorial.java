package Practice;

import java.util.Scanner;

public class LoopQ3_factorial 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Positive Number :");
      int num = sc.nextInt();
      int fact = 1;

      for(int i=1 ;i<=num ;i++)
      {
          fact =fact*i;
      }
      System.out.println("Factorial are :"+fact);


    
        // Scanner sc = new Scanner(System.in);
        // int num; // To hold number
        // int fact = 1; // To hold factorial
        // System.out.print("Enter any positive integer: ");
        // num = sc.nextInt();
        // for(int i=1; i<=num; i++) {
        // fact *= i;
        // }
        // System.out.println("Factorial: "+ fact);


        // int i,fact=1;  
        // int number=5;//It is the number to calculate factorial    
        // for(i=1;i<=number;i++){    
        //     fact=fact*i;    
        // }    
        // System.out.println("Factorial of "+number+" is: "+fact);    
   }    
}
