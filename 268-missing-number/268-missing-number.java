class Solution {
    public int missingNumber(int[] a) 
    {
        int n=a.length;
        
        int sum=0;
        
        for(int e:a)
            sum+=e;
        
        int rs=(n*(n+1))/2;
            
        
        return rs-sum;
    }
}