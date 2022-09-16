class Solution {
    
    public int maximumScore(int[] nums, int[] multi) {
        
        int n=nums.length;
        int m=multi.length;
        
        Integer dp[][]=new Integer[n+1][m+1];
        
        return maxiScore(nums,multi,0,n,m,0,n-1,dp);
    }
    
    public int maxiScore(int a[], int multi[], int idx, int n, int m, int l, int r, Integer dp[][]){
        
        if(idx==m){
            return 0;
        }
        
        if(dp[idx][l]!=null){
            return dp[idx][l];
        }
        
        int max=Integer.MIN_VALUE;
            
        int lres=a[l]*multi[idx]+maxiScore(a,multi,idx+1,n,m,l+1,r,dp);

        int rres=a[r]*multi[idx]+maxiScore(a,multi,idx+1,n,m,l,r-1,dp);
        
        
        return dp[idx][l]=Math.max(lres,rres);
    }
}