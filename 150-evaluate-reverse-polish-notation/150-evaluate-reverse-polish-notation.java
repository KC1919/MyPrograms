class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer>st=new Stack<>();
        
        int res=0;
        
        for(int i=0;i<tokens.length;i++)
        {
            String s=tokens[i];
            
            if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")){
                int b=st.pop();
                int a=st.pop();
                
                res=evaluate(a,b,s);
                st.push(res);
            }
            else
                st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
    
    public int evaluate(int a, int b, String sign){
        
        if(sign.equals("*"))
            return a*b;
        
        else if(sign.equals("/"))
            return a/b;
        
        else if(sign.equals("+"))
            return a+b;
        
        else if(sign.equals("-"))
            return a-b;
        
        else 
            return -1;
    }
}