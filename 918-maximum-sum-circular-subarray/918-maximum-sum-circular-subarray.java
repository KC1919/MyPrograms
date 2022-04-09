class Solution {
    public int maxSubarraySumCircular(int[] a) {
        
        int sum=0;
        int n=a.length;
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        int minSum=minSubSum(a,n);
        int maxSum=maxSubSum(a,n);
        
        if(minSum==sum)
        return maxSum;
        
        return Math.max(maxSum,sum-minSum);
        
    }
    
    int maxSubSum(int a[], int n)
    {
        int sum=0, max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            sum=Math.max(sum + a[i], a[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
    
    
    int minSubSum(int a[], int n)
    {
        int sum=a[0], min=a[0];
        
        for(int i=1;i<n;i++)
        {
            sum=Math.min(sum + a[i], a[i]);
            min = Math.min(min, sum);
        }
        return min;
    }
}