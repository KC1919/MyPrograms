// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int a[], int n, int k)
    {
        if(k<=a[0])
        return 0;
        
        if(k>a[n-1])
        return n;
        
        if(k==a[n-1])
        return n-1;
        
        int l=0, h=n-1;
        
        int mid=-1;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            if(k>a[mid])
            l=mid+1;
            
            else if(k<a[mid])
            h=mid-1;
            
            else
            return mid;
        }
        
        return l;
    }
}