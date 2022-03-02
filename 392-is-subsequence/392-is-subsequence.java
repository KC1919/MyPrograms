class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
            return false;
        
        if(s.length()==0 || t.length()==0)
            return true;
        
        int count=0;
        int j=0;
        
        for(int i=0;i<t.length();i++)
        {
            if(count==s.length())
                return true;
            
            if(s.charAt(j)==t.charAt(i))
            {
                count++;
                j++;
            }
        }
        if(count==s.length())
            return true;
        
        return false;
    }
}