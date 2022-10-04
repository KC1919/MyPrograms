class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        
        Integer dp[][]=new Integer[n+1][target+1];
        return rollDice(n,k,target,dp);
    }
    
    private int rollDice(int n, int k, int target, Integer dp[][]){
        
        if(n==0){
            if(target==0){
                return dp[n][target]=1;
            }
            
            return 0;
        }
        
        if(dp[n][target]!=null){
            return dp[n][target];
        }
        
        int myRes=0;
        
        for(int i=1;i<=k;i++){
            
            if(target-i>=0){
                int rres=rollDice(n-1,k,target-i,dp);
                myRes+=rres;
                myRes%=1000000007;
            }
        }
        
        return dp[n][target]=myRes%1000000007;
    }
}