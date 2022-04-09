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
            maxSum=Math.max(maxSum, currMaxSum);
            
            currMinSum=Math.min(currMinSum + a[i], a[i]);
            minSum=Math.min(minSum, currMinSum);
        }
        
        if(minSum==sum)
            return maxSum;
        
        return Math.max(maxSum,sum-minSum);
    }
}