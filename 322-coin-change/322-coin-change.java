class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0)return 0;
        
        Integer dp[]=new Integer[amount+1];
        
        for(int j=0;j<=amount;j++){
            for(int coin:coins){
                
                if(j<coin)continue;
                
                else if(j==coin){
                    dp[j]=1;
                    break;
                }
                
                else{
                    if(dp[j-coin]!=null && dp[j-coin]>0){
                        
                        if(dp[j]==null){
                            dp[j]=dp[j-coin]+1;
                        }
                        else{
                            dp[j]=Math.min(dp[j],dp[j-coin]+1);
                        }
                    }
                }
            }
        }
        return dp[amount]==null?-1:dp[amount];
    }
}