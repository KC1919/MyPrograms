class Solution {
    public int val=1;
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        
        int sr=0,er=n-1, sc=0, ec=n-1;
        val=1;
        
        while(sr<=er && sc<=ec)
        {
            travSpiral(a,sc,ec,sr,er);
            //moving inwards
            sc++;  //start column
            sr++;  //start row
            ec--;  //end column
            er--;  //end row
        }
        return a;
    }
    
    public void travSpiral(int a[][], int sc, int ec, int sr, int er)
    {
        //traversing the top row of the square
        for(int j=sc;j<=ec;j++)
        {
            if(a[sr][j]==0){
                a[sr][j]=val++;
            }
            
        }
        
        //traversing the last column of the square, from below the last cell of top row
        for(int i=sr+1;i<=er;i++)
        {
            if(a[i][ec]==0){
                a[i][ec]=val++;
            }
        }
        
        //traversing the last row of the square, from after the last cell of the right column
        // of the square
        for(int j=ec-1;j>=sc && sr!=er;j--)
        {
            if(a[er][j]==0){
                a[er][j]=val++;
            }
        }
        
        //traversing the 1st column of the square starting from above the 1st cell of 
        // bottom row of the square
        for(int i=er-1;i>sr;i--)
        {
            if(a[i][sc]==0){
                a[i][sc]=val++;
            }
        }
    }
}