class Solution {
    public int orangesRotting(int[][] a) {
        
        Queue<Integer>que=new LinkedList<>();
        
        int n=a.length;
        int m=a[0].length;
        
        int oc=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==2){
                    int idx=(i*m) + j;
                    
                    // System.out.println(idx+" ");
                    que.add(idx);
                }
                
                else if(a[i][j]==1)
                    oc++;
            }
        }
        
        if(oc==0)
            return 0;
        
        int time=0;
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        while(que.size()>0){
            
            int size=que.size();
            int flag=0;
            
            while(size-->0){
                flag=1;
                int ridx=que.remove();
                int r=ridx/m;
                int c=ridx%m;

                for(int k=0;k<dir.length;k++){

                    int row=dir[k][0]+r;
                    int col=dir[k][1]+c;

                    if(row>=0 && row<n && col>=0 && col<m && a[row][col]==1){
                        a[row][col]=2;

                        int idx=(row*m)+col;
                        que.add(idx);
                        oc--;
                    }
                }
            }
            if(flag==1)
                time++;
        }
        
        if(oc==0)
            return time-1;
        
        return -1;
    }
}