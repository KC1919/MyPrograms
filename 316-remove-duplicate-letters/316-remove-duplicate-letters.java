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
        
        //this keeps the track of the character 
        // mapped  to-> Pair(userStatus, lastPos)
        HashMap<Character,Pair>hm=new HashMap<>();
        
        
        //we map all the characters with their last position of occurrence in the 
        //string
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
                continue;
            
            hm.put(ch,new Pair(i));
        }
        
        StringBuilder sb=new StringBuilder();
        
        Stack<Character>st=new Stack<>();
        
        //now we start iterating the string
        for(int i=0;i<s.length();i++)
        {
            //we take the ith character
            char ch=s.charAt(i);
            
            //check if that character has been used before or not
            //if not used, we check
            if(hm.get(ch).used!=true)
            {
                //we remove all the characters from the stack that have come before
                //the ith character and that are greater than the ith character
                //and their last index is also greater than the ith index,
                //that measn that those greater characters should come after
                //the ith character, because we have to give the lexicographically
                //smallest string as the answer
                
                while(st.size()>0 && ch<st.peek() && hm.get(st.peek()).lastPos>i)
                {
                    //we mark the character being removes as unused
                    hm.get(st.peek()).used=false;
                    st.pop();
                }
                
                //push the current character to the stack
                st.push(ch);
                
                //and mark its status as used
                hm.get(ch).used=true;
            }
        }
        
        
        //when the whole string is traversed only distinct characters are left into
        //the stack and that to in lexicographical order
        //so we pop then one by one and append them to the string builder
        while(st.size()>0)
            sb.append(st.pop());
        
        //return the string after reversing, because the stack reverses the order
        //so to correct the order we need to reverse the string
        return sb.reverse().toString();
    }
}