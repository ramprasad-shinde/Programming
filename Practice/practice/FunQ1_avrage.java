package Practice.practice;

import java.util.Scanner;

public class FunQ1_avrage 
{
    public static void avrage(int a,int b,int c)
    {
        int avrage=(a+b+c)/3;
        System.out.println("Avrage of Three Number :"+avrage);
    }    
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();    
       int b=sc.nextInt();    
       int c=sc.nextInt();
       avrage(a, b, c);    
    }
}
