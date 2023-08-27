package DSA_Sheet;

public class Array_3rd_maxsunbarray 
{
     public static int maxsubarray(int numbers[])
     {
        int ms = Integer.MIN_VALUE;
        int cs= 0;
        for(int i=0;i<numbers.length;i++)
        {
            cs= cs + numbers[i]; // -2,2,-3.....
            
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
     }  
     public static void main(String[] args) 
     {
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};   
        System.out.println("Maximum sum of subarray :"+ maxsubarray(numbers));
     }  
}
