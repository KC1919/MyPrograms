class Solution {
    public void sortColors(int[] nums) {

        int i=0, j=0, k=nums.length-1;

        while(i<=k){

            if(nums[i]==0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                if(i==j)i++;
                j++;
            }

            else if(nums[i]==1){
                i++;
            }

            else if(nums[i]==2){
                int t=nums[i];
                nums[i]=nums[k];
                nums[k]=t;

                k--;
            }
        }
    }
}