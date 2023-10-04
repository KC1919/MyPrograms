class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;

        int li=0;
        int ri=n-1;

        while(li<ri){

            int sum=nums[li]+nums[ri];
            if(sum==target){
                return new int[]{li+1,ri+1};
            }
            else if(sum<target) li++;

            else ri--;
        }
        return new int[]{li+1,ri+1};
    }
}