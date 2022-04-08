class Solution {
    public int maximumDifference(int[] a) {
        
        int max=-1, min=a[0];
        
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<=min)
                min=a[i];
    
            else if(a[i]-min>max)
                max=Math.max(a[i]-min,max);
        }
        
        return max;
    }
}