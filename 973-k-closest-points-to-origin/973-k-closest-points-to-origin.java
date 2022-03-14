class Solution {
    
    class Pair
    {
        double dist;
        int ind;
        
        Pair(int ind, double dist)
        {
            this.ind=ind;
            this.dist=dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) 
    {
        Pair dp[]=new Pair[points.length];
        
        for(int i=0;i<points.length;i++)
        {
            int x=points[i][0];
            int y=points[i][1];
            
            double dist=Math.sqrt((int)Math.pow(x-0,2)+(int)Math.pow(y-0,2));
            
            dp[i]=new Pair(i,dist);
        }
        
        Arrays.sort(dp,(a,b)->{
            if((int)a.dist==(int)b.dist)
            {
                double d1=a.dist-(int)a.dist;
                double d2=b.dist-(int)b.dist;
                
                if(d1<d2)
                    return -1;
                else if(d1>d2)
                    return 1;
                else
                    return 0;
            }
            else
                return (int)a.dist-(int)b.dist;
        });
        
        int ans[][]=new int[k][2];
        
        for(int i=0;i<k;i++)
        {
            ans[i][0]=points[dp[i].ind][0];
            ans[i][1]=points[dp[i].ind][1];
        }
        return ans;
    }
}