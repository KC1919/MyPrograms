class Solution {
    
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder sb=new StringBuilder();
        
        Stack<Character>st=new Stack<>();
        
        int cc=0;  //closing count
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch>=97 && ch<=122)
                sb.append(ch);
            
            else if(ch=='(')
            {
                st.push(ch);  
                sb.append('#');
            }
            
            else
            {
                if(st.size()>0)
                {
                    st.pop();
                    sb.append('*');
                }
                    
                else
                    cc++;
            }
        }
        
        
        if(st.size()!=0)
        {
            if(st.size()+cc==s.length())
                return "";
            
            else
            {
                for(int i=sb.length()-1;i>=0;i--)
                {
                    if(st.size()==0)
                        break;
                    
                    if(sb.charAt(i)=='#' && st.size()>0)
                    {
                        sb.setCharAt(i,'-');
                        st.pop();
                    }
                }
            }
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            
            if(ch>=97 && ch<=122)
                ans.append(ch);
            
            else if(ch=='#')
                ans.append('(');
            
            else if(ch=='*')
                ans.append(')');
        }
        return ans.toString();
    }
}