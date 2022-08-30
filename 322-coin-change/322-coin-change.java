class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0)return 0;
        
        int dp[]=new int[amount+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        for(int j=0;j<=amount;j++){
            for(int coin:coins){
                
                if(j<coin)continue;
                
                else if(j==coin){
                    dp[j]=1;
                    break;
                }
                
                else{
                    if(dp[j-coin]>0 && dp[j-coin]!=Integer.MAX_VALUE){
                        dp[j]=Math.min(dp[j],dp[j-coin]+1);
                    }
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}