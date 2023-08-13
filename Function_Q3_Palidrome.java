import java.util.*;
public class Function_Q3_Palidrome 
{
    public static boolean ispalidrome(int number)
    {
        int palidrome=number;
        int reverse=0;

        while(palidrome != 0)
        {
            int reminder= palidrome %10;
            reverse =reverse * 10 + reminder;
            palidrome= palidrome /10;
        }

            // if original and the reverse number are equal mens number is palidrome
        
        if(number == reverse)
        {
            return true;
        }
        return false;
    }
    
   
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a Numbe :");
       int palidrome=sc.nextInt();
    
       
       if(ispalidrome(palidrome))
       {
           System.out.println("Number "+palidrome+ " is a palidrome");
       }
       else
       {
        System.out.println("Number "+ palidrome+ " is not a palidrome");
       }

    }
   

}

