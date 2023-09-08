import java.util.Scanner;

public class Matrices_2darray_findsmallno 
{
    public static void smallest(int matrix[][])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
    //    int temp = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0; j<matrix[0].length;j++)
            {
                if(largest < matrix[i][j])
               {
                     largest = matrix[i][j];
                }
                if(smallest > matrix[i][j])
                {
                     smallest = matrix[i][j];
                }
            }
        }
       
        System.out.println("largest :"+ largest);
        System.out.println("smallest :"+smallest);
    }
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
      int matrix [][] = new int [3][3];
      int n= matrix.length , m=matrix[0].length;
      System.out.print("Enter matrix :");

      for(int i=0; i<n; i++)
      {
        for(int j=0; j<m; j++)
        {
            matrix[i][j] =sc.nextInt();
        }
      }
      //output
       for(int i=0; i<n; i++)
      {
        for(int j=0; j<m; j++)
        {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
      smallest(matrix);
       
   }    
}
