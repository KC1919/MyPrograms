class Solution {
    public String longestPalindrome(String s) {
         int left=0, right=0, max=0;
        int li=-1, ri=-1;
        
        for(int i=0;i<s.length();i++)
        {
            left=i;
            right=i;
            
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if((right-left+1)>max){
                        li=left;
                        ri=right;
                        max=right-left+1;
                    }
                    left--;
                    right++;
                }
            }
            
            left=i;
            right=i+1;
            
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if((right-left+1)>max){
                        li=left;
                        ri=right;
                        max=right-left+1;
                    }
                    left--;
                    right++;
                }
            }
        }
        
        if(li==-1 || ri==-1)return "";
        
        return s.substring(li,ri+1);
    }
}