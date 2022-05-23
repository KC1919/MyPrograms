class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        
        int n=a.length;
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        if(sum%2!=0)
        return false;
        
        int target=sum/2;
        
        boolean dp[][]=new boolean[n][target+1];
        
        for(int i=0;i<n;i++){
            
            for(int j=1;j<=target;j++)
            {
                if(j<a[i]){
                    
                    if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    
                    else
                        dp[i][j]=false;
                }
                
                else{
                    
                    if(j==a[i]){
                        dp[i][j]=true;
                    }
                    else if(j>a[i]){
                        
                        if(i>0 && dp[i-1][j-a[i]]==true){
                            dp[i][j]=true;
                        }
                        
                        else if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    }
                }
                
                if(j==target && dp[i][j]==true)
                    return true;
            }
        }
        
        return false;
    }
}