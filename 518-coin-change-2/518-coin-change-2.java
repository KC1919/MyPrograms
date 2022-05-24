class Solution {
    public int change(int amount, int[] a) {
        
        int n=a.length;
        
        Integer dp[][]=new Integer[n][amount+1];
        
        targetSum(a,0,amount,dp);
        return dp[0][amount]==null?0:dp[0][amount];
    }
    
    public int  targetSum(int a[], int idx, int target, Integer dp[][]){
        
        if(idx==a.length || target==0){
            
            if(target==0)
                return dp[idx][target]=1;
            
            return 0;
        }
        
        //checking if the target can be formed by using the coins from ith position till end
        if(dp[idx][target]!=null)
            return dp[idx][target];
        
        int res=0;
        
        //using the same coin, as we can use it infinite number of times
        if(target-a[idx]>=0){
            res=targetSum(a,idx,target-a[idx],dp);
        }
        
        for(int i=idx+1;i<a.length;i++){
            
            if(target-a[i]>=0)
                res+=targetSum(a,i,target-a[i],dp);
        }
        return dp[idx][target]=res; //storing the result for the target
    }
}