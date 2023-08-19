import java.util.*;
public class Array_linear_search2 
{
    public static void votting(int age)
    {
        if(age >= 18 )
        {
            System.out.println("eliagble for vote");
        }
        else  


        
        {
            System.out.println("not eliagble");
        }
    }
   public static void main(String[] args) 
   {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a age :");
         int age=sc.nextInt();
         votting(age);
   }    
}
