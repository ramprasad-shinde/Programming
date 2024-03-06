package Practice.practice;

public class Operator_Q1 
{
     public static void main(String[] args) 
     {
                     //Q1
        //  int x = 2 , y= 5;
         
        //  int exp1 = (x * y / x);
        //  int exp2 = (x * (y / x));
        //  System.out.println("exp1 "+ exp1);
        //  System.out.println("exp2 "+exp2);

        //            //Q2
         
        // int x=200, y=50, z=100;
        
        // if(x>y && y>z)
        // {
        //     System.out.println("Hello");
        // }

        // if(z>y && z<x)
        // {
        //     System.out.println("java");
        // }

        // if((y+200) < x && (y+150) < z)
        // {
        //     System.out.println("Hello java");
        // }

            //Q3
        int x,y,z;
          x=y=z=2;

          x +=y;
          y -=z;
          z /=(x+y);
          System.out.println(x + " " +y+" "+z);
            
     }    
}
