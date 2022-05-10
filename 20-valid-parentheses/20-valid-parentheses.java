class Solution {
    public boolean isValid(String s) {
        
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            
            else if(ch==')'){
              
                if(st.size()>0 && st.peek()=='(')
                    st.pop();
                
                else
                    return false;
                
            }
            
            else if(ch=='}'){
                
                if(st.size()>0 && st.peek()=='{')
                    st.pop();
                
                else
                    return false;
                
            }
            
            else if(ch==']'){
                
                if(st.size()>0 && st.peek()=='[')
                    st.pop();
                
                else
                    return false;
            }
        }
        
        return st.size()==0?true:false;
    }
}