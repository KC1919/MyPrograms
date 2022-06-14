class Solution {
    public int minDistance(String a, String b) {
        
        Integer dp[][]=new Integer[a.length()][b.length()];
        LCS(a,a.length()-1,b,b.length()-1,dp);
        
        int max=dp[a.length()-1][b.length()-1];
        
        int min=0;
        
        min=(a.length()-max)+(b.length()-max);
        return min;
    }
    
    private int LCS(String a, int i, String b, int j, Integer dp[][]){
        
        if(i<0 || j<0){
            return 0;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+LCS(a,i-1,b,j-1,dp);
        }
        
        else{
            return dp[i][j]=Math.max(LCS(a,i-1,b,j,dp),LCS(a,i,b,j-1,dp));
        }
    }
}