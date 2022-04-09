// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        int sum=0;
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        int minSum=minSubSum(a,n);
        int maxSum=maxSubSum(a,n);
        
        if(minSum==sum)
        return maxSum;
        
        return Math.max(maxSum,sum-minSum);
        
    }
    
    static int maxSubSum(int a[], int n)
    {
        int sum=0, max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            sum=Math.max(sum + a[i], a[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
    
    
    static int minSubSum(int a[], int n)
    {
        int sum=a[0], min=a[0];
        
        for(int i=1;i<n;i++)
        {
            sum=Math.min(sum + a[i], a[i]);
            min = Math.min(min, sum);
        }
        return min;
    }
}

