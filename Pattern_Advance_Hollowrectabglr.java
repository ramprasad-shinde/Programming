public class Pattern_Advance_Hollowrectabglr 
{
    public static void Hollo_rectangle(int totalrow,int totalColoum)
    {
        for(int i=1;i<=totalrow;i++)
        {
            for(int j=1;j<=totalColoum;j++)
            {
                if(i == 1 || i == totalrow || j == 1 || j == totalColoum)
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
        Hollo_rectangle(5, 8);
    }

}
