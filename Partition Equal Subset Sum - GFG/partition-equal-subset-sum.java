// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int n, int a[])
    {
        int sum=0;
        
        for(int ele:a){
            sum+=ele;
        }
        
        if(sum%2!=0){
            return -1;
        }
        
        int target=sum/2;
        
        boolean dp[][]=new boolean[n][target+1];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=target;j++){
                
                    if(a[i]==j){
                        dp[i][j]=true;    
                    }
                    
                    else if(a[i]>j){
                        
                        if(i>0)
                        dp[i][j]=dp[i-1][j];
                    }
                    
                    else if(a[i]<j){
                        
                        if(i>0 && dp[i-1][j]==true){
                            dp[i][j]=true;
                        }
                        else if(i>0 && dp[i-1][j-a[i]]==true){
                            dp[i][j]=true;
                        }
                    }
                
                if(j==target && dp[i][j]==true){
                    return 1;
                }
                
            }
        }
        
        return 0;
    }
}