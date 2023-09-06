class Solution {
    public int majorityElement(int[] nums) {
        
        int cand=0;
        int count=0;

        for(int i=0;i<nums.length;i++){

            if(count==0){
                cand=nums[i];
            }

            if(nums[i]==cand){
                count++;
            }
            else{
                count--;
            }
        }

        return cand;
    }
}