class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        
        Queue<int[]>que=new LinkedList<>();
        
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        
        int a[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    que.add(new int[]{i,j});
                }
            }
        }
        
        int distance=0;
        
        while(que.size()>0){
            
            int size=que.size();
            distance++;
            
            while(size-->0){
                
                int rem[]=que.remove();
                
                for(int k=0;k<4;k++){
                    int row=dir[k][0]+rem[0];
                    int col=dir[k][1]+rem[1];
                    
                    if(row>=0 && col>=0 && row<n && col<m && mat[row][col]==1){
                        mat[row][col]=-1;
                        a[row][col]=distance;
                        que.add(new int[]{row,col});
                    }
                }
            }
        }
        return a;
    }
}