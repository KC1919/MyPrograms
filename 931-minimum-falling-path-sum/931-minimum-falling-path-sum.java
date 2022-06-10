class Solution {
    public int minFallingPathSum(int[][] a) {
        
        int n=a.length;
        
        int dp[][]=new int[n][n];
        
        for(int j=0;j<n;j++){
            dp[n-1][j]=a[n-1][j];
        }
        
        int dir[][]={{1,-1},{1,0},{1,1}};
        
        for(int i=n-2;i>=0;i--){
            
            for(int j=0;j<n;j++){
                
                int min=Integer.MAX_VALUE;
                for(int k=0;k<dir.length;k++){
                    int row=dir[k][0]+i;
                    int col=dir[k][1]+j;
                    
                    if(row>=0 && row<n && col>=0 && col<n){
                        min=Integer.min(min,dp[row][col]);
                    }
                }
                dp[i][j]=min+a[i][j];
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}