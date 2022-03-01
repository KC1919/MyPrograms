class Solution {
    public int[] countBits(int n) 
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        for(int i=0;i<=n;i++)
        {
            binary(i,dp);
        }
        return dp;
    }
    
    public int binary(int n, int dp[])
    {
        int rem=0, num=n, count=0;
        
        while(num>0)
        {
            if(dp[num]>=0){
                count+=dp[num];
                break;
            }
            rem=num%2;
            if(rem==1)
                count++;
            
            num=num/2;
        }
        dp[n]=count;
        return count;
    }
}