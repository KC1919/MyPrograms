class Solution {
    public int minPathSum(int[][] grid) 
    {
        int dp[][]=new int[grid.length][grid[0].length];
        solve(grid,0,0,dp);
        return dp[0][0];
    }
    
    public int solve(int a[][], int i, int j, int dp[][])
    {
        if(i<0 || j<0 || i>=a.length || j>=a[0].length)
        return Integer.MAX_VALUE;
        
        if(i==a.length-1 && j==a[0].length-1)
        {
            return dp[i][j]=a[i][j];
        }
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int dres=solve(a,i+1,j,dp);
        int rres=solve(a,i,j+1,dp);
        int mres=Math.min(dres,rres)+a[i][j];
        dp[i][j]=mres;
        
        return mres;
    }
}