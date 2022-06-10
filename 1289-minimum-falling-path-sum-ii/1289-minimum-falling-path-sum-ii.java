class Solution {
    public int minFallingPathSum(int[][] a) {
        
        int n=a.length;
        
        int dp[][]=new int[n][n];
        
        for(int j=0;j<n;j++){
            dp[n-1][j]=a[n-1][j];
        }
        
        for(int i=n-2;i>=0;i--){
            
            for(int j=0;j<n;j++){
                
                int min=Integer.MAX_VALUE;
                for(int col=0;col<n;col++){
                    
                    if(col!=j){
                        min=Math.min(min,dp[i+1][col]);
                    }
                }
                dp[i][j]=min+a[i][j];
            }
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int col=0;col<n;col++){
            min=Math.min(min,dp[0][col]);
        }
        return min;
    }
}