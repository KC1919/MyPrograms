class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String ele=tokens[i];
            
            if(ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/")){
                int op2=st.pop();
                int op1=st.pop();
                int res=evaluate(op1,op2,ele);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(ele));
            }
        }
        return st.peek();
    }
    
    public int evaluate(int a, int b, String op){
        if(op.equals("+"))return a+b;
        else if(op.equals("-"))return a-b;
        else if(op.equals("*"))return a*b;
        else return a/b;
    }
}