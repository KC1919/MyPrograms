class Solution {
    public int rob(int[] a) {
        
        int n=a.length;
        
        int incl=0, excl=0;
        
        for(int i=0;i<n;i++){
            
            int nincl=excl+a[i];
            int nexcl=Math.max(incl,excl);
            
            incl=nincl;
            excl=nexcl;
        }
        return Math.max(incl,excl);
    }
}