class Solution {
    public int search(int[] a, int target) {
        
        
        int l=0, h=a.length-1;
        
        while(l<=h){
            
            int mid=(l+h)/2;
            
            if(a[mid]==target){
                return mid;
            }
            
            else if(a[0]<=a[mid]){
                
                if(target>=a[0] && target<=a[mid]){
                    h=mid-1;
                }
                
                else{
                    l=mid+1;
                }
            }
            
            else if(a[mid]<=a[h]){
                if(target>=a[mid] && target<=a[h]){
                    l=mid+1;
                }
                
                else{
                    h=mid-1;
                }
            }
        }
        
        return -1;
    }
}