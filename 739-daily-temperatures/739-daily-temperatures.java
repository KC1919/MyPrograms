class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int n=temp.length;
        int ans[]=new int[n];
        
        Stack<Integer>st=new Stack<>();
        
        st.push(n-1);
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--){
            
            while(st.size()>0 && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.size()==0)
                ans[i]=0;
            else
                ans[i]=st.peek()-i;
            
            st.push(i);
        }
        return ans;
    }
}