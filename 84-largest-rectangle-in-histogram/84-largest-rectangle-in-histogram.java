class Solution {
    public int largestRectangleArea(int[] a) {
        
        int n=a.length;
        
        int ls[]=new int[n];
        
        ls[0]=-1;
        
        for(int i=1;i<n;i++){
            
            int j=i-1;
            
            while(j!=-1 && a[i]<=a[j]){
                j=ls[j];
            }
            
            ls[i]=j;
        }
        
        int rs[]=new int[n];
        
        rs[n-1]=n;
        
        for(int i=n-2;i>=0;i--){
            
            int j=i+1;
            
            while(j!=n && a[i]<=a[j]){
                j=rs[j];
            }
            
            rs[i]=j;
        }
        
        int max=0;
        
        for(int i=0;i<n;i++){
            
            int wid=(rs[i]-ls[i])-1;
            
            max=Math.max(max,a[i]*wid);
        }
        
        return max;
    }
}