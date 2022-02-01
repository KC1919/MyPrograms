class Solution {
    public String removeKdigits(String s, int K) 
    {
        if(K>=s.length())
            return "0";
        
        Stack<Integer>st=new Stack<>();
        
        int k=K;
        
        st.push((s.charAt(0)-48));
        
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            int d=ch-48;
            
            while(st.size()!=0 && st.peek()>d && k>0)
            {
                st.pop();
                k--;
            }
            st.push(d);
        }
        
        while(k!=0)
        {
            st.pop();
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(st.size()!=0)
        {
            sb.insert(0,st.pop()+"");
        }
        
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}