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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String s)
    {
        int n=s.length();
        Integer dp[]=new Integer[n];
        
        countways(s,n,0,dp);
        return dp[0];
    }
    
    private static int countways(String s, int n, int idx, Integer dp[]){
        
        if(idx==n){
            return 1;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        
        int count=0;
        
        if(idx==n-1){
            char ch=s.charAt(idx);
            if(ch-48==0){
                return dp[idx]=0;
            }
            else{
                return dp[idx]=1;
            }
        }
        
        else if((n-idx)>=2){
            char c1=s.charAt(idx);
            
            if(c1-48==0){
                return dp[idx]=0;
            }
            
            else{
               count+=countways(s,n,idx+1,dp);
            }
            
            char c2=s.charAt(idx+1);
            
            int val=(c1-48)*10+(c2-48);
            
            if(val<=26){
                count+=countways(s,n,idx+2,dp);
            }
        }
        
        return dp[idx]=count%1000000007;
    }
}