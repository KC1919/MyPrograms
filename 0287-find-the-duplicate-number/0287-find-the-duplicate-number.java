class Solution {
    public int findDuplicate(int[] nums) {
        int idx=0;

        while(idx<nums.length){
            int placeToGo=nums[idx];

            if(nums[placeToGo]==nums[idx]) 
                return nums[idx];
            
            int temp=nums[idx];
            nums[idx]=nums[placeToGo];
            nums[placeToGo]=temp;
        }
        return -1;
    }
}