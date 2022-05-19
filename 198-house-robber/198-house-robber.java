class Solution {
    public int rob(int[] price) {
        
        if(price.length==1)
            return price[0];
        
        else if(price.length==2)
            return Math.max(price[0],price[1]);
        
        
        int n=price.length;
        int dp[]=new int[n];
        
        dp[n-1]=price[n-1];
        dp[n-2]=price[n-2];
        dp[n-3]=price[n-3]+price[n-1];
        
        for(int i=n-4;i>=0;i--){
            dp[i]=Math.max(dp[i+2],dp[i+3])+price[i];
        }
        return Math.max(dp[0],dp[1]);
    }
}