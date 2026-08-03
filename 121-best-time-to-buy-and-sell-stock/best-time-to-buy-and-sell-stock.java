class Solution {
    public int maxProfit(int[] prices) {
        int maxSell=prices[prices.length-1];
        int profit=0;
        for(int i=prices.length-2;i>=0;i--){
            profit=Math.max(profit,maxSell-prices[i]);
            maxSell=Math.max(maxSell,prices[i]);
        }
        return profit;
    }
}