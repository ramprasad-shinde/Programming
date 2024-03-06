package Practice.practice;

public class Hollow_pattern 
{
   public static void pattern(int totalrow,int totalcolm)
   {
    // outer Loop
    for(int i=1;i<=totalrow;i++)
    {
        //Ineer Loop
        for(int j=1;j<=totalcolm;j++)
        {
            //Cell(i,j)
            if(i==1 || i==totalrow || j==1 || j==totalcolm)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }    
   public static void main(String[] args) 
   {
        pattern(4, 4); 
   }
}
