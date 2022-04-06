class Solution {
    public int[] productExceptSelf(int[] a) {
        int n=a.length;
        int pre[]=new int[n];
        int post[]=new int[n];
        
        int prefix=1;
        
        for(int i=0;i<n;i++)
        {
            pre[i]=prefix;
            prefix*=a[i];
        }
        
        int postfix=1;
        
        for(int i=n-1;i>=0;i--)
        {
            post[i]=postfix;
            postfix*=a[i];
        }
        
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ans[i]=pre[i]*post[i];
        }
        
        return ans;
    }
}