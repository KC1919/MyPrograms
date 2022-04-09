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
            
            if(k>a[mid]) //if the mid element is smaller than the target
            l=mid+1;     //we shift our lower index to mid+1, to search in the right half
            
            else if(k<a[mid]) //if the mid element is greater than the target,
            h=mid-1;          //we shift the higher index to mid-1, so search in the left half
            
            else    //if we get the exact target we return the target index.
            return mid;
        }
        return l; //else the left pointer after the search would always point to the index,
                  //where the target element should be inserted.
    }
}