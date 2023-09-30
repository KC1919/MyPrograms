class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;

        if(n==1) return true;

        boolean incFlag=false, decFlag=false;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                if(decFlag==true) return false;
                incFlag=true;
            }
            else if(nums[i]<nums[i-1]){
                if(incFlag==true) return false;
                decFlag=true;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
        }
        return true;
    }
}