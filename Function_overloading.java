import java.util.*;
public class Function_overloading 
{
     public static int sum(int a,int b)
     {
        return a+b;
     }    
     public static int sum(int a,int b,int c)
     {
        return a+b+c;
     }
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
         System.out.println(sum(a=sc.nextInt(),b=sc.nextInt()));
         System.out.println(sum(4,6,2));   
     }
}
