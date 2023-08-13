import java.util.*;
public class continue_loop2 
{
    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
      //  int i= sc.nextInt();
       do
       {
           System.out.print("enter a value :"); 
           int i=sc.nextInt();
           
             if(i%10==0)
             {
                continue;
             }
             System.out.println("value is :"+i);
       }while(true);
       
        
        
    }   
}
