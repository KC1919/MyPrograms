class Solution {
    public int jump(int[] nums) {
        int n=nums.length;

        if(n==1) return 0;

        int dp[]=new int[n];

        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1]=0;
        dp[n-2]=1;

        for(int i=n-3;i>=0;i--){
            boolean flag=false;
            for(int j=nums[i];j>0;j--){
                if(i+j>=n-1){
                    dp[i]=1;
                    flag=true;
                    break;
                }
                else{
                    dp[i]=Math.min(dp[i],dp[i+j]);
                }
            }

            if(flag==false && dp[i]!=Integer.MAX_VALUE){
                dp[i]++;
            }
        }

        return dp[0];
    }
}