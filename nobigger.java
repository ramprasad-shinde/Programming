import java.util.*;
public class nobigger 
{
    public static void bigger(int a, int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is bigger :"+a);
            }
            else
            {
                System.out.println("c is bigger :"+c);
            }
        }
        else
        {   
            if(b>c)
            {
               System.out.println("b id bigger : "+b);
            }
            else
            {
                System.out.println("c is bigger : "+c);
            }
        }
    }
    // public static void sum()
    // {
    //     int a =5;
    //     int b=5;
    //     System.out.println(a+b);
   // }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter values :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
    //   System.out.print(a,b,c);
      bigger(a, b, c);
   //   sum();
           
    }
}
