class Solution {
    public int trap(int[] a) {
        Stack<Integer>st=new Stack<>();
        
        int n=a.length;
        int rg[]=new int[n];
        
        rg[n-1]=-1;
        
        st.push(n-1);
        
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && a[st.peek()]<=a[i])
                st.pop();
            
            if(st.size()==0){
                rg[i]=-1;
                st.push(i);
            }
            else
            rg[i]=st.peek();
        }
        
        st.clear();
        
        int lg[]=new int[n];
        
        lg[0]=-1;
        
        st.push(0);
        
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && a[st.peek()]<=a[i])
                st.pop();
            
            if(st.size()==0){
                lg[i]=-1;
                st.push(i);
            }
            else
            lg[i]=st.peek();
        }

        int water=0;
        
        for(int i=0;i<n;i++)
        {
            int lb=lg[i];
            int rb=rg[i];
            
            if(lb!=-1 && rb!=-1)
            {
                int area=Math.min(a[lb],a[rb])-a[i];
                water+=area;
            }
        }
        return water;
    }
}