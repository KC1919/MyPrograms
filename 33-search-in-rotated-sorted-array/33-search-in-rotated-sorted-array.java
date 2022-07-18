class Solution {
    public int search(int[] a, int target) {
        
       int l=0, h=a.length-1;
        
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            //if the target is found, we return its index
            if(a[mid]==target)
                return mid;
            
            //check if the left part is sorted
            else if(a[l]<=a[mid]){
                
                //if the left part is sorted, then we check the possibility of target to
                //lie in that sorted part
                if(target>=a[l] && target<a[mid]){
                    
                    //if yes, then we move our high pointer to mid-1
                    h=mid-1;
                }
                
                //if there is no possibility, then we move our low pointer to mid+1, to
                //search in the right part
                else
                    l=mid+1;
            }
            
            //if the left part is not sorted, means right part is sorted,
            //because any one part will always be sorted
            else{
                
                //so we check if the target can lie in the right sorted part,
                if(target>a[mid] && target<=a[h])
                    l=mid+1;
                
                //if there is no possibility to lie in the right half,we move our high
                //pointer to mid-1, to search in the left half
                else
                    h=mid-1;
            }
        }
        return -1;
    }
}