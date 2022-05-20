class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer>list=new ArrayList<>();
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,i);
        }
        
        int start=0, end=-1;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            int ei=hm.get(ch);
            
            end=Math.max(end,ei);
            
            if(i==end){
                list.add(i-start+1);
                start=end+1;
                end=-1;
            }
        }
        
        return list;
    }
}