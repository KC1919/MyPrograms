class Solution {
    public int lengthOfLIS(int[] a) {
        
        if(a.length==1)
            return 1;
        
        int n=a.length;
        int dp[]=new int[n];
        
        dp[n-1]=1;
        
        int max=0;
        for(int i=n-2;i>=0;i--){
            int res=LIS(a,i,dp,n);
            max=Math.max(dp[i],max);
        }
        return max;
    }
    public int LIS(int a[], int idx, int dp[], int n){
        
        if(idx==n)
            return 0;
        
        if(dp[idx]!=0)
            return dp[idx];
        
        int max=0;
        for(int i=idx+1;i<n;i++){
            
            if(a[i]>a[idx]){
                int res=LIS(a,i,dp,n);
                max=Math.max(max,res);
            }
        }
        dp[idx]=max+1;
        
        return dp[idx]; 
    }
}