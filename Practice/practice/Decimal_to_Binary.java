package Practice;

public class Decimal_to_Binary 
{
   public static void dectobin(int n)
   {
     int Mynum= n; 
    int binum=0;
    int pow=0;

    while(n>0)
    {
       int rem = n % 2;
        binum = binum+(rem *(int) Math.pow(10, pow));
        pow++;
        n =n/2; 
    }
          System.out.println("Binary  no. of "+Mynum+" = "+binum);

   }    
   public static void main(String[] args) 
   {
      dectobin(7); 
   }
}
