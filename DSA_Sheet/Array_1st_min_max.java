package DSA_Sheet;
import java.util.*;

public class Array_1st_min_max 
{
   public static int min_max(int n[])
   {
      int max= Integer.MIN_VALUE;
      int min= Integer.MAX_VALUE;

      for(int i=0;i<n.length;i++)
      {
        if(max < n[i])
        {
            max = n[i];

        }
        if(min > n[i])
        {
            min = n[i];
        }
      }
     
      System.out.println("maximum value is :"+max);
      System.out.println("minimum value is :"+min);
      return max;
   }
   public static void main(String[] args) 
   {
      int n []={3,5,4,1,9};
      min_max(n);

   }   
}
