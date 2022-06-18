// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.noOfWays(M,N,X));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static long noOfWays(int m , int n , int target) {
        
        Long dp[][]=new Long[n][target+1];
        return countways(m,n,0,target,dp);
    }
    
    private static long countways(int m, int n, int idx, int target, Long dp[][]){
        
        if(idx==n){
            
            if(target==0){
                return 1;
            }
            return 0;
        }
        
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        long count=0;
        
        if(idx<n){
            
            for(int i=1;i<=m;i++){
                
                if(i<=target){
                    long res=countways(m,n,idx+1,target-i,dp);
                    if(res>0){
                        count+=res;
                    }
                }
            }
        }
        return dp[idx][target]=count;
    }
}