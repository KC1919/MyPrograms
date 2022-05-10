class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int n=temp.length;
        int ans[]=new int[n];
        
        Stack<Integer>st=new Stack<>();
        
        st.push(n-1);
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            
            int j=i+1;
            while(j!=-1 && temp[j]<=temp[i]){
                j=ans[j];
            }
            ans[i]=j;
            
            st.push(i);
        }
        
        for(int i=0;i<n;i++){
            if(ans[i]==-1)
                ans[i]=0;
            else{
                ans[i]=ans[i]-i;
            }
        }
        return ans;
    }
}