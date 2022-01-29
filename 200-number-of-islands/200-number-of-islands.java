class Solution {
    public int numIslands(char[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        
        boolean visited[][]=new boolean[n][m];
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!='0' && visited[i][j]==false)
                {
                    ArrayList<Character>list=new ArrayList<>();
                    component(grid,i,j,visited,list);
                    if(list.size()>0)
                        count++;
                }
            }
        }
        
        return count;
        
    }
    
    public void component(char grid[][],int i, int j, boolean visited[][],ArrayList<Character>list)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]==true || grid[i][j]=='0')
            return;
        
        visited[i][j]=true;
        list.add(grid[i][j]);
        
        component(grid,i+1,j,visited,list);
        component(grid,i,j+1,visited,list);
        component(grid,i-1,j,visited,list);
        component(grid,i,j-1,visited,list);
    }
}