import java.util.*; 
public class Reverse_number 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value");
        int n=sc.nextInt();
                  System.out.println("Reverse value");
        while(n>0)
        {
            int Lastdigit=n%10;
            System.out.print(Lastdigit);
            n=n/10;
        }
      
    }
    
}
