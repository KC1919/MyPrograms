class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        if((s1.length()+s2.length())!=s3.length()){
            return false;
        }

        Boolean dp[][]=new Boolean[s1.length()+1][s2.length()+1];
        return helper(s1,s2,s3,0,0,0,dp);
    }

    public boolean helper(String s1, String s2, String s3, int i, int j, int k, Boolean dp[][]){

        if(i==s1.length() && j==s2.length()){
            return true;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        boolean res=false;

        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            res=helper(s1,s2,s3,i+1,j,k+1,dp);
            if(res==true){
                return dp[i][j]=true;
            }
        }

        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            res=helper(s1,s2,s3,i,j+1,k+1,dp);
            if(res==true){
                return dp[i][j]=true;
            }
        }

        return dp[i][j]=false;
    }
}