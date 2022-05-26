class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        
        String revS=sb.reverse().toString();
        
        return LCS(s,revS);
    }
    
    public int LCS(String s1, String s2) {
        
        // Integer dp[][]=new Integer[s1.length()][s2.length()];
        // return LCS(s1, s1.length()-1,s2,s2.length()-1,dp);
        
        
        //Tabulation approach
        int dp[][]=new int[s1.length()][s2.length()];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=(i>0 && j>0)?1+dp[i-1][j-1]:1;
                }
                else{
                    dp[i][j]=(i>0)?dp[i-1][j]:0;
                    dp[i][j]=(j>0)?Math.max(dp[i][j],dp[i][j-1]):dp[i][j];
                }
            }
        }
        return dp[s1.length()-1][s2.length()-1];
    }
}