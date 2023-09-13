public class Strings_equals_method 
{
   public static void main(String[] args)
   {
      String S1= "Tony";
      String S2 = "Tony";
      String S3 = new String("Tony");

      if(S1 == S2)
      {
        System.out.println("Strings are equal");
      }
      else
      {
        System.out.println("Strings are not equal");
      }
    //   if(S2 == S3)
    //   {
    //     System.out.println("Strings are equal");
    //   }
    //   else
    //   {
    //     System.out.println("Strings are not equal");
    //   }

      if(S2.equals(S3))             // (.equal()) function is used
      {
        System.out.println("strings are equal");
      }
      else
      {
        System.out.println("Strings are not equal");
      }
   }    
}
