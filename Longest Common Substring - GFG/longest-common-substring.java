// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String s, String t, int n, int m){
        
        int dp[][]=new int[n+1][m+1];
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                char ch1=s.charAt(i);
                char ch2=t.charAt(j);
                
                if(ch1==ch2){
                    dp[i+1][j+1]=1+dp[i][j];
                    max=Math.max(max,dp[i+1][j+1]);
                }
            }
        }
        return max;
    }
}