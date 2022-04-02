class Solution {
    public int longestMountain(int[] a) {
        
        int lc=0, rc=0, max=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]>a[i-1])
            {
                if(rc!=0)
                {
                    lc=0;
                    rc=0;
                }
                lc++;
            }
            
            else if(i>0 && a[i]<a[i-1])
            {
                if(lc!=0)
                    rc++;
                else
                {
                    lc=0;
                    rc=0;
                }
            }
            else if(i>0 && a[i]==a[i-1])
            {
                lc=0;
                rc=0;
            }
            
            if(lc>0 && rc>0)
                max=Math.max(lc+rc+1,max);
        }
        return max<3?0:max;
    }
}