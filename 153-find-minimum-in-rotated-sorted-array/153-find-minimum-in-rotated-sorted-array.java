class Solution {
    public int findMin(int[] a) {
        
        int high=a.length-1;
        int low=0;
        int mid=-1;
        
        while(low<=high){
            mid=(low+high)/2;
            
            if(a[low]<=a[mid]){
                
                if(a[low]<=a[high]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            
            else{
                
                if(a[mid]<=a[high]){
                    high=mid;
                }
                
                else{
                    low=mid;
                }
                
            }
        }
        
        return a[low];
    }
}