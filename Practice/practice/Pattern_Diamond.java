package Practice;

public class Pattern_Diamond 
{
   public static void diamond(int n)
   {
    for(int i=1;i<=n;i++)
    {
        //spaces
        for(int j=1;j<=n-i;j++)
        {
            System.err.print(" ");
        }

        //stars
        for(int j=1;j<=(2*i-1);j++)
        {
           System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--)
    {
         //spaces
        for(int j=1;j<=n-i;j++)
        {
            System.err.print(" ");
        }

        //stars
        for(int j=1;j<=(2*i-1);j++)
        {
           System.out.print("*");
        }
        System.out.println();
    }
   }   
   public static void main(String[] args) 
   {
      diamond(7); 
   } 
}
