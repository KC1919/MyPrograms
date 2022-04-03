class Solution {
    class Pair
    {
        int prev;
        int curr;
        
        Pair(int prev, int curr)
        {
            this.prev=prev;
            this.curr=curr;
        }
    }
    
    public int maxProduct(int[] a) {
        
        int max=0;
        
        Pair dp[]=new Pair[a.length];
        
        dp[0]=new Pair(0,a[0]);
        max=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            Pair p=dp[i-1];
            if(p.prev<0 && p.curr<0)
            {
                int prev=Math.min(p.prev,p.curr)*a[i];
                dp[i]=new Pair(prev,a[i]);
            }
            
            else if((p.prev<0 && p.curr>0) || (p.prev>0 && p.curr<0))
            {
                dp[i]=new Pair(p.prev*a[i],p.curr*a[i]);
            }
            
            else if(p.prev==0 || p.curr==0)
            {
                if(p.prev==0 && p.curr==0)
                    dp[i]=new Pair(a[i],a[i]);
                
                else if(p.prev==0)
                    dp[i]=new Pair(p.curr*a[i],a[i]);
                
                else if(p.curr==0)
                    dp[i]=new Pair(p.prev*a[i],a[i]);
                    
            }
            else
            {
                dp[i]=new Pair(p.prev*a[i],p.curr*a[i]);
            }
            
            max=Math.max(max,Math.max(dp[i].curr,dp[i].prev));
        }
        return max;
    }
}