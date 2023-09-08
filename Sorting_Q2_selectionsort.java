public class Sorting_Q2_selectionsort 
{
    public static void selectionsort(int numbers[])
    {
      for(int i=0; i<numbers.length-1;i++)
      {
        int smallest = i;
        for(int j=i+1;j<numbers.length;j++)
        {
            if(numbers[smallest] < numbers[j])
            {
                smallest =  j;
            }   
        }
        //swap
        int temp = numbers[smallest];
        numbers[smallest] = numbers[i];
        numbers[i] = temp;

      }
    }  
      public static void printnumbers(int numbers[])
      {
        for(int i=0; i<numbers.length;i++)
        {
            System.out.print(numbers[i]+ " ");
        }
      }
    
    public static void main(String[] args) 
    {
       int numbers[] = {3,6,2,1,8,7,4,5,3,1};
       selectionsort(numbers);
       printnumbers(numbers);
    }
}
