package Practice.practice;

import java.util.Scanner;

public class Control_statment 
{
   public static void main(String[] args) 
   {
                                              //Q1 number is positive or negative
   //   Scanner sc = new Scanner(System.in);
   //   System.out.print("Enter a Number :");
   // int Number = sc.nextInt();
   
   // if(Number>0)
   // {
   //  System.out.println("It is a positive");
   // }
   // else
   // {
   //  System.out.println("It is a negative");
   // }  

                                           //Q2 tem of body
        
      //  double tem = 103.5;
       
      //  if(tem >100)
      //  {
      //    System.out.println("Patient have a fever");
      //  }
      //  else
      //  {
      //    System.out.println("Patient dont have fever");
      //  }

                                                 
                                            // Q3 Switch case days in a weeks

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number :");
       int number = sc.nextInt();                             

       switch(number)
       {
          case 1:
          {
            System.out.println("Monday");
            break;
          }
          case 2:
          {
            System.out.println("Tuesday");
            break;
          }
          case 3:
          {
            System.out.println("Wednesday");
            break;
          }
          case 4:
          {
            System.out.println("Thursday");
            break;
          }
          case 5:
          {
            System.out.println("Friday");
            break;
          }
          case 6:
          {
            System.out.println("Saturday");
            break;
          }
          case 7:
          {
            System.out.println("Sunday");
            break;
          }
          default :
          {
            System.out.println("Enter a valid number");
          }
       }
   }
  
    
}
