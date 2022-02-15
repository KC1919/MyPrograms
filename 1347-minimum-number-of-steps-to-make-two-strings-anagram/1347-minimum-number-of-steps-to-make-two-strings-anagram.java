class Solution {
    public int minSteps(String s, String t) 
    {
        if(s.length()==0|| t.length()==0)
            return 0;
    
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                if(hm.get(ch)!=0)
                    hm.put(ch,hm.get(ch)-1);
                
                else
                    count++;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}