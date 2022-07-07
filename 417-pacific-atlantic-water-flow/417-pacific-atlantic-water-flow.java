class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] a) {
        
        int n=a.length;
        int m=a[0].length;
        
        int pacific[][]=new int[n][m];
        int atlantic[][]=new int[n][m];
        
        //filling borders of pacific
        for(int col=0;col<m;col++){
            pacific[0][col]=1;
        }
        
        for(int row=0;row<n;row++){
            pacific[row][0]=1;
        }
        
        
        //filling of borders of atlantic
        for(int col=0;col<m;col++){
            atlantic[n-1][col]=1;
        }
        
        for(int row=0;row<n;row++){
            atlantic[row][m-1]=1;
        }
        
        
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        boolean visited[][]=new boolean[n][m];
        
        // Pacific flow
        for(int col=0;col<m;col++){
            flow(a,0,col,n,m,pacific,visited,dir);
        }
        
        for(int row=0;row<n;row++){
            flow(a,row,0,n,m,pacific,visited,dir);
        }
        
        visited=new boolean[n][m];
        
        // Atlantic flow
        for(int col=0;col<m;col++){
            flow(a,n-1,col,n,m,atlantic,visited,dir);
        }
        
        for(int row=0;row<n;row++){
            flow(a,row,m-1,n,m,atlantic,visited,dir);
        }
        
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(atlantic[i][j]==1 && pacific[i][j]==1){
                    List<Integer>list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;
    }
    
    private void flow(int a[][], int i, int j, int n, int m, int water[][], boolean visited[][], int dir[][])
    {
        visited[i][j]=true;
        
        for(int k=0;k<4;k++){
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==false && a[row][col]>=a[i][j])
            {
                water[row][col]=1;
                flow(a,row,col,n,m,water,visited,dir);
            }
        }
    }
}