class Solution {
    public int longestIncreasingPath(int[][] a) {
        
        int n=a.length;
        int m=a[0].length;
        
        int dp[][]=new int[n][m];
        
        int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
        
        int max[]=new int[1];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(dp[i][j]==0){
                    incPath(a,i,j,n,m,dp,max,dir);
                }
            }
        }
        return max[0];
    }
    
    public int incPath(int a[][], int i, int j, int n, int m, int dp[][], int maxLen[], int dir[][]){
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int max=0;
        for(int k=0;k<dir.length;k++){
            
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && a[row][col]>a[i][j]){
                
                int res=incPath(a,row,col,n,m,dp,maxLen,dir);
                max=Math.max(res,max);
            }
        }
        
        max+=1;
        maxLen[0]=Math.max(maxLen[0],max);
        
        return dp[i][j]=max;
    }
}