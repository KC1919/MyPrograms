// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int a[], int n, int target) {
        
        Long dp[][]=new Long[n][target+1];   
        
        return solve(a,n,0,dp,target);
    }
    
    
    private long solve(int a[], int n, int idx, Long dp[][], int target){
        
        if(target==0 || idx==n){
            
            if(target==0)
                return 1;
            
            return 0;
        }
        
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        long count=0;
        if(a[idx]<=target){
            count+=solve(a,n,idx,dp,target-a[idx]);
        }
        
        for(int i=idx+1;i<n;i++){
            if(a[i]<=target){
                count+=solve(a,n,i,dp,target-a[i]);
            }
        }
        
        return dp[idx][target]=count;
    }
}