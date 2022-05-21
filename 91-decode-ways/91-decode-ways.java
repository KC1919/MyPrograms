class Solution {
    public int numDecodings(String s) 
    {
        Integer dp[]=new Integer[s.length()];
        helper(s,0,dp);
        return dp[0];
    }
    
    int helper(String s, int idx, Integer dp[])
    {
        
        if(idx==s.length())
        {
            return 1;
        }
        
        if(dp[idx]!=null)
            return dp[idx];
        
        if(s.charAt(idx)=='0')
            return dp[idx]=0;
        
        int count=0;

        count=helper(s,idx+1,dp);
        
        if(s.length()-idx>=2)
        {
            char ch1=s.charAt(idx);
            char ch2=s.charAt(idx+1);
            if(((ch1-48)*10)+(ch2-48)<=26)
            count+=helper(s,idx+2,dp);
        }
        
        return dp[idx]=count;
    }
}