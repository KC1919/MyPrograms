class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>hm=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char arr[]=word.toCharArray();
            char strArr[]=new char[26];
            // Arrays.sort(arr);
            // String sortWord=new String(arr);

            for(int j=0;j<arr.length;j++){
                strArr[arr[j]-'a']++;
            }

            String sortWord=String.valueOf(strArr);
            
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