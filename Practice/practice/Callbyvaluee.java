package Practice.practice;

import java.util.Scanner;

public class Callbyvaluee 
{

    public static int mul(int a,int b)
    {
        int mul= a * b;
        return mul;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(mul(a, b));
        System.out.println(mul(10, 30));
          // swap value
          
        //   int a=10;
        //   int b=5;

        //   int temp=0;
        //   temp=a;
        //   a=b;
        //   b=temp;

        //   System.out.println("a value is:"+a);
        //   System.out.println("b value is :"+b);
    }    
}
