class Solution {
    public int rob(int[] a) {
        
        int n=a.length;
        int dp[]=new int[n];
        
        Arrays.fill(dp,-1);
        
        int res1=rob(a,0,n,dp);
        int res2=rob(a,1,n,dp);
        
        return Math.max(res1,res2);
    }
    
    private int rob(int a[], int idx, int n, int dp[]){
        
        if(idx>=n){
            return 0;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int j1=rob(a,idx+2,n,dp);
        int j2=rob(a,idx+3,n,dp);
        
        int max=Math.max(j1,j2);
        
        return dp[idx]=max+a[idx];
    }
}