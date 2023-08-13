public class Pattern_Advance_halfpyramid_numbers 
{
    public static void Half_pyramid_numbers(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Half_pyramid_numbers(5);    
    }
}
