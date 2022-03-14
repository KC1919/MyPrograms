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
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if((int)a.dist==(int)b.dist)
            {
                double d1=a.dist-(int)a.dist;
                double d2=b.dist-(int)b.dist;
                
                if(d1<d2)
                    return 1;
                else if(d1>d2)
                    return -1;
                else
                    return 0;
            }
            else
                return (int)b.dist-(int)a.dist;
        });
        
        for(int i=0;i<points.length;i++)
        {
            int x=points[i][0];
            int y=points[i][1];
            
            double dist=Math.sqrt((int)Math.pow(x-0,2)+(int)Math.pow(y-0,2));
            
            pq.add(new Pair(i,dist));
            
            if(pq.size()>k)
                pq.remove();
        }
        
        int ans[][]=new int[k][2];
        
        for(int i=0;i<k;i++)
        {
            Pair p=pq.remove();
            ans[i][0]=points[p.ind][0];
            ans[i][1]=points[p.ind][1];
        }
        return ans;
    }
}