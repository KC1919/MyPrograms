class Solution {
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        HashSet<String> hs=new HashSet<>();
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String item:wordDict)
            hs.add(item);
        
        return helper(s,hs,hm,new HashMap<>());
    }
    
    boolean helper(String s,HashSet<String>hs, HashMap<String,Integer>hm, HashMap<String,Boolean>answer)
    {
        if(s.length()==0)
            return true;
        
        if(answer.containsKey(s)){
            return answer.get(s);
        }
        
        for(int i=0;i<s.length();i++)
        {
            String temp=s.substring(0,i+1);
            
            if(hs.contains(temp))
            {
                hm.put(temp,1);
                if(helper(s.substring(i+1),hs,hm,answer)){
                    answer.put(temp,true);
                    return true;
                }
            }
        }
        answer.put(s,false);
        return false;
        
    }
}