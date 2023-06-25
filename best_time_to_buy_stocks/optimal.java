package best_time_to_buy_stocks;

class Solution {
    public int maxProfit(int[] prices) {
        int sell = 1 , buy = 0, currentProfit = 0 , maxProfit = 0;
        while(sell < prices.length){
            currentProfit = prices[sell] - prices[buy];
            if(prices[buy] < prices[sell]){
                maxProfit = Math.max(maxProfit,currentProfit);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}