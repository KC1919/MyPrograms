class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        if(s1.length()+s2.length()<s3.length())
            return false;
        
        Integer dp[][]=new Integer[s1.length()+1][s2.length()+1];
        
        return check(s1,0,s2,0,s3,0,dp);
    }
    
    private boolean check(String s1, int i, String s2, int j, String s3, int idx, Integer dp[][]){
        
        if(i==s1.length() && j==s2.length()){
            dp[i][j]=1;
            return true;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j]==0?false:true;
        }
        
        if(i<s1.length() && j<s2.length() && idx<s3.length() && s1.charAt(i)==s3.charAt(idx) && s2.charAt(j)==s3.charAt(idx)){
            boolean res1=check(s1,i+1,s2,j,s3,idx+1,dp);
            boolean res2=check(s1,i,s2,j+1,s3,idx+1,dp);
            
            if(res1 || res2){
                dp[i][j]=1;
                return true;
            }
        }
        
        else if(i<s1.length() && idx<s3.length() && s1.charAt(i)==s3.charAt(idx)){
            boolean res=check(s1,i+1,s2,j,s3,idx+1,dp);
            dp[i][j]=res==true?1:0;
            return res;
        }
                
        else if(j<s2.length() && idx<s3.length() && s2.charAt(j)==s3.charAt(idx)){
            boolean res=check(s1,i,s2,j+1,s3,idx+1,dp);
            dp[i][j]=res==true?1:0;
            return res;
        }
               
        dp[i][j]=0;
        return false;
    }
}