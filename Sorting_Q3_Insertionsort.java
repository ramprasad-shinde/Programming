public class Sorting_Q3_Insertionsort 
{
  public static void insertionasort(int numbers[])
  {
    for(int i=0; i<numbers.length;i++)
    {
        int curr = numbers[i];
        int prev = i-1;
                  // finding the correct position of insert
        while(prev >= 0 && numbers[prev] < curr)
        {
            numbers[prev + 1] = numbers[prev];
            prev--;
        }
        //insertion
        numbers[prev + 1] = curr;

    }
  }
  public static void printnumbers(int numbers[])
  {
    for(int i=0;i<numbers.length;i++)
    {
        System.out.print(numbers[i]  + " ");
    }
  }
  public static void main(String[] args) 
  {
    int numbers[] = {3,6,2,1,8,7,4,5,3,1};
    insertionasort(numbers);  
    printnumbers(numbers);
  }    
}
