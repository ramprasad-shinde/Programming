public class String_StringBuilder 
{
   public static void main(String[] args) 
   {
      
      StringBuilder sb = new StringBuilder("");
      
      for(char ch='A'; ch<='Z'; ch++)
      {
         sb.append(ch);
        
      }
      System.out.println(sb );
      System.out.println(sb.length());

    //   Integer a = 5;
    //   a.toString(3);
    //   System.out.println(a);
   }    
}
