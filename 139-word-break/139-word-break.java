class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,wordDict,new HashMap<>());
    }
    
    boolean helper(String s, List<String>wordDict, HashMap<String,Boolean>answer)
    {
        //if the whole string is used, means given list of words
        //were found in the string
        if(s.length()==0){
            
            // so we return true to mark success
            return true;
        }
        
        //we check if the remaining substring has been processed before by some other call
        //so we must be having the answer for it, so we return the stored answer
        //instead of processing it agin
        if(answer.containsKey(s)){
            return answer.get(s);
        }
        
        //we take
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