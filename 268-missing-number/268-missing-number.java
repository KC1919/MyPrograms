class Solution {
    public int missingNumber(int[] a) 
    {
        int n=a.length;
        
        int sum=0;
        
        for(int i=0;i<n;i++)
            sum+=a[i];
        
        int rs=(n*(n+1))/2;
        
        return rs-sum;
    }
}