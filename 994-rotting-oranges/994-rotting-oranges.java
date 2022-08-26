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
    public int orangesRotting(int[][] a) {
        Queue<Pair>que=new LinkedList<>();
        
        int cone=0;
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==2){
                    que.add(new Pair(i,j));
                }
                
                else if(a[i][j]==1){
                    cone++;
                }
            }
        }
        
        if(cone==0){
            return 0;
        }
        
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        int time=0;
        
        while(que.size()>0){
            
            time++;
            int size=que.size();
            
            while(size-->0){
                
                Pair rem=que.remove();
                
                for(int k=0;k<4;k++){
                    int row=dir[k][0]+rem.i;
                    int col=dir[k][1]+rem.j;
                    
                    if(row>=0 && col>=0 && row<n && col<m && a[row][col]==1){
                        a[row][col]=2;
                        que.add(new Pair(row,col));
                        cone--;
                    }
                }
            }
            
            if(cone==0){
                break;
            }
        }
        
        if(cone!=0){
            return -1;
        }
        
        return time;
    }
}