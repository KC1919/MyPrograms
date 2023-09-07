class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;

        if(k==n) return;
        if(k>n) k=k%n;

        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
    }

    public void rotate(int nums[], int start, int end){

        while(start<=end){
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;
            end--;
        }
    }
}