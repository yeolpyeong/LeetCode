class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; i++) {
            min = min<prices[i]?min:prices[i];
            profit = (prices[i]-min)>profit?(prices[i]-min):profit;
        }
        return profit;
    }
}