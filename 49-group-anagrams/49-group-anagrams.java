class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        
        HashMap<String,List<String>>hm=new HashMap<>();
        
        for(int i=0;i<s.length;i++){
            
            String word=s[i];
            char a[]=word.toCharArray();
            Arrays.sort(a);
            String temp=new String(a);
            
            if(hm.containsKey(temp)){
                hm.get(temp).add(word);
            }
            
            else{
                hm.put(temp,new ArrayList<>());
                hm.get(temp).add(word);
            }
        }
        
        List<List<String>>res=new ArrayList<>();
        
        for(String key:hm.keySet()){
            res.add(hm.get(key));
        }
        
        return res;
    }
}