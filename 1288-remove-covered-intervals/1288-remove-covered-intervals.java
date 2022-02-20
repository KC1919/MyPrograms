class Solution {
    public int removeCoveredIntervals(int[][] a) 
    {
        if(a.length==1)
            return 1;
        
        Arrays.sort(a,(b,c)->{
            if(b[0]==c[0])
                return c[1]-b[1];
            
            else
                return b[0]-c[0];
        });
        
        int count=0;
        int start=a[0][0];
        int end=a[0][1];
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i][0]>=start && a[i][1]<=end)
            {
                count++;
                end=Math.max(end,a[i][1]);
            }
            else
            {
                start=a[i][0];
                end=a[i][1];
            }
        }
        return a.length-count;
    }
}