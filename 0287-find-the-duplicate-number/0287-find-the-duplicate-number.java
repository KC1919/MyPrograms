class Solution {
    public int findDuplicate(int[] nums) {
        int idx=0;

        for(int i=0;i<nums.length;i++){
            int elem=nums[i];
            if(nums[Math.abs(elem)-1]<0)
                return Math.abs(nums[i]);
            
            nums[Math.abs(elem)-1]*=-1;
        }

        return -1;
    }
}