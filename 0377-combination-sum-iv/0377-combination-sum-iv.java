class Solution {
    public int combinationSum4(int[] nums, int target) {
        // Arrays.sort(nums);
        Integer dp[][]=new Integer[nums.length][target+1];
        return combinations(nums,0,0,target,dp);
    }

    public int combinations(int nums[], int idx, int sum, int target, Integer dp[][]){
        
        if(sum==target)
            return 1;

        if(idx==nums.length) 
            return 0;

        if(dp[idx][sum]!=null)
            return dp[idx][sum];

        int res=0;

        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=target){
                res+=combinations(nums,i,sum+nums[i],target,dp);
            }
        }
        return dp[idx][sum]=res;
    }
}