class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int n=heights.length;
        
        int rs[]=new int[n];
        
        int max=0;
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(st.size()!=0 && heights[i]<heights[st.peek()])
            {
                int ele=st.pop();
                rs[ele]=i;
                int ls=-1;
                
                if(st.size()>0)
                {
                    ls=st.peek();
                }
                
                max=Math.max(max,(rs[ele]-ls-1)*heights[ele]);
            }
            st.push(i);
        }
        
        while(st.size()!=0)
        {
            int ele=st.pop();
            int ls=-1;
                
            if(st.size()>0)
            {
                ls=st.peek();
            }
                
            max=Math.max(max,(n-ls-1)*heights[ele]);
        }
        return max;
    }
}