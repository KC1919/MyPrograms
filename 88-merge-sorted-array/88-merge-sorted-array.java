class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int i=0, j=0;
        
        int ans[]=new int[n+m];
        int k=0;
        
        while(i<m && j<n)
        {
            if(a[i]<=b[j]){
                ans[k++]=a[i];
                i++;
            }
            else{
                ans[k++]=b[j];
                j++;
            }
        }
        
        while(i<m){
            ans[k++]=a[i];
            i++;
        }
        
        while(j<n){
            ans[k++]=b[j];
            j++;
        }
        
        for(int p=0;p<k;p++){
            a[p]=ans[p];
        }
    }
}