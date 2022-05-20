class Solution {
    public boolean canJump(int[] a) {
        
        int n=a.length;
        
        int dp[]=new int[n];
        
        dp[n-1]=1;
        
        for(int i=n-2;i>=0;i--){
            for(int jump=1;jump<=a[i];jump++){
                if(dp[i+jump]==1){
                    dp[i]=1;
                    break;
                }
            }
        }
        if(dp[0]==1)
            return true;
        
        return false;
    }
}