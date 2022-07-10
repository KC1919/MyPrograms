// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s, String t)
    {
        Integer dp[][]=new Integer[x][y];
        
        return LCS(s,0,t,0,dp);
    }
    
    private static int LCS(String s, int i, String t, int j, Integer dp[][]){
        
        if(i==s.length() || j==t.length()){
            return 0;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+LCS(s,i+1,t,j+1,dp);
        }
        
        else{
            return dp[i][j]=Math.max(LCS(s,i+1,t,j,dp),LCS(s,i,t,j+1,dp));
        }
    }
}