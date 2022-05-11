class Solution {
    public int findMin(int[] a) {
        
        int l=0, h=a.length-1, mid=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            if(a[l]<=a[mid]){
                
                if(a[l]>a[h])
                    l=mid+1;
                
                else
                    return a[l];
            }
            else
                h=mid;
        }
        return a[l];
    }
}