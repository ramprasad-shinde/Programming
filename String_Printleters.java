public class String_Printleters 
{
    public static void printletters(String str)
    {
       for(int i=0; i<str.length(); i++)
       {
           System.out.print(str.charAt(i) +" ");
       }
       System.out.println();
    }   
    public static void main(String[] args) 
    {
       String fullname = "Ram Shinde";
    //   System.out.println(str.charAt(4));
       printletters(fullname);    
    } 
}
