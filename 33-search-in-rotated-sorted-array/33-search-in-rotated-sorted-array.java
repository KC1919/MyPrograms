class Solution {
    public int search(int[] a, int target) {
        
        int lo=0, hi=a.length-1;
        
        int mid=-1;
        
        while(lo<=hi){
            mid=(lo+hi)/2;
            
            if(target==a[mid]){
                return mid;
            }
            
            else if(a[mid]>=a[lo]){
                
                if(target<a[mid] && target>=a[lo]){
                    hi=mid-1;
                }
                
                else{
                    lo=mid+1;
                }
            }
            
            else{
                
                if(target>a[mid] && target<=a[hi]){
                    lo=mid+1;
                }
                
                else{
                    hi=mid-1;
                }
            }
        }
        
        return -1;
    }
}