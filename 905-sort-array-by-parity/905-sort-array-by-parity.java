class Solution {
    public int[] sortArrayByParity(int[] a) 
    {
        int n=a.length;
        int ans[]=new int[n];
        
        int ev=0, od=n-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                ans[ev++]=a[i];
            
            else
                ans[od--]=a[i];
        }
        
        return ans;
    }
}