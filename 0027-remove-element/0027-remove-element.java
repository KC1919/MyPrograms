class Solution {
    public int removeElement(int[] nums, int val) {

        int j=-1;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                if(j!=-1 && nums[j]==val){
                    continue;
                }
                else{
                    j=i;
                }
            }
            else{
                if(j<i && j!=-1){
                    nums[j]=nums[i];
                    nums[i]=val;
                    j++;
                }
            }
        }
        return nums.length-count;
    }
}