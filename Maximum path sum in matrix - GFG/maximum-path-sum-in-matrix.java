// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int n, int grid[][])
    {
        int max=0;
        int dp[][]=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            solve(grid,0,i,dp);
            max=Math.max(dp[0][i],max);
        }
       
        return max;
    }
    
    public static int solve(int a[][], int i, int j, int dp[][])
    {
        if(i<0 || j<0 || i>=a.length || j>=a[0].length)
        return 0;
        
        if(i==a.length-1 && j<a[0].length)
        {
            return dp[i][j]=a[i][j];
        }
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int dres=solve(a,i+1,j,dp);
        int rres=solve(a,i+1,j-1,dp);
        int dires=solve(a,i+1,j+1,dp);
        int mres=Math.max(dires,Math.max(dres,rres))+a[i][j];
        dp[i][j]=mres;
        
        return mres;
    }
}