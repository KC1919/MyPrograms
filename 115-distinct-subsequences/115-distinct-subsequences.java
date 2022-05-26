class Solution {
    public int numDistinct(String s, String t) {
        
        if(s.length()<t.length())
            return 0;
        
        Integer dp[][]=new Integer[s.length()][t.length()];
        countDistinct(s,0,t,0,dp);
        return dp[0][0];
    }
    
    private int countDistinct(String s, int i, String t, int j, Integer dp[][]){
        
        if(i==s.length() && j<t.length())
            return 0;
        
        if(j==t.length()){
            return 1;
        }
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        
        // if the character matches in both the strings, we have 2 choices
        if(s.charAt(i)==t.charAt(j)){
            
            //we can meither mmove both the pointers
            int moveBothPointerRes=countDistinct(s,i+1,t,j+1,dp);
            
            //or we can only move the ith pointer, to cover the subsequence if there are duplicate
            //adjacent characters that match to the character in t string, so they 
            //also contribute in forming a possible subsequence, so we explore that path also
            int moveIthPointerRes=countDistinct(s,i+1,t,j,dp);
            
            //and store the sum returned from both the choices
            dp[i][j]=moveBothPointerRes+moveIthPointerRes;
        }
        
        //if the character do not match, we simply move the ith pointer, because we have to find a matching 
        //character corresponding to the jth position in string t, for moving the jth pointer
        //because we have to match the whole sting and we can't skip any character of string t
        //so we dont move jth pointer until we get a matching character corresponding to it
        
        else
            dp[i][j]=countDistinct(s,i+1,t,j,dp);
            
        return dp[i][j];
    }
}