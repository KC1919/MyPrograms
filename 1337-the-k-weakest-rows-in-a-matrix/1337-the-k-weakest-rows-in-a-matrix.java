class Solution 
{
    public int[] kWeakestRows(int[][] mat, int k) 
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
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            int c1=a.count;
            int c2=b.count;
            
            if(c1==c2)
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