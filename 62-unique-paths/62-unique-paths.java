class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer dp[][]=new Integer[m][n];
        
        findPath(0,0,m,n,dp);
        return dp[0][0]==null?0:dp[0][0];
    }
    
    public int findPath(int i, int j, int n, int m, Integer dp[][]){
        
        if(i>=n || j>=m)
            return 0;
        
        if(i==n-1 && j==m-1){
            return dp[i][j]=1;
        }
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        int dres=findPath(i+1,j,n,m,dp);
        int rres=findPath(i,j+1,n,m,dp);
        
        dp[i][j]=dres+rres;
        
        return dp[i][j];
    }
}