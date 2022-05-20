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
        
        if(i==n-1 && j==m-1 && a[i][j]==0){
            return dp[i][j]=1;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        int tres=0;
        for(int k=0;k<2;k++){
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && a[row][col]!=1){
                
                int res=uniqPath(a,row,col,n,m,dp,dir);
                tres+=res;
//                 if(res==Integer.MAX_VALUE){
//                     dp[i][j]=1;
//                 }
//                 else if(res!=Integer.MAX_VALUE && res>0){
//                     if(dp[i][j]==null)
//                         dp[i][j]=res;
                    
//                     else
//                         dp[i][j]+=res;
//                 }
            }
        }
        
        return dp[i][j]=tres;
    }
}