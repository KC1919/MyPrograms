class Solution {
    public void gameOfLife(int[][] a) {
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
        
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int calive=0;
                
                for(int k=0;k<dir.length;k++)
                {
                    int row=i+dir[k][0];
                    int col=j+dir[k][1];
                    
                    if(row>=0 && row<n && col>=0 && col<m)
                    {
                        if(a[i][j]==0)
                        {
                            if(a[row][col]>0)
                                calive++;
                        }
                        else if(a[i][j]==1)
                        {
                            if(a[row][col]>0)
                                calive++;
                        }
                    }
                }
                if(a[i][j]==0){
                    if(calive==3)
                        a[i][j]=-2;
                    else
                        a[i][j]=-1;
                }
                    
                else if(a[i][j]==1)
                {
                    if(calive==2 || calive==3)
                        a[i][j]=3;
                        
                    else if(calive<2 || calive>3)
                        a[i][j]=2;
                }   
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==-2 || a[i][j]==3)
                    a[i][j]=1;
                else
                    a[i][j]=0;
            }
        }
    }
}