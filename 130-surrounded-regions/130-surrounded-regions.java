class Solution {
    
    class Pair
    {
        int row;
        int col;
        
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    
    public void solve(char[][] a) {
        
        Queue<Pair>que=new LinkedList<>();
        
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O'){
                    if(i==0 || j==0 || i==n-1 || j==m-1){
                        a[i][j]='Y';
                        que.add(new Pair(i,j));
                    }
                }
            }
        }
        
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(que.size()>0){
            Pair rem=que.remove();
            
            for(int k=0;k<dir.length;k++){
                int row=dir[k][0]+rem.row;
                int col=dir[k][1]+rem.col;
                
                if(row>=0 && row<n && col>=0 && col<m && a[row][col]=='O'){
                    que.add(new Pair(row,col));
                    a[row][col]='Y';
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='Y')
                    a[i][j]='O';
            
                else if(a[i][j]=='O')
                    a[i][j]='X';
            }
        }
    }
}