class Solution 
{
    class Pair
    {
        int count;
        int row;
        Pair(int count, int row)
        {
            this.count=count;
            this.row=row;
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.count==b.count)
                return b.row-a.row;
            return b.count-a.count;});
        
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                    c++;
                else
                    break;
            }
            
            pq.add(new Pair(c,i));
            if(pq.size()>k)
                pq.remove();
        }
        
        int res[]=new int[k];
        int p=k-1;
        
        while(pq.size()>0)
            res[p--]=pq.remove().row;
        
        return res;
    }
}