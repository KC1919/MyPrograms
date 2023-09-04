class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer dp[][]=new Integer[n][m];
        boolean visited[][]=new boolean[n][m];

        return findPaths(n,m,0,0,visited,dp);
    }

    public int findPaths(int n, int m, int i, int j, boolean visited[][], Integer dp[][]){

        if(i<0 || i==n || j<0 || j==m || visited[i][j]==true) return 0;

        if(i==n-1 && j==m-1){
            return dp[i][j]=1;
        }

        if(dp[i][j]!=null) return dp[i][j];

        visited[i][j]=true;

        int dres=findPaths(n,m,i+1,j,visited,dp);
        int rres=findPaths(n,m,i,j+1,visited,dp);

        visited[i][j]=false;

        return dp[i][j]=dres+rres;
    }
}