class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        int totalCost=0;
        int dp[]=new int[n];
        dp[n-1]=cost[n-1];
        dp[n-2]=cost[n-2];
        for(int i=n-3;i>=0;i--){
            dp[i]=Math.min(dp[i+1],dp[i+2])+cost[i];
        }

        return Math.min(dp[0],dp[1]);
    }
}