public class Array_byrefrance 
{
     public static void update(int marks[],int nonchangble)
     {
        nonchangble=10;

        
        
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
     }    
     public static void main(String[] args) 
     {
        int marks[]={97,98,99};
        int nonchangble=5;
        System.out.println(nonchangble);
        update(marks,nonchangble);
         
         //print our marks
         for(int i=0;i<marks.length;i++)
         {
            System.out.print(marks[i]+" ");
         }
         System.out.println();
         
     }
}
