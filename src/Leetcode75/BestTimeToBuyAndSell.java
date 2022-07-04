// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSell{
    public int maxProfit(int[] prices) {
        // Profit will be maximum when purchased at the lowest price
        // and selled at the highest possible price
        // [7, 1, 5, 3, 6, 4]
        // Buy at 1 and sell at 6
        //! Also you cannot sell before you buy
        //! The approach of finding the min and max price separately fails because
        //! because there are chances that price may be highest on day 1, but you cannot
        //! sell on day1, you have to buy before selling
        //! So instead of finding the max price, we will find the maximum profit
        //! If selling on current price and buying on min price gives the max profit or not


        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }


        return maxProfit;

    }
}