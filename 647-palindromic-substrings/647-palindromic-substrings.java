class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        
        boolean dp[][]=new boolean[n][n];
        
        int count=0;
        
        int max=1;
        int si=-1, ei=-1;
        
        for(int gap=0;gap<n;gap++){
            
            for(int i=0,j=gap;j<n;i++,j++){
                
                char start=s.charAt(i);
                char end=s.charAt(j);
                
                if(gap==0){
                    dp[i][j]=true;
                    si=i;
                    ei=j;
                    count++;
                }
                
                else if(gap==1){
                    
                    if(start==end){
                        dp[i][j]=true;
                        max=2;
                        si=i;
                        ei=j;
                        count++;
                    }
                }
                
                else{
                    
                    if(start==end && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        count++;
                        
                        if(j-i+1>max){
                            max=j-i+1;
                            si=i;
                            ei=j;
                        }
                    }
                }
            }
        }
        return count;
    }
}