class Solution {
    public int coinChange(int[] coins, int amount) {
        
        Integer dp[]=new Integer[amount+1];
        minCoins(coins,amount,dp);
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
    
    private int minCoins(int a[], int target, Integer dp[]){
        
        if(target==0){
            return dp[target]=0;
        }
        
        if(dp[target]!=null){
            return dp[target];
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(target>=a[i]){
                int res=minCoins(a,target-a[i],dp);
                min=Math.min(res,min);
            }
        }
        
        return dp[target]=min==Integer.MAX_VALUE?min:min+1;
    }
}