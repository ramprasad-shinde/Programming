public class Function_BinaryToDecimal

{
     public static void binToDec(int binNum)    
     {
          int myNum = binNum;
          int pow = 0;
          int DecNum = 0;

          while (binNum > 0) 
          {
               
              int Lastdigit= binNum % 10; 

            DecNum = DecNum+(Lastdigit * (int)Math.pow(2, pow));

             pow ++;
            binNum = binNum/10;

          }

          System.out.println("Binary of "+ myNum + " = "+ DecNum);
     }


          
     public static void main(String[] args) 
     {
        binToDec(101);    
     }
}
