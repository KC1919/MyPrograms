// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int target) 
    {
        Arrays.sort(a);
        
        for(int i=0;i<n;i++)
        {
            int comp=target-a[i];
            
            if(comp>0)
            {
                boolean res=twoSum(a,i+1,n-1,comp);
                if(res==true)
                return true;
            }
        }
        return false;
    }
    
    public static boolean twoSum(int a[], int start, int end, int target)
    {

        while(start<end)
        {
            int sum=a[start]+a[end];
            
            if(sum>target)
                end--;
            
            else if(sum<target)
                start++;
            
            else
            {
                return true;
                // si++;
                // ei--;
                
                // while(si<ei && a[si]==a[si-1])si++;
                // while(ei>si && a[ei]==a[ei+1])ei--;
            }
        }
        
        return false;
    }
}
