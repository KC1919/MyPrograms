// { Driver Code Starts
// Initial Template for Java

import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.longestIncreasingPath(arr, n, m));
            t--;
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    /*You are required to complete this method*/
    int longestIncreasingPath(int a[][], int n, int m) {
        // int n=a.length;
        // int m=a[0].length;
        
        int dp[][]=new int[n][m];
        
        int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
        
        int max[]=new int[1];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(dp[i][j]==0){
                    incPath(a,i,j,n,m,dp,max,dir);
                }
            }
        }
        return max[0];
    }
    
    public int incPath(int a[][], int i, int j, int n, int m, int dp[][], int maxLen[], int dir[][]){
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int max=0;
        for(int k=0;k<dir.length;k++){
            
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && a[row][col]>a[i][j]){
                
                int res=incPath(a,row,col,n,m,dp,maxLen,dir);
                max=Math.max(res,max);
            }
        }
        
        max+=1;
        maxLen[0]=Math.max(maxLen[0],max);
        
        return dp[i][j]=max;
    }
}