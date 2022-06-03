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
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] a)
    {
        int n=a.length;

        int dp[]=new int[n];
        dp[0]=1;

        for(int i=1;i<n;i++)
        {
            int max=0;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
        }

        int ds[]=new int[n];

        ds[n-1]=1;

        for(int i=n-2;i>=0;i--)
        {
            int max=0;
            for(int j=n-1;j>i;j--){
                if(a[j]<a[i]){
                    max=Math.max(max,ds[j]);
                }
            }
            ds[i]=max+1;
        }

        int maxlen=dp[0]+ds[0]-1;
        for(int i=1;i<n;i++){
            
            maxlen=Math.max(maxlen,dp[i]+ds[i]-1);
        }
        return maxlen;
    }
}