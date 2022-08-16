class Solution {
    public int removeDuplicates(int[] a) {
        
        int n=a.length;
        int idx=1;
        
        for(int i=1;i<n;i++){
            
            if(a[i]==a[i-1]){
                continue;
            }
            
            else{
                a[idx++]=a[i];
            }
        }
        return idx;
    }
}