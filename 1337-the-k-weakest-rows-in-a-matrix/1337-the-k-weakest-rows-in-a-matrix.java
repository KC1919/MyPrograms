class Solution {
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
            int c1=a.count, i1=a.row;
            int c2=b.count, i2=b.row;
            
            if(c1==c2)
                return b.row-a.row;
            return b.count-a.count;});
        
        
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            int j=0, m=mat[i].length-1;
            
            while(j<=m && mat[i][j]!=mat[i][m])
            {
                c++;
                m--;
                j++;
            }
            if(mat[i][j]==0)
                pq.add(new Pair(c,i));
            else if(mat[i][m]==1)
                pq.add(new Pair(m+1,i));
            
            if(pq.size()>k)
                pq.remove();
        }
        
        int res[]=new int[k];
        int p=k-1;
        
        while(pq.size()>0)
        {
            res[p--]=pq.remove().row;
        }
        
        return res;
    }
}