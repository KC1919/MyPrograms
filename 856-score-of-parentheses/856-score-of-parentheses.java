class Solution {
    public int scoreOfParentheses(String s) {
        
        if(s.length()==2)return 1;
        
        Stack<Character>st=new Stack<>();
        Stack<Integer>sst=new Stack<>();
        
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
                st.push(ch);
            
            else if(ch==')')
            {
                if(st.peek()=='('){
                    st.pop();
                    sst.push(1);
                    if(st.size()>0)
                        st.push('@');
                }
                   
                else{
                    int sum=0;
                    while(sst.size()>0 && st.peek()!='(')
                    {
                        sum+=sst.pop();
                        st.pop();
                    }

                    sum=2*sum;
                    st.pop();
                    st.push('@');
                    sst.push(sum);
                }
            }
        }
        
        while(sst.size()>0)
            count+=sst.pop();
        
        return count;
    }
}