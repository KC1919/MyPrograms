class Solution {
    public int maxProfit(int[] a) 
    {
        int n=a.length;
        
        if(n==0 || n==1)
            return 0;
        
        int min=a[0], max=0;
        
        for(int i=1;i<n;i++)
        {
            if(a[i]<=min)
            {
                min=a[i];
            }
            else
            {
                int profit=a[i]-min;
                max=Math.max(max,profit);
            }
        }
        
        return max;
    }
}