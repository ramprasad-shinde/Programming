package Practice;

import java.util.Scanner;

public class Reverse_Number 
{
                                      // Print the reverse number
   public static void main(String[] args) 
   {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter a Number :");
    //    int n= sc.nextInt();
       
    //    while(n>0)
    //    {
    //      int lastdigit = n%10;    // it is used for finding last digit
    //      System.out.print(lastdigit);
    //      n = n/10;    // it is used for remove the last digit
    //    }
    //    System.out.println();


                               // Reverse the given number
              
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number :");
       int n= sc.nextInt();      
       int rev = 0;                
       

       while(n>0)
       {
        int lastdigit = n%10; 
        rev = (rev*10)+lastdigit;
        n=n/10;
     
       }
       System.out.println(rev);
       
   }    
}
