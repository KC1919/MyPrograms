class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>hm=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char arr[]=word.toCharArray();
            Arrays.sort(arr);
            String sortWord=new String(arr);
            
            if(hm.containsKey(sortWord)){
                hm.get(sortWord).add(word);
            }
            else{
                hm.put(sortWord,new ArrayList<>());
                hm.get(sortWord).add(word);
            }
        }

        List<List<String>>res=new ArrayList<>();

        for(String key:hm.keySet()){
            res.add(hm.get(key));
        }
        return res;
    }
}