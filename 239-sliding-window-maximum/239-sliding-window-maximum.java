class Solution {
    public int[] maxSlidingWindow(int[] a, int k) 
    {
        Stack<Integer>st=new Stack<>();
        int n=a.length;
        int rg[]=new int[n];
        
        rg[n-1]=n;
        st.push(n-1);
        
        
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()!=0 && a[i]>=a[st.peek()])
            {
                st.pop();
            }
            
            if(st.size()!=0)
            {
                rg[i]=st.peek();
            }
            else
            rg[i]=n;
            
            st.push(i);
        }
        int ans[]=new int[n-k+1];
        int j=0, c=0;
        for(int i=0;i<=n-k;i++)
        {
            if(j<i)
            j=i;
            
            while(rg[j]<i+k)
            {
                j=rg[j];
            }
            ans[c++]=a[j];
        }
        return ans;
    }
}