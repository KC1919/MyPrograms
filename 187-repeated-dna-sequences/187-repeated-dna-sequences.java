class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        if(s.length()<10)
            return new ArrayList<>();
        
        int k=10;
        
        List<String>ans=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<k;i++)
            sb.append(s.charAt(i));
        
        hm.put(sb.toString(),1);
        
        for(int i=k;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            
            String temp=sb.toString();
            if(hm.containsKey(temp) && hm.get(temp)==1)
            {
                ans.add(temp);
                hm.put(temp,hm.get(temp)+1);
            }
                
            else
                hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        return ans;
    }
}