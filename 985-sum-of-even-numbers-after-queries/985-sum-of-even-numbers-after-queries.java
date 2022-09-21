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
            
            // if the value at ith index is already even, means it is included
            // in the evenSum, hence we remove it from the evenSum because its
            // value is going to be updated and we dont know whether it will
            // become even or odd after updation
            if(nums[idx]%2==0){
                evenSum-=nums[idx];
            }
            
            //updating the value with the query's value
            nums[idx]+=val;
            
            
            //then checking if the value became even after updating, so we add
            //it to our evenSum, else we do not add
            if(nums[idx]%2==0){
                evenSum+=nums[idx];
            }
            
            // wee store the evenSum after each query
            ans[i]=evenSum;
        }
        
        return ans;
    }
}