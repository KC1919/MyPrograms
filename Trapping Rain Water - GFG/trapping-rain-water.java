// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
        
        int lmax=a[0];
        int rmax=a[a.length-1];
        long res=0;
        int r=a.length-1;
        int l=0;
        
        while(l<=r)                       //[0,1,0,2,1,0,1,3,2,1,2,1]
        {
            if(a[l]<=rmax)
            {
                if(a[l]<lmax) 
                    res+=lmax-a[l];
                
                else 
                    lmax=a[l];
    
                l++;
            }
            else
            {
                if(a[r]<rmax) 
                    res+=rmax-a[r];
                
                else 
                    rmax=a[r];
                
                r--;
            }
        }
        return res;
    } 
}


