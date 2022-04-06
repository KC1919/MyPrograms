// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
        long ans[]=new long[n];
        
        long prefix=1;
        
        for(int i=0;i<n;i++)
        {
            ans[i]=prefix;
            prefix*=a[i];
        }
        
        long postfix=1;
        
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=postfix;
            postfix*=a[i];
        }
        
        return ans;
	} 
} 
