// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int target, int weight[], int value[], int n) 
    {
        Integer dp[][]=new Integer[n][target+1];
        knapsack(target,n,0,weight,value,dp,0);
        
        return knapsack(target,n,0,weight,value,dp,0);
    }
    
    static private int knapsack(int target, int n, int idx, int weight[], int value[], Integer dp[][], int sum){
    {
        if(target==0 || idx==n){
            return 0;
        }
        
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        
        if(weight[idx]<=target){
            int tres=knapsack(target-weight[idx],n,idx+1,weight,value,dp,sum+value[idx]);
            int ntres=knapsack(target,n,idx+1,weight,value,dp,sum);
            
            return dp[idx][target]=Math.max(value[idx]+tres,ntres);
        }
        
        else{
            return dp[idx][target]=knapsack(target,n,idx+1,weight,value,dp,sum);
        }
    }
    }
    
}


