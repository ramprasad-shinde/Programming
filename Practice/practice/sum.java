package Practice.practice;

import java.util.Scanner;

public class sum 
{
    public static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a, b);

    }    

}

