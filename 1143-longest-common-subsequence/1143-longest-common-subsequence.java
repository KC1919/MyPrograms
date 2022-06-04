class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        // Integer dp[][]=new Integer[s1.length()][s2.length()];
        // return LCS(s1, s1.length()-1,s2,s2.length()-1,dp);
        
        
        //Tabulation approach
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                
                if(i==0 || j==0)
                    dp[i][j]=0;
                
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    
    //Memoization approach
    private int LCS(String s1, int idx1, String s2, int idx2, Integer dp[][]){
        
        if(idx1<0 || idx2<0)
            return 0;
        
        //we check if the answer to the current state is calculated before , so we return that
        if(dp[idx1][idx2]!=null)
            return dp[idx1][idx2];
        
        //there are two possible cases
        
        //1st, if the character at index of string 1 matches with the character at index of string 2
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            
            //so we add 1 to the answer returned by the remaining substring, meaning, the current character
            //adds to the LCS of the remaining string
            
            //making call by moving 1 index ahead in both the strings, to get their answer
            return dp[idx1][idx2]=1+LCS(s1,idx1-1,s2,idx2-1,dp);
        }
        
        //2nd case is that if the character does not match
        else{
            
            //so we take the maximum of the result returned by both the calls that we make.
            
            //we make one call by moving 1 index in one string and passing the other string as it is
            //we make 2nd call by passing one string as it is and moving one index in other string
            
            //so we compare the answer returned by both the calls, so we take that answer
            //as we need the Longest common 
            return dp[idx1][idx2]=Math.max(LCS(s1,idx1,s2,idx2-1,dp),LCS(s1,idx1-1,s2,idx2,dp));
        }
    }
}