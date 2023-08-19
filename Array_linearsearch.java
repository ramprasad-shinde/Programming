public class Array_linearsearch 
{
    public static int Linear_search(int numbers[],int key)
    {
      for(int i=0 ;i<numbers.length;i++)
      {
        if(numbers[i]==key)
        {
            return i;
        }
       
      }
       return -1;  
    }    
      public static void main(String[] args) 
      {
          int numbers[]={1,2,3,4,5,6,10,11,22,55};
          int key=67;
          
          int index= Linear_search(numbers,key);    // return value i is stored in the index variable
           
           if(index == -1 )
           {
             System.out.println("Key is not found");

           }
           else
           {
             System.out.println("Index is "+ index);
           }
      }
    
}    
