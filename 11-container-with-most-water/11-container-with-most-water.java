class Solution {
    public int maxArea(int[] a) {
        
        int left=0;
        int right=a.length-1;
        
        int max=0;
        int lh=a[left];
        int rh=a[right];
        
        while(left<right)
        {
            lh=a[left];
            rh=a[right];
            
            int wid=right-left;
            int area=Math.min(a[left],a[right])*wid;
            max=Math.max(max,area);
            
            if(lh<rh)
                while(left<right && a[left]<=lh)left++;
            
            else
                while(right>left && a[right]<=rh)right--;
        }
        return max;
    }
}