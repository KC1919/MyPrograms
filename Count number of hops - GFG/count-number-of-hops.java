// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        Long dp[]=new Long[n+1];
        
        ways(n,dp);
        
        return dp[n];
    }
    
    static long ways(int n, Long dp[])
    {
        if(n<0)
        return 0;
        
        if(n==0){
            return dp[0]=(long)1;
        }
        
        if(dp[n]!=null)
        return dp[n];
        
        long step1=ways(n-1,dp);
        long step2=ways(n-2,dp);
        long step3=ways(n-3,dp);
        
        long tways=step1+step2+step3;
        
        tways%=1000000007;
        
        dp[n]=tways;
        
        return dp[n];
    }
    
}

