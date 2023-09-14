class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        
        int lmax=height[0];
        int rmax=height[n-1];
        int water=0;

        int l=0, r=n-1;

        while(l<=r){

            if(lmax<=rmax){
                if(height[l]<lmax){
                    water+=(lmax-height[l]);
                }
                else{
                    lmax=height[l];
                }
                l++;
            }

            else{
                if(height[r]<rmax){
                    water+=(rmax-height[r]);
                }
                else{
                    rmax=height[r];
                }
                r--;
            }
        }
        return water;
    }
}