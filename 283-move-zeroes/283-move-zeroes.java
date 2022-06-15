class Solution {
    public void moveZeroes(int[] a) {
        
        if(a.length==0){
            return;
        }
        
        int left=0, right=0;
        int n=a.length;
        
        while(right<n){
            
            if(a[right]!=0){
                
                if(a[left]==0){
                    int temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                }
                
                left++;
            }
            
            right++;
        }
    }
}