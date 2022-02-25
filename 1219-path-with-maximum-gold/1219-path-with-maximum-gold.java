class Solution {
    
    public int maxi=0;
    public int getMaximumGold(int[][] a) 
    {
        int n=a.length;
        int m=a[0].length;
        
        maxi=0;
        
        boolean visited[][]=new boolean[n][m];
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=0)
                solve(a,i,j,n,m,visited,dir);
            }
        }
        return maxi;
    }
    
    public int solve(int a[][], int i, int j, int n, int m, boolean visited[][], int dir[][])
    {
        if(i<0 || i>=n || j<0 || j>=m || a[i][j]==0 || visited[i][j]==true)
            return 0;
        
        int max=0;
        visited[i][j]=true;
        
        for(int k=0;k<dir.length;k++)
        {
            int row=i+dir[k][0];
            int col=j+dir[k][1];
            
            if(row>=0 && row<n && col>=0 && col<m)
                max=Math.max(max,solve(a,row,col,n,m,visited,dir));
        }
        
        visited[i][j]=false;
        
        max+=a[i][j];
        maxi=Math.max(maxi,max);
        
        return max;
    }
}