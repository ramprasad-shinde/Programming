public class array_subarrysum_practice_sum_max_mini 
{
    public static void sum_subarray(int numbers[])
    {
       int currsum=0;
       int totalsum=0;
       int min_value=Integer.MAX_VALUE;
       int max_value=Integer.MIN_VALUE;
       

       for(int i=0;i<numbers.length;i++)
       {
          int start=i;
          for(int j=i;j<numbers.length;j++)
          {
            int end=j;
            currsum=0;
            for(int k=start;k <= j;k++)
            {
                System.out.print(numbers[k]+" ");
                currsum += numbers[k];

                if(min_value > currsum)
                {
                    min_value=currsum;
                }
                if(max_value < currsum)
                {
                     max_value=currsum;
                }
                
            }
            System.out.println("--------------=="+currsum);
            totalsum += currsum;
          }
          System.out.println();
       }
       System.out.println("Totalsum :"+totalsum);
       System.out.println("minmum value :"+min_value);
       System.out.println("maxium value :"+max_value);
    }
    public static void main(String[] args) 
    {
        int numbers[]={2,4,6,8,10};
        sum_subarray(numbers);    
    }
       
}    

