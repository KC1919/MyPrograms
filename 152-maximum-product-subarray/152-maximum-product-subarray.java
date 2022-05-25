class Solution {
    
    public int maxProduct(int[] a) {
        
        if(a.length==1)
            return a[0];
        
        int n=a.length;
        int dp[][]=new int[n][2];
        
        dp[0][0]=a[0];
        dp[0][1]=a[0];
        
        int max=a[0];
        
        for(int i=1;i<n;i++){
            
            if(a[i]>0){
                
                if(dp[i-1][0]<0 && dp[i-1][1]<0){
                    dp[i][0]=a[i];
                    dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])*a[i];
                }
                
                else{
                    
                    if(dp[i-1][0]==0 || dp[i-1][1]==0){
                        dp[i][0]=a[i];
                        dp[i][1]=a[i];
                    }
                    
                    else{
                        dp[i][0]=dp[i-1][0]*a[i];
                        dp[i][1]=dp[i-1][1]*a[i];
                    }
                }
            }
            
            else if(a[i]<0){
                
                if(dp[i-1][0]<0 && dp[i-1][1]<0){
                    dp[i][0]=a[i];
                    dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])*a[i];
                }
                
                else{
                    
                    if(dp[i-1][0]==0 || dp[i-1][1]==0){
                        dp[i][0]=a[i];
                        dp[i][1]=a[i];
                    }
                    
                    else{
                        dp[i][0]=dp[i-1][1]*a[i];
                        dp[i][1]=dp[i-1][0]*a[i];
                    }
                }
            }
            
            max=Math.max(max,Math.max(dp[i][0],dp[i][1]));
        }
        
        return max;
    }
}