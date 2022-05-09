class Solution {
    public int maxProfit(int[] a) {
        
        int max=0;
        int min=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<=min)min=a[i];
            
            else
            max=Math.max(max,a[i]-min);
        }
        return max;
    }
}