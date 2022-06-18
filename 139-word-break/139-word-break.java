class Solution {
    public boolean wordBreak(String s, List<String> list) {
        
        HashSet<String>hm=new HashSet<>();
        
        HashMap<String,Integer>hmap=new HashMap<>();
        
        for(String word:list){
            hm.add(word);
        }
        
        int res=breakWord(s,0,hm,hmap);
        
        return res==0?false:true;
    }
    
    private static int breakWord(String s, int idx, HashSet<String>hm, HashMap<String,Integer>hmap){
        
        if(idx==s.length()){
            return 1;
        }
        
        if(hmap.containsKey(s.substring(idx))){
            return hmap.get(s.substring(idx));
        }
        
        for(int i=idx;i<s.length();i++){
            
            String word=s.substring(idx,i+1);
            
            if(hm.contains(word)){
                int res=breakWord(s,i+1,hm,hmap);
                if(res==1){
                    hmap.put(word,1);
                    return 1;
                }
            }
        }
        
        hmap.put(s.substring(idx),0);
        return 0;
    }
}