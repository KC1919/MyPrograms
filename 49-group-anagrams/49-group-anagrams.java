class Solution {
    public List<List<String>> groupAnagrams(String[] s) 
    {
        int count=0;
        int n=s.length;
        
        List<List<String>>list=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            String word=s[i];
            char sortWord[]=word.toCharArray();
            Arrays.sort(sortWord);
            String val=String.valueOf(sortWord);
            
            if(hm.containsKey(val)){
                list.get(hm.get(val)).add(word);
            }
            else{
                hm.put(val,count);
                if(count==list.size()){
                    list.add(new ArrayList<>());
                }
                list.get(count).add(word);
                count++;
            }
        }
        return list;
    }
}