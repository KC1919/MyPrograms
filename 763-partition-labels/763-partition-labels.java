class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,i);
        }
        
        List<Integer>list=new ArrayList<>();
        int start=0, end=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(hm.get(ch)>end)
                end=hm.get(ch);
            
            if(i==end)
            {
                int span=end-start+1;
                list.add(span);
                start=i+1;
            }
        }
        
        return list;
    }
}