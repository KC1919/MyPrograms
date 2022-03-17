class Solution {
    public String minWindow(String s, String t) 
    {
        if(t.length()>s.length())
            return "";
        
        HashMap<Character, Integer>hm=new HashMap<>();
        HashMap<Character,Integer>tm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int count=0, max=Integer.MAX_VALUE, si=-1, ei=-1;
        int j=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(tm.containsKey(ch) && hm.get(ch)<=tm.get(ch))
                count++;
            
            while(j<s.length() && count==t.length())
            {
                if((i-j+1)<max)
                {
                    max=i-j+1;
                    si=j;
                    ei=i;
                }
                
                char rem=s.charAt(j);
                
                hm.put(rem,hm.get(rem)-1);
                
                if(tm.containsKey(rem) && hm.get(rem)<tm.get(rem))
                    count--;
                
                j++;
            }
        }
    
        if(si<0 || ei<0)return "";
        
        return s.substring(si,ei+1);
    }
}