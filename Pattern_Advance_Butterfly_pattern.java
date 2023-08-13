public class Pattern_Advance_Butterfly_pattern 
{
    public static void Butterfly_pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        
        }
    }
    public static void main(String[] args) 
    {
       Butterfly_pattern(7);    
    }    
    
}
