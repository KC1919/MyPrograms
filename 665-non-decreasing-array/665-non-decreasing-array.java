class Solution {
    public boolean checkPossibility(int[] a) {
        
        int n=a.length;
        
        if(n==1){
            return true;
        }
        
        else if(n==2){
            if(a[n-1]==1){
                return true;
            }    
        }
        
        int dp[]=new int[n];
        
        dp[0]=1;
        
        int omax=0;
        
        for(int i=1;i<n;i++){
            
            int max=0;
            for(int j=0;j<i;j++){
                if(a[j]<=a[i]){
                    max=Math.max(dp[j],max);
                }
            }
            
            dp[i]=max+1;
            omax=Math.max(omax,dp[i]);
        }
        
        if(omax==n){
            return true;
        }
        
        else if(omax==n-1){
            return true;
        }
        
        return false;
    }
}