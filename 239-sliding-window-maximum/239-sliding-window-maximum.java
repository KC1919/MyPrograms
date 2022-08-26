class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        
        //Using the next greater element strategy
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
            
            //checking if the next greater of current index lies inside the 
            //current window, then we jump onto that index, bcoz that
            //will be the greatest element of that window
            
            while(j<n && ng[j]<(i+k)){
                j=ng[j];
            }
            
            //if the next greater index lies out of the array, 
            //then it means, the current element is the greatest element
            //of the current window
            if(j==n){
                ans[idx++]=a[i];
            }
            
            //else the greatest element of the current window is the 
            //jth element
            else{
                ans[idx++]=a[j];
            }
        }
        
        return ans;
    }
}