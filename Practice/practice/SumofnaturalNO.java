package Practice.practice;

import java.util.Scanner;

public class SumofnaturalNO 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int counter = 1;
      int result =0;
      
      while(counter <= n)
      {
        System.out.print(counter + "+");
        result += counter;
        counter++;
    //    result++;
         
      }
      System.out.println("="+result);
   }    
}
