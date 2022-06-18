class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        Long dp[][]=new Long[n][target+1];
        return (int)countways(k,n,0,target,dp);
    }
    
    private static long countways(int m, int n, int idx, int target, Long dp[][]){
        
        if(idx==n){
            
            if(target==0){
                return 1;
            }
            return 0;
        }
        
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        long count=0;
        
        if(idx<n){
            
            for(int i=1;i<=m;i++){
                
                if(i<=target){
                    long res=countways(m,n,idx+1,target-i,dp);
                    if(res>0){
                        count+=res;
                    }
                }
            }
        }
        return dp[idx][target]=count%1000000007;
    }
}