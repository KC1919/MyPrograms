class Solution {
    public int largestRectangleArea(int[] heights) {
        int res=0,m=heights.length;
        int[]prev=new int[m],next=new int[m];
        
        prev[0]=-1;
        for(int i=1;i<m;i++){
            int p=i-1;
            while(p>=0 && heights[p]>=heights[i]){
                p=prev[p];
            }
            prev[i]=p;
        }
        
        next[m-1]=m;
        for(int i=m-2;i>=0;i--){
            int p=i+1;
            while(p<m && heights[p]>=heights[i]){
                p=next[p];
            }
            
            next[i]=p;
        }
        
        for(int i=0;i<m;i++) res=Math.max(res,(next[i]-prev[i]-1)*heights[i]);
        
        return res;
    }
}