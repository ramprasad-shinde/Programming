package Practice.practice;

import java.util.Scanner;

public class array_reversearray {

    public static void reverse(int array[])
    {
        int first=0 , last = array.length-1;

         // swap the value
         while(first < last)
         {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
         }

        
    }

                                     // in this program we applay scanner class in array
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the range :");
        Scanner sc = new Scanner(System.in);
         n =sc.nextInt();
        int[] array= new int[n];
        System.out.print("Enter the elements of an array :");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }

        reverse(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
