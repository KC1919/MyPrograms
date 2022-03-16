class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int i=0, j=0;
        
        Stack<Integer>st=new Stack<>();
        
        while(i<pushed.length && j<popped.length)
        {
            if(st.size()>0 && popped[j]==st.peek())
            {
                    st.pop();
                    j++;
            }
            
            else if(pushed[i]!=popped[j])
            {       
                st.push(pushed[i]);
                i++;
            }
            else if(pushed[i]==popped[j])
            {
                i++;
                j++;
            }
        }
        
        while(j<popped.length)
        {
            if(st.peek()==popped[j])
                st.pop();
            
            else
                return false;
            
            j++;
        }
        
        return true;
    }
}