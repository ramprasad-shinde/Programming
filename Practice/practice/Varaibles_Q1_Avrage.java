package Practice.practice;

import java.util.Scanner;

public class Varaibles_Q1_Avrage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();    
        int sum= a+b+c;
        System.out.println(sum);
        float avrage=sum/3f;
        System.out.println("Average :"+avrage);
    }
}
