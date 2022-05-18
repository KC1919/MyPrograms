class Solution {
    public int largestRectangleArea(int[] a) {
        
        if(a.length==1)
            return a[0];
        
        int max=0;
        int n=a.length;
        
        int ls[]=new int[n];
        int rs[]=new int[n];
        
        ls[0]=-1;
        
        for(int i=1;i<n;i++){
            
            int j=i-1;
            
            int area=-1;
            while(j!=-1 && a[i]<=a[j]){
                rs[j]=i;
                j=ls[j];
            }
            
            ls[i]=j;
        }
        
        for(int i=0;i<n;i++){
            
            int rsmall=rs[i]==0?n:rs[i];
            
            int span=(rsmall-ls[i])-1;
            int area=a[i]*span;
            
            max=Math.max(area,max);
        }
        return max;
    }
}