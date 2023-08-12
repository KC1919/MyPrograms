class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Integer dp[]=new Integer[s.length()];
        return breakWord(s,0,wordDict,dp);
    }

    public boolean breakWord(String s, int idx, List<String> dict, Integer dp[]){

        if(s.length()==0){
            return true;
        }

        if(dp[idx]!=null){
            return dp[idx]==0?false:true;
        }

        for(int i=0;i<dict.size();i++){
            if(s.indexOf(dict.get(i))==0){
                boolean res=breakWord(s.substring(dict.get(i).length(),s.length()),idx+dict.get(i).length(),dict,dp);
                if(res==true){
                    dp[idx]=1;
                    return true;
                }
            }
        }
        dp[idx]=0;

        return false;
    }
}