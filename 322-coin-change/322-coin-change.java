class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0)
            return 0;
        
        Integer dp[]=new Integer[amount+1];
        
        int res=coinSum(coins,amount,dp);
        
        //so when the function willbe completed, we will be having the result in
        //the dp array at the amount'th position, and we return it
        
        return dp[amount]==0?-1:dp[amount];
    }
    
    public int coinSum(int a[], int target, Integer dp[]){
        
        if(target==0){
            dp[target]=0;
            return 10001; //this tells that the target was achieved
        }
        
        //if there is a value already at the amount'th index, that means that amount
        //has been calculated before, so instead of recalculating it we return the stored
        //answer
        if(dp[target]!=null)
            return dp[target];
        
        //we take the minimum coins to form a target as the maximum value
        int min=Integer.MAX_VALUE;
        
        //then we have the option to choose any coins any number of time
        for(int coin:a){
        
            //we check if the coin value is less than or equal to the target amount
            if(coin<=target){
                
                //we use the coins value and then make call to calculate the new reduced
                //target
                int res=coinSum(a,target-coin,dp);
                
                //this condition denotes the target was reached successfully
                if(res==10001){
                    //so we put 1 at the target'th position, which means 1 coin was needed
                    //reach the target(means that coin value was present in the coins array)
                    return dp[target]=1;
                }
                
                //else this condition tells that the returned result
                //denotes the number of coins required to achive the target
                else if(res!=10001 && res>0){
                    //we keep updating our min value variable with the returned result
                    min=Math.min(min,res);
                    
                    //and also keep updating the target'th index value accordingly
                    //because wee nedd the minimum number of coins to form the target
                    dp[target]=min;
                }
            }
        }
        
        //if the min is not updated, means the ytarget was not formed
        if(min==Integer.MAX_VALUE)
            dp[target]=0; //so we put 0 at the target'th index
        
        //else this means the target was achieved and to form current target
        //adding 1 coin to the returned result
        else
            dp[target]+=1;
        
        //finally returning the result to the below call
        return dp[target];
    }
}