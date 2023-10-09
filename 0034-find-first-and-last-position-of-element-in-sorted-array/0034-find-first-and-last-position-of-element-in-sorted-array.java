class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int lidx=leftsearch(nums,0,nums.length-1,target);
        int ridx=rightsearch(nums,0,nums.length-1,target);

        return new int[]{lidx,ridx};
    }

    private int leftsearch(int nums[], int start, int end, int target){

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]<target) start=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else{
                if(mid>0 && nums[mid-1]==target) end=mid-1;
                else return mid;
            } 
        }
        return -1;
    }

    private int rightsearch(int nums[], int start, int end, int target){

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]<target) start=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else{
                if(mid<nums.length-1 && nums[mid+1]==target) start=mid+1;
                else return mid;
            } 
        }
        return -1;
    }
}