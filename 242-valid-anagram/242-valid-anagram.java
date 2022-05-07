class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(t.length()!=s.length())
            return false;
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            
            if(!hm.containsKey(ch))
                return false;
            
            else
            {
                if(hm.get(ch)>0){
                    hm.put(ch,hm.get(ch)-1);
                }
                else
                    return false;
            }
        }
        return true;
    }
}