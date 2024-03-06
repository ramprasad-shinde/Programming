package Practice.practice;

import java.util.Scanner;

public class Whileloop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n= sc.nextInt();
        int a=1;
        while( a<=n)
        {
            System.out.print(a + " ");
        
            a++; 

        }    
    }    
}
