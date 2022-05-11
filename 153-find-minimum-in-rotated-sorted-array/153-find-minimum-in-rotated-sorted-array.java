class Solution {
    public int findMin(int[] a) {
        
        int l=0, h=a.length-1, mid=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            //we check if the element at left index is smaller than the element at
            //mid index, means the part from left to mid is sorted
            if(a[l]<=a[mid]){
                
                //so we check if the element at left  index is greater than the 
                //element at right index, means the element cannot be in this part
                //so we discard this half and move to the right half of the array
                if(a[l]>a[h])
                    l=mid+1;
                
                //else if the element at lower index is smaller than the element at right
                //index, that means the whole part is sorted and the left index
                //is the smallest element so we return it.
                else
                    return a[l];
            }
            
            //if the element at left index is greater than the element at mid index
            //that means the element is between the left index and the mid index
            //so we shift the right pointer to the mid index
            else
                h=mid;
        }
        return a[l];
    }
}