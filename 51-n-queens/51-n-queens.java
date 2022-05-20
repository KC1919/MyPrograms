class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char a[][]=new char[n][n];
        
        int row=0;
        List<List<String>>res=new ArrayList<>();
        
        for(int col=0;col<n;col++){
            a[row][col]='Q';
            placeQueen(a,row+1,n,1,res);
            a[row][col]='\0';
        }
        return res;
    }
    
    public boolean placeQueen(char a[][], int row, int n, int count, List<List<String>>res){
        
        if(count==n){
            List<String>list=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(a[i][j]=='Q')
                        sb.append('Q');
                    else 
                        sb.append('.');
                }
                list.add(sb.toString());
            }
            res.add(list);
            return true;
        }
        
        for(int j=0;j<n;j++){
            if(isSafe(a,row,j,n)){
                
                a[row][j]='Q';
                boolean result=placeQueen(a,row+1,n,count+1,res);
                a[row][j]='\0';
            }
        }
        return false;
    }
    
    public boolean isSafe(char a[][], int row, int col, int n){
        
        if(row<0 || row==n || col<0 || col==n)
            return false;
        
        // check row
        for(int j=0;j<n;j++){
            if(a[row][j]=='Q')
                return false;
        }
        
        // check column
        for(int i=0;i<n;i++){
            if(a[i][col]=='Q')
                return false;
        }
        
        // check UL diagonal
        for(int i=row, j=col;i>=0 && j>=0;i--,j--){
            if(a[i][j]=='Q')
                return false;
        }
        
        // check UR diagonal
        for(int i=row, j=col; i>=0 && j<n; i--,j++){
            if(a[i][j]=='Q')
                return false;
        }
        
        // check DL diagonal
        for(int i=row, j=col; i<n && j>=0; i++,j--){
            if(a[i][j]=='Q')
                return false;
        }
        
        // check DR diagonal
        for(int i=row, j=col; i<n && j<n; i++,j++){
            if(a[i][j]=='Q')
                return false;
        }
        
        return true;
    }
}