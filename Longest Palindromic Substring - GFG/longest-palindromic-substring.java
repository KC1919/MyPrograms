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
            System.out.println(ob.longestPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String s){
        
        int n=s.length();
        
        boolean dp[][]=new boolean[n][n];
        
        int max=0;
        int si=-1, ei=-1;
        
        for(int gap=0;gap<n;gap++){
            
            for(int i=0,j=gap;j<n;i++,j++){
                
                char start=s.charAt(i);
                char end=s.charAt(j);
                
                if(gap==0){
                    dp[i][j]=true;
                    
                    if(1>max){
                        si=i;
                        ei=j;
                        max=1;
                    }
                }
                
                else if(gap==1){
                    
                    if(start==end){
                        dp[i][j]=true;
                        if(2>max){
                            si=i;
                            ei=j;
                            max=2;
                        }
                    }
                }
                
                else{
                    
                    if(start==end && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        
                        if(j-i+1>max){
                            max=j-i+1;
                            si=i;
                            ei=j;
                        }
                    }
                }
            }
        }
        
        return (si!=-1 && ei!=-1)?s.substring(si,ei+1):"";
    }
}