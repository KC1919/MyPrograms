class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int i=0, j=height.length-1;
        
        while(i<j)
        {
            int wid=j-i;
            int area=Math.min(height[i],height[j])*wid;
            max=Math.max(area,max);
            
            if(height[i]<height[j])i++;
            else j--;
        }
        return max;
    }
}