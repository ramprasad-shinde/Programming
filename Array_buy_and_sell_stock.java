public class Array_buy_and_sell_stock 
{
   public static int buyandsellstock(int price[])
   {
       int buy_price= Integer.MAX_VALUE;
       int max_profit = 0;

       for(int i=0;i<price.length;i++)
       {
          if(buy_price < price[i])  // profit
          {
              int profit = price[i] - buy_price;    // todays profit
              max_profit = Math.max(max_profit, profit);
          }
          else
          {
             buy_price = price[i];
          }
       }
       return max_profit;

   }
   public static void main(String[] args) 
   {
     int price[] = {7,1,5,3,6,4};
     System.out.println(buyandsellstock(price));

   }    
}
