class NumMatrix {

    private int prefix[][];
    private int a[][];
    private int n;
    private  int m;
    
    public NumMatrix(int[][] matrix) {
        this.a=matrix;
        
        this.n=a.length;
        this.m=a[0].length;
        
        this.prefix=new int[n][m];
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=a[i][j];
                prefix[i][j]=sum;
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            if(c1==0)
                sum+=prefix[i][c2];
            
            else
                sum+=prefix[i][c2]-prefix[i][c1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */