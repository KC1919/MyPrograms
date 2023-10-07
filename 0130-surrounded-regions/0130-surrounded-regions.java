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
                
                //adding all the border cells into the queue
                if(a[i][j]=='O'){
                    if(i==0 || j==0 || i==n-1 || j==m-1){
                        
                        //marking the border cell with 'Y' to remeber they are not to be
                        //captured
                        a[i][j]='Y';
                        que.add(new Pair(i,j));
                    }
                }
            }
        }
        
        //direction matrix
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(que.size()>0){
            
            //we take out a pair
            Pair rem=que.remove();
            
            //we move in all 4 duirection from the removed cell
            for(int k=0;k<dir.length;k++){
                int row=dir[k][0]+rem.row;
                int col=dir[k][1]+rem.col;
                
                if(row>=0 && row<n && col>=0 && col<m && a[row][col]=='O'){
                    
                    //we add the new pair cell to the queue, means this cell is in 
                    //connection with the border cell
                    que.add(new Pair(row,col));
                    
                    //hence we mark this cell also with 'Y', meaning not to be captured
                    a[row][col]='Y';
                }
            }
        }
        
        //in the end only those cells would be left which are not int connection with the
        //border cells
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                //safe cells
                if(a[i][j]=='Y')
                    a[i][j]='O';
            
                //which are not marked, they have to be captured, as they are not connected
                //to the border cells
                else if(a[i][j]=='O')
                    a[i][j]='X';
            }
        }
    }
}