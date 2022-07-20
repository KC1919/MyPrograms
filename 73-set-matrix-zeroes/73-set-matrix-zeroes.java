class Solution {
    public void setZeroes(int[][] a) {
        
        int n=a.length;
        int m=a[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    a[i][j]=0;
                }
            }
        }
    }
}