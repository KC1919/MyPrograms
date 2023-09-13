class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int prod[]=new int[n];

        prod[0]=1;

        int prevProd=nums[0];
        for(int i=1;i<n;i++){
            prod[i]=prevProd;
            prevProd*=nums[i];
        }

        prevProd=1;

        for(int i=n-1;i>=0;i--){
            prod[i]=prod[i]*prevProd;
            prevProd*=nums[i];
        }

        return prod;
    }
}