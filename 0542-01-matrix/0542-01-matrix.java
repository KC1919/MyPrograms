class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;

        int ans[][]=new int[n][m];

        boolean visited[][]=new boolean[n][m];

        Queue<int[]>que=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    que.add(new int[]{i,j});
                }
            }
        }

        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

        int level=0;

        while(que.size()>0){
            int size=que.size();
            level++;   
            while(size-->0){
                int p[]=que.remove();
    
                for(int k=0;k<4;k++){
                    int row=dir[k][0]+p[0];
                    int col=dir[k][1]+p[1];

                    if(row>=0 && col>=0 && row<n && col<m && visited[row][col]==false && mat[row][col]==1){
                        que.add(new int[]{row,col});
                        ans[row][col]=level;
                        visited[row][col]=true;

                    }
                }
            }
        }

        return ans;
    }
}