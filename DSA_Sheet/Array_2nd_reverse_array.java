package DSA_Sheet;

public class Array_2nd_reverse_array 
{
    public static void reverse(int numbers[])
    {
       int first = 0;
       int last = numbers.length-1;

       while(first < last )
       {
          int temp = numbers[last];
          numbers[last] = numbers[first];
          numbers[first] = temp;

           first++;
           last--;
       }
      
    }   
    public static void main(String[] args) 
    {
       int numbers[] = {4,5,1,2};
       reverse(numbers);
       for(int i=0;i<numbers.length;i++)
       {
         System.out.print(numbers[i]+ " ");
       }    
    } 
}
