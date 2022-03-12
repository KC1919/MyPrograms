class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length()==0)return 0;
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!hm.containsKey(ch))
            {
                hm.put(ch,0);
                max=Math.max(max,hm.size());
            }
            else
            {
                while(j<s.length() && s.charAt(j)!=ch)
                {
                    hm.remove(s.charAt(j));
                    j++;
                }
                if(j<s.length() && hm.size()!=0)
                {
                    hm.remove(s.charAt(j));
                    j++;
                }
                hm.put(ch,0);
            }
        }
        return max;
    }
}