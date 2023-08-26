class Solution {
    public int maxProduct(int[] nums) {
        
        int n=nums.length;
        int prod[][]=new int[n][2];

        prod[0][0]=prod[0][1]=nums[0];

        int max=nums[0];

        for(int i=1;i<n;i++){

            if(prod[i-1][0]==0 || prod[i-1][1]==0){
                prod[i][0]=prod[i][1]=nums[i];
                max=Math.max(max,Math.max(prod[i][1],prod[i][0]));
                continue;
            }

            if(nums[i]<0){

                if(prod[i-1][0]<0 && prod[i-1][1]<0){
                    prod[i][0]=nums[i];
                    prod[i][1]=nums[i]*prod[i-1][0];
                }
                else{
                    prod[i][0]=nums[i]*prod[i-1][0];
                    prod[i][1]=nums[i]*prod[i-1][1];
                }
            }
            else{

                if(prod[i-1][0]<0 && prod[i-1][1]<0){
                    prod[i][0]=prod[i-1][0]*nums[i];
                    prod[i][1]=nums[i];
                }

                else if(prod[i-1][1]==0){
                    prod[i][1]=nums[i];
                }

                else{
                    prod[i][0]=nums[i]*prod[i-1][0];
                    prod[i][1]=nums[i]*prod[i-1][1];
                }
            }
            max=Math.max(max,Math.max(prod[i][1],prod[i][0]));
        }
        return max;
    }
}