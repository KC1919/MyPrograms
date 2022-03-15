class Solution {
    
    class Pair
    {
        int idx;
        char p;
        
        Pair(int idx, char p)
        {
            this.idx=idx;
            this.p=p;
        }
    }
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder sb=new StringBuilder();
        
        Stack<Pair>st=new Stack<>();
        
        int cc=0;
        int oc=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch>=97 && ch<=122)
                sb.append(ch);
            
            else if(ch=='(')
            {
                oc++;
                st.push(new Pair(oc,ch));
                sb.append('#');
            }
            
            else
            {
                if(st.size()>0)
                {
                    oc--;
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
                    
                    if(sb.charAt(i)=='#' && oc==st.peek().idx)
                    {
                        oc--;
                        sb.deleteCharAt(i);
                        st.pop();
                    }
                }
            }
        }
        
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            
            if(ch>=97 && ch<=122)
                continue;
            
            else if(ch=='#')
                sb.setCharAt(i,'(');
            
            else if(ch=='*')
                sb.setCharAt(i,')');
        }
        return sb.toString();
    }
}