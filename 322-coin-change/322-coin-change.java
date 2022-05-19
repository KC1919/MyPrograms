class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0)
            return 0;
        
        Integer dp[]=new Integer[amount+1];
        
        int res=coinSum(coins,amount,dp);
        
        return dp[amount]==0?-1:dp[amount];
    }
    
    public int coinSum(int a[], int target, Integer dp[]){
        
        if(target==0){
            dp[target]=0;
            return 10001;
        }
        
        if(dp[target]!=null)
            return dp[target];
        
        int min=Integer.MAX_VALUE;
        for(int coin:a){
        
            if(coin<=target){
                int res=coinSum(a,target-coin,dp);
                
                if(res==10001){
                    return dp[target]=1;
                }
                
                else if(res!=10001 && res>0){
                    min=Math.min(min,res);
                    dp[target]=min;
                }
            }
        }
        
        if(min==Integer.MAX_VALUE)
            dp[target]=0;
        
        else
            dp[target]+=1;
        
        
        return dp[target];
    }
}