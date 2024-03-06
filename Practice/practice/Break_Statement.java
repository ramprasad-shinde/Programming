package Practice;

import java.util.Scanner;

public class Break_Statement 

{
   public static void main(String[] args) 
   {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter a Number :");
   
    //  do
    //  {
    //     int n = sc.nextInt();
    //     if(n%10==0)
    //     {
    //         break;
    //     }
    //     System.out.println(n);
    //  }
    //  while(true);


                     // Continue statment          --> it is iued for skip the iterartion/step

        //  for(int i=1;i<=n;i++)
        //  {
        //     if(i==3)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        //  }            

                   // continue question
         do
         {
              int n=sc.nextInt();
             if(n%10==0)
             {
                 continue;
             }
             System.out.println(n);
         }          
         while(true);
   }    
}
