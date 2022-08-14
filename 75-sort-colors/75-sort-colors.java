class Solution {
    public void sortColors(int[] a) {
        
        int i=0, j=0, k=a.length-1;
        
        while(i<=k){
            
            if(a[i]==0){
                swap(a,j,i);
                i++;
                j++;
            }
            
            else if(a[i]==1){
                i++;
            }
            
            else{
                swap(a,k,i);
                k--;
            }
        }
    }
    
    private void swap(int a[], int i, int j){
        
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}