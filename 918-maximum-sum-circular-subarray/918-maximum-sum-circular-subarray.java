class Solution {
    public int maxSubarraySumCircular(int[] a) {
        
        int currMaxSum=a[0];
        int currMinSum=a[0];
        int maxSum=a[0];
        int minSum=a[0];
        
        int sum=0;
        
        int n=a.length;
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        for(int i=1;i<n;i++)
        {
            currMaxSum=Math.max(currMaxSum + a[i], a[i]);
            maxSum=Math.max(maxSum, currMaxSum); //maximum subarray sum
            
            currMinSum=Math.min(currMinSum + a[i], a[i]);
            minSum=Math.min(minSum, currMinSum);  //minimum subarray sum
        }
        
        if(minSum==sum)  //if all the elements are negative
            return maxSum;  //we return the smallest negative elment that would be stored in maxSum
        
        return Math.max(maxSum,sum-minSum); //else we return greater among the normal max subarray sum and circular max subarray sum.
    }
}