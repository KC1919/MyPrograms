class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        
        int n=a.length;
        
        int ng[]=new int[n];
        
        ng[n-1]=n;
        
        for(int i=n-2;i>=0;i--){
            int j=i+1;
            
            while(j!=n && a[i]>=a[j]){
                j=ng[j];
            }
            
            ng[i]=j;
        }
        
        int ans[]=new int[n-k+1];
        int idx=0, j=0;
        
        for(int i=0;i<(n-k+1);i++){
            
            if(j<i){
                j=i;
            }
            
            while(j<n && ng[j]<(i+k)){
                j=ng[j];
            }
            
            if(j==n){
                ans[idx++]=a[i];
            }
            
            else{
                ans[idx++]=a[j];
            }
        }
        
        return ans;
    }
}