package Practice.practice;

public class array_Maxsubarray {

    public static void maxsubarray(int numbers[])
    {
        int currsum=0;
        int totalsum=0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                currsum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(numbers[k]+" ");  
                    currsum +=numbers[k];

                }
                totalsum +=currsum;
               System.out.println("-------------------->"+currsum);
                if(maxsum <currsum)
                {
                    maxsum=currsum;
                }
                if(minsum > currsum)
                {
                    minsum = currsum;
                }
                

            }
        }
        System.out.println("Total sum :"+totalsum);
        System.out.println("maximum subarray sum is :"+maxsum);
        System.out.println("minimum subarray sum is :"+minsum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxsubarray(numbers);
    }
    
}
