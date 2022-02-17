class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character>hm=new HashSet<>();
        
        int j=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(hm.contains(ch))
            {
                while(s.charAt(j)!=ch)
                {
                    hm.remove(s.charAt(j));
                    j++;
                }
                hm.remove(s.charAt(j));
                j++;
                hm.add(ch);
            }
            else
            {
                hm.add(ch);
                max=Math.max(max,i-j+1);
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}