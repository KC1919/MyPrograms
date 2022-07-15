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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MinSquares(int n)
    {
        Integer dp[]=new Integer[n+1];
        
        return minsquare(n,n,dp)-1;
    }
    
    private int minsquare(int num, int target, Integer dp[]){
        
        if(target==0){
            return 1;
        }
        
        if(dp[target]!=null){
            return dp[target];
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i<=(int)Math.sqrt(target);i++){
            if(i*i<=target){
                int res=minsquare(num,target-(i*i),dp);
                min=Math.min(min,res);
            }
        }
        
        return dp[target]=min==Integer.MAX_VALUE?0:min+1;
    }
}