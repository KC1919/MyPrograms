class Solution {
    public int jump(int[] a) {
        
        if(a.length==1)
            return 0;
        
        int n=a.length;
        
        Integer dp[]=new Integer[n];
        findMin(a,0,dp);
        return dp[0]-1;
    }
    
    private int findMin(int a[], int idx, Integer dp[]){
        
        if(idx==a.length-1)
            return dp[idx]=1;
        
        if(idx>=a.length)
            return Integer.MAX_VALUE;
        
        if(dp[idx]!=null)
            return dp[idx];
        
        int min=Integer.MAX_VALUE;
        for(int jump=1;jump<=a[idx];jump++){
            
            int res=findMin(a,idx+jump,dp);
            
            min=Math.min(res,min);
        }
        
        dp[idx]=min==Integer.MAX_VALUE?min:min+1;
        return dp[idx];
    }
}