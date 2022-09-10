class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int cap = 2; // no of transactions allowed
        int buy = 1; // can buy or not
        Integer[][][] dp = new Integer[n][2][3];
        return maxProfit(0, buy, cap, prices, n, dp);
    }
    
    private int maxProfit(int i, int buy, int cap, int[] prices, int n, Integer[][][] dp){
        
        if(i == n || cap == 0) return 0;
        
        if(dp[i][buy][cap] != null) return dp[i][buy][cap];
        // if can buy new stack else sell
        if(buy == 1){
            return dp[i][buy][cap] = Math.max(-prices[i] + maxProfit(i+1, 0, cap, prices, n, dp)
                             , 0 + maxProfit(i+1, 1, cap, prices, n, dp));                     
        }
        else{
            return dp[i][buy][cap] = Math.max(prices[i] + maxProfit(i+1, 1, cap-1, prices, n, dp)
                             , 0 + maxProfit(i+1, 0, cap, prices, n, dp));
        }
    }
}