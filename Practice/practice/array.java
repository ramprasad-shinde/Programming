package Practice.practice;

public class array 
{
   public static void update(int marks[],int notchangble)
   {
    notchangble=10;

       for(int i=0;i<marks.length;i++)
       {
         marks[i]= marks[i]+1;
       }
   }
   public static void main(String[] args) 
   {
    int notchangble=7;
    
     int marks[] = {97,98,99};
     update(marks, notchangble);
     System.out.println(notchangble);
        
     //print numbers
      for(int i=0;i<=marks.length;i++)
       {
         System.out.print(marks[i]+" ");
       }
       System.out.println();
   }
}    

