class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        Long dp[][]=new Long[n][target+1];
        return (int)countways(k,n,0,target,dp);
    }
    
    private static long countways(int m, int n, int idx, int target, Long dp[][]){
        
        //if all the dices have been thrown
        if(idx==n){
            
            //and the target has been made, we return 1 to signify success
            if(target==0){
                return 1;
            }
            return 0;
        }
        
        //if the answer to the current state is already stored so we return that
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        //take a count variable to store the total number of ways
        long count=0;
        
        //check if the dice number is in range
        if(idx<n){
            
            //every dice has 1 to k options to chose from
            for(int i=1;i<=m;i++){
                
                //check if the current chosen number is less that or greater than the target
                if(i<=target){
                    
                    //make call to the next dice with the remaining target sum
                    long res=countways(m,n,idx+1,target-i,dp);
                    
                    //adding to the count the returned number of ways
                    if(res>0){
                        count+=res;
                    }
                }
            }
        }
        
        //storing the answer in the dp table
        return dp[idx][target]=count%1000000007;
    }
}