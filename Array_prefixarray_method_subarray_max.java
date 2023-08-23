public class Array_prefixarray_method_subarray_max 
{
   public static void subarray_max(int numbers[])
   {
     int currsum=0;
     int max_sum=Integer.MIN_VALUE;
     int prefix[] = new int [numbers.length];

     prefix[0]=numbers[0];
     //calculate a prefix array
     for(int i=1;i<prefix.length;i++)
     {
        prefix[i]=prefix[i-1] + numbers[i];
     }

     for(int i=0;i<numbers.length;i++)
     {
        int start=i;
        for(int j=i; j<numbers.length;j++)
        {
            int end=j;
            currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

            if(max_sum < currsum)
            {
                max_sum = currsum;
            }
        }
     }
     System.out.println("max sum :"+max_sum);
   }
   public static void main(String[] args) 
   {
      int numbers[] = {1,-2,6,-1,3};
      subarray_max(numbers); 
   }    
}
