class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length()>s.length())
            return "";
        
        HashMap<Character,Integer>tm=new HashMap<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        
        int start=0, end=0;
        
        int j=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(tm.containsKey(ch))
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
                if(hm.get(ch)<=tm.get(ch))
                {
                    count+=1;
                }
            }
            else
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            
            while(j<s.length() && count==t.length())
            {
                if(i-j+1<min)
                {
                     min=i-j+1;
                     start=j;
                     end=i;
                }
                        
                char rem=s.charAt(j);
                if(tm.containsKey(rem))
                {
                    if(hm.containsKey(rem))
                    hm.put(rem,hm.get(rem)-1);
                            
                    if(hm.get(rem)==0)
                    {
                        hm.remove(rem);
                        count-=1;
                    }
                            
                    else if(hm.get(rem)<tm.get(rem))
                    {
                        count-=1;
                    }
                }
                else
                {
                    hm.remove(rem);
                }
                j++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,end+1);
    }
}