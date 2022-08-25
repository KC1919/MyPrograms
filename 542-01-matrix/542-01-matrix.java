class Solution {
    
    class Pair
    {
        int i;
        int j;
        
        Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }
    
    public int[][] updateMatrix(int[][] a) {
        
        Queue<Pair>que=new LinkedList<>();
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    que.add(new Pair(i,j));
                }
            }
        }
        
        int dp[][]=new int[n][m];
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(que.size()>0){
            int size=que.size();
            
            while(size-->0){
                
                Pair rem=que.remove();
                
                for(int k=0;k<4;k++){
                    int row=dir[k][0]+rem.i;
                    int col=dir[k][1]+rem.j;
                    
                    if(row>=0 && row<n && col>=0 && col<m && a[row][col]==1 && dp[row][col]==0){
                        dp[row][col]=dp[rem.i][rem.j]+1;
                        
                        que.add(new Pair(row,col));
                    }
                }
            }
        }
        
        return dp;
    }
}