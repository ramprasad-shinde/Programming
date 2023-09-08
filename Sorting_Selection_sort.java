public class Sorting_Selection_sort 
{
    public static void  selectionsort(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
          int smallest =i;
          for(int j=i+1;j<arr.length;j++)
          {
             if(arr[smallest] > arr[j])
             {
                  smallest = j;
             }              
          }
          int temp = arr[smallest];
          arr[smallest] = arr[i];
          arr[i] = temp;
       
       }

    }   
    public static void printarr(int arr[])
    {
          for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[] ={5,4,1,3,2};
        selectionsort(arr);    
        printarr(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    } 
}
