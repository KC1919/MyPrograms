// { Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        Integer dp[]=new Integer[n+1];
        
        return climb(n,0,dp);
    }
    
    private int climb(int n, int idx, Integer dp[]){
        
        if(idx>n){
            return 0;
        }
        
        if(idx==n){
            return 1;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        
        int j1res=climb(n,idx+1,dp);
        int j2res=climb(n,idx+2,dp);
        
        return dp[idx]=(j1res+j2res)%1000000007;
    }
}

