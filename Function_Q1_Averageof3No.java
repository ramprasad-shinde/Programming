import java.util.*;
public class Function_Q1_Averageof3No 
{
 public static void average(double x,double y,double z)
 {
    

    double average = (x+y+z)/3;
    System.out.println();
    System.out.println("Average of Three Numbers :"+average);
 }   
public static void main(String[] args) 
{
    Scanner sc= new Scanner(System.in);
     System.out.print("Enter the first number  :");
     double x=sc.nextDouble();
     System.out.print("Enter the Second number :");
     double y=sc.nextDouble();
     System.out.print("Enter the Third number  :");
     double z=sc.nextDouble();
        
     average(x,y,z);
    


}
}
