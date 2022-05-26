class Solution {
    public int numDistinct(String s, String t) {
        
        if(s.length()<t.length())
            return 0;
        
        Integer dp[][]=new Integer[s.length()][t.length()];
        return countDistinct(s,0,t,0,dp);
    }
    
    private int countDistinct(String s, int i, String t, int j, Integer dp[][]){
        
        if(i==s.length() && j<t.length())
            return 0;
        
        if(j==t.length()){
            return 1;
        }
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        
        if(s.charAt(i)==t.charAt(j)){
            int moveBothPointerRes=countDistinct(s,i+1,t,j+1,dp);
            int moveIthPointerRes=countDistinct(s,i+1,t,j,dp);
            
            dp[i][j]=moveBothPointerRes+moveIthPointerRes;
        }
        
        else
            dp[i][j]=countDistinct(s,i+1,t,j,dp);
            
        return dp[i][j];
    }
}