class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<ops.length;i++)
        {
            String op=ops[i];
            
            if(op.equals("+"))
            {
                int v1=st.pop();
                int v2=st.pop();
                
                st.push(v2);
                st.push(v1);
                
                st.push(v1+v2);
            }
            
            else if(op.equals("D"))
            {
                int v1=st.peek();
                st.push(v1*2);
            }
            
            else if(op.equals("C"))
                st.pop();
            
            else
            {
                int val=Integer.parseInt(op);
                st.push(val);
            }
        }
        
        int sum=0;
        while(st.size()>0)
            sum+=st.pop();
        
        return sum;
    }
}