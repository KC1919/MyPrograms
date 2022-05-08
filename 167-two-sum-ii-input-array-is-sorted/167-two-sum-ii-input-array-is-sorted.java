class Solution {
    public int[] twoSum(int[] a, int target) {
        
        int left=0, right=a.length-1;
        
        while(left<right)
        {
            if(a[left]+a[right]==target)
                return new int[]{left+1,right+1};
            
            else if(a[left]+a[right]>target)
                right--;
            
            else if(a[left]+a[right]<target)
                left++;
        }
        return new int[0];
    }
}