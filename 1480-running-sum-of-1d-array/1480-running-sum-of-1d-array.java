class Solution {
    public int[] runningSum(int[] nums) {
        
        int a[]=new int[nums.length];
        
        int presum=0;
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i]+presum;
            presum+=nums[i];
        }
        
        return a;
    }
}