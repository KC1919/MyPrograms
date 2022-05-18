class Solution {
    public int maxAreaOfIsland(int[][] a) {
        
        int n=a.length;
        int m=a[0].length;
        boolean visited[][]=new boolean[n][m];
        int count[]=new int[1];
        
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && a[i][j]==1){
                    count[0]=0;
                    component(a,i,j,n,m,visited,count,dir);
                    max=Math.max(count[0],max);
                }
            }
        }
        return max;
    }
    
    public void component(int a[][], int i, int j, int n, int m, boolean visited[][], int count[], int dir[][])
    {
        visited[i][j]=true;
        count[0]++;
        
        for(int k=0;k<dir.length;k++){
            
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==false && a[row][col]==1)
            {
                component(a,row,col,n,m,visited,count,dir);    
            }
        }
    }
}