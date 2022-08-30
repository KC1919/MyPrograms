class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Boolean dp[]=new Boolean[s.length()];
        return fuckWord(s,wordDict,0,dp);
    }
    
    private boolean fuckWord(String s, List<String>list, int idx, Boolean dp[]){
        
        if(s.length()==0){
            return true;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        
        for(String word:list){
            if(s.indexOf(word)==0){
                boolean res=fuckWord(s.substring(word.length()),list,idx+word.length(),dp);
                
                if(res==true){
                    return dp[idx]=true;
                }
            }
        }
        
        return dp[idx]=false;
    }
}