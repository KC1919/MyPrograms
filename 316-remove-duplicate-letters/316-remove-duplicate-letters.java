class Solution {
    
    class Pair
    {
        boolean used;
        int lastPos;
        
        Pair(int lastPos)
        {
            this.lastPos=lastPos;
        }
    }
    
    public String removeDuplicateLetters(String s) 
    {
        if(s==null || s.length()==0)
            return "";
        
        int n=s.length();
        
        HashMap<Character,Pair>hm=new HashMap<>();
        
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
                continue;
            
            hm.put(ch,new Pair(i));
        }
        
        StringBuilder sb=new StringBuilder();
        
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(hm.get(ch).used!=true)
            {
                while(st.size()>0 && ch<st.peek() && hm.get(st.peek()).lastPos>i)
                {
                    hm.get(st.peek()).used=false;
                    st.pop();
                }
            
                st.push(ch);
                hm.get(ch).used=true;
            }
        }
        
        while(st.size()>0)
            sb.insert(0,st.pop());
        
        return sb.toString();
    }
}