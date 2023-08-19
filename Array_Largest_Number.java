import java.util.*;
public class Array_Largest_Number 
{
     public static int Array_Largest_Number(int number[])
     {
           int largest =Integer.MIN_VALUE;
           int smallest=Integer.MAX_VALUE;
           for(int i=0;i<number.length;i++)
           {
              if(largest < number[i])
              {
                  largest = number[i];
              }
           }
           for(int i=0;i<number.length;i++)
           {
            if(smallest > number[i])
            {
                smallest = number[i];
            }
           }
                         System.out.println("Smallest number is :"+smallest);

           return largest;
     }  
     public static void main(String[] args) 
     {
           int number[]={1,2,4,5,8,3,1,4,1};
           System.out.println("Largest number is "+ Array_Largest_Number(number));
     }  
}
