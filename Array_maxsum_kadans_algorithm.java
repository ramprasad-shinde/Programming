public class Array_maxsum_kadans_algorithm 
{
    public static void kadans(int numbers[])
    {
       int ms=Integer.MIN_VALUE;   // maximum sum
       int cs=0;                // current sum
       for(int i=0;i<numbers.length;i++)
       {
         cs=cs + numbers[i];        // 0 + -2,-3,4.....
         if(cs < 0)
         {
           cs=0;
         }
         ms = Math.max(cs,ms);     // Math function finding maximum value
       }
       System.out.println("maximum sum of subarray :"+ms);
    }   
    public static void main(String[] args) 
    {
       int numbers[]={-2,-3,4,-1,-2,1,5,-3};    
       kadans(numbers);
    } 
}
