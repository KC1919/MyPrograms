class Solution {
    
    int count=0;
    public int totalNQueens(int n) {
        
        int a[][]=new int[n][n];
        
        placeQueen(a,0,n,0);
        return count;
    }
    
    private void placeQueen(int a[][], int row, int n, int placed){
        
        if(row==n || placed==n){
            if(placed==n){
                count++;
            }
                
            return;
        }
        
        for(int col=0;col<n;col++){
            
            if(isSafe(a,row,col,n,n)==true){
                a[row][col]=1;
                placeQueen(a,row+1,n,placed+1);
                a[row][col]=0;
            }
        }
    }
    
    private boolean isSafe(int a[][], int row, int col, int n, int m){
        
        if(row<0 || row==n || col<0 || col==m || a[row][col]==1){
            return false;
        }
        
        //checking column
        for(int i=0;i<n;i++){
            if(a[i][col]==1)
                return false;
        }
        
        //checking row
        for(int j=0;j<m;j++){
            if(a[row][j]==1)
                return false;
        }
        
        //checking left upper diag
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(a[i][j]==1)
                return false;
        }
        
        //checking upper right diag
        for(int i=row,j=col;i>=0 && j<m;i--,j++){
            if(a[i][j]==1)
                return false;
        }
        
        //checking lower left diag
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(a[i][j]==1)
                return false;
        }
        
        //checking lower right diag
        for(int i=row, j=col; i<n && j<m;i++,j++){
            if(a[i][j]==1)
                return false;
        }
        
        return true;
    }
}