public class Array_trapedwater_practice 
{
   public static int trappedwater(int height[])
   {
      int n= height.length;

      // calculate leftmax boundary
      int left_max[]= new int[n];
      left_max[0]=height[0];
      for(int i=1;i<n;i++)
      {
        left_max[i]= Math.max(height[i],left_max[i-1]);
      }

      // calculate rightmax boundary
      int right_max[]= new int[n];
      right_max[n-1]=height[n-1];
      for(int i=n-2;i>=0;i--)
      {
        right_max[i]= Math.max(height[i],right_max[i+1]);
      }

      int trappedwater=0;

      // Loop
      for(int i=0;i<n;i++)
      {
        // calculate waterlevel = min(right_max[i],Left_max[i])
        int waterlevel = Math.min(left_max[i],right_max[i]);

        // calculate trappedwater = (waterlevl - height) * width
        trappedwater += waterlevel - height[i];
      }
      return trappedwater;
   }
   public static void main(String[] args) 
   {
      int height[]={4,2,0,6,3,2,5};
      System.out.println(trappedwater(height)); 
   }    
}
