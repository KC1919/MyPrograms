class Solution {
    public int rob(int[] a) {
        
        int n=a.length;
        
        int res1=robb(a,0,n-1);
        int res2=robb(a,1,n);
        
        return Math.max(a[0],Math.max(res1,res2));
    }
    
    private int robb(int a[], int l, int h){
        
        int incl=0, excl=0;
        
        for(int i=l;i<h;i++){
            
            int nincl=excl+a[i];
            int nexcl=Math.max(incl,excl);
            
            incl=nincl;
            excl=nexcl;
        }
        return Math.max(incl,excl);
    }
}