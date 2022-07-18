class Solution {
    public int climbStairs(int n) {
        
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        return climb(n,0,dp);
    }
    
    private int climb(int n, int idx, int dp[]){
        
        if(idx>n){
            return 0;
        }
        
        if(idx==n){
            return dp[idx]=1;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        
        int oneStep=climb(n,idx+1,dp);
        int twoStep=climb(n,idx+2,dp);
        
        
        return dp[idx]=oneStep+twoStep;
    }
}