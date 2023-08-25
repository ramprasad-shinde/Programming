public class Array_trapingrainwater 
{
   public static int trappedrainwater(int height[])
   {
     int n= height.length;

     // calculate left max boundary -- array
     int left_max[]= new int[n];
     left_max[0]= height[0];
     for(int i=1; i<n;i++)
     {
           left_max[i]=Math.max(height[i],left_max[i-1]);
     }

     // calculate right max boundary -- array
     int right_max[]= new int[n]; 
     right_max[n-1]= height[n-1];
     for(int i=n-2; i>=0;i--)
     {
        right_max[i]= Math.max(height[i],right_max[i+1]);
     }

     int trappedWater=0;
         // Loop
     for(int i=0; i<n ;i++) 
     {
        // waterlevel= min (left_max bondary , right_max boandry )
        int waterlevel = Math.min(left_max[i],right_max[i]);

        // trappedwater = (waterlevel - height) * width
        trappedWater += waterlevel - height[i];
     }

    return trappedWater;
   }
   public static void main(String[] args) 
   {
    int height[]={4,2,0,6,3,2,5};
    System.out.println(trappedrainwater(height));
   }     

      
}
