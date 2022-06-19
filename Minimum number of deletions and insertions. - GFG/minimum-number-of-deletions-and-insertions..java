// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String s, String t) 
	{ 
	    int n=s.length();
	    int m=t.length();
	    
	    Integer dp[][]=new Integer[n][m];
	    
	    int ans=LCS(s,n-1,t,m-1,dp);
	    
	    int res=(s.length()-ans)+(t.length()-ans);
	    return res;
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