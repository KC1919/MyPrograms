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
        //custom max heap PQ based on the distance from the origin
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if((int)a.dist==(int)b.dist)
            {
                //extracting the decimal part of both the values
                double d1=a.dist-(int)a.dist;
                double d2=b.dist-(int)b.dist;
                
                //checking if the a's decimal part is amller or grater than b's decimal part
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
            
            //calculating the distance of every point from the  origin
            double dist=Math.sqrt((int)Math.pow(x-0,2)+(int)Math.pow(y-0,2));
            
            if(pq.size()<k){
                pq.add(new Pair(i,dist));
            }
            
            else if(pq.size()==k){
                
                if(pq.peek().dist>dist){
                    pq.add(new Pair(i,dist));
                    pq.remove();
                }
            }
        }

        int ans[][]=new int[k][2];
        
        for(int i=0;i<k;i++)
        {
            Pair rem=pq.remove();
            ans[i][0]=points[rem.ind][0];
            ans[i][1]=points[rem.ind][1];
        }
        return ans;
    }
}