class Solution {
    
    class Pair
    {
        int row;
        int col;
        
        Pair(int row, int col)
        {   
            this.row=row;
            this.col=col;
        }
    }
    
    public int shortestBridge(int[][] a) 
    {
        int n=a.length;
        
        boolean visited[][]=new boolean[n][n];
        
        List<List<Pair>>res=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==false && a[i][j]==1)
                {
                    List<Pair>comp=new ArrayList<>();
                    component(a,i,j,n,visited,comp);
                    res.add(comp);
                }
            }
        }
        
        int min=getDistance(res.get(0), res.get(1));
        return min;
    }
    
    public int getDistance(List<Pair>l1, List<Pair>l2)
    {
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<l1.size();i++)
        {
            Pair p=l1.get(i);
            for(int j=0;j<l2.size();j++)
            {
                Pair p1=l2.get(j);
                int rd=Math.abs(p.row-p1.row);
                int cd=Math.abs(p.col-p1.col);
                int td=rd+cd;
                
                if(td<min)
                {
                    min=td;
                }
            }
        }
        return min-1;
    }
    
    public void component(int a[][], int i, int j, int n, boolean visited[][], List<Pair>comp)
    {
        if(i<0 || j<0 || i>=n || j>=n || visited[i][j]==true || a[i][j]==0)
            return;
        
        visited[i][j]=true;
        comp.add(new Pair(i,j));
        
        component(a,i-1,j,n,visited,comp);
        component(a,i+1,j,n,visited,comp);
        component(a,i,j-1,n,visited,comp);
        component(a,i,j+1,n,visited,comp);
    }
}