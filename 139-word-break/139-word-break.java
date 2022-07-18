class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Integer dp[]=new Integer[s.length()];
        return breakAll(s,0,wordDict,dp);
    }
    
    private boolean breakAll(String s, int idx, List<String>list, Integer dp[]){
        
        if(s.length()==0){
            return true;
        }
        
        if(dp[idx]!=null){
            return dp[idx]==1?true:false;
        }
        
        for(String word:list){
            
            if(s.indexOf(word)==0){
                boolean res=breakAll(s.substring(word.length()),idx+word.length(),list,dp);
                if(res){
                    dp[idx]=1;
                    return true;
                }
            }   
        }
        dp[idx]=0;
        return false;
    }
}