class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int evenSum=0;
        
        for(int ele:nums){
            if(ele%2==0){
                evenSum+=ele;
            }
        }
        
        int ans[]=new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            int val=queries[i][0];
            int idx=queries[i][1];
            
            int newVal=nums[idx]+val;
            
            if(newVal%2==0){
                if(nums[idx]%2==0){
                    evenSum-=nums[idx];
                    evenSum+=newVal;
                }
                else{
                    evenSum+=newVal;
                }
            }
            
            else{
                if(nums[idx]%2==0){
                    evenSum-=nums[idx];
                }
            }
            
            nums[idx]=newVal;
            ans[i]=evenSum;
        }
        
        return ans;
    }
}