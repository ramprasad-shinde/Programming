public class Strings_isPalidrome 
{
   public static boolean isPalidrome(String str)
   {
      for(int i=0; i<str.length()/2;i++)
      {
        int n= str.length();
         if(str.charAt(i) != str.charAt(n-1-i))
         {
            // is not palidrome
            return false;
         }
      }
      return true;
   }    
   public static void main(String[] args) 
   {
      String str = "madam";
      System.out.println(isPalidrome(str)); 
      
   }
}
