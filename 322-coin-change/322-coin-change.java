class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length;
        Integer dp[][]=new Integer[n][amount+1];
        
        int res=minCoins(coins,0,amount,dp);
        
        return res==Integer.MAX_VALUE?-1:res-1;
    }
    
    private int minCoins(int a[], int idx, int target, Integer dp[][]){
        
        if(idx==a.length || target==0){
            
            if(target==0){
                return 1;
            }
            
            return 0;
        }
        
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        int min=Integer.MAX_VALUE;
        
        if(target>=a[idx]){
            int res=minCoins(a,idx,target-a[idx],dp);
            min=Math.min(res,min);
        }
        
        for(int i=idx+1;i<a.length;i++){
            if(target>=a[i]){
                int res=minCoins(a,i,target-a[i],dp);
                min=Math.min(res,min);
            }
        }
        
        return dp[idx][target]=min==Integer.MAX_VALUE?min:min+1;
    }
}