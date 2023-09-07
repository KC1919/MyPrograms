class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        int j=0;
        int n=nums.length;

        while(i<n){

            while(i<n && nums[i]==nums[j]){
                i++;
            }
            j++;

            if(i<n)
                nums[j]=nums[i];
        }
        return j;
    }
}