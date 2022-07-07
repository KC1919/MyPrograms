class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        int n=s1.length();
        int m=s2.length();
        
        if(s3.length()>n+m){
            return false;
        }
        
        Boolean dp[][]=new Boolean[n+1][m+1];
        
        return interleave(s1,0,n,s2,0,m,s3,0,dp);
    }
    
    private boolean interleave(String s1, int idx1, int n, String s2, int idx2, int m, String s3, int idx3, Boolean dp[][])
    {
        if(idx1==n && idx2==m){
            return dp[idx1][idx2]=true;
        }
        
        if(dp[idx1][idx2]!=null){
            return dp[idx1][idx2];
        }
        
        if(idx1<n && idx2<m && idx3<s3.length() && s1.charAt(idx1)==s2.charAt(idx2) && s2.charAt(idx2)==s3.charAt(idx3)){
            
            boolean res1=interleave(s1,idx1+1,n,s2,idx2,m,s3,idx3+1,dp);
            
            if(res1==true){
                return dp[idx1][idx2]=true;
            }
            boolean res2=interleave(s1,idx1,n,s2,idx2+1,m,s3,idx3+1,dp);
            
            if(res2==true){
                return dp[idx1][idx2]=true;
            }
        }
        
        else if(idx1<n && idx3<s3.length() && s1.charAt(idx1)==s3.charAt(idx3)){
            boolean res=interleave(s1,idx1+1,n,s2,idx2,m,s3,idx3+1,dp);
            
            if(res==true){
                return dp[idx1][idx2]=true;
            }
        }
        
        else if(idx2<m && idx3<s3.length() && s2.charAt(idx2)==s3.charAt(idx3)){
            boolean res=interleave(s1,idx1,n,s2,idx2+1,m,s3,idx3+1,dp);
            
            if(res==true){
                return dp[idx1][idx2]=true;
            }
        }
        
        return dp[idx1][idx2]=false;
    }
}