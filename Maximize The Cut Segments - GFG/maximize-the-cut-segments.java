// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
        int a[]=new int[0];
        
        if(x!=y && y!=z){
            a=new int[]{x,y,z};
        }
        
        else if(x!=y && y==z){
            a=new int[]{x,y};
        }
        
        else if(x==y && y!=z){
            a=new int[]{y,z};
        }
        
        else if(x==y && y==z){
            a=new int[]{x};
        }
        
        Integer dp[]=new Integer[n+1];
        
        int res=maxVal(a,n,dp);
        return res<0?0:res;
    }
    
    private int maxVal(int a[], int target, Integer dp[]){
        
        if(target==0){
            return 0;
        }
        
        if(dp[target]!=null){
            return dp[target];
        }
        
        int max=Integer.MIN_VALUE;
        
        // if(a[idx]<=target){
        //     int res=maxVal(a,idx,target-a[idx],dp);
            
        //     // if(res>0)
        //     // max=Math.max(res,max);
        // }
        
        
        for(int i=0;i<a.length;i++){
            if(a[i]<=target){
                int res=maxVal(a,target-a[i],dp);
                max=Math.max(res,max);
            }
        }
        
        return dp[target]=1+max;
    }
}
