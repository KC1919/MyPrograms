class Solution {
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        
        boolean visited[][]=new boolean[n][m];
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    count++;
                    solve(grid,i,j,n,m,visited,dir);
                }
            }
        }
        return count;
    }
    
    private void solve(char a[][], int i, int j, int n, int m, boolean visited[][], int dir[][]){
        visited[i][j]=true;
        
        for(int k=0;k<dir.length;k++){
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==false && a[i][j]=='1'){
                solve(a,row,col,n,m,visited,dir);
            }
        }
        
    }
}