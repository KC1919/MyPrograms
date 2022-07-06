class Solution {
    public int fib(int n) {
        
        if(n==0 || n==1){
            return n;
        }
        
        int dp[]=new int[n+1];
        
        Arrays.fill(dp,-1);
        fibo(n,dp);
        
        return dp[n];
    }
    
    private int fibo(int n, int dp[]){
        
        if(n==0 || n==1){
            return dp[n]=n;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int fm1=fibo(n-1,dp);
        int fm2=fibo(n-2,dp);
        
        return dp[n]=fm1+fm2;
    }
}