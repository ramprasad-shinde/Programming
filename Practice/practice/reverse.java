package Practice.practice;

import java.util.Scanner;

public class reverse 
{
   public static void main(String[] args) 
   {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter anumber :");
       int n = sc.nextInt(); 
       

//         for(int i=0;i<n;)
//   //  while(n>0)
//        {
//         int lastdigit = n%10;
//         System.out.print(lastdigit);
//         n=n/10;
         
//        }

       int rev=0;
       
       while(n>0)
       {
        int lastdigit = n%10;
        rev =(rev*10)+lastdigit;
        n=n/10;
       }
       System.out.println(rev);
   }    

}
