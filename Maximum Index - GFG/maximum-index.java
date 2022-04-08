// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        int lmin[]=new int[n];
        int rmax[]=new int[n];
        
        
        lmin[0]=0;
        int min=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[min])
                min=i;
            
            lmin[i]=min;
        }
        
        rmax[n-1]=n-1;
        int max=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[max])
                max=i;
            
            rmax[i]=max;
        }
        
        int left=n-1, right=n-1;
        int mdiff=0;
        
        while(left>=0 && right>=0)
        {
            if(a[lmin[left]]<=a[rmax[right]])
            {
                mdiff=Math.max(mdiff,rmax[right]-lmin[left]);
                left--;
            }
            else if(a[lmin[left]]>a[rmax[right]])
            {
                right--;
            }
        }
        return mdiff;
    }
}


