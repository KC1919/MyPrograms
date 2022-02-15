class Solution 
{    
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
        
        Queue<Pair>que=new LinkedList<>();
        
        outer:for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==false && a[i][j]==1)
                {
                    component(a,i,j,n,visited,que);
                    break outer;
                }
            }
        }
        
        int min=0;
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        
        while(que.size()>0)
        {
            int size=que.size();
            
            while(size-->0)
            {
                Pair rem=que.remove();
                
                for(int i=0;i<dir.length;i++)
                {
                    int row=rem.row+dir[i][0];
                    int col=rem.col+dir[i][1];
                    
                    if(row>=0 && row<n && col>=0 && col<n && visited[row][col]==false)
                    {
                        if(a[row][col]==1)
                            return min;
                        
                        que.add(new Pair(row,col));
                        visited[row][col]=true;
                    }
                }
            }
            min++;
        }
        return min;
    }
    
    
    public void component(int a[][], int i, int j, int n, boolean visited[][], Queue<Pair>que)
    {
        if(i<0 || j<0 || i>=n || j>=n || visited[i][j]==true || a[i][j]==0)
            return;
        
        visited[i][j]=true;
        que.add(new Pair(i,j));
        
        component(a,i-1,j,n,visited,que);
        component(a,i+1,j,n,visited,que);
        component(a,i,j-1,n,visited,que);
        component(a,i,j+1,n,visited,que);
    }
}