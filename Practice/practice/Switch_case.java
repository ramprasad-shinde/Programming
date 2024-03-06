package Practice.practice;

import java.util.Scanner;

public class Switch_case 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a first value :");
       int a =sc.nextInt();
       System.out.print("Enter a Second value :");
       int b = sc.nextInt();
       System.out.print("Enter a Operator :");
       char operator = sc.next().charAt(0);
    //    int  a =1;
    //     char operator = '+';
    //    int  b =5;

       
       switch(operator)
       {
          case '+':
          {
            System.out.println(a+b);
            break;
          }
          case '-':
          {
            System.out.println(a-b);
            break;
          }
          case '*':
          {
            System.out.println(a*b);
            break;
          }
          case '/':
          {
            System.out.println(a/b);
            break;
          }
          case '%':
          {
            System.out.println(a%b);
            break;
          }
          default :
          {
            System.out.println("Please add a valid value");
          }
          {
            System.out.println("Not avaliable");
          }
       }
   }    
}
