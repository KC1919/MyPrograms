class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,wordDict,new HashMap<>());
    }
    
    boolean helper(String s, List<String>wordDict, HashMap<String,Boolean>answer)
    {
        if(s.length()==0)
            return true;
        
        if(answer.containsKey(s)){
            return answer.get(s);
        }
        
        for(String word:wordDict)
        {
            if(s.indexOf(word)==0)
            {
                String remWord=s.substring(word.length());
                if(helper(remWord,wordDict,answer)){
                    answer.put(remWord,true);
                    return true;
                }
            }
        }
        answer.put(s,false);
        return false;
        
    }
}