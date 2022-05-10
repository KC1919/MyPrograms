class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int n=temp.length;
        int ans[]=new int[n];
        
        Stack<Integer>st=new Stack<>();
        
        st.push(0);
        for(int i=1;i<n;i++){
            
            while(st.size()>0 && temp[st.peek()]<temp[i]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        
        while(st.size()>0){
            ans[st.pop()]=0;
        }
        return ans;
    }
}