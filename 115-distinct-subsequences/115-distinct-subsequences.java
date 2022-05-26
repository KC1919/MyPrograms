class Solution {
    public int numDistinct(String s, String t) 
    {
        Integer dp[][]=new Integer[s.length()+1][t.length()+1];
        helper(s,t,s.length(),t.length(),dp);
        return dp[s.length()][t.length()];
        
    }
    
    int helper(String s, String t, int i, int j, Integer dp[][])
    {
        if(i<j)
            return dp[i][j]=0;
        
        if(j==0)
        {
            return 1;
        }
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        if(s.charAt(i-1)==t.charAt(j-1))
        {
            int lres=helper(s,t,i-1,j-1,dp);
            int rres=helper(s,t,i-1,j,dp);
            return dp[i][j]=lres+rres;
        }
        else
        {
            return dp[i][j]=helper(s,t,i-1,j,dp);
        }
    }
}