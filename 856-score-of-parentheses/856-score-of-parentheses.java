class Solution {
    public int scoreOfParentheses(String s) {
        
        if(s.length()==2)return 1;
        
        Stack<String>st=new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
                st.push("(");
            
            else if(ch==')')
            {
                if(st.peek().equals("(")){
                    st.pop();
                    st.push(1+"");
                }
                   
                else{
                    int sum=0;
                    while(st.size()>0 && !st.peek().equals("("))
                    {
                        sum+=Integer.parseInt(st.pop());
                    }

                    sum=2*sum;
                    st.pop();
                    st.push(sum+"");
                }
            }
        }
        
        while(st.size()>0)
            count+=Integer.parseInt(st.pop());
        
        return count;
    }
}