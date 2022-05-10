class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer>st=new Stack<>();
        
        int res=0;
        
        for(int i=0;i<tokens.length;i++)
        {
            String s=tokens[i];
            
            //if any operator comes
            if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")){
                
                //pop two integers, i.e operands from the stack
                int b=st.pop();
                int a=st.pop();
                
                //evaluate them with the operator
                res=evaluate(a,b,s);
                
                //push the result back into the integer stack
                st.push(res);
            }
            
            //if it is a number then we convert it to a integer and push it into the stack
            else
                st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
    
    //function to evaluate expression with two operands
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