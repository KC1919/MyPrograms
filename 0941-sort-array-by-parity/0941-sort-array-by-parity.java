class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n=nums.length;
        int i=0, j=0, k=n-1;

        while(i<=k){
            if(nums[i]%2==0){
                i++;
                j++;
            }
            else{
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k--;
            }
        }
        return nums;
    }
}