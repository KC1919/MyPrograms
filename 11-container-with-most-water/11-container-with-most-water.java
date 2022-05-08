class Solution {
    public int maxArea(int[] a) {
        
        int left=0;
        int right=a.length-1;
        
        int max=0;
        
        while(left<right)
        {
            int wid=right-left;
            int area=Math.min(a[left],a[right])*wid;
            max=Math.max(max,area);
            
            if(a[left]<=a[right])left++;
            
            else
                right--;
        }
        return max;
    }
}