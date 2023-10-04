class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int i=0, j=height.length-1;
        int lh=height[i];
        int rh=height[j];
        
        while(i<j)
        {
            lh=height[i];
            rh=height[j];
            
            int wid=j-i;
            int area=Math.min(lh,rh)*wid;
            max=Math.max(area,max);
            
            if(lh<rh)
                while(i<j && height[i]<=lh)i++;
            
            else
                while(j>i && height[j]<=rh)j--;
        }
        return max;
    }
}