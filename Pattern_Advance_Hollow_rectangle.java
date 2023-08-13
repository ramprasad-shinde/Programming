public class Pattern_Advance_Hollow_rectangle 
{
   public static void Pattern_Advance_0_1_triangle(int n)
   {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++)
        {
            if(i == 1 || i == n || j == 1 || j == n)
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
        Pattern_Advance_0_1_triangle(5); 
   } 
}
