class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length()==0)return 0;
        
        HashSet<Character>hm=new HashSet<>();
        
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!hm.contains(ch))
            {
                hm.add(ch);
                max=Math.max(max,i-j+1);
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
                hm.add(ch);
            }
        }
        return max;
    }
}