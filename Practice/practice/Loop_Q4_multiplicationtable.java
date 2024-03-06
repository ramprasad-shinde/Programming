package Practice;

import java.util.Scanner;

public class Loop_Q4_multiplicationtable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Table NO :");
        int n = sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            int mul = i*n;
            System.out.println(n+"*"+i+"="+mul);
        }
        System.out.println();
    }    
}
