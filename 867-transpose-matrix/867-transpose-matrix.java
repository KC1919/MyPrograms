class Solution {
    public int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }
}








// class Solution {
//     public int[][] transpose(int[][] a) {
        
//         int n=a.length;
//         int m=a[0].length;
        
//         for(int i=0;i<n;i++){
            
//             int col=i;
//             int row=0;
            
//             while(row<col){
//                 int temp=a[row][col];
//                 a[row][col]=a[col][row];
//                 a[col][row]=temp;
                
//                 row++;
//                 col--;
//             }
//         }
        
//         int sc=-1;
//         int sr=-1;
//         int diff=0;
        
//         if(n==m){
//             sr=1;
//             sc=m-1;
//         }
        
//         else{
//             sr=0;
//             sc=m-1;
//             diff=m-n;
//         }
        
//         for(int i=sr;i<n;i++){
            
//             int row=i;
//             int col=sc;
            
//             while(row<col){
//                 int temp=a[row][col];
//                 a[row][col]=a[col-diff][row+diff];
//                 a[col-diff][row+diff]=temp;
                
//                 row++;
//                 col--;
//             }
//         }
        
//         return a;
//     }
// }