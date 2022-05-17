class Solution {
    
    class Pair
    {
        int row;
        int col;
        int level=0;
    }
    
    public int shortestPathBinaryMatrix(int[][] a) {
        
        if(a[0][0]==1)
            return -1;
        
        if(a.length==1 && a[0][0]==0)
            return 1;
        
        int dir[][]={{0,-1},{0,1},{-1,0},{1,0},{-1,-1},{1,-1},{-1,1},{1,1}};
        
        int n=a.length;
        
        boolean visited[][]=new boolean[n][n];
        
        Queue<Pair>que=new LinkedList<>();
        
        Pair p=new Pair();
        
        p.row=0;
        p.col=0;
        p.level=1;
        
        que.add(p);
        
        int level=0;
        while(que.size()>0){
            
            Pair rem=que.remove();
            
            visited[rem.row][rem.col]=true;
            
            for(int i=0;i<dir.length;i++){
                
                int row=dir[i][0]+rem.row;
                int col=dir[i][1]+rem.col;
                
                if(row==n-1 && col==n-1 && a[row][col]==0){
                    return rem.level+1;
                }
                
                else if(row>=0 && row<n && col>=0 && col<n && visited[row][col]==false && a[row][col]==0)
                {
                    visited[row][col]=true;
                    Pair np=new Pair();
                    np.row=row;
                    np.col=col;
                    np.level=rem.level+1;
                    que.add(np);
                }
            }
        }
        return -1;
    }
}