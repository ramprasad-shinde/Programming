public class Sorting_Q4_countionsort 
{
    public static void countingsort(int numbers[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            largest = Math.max(largest, numbers[i]);
        }
        int count[] = new int[largest + 1];
        for(int i=0; i <numbers.length;i++)
        {
            count[numbers[i]]++;
        } 
        // sorting 
        int j=0;
        for(int i=count.length-1; i>=0;i--)
        {
            while(count[i] > 0)
            {
                numbers[j] = i;
                j++;
                count[i]--;
            }
        }
    }   
    public static void printnumbers(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
           System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
       int numbers[] = {3,6,2,1,8,7,4,5,3,1};
       countingsort(numbers);
       printnumbers(numbers);    
    } 
}
