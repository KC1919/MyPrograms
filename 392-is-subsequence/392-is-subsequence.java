class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
            return false;
        
        if(s.length()==0 || t.length()==0)
            return true;
        
        // HashMap<Character,Integer>hm=new HashMap<>();
        
        int count=0;
        int j=0;
        
        for(int i=0;i<t.length();i++)
        {
            if(count==s.length())
                return true;
            
            if(s.charAt(j)==t.charAt(i))
            {
                // if(j==0){
                //     hm.put(s.charAt(j),i);
                //     count++;
                //     j++;
                // }
                // else if(j>0 && i>hm.get(s.charAt(j-1)))
                // {
                //     hm.put(s.charAt(j),i);
                //     count++;
                //     j++;
                // }
                count++;
                j++;
                // else return false;
            }
        }
        if(count==s.length())
            return true;
        
        return false;
    }
}