class Solution 
{
    public int scoreOfParentheses(String s) 
    {
        Stack<String>st=new Stack<>();
        
        Stack<Integer>ss=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                st.push("(");
            }
            
            else if(ch==')')
            {
                if(st.size()>0)
                {
                    int sum=0;
                    
                    if(!st.peek().equals("("))
                    {
                        while(st.size()>0 && !st.peek().equals("("))
                        {
                            st.pop();
                            sum+=ss.pop();
                        }
                        if(st.size()==0)
                        {
                            st.push(sum+"");
                            ss.push(sum);
                        }
                        else
                        {
                            st.pop();
                            st.push((2*sum)+"");
                            ss.push(2*sum);
                        }
                    }
                    else
                    {
                        st.pop();
                        st.push(1+"");
                        ss.push(1);
                    }
                }
            }
        }   
        
        int res=0;
        
        while(ss.size()!=0)
        {
            res+=ss.pop();
        }
        
        return res;
        
    }
}