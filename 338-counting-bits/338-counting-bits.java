class Solution {
    public int[] countBits(int n) 
    {
        int ans[]=new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            int res=binary(i);
            ans[i]=res;
        }
        return ans;
    }
    
    public int binary(int n)
    {
        int rem=0, num=n, count=0;
        
        while(num>0)
        {
            rem=num%2;
            if(rem==1)
                count++;
            
            num=num/2;
        }
        return count;
    }
}