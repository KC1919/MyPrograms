class Solution {
    public int searchInsert(int[] a, int target) 
    {
        int l=0, h=a.length-1;
        int mid=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            if(target<a[mid])
                h=mid-1;
            
            else if(target>a[mid])
                l=mid+1;
            
            else
                return mid;
        }
        return l;
    }
}