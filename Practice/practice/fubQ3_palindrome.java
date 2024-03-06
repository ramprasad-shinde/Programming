package Practice.practice;

import java.util.Scanner;

public class fubQ3_palindrome 
{
   public static int palindrome(int n)
   {
    int rev=0;

    while(n>0)
    {
        int lastdigit = n%10;
        rev=(rev*10)+lastdigit;
        n/=10;
    }
   // System.out.println(rev);
    return rev;
   
   }    
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number :");
      int n = sc.nextInt();
      int result=palindrome(n); 
    if(result==n)
    {
        System.out.println("It is a Palindrome");
    }
    else
    {
        System.out.println("It is not Palindrome");
    }
   }
}
