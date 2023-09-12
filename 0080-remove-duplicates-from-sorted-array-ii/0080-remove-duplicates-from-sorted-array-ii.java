// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//         int count=1;
//         int j=1;

//         for(int i=1;i<nums.length;){

//             if(nums[i]==nums[i-1]){
//                 count++;

//                 if(count<=2){

//                     if(j!=i){
//                         nums[j]=nums[i];
//                     }
//                     j++;
//                     i++;
//                 }
//                 else if(count>2){
//                     i++;
//                 }
//             }
//             else{
//                 count=1;
//                 nums[j++]=nums[i];
//                 i++;
//             }
//         }

//         if(count==2){
//             nums[j-1]=nums[nums.length-1];
//         }

//         return j;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
    for(int n : nums)
    {
        if (i < 2 || n > nums[i-2])
            nums[i++] = n;
    }
    return i;
    }
}