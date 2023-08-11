class Solution {
    public int change(int amount, int[] coins) {

        Integer dp[][]=new Integer[coins.length][amount+1];
        int res=coinChange(coins,amount,0,dp);
        return res;
    }

    public int coinChange(int coins[], int amount, int idx, Integer dp[][]){

        if(amount==0){
            return 1;
        }

        if(dp[idx][amount]!=null) return dp[idx][amount];

        int count=0;
        for(int i=idx;i<coins.length;i++){
            if(amount-coins[i]>=0){
                int res=coinChange(coins,amount-coins[i],i,dp);
                count+=res;
            }
        }
        return dp[idx][amount]=count;
    }
}