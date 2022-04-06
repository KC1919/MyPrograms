class Solution {
    public int[] productExceptSelf(int[] a) {
        int n=a.length;
        int ans[]=new int[n];
        
        
        int prefix=1;
        
        for(int i=0;i<n;i++)
        {
            ans[i]=prefix;
            prefix*=a[i];
        }
        
        int postfix=1;
        
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=postfix;
            postfix*=a[i];
        }
        return ans;
    }
}