class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        
        if(a[0][0]!=0)
            return 0;
        
        int n=a.length;
        int m=a[0].length;
        
        Integer dp[][]=new Integer[n][m];
        int dir[][]={{1,0},{0,1}};
        int res=uniqPath(a,0,0,n,m,dp,dir);
        
        return dp[0][0];
    }
    
    public int uniqPath(int a[][], int i, int j, int n, int m, Integer dp[][], int dir[][]){
        
        //if the robot successfully eaches the bottom right cell
        //we return 1, indicating success
        if(i==n-1 && j==m-1 && a[i][j]==0)
            return dp[i][j]=1;
        
        //if the robot reahces a cell which has already been explored before by some other 
        //cell, so its answer must be in the dp matrix, so we return in
        // instead of recalculating
        if(dp[i][j]!=null)
            return dp[i][j];
        
        //total paths from the (i,j) cell
        int totalPaths=0;
        
        //movinf in down and right direction from the current cell
        for(int k=0;k<2;k++){
            
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && a[row][col]!=1){
                
                //getting the answer from the down and right cell
                int res=uniqPath(a,row,col,n,m,dp,dir);
                
                //adding the answer to total paths
                totalPaths+=res;
            }
        }
        
        //storing the total paths from (i,j) cell in the dp matrix and returning the
        //answer to the cell where the call came from
        return dp[i][j]=totalPaths;
    }
}