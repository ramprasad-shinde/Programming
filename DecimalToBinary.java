public class DecimalToBinary 
{
 
    public static void decToBin(int n)
    {
        int myNum = n;
        int pow = 0;
        int binum=0;

        while(n > 0)
        {
            int rem = n%2;

            binum = binum +(rem *(int)Math.pow(10, pow));

            pow++;
            n = n/2;

        }
        System.out.println("binary form of " + myNum + " = " + binum);
    }
    public static void main(String[] args) 
    {
        decToBin(5);    
    }
}
