class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character>hm=new HashSet<>();
        
        int max=0;
        int j=0;
        
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
                while(j<i && s.charAt(j)!=ch)
                {
                    hm.remove(s.charAt(j));
                    j++;
                }
                
                hm.remove(s.charAt(j));
                hm.add(s.charAt(i));
                j++;
                max=Math.max(i-j+1,max);
                
            }
        }
        return max;
    }
}