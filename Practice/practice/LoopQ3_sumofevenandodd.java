package Practice;

import java.util.Scanner;

public class LoopQ3_sumofevenandodd 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
    
     int choice =0;  
      int even=0;
      int odd=0;
    do
    {
        int n = sc.nextInt();
      if(n%2==0)
      {
        even +=n;
      }
      else
      {
        odd +=n;
      }
        
      System.out.println("IF u want to continue? press  1  if u dont want to continue then 5");
       choice=sc.nextInt();
    }
      
    while(choice==1);
      System.out.println("Sum of Even = "+even);
      System.out.println("Sum of odd = "+odd);
     
   }    
}
