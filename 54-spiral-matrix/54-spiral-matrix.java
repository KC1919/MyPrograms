class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer>list=new ArrayList<>();
        
        int n=a.length;
        int m=a[0].length;
        
        //handling the case of matrix with either single column or single row.
        if(n==1 || m==1)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    list.add(a[i][j]);
            }
            return list;
        }
        
        
        
        int sc=0, ec=m-1;
        int sr=0, er=n-1;
        
        //we do this repeatidely for every square boundary that makes up the spiral matrix
        while(sc<=ec && sr<=er)
        {
            travSpiral(a,sc,ec,sr,er,n,m,list);
            sc++;
            sr++;
            ec--;
            er--;
        }
        return list;
    }
    
    public void travSpiral(int a[][], int sc, int ec, int sr, int er, int n, int m, List<Integer>list)
    {
        //traversing the top row of the square
        for(int j=sc;j<=ec;j++)
        {
            if(a[sr][j]!=-101){
                list.add(a[sr][j]);
                a[sr][j]=-101;
            }
            
        }
        
        //traversing the last column of the square, from below the last cell of top row
        for(int i=sr+1;i<=er;i++)
        {
            if(a[i][ec]!=-101){
                list.add(a[i][ec]);
                a[i][ec]=-101;
            }
        }
        
        //traversing the last row of the square, from after the last cell of the right column
        // of the square
        for(int j=ec-1;j>=sc && sr!=er;j--)
        {
            if(a[er][j]!=-101){
                list.add(a[er][j]);
                a[er][j]=-101;
            }
        }
        
        //traversing the 1st column of the square starting from above the 1st cell of 
        // bottom row of the square
        for(int i=er-1;i>sr;i--)
        {
            if(a[i][sc]!=-101){
                list.add(a[i][sc]);
                a[i][sc]=-101;
            }
        }
    }
}