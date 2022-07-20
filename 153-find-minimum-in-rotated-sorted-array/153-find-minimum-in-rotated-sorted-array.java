class Solution {
    public int findMin(int[] a) {
        
        int high=a.length-1;
        int low=0;
        int mid=-1;
        
        while(low<=high){
            mid=(low+high)/2;
            
            if(a[low]<=a[mid]){
                
                if(a[low]>a[high]){
                    low=mid+1;
                }
                else{
                    return a[low];
                }
            }
            
            else{
                high=mid;
            }
        }
        return a[low];
    }
}