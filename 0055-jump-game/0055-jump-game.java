class Solution {
    public boolean canJump(int[] nums) {

        int n=nums.length; 
        boolean dp[]=new boolean[n];

        dp[n-1]=true;

        for(int i=n-2;i>=0;i--){
            for(int j=nums[i];j>0;j--){
                if(i+j>=n-1){
                    dp[i]=true;
                    break;
                }
                else if(i+j<n && dp[i+j]==true){
                    dp[i]=true;
                }
            }
        }
        return dp[0]; 
    }
}