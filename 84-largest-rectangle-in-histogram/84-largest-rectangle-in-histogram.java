class Solution 
{
    class Pair
    {
        int ls;
        int rs;
        
        Pair(){}
        
        Pair(int ls, int rs)
        {
            this.ls=ls;
            this.rs=rs;
        }
    }
    
    public int largestRectangleArea(int[] heights) 
    {
        
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        
        
        Pair a[]=new Pair[n];
        
        for(int i=0;i<n;i++)
            a[i]=new Pair(-1,n);
            
        a[0].ls=-1;
        
        st.push(0);
        
        for(int i=1;i<n;i++)
        {
            while(st.size()!=0 && heights[st.peek()]>heights[i])
            {
                a[st.peek()].rs=i;
                st.pop();
            }
            if(st.size()==0)
            {
                a[i].ls=-1;
            }
            else
            {
                a[i].ls=st.peek();
            }
            st.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            int area=(a[i].rs-a[i].ls-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
}