class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int cap=0, small=0;
        
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            
            if(ch>=65 && ch<=90)
            {
                if(cap>=0 && small==0)
                    cap++;
                
                else
                    return false;
            }
            else
            {
                if(cap<=1 && small>=0)
                {
                    small++;
                }
                else
                    return false;
            }
        }
        return true;
    }
}