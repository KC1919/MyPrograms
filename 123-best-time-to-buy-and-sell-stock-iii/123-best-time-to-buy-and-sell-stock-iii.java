// class Solution {
//     public int maxProfit(int[] prices) {
        
//         int n = prices.length;
//         int cap = 2; // no of transactions allowed
//         int buy = 1; // can buy or not
//         Integer[][][] dp = new Integer[n][2][3];
//         return maxProfit(0, buy, cap, prices, n, dp);
//     }
    
//     private int maxProfit(int i, int buy, int cap, int[] prices, int n, Integer[][][] dp){
        
//         if(i == n || cap == 0) return 0;
        
//         if(dp[i][buy][cap] != null) return dp[i][buy][cap];
//         // if can buy new stack else sell
//         if(buy == 1){
//             return dp[i][buy][cap] = Math.max(-prices[i] + maxProfit(i+1, 0, cap, prices, n, dp)
//                              , 0 + maxProfit(i+1, 1, cap, prices, n, dp));                     
//         }
//         else{
//             return dp[i][buy][cap] = Math.max(prices[i] + maxProfit(i+1, 1, cap-1, prices, n, dp)
//                              , 0 + maxProfit(i+1, 0, cap, prices, n, dp));
//         }
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        
        int n = prices.length, max;
        int[] prevLine = new int[n];
        int[] dp = new int[n];
        
        for(int i = 1; i <= 2; i++){
            dp = new int[n];
			//max represents my maximum profit so far by making i-1 transactions
            max = - prices[0];
            for(int j = 1; j < n; j++){
                dp[j] = Math.max(dp[j-1], max + prices[j]);
                max = Math.max(max,  prevLine[j] - prices[j]);
            }
            prevLine = dp;
        }
        
        return dp[n-1];
    }
}