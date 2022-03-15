// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int countKdivPairs(int a[], int n, int k)
    {
        int rem[]=new int[k];
        
        for(int i=0;i<n;i++)
        {
            int r=a[i]%k;
            rem[r]++;
        }
        
        int l=1, r=k-1;
        int count=0;
        
        while(l<r)
        {
            count+=(rem[l]*rem[r]);
            l++;
            r--;
        }
        
        if(l==r)
        {
            count+=(rem[l]*(rem[l]-1))/2;
        }
        
        int zc=(rem[0]*(rem[0]-1))/2;
        
        count+=zc;
        
        return count;
    }
}