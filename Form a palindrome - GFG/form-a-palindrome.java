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
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.findMinInsertions(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int findMinInsertions(String s){
        
        StringBuilder sb=new StringBuilder(s);
        
        sb.reverse();
        Integer dp[][]=new Integer[s.length()][s.length()];
        int res=LCS(s,s.length()-1,sb.toString(),s.length()-1,dp);
        
        return s.length()-res;
    }
    
    private int LCS(String s, int i, String t, int j, Integer dp[][]){
        
        if(i<0 || j<0){
            return 0;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+LCS(s,i-1,t,j-1,dp);
        }
        
        else{
            return dp[i][j]=Math.max(LCS(s,i-1,t,j,dp),LCS(s,i,t,j-1,dp));
        } 
    }
}