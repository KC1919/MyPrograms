class Solution {
    
    class Pair
    {
        int diff;
        int len;
        
        Pair(int diff, int len)
        {
            this.diff=diff;
            this.len=len;
        }
    }
    public int numberOfArithmeticSlices(int[] a) 
    {
        if(a==null || a.length==0 || a.length==1)
            return 0;
        
        int max=0;
        
        Pair dp[]=new Pair[a.length];
        dp[0]=new Pair(0,1);
        dp[1]=new Pair(a[1]-a[0],2);
        
        int count=0;
        for(int i=2;i<a.length;i++)
        {
            int d=a[i]-a[i-1];
            
            if(d==dp[i-1].diff)
            {
                if(dp[i-1].len<3){
                    dp[i]=new Pair(d,dp[i-1].len+1);
                    if(dp[i].len==3)count+=1;
                }
                else if(dp[i-1].len>=3){
                    dp[i]=new Pair(d,dp[i-1].len+1);
                    count+=(1+dp[i].len-3);
                }
            }
            else
            {
                dp[i]=new Pair(a[i]-a[i-1],2);
            }
        }
        return count;
    }
}