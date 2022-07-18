class Solution {
    public int rob(int[] a) {
        
        int n=a.length;
        
        if(n==1){
            return a[0];
        }
        
        if(n==2){
            return Math.max(a[0],a[1]);
        }
        int dp[]=new int[n];
        
        dp[n-1]=a[n-1];
        dp[n-2]=a[n-2];
        dp[n-3]=dp[n-1]+a[n-3];
        
        for(int i=n-4;i>=0;i--){
            dp[i]=Math.max(dp[i+2],dp[i+3])+a[i];
        }
        
        return Math.max(dp[0],dp[1]);
    }
}