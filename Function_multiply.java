public class Function_multiply 
{
     public static int multiply(int a,int b)
     {
        int mul=a*b;
        return mul;
     }
     public static void main(String[] args) 
     {
         int a=5;
         
         int b=10;
         int prod=multiply(a,b);
         System.out.println("product is :"+prod);
        prod=multiply(10,50);
        System.out.println("product is :"+prod);
     }
    
}
