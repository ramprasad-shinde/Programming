import java.util.*;
public class Pattern_Advance_0_1_triangle 
{
     public static void Zero_one_Triangle(int n)
     {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }    

     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
         Zero_one_Triangle(n);  
     }
}
