public class Sorting_Q1_bubblesort 
{
   public static void bubblesort(int numbers[])
   {
      for(int turns=0; turns<numbers.length-1;turns++)
      {
         for(int j=0;j<numbers.length-1-turns;j++)
         {
            if(numbers[j] < numbers[j+1])
            {
                //swap
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
            }
         }
      }
   }    
   public static void printnumber(int numbers[])
   {
    for(int i=0;i<numbers.length;i++)
    {
        System.out.print(numbers[i]+ " ");
    }
   }
   public static void main(String[] args) 
   {
       int numbers[] = {3,6,2,1,8,7,4,5,3,1};
       bubblesort(numbers); 
       printnumber(numbers);
   }
}
