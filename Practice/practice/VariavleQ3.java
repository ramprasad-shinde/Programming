package Practice.practice;

import java.util.Scanner;

public class VariavleQ3 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a value:");
       float pencil = sc.nextFloat();
       float pen = sc.nextFloat();
       float ereaser = sc.nextFloat();

       float cost  = pencil + pen + ereaser; 
       System.out.println("total cost :"+cost);   
       
       float Toatalwithgst = cost +(0.18f *cost);
       System.out.println("TotalCost With GST : "+Toatalwithgst);
    }    
}
