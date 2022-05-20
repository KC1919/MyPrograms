class Solution {
    public int lengthOfLIS(int[] a) {
        
        if(a.length==1)
            return 1;
        
        int n=a.length;
        int dp[]=new int[n];
        
        dp[n-1]=1;
        
        int omax=0;
        for(int i=n-2;i>=0;i--){
            int max=0;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            omax=Math.max(omax,dp[i]);
        }
        return omax;
    }
}