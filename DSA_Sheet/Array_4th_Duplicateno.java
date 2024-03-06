package DSA_Sheet;

public class Array_4th_Duplicateno {

    public static boolean duplicate(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            // int value =numbers[i];

            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] == numbers[j])
                {
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,3,5,6};
        System.out.println(duplicate(numbers));
    }
    
}
