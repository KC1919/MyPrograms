class Solution {
    public int[] sortArrayByParity(int[] a) {
        
        int left=0, right=0;
        int n=a.length;
        
        while(right<n){
            
            if(a[right]%2==0){
                if(a[left]%2!=0){
                    int temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                }
                left++;
            }
            right++;
        }
        return a;
    }
}