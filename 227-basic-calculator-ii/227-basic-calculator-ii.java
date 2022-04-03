class Solution {
    public int calculate(String s) 
    {
        Stack<Integer>st=new Stack<>();
        Stack<Character>ops=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isDigit(ch))
            {
                int pval=0;
                if(st.size()>0 && Character.isDigit(s.charAt(i-1)))
                {
                    pval=st.pop();
                    pval=(pval*10);
                }
                pval=pval+(ch-48);
                st.push(pval);
            }
            
            else if(ch=='+' || ch=='-' || ch=='/' || ch=='*')
            {
                while(ops.size()>0 && precedence(ops.peek())>=precedence(ch))
                {
                    char op=ops.pop();
                    int b=st.pop();
                    int a=st.pop();
                    int res=evaluate(a,b,op);
                    st.push(res);
                }
                ops.push(ch);
            }
        }
        while(ops.size()>0)
        {
            char op=ops.pop();
            int b=st.pop();
            int a=st.pop();
            int res=evaluate(a,b,op);
            st.push(res);
        }
        return st.peek();
    }
    
    public int evaluate(int a, int b, char op)
    {
        if(op=='+')
            return a+b;
        else if(op=='-')
            return a-b;
        else if(op=='*')
            return a*b;
        else if(op=='/')
            return a/b;
        else return -1;
    }
    public int precedence(char op)
    {
        if(op=='+'||op=='-')
            return 1;
        else 
            return 2;
    }
}