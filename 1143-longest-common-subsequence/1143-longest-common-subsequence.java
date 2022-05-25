class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        // Integer dp[][]=new Integer[s1.length()][s2.length()];
        // return LCS(s1, s1.length()-1,s2,s2.length()-1,dp);
        
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    
    private int LCS(String s1, int idx1, String s2, int idx2, Integer dp[][]){
        
        if(idx1<0 || idx2<0)
            return 0;
        
        if(dp[idx1][idx2]!=null)
            return dp[idx1][idx2];
        
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2]=1+LCS(s1,idx1-1,s2,idx2-1,dp);
        }
        
        else{
            return dp[idx1][idx2]=Math.max(LCS(s1,idx1,s2,idx2-1,dp),LCS(s1,idx1-1,s2,idx2,dp));
        }
    }
}