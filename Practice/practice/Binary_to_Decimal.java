package Practice;

public class Binary_to_Decimal 
{
    public static void binarytodec(int binum)
    {
        int MYnum=binum;
        int pow=0;
        int dec=0;

        while(binum>0)
        {
            int Lastdigit = binum%10;
            dec= dec+(Lastdigit*(int)Math.pow(2,pow));
            pow++;
            binum /=10;
        }
        System.out.println("Decimal number of "+MYnum+" = "+dec);
    }
    public static void main(String[] args) 
    {
        binarytodec(1001);    
    }
}
