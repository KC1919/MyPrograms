class Solution {
    public int maxProfit(int[] a) {
        
        int max=0;
        int min=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            min=Math.min(a[i],min);
            max=Math.max(max,a[i]-min);
        }
        return max;
    }
}