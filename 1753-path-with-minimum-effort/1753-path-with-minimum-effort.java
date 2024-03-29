class Solution {

    class Pair{
        int weight;
        int row;
        int col;

        Pair(int row, int col, int weight){
            this.row=row;
            this.col=col;
            this.weight=weight;
        }
    }
    public int minimumEffortPath(int[][] height) {
        
        int n=height.length;
        int m=height[0].length;

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            return a.weight-b.weight;
        });

        int dir[][]={{0,1},{0,-1},{-1,0},{1,0}};
        boolean vis[][]=new boolean[n][m];

        int dp[][]=new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

        pq.add(new Pair(0,0,0));
        dp[0][0]=0;

        while(pq.size()>0){
            Pair rem=pq.remove();

            if(vis[rem.row][rem.col]==true)
                continue;

            vis[rem.row][rem.col]=true;

            if(rem.row==n-1 && rem.col==m-1)
                return rem.weight;

            for(int k=0;k<4;k++){
                int row=dir[k][0]+rem.row;
                int col=dir[k][1]+rem.col;

                if(row>=0 && col>=0 && row<n && col<m && vis[row][col]==false){
                    int effort=Math.abs(height[row][col]-height[rem.row][rem.col]);
                    int maxEffort=Math.max(effort,rem.weight);
                    if(maxEffort<dp[row][col]){
                        pq.add(new Pair(row,col,Math.max(effort,rem.weight)));
                        dp[row][col]=maxEffort;
                    }
                }
            }
        }
        return -1;
    }
}