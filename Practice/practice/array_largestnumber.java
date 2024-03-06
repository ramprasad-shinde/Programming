package Practice.practice;

public class array_largestnumber {
    public static int largest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }

            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
            
        }
        System.out.println("Smallest Number is :"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        
        int numbers[] = {1,2,4,6,3,5};
        int result = largest(numbers);
        System.out.println("Latgest Number is :"+result);
    }
}
