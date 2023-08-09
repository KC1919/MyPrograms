class Solution {
    public int minimizeMax(int[] nums, int p) {

        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=nums[n-1]-nums[0];

        int max=0;

        while(left<=right){
            int mid=(left+right)/2;

            if(isPossible(nums,p,mid)){
                max=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return max;
    }

    public boolean isPossible(int a[], int p, int diff){

        for(int i=1;i<a.length;i++){
            if(a[i]-a[i-1]<=diff){
                p--;
                i++;
            }

            if(p==0){
                return true;
            }
        }
        return false;
    }
}