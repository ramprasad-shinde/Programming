public class Strings_Substring_function 
{
    public static String Substring(String str,int si,int ei)
    {
        String sbstring = "";
        for(int i=si; i<ei; i++)
        {
             sbstring += str.charAt(i);
        }
        return sbstring;
    }  
    public static void main(String[] args) 
    {
       String str = "HelloWorld";
       System.out.println(Substring(str, 0, 5));
   
           // using String.substring(si,ei) function
       System.out.println(str.substring(0, 5));
    }    
}
