import java.util.*;
public class Loop_Q2 
{
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
   
         int number;
         int choice;
         int sumEven=0;
         int sumOdd=0;

         do
         {
            System.out.print("Enter a Number :");
             number=sc.nextInt();
             if(number%2==0)
             {
                sumEven+=number;
                
             }
             else
             {
                sumOdd+=number;
              
             }
              System.out.print("If u want to continue Press 1 if not press 0 :");
              choice=sc.nextInt();
         }while(choice==1);
         
         System.out.println("Sum of Even Number :"+sumEven);
         System.out.println("Sum of Odd Number :"+sumOdd);
     }

}
