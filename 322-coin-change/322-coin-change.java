class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length;
        Integer dp[]=new Integer[amount+1];
        
        int res=minCoins(coins,0,amount,dp);
        
        return res==Integer.MAX_VALUE?-1:res-1;
    }
    
    private int minCoins(int a[], int idx, int target, Integer dp[]){
        
        if(idx==a.length || target==0){
            
            if(target==0){
                return 1;
            }
            
            return Integer.MAX_VALUE;
        }
        
        if(dp[target]!=null){
            return dp[target];
        }
        
        int min=Integer.MAX_VALUE;
        
        // if(target>=a[idx]){
        //     int res=minCoins(a,idx,target-a[idx],dp);
        //     min=Math.min(res,min);
        // }
        
        for(int i=0;i<a.length;i++){
            if(target>=a[i]){
                int res=minCoins(a,i,target-a[i],dp);
                min=Math.min(res,min);
            }
        }
        
        return dp[target]=min==Integer.MAX_VALUE?min:min+1;
    }
}