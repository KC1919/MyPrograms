// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mpath=0;
    public int longestIncreasingPath(int[][] a)
    {
        int n=a.length;
        int m=a[0].length;
        
        mpath=0;
        
        Integer dp[][]=new Integer[n][m];
        
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        
        boolean visited[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                maxpath(a,i,j,n,m,dp,dir,visited);
            }
        }
        return mpath;
    }
    
    private int maxpath(int a[][], int i, int j, int n, int m, Integer dp[][], int dir[][], boolean visited[][])
    {
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        visited[i][j]=true;
        
        int max=0;
        for(int k=0;k<dir.length;k++){
            
            int row=dir[k][0]+i;
            int col=dir[k][1]+j;
            
            if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==false && a[row][col]>a[i][j]){
                
                int res=maxpath(a,row,col,n,m,dp,dir,visited);
                max=Math.max(max,res);
            }
        }
        dp[i][j]=max+1;
        visited[i][j]=false;
        
        mpath=Math.max(mpath,dp[i][j]);
        
        return dp[i][j];
    }
}