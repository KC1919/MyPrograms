class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int rg[]=new int[n];

        rg[n-1]=n;

        int maxRight=n-1;

        for(int i=n-2;i>=0;i--){
            if(height[i]>height[maxRight]){
                rg[i]=n;
                maxRight=i;
            }
            else{
                rg[i]=maxRight;
            }
        }

        int lg[]=new int[n];
        lg[0]=-1;

        int maxLeft=0;

        for(int i=1;i<n;i++){
            if(height[i]>height[maxLeft]){
                lg[i]=-1;
                maxLeft=i;
            }
            else{
                lg[i]=maxLeft;
            }
        }

        int water=0;

        for(int i=0;i<n;i++){
            if(lg[i]==-1 || rg[i]==n)
                continue;
            
            int units=Math.min(height[rg[i]],height[lg[i]])-height[i];

            water+=units;
        }

        return water;
    }
}