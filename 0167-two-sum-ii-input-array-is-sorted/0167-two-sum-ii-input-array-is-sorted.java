class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;

        int ans[]=new int[2];

        for(int i=0;i<n;i++){
            int remSum=target-nums[i];

            if(remSum>=nums[i]){
                int idx=bsearch(nums,i+1,remSum);

                if(idx!=-1){
                    ans[0]=i+1;
                    ans[1]=idx+1;
                    break;
                }
            }
            else break;
        }
        return ans;
    }

    private int bsearch(int nums[], int l, int target){

        int h=nums.length-1;

        while(l<=h){
            int mid=(l+h)/2;

            if(nums[mid]==target) return mid;

            else if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}