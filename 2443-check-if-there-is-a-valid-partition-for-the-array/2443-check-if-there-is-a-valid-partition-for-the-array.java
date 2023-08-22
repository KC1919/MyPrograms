class Solution {
    public boolean validPartition(int[] nums) {
        
        Boolean dp[]=new Boolean[nums.length];

        return partition(nums,0,nums.length,dp);
    }

    public boolean partition(int nums[], int idx, int len, Boolean dp[]){

        if(len==0){
            return true;
        }

        if(dp[idx]!=null){
            return dp[idx];
        }

        boolean ans=false;

        if(idx+1<nums.length){
            if(nums[idx]==nums[idx+1]){
                ans=partition(nums,idx+2,len-2,dp);

                if(ans==true){
                    return dp[idx]=true;
                }
            }
        }

        if(idx+2<nums.length){
            if(nums[idx]+1==nums[idx+1] && nums[idx+1]+1==nums[idx+2]){
                ans=partition(nums,idx+3,len-3,dp);
                if(ans==true){
                    return dp[idx]=true;
                }
            }

            if(nums[idx]==nums[idx+1] && nums[idx+1]==nums[idx+2]){
                ans=partition(nums,idx+3,len-3,dp);
                if(ans==true){
                    return dp[idx]=true;
                }
            }
        }

        return dp[idx]=false;
    }
}