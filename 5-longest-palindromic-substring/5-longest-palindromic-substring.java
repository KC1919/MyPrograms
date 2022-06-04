class Solution {
    public String longestPalindrome(String s) {
        
        int li=0, ri=0, max=0;
        int len=s.length();
        
        for(int i=0;i<len;i++)
        {
            
            if(max>(len-i)*2)
                break;
            
            int a1[]=palindrome(s,i,i);
            
            if(a1[0]!=-1 && a1[1]!=-1 && a1[1]-a1[0]+1>max)
            {
                max=a1[1]-a1[0]+1;
                li=a1[0];
                ri=a1[1];
            }
            int a2[]=palindrome(s,i,i+1);
            if(a2[0]!=-1 && a2[1]!=-1 && a2[1]-a2[0]+1>max)
            {
                max=a2[1]-a2[0]+1;
                li=a2[0];
                ri=a2[1];
            }
        }
        
        if(li==-1 || ri==-1)
            return "";
        
        return s.substring(li,ri+1);
    }
    
    public int[] palindrome(String s, int left, int right)
    {
        int li=-1, ri=-1, max=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            if(s.charAt(left)==s.charAt(right))
            {
                if((right-left+1)>max)
                {
                    li=left;
                    ri=right;
                    max=right-left+1;
                }
                left--;
                right++;
            }  
        }
        return new int[]{li,ri};
    }
}