class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int dp[][]=new int[s.length()][s.length()];
        
        for(int gap=0;gap<s.length();gap++){
            
            for(int i=0,j=gap;j<s.length();i++,j++){
                
                //single character substring
                if(gap==0){
                    dp[i][j]=1;
                }
                
                //substring of length=2
                else if(gap==1){
                    
                    //if both characters are same then max length=2
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2;
                    }
                    else{
                        //if the two characters differ max length=1
                        dp[i][j]=1;
                    }
                }
                
                //substring with more than 2 characters
                else{
                    
                    //if the start and end characters are same, then the
                    //max length = 2+(LPS of middle part)
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2+dp[i+1][j-1];
                    }
                    else{
                        
                        //if the characters are not same, then the max length
                        //equal to the Max of(mid part prepended by start character,
                        //mid part appended by the end character)
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }
            }
        }
        
        return dp[0][s.length()-1];
    }
}