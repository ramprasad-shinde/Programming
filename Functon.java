import java.util.*;
public class Functon 
{
    public static void PrintHello()
    {
        System.out.println("Hello");
    }
    public  static  int Addition(int a,int b)     // Formal parameters , -->  function define
    {
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) 
    {
         PrintHello();  
         
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int sum= Addition(a,b);   // Actual parameters , Arguments  --> Function call
         System.out.println("Sum is :"+sum);


    }

}
