public class Array_Binarysearch 
{
   public static int binarysearch(int numbers[],int key)
   {
     int start=0 , end = numbers.length-1;

     while(start <= end)
     {
        int mid=(start+end)/2;   // formula
 
        // comparision
        if(numbers[mid]==key)
        {
            return mid;
        }
        if(numbers[mid] < key) //rigft shift -->
        {
            start=mid+1;
        }
        else                   // left shifr <--
        {
            end=mid-1;
        }
     }
     return -1;
   } 
   public static void main(String[] args) 
   {
       int numbers[] = {2,4,6,8,10,12,14,}; 
       int key=70;

       System.out.println("Index for key :"+binarysearch(numbers, key));
   }   
}
