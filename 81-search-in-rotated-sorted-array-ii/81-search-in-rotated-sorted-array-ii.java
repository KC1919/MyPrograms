class Solution {
    public boolean search(int[] a, int target) 
    {
        int l=0, h=a.length-1;
        
        while(l<=h)
        {
            while (l < h && a[l] == a[l + 1])
                ++l;
            while (l < h && a[h] == a[h - 1])
                --h;
            
            int mid=(l+h)/2;
            
            if(a[mid]==target)
            {
                return true;
            }
            
            else if(a[l]<=a[mid])
            {
                if(target>=a[l] && target<a[mid])
                {
                    h=mid-1;
                }
                else
                    l=mid+1;
            }
            
            else
            {
                if(target>a[mid] && target<=a[h])
                {
                    l=mid+1;
                }
                else
                    h=mid-1;
            } 
        }
        return false;
    }
}