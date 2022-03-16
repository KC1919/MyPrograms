class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        if(s.length()<10)
            return new ArrayList<>();
        
        int j=1;
        int k=10;
        
        List<String>ans=new ArrayList<>();
        
        HashMap<String,Integer>hm=new HashMap<>();
        
        hm.put(s.substring(0,k),1);
        
        for(int i=k+1;i<=s.length();i++)
        {
            String temp=s.substring(j,i);
            if(hm.containsKey(temp) && hm.get(temp)==1)
            {
                ans.add(temp);
                hm.put(temp,hm.get(temp)+1);
            }
                
            else{
                hm.put(temp,hm.getOrDefault(temp,0)+1);
            }
                
            
            j++;
        }
        
        return ans;
    }
}