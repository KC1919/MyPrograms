class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        
        int i=0,j=0;
        
        while(i<s.length() || j<t.length())
        {
            char c1=i<s.length()?s.charAt(i):'\0';
            char c2=j<t.length()?t.charAt(j):'\0';
            
            if(c1!='\0' && c1=='#')
            {
                if(s1.length()>0)
                    s1.deleteCharAt(s1.length()-1);
            }
            else if(c1!='\0')
                s1.append(c1);
            
            if(c2!='\0' && c2=='#')
            {
                if(s2.length()>0)
                    s2.deleteCharAt(s2.length()-1);
            }
            else if(c2!='\0')
                s2.append(c2);
            
            i++;
            j++;
            
        }
        
        if(s1.toString().equals(s2.toString()))return true;
        
        return false;
    }
}