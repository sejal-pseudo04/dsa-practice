class Solution {
    public int maxProfit(int[] prices) {
      
        int minPrice = prices[0]; // Track the lowest price seen so far
        int maxProfit = 0;        // Track the highest profit found
        
        for (int i = 0; i < prices.length; i++) {
            // If we find a lower price, update our minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, check if selling today yields a better profit
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        
        return maxProfit;
    }
}